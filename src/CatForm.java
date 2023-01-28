import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class CatForm {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream("cats.csv", true));
        boolean next = false;

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

            Cat cat = new Cat(breed, birth, weigth, size, colors);

            printWriter.append(cat.getBreed() + ";" + cat.getBirth() + ";" + cat.getWeight() + ";" + cat.getSize() +
                    ";" + String.join(" ", cat.getColors()) + "\n");
            printWriter.flush();    // pas nécessaire mais facile les tests

            System.out.print("\nVoulez vous encoder un autre chat (O/N) ?");
            next = scanner.nextLine().toUpperCase().equals("O");
        } while (next);
        printWriter.close();
        scanner.close();
    }
}
