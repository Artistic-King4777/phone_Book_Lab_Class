package hashmapPhoneBook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        PhoneBook directory = new PhoneBook(); //don't need more then one phone book




        directory.addUser("Yuzuru", "(666) 655-3233");
        directory.addUser("Satomi", "(332) 224-5411");
        directory.addUser("Tonsukeru", "(444) 313-6669");
        directory.addUser("Malfoy", "(123) 456-8790");
        System.out.println(directory);

        directory.removeAUser("Tonsukeru");
        System.out.println("My List of contacts is: " + "\n" + directory);
        System.out.println("============================== SPACING ============================" + "\n");


        directory.lookupAUser("Malfoy");
        System.out.println("Your search yielded this #: " + directory.lookupAUser("Malfoy"));
        System.out.println("============================== SPACING ============================" + "\n");


        directory.reverseLookUpAUser("(666) 655-3233");
        System.out.println("The contact for this # is: " + directory.reverseLookUpAUser("(666) 655-3233"));
        System.out.println("============================== SPACING ============================" + "\n");


    //end of psvm
    }
}



/**     <-- another type of comment out

Hashmap lab phone book

* Create a PhoneBook class that holds names and phone numbers.

* You can use an associative data type (one which stores items as keys paired with values).

* Hint: You should use a  map.

* Your PhoneBook class should have the following method
    * addUser(String name, String phoneNumber)
          - adds an entry to the composite associate data type
    * removeAUser(String name)
        -  removes an entry to the composite associate data type
    * lookupAUser(String name)
         - returns a phone number for the respective input name
    * reverseLookupAUser(String phoneNumber)
        -  returns a name for the respective input phoneNumber



        In Main do the following

• Add a few users with your addUser(String name, String phoneNumber) Method!
• Look up one of the users with your lookupAUser(String name) Method
• Remove a user with your removeAUser(String name) Method/Method
• Look up a user by their phone number with your reverseLookupAUser(String phoneNumber) Method
• Print out all your users with the listAllEntries() Method

**/


        /*
        iterator/ for each loop /and logic


        Reverse Loop Up
        <Key, Value> key- name, /// value-phonenum
        Public string reverseLookup(String Value)
           take in a value and return a key
           go throo list of key/value
           loop /check if something is something
           print out if it matches

           only return name
           loop throo
           get cvalue or key
           check things that are strings
         */