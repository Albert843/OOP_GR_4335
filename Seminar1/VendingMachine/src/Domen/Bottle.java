package Domen;
public final class Bottle extends Product {
    private int volume;
    /**
     *  Class Bottle
     * @param productId         Id продукта
     * @param productName       имя продукта
     * @param productCategory   тип продукта
     * @param price             цена
     * @param volume            объем в миллилитрах
     */
    public Bottle(int productId, String productName, String productCategory, double price, int volume){
        super(productId, productName, productCategory, price);
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Product{"+"name='"+super.getProductName()+'\''+
                "category='"+super.getProductCategory()+'\''+
                ",cost="+super.getPrice()+'\''+
                ",volume="+volume+'}';
    }
}
