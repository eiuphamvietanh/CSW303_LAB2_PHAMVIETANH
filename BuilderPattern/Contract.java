package BuilderPattern;
public interface Contract {
    void buildContractId(String contractId);
    void buildPropertyId(String propertyId);
    void buildTenantId(String tenantId);
    void buildRentAmount(double rentAmount);
    Contract signContract();
}
