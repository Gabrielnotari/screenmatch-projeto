package br.com.alura.projetoalura;

import br.com.alura.projetoalura.principal.Principal;
import br.com.alura.projetoalura.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoaluraApplication {


	public static void main(String[] args) {
		SpringApplication.run(ProjetoaluraApplication.class, args);
	}

}
