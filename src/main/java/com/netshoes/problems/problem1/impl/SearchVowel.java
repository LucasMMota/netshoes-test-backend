package com.netshoes.problems.problem1.impl;

import com.netshoes.problems.problem1.api.Stream;

// NAO RENOMEAR ESSA CLASSE!
public class SearchVowel {

    // Implementei nos testes a lógica da resolução que imaginei. O teste não rodou devido a erros técnicos da linguagem.
    // procurei mostrar como eu pensei em resolver

    // NAO ALTERAR ESSA ASSINATURA!
    public static char firstChar(Stream input) {
        // TODO sua implementacao! Nesse ponto deve ser feita a adaptacoes necessarias para que os testes executem com sucesso
        
    	while(input.hasNext()){
			char nextChar = input.getNext();
			int posLida = input.qtdLido;;
			
			if (this.isVowel(nextChar) && this.temConsoanteEVogalAntes(input, posLida) && this.naoEhRepetido(nextChar, input)){
				return nextChar;
			}
    		
    	}

        return '0'; 
    }

    // verifica a segunda parte da regra
    public boolean temConsoanteEVogalAntes(Stream input, int charPos){
    	return isConsonant(input.stream.charAt(charPos-1)) && isVowel(input.stream.charAt(charPos-2));
    }

    public boolean naoEhRepetido(char nextChar, Stream input){
    	for(int i=input.qtdLido+1; i<input.stream.length(); i++){
    		if(input.stream.charAt(i)==nextChar){
    			return false;
    		}
		}

		return true;
    }

	public static boolean isVowel(char c){
    String vowels = "aeiouAEIOU";
    return vowels.contains(c);
	}

	public static boolean isConsonant(char c){
	    String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
	    return cons.contains(c);
	}

}
