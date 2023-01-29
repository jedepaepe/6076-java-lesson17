package singleresponsibility;

import java.io.FileNotFoundException;

/**
 * l'application
 */
public class CatApp {
    private final CatForm catForm;
    private final CatWriter catWriter;

    /**
     * constructeur
     * @throws FileNotFoundException, s'il n'est pas possible d'ouvrir le fichier cats
     */
    public CatApp() throws FileNotFoundException {
        this.catForm = new CatForm();
        this.catWriter = new CatWriter();
    }

    /**
     * exécute l'application
     */
    public void run() {
        catForm.showTitle();
        do {
            Cat cat = catForm.getCat();
            catWriter.write(cat);
        } while (catForm.getNext());
        catForm.close();
        catWriter.close();
    }
}
