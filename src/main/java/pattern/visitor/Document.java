package pattern.visitor;
import java.io.File;

public class Document implements Node {

    private final File file;

    public Document(File file) {
        this.file = file;
    }

    public String getName() {
        return file.getName();
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
