package cedaniel200.vsts.repository;

import cedaniel200.vsts.model.Bug;
import cedaniel200.vsts.model.Data;
import cedaniel200.vsts.service.BugService;
import retrofit2.Call;
import retrofit2.Retrofit;

import javax.inject.Inject;
import java.io.IOException;
import java.util.List;

public class BugRepository {

    private BugService service;

    @Inject
    public BugRepository(Retrofit retrofit) {
        service = retrofit.create(BugService.class);
    }

    public Bug create(String idProject, List<Data> data){
        Bug bug;
        try {
            bug = tryCreate(idProject, data);
        } catch (IOException e) {
            e.printStackTrace();
            bug = new Bug();
        }
        return bug;
    }

    private Bug tryCreate(String idProject, List<Data> data) throws IOException{
        Call<Bug> bugCall = service.create(idProject, data);
        return bugCall.execute().body();
    }
}
