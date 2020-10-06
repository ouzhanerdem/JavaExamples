package GoodCode;

public class Main {
    public static void main(String[] args){
        BaseProductDao baseProductDao = new OracleProductDao("Oracle String");
        BaseProductDao baseProductDao1 = new MySqlProductDao("MySqlConnection");
        //baseProductDao.add(new Product(1,"sU",2));
        ProductManager productManager = new ProductManager(baseProductDao1);
        productManager.add(new Product(2,"Çikolata",3));



    }
}
