package cedaniel200.vsts.repository;

import cedaniel200.vsts.model.Project;
import cedaniel200.vsts.model.ResponseProject;
import cedaniel200.vsts.service.ProjectService;
import retrofit2.Call;
import retrofit2.Retrofit;

import javax.inject.Inject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProjectRepository {

    ProjectService service;

    @Inject
    public ProjectRepository(Retrofit retrofit) {
        service = retrofit.create(ProjectService.class);
    }

    public List<Project> list(){
        List<Project> projects;
        try {
            projects = tryGetList();
        } catch (IOException e) {
            e.printStackTrace();
            projects = new ArrayList<>();
        }
        return projects;
    }

    private List<Project> tryGetList() throws IOException {
        Call<ResponseProject> projectCall = service.listProject();
        ResponseProject responseProject = projectCall.execute().body();
        return responseProject.getValue();
    }
}
