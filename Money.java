public class Money {
    private long dollars;
    private long cents;

    // Constructor
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    // Copy constructor
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        double total = this.toDouble() + otherAmount.toDouble();
        return new Money(total);
    }

    public Money subtract(Money otherAmount) {
        double total = this.toDouble() - otherAmount.toDouble();
        return new Money(total);
    }

    public int compareTo(Money otherObject) {
        return Double.compare(this.toDouble(), otherObject.toDouble());
    }

    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
    
    private double toDouble() {
        return dollars + (cents / 100.0);
    }
}
