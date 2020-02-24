package pattern.visitor;

public interface Visitor {
    void visit(Document node);

    void visit(Folder node);
}
