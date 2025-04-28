package br.com.alura.projetoalura.repository;

import br.com.alura.projetoalura.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

//Salvar e recuperar no banco
public interface SerieRepository extends JpaRepository<Serie, Long> {
}
