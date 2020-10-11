package models;

public class Cipher {
    private String letters ;
    private int key;

    public Cipher(String letters, int key) {
        this.letters = letters;
        this.key = key;

    }

//
//    public Cipher encryptsLetters(String letters, int key){
//        this.letters = letters;
//        this.key = key;
//
//        return null;
//    }
    public int getKey(){
        return key;
    }

    public String getLetters() {
        return letters;
    }
    public String encryptMessage(){
        String encryptMessage = "";
        String message = "abcdefghijklmnopqrstuvwxyz";
        char [] alphas = message.toCharArray();
        String[] alphaText = message.toLowerCase().split("");
        for(String a: alphaText){
            if (alphas[message.indexOf(a)] == ' ') {
                encryptMessage += (' ');
            } else {
                if (message.indexOf(a) - key < 0) {
                    encryptMessage += alphas[message.indexOf(a) + (26 - key)];
                } else {encryptMessage += alphas[message.indexOf(a) - key];
                }
            }
        }
         return encryptMessage;
    }
// if (index of a is greater than 26);
    // persons += alphas(message.indexOf (a) + (26-key);
    // if (index of a - key is less than 0);
    /// persons += alphas(message.indexOf(a) - key;
}
