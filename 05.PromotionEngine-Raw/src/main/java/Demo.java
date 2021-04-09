public class Demo {
    public static void main(String[] args) {
        Rental rental1 = new Rental(new Customer(true), CarType.Sedan, 3);
        double rent1 = rental1.CalculateRent();

        Rental rental2 = new Rental(new Customer(true), CarType.MPV, 7);
        double rent2 = rental2.CalculateRent();
    }
}
