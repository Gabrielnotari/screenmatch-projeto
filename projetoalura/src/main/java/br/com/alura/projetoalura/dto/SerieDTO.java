package br.com.alura.projetoalura.dto;

import br.com.alura.projetoalura.model.Categoria;

public record SerieDTO( Long id,
                        String titulo,
                        Integer totalTemporadas,
                        Double avaliacao,
                        Categoria genero,
                        String atores,
                        String poster,
                        String sinopse) {

}
