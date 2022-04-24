import java.util.ArrayList;
import java.util.List;

public class Alert implements Observer{
    @Override
    public Object observe(Object event) {
        List<String> add = new ArrayList<>();
        add.add("Check");
        add.add("to");
        add.add("test");
        add.add("Ok");
        add.add((String) event);
        return add;
    }
}
