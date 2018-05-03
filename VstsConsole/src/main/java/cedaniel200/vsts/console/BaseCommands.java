package cedaniel200.vsts.console;

import cedaniel200.vsts.Util.RegisteredAccount;
import cedaniel200.vsts.di.InjectorFactory;
import com.google.inject.Injector;
import org.springframework.shell.Availability;

public class BaseCommands {

    private Injector injector;

    public BaseCommands() {
        injector = InjectorFactory.get();
    }

    public <T> T getRepository(Class<T> classRepository){
        return injector.getInstance(classRepository);
    }

    public Availability availabilityCheck() {
        return RegisteredAccount.registered
                ? Availability.available()
                : Availability.unavailable("you are not registered");
    }

}
