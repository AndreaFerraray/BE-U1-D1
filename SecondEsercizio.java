import java.util.Scanner;

public class SecondEsercizio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci una parola e poi premi"+"invio");
        String uno = input.nextLine();
        System.out.println("inserisci un'altra e poi premi"+"invio");
        String due = input.nextLine();
        System.out.println("inserisci un'altra e poi premi"+"invio");
        String tre = input.nextLine();
        System.out.println("Hai inserito " + tre + due + uno);
        input.close();
    }
}
