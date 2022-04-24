import java.util.concurrent.Callable;

interface Reptile{
    ReptileEgg lay() throws Exception;
}
public class FireDragon implements Reptile{
    public FireDragon() {
    }

    @Override
    public ReptileEgg lay() throws Exception {
        Callable<Reptile> callable;
        callable = FireDragon::new;
        return new ReptileEgg(callable);
    }

    public static void main(String[] args) throws Exception {
        FireDragon fireDragon = new FireDragon();
            var child = fireDragon.lay().hatch();
            fireDragon.lay().hatch();
    }


}

class ReptileEgg{
    private final Reptile reptile;
    private boolean hatched;

    public ReptileEgg(Callable<Reptile> reptileCallable) throws Exception {
        this.reptile = reptileCallable.call();
    }

    public Reptile hatch() throws Exception {
        if(hatched) throw new IllegalStateException("Cannot hatch twice");
        else {
            hatched = true;
            return this.reptile;
        }
    }
}
