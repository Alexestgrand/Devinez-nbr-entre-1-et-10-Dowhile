import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Entrez le bon nombre entre 1 et 10");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        do {
            System.out.println("votre nombre est incorrect veuillez en entrez un autre");
            n  = sc.nextInt();
        }while(n != 7);

        System.out.println("Votre nombre est correct");


    }

}
