import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, I'm your chat bot. What's your name?");
        String name = scanner.nextLine();

        System.out.println("Nice to meet you, " + name + "! How can I help you today?");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye, " + name + "!");
                break;
            }

            String botResponse = getBotResponse(userInput);
            System.out.println(botResponse);
        }
    }

    private static String getBotResponse(String userInput) {
        String botResponse = "";

        if (userInput.contains("hello") || userInput.contains("hi")) {
            botResponse = "Hi there!";
        } else if (userInput.contains("how are you")) {
            botResponse = "I'm good, thanks for asking!";
        } else if (userInput.contains("what's your name")) {
            botResponse = "My name is Chat Bot!";
        } else if (userInput.contains("what time is it")) {
            botResponse = "Sorry, I don't have access to the system time.";
        } else {
            botResponse = "I'm sorry, I didn't understand what you said.";
        }

        return botResponse;
    }
}