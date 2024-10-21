package j06001;

public class Bill {
    private String id, name;
    private long price1, price2;
    private long quantity;
    private long discount;
    private long total;

    public Bill(String id, String name, long price1, long price2) {
        this.id = id;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setTotal(long type) {
        if (type == 1) this.total = quantity * price1;
        else this.total = quantity * price2;
    }

    public long getTotal() {
        return total;
    }

    public void setDiscount() {
        if (quantity >= 150) this.discount = this.getTotal() * 50 / 100;
        else if (quantity >= 100) this.discount = this.getTotal() * 30 / 100;
        else if (quantity >= 50) this.discount = this.getTotal() * 15 / 100;
        else this.discount = 0;
    }

    public long getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", this.id, this.name, this.discount, this.total - this.discount);
    }
}