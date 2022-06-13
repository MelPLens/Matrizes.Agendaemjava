package lista0905;

import java.util.Scanner;
public class agenda{
    public static void main(String[] args){
       
    	
    	Scanner ler = new Scanner(System.in);
        String [][] agenda = new String [10][5]; // Declaro uma matriz de 10 por 5 com a utilizacao da string
        int a = 0; // declaro a variavel ' a' igual a zero,pois sera o usuario que informara a informacao

        
        //declaro o do ' laco de repeticao para executar 10 vezes
        do { 
       
        	
        	
            System.out.print("----- CADASTRO PESSOAL ----- \n");//Questão estética
            
            System.out.printf("Nome: ");//imprimi a mensagem ao usuario
            agenda [a][0] = ler.nextLine();

            System.out.printf("Endereco: ");//imprimi a mensagem ao usuario
            agenda [a][1] = ler.nextLine();

            System.out.printf("Codigo Postal: ");//imprimi a mensagem ao usuario
            agenda [a][3] = ler.nextLine();
            
            System.out.printf("Bairro: ");//imprimi a mensagem ao usuario
            agenda [a][3] = ler.nextLine();
            
            System.out.printf("Telefone: ");//imprimi a mensagem ao usuario
            agenda [a][4] = ler.nextLine();

            a++;// condicao que ira estruturar a matriz
           } while (a < 10);//Enquanto a for menor que 10 continuara executando as perguntas
             
          
             
             for (int i = 0; i < agenda.length; i++) { // declaro for para verificar 'i' no qual sao as linhas
                for (int j = 0; j < agenda[i].length; j++) { //declaro for para verificar 'j' no qual sao as colunas
                    System.out.print ("\t\\t"+ agenda[i][j]);// exibe matriz em colunas organizadas
                }
        System.out.println();//imprimi a matriz
        } 

        ler.close(); // fim do programa- interromper
    }
}
