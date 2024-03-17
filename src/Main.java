



public class Main {
    public static void main(String[] args) {
        Intreader In = new Intreader();
        DoubleReader Double = new DoubleReader();


        System.out.print("Type a number : ");
        int i = In.readInt();
        System.out.println("The number is " + i);

        System.out.print("Type a double number : ");
        double x = Double.readDouble();
        System.out.println("The number is " + x);



    }
}