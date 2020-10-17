
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
public class mapEntry {
    HashMap<String, String> map;
    Scanner scanner;

    public mapEntry(){
        this.scanner = new Scanner(System.in);
        this.map = new HashMap<String, String>();
    }

    public void add_pair(String key, String value){
        this.map.put(key, value);
    }

    public String search_make(String model){
        Set<Map.Entry<String, String>> cars_set = map.entrySet();
        for (Map.Entry<String, String> entry : cars_set) {
            if (entry.getValue().equals(model)) {
                return entry.getKey();
            }
        }
        return null;
    }


    public static void main(String[] args) {
        mapEntry cars = new mapEntry();
        cars.add_pair("subaru", "impreza");
        cars.add_pair("toyato", "rav4");
        cars.add_pair("honda", "odyssey");
        cars.add_pair("mercedez", "benz");
        cars.add_pair("audi", "R8");
        
        Scanner new_scanner = new Scanner(System.in);
        System.out.print("Enter the car model you are looking for:");
        String my_model = new_scanner.nextLine();
        String my_make = cars.search_make(my_model);
        System.out.printf("Oh you're looking for %s! Here's what we've got: %s %s\n", my_model, my_make, my_model);
    }
}
