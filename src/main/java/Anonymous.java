public class Anonymous {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
//        myAnimal.makeNoise();

        Animal bigAnimal = new Animal(){
            public void makeNoise(){
                System.out.println("Boo Boo Boo");
            }
        };

        bigAnimal.makeNoise();
        printable(new Cat());
        printable(30);
        printable("Happy");
        secondPrintable(new Cat());
        thirdPrintable(new Cat());
    }

    static <T> void printable(T thing){
        System.out.println(thing + "!!!");
    }

    static <T> T secondPrintable(T thing){
        return thing;
    }

    static <T extends Animal> T thirdPrintable(T thing){
        return thing;
    }
}
