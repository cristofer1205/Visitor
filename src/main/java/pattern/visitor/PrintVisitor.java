package pattern.visitor;

import static java.lang.System.out;

public class PrintVisitor implements Visitor {

    private int level = 0;

    public void visit(Document document) {
        for (int i = 0; i < level; i++) {
            out.print(" ");
        }
        out.println("Document: " + document.getName());
    }

    public void visit(Folder folder) {
        for (int i = 0; i < level; i++) {
            out.print(" ");
        }
        out.println("Folder: " + folder.getName());
        level++;
        Node[] children = folder.getChildren();
        for (Node node : children) {
            node.accept(this);
        }
        level--;
    }
}
