package cedaniel200.vsts.console;

import cedaniel200.vsts.model.Project;
import cedaniel200.vsts.repository.ProjectRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;

import java.util.List;

@ShellComponent
public class ProjectCommands extends BaseCommands {

    @ShellMethod(group = "Project", value = "List all project")
    @ShellMethodAvailability("availabilityCheck")
    public String listProjects(){
        return listOfProjectsToString(getRepository(ProjectRepository.class).list());
    }

    private String listOfProjectsToString(List<Project> projects){
        String output = "---- List Project ----"+ "\n";
        output += "ID \t NAME\n";
        output += "----------------------\n";
        for(Project project : projects){
            output += project.getId() + "\t" + project.getName() + "\n";
        }
        output += "----------------------";
        return output;
    }
}
