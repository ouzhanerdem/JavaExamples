package GoodCode;

public class OracleProductDao extends BaseProductDao{
    public OracleProductDao(String connectionString) {
        super(connectionString);
    }

    @Override
    public void add(Product product) {
        System.out.println("Oracle ürün database ürün eklendi : " + product.getName());
    }
}
