package cedaniel200.vsts.di;

import cedaniel200.vsts.Util.BasicAuthInterceptor;
import cedaniel200.vsts.Util.RegisteredAccount;
import cedaniel200.vsts.repository.AttachmentRepository;
import cedaniel200.vsts.repository.BugRepository;
import cedaniel200.vsts.repository.ProjectRepository;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ModuleDependencyInjection extends AbstractModule {

    @Override
    protected void configure() {

    }

    @Provides
    BasicAuthInterceptor providesBasicAuthInterceptor(){
        return new BasicAuthInterceptor("", RegisteredAccount.token);
    }

    @Provides
    OkHttpClient providesOkHttpClient(BasicAuthInterceptor basicAuthInterceptor) {

        return new OkHttpClient.Builder()
                .addInterceptor(basicAuthInterceptor)
                .build();
    }

    @Provides
    Retrofit providesRetrofit(OkHttpClient client){
        return new Retrofit.Builder()
                .baseUrl(String.format("https://%s.visualstudio.com/", RegisteredAccount.account))
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    ProjectRepository providesProjectRepository(Retrofit retrofit){
        return new ProjectRepository(retrofit);
    }

    @Provides
    BugRepository providesBugRepository(Retrofit retrofit){
        return new BugRepository(retrofit);
    }

    @Provides
    AttachmentRepository providesAttachmentRepository(Retrofit retrofit){
        return new AttachmentRepository(retrofit);
    }


}
