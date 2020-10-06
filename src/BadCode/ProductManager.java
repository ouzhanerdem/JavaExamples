package BadCode;

public class ProductManager {

    public void add(Product product, int databaseType){
        //İş Katmanı


        if (databaseType == 1) {
            //Mysql
            MysqlProductDao mysqlProductDao = new MysqlProductDao("Mysql String");
            mysqlProductDao.add(product);
        }
        else if(databaseType ==2){
            //Oracle
            OracleProductDao oracleProductDao = new OracleProductDao("Orcacle String");
            oracleProductDao.add(product);

        }
        System.out.println("Ürün iş katmanı işlemleri");
        System.out.println("Ürün imi: " + product.getName());


    }
}
