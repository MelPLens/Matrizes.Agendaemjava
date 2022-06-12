package lista0905;

import java.util.Scanner;

public class agenda {

@SuppressWarnings("unused")
public static void main(String[] args) {
    
        @SuppressWarnings("resource")
		Scanner ler= new Scanner (System.in);
        int l = 0,c = 0,m[][]= new int [10][5];
       
        
        String [][] dadosNome = new String[l][c];   // vai armazevar todos os dados do nome
        String [][] dadosEndereco = new String[l][c];   // vai armazevar todos os dados do endereco
        String [][] dadosCodigopostal = new String[l][c];   // vai armazevar todos os dados do codigo postal
        String [][] dadosBairro = new String[l][c];   // vai armazevar todos os dados do nome
        String [][] dadosTelefone = new String[l][c]; // Vai armazenar todos dados do telefone 
        
        
        String nome;
		String endereco ;
        String codigopostal;
        String bairro;
        String telefone;
        
    	for( l =0 ; l< 10; l++){ 
    	}
    	System.out.printf("informe os elemntos %da linha/n", (l+1));
    	
            
    	        for( c= 0; c<5 ; c ++) {
    	        }
    			System.out.printf("m[%d][%d] = " , l, c);
    			
    			
         {
        	
            System.out.println("Insira o nome:");
            nome = ler.next();
            
            System.out.println("Insira o telefone:");
            telefone = ler.next();
            
            System.out.println("Insira o seu endereco:");
            endereco = ler.next();
            
            System.out.println("Insira o codigo postal:");
            codigopostal = ler.next();
            
            
            System.out.println("Qual é o  seu bairro:");
            bairro= ler.next();
         
            dadosNome[0][0] = nome;
            dadosTelefone [0][0] = telefone;
            dadosEndereco [0][0] = endereco;
            dadosCodigopostal[0][0] = codigopostal;
            dadosBairro[0][0] = bairro;
            
         }
    	        
   
       //Impressao dos elementos que estao na matriz:
         {
            System.out.println("dadosNome["+l+"] ["+c+"] ="+dadosNome[l][c]);
            System.out.println("dadosTelefone"+l+"] ["+c+"] ="+dadosTelefone[l][c]);
            System.out.println("dadosEndereco["+l+"] ["+c+"] ="+dadosEndereco[l][c]);
            System.out.println("dadosCodigopostal"+l+"] ["+c+"] ="+dadosCodigopostal[l][c]);
            System.out.println("dadosBairro"+l+"] ["+c+"] ="+dadosBairro[l][c]);
            
            
         
         }
    }

}

