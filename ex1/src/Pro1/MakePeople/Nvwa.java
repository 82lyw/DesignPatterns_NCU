package Pro1.MakePeople;

import java.io.IOException;

public class Nvwa {
    public static Person makePeople (String arg) throws Exception {
        switch (arg){
            case "M":
                System.out.println("creat a man......");
                return new Man();
            case "W":
                System.out.println("creat a woman......");
                return new Woman();
            case "R":
                System.out.println("creat a robot......");
                return new Robot();
            default:
                throw new IOException("Wrong argument!");
        }
    }
}
