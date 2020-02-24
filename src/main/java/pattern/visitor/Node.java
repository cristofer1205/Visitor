package pattern.visitor;

public interface Node {
    void accept(Visitor visitor);
}
