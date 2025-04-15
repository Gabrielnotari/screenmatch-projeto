package br.com.alura.projetoalura.service;

public interface IConverteDados {
   <T>T obterDados(String json, Class<T> classe);
}
