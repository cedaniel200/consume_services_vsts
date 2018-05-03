package cedaniel200.vsts.test;

import cedaniel200.vsts.console.AccountCommands;
import cedaniel200.vsts.console.BugCommands;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.io.PrintWriter;
import java.io.StringWriter;

public class BaseTest {

    AccountCommands accountCommands;

    @Rule
    public final TestRule watchman = new TestWatcher(){

        @Override
        protected void failed(Throwable e, Description description) {
            registerAccount();
            createBug(e.getMessage(), description, getStackTraceInString(e));
        }

        private void registerAccount() {
            if(accountCommands == null){
                accountCommands = new AccountCommands();
                print(accountCommands.registerDefault());
            }
        }

        private void createBug(String message, Description description, String stackTrace) {
            BugCommands bugCommands = new BugCommands();
            bugCommands.createBug("ID_PROJECT",
                    "ERROR  " + description.getDisplayName() + (message != null ? " -- " + message : ""),
                    stackTrace,
                    1,
                    "2 - High",
                    "URL FATHER EXAMPLE https://YOU_ACCOUNT.visualstudio.com/_apis/wit/workitems/1"
                    );
        }

        private String getStackTraceInString(Throwable e) {
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            return errors.toString();
        }

    };

    public void print(String text){
        System.out.println("MSG : " + text);
    }

}
