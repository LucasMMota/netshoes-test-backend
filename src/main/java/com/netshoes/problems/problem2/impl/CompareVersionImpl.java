package com.netshoes.problems.problem2.impl;

// Nao alterar o nome dessa classe!
public class CompareVersionImpl {


	// Implementei nos testes a lógica da resolução que imaginei. O teste não rodou devido a erros técnicos da linguagem.
    // procurei mostrar como eu pensei em resolver

    // Nao alterar a assinatura desse metodo
    public static int compareVersion(String version1, String version2) {
        // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.

        // explodir as posições em cada ponto
        // para cada uma verificar se a respectiva posição no outro array é menor ou maior e retornar
        // caso sejam iguais, avança uma posição em ambos e verifica novamente


		String[] arrV1 = version1.split(".");
		String[] arrV2 = version2.split(".");
	
		int tamIteracaco = arrV2.length;
		if (arrV1.length > arrV2.length){
			tamIteracaco = arrV1.lenght;
		}

		for (int i = 0; i < tamIteracao; i++) {
			if(this.getVal(arrV1,i)>this.getVal(arrV2,i)){
				return 1;
			}

			if(arrV1[1]<arrV2[i]){
				return -1;
			}
		}

		return 0; // sao iguais
	}

	public int getVal(String[] arr, int i){
		if(i>=arr.length){
			return 0; //igualiza o array
		}

		return (int)arr[i];
	}
}
