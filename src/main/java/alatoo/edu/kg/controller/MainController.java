package alatoo.edu.kg.controller;

import alatoo.edu.kg.view.MainView;

public class MainController {
    private MainView mainView;
    private FileController fileController;

    public MainController() {
        fileController = new FileController();
        mainView = new MainView(fileController);

        fileController.setMainView(mainView);
        fileController.updateFileList();
    }

    public void show() {
        mainView.setVisible(true);
    }
}
