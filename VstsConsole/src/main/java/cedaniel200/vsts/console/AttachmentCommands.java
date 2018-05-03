package cedaniel200.vsts.console;

import cedaniel200.vsts.model.Attachment;
import cedaniel200.vsts.repository.AttachmentRepository;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;

import java.io.File;

@ShellComponent
public class AttachmentCommands extends BaseCommands {

    @ShellMethodAvailability("availabilityCheck")
    @ShellMethod(group = "Attachment", value = "Create Attachment")
    public String createAttachment(String path){
        File file = new File(path);
        if(!file.exists()){
            return "The file " + file.getName() + " not exists";
        }

        Attachment attachment = getRepository(AttachmentRepository.class).create(file);

        return String.format("ID: %s\nURL: %s", attachment.getId(), attachment.getUrl());
    }
}