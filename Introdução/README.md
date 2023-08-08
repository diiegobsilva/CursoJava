# Curso Java Introdução

<H2> 1) Operadores Aritmeticos </H2>

        System.out.println("Olá Mundão");
        
        System.out.println(10 + 10 - 3 * 20 / 5); // = 8
        
        System.out.println((10 + 10) - 3 * 20 / 5); // = 68
        
        System.out.println(10 + (10 - 3) * (20 / 5) ); // = 38
        


<H2> 2) Variáveis </H2>
       
        Ex: < tipo > < nome > = < valor inicial >;
        
        String nome;
        nome = "Diego";
        String nomeX = "Danilo";
        System.out.println(nome);
            


<H2> 3) Casting </H2>
       
        int valorX = 10;
        long valorY = 10;

        long total = valorY + valorX;
        
        // int total2 = valorY + valorX; (Não Funciona)
        
        int total3 = (int) valorY + valorX; // Casting, ou seja fazendo a conversão explicita de um tipo em outro.
        


<H2> 4) Entrada e Saída de Dados </H2>
        
        System.out.println("imprime e passa para proxima linha");
        System.out.printf("Imprime como formatação, exs: Meu nome é %s e tenho %.1f%n", "Diego", 20.8);

        int valor1 = 10;
        int valor2 = 5;
        String totalE = "Total: ";
        System.out.println(totalE + valor1 + valor2); // = 105, Pq CONCATENOU
        System.out.println(totalE + ( valor1 + valor2)); // = 15;
        
<H3> Entrada via Teclado </H3>
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String entradaTexto = teclado.next();
        System.out.println("Vc digitou: " + entradaTexto);

        System.out.println("Digite um Numero: ");
        int entradaNumero = teclado.nextInt();
        System.out.println("Vc digitou: " + entradaNumero);
        


<H2> 5) Classe Math </H2>
        
        double x = 25.0;
        double y = 5.0;
        double b = 2.0;
        int z = -5;
        double a = 23.33;
        System.out.println("A raiz quadrada de " + x + " é " + Math.sqrt(x));
        System.out.println(y + " elevado a " + b + " é " + Math.pow(y, b));
        System.out.println("Valor absoluto de " + z + " é " + Math.abs(z));
        System.out.println("Se x é " + x + " e y é " + y + " então " + Math.max(x,y) + " é o maio valor");
        System.out.println("Se x é " + x + " e y é " + y + " então " + Math.min(x,y) + " é o menor valor");
        System.out.println("Um valor aleatório (randômico) " + Math.random());
        System.out.println("O valor arredondado de " + a + " é " + Math.round(a));
        


<H2> 6) Operadores de atribuição cumulativa </H2>
        
        int numero1 ;
        int numero2  = 100;
        numero1 = numero2; // Atrinuido o valor da variavel numero2 na variavel numero1

        numero1 = numero1 + numero2; // (numero1 +=  numero2) É MESMA COISA.
        System.out.println(numero1);
        

<H2> 7) Condicionais - if </H2>
       
        int  valorz = 1;
        int valory = 1;

        if(valorz == valory){
            System.out.println("São iguais");
        }
        
        // ------ ------ ------ ------ /
        
        if(valorz != valory){
            System.out.println("valorz é diferente de valory");
        }
        else if (valorz < valory || valorz > valory){
            System.out.println("valorz é com certeza igual a valory");
        }
        else{
            System.out.println("valorz é com certeza igual a valory");
        }

<H2> 8) Condicionais - Switch Case </H2>

        int menu = 1;

        switch (menu) {
            case 1:
                System.out.println("Selecionou o item 1");
                break;
            case 2:
                System.out.println("Selecionou o item 2");
                //break;
            case 3:
                System.out.println("Selecionou o item 3");
                break;
            default:
                System.out.println("Entrou no default");
                break;
        }


<H2> 9) Condicionais - Operador Ternário </H2>
       
        /*
            Sintexe:
            ( <condição> ) ? <se verdadeiro> : <se falso>
        */

        double  mediaAluno = 5.5;
        double mediaMinima = 7.0;

        String status = mediaAluno >= mediaMinima ? "Aprovado" : "Reprovado";
        System.out.println(status); // Reprovado
     }
     


<H3> Exercicio 002 </H3>  
<H4>
1 - Crie a classe  Exercicio002. Esta classe deve pedir para o usuário entrar com quatro valores através da console;
    
