package OOPs.OOPs3.DataHiding;

public class Bank {
    public static void main(String[] args) {
        Account a = new Account(1234, 10000, 7143);
        System.out.println(a.accountID);
//        System.out.println(a.balance);                                          // Private member accessed.
        System.out.println(a.getBalance());
//        System.out.println(a.pin);                                              // Private member accessed.
        a.addBalance(5000);
        System.out.println(a.getBalance());
    }
}
