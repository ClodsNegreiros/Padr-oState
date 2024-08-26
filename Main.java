import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        Scanner scanner = new Scanner(System.in);
        String comando;

        do {
            System.out.println("Digite um dos comandos (play, stop, next, prev) ou 'exit' para sair: ");
            comando = scanner.nextLine().toLowerCase();

            switch (comando) {
                case "play":
                    player.play();
                    System.out.println(player);
                    break;
                case "stop":
                    player.stop();
                    System.out.println(player);
                    break;
                case "next":
                    player.clickNextTrack();
                    System.out.println(player);
                    break;
                case "prev":
                    player.clickPreviousTrack();
                    System.out.println(player);
                    break;
                case "sair":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Comando inválido");
                    break;
            }
        } while (!comando.equals("sair"));

        scanner.close();
    }
}