import java.util.ArrayList;
import java.util.stream.Collectors;

public class Player extends Human{

    public Player(String name) {
        super(name);
    }

    Backpack backpack = new Backpack();

    public void take(String item) {
        backpack.stuff.add(item);
    }

    public class Backpack {
        ArrayList<String> stuff = new ArrayList<>();

        @Override
        public String toString() {
            if (stuff.size() > 0){
                String res = stuff.stream().collect(Collectors.joining(","));
            return res + " in the backpack";}
            else return "the backpack is empty";
        }
    }
}
