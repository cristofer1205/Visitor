package pattern.visitor;

public class NullVisitor implements Visitor {

    public void visit(Document file) {
        //do nothing
    }

    public void visit(Folder directory) {
        Node[] children = directory.getChildren();
        for (Node file : children) {
            file.accept(this);
        }
    }
}
