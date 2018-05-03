package cedaniel200.vsts.console;

import cedaniel200.vsts.model.Fields;
import cedaniel200.vsts.Util.LinkTypes;
import cedaniel200.vsts.model.*;
import cedaniel200.vsts.repository.BugRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;

import java.util.ArrayList;

@ShellComponent
public class BugCommands extends BaseCommands {

    @ShellMethodAvailability("availabilityCheck")
    @ShellMethod(group = "Bug", value = "Create Bug with attachment")
    public String createBugWithAttachment(String projectId,
                                          String title,
                                          String description,
                                          int Priority,
                                          String severity,
                                          String urlFather,
                                          String urlAttachment){

        ArrayList<Data> data = createListOfData(title, description, Priority, severity, urlFather);
        data.add(new Data(Data.OP_ADD, Fields.RELATIONS, new Value(LinkTypes.ATTACHED_FILE, urlAttachment)));

        Bug bug = getRepository(BugRepository.class).create(projectId, data);

        return bug.getId() != 0 ? "successfully created bug \n" +bug.toString() : "failed the creation of the bug";
    }

    @ShellMethodAvailability("availabilityCheck")
    @ShellMethod(group = "Bug", value = "Create Bug")
    public String createBug(String projectId,
                            String title,
                            String description,
                            int Priority,
                            String severity,
                            String urlFather){

        ArrayList<Data> data = createListOfData(title, description, Priority, severity, urlFather);
        Bug bug = getRepository(BugRepository.class).create(projectId, data);

        return bug.getId() != 0 ? "successfully created bug \n" +bug.toString() : "failed the creation of the bug";
    }

    private ArrayList<Data> createListOfData(String title, String description, int Priority, String severity, String urlFather) {
        ArrayList<Data> data = new ArrayList<>();
        data.add(new Data(Data.OP_ADD, Fields.TITLE, title));
        data.add(new Data(Data.OP_ADD, Fields.REPRO_STEPS, description));
        data.add(new Data(Data.OP_ADD, Fields.PRIORITY, String.valueOf(Priority)));
        data.add(new Data(Data.OP_ADD, Fields.SEVERITY, severity));
        data.add(new Data(Data.OP_ADD, Fields.RELATIONS, new Value(LinkTypes.HIERARCHY_REVERSE, urlFather)));
        return data;
    }

}
