package br.com.service;

public interface IConverteDados {

    <T> T obterDados(String jason, Class<T> classe);

}
