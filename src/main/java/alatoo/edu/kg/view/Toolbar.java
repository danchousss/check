package alatoo.edu.kg.view;

import alatoo.edu.kg.controller.NavigationController;
import alatoo.edu.kg.utils.ActionCommand;

import javax.swing.*;
import java.util.Map;

public class Toolbar extends JPanel {
    private Map<ActionCommand, JButton> buttons;
    private JTextField pathField;

    public Toolbar(NavigationController navigationController) {
        //contains initializeButtons method
    }

    private void initializeButtons() {}

    public void updatePath(String path) {
        pathField.setText(path);
    }

    public String getPath() {
        return pathField.getText();
    }
}
