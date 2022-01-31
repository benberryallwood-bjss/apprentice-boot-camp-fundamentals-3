package tax;

public  class DefaultTaxCalculator extends TaxCalculator {
    public DefaultTaxCalculator() {
        super();
    }

    public DefaultTaxCalculator(int year) {
        super(year);
    }

    @Override
    public int calculateTax(Vehicle vehicle) {
        int emissions = vehicle.getCo2Emissions();
        int tax;
        if (emissions > 255) {
            tax = 2070;
        } else if (emissions > 225) {
            tax = 1760;
        } else if (emissions > 190) {
            tax = 1240;
        } else if (emissions > 170) {
            tax = 830;
        } else if (emissions > 150) {
            tax = 515;
        } else if (emissions > 130) {
            tax = 205;
        } else if (emissions > 110) {
            tax = 165;
        } else if (emissions > 100) {
            tax = 145;
        } else if (emissions > 90) {
            tax = 125;
        } else if (emissions > 75) {
            tax = 105;
        } else if (emissions > 50) {
            tax = 25;
        } else if (emissions > 0) {
            tax = 10;
        } else {
            tax = 0;
        }
        
        return tax;
    }
}
