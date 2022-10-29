import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Saltrab;
        Double QTsalmin;

        System.out.println("Digite seu salário ");
        Saltrab = sc.nextDouble();
        QTsalmin = Saltrab / 1212.0;
        System.out.print("Você recebe = " + QTsalmin + " salarios mínimos");
        sc.close();
    }
}