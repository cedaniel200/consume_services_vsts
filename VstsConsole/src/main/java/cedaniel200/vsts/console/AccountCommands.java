package cedaniel200.vsts.console;

import cedaniel200.vsts.Util.RegisteredAccount;
import cedaniel200.vsts.Util.Util;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class AccountCommands extends BaseCommands {

    private static final String ACCOUNT = "YOUR_ACCOUNT";
    private static final String TOKEN = "YOUR_TOKEN";


    @ShellMethod(group = "Account", value = "register a account by default")
    public String registerDefault(){
        return register(ACCOUNT, TOKEN);
    }

    @ShellMethod(group = "Account", value = "register an account to work on it")
    public String register(String account, String token){
        try {
            tryRegister(account, token);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        return RegisteredAccount.registered ? "Successful registration" : "registration fails";
    }

    private void tryRegister(String account, String token) throws IllegalArgumentException {
        RegisteredAccount.registered = false;
        validateRegistry(account, token);
        registerAccount(account, token);
    }

    private void validateRegistry(String account, String token) throws IllegalArgumentException{
        if(Util.isNullOrEmpty(account) || Util.isNullOrEmpty(token)){
            throw new IllegalArgumentException("all or some argument is null or empty");
        }
    }

    private void registerAccount(String account, String token) {
        RegisteredAccount.account = account;
        RegisteredAccount.token = token;
        RegisteredAccount.registered = true;
    }
}
