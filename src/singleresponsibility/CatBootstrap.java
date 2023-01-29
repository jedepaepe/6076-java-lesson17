package singleresponsibility;

import java.io.FileNotFoundException;

/**
 * charge l'application et l'exécute
 */
public class CatBootstrap {
    public static void main(String[] args) throws FileNotFoundException {
        new CatApp().run();
    }
}
