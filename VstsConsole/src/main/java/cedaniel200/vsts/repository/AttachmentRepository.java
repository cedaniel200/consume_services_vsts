package cedaniel200.vsts.repository;

import cedaniel200.vsts.model.Attachment;
import cedaniel200.vsts.service.AttachmentService;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;

public class AttachmentRepository {

    private AttachmentService service;

    @Inject
    public AttachmentRepository(Retrofit retrofit) {
        service = retrofit.create(AttachmentService.class);
    }

    public Attachment create(File file){
        Attachment attachment;
        try {
            attachment = tryCreate(file);
        } catch (IOException e) {
            e.printStackTrace();
            attachment = new Attachment();
        }
        return attachment;
    }

    private Attachment tryCreate(File file) throws IOException {

        RequestBody requestFile = RequestBody.create(MediaType.parse("application/octect-stream"), file);
        MultipartBody.Part body = MultipartBody.Part.create(requestFile);
        Call<Attachment> attachmentCall = service.create(file.getName(), body);

        return attachmentCall.execute().body();
    }

}