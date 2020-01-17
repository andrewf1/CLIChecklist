import java.util.*;

public class Checklist {
    private String name;
    private int numItems;
    private HashMap<String, Boolean> list;

    Checklist(String name_i) {
        this.name = new String(name_i);
        this.list = new HashMap<String, Boolean>();
        this.numItems = 0;
    }

    public void addAnItem(String item) throws Exception {
        if(this.containsItem(item)) {
            throw new Exception("Item already exists.");
        } 
        this.numItems++;
        list.put(item, false);
    }

    public void show() {
        for (String key : list.keySet()) {
            System.out.println(
                "item\t\tcompleted\n" +
                "---------------------" +
                key + // prints the item
                "\t\t" +
                list.get(key) + // prints whether it is completed or not
                "\n"
            );
        }
    }

    private boolean containsItem(String item) {
        Iterator<Map.Entry<String, Boolean>> // new iterator for hash map
            iter = list.entrySet().iterator();

        while (iter.hasNext()) { // checking every entry's key in hashmap
            Map.Entry<String, Boolean> entry = iter.next();

            if (item == entry.getKey()) {
                return true;
            }
        }

        return false;
    }
}