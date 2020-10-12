import models.Decipher;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecipherTest {
    Decipher testDecipher = new Decipher("hi",3);
    @Test
    public void newDecipher_arrayIsString() {
        assertEquals(true, testDecipher instanceof Decipher);
    }
    @Test
    public void newDecipher_getMessage_isString(){
        assertEquals("hi",testDecipher.getEncryptedMessage());
    }

    @Test
    public void newDecipher_checksFor_getKey() {
    assertEquals(3, testDecipher.getKey());
    }
    @Test
    public void newDecipher_checksFor_decryptionMessage(){
        assertEquals(" llooe", testDecipher.decryptMessage());
    }
}