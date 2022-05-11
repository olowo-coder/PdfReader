public class Driver {

    static int calculate(int a, int b) {
        try{
            return a-b;
        }catch(Exception e){
            return a+b;
        }finally{
            return a*b;
        }
    }

    public static void main(String args[])
    {
        Driver obj1 = new Driver();
        int result = obj1.calculate(2, 3);
        System.out.println("Result: " + result);
    }
}
