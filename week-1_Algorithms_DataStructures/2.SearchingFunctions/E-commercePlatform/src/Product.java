public class Product {
    int productId;
    String productName;
    int category;

    Product(){
        
    }

    Product(int id, String name,int category){
        productId = id;
        productName = name;
        this.category = category;
    }

    public String toString(){
        return "Id:"+ productId+" Name:"+productName+" category:"+category;
    }

}
