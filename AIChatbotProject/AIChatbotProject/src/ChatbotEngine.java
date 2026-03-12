//import java.util.Map;
//
//public class ChatbotEngine {
//
//    Map<String, String> responses;
//
//    public ChatbotEngine() {
//        responses = TrainingData.getResponses();
//    }
//
//    public String getResponse(String input) {
//
//       input = NLPProcessor.processInput(input);
//
//        for (String key : responses.keySet()) {
//
//            if (input.contains(key)) {
//                return responses.get(key);
//            }
//        }
//
//        return "Sorry, I don't understand that.";
//    }
//}


import java.util.Map;

public class ChatbotEngine {

    Map<String, String> responses;

    public ChatbotEngine() {
        responses = TrainingData.getResponses();
    }

    public String getResponse(String input) {

        input = NLPProcessor.processInput(input);

        for (String key : responses.keySet()) {

            if (input.contains(key)) {
                return responses.get(key);
            }
        }

        return "I am not sure about that. Can you ask something else?";
    }
}