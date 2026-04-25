import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {
    public static void main (String[] args){
        Set<String> employeeIDs=new HashSet<>();
        employeeIDs.add("a111");
        employeeIDs.add("b111");
        employeeIDs.add("c111");
        employeeIDs.add("d111");
        employeeIDs.add("e111");
        System.out.println(employeeIDs);
        employeeIDs.add("w111");
        System.out.println(employeeIDs);

        System.out.println("a111:exists" + employeeIDs.contains("a111") );

        employeeIDs.remove("e111");
        System.out.println(employeeIDs);

        System.out.println("total employeeIDs:"+ employeeIDs.size());

        employeeIDs.clear();
        System.out.println(employeeIDs);
    }
}
