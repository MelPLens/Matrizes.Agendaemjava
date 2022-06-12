package lista0905;


import java.util.Scanner;

public class bitmapagenda {

	public static void main(String[] args) {
    @SuppressWarnings("unused")
	Scanner ler = new Scanner (System.in);
    int i,j = 0,matriz[][]= new int [10][5]; //declaro a variavel i,j e m para o tamanho da minha matriz de 16 por 16. no qual ' i' seria as linhas 'j' seria as colunas 'm' seria matriz junto com colchetes.
    
    		
		
	
    
    for( i = 0;i <10 ; i++) { // declaro dois 'for' laco de repeticao  para percorrer toda matriz para fazer a execucao para imprimir a mensagem ao usuario.
		System.out.printf("---- CADASTRO PESSOAL ---- \n"); 
		System.out.printf("Informe os elementos %d linha ", (i+1));
		System.out.printf("Digite seu nome\n"); // i +1 pois vai adicionando as informações dada pelo usuario para estruturar toda a matriz. 
		System.out.printf("Digite seu telefone\n");
		System.out.printf("Digite seu endereço\n");
		System.out.printf("Digite seu bairro\n");
		System.out.printf("Digite seu codigo postal\n");
		
		
		    for( j = 0; j<5 ; j ++) {
			System.out.printf("---- CADASTRO PESSOAL ---- \n"); 
			System.out.printf("Digite seu nome\n"); // i +1 pois vai adicionando as informações dada pelo usuario para estruturar toda a matriz. 
			System.out.printf("Digite seu telefone\n");
			System.out.printf("Digite seu endereço\n");
			System.out.printf("Digite seu bairro\n");
			System.out.printf("Digite seu codigo postal\n");
			
			System.out.printf("m[%d][%d] = " , i, j); // declara em qual local da matriz esta sendo inserido a informação do usuário.
			
		}
		System.out.printf("\n");
	 }
	System.out.printf("\n");
	
	for( i = 0;i < 10 ; i++) { 
    System.out.printf("%d - linha ", (i+1));
	    for( j = 0; j<5 ; j ++) {
        System.out.printf("%d " ,matriz[i][j]);
			
			}
			System.out.printf("\n"); // imprimir a matriz com o desenho estruturado com as informações recebidas do usuário.
	
 }
}
}
