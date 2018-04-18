package hashmapPhoneBook;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {


    Map<String, String> contacts = new HashMap<String, String>();

    public Map<String, String> getContacts() {
        return contacts;
    }


    public void addUser(String name, String phoneNumber) {
        contacts.put(name, phoneNumber); //.put ( K key, V value) -- adds things to hashmap
    }


    public void removeAUser(String name) {
        contacts.remove(name);  //.remove (Object key) -- name is the key? removes name AND number???
    }


    public String lookupAUser(String name) {
        return contacts.get(name);  //.get (Object Key) -- again name is the key???? gets key/gives name & number or just number
    } //need it to jus give number


    public String reverseLookUpAUser(String phoneNumber) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return entry.getKey();
            }
        }
        return "";
    }

}
