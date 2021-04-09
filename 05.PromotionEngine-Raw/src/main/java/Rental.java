public class Rental {
    private final Customer customer;
    private final CarType carType;
    private final int rentalPeriod;
    private boolean is500Minus30;

    public Rental(Customer customer, CarType carType, int rentalPeriod) {
        this.customer = customer;
        this.carType = carType;
        this.rentalPeriod = rentalPeriod;
        this.is500Minus30 = true;
    }

    public double CalculateRent() {
        double rent = 0;

        switch (carType) {
            case Sedan:
                if (1 == rentalPeriod) {
                    rent = 200;
                } else {
                    rent = 200 + 150 * (rentalPeriod - 1);
                }
                break;
            case SUV:
                rent = 300 * rentalPeriod;
                break;
            case MPV:
                if (rentalPeriod < 3) {
                    rent = 600;
                } else {
                    rent = 600 + 200 * (rentalPeriod - 2);
                }
                break;
            default:
                break;
        }

        if (customer.isVip()) {
            rent = rent * 0.9;
        }

        if (is500Minus30) {
            int discountTime = (int) Math.floor(rent / 500);
            rent = rent - discountTime * 30;
        }

        return rent;
    }
}
