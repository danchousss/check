package alatoo.edu.kg;

import alatoo.edu.kg.controller.MainController;

public class Main {
    public static void main(String[] args) {
        MainController mc = new MainController();
        javax.swing.SwingUtilities.invokeLater(mc::show);
    }
}