package dio.com.operadores;

public class TiposOperadores {
    public static void main(String[] arges)  {
        String nomeUm = "Miguel";
        String nomeDois = new String("José");
        System.out.println(nomeUm.equals(nomeDois));

       String concatenacao = "?";
    System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;
       /* numero = - numero;
        numero = numero * -1;
        System.out.println(numero);*/
//      repeticao    
        numero++;
    //numero = numero +1
    System.out.println(numero);
    // ++ incrementar
    // -- decrementar 

    // ternario
    int a, b;
    a = 6;
    b = 6;
    String resultado = a == b ?"verdadeiro" : "falso";
    System.out.println(resultado);

    int numero1 = 1;
    int numero2 = 2;
    boolean simNao = numero1 == numero2;

if(numero1 == numero2){
    System.out.println("a nossa condição é verdadera");
}

    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente a numeroDois? " + simNao);

boolean condicao1 = true;

boolean condicao2 = false;
    if(condicao1 && (7 > 4)){
        System.out.println(" as duas condicões são verdadeiras");
    }
    if(condicao1 || condicao2){
        System.out.println(" as duas condicões são verdadeiras");
    }
    }
}
