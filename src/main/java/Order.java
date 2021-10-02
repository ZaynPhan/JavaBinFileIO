import java.time.LocalDate;

public class Order {
    private LocalDate date;
    private String customerName;
    private double total;

    public Order(LocalDate date, String customerName, double total) {
        this.date = date;
        this.customerName = customerName;
        this.total = total;
    }

    public Order() {
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("Date ").append(this.date).append("\n");
        stringBuffer.append("Name ").append(this.customerName).append("\n");
        stringBuffer.append("Total ").append(this.total);
        return stringBuffer.toString();
    }
}
