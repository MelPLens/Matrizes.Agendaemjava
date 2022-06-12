package lista0905;

import java.util.Scanner;

public class agenda 
{

    public static void main(String[] args) 
    {
        
   
		Scanner ler= new Scanner (System.in);
        
		
		int i = 0;
		int j = 0;
		@SuppressWarnings("unused")
		string matriz;
		int[][] matriz1=  new int [10][5];
        
        // Percorrendo a matriz e Inserindo seus dados
        for ( int i1 = 0 ; i1<10 ;i1++)
            for ( int j1 =0 ; j1<5 ;j1++)
            {
            	System.out.println("---- CADASTRO PESSOAL ----");
            	System.out.println("Insira o nome:");
                ler.next();
                
                System.out.println("Insira o telefone:");
                ler.next();
                System.out.println("Insira o seu endereco:");
                ler.next();
                
                System.out.println("Insira o codigo postal:");
                ler.next();
                System.out.println("Qual é o  seu bairro:");
                ler.next();
               
                System.out.printf("m[%d][%d] = " , i, j); // declara em qual local da matriz esta sendo inserido a informação do usuário.
                System.out.printf("%d " ,matriz1[i][j]);
            }
		System.out.printf("\n");
    
        //Impressao dos elementos que estao na matriz:
         for ( int i1 = 0 ; i1<10 ;i1++) {
            for ( int j1 =0 ; j1<5 ;j1++)
            {
                
            	System.out.println("---- CADASTRO PESSOAL ----");
            	System.out.println("Insira o nome:");
                ler.next();
                
                System.out.println("Insira o telefone:");
                ler.next();
                System.out.println("Insira o seu endereco:");
                ler.next();
                
                System.out.println("Insira o codigo postal:");
                ler.next();
                System.out.println("Qual é o  seu bairro:");
                ler.next();
                System.out.printf("m[%d][%d] = " , i, j); // declara em qual local da matriz esta sendo inserido a informação do usuário.
                System.out.printf("%d " ,matriz1[i][j]);
                
                
                
                System.out.printf("\n"); 
                
            }
         
         
        ler.close();
    }
    
         
         }
    }

