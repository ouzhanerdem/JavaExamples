package GoodCode;

public class ProductManager {
    private BaseProductDao baseProductDao;

    public ProductManager(BaseProductDao baseProductDao) {
        this.baseProductDao = baseProductDao;
    }

    public void add(Product product){
        //İş Katmanı
        baseProductDao.add(product);
        System.out.println("Ürün iş katmanı işlemleri");
        System.out.println("Ürün imi: " + product.getName());


    }

}
