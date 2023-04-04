public class MinhaClasse {
    
public static void main (String [] args) {
    //variavel

/*String meuNome = "Miguel";


int anoFabricacao = 2022;

boolean verdadeira = false;

anoFabricacao = 2018;*/

String primeiroNome = "Miguel ";
String segundoNome = "Aguiar";

String nomeCompleto = nommeCompleto(primeiroNome, segundoNome);

System.out.println(nomeCompleto);
}
//metodo

public static String nommeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do método: " + primeiroNome.concat("").concat(segundoNome);
}

}
