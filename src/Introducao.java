import java.util.Scanner;

public class Introducao {
    public static void main (String [] arg){
//
//    //----------------------------------------------------------------------------------------------------------------//
//        // 1) Operadores Aritmeticos
//        System.out.println("Olá Mundão");
//        System.out.println(10 + 10 - 3 * 20 / 5); // = 8
//        System.out.println((10 + 10) - 3 * 20 / 5); // = 68
//        System.out.println(10 + (10 - 3) * (20 / 5) ); // = 38
//    //----------------------------------------------------------------------------------------------------------------//
//
//        // 2) Variaveis
//        // <tipo> <nome> = <valor inicial>;
//        String nome;
//        nome = "Diego";
//        String nomeX = "Danilo";
//        System.out.println(nome);
//    //----------------------------------------------------------------------------------------------------------------//
//
//        // 3) Casting
//        int valorX = 10;
//        long valorY = 10;
//
//        long total = valorY + valorX;
//        // int total2 = valorY + valorX; Não Funciona
//        int total3 = (int) valorY + valorX; // Casting, ou seja fazendo a conversão explicita de um tipo em outro.
//    //----------------------------------------------------------------------------------------------------------------//
//
//        // 4) Entrada e Saida de Dados
//        System.out.println("imprime e passa para proxima linha");
//        System.out.printf("Imprime como formatação, exs: Meu nome é %s e tenho %.1f%n", "Diego", 20.8);
//
//        int valor1 = 10;
//        int valor2 = 5;
//        String totalE = "Total: ";
//        System.out.println(totalE + valor1 + valor2); // = 105, Pq CONCATENOU
//        System.out.println(totalE + ( valor1 + valor2)); // = 15;
//
//        // Entrada via Teclado
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite uma palavra: ");
//        String entradaTexto = teclado.next();
//        System.out.println("Vc digitou: " + entradaTexto);
//
//        System.out.println("Digite um Numero: ");
//        int entradaNumero = teclado.nextInt();
//        System.out.println("Vc digitou: " + entradaNumero);
//    // ----------------------------------------------------------------------------------------------------------------//
//
//        // 5) Classe Math
//        double x = 25.0;
//        double y = 5.0;
//        double b = 2.0;
//        int z = -5;
//        double a = 23.33;
//        System.out.println("A raiz quadrada de " + x + " é " + Math.sqrt(x));
//        System.out.println(y + " elevado a " + b + " é " + Math.pow(y, b));
//        System.out.println("Valor absoluto de " + z + " é " + Math.abs(z));
//        System.out.println("Se x é " + x + " e y é " + y + " então " + Math.max(x,y) + " é o maio valor");
//        System.out.println("Se x é " + x + " e y é " + y + " então " + Math.min(x,y) + " é o menor valor");
//        System.out.println("Um valor aleatório (randômico) " + Math.random());
//        System.out.println("O valor arredondado de " + a + " é " + Math.round(a));
//    // ----------------------------------------------------------------------------------------------------------------//
//
//        // 6) Operadores de atribuição cumulativa
//        int numero1 ;
//        int numero2  = 100;
//        numero1 = numero2; // Atrinuido o valor da variavel numero2 na variavel numero1
//
//        numero1 = numero1 + numero2; // (numero1 +=  numero2) É MESMA COISA.
//        System.out.println(numero1);
//    // ----------------------------------------------------------------------------------------------------------------//
//
//        // 7) Condicionais - if
//        int  valorz = 1;
//        int valory = 1;
//
//        if(valorz == valory){
//            System.out.println("São iguais");
//        }
//        // ------ ------ ------ ------ /
//        if(valorz != valory){
//            System.out.println("valorz é diferente de valory");
//        }
//        else if (valorz < valory || valorz > valory){
//            System.out.println("valorz é com certeza igual a valory");
//        }
//        else{
//            System.out.println("valorz é com certeza igual a valory");
//        }
//    // ----------------------------------------------------------------------------------------------------------------//
//
//        // 8) Condicionais - Switch Case
//        int menu = 1;
//
//        switch (menu) {
//            case 1:
//                System.out.println("Selecionou o item 1");
//                break;
//            case 2:
//                System.out.println("Selecionou o item 2");
//                //break;
//            case 3:
//                System.out.println("Selecionou o item 3");
//                break;
//            default:
//                System.out.println("Entrou no default");
//                break;
//        }
//    // ----------------------------------------------------------------------------------------------------------------//
//        // 9) Condicionais - Operador Ternário
//
//        /*
//            Sintexe:
//            ( <condição> ) ? <se verdadeiro> : <se falso>
//        */
//
//        double  mediaAluno = 5.5;
//        double mediaMinima = 7.0;
//
//        String status = mediaAluno >= mediaMinima ? "Aprovado" : "Reprovado";
//        System.out.println(status); // Reprovado
//     }
//    // ----------------------------------------------------------------------------------------------------------------//
//      //Exercicio 002
//        Scanner tecladoExercicio = new Scanner(System.in);
//        System.out.println("Entre com  quatro valores: ");
//        double entradaTextoExercicio1= tecladoExercicio.nextDouble();
//        double entradaTextoExercicio2= tecladoExercicio.nextDouble();
//        double entradaTextoExercicio3= tecladoExercicio.nextDouble();
//        double entradaTextoExercicio4= tecladoExercicio.nextDouble();
//        double media =(( entradaTextoExercicio1 + entradaTextoExercicio2 + entradaTextoExercicio3 + entradaTextoExercicio4) /4);
//
//        if (media >= 7){
//            System.out.println("Parabéns! Você aprovado com média:  " + media);
//        }
//        else{
//            System.out.println("Você foi reprovado com média: " + media +  ", onde 7 é o valor da média");
//        }
//
     // ----------------------------------------------------------------------------------------------------------------//
        // 10) Estrutura de Repetição
        
    }
}