import java.util.Objects;

public class Bank {
    private long id;
    private String name;

    public Bank(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankOperation createOperation (Person person,OperationType operationType,double amount ) {
        BankOperation bankOperation = new BankOperation(0,amount,id, person.getId(),operationType);
    if (person == null)  {
        return null;
    } if (person.getCategory() == AgeCategory.CHILD || (person.getCategory() ==AgeCategory.TEEN && operationType != OperationType.DEBIT))  {
        return null;
        }
        return bankOperation;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank bank)) return false;
        return id == bank.id && Objects.equals(name, bank.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