2 - Tire a média dos valores e se o resultado for maior ou igual a 7.0 informe no console "Parabéns! Você aprovado com média:  X", caso contrário informe "Você foi reprovado com média: X", onde X é o     valor da média;
</H4>


    Scanner tecladoExercicio = new Scanner(System.in);
    System.out.println("Entre com  quatro valores: ");

    double entradaTextoExercicio1= tecladoExercicio.nextDouble();
    double entradaTextoExercicio2= tecladoExercicio.nextDouble();
    double entradaTextoExercicio3= tecladoExercicio.nextDouble();
    double entradaTextoExercicio4= tecladoExercicio.nextDouble();
    double media =(( entradaTextoExercicio1 + entradaTextoExercicio2 + entradaTextoExercicio3 + entradaTextoExercicio4) /4);

        if (media >= 7){
        System.out.println("Parabéns! Você aprovado com média:  " + media);
    }
        else{
        System.out.println("Você foi reprovado com média: " + media +  ", onde 7 é o valor da média");
    }
    


<H2> 10) Estrutura de Repetição </H2>
        
<H3>a) FOR</H3>
        
       /*
            Sintexe:
                for(inicio; condição; incremento){
                   <comando1>
                   <comando2>
               }
        */
        
        Ex1.
               int a = 5;
               for(int i = 0; i >=   a; i++ ){
                   System.out.println("O Valor i é " + i);
               }
      
        Ex2.
                for(int i = 0; i < a; i-- ){
                    System.out.println("O Valor i é " + i);
                }


<H3>b) WHILE</H3>

        /*
            Sintexe:
                while( <condição verdadeira> ){
                   <comando1>
                   <comando2>
                }
        */
        
        
        Ex1.
                a = 5;
                while(a != 0){
                    System.out.println("a vale " + a);
                    a--;
                }

        Ex2.
        
                while(a != 100){
                    a++;
                    if(a < 40){
                        continue;
                    }
                    System.out.println("a vale " + a);
                    if(a == 50){
                        System.out.println("Loop interrompido com a valendo " + a);
                        break;
                    }
                }

<H3>c) DO WHILE</H3>

        /*
            Sintexe:
                do{
                   <comando1>
                   <comando2>
                } while (<condição verdadeira>)
       */
       
        Ex1.
                a = 1;
                do {
                    System.out.println("a vale " + a);
                } while (a > 1000); // a nunca foi maior que 1000 porém vai executar uma vez.
                
<H2>Manipulação de String</H2>

          /*
              Strings são imutáveis

              Exemplo:

              String  a = "Um exemplo";
              É alocado em algum endereço da memória o objeto String com o conteúdo "Um exemplo".

              a = a + " melhor";

              O objeto não foi alterado mas criado um novo objeto e alocado em um novo endereço da memória
              com o conteúdo "Um exemplo melhor".
            */

        String a = "Um texto qualquer de exemplo";

        System.out.println("Em maiuscula: " + a.toUpperCase());
        System.out.println("Em menuscula: " + a.toLowerCase());
        System.out.println("Quantidade de caracteres na frase: " + a.length());
        System.out.println("Um pedaço da frase a partir de um ponto: " + a.substring(9));
        System.out.println("Um pedaço específico da frase: " + a.substring(9,17));
        System.out.println("Substituir um pedaço específico da frase: " + a.replace("exemplo", "modelo"));
        System.out.println("Posição da palavra: " + a.indexOf("texto"));
        System.out.println("Posição do caractere: " + a.lastIndexOf("e"));

        String [] arrayPalavras = a.split(" ");
        System.out.println("Terceiro item do array: " + arrayPalavras[2]);

<H3>Invertendo a frase</H3>
        
        String fraseInvertida = "";
        for (int i = a.length(); i > 0; i--) {
            fraseInvertida = fraseInvertida + a.substring(i - 1, i);
        }

        System.out.println(fraseInvertida);

<H3>Essa classe permite criar e manipular dados de Strings dinamicamente com mais eficiência.</H3>
        
        StringBuilder stringBuilder = new StringBuilder(a);
        System.out.println(stringBuilder.reverse().toString());

        /*
           Essa classe permite criar e manipular dados de Strings dinamicamente com mais eficiência.
           StringBuffer é sincronizado e garante consistência quando há diversas threads lendo ou modificando
           a mesma String
        */
        StringBuffer stringBuffer = new StringBuffer(a);
        System.out.println(stringBuffer.reverse().toString());


