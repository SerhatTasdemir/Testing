



public class Main {
    public static void main(String[] args) {
        IntReader In = new IntReader();
        DoubleReader Double = new DoubleReader();


        System.out.print("Type a number : ");
        int i = In.readInt();
        System.out.println("The number is " + i);

        System.out.print("Type a double number : ");
        double x = Double.readDouble();
        System.out.println("The number " + x);



    }
}