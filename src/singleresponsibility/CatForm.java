package singleresponsibility;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * formulaire en ligne de commande pour encoder "chat"
 */
public class CatForm {
    private final Scanner scanner;

    /**
     * constructeur
     */
    public CatForm() {
        scanner = new Scanner(System.in);
    }

    /**
     * affiche le titre du formulaire
     */
    public void showTitle() {
        System.out.println("\nFormulaire d'encodage d'un chat\n");
    }

    /**
     * demande les caractéristiques d'un chat à l'utilisateur
     * @return le chat
     */
    public Cat getCat() {
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
        return new Cat(breed, birth, weigth, size, colors);
    }

    /**
     * demande à l'utilisateur s'il veut encoder un autre chat
     * @return true si l'utilisateur veut continuer
     */
    public boolean getNext() {
        System.out.print("\nVoulez vous encoder un autre chat (O/N) ? ");
        return scanner.nextLine().equalsIgnoreCase("O");
    }

    /**
     * libère les ressource utilisée
     */
    public void close() {
        scanner.close();
    }
}
