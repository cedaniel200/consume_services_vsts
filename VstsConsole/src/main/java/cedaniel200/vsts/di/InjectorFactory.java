package cedaniel200.vsts.di;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class InjectorFactory {

    private static final Injector injector = Guice.createInjector(new ModuleDependencyInjection());

    public static Injector get(){
        return injector;
    }
}
