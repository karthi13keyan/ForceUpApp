package module;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.apache.tomcat.jni.File;
import org.springframework.core.io.ClassPathResource;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.gson.Gson;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.Singleton;

import io.hypertrack.factory.UserFactory;
import io.hypertrack.net.HyperTrackClient;
//import model.ForceupUser;
import model.ForceupUser;

public class ProviderModule extends AbstractModule {

    @Override
    protected void configure() {
    }

    @Provides
    @Inject
    @Singleton
    public Firestore getConnection() throws IOException,
    InterruptedException, ExecutionException {
//        FileInputStream serviceAccount = new FileInputStream("dbInfo"
      //          + ".json");
        java.io.File file = new ClassPathResource("dbInfo.json").getFile();
        FileInputStream serviceAccount = new FileInputStream(file);
        GoogleCredentials credentials = GoogleCredentials.
                fromStream(serviceAccount);
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(credentials)
                .build();
        try {
        	FirebaseApp.initializeApp(options);
        } catch(Exception e) {
        	System.out.println("App already initialized");
        }
        Firestore db = FirestoreClient.getFirestore();
        return db;

    }

    @Provides
    @Singleton
    @Inject
    public HyperTrackClient provideHyperTrackClient() {
        return new HyperTrackClient("sk_test_"
                + "f54037366bdecc5aa7896788bbdc36191715e82e");
    }

    @Provides
    @Singleton
    @Inject
    public UserFactory provideUserFactory(final HyperTrackClient 
            hyperTrackClient) {
        return new UserFactory(hyperTrackClient);
    }

    @Provides
    @Singleton
    @Inject
    public Gson provideGson() {
        return new Gson();
    }

    @Provides
    @Inject
    public ForceupUser provideForceupUser(final Gson gson) {
        return new ForceupUser(gson);
    }

}
