package pattern.visitor;

import java.io.File;

public class Folder implements Node {

    private final File directory;

    public Folder(File directory) {
        this.directory = directory;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return directory.getName();
    }

    public Node[] getChildren() {
        File[] files = directory.listFiles();
        Node[] nodes = new Node[files.length];
        for (int i = 0; i < files.length; i++) {
            nodes[i] = files[i].isDirectory() ? new Folder(files[i]) : new Document(files[i]);

        }
        return nodes;
    }
}
