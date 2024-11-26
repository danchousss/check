package alatoo.edu.kg.view;

import alatoo.edu.kg.controller.FileController;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    private Toolbar toolbar;
    private FileListView fileListView;

    public MainView(FileController fileController) {
        setTitle("File Explorer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        toolbar = new Toolbar(fileController.getNavigationController());
        fileListView = new FileListView(fileController);

        setLayout(new BorderLayout());
        add(toolbar, BorderLayout.NORTH);
        add(new JScrollPane(fileListView), BorderLayout.CENTER);
    }

    public FileListView getFileListView() {
        return fileListView;
    }

    public Toolbar getToolbar() {
        return toolbar;
    }
}
