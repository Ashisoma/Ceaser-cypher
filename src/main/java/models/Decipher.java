package  models;

public class Decipher {
    private String encryptedMessage;
    private int key;
    String message = "hello";
    String decryptedMessage = " ";

    public Decipher(String encryptedMessage, int ShiftKey){
        this.encryptedMessage = encryptedMessage;
        this.key = ShiftKey;
    }


    public String getEncryptedMessage(){
        return this.encryptedMessage;
    }
    public int getKey(){
        return this.key;
    }

    // looping through variable letter,getting index of each character
    public String decryptMessage(){
          encryptedMessage.toLowerCase();

        for (int i = 0; i < message.length(); i++){
            int alphas = message.indexOf(message.charAt(i));
            int alphasIndex = (alphas - key) % 26;
            if (alphasIndex < 0)
            {
                alphasIndex = message.length() + alphasIndex;
            }
            char decryptedLetter= message.charAt(alphasIndex);
            decryptedMessage += decryptedLetter;
        }
        return decryptedMessage;
    }
}
