import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Entities> lista = new ArrayList<>();
        boolean abert = true;

        while (abert) {
            System.out.print("\n Barbearia do João - dashboard");
            System.out.println("\n 1- Marcar Horario \n 2- Listar Agenda \n 3- Fechar Programa \n");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    marcarHorario(sc, lista);
                    break;
                case 2:
                    listarClientes(lista);
                    break;
                case 3:
                    System.out.println("Programa fechado! ");
                    abert = false;
                    break;
                default:
                    System.err.println("Opção invalida!!!");
                    break;

            }
        }
        sc.close();
    }

    private static void listarClientes(List<Entities> lista) {

        if (!lista.isEmpty()) {
            System.out.println("Registros: ");

            for (Entities clientes : lista) {
                System.out.println("#" + (lista.indexOf(clientes) + 1) + " - " + clientes);
            }
        }else{
            System.out.println("Nenhum registro encontrado!");
        }
    }

    private static void marcarHorario(Scanner sc, List<Entities> lista) {
        System.out.print("Informe o nome do Cliente: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();
        Entities cliente = new Entities(nomeCliente, new Date());
        lista.add(cliente);
    }
}