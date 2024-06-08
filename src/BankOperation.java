import java.util.Objects;
public class BankOperation {
    private long id;
    private double amount;
    private long fromId;
    private long toId;
    private OperationType type;

    public BankOperation(long id, double amount, long fromId, long toId, OperationType type) {
        this.id = id;
        this.amount = amount;
        this.fromId = fromId;
        this.toId = toId;
        this.type = type;
    }

    public double calculateCreditRate() {
        if (type != null) {
            return type.getCreditRate();
        }
        return OperationType.UNKNOWN.getCreditRate();


    }

    public void printInfo() {
        switch (type) {
            case DEBIT:
                System.out.println("Это мы положили деньги на счет");
                break;
            case MORTGAGE:
                System.out.println("ура я живу не на улице");
                break;
            case CREDIT:
                System.out.println("Кредит одобрен");
                break;
        }

    }

    @Override
    public String toString() {
        return "BankOperation{" +
                "id=" + id +
                ", amount=" + amount +
                ", fromId=" + fromId +
                ", toId=" + toId +
                ", type=" + type +
                '}';
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getFromId() {
        return fromId;
    }

    public void setFromId(long fromId) {
        this.fromId = fromId;
    }

    public long getToId() {
        return toId;
    }

    public void setToId(long toId) {
        this.toId = toId;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof BankOperation that)) return false;
        if (!super.equals(object)) return false;
        return id == that.id && java.lang.Double.compare(amount, that.amount) == 0 && fromId == that.fromId && toId == that.toId && type == that.type;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id, amount, fromId, toId, type);
    }
}
