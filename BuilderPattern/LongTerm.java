package BuilderPattern;

public class LongTerm implements Contract {
    private String contractId;
    private String propertyId;
    private String tenantId;
    private double rentAmount;

    @Override
    public void buildContractId(String contractId) {
        this.contractId = contractId;
    }

    @Override
    public void buildPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    @Override
    public void buildTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public void buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public Contract signContract() {
        System.out.println("Contract signed: " + contractId);
        return this;
    }

    @Override
    public String toString() {
        return "Long Term Contract: " + "\n" +
                "contractId=" + contractId + "\n" +
                "propertyId=" + propertyId + "\n" +
                "tenantId=" + tenantId + "\n" +
                "rentAmount=" + rentAmount;
    }
}
