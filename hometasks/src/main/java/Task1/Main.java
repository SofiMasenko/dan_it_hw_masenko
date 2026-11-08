package Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CanBeClosed browser = new MyBrowser();
        CanBeClosed file = new MyFile();

        List<CanBeClosed> sessionEntities = new ArrayList<>();
        sessionEntities.add(browser);
        sessionEntities.add(file);

        SessionCloser closer = (entities) ->{
            for (CanBeClosed entity : entities ) {
                entity.close();
            }
        };

        closer.closeSession(sessionEntities);
    }
}
