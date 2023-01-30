import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class StarForm {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream("stars.csv", true));

        System.out.println("\nFormulaire d'encodage des étoiles\n");

        do {
            Star star = new Star();

            System.out.print("nom: ");
            star.setName(scanner.nextLine());

            System.out.print("taille: ");
            star.setSize(Double.parseDouble(scanner.nextLine()));

            System.out.print("distance: ");
            star.setDistance(Double.parseDouble(scanner.nextLine()));

            System.out.print("type: ");
            star.setType(scanner.nextLine());

            printWriter.append(String.join(";", new String[] {
                    star.getName(),
                    String.valueOf(star.getSize()),
                    String.valueOf(star.getDistance()),
                    star.getType()
            })).append("\n");
            System.out.print("\nVoulez vous encoder un autre chat (O/N) ? ");
        } while (scanner.nextLine().equalsIgnoreCase("O"));
        printWriter.close();
        scanner.close();
    }
}
