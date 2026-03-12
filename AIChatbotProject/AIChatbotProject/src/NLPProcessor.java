//public class NLPProcessor {
//
//    public static String processInput(String input) {
//
//        input = input.toLowerCase().trim();
//
//        return input;
//    }
//}


 public class NLPProcessor {

  public static String processInput(String input) {

        input = input.toLowerCase();
        input = input.replaceAll("[^a-zA-Z ]", ""); // punctuation remove
        input = input.trim();

        return input;
    }
}