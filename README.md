# consume_services_vsts
Consume vsts services to list projects, create attachments and create bugs with reverse hierarchy (user stories as the parent of the bug) and attachment. 

## Technologies: 
* Spring Boot
* Spring Shell
* Retrofit 2
* Guice 
* Okhttp

## Warnings
* In the AccountCommands.java class located in src/main/java/cedaniel200/vsts/console/AccountCommands.java you must replace the texts YOUR_ACCOUNT and YOUR_TOKEN.
* For the test to work correctly, you must replace the text ID_PROJECT and URL FATHER EXAMPLE in the BaseTest.java class. This class is in src/test/java/cedaniel200/vsts/test/BaseTest.java


### If you have any questions you can write me at cdanielmg200@gmail.com
