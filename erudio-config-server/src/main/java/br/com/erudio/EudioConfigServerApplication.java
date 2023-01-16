package br.com.erudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class EudioConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EudioConfigServerApplication.class, args);
		System.out.println("Servidor erudio rodando port: 8888");
	}

}
