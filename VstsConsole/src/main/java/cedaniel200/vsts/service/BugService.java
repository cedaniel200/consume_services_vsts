package cedaniel200.vsts.service;

import cedaniel200.vsts.model.Bug;
import cedaniel200.vsts.model.Data;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface BugService {

    @Headers("Content-Type: application/json-patch+json")
    @PATCH("{projectId}/_apis/wit/workitems/$Bug?api-version=2.2")
    Call<Bug> create(@Path("projectId") String projectId, @Body List<Data> data);

}
