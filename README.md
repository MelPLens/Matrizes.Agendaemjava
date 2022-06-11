# Matrizes.Agendaemjava
Repositório contém um código que simula uma agenda de cadastro pessoal com nome,endereço,código postal,bairro e telefone de dez pessoas. Ao final, o programa deve apresentar seus elementos em ordem alfabética.

  Inicio
    
     Rotina de entrada 
 
     Para I de 1 ate 10 passo 1 faca
     Escreva "Nome............" leia DADO [I,1]
     Escreva "Endereco........" leia DADO [I,2]
     Escreva "Codigo postal..." leia DADO [I,3]
     Escreva "Bairro.........." leia DADO [I,4]
     Escreva "Telefone........" leia DADO [I,5]
     Fim para
 
    Rotina de ordenacao dos elementos
 
    Para I de 1 ate 9 passo 1 faca
    Para J de I+1 ate 10 passos 1 faca
 
    Se (DADO [I,1] > DADO [j,1]) entao
 
    Troca de nome
 
    X ← DADO [I,1] 
    Dado [I,1] ← DADO [J,1]
    Dado [J,1] ← X
 
    Troca de endereco
  
    X ← DADO [I,2]
    DADO [I,2] ← DADO [J,2]
    DADO [J,2] ← X
 
    Troca do codigo postal
 
    X ← DADO [I,3]
    DADO [I,3] ← DADO [J,3]
    DADO [J,3] ← X
 
    Troca do bairro
 
    X ← DADO [I,4]
    DADO [I,4] ← DADO [J,4]
    DADO [J,4] ← X
 
    Troca do telefone
 
    X ← DADO [I,5]
    DADO [I,5] ← DADO [J,5]
    DADO [J,5] ← X
 
    Fim se
    Fim para
    Fim para
 
    Rotina de saida
 
    Para I de 1 ate 10 passo 1 faca
    Para J de 1 ate 5 passo 1 faca
    Escreva DADO [I,J]
    Fim para
 Fim 
