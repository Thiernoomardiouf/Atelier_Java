import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class CollectionMap {
 
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<String, String>();
 
        phonebook.put("77 468 44 96", "Thierno");
        phonebook.put("78 655 66 33", "Rokhaya");
        phonebook.put("77 535 26 88", "Eva");
        phonebook.put("78 666 53 66", "Papa");
        
        Set<String> phoneNumbers = phonebook.keySet();
 
        for (String phoneNumber : phoneNumbers) {
            String name = phonebook.get(phoneNumber);
            
            System.out.println("Phone Number: " + phoneNumber + " ==> Name: " + name);
        }
    }
}