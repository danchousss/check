package alatoo.edu.kg.view;

import alatoo.edu.kg.controller.FileController;
import alatoo.edu.kg.model.FileModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class FileListView extends JTable {
    private DefaultTableModel tableModel;
    private FileController fileController;

    public FileListView(FileController fileController) {}
    public void updateFileList(List<FileModel> files){}
}
