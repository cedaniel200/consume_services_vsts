package cedaniel200.vsts.service;

import cedaniel200.vsts.model.ResponseProject;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ProjectService {

    @GET("DefaultCollection/_apis/projects")
    Call<ResponseProject> listProject();
}
