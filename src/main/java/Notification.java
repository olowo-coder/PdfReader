public class Notification implements Observer{


    @Override
    public Object observe(Object event) {
        return "This is an " + event;
    }
}
