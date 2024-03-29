package simple;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class CatForm {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream("cats.csv", true));
        boolean next;

        System.out.println("\nFormulaire d'encodage d'un chat\n");
        do {
            System.out.print("race: ");
            String breed = scanner.nextLine();
            System.out.print("date de naissance: ");
            LocalDate birth = LocalDate.parse(scanner.nextLine());
            System.out.print("poids: ");
            double weigth = scanner.nextDouble();
            System.out.print("taille: ");
            double size = scanner.nextDouble();
            System.out.print("couleurs: ");
            scanner.nextLine();
            String[] colors = scanner.nextLine().split("[, ]+");

            printWriter.
                    append(breed)
                    .append(";")
                    .append(String.valueOf(birth))
                    .append(";")
                    .append(String.valueOf(weigth))
                    .append(";")
                    .append(String.valueOf(size))
                    .append(";")
                    .append(String.join(" ", colors))
                    .append("\n");
            printWriter.flush();    // pas nécessaire mais facile les tests

            System.out.print("\nVoulez vous encoder un autre chat (O/N) ? ");
            next = scanner.nextLine().equalsIgnoreCase("O");
        } while (next);
        printWriter.close();
        scanner.close();
    }
}
