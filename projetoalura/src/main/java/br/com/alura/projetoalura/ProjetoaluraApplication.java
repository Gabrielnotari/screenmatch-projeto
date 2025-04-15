package br.com.alura.projetoalura;

import br.com.alura.projetoalura.model.DadosSerie;
import br.com.alura.projetoalura.service.ConsumoApi;
import br.com.alura.projetoalura.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoaluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoaluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=eaf47626");
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
