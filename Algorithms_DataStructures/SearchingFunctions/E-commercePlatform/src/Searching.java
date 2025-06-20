public class Searching {
    public static Product linearSearch(Product[] products,int id){
        int n = products.length;
        for(int i=0;i<n;i++){
            if(products[i].productId==id) return products[i];
        }

        return new Product();
    }

    public static Product binarySearch(Product[]products , int id){
        int s = 0 , e = products.length-1;

        while(s<=e){
            int mid =  s+(e-s)/2;

            if(products[mid].productId==id){
                return products[mid];
            }else{
                if(products[mid].productId>id){
                    e = mid-1;
                }else if(products[mid].productId<id){
                    s = mid+1;
                }
            }
        }
        return new Product();
    }

    public static void main(String[] args) throws Exception {
        
        String[] names = {"a","b","c","d","e","f","g","h","i","j"};
        int[] category = {1,1,2,3,3,3,5,4,4,7};
        Product[] products = new Product[10];
        for(int i=1;i<=10;i++){
            Product product = new Product(i, names[i-1], category[i-1]);
            products[i-1] = product;
        }
        System.out.println("LinearSearch:");
        System.out.println(linearSearch(products,4));
        System.out.println("Binary Search:");
        System.out.println(binarySearch(products, 4));
        
    }
}

