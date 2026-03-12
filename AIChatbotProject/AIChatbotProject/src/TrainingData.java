import java.util.HashMap;
import java.util.Map;

public class TrainingData {

    public static Map<String, String> getResponses() {

        Map<String, String> responses = new HashMap<>();

        responses.put("hello", "Hello! How can I help you?");
        responses.put("hi", "Hi there! What can I do for you?");
        responses.put("how are you", "I am just a chatbot, but I'm doing great!");
        responses.put("your name", "I am a Java AI Chatbot.");
        responses.put("java", "Java is a popular programming language.");
        responses.put("bye", "Goodbye! Have a great day.");
        responses.put("help", "You can ask me about Java, programming or greetings.");
        responses.put("What is Ai", " tell me about Ai");
//        responses.put("ai", "Artificial Intelligence means machines that can think and learn.");
//        responses.put("good morning", "Good morning! How can I assist you?");
        responses.put("who are you", "I am an AI chatbot created in Java.");
//        responses.put("programming", "Programming is the process of writing instructions for computers.");


        responses.put("ai", "Artificial Intelligence means machines that can learn and think.");
        responses.put("machine learning", "Machine learning is a part of AI.");
        responses.put("programming", "Programming means writing instructions for computers.");
        responses.put("who created you", "I was created using Java programming.");
        responses.put("good morning", "Good morning! How can I help you?");
        responses.put("good evening", "Good evening! How can I assist you?");
        responses.put("thank you", "You're welcome!");

        return responses;
    }
}