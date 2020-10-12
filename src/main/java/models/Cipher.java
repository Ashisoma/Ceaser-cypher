package models;

public class Cipher {
    private String message;
    private int key;

    public Cipher(String message, int key) {
        this.message = message;
        this.key = key;

    }

    public int getKey(){
        return key;
    }

    public String getMessage() {
        return message;
    }
    public String encryptMessage(){
        String encryptMessage = "";
        String message = "abcdefghijklmnopqrstuvwxyz";
        String encryptedMessage = message.toLowerCase();
        for (int i = 0; i<encryptedMessage.length(); i++){
            int alphas = message.indexOf(encryptedMessage.charAt(i));
            int alphaText = (alphas + key) %26;
            char encyptionAlphas = message.charAt(alphaText);
            encryptMessage += encyptionAlphas;
        }
         return encryptMessage;
    }
}
