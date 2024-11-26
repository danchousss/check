package alatoo.edu.kg.controller;

import alatoo.edu.kg.utils.ActionCommand;

public class NavigationController {
    private final FileController fileController;

    public NavigationController(FileController fileController) {
        this.fileController = fileController;
    }

    public void handleAction(ActionCommand actionCommand) {
        switch (actionCommand) {
            case BACK:
                fileController.goBack();
                break;
            case FORWARD:
                // todo
                break;
            case REFRESH:
                fileController.refresh();
                break;
            case DELETE:
                fileController.deleteSelectedItem();
                break;
            case COPY:
                fileController.copySelectedItem();
                break;
            case PASTE:
                fileController.pasteSelectedItem();
                break;
            default:
                System.err.println("Unknown action: " + actionCommand);
                break;
        }
    }
}
