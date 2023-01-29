package singleresponsibility;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * classe pour écrire des "chats" dans le fichier csv
 */
public class CatWriter {
    private final PrintWriter printWriter;

    /**
     * constructeur
     * @throws FileNotFoundException s'il n'est pas possible d'ouvrir le fichier cats.csv
     */
    public CatWriter() throws FileNotFoundException {
        this.printWriter = new PrintWriter(new FileOutputStream("cats.csv", true));
    }

    /**
     * écrit un "chat" dans le fichier csv
     * @param cat est le chat à ajouter au fichier cats.csv
     */
    public void write(Cat cat) {
        printWriter.
                append(cat.getBreed())
                .append(";")
                .append(String.valueOf(cat.getBirth()))
                .append(";")
                .append(String.valueOf(cat.getWeight()))
                .append(";")
                .append(String.valueOf(cat.getSize()))
                .append(";")
                .append(String.join(" ", cat.getColors()))
                .append("\n");
        printWriter.flush();    // pas nécessaire mais facile les tests
    }

    /**
     * libère les ressources utilisées
     */
    public void close() {
        printWriter.close();
    }
}
