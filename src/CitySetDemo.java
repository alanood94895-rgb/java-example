import java.util.HashSet;
import java.util.Set;

public class CitySetDemo {

    public static void main (String[] args){
        Set<String> CitySetDemo=new HashSet<>();

        CitySetDemo.add("nizwa");
        CitySetDemo.add("Salalh");
        CitySetDemo.add("Muscat");
        CitySetDemo.add("izki");
        CitySetDemo.add("Bahla");
        System.out.println(CitySetDemo);
        CitySetDemo.add("sohar");
        System.out.println(CitySetDemo);

        System.out.println("Salalh exists:" +CitySetDemo.contains ("Salalh"));

        CitySetDemo.remove("Sohar");
        System.out.println(CitySetDemo);

    }
}
