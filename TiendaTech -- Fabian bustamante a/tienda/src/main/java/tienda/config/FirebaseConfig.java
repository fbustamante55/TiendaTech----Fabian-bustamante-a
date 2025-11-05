package tienda.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirebaseConfig {

    @Value("${firebase.json.path}")
    private String firebaseJsonPath;

    @Value("${firebase.json.file}")
    private String firebaseJsonFile;

    @Bean
    public Storage storage() throws IOException {
        // Inicializar Firebase si no está ya inicializado
        if (FirebaseApp.getApps().isEmpty()) {
            String firebaseConfigPath = firebaseJsonPath + "/" + firebaseJsonFile;
            FileInputStream serviceAccount = new FileInputStream(firebaseConfigPath);
            
            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();
            
            FirebaseApp.initializeApp(options);
        }

        // Crear y retornar el cliente de Storage
        return StorageOptions.getDefaultInstance().getService();
    }
}
