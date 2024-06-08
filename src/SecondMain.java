import org.w3c.dom.ls.LSOutput;

public class SecondMain {
    public static void main(String[] args) {

    Bank bank = new Bank(1, "New bank");
    Person umut = new Person(2, "Umut", 28);
    Person nuria = new Person(3, "Nuria", 15);
    Person zayn = new Person(4, "Zayn", 7);
    Person ippolit = new Person(5, "Ippolit", 70);

    BankOperation bankOperation = bank.createOperation(umut,OperationType.CREDIT,5000);
        System.out.println(bankOperation);

        BankOperation bankOperation1 = bank.createOperation(nuria,OperationType.DEBIT,5000);
        System.out.println(bankOperation1);

        BankOperation bankOperation2 = bank.createOperation(zayn,OperationType.DEBIT,5000);
        System.out.println(bankOperation2);

        BankOperation bankOperation3 = bank.createOperation(ippolit,OperationType.MORTGAGE,5000);
        System.out.println(bankOperation3);


        AgeCategory.valueOf()
    }
}
