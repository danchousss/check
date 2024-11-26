package alatoo.edu.kg.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileModel {
    private final File file;

    public FileModel(File file) {
        this.file = file;
    }

    public FileModel(String path) {
        this.file = new File(path);
    }

    public File getFile() {
        return file;
    }

    public String getPath() {
        return file.getAbsolutePath();
    }

    public String getName() {
        return file.getName();
    }

    public boolean isDirectory() {
        return file.isDirectory();
    }

    public FileModel getParent() {
        File parent = file.getParentFile();
        if (parent != null) {
            return new FileModel(parent);
        }
        return null;
    }

    public List<FileModel> getChildren() {
        List<FileModel> children = new ArrayList<FileModel>();
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    children.add(new FileModel(f.getAbsolutePath()));
                }
            }
        }
        return children;
    }

    public boolean deleteItem(String path) {}
    public void copyItem(String path) {}
    public void copyDirectory(String path) {}
    public void pasteItem(String path) {}
}
