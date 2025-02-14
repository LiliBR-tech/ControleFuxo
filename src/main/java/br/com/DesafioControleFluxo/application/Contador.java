package br.com.DesafioControleFluxo.application;

import br.com.DesafioControleFluxo.exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        // Simulando a entrada de dados (parâmetros)
        int parametroUm = 5;  // Exemplo de valor para o primeiro parâmetro
        int parametroDois = 10;  // Exemplo de valor para o segundo parâmetro
        
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());  // Imprime a mensagem de erro
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}