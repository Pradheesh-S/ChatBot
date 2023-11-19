import java.util.Scanner;
public class chatbot 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hi! I'm a simple chatbot. Type 'bye' to end the conversation.");
        while (true) 
        {
            System.out.println("You: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("bye")) 
            {
                System.out.println("Chatbot: Goodbye!");
                break;
            }
            String response = simpleChatbot(userInput);
            System.out.println("Chatbot: " + response);
        }
        scanner.close();
    }
    public static String simpleChatbot(String user_input) 
    {
        user_input = user_input.toLowerCase();
        if (user_input.contains("hello") || user_input.contains("hi")) 
        {
            return "Hello! How are you today?";
        }
        else if (user_input.contains("name")) 
        {
            return "I'm just a simple chatbot. What's your name?";
        }
        else if (user_input.contains("age")) 
        {
            return "I'm just born. What's your age?";
        }
        else if (user_input.contains("how are you")) 
        {
            return "I'm good, how are you?";
        }
        else 
        {
            return "I'm sorry, I didn't understand that. Can you please provide more information?";
        }
    }
}
