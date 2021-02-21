package it.cipollaro.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author a.cipollaro
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling //Permette l'update periodico del DiscoveryClient a partire dal catalogo Kubernetes
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}