import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Instructions {
    public static void main(String[] args) {

        Map<Integer, String> bLCharas = new HashMap<Integer, String>();
        bLCharas.put(1, " Yuzuru");
        bLCharas.put(2, " Satomi");
        bLCharas.put(3, " Drarry");
        bLCharas.put(4, " Skeleton Dance");
        bLCharas.put(5, " FrostIron");
        bLCharas.put(6, " SpideyPool");


        System.out.println(bLCharas);

        System.out.println( bLCharas.containsKey(5) );
        System.out.println( "\n" + bLCharas.get(4));
        System.out.println( bLCharas.size());
        System.out.println( bLCharas.entrySet());

        //poiPoisBL is just a variable name to store the iterator
        System.out.println("====================================== ITERATOR LOOP BELOW =============================");
        Iterator<Map.Entry<Integer, String>> poiPoisBL = bLCharas.entrySet().iterator();
        while(poiPoisBL.hasNext()){
            Map.Entry<Integer, String> entry = poiPoisBL.next();
            System.out.println("Key: " + entry.getKey() + "  | Value : " + entry.getValue());
        }

        System.out.println("===============================================================================");

        String shipOne = "IronStucky";
        String shipTwo = "Thorki";
        String shipThree = "Snarry";
        String shipFour = "Koisuru Bouken14";

        String a = String.format("%, d", 1000000000);//ADDED COMMAS can only go to 1 billion
        System.out.printf(a);

        //--------------------------------------
        System.out.printf("%b %n %s %s %n %s %n", shipFour, shipThree, shipTwo, shipOne);
        //%b = if null false if nun-null true I GOT TITLE SUPER NEGRO FOR CODE ABOVE

        System.out.println("==================================");
        System.out.printf("%b %s %n %s %s", shipFour, shipThree, shipTwo, shipOne);

    }



    }




/*
    Hashmap lab phone book

* Create a PhoneBook class that holds names and phone numbers.

* You can use an associative data type (one which stores items as keys paired with values).

* Hint: You should use a  map.

* Your PhoneBook class should have the following method
//  ---------------------------------  * addUser(String name, String phoneNumber)
//     -------------------------------     - adds an entry to the composite associate data type
//     ------------------------------- * removeAUser(String name)
//      ---------------------------------  -  removes an entry to the composite associate data type
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










    */


