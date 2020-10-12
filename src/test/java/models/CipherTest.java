package models;
import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    Cipher testCypher = new Cipher("Hello", 2);

    @Test
    public void newCipher_getMessage_IsString() {

        assertTrue(testCypher instanceof Cipher);
    }

    @Test
    public void newCypher_checksKey() {
        assertEquals( 2, testCypher.getKey());
    }

    @Test
    public void newCipher_checksFor_getMessage() {

        assertEquals("Hello", testCypher.getMessage() );
    }

    @Test
    public void newCipher_checks_encryptedMessage() {
        assertEquals("cdefghijklmnopqrstuvwxyzab", testCypher.encryptMessage());
    }
}