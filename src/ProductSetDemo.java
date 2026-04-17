import java.util.HashSet;
import java.util.Set;

public class ProductSetDemo {
    public static void main (String[] args){
        Set<String> ProductSetDemo = new HashSet<>();
        ProductSetDemo.add("aaa");
        ProductSetDemo.add("bbb");
        ProductSetDemo.add("ccc");
        ProductSetDemo.add("eee");
        ProductSetDemo.add("fff");

        System.out.println(ProductSetDemo);

        ProductSetDemo.add("ggg");
        System.out.println(ProductSetDemo);

    }
}
