package alatoo.edu.kg.controller;

import alatoo.edu.kg.model.FileModel;
import alatoo.edu.kg.view.MainView;

public class FileController {
    private FileModel currentDirectory;
    private MainView mainView;
    private NavigationController navigationController;

    public FileController() {}
    public void setMainView(MainView mainView) {}

    public void updateFileList() {}
    public void openItem(int index) {}

    public void goBack(){}
    public void refresh() {}
    public void deleteSelectedItem() {}
    public void copySelectedItem() {}
    public void pasteSelectedItem() {}

    public NavigationController getNavigationController() {
        return navigationController;
    }
}
