import java.util.Scanner;

import componente.Iphone;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Iphone phone = new Iphone();
        Scanner sc = new Scanner(System.in);
        int opc = 1;
        while(opc != 0){

            System.out.printf("1. Chamar!%n2. Navegar!%n3. Ouvir Musica!%n0. sair!%n");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    //Chamada
                    phone.ligar();
                    phone.atender();
                    phone.iniciarCorreioDeVoz();
                    break;
                case 2:
                    //Navegação
                    phone.selecionarMusica();
                    phone.tocar();
                    phone.pausar();
                    break;
                case 3:
                    //Reproduzir Música
                    phone.adicionarNovaAba();
                    phone.exibirPagina();
                    phone.atualizarPagina();
                    break;
                case 0:
                    System.out.printf("saindo!%n");
                    break;
                default:
                    System.out.printf("opcao invalida!%n");  
                    break;  
            }
        }
        sc.close();
    }
}
