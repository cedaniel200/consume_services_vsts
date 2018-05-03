package cedaniel200.vsts.service;

import cedaniel200.vsts.model.Attachment;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AttachmentService {

    @Multipart
    @Headers("Content-Type: application/octet-stream")
    @POST("DefaultCollection/_apis/wit/attachments?api-version=2.2")
    Call<Attachment> create(@Query("filename") String fileName, @Part MultipartBody.Part file);
}
