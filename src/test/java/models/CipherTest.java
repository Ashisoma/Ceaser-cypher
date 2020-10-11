package models;
import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    Cipher testCypher = new Cipher("Hello", 2);

    @Test
    public void newCipher_getLetter_arrayIsString() {

        assertTrue(String.valueOf(true), testCypher instanceof Cipher);
    }

    @Test
    public void newCypher_checksKey() {
        assertEquals( 2, testCypher.getKey());
    }

    @Test
    public void newCipher_checksLetter() {

        assertEquals("Hello", testCypher.getLetters() );
    }

    @Test
    public void newCipher_checks_encryptedMessage() {
        assertEquals("yzabcdefghijklmnopqrstuvwx", testCypher.encryptMessage());
    }
}