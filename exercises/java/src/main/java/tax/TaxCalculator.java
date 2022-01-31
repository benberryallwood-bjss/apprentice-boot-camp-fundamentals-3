package tax;

import java.time.LocalDate;

abstract class TaxCalculator{
    private final int year;

    abstract int calculateTax(Vehicle vehicle);

    public TaxCalculator(){
        this(LocalDate.now().getYear());
    }

    public TaxCalculator(int year){
        this.year = year;
    }

    int getYear() {
        return year;
    }
}
