import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        String inputText = "Hello";
        System.out.print(inputText);

        char [] chars =  inputText.toCharArray();
         for (char c : chars) {
             c +=1;
             System.out.print(c);
         }
    }
}
