package lista0905;

import java.util.Scanner;

public class agendamatrizes {

    public static void main(String[] args) 
    {
        
		@SuppressWarnings("resource")
		Scanner ler= new Scanner (System.in);
        
        final int L=10;
        final int C=5;
        
        String [][] dadosNome = new String[10][5];   // vai armazevar todos os dados do nome
        String [][] dadosEndereco = new String[10][5];   // vai armazevar todos os dados do endereco
        String [][] dadosCodigopostal = new String[10][5];   // vai armazevar todos os dados do codigo postal
        String [][] dadosBairro = new String[10][5];   // vai armazevar todos os dados do nome
        String [][] dadosTelefone = new String[10][5]; // Vai armazenar todos dados do telefone 
        
        
        String nome;
		String endereco ;
        String codigopostal;
        String bairro;
        String telefone;
        
        
        // Percorrendo a matriz e Inserindo seus dados
    	for( L = 10;L < 10; L++) { // dois for para percorrer toda matriz para fazer a execucao para imprimir a mensagem ao usuario
    	    System.out.printf("informe os elemntos %da linha/n", (L+1));
    			for( C= 5; C<5 ; C ++) {
    				System.out.printf("m[%d][%d] = " , L, C);
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
               
                dadosNome[L][C] = nome;
                dadosTelefone [L][C] = telefone;
                dadosEndereco [L][C] = endereco;
                dadosCodigopostal[L][C] = codigopostal;
                dadosBairro[L][C] = bairro;
                
            }
        
        
        //Impressao dos elementos que estao na matriz:
         for ( int i = 0 ; i<L ;i++)
            for ( int j =0 ; j<C ;j++)
            {
                System.out.println("dadosNome["+i+"] ["+j+"] ="+dadosNome[i][j]);
                System.out.println("dadosTelefone"+i+"] ["+j+"] ="+dadosTelefone[i][j]);
                System.out.println("dadosEndereco["+i+"] ["+j+"] ="+dadosEndereco[i][j]);
                System.out.println("dadosCodigopostal"+i+"] ["+j+"] ="+dadosCodigopostal[i][j]);
                System.out.println("dadosBairro"+i+"] ["+j+"] ="+dadosBairro[i][j]);
                
                
                
            }
         
         
        
         }
   
      }
    }

  }
}
