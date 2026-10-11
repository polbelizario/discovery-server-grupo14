package pe.edu.cibertec.discoveryservergrupo14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerGrupo14Application {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerGrupo14Application.class, args);
    }

}