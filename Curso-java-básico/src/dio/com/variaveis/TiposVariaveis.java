package dio.com.variaveis;

public class TiposVariaveis {
    public static void main(String[]args) throws Exception {
        double salarioMinimo = 2500;
       
        int numero = 5;
        numero = 10;
        System.out.println(numero);

// COM O FINAL NÃO PODE MUDAR O VALOR 
        final double VALOR_DE_PI = 3.14;
       


        /*
        byte: vai de -128 a 127;
        short: vai de -32.768 a 32.767;
        int: vai de 2 bilhões e alguma coisa negativos a 2 bilhões e alguma coisa positivos;
        long: vai de 9 de números negativos a 9  de números positivos.
                Uma variável do tipo:

                byte: possui 1 byte de informação ou 8 bits;
                short: possui 2 bytes de informação ou 16 bits;
                int: possui 4 bytes de informação ou 32 bits;
                long: possui 8 bytes de informação ou 64 bits.
        A família BCFD segue a mesma sequência da família BSIL, exceto pelo tipo boolean:

        boolean: possui normalmente 1 bit de informação, pois depende da arquitetura de computador;
        A partir do char em diante, a sequência é a mesma do BCFD:
        char: possui 2 bytes de informação ou 16 bits;
        float: possui 4 bytes de informação ou 32 bits;
        double: possui 8 bytes de informação ou 64 bits. */
    }
}
