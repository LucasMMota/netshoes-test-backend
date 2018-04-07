package com.netshoes.problems.problem1.impl;


import com.netshoes.problems.problem1.api.Stream;

// NAO RENOMEAR ESSA CLASSE!
public class StreamImpl implements Stream {

    public String stream;
    public int qtdLido;

    // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.

    // Nao alterar esse construtor!
    public StreamImpl(String stream) {
        // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.
        this.stream = stream;
        this.qtdLido = 0;
    }

    @Override
    public char getNext() {
        // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.
        
        char c = stream.charAt(this.qtdLido);
        this.qtdLido +=1;

        return c;
    }

    @Override
    public boolean hasNext() {
        // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.
        
        // se a qtd lida é menor igual o tam da string ainda tem leitura
        return this.qtdLido < stream.length();
    }
}
