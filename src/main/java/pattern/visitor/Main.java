package pattern.visitor;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    public static final String PATH_TO_VISIT = "/Users/cristofer/Documents/maestria";

    public static void main(String[] args) {
        Folder node = new Folder(new File(PATH_TO_VISIT));
        /*LOG.log(Level.INFO,"test PrintVisitor");
        LOG.log(Level.INFO,"=================");
        */
        node.accept(new PrintVisitor());
        LOG.log(Level.INFO, "test NullVisitor");
        LOG.log(Level.INFO, "=================");
        node.accept(new NullVisitor());
    }
}
