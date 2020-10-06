package BadCode;

public class MysqlProductDao {
    private String connectionString;

    public MysqlProductDao(String connectionString) {
        this.connectionString = connectionString;

    }

    public void add(Product product) {
        System.out.println("MySql Database :" + product.getName() + " eklendi.");
    }
}

