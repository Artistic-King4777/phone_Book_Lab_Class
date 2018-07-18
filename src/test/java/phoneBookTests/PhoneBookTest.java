package phoneBookTests;


import hashmapPhoneBook.PhoneBook;
import org.junit.Assert;
import org.junit.Test;


public class PhoneBookTest {

    // NAMES OF TESTS and WHAT METHODS TO TEST:
    // TODO - addTest()             ---- DONE
    // TODO - lookUpTest()          ---- DONE
    // TODO - removeTest()          ---- DONE
    // TODO - listAllEntriesTest    ---- DONE
    // TODO - reverseLookUpTest()   ---- DONE

    @Test
    public void addTest() {

        // Given (I have a phonebook )
        PhoneBook directory = new PhoneBook();


        // When ( I add new contacts)
        String number = "(123) 456-8790"; //expected goes b4 an action
        directory.addUser("MalfoyP", "(123) 456-8790");

        // Then (I expect to be to confirm i added them by looking them up)

        String lookUp = directory.lookupAUser("MalfoyP");

        Assert.assertEquals(number, lookUp);
    }

    @Test
    public void lookUpTest() {

        // Given (I have a phonebook )
        PhoneBook directory = new PhoneBook();


        // When ( I add new contacts)
        String givenNumber = "(666) 655-3233)";
        directory.addUser("Yuzuru", "(666) 655-3233)");

        // Then (I expect to be able to look up the contact)

        String actualLookUp = directory.lookupAUser("Yuzuru");
        Assert.assertEquals(givenNumber, actualLookUp);
    }





    @Test
    public void removeTest() {
        // Given (I have a phoneBook and contacts)
        PhoneBook directory = new PhoneBook();
        directory.addUser("Satomi", "(332) 224-5411");

        // When (I remove the contact)
        String givenName = null;
        directory.removeAUser("Satomi");

        // Then (I expect to not find them)

        String actualLookUp = directory.lookupAUser("Satomi");

        Assert.assertEquals(givenName, actualLookUp);
    }


    @Test
    public void listAllEntriesTest() {
        // Given (I have a phoneBook and contacts)
        PhoneBook directory = new PhoneBook();
        directory.addUser("Yuzuru", "(666) 655-3233");
        directory.addUser("Satomi", "(332) 224-5411");

        // When (I )
        String givenUserOne = "Yuzuru = (666) 655-3233";
        String givenUserTwo = "Satomi = (332) 224-5411";
        String expected = givenUserOne + "\n" + givenUserTwo + "\n";

        // Then (I expect to not find them)
        String actualLookUp = directory.listAllEntries();

        Assert.assertEquals(expected, actualLookUp);
    }

    @Test
    public void reverseLookUpTest() {
        // Given (I have a phoneBook and contacts)
        PhoneBook directory = new PhoneBook();
        directory.addUser("Tonsukeru", "(444) 313-6669");

        // When (I lookUp the contacts phoneNumber)
        String givenName = "Tonsukeru";
        String actualName = directory.reverseLookUpAUser("(444) 313-6669");

        // Then (I expect to get their name)
        Assert.assertEquals(givenName, actualName);
    }


}
