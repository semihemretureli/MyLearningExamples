import java.util.ArrayList;

public class ArrayListWithClaa {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();


        customers.add(new Customer(1,"Engin","Demiroğ"));
        customers.add(engin);
        customers.add(new Customer(1,"Derin","Demiroğ"));
        customers.add(new Customer(1,"Salih","Demiroğ"));

        customers.remove(new Customer(1,"Engin","Demiroğ"));

        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
