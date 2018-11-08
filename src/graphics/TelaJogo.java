package graphics;

import java.util.Scanner;
import components.Palavra;

public class TelaJogo {
    
    public static char pegarEntrada() {
        Scanner sc = new Scanner(System.in);
        char letra;
        
        // Tratando a entrada do usuário
        System.out.println("Qual letra a palavra possui?");
        do{            
            System.out.print("> Digite seu chute: ");
            letra = sc.nextLine().charAt(0);

            if(letra < 65 || (letra > 90 && letra < 97) || letra > 122){
                System.out.println("Entrada inválida!");
                System.out.println("Digite uma letra de A a Z.\n");
            }
            
        }while(letra < 65 || (letra > 90 && letra < 97) || letra > 122);
        
        return letra;
    }
    
    public static void mostrarLacunas() {
        System.out.println(Palavra.verLacunas());
    }

    //Verficiando Acerto/Erro
    public void mostrarAlerta(boolean acertou) {
        if (acertou) {
            System.out.println(">Acertou<");
            System.out.println("*** ***");
            System.out.println(" *   * ");
            System.out.println("**   ** ");
            System.out.println(" *   * ");
            System.out.println(" *   * ");
            System.out.println("*** ***");
        } else {
            System.out.println(">Errou<");
            System.out.println("+++ +++");
            System.out.println(" +   + ");
            System.out.println("++   ++ ");
            System.out.println(" +   + ");
            System.out.println(" +   + ");
            System.out.println("+++ +++");
        }
    }
    
}