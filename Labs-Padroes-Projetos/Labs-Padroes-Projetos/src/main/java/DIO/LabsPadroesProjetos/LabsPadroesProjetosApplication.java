package DIO.LabsPadroesProjetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Autor do projeto @xGiancarlo
@EnableFeignClients
@SpringBootApplication
public class LabsPadroesProjetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabsPadroesProjetosApplication.class, args);
	}

}
