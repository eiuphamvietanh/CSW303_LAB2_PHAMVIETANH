package BuilderPattern;
public class Client {
    public static void main(String[] args) {
        Contract contract1 = new Permanent();
        contract1.buildContractId("1510");
        contract1.buildPropertyId("111");
        contract1.buildTenantId("P101");
        contract1.buildRentAmount(1000);
        Contract signed1 = contract1.signContract();
        System.out.println(signed1);
        System.out.println("_________________");

        Contract contract2 = new LongTerm();
        contract2.buildContractId("1520");
        contract2.buildPropertyId("112");
        contract2.buildTenantId("P102");
        contract2.buildRentAmount(2000);
        Contract signed2 = contract2.signContract();
        System.out.println(signed2);
        System.out.println("_________________");

        Contract contract3 = new ShortTerm();
        contract3.buildContractId("1530");
        contract3.buildPropertyId("113");
        contract3.buildTenantId("P103");
        contract3.buildRentAmount(3000);
        Contract signed3 = contract3.signContract();
        System.out.println(signed3);
    }
}
