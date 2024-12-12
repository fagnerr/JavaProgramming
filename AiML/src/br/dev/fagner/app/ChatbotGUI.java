package br.dev.fagner.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Chatbot Implementation
public class ChatbotGUI {
 private NLPProcessor nlpProcessor;
 private SimpleLearner simpleLearner;
 private Scanner scanner;

 public ChatbotGUI() {
     nlpProcessor = new NLPProcessor();
     simpleLearner = new SimpleLearner();
     scanner = new Scanner(System.in);
 }

 public void start() {
     System.out.println("Chatbot: Hello! I am your intelligent chatbot. Let's chat!");
     while (true) {
         System.out.print("You: ");
         String userInput = scanner.nextLine();

         if (simpleLearner.hasLearned(userInput)) {
             System.out.println("Chatbot: " + simpleLearner.getLearnedResponse());
         } else {
             String response = nlpProcessor.processInput(userInput);
             System.out.println("Chatbot: " + response);

             if (!simpleLearner.hasLearned(userInput) && !response.equals("Goodbye! Have a great day!")) {
                 simpleLearner.learnPhrase(userInput);
             }
         }

         if (userInput.equalsIgnoreCase("bye")) {
             break;
         }
     }
 }

 public static void main(String[] args) {
     ChatbotGUI chatbot = new ChatbotGUI();
     chatbot.start();
 }
}

// NLP Utilities
class NLPProcessor {
    private List<String> greetings;
    private List<String> farewells;
    private List<String> unknownResponses;

    public NLPProcessor() {
        // Initialize the lists with some sample data
        greetings = new ArrayList<>();
        farewells = new ArrayList<>();
        unknownResponses = new ArrayList<>();

        // Greetings
        greetings.add("hello");
        greetings.add("hi");
        greetings.add("hey");
        greetings.add("good morning");
        greetings.add("good evening");

        // Farewells
        farewells.add("bye");
        farewells.add("goodbye");
        farewells.add("see you");
        farewells.add("farewell");

        // Unknown responses
        unknownResponses.add("I'm sorry, I don't understand that.");
        unknownResponses.add("Can you rephrase that?");
        unknownResponses.add("I'm not sure how to respond to that.");
    }

    public String processInput(String input) {
        input = input.toLowerCase();
        if (isGreeting(input)) {
            return "Hello! How can I assist you today?";
        } else if (isFarewell(input)) {
            return "Goodbye! Have a great day!";
        } else {
            return getUnknownResponse();
        }
    }

    private boolean isGreeting(String input) {
        for (String greeting : greetings) {
            if (input.contains(greeting)) {
                return true;
            }
        }
        return false;
    }

    private boolean isFarewell(String input) {
        for (String farewell : farewells) {
            if (input.contains(farewell)) {
                return true;
            }
        }
        return false;
    }

    private String getUnknownResponse() {
        int randomIndex = (int) (Math.random() * unknownResponses.size());
        return unknownResponses.get(randomIndex);
    }
}

// Machine Learning Simulation for Learning
class SimpleLearner {
    private List<String> learnedPhrases;

    public SimpleLearner() {
        learnedPhrases = new ArrayList<>();
    }

    public void learnPhrase(String phrase) {
        learnedPhrases.add(phrase);
    }

    public boolean hasLearned(String phrase) {
        return learnedPhrases.contains(phrase);
    }

    public String getLearnedResponse() {
        if (learnedPhrases.isEmpty()) {
            return "I haven't learned much yet, but I'm eager to learn!";
        } else {
            return "I've learned something new! Ask me about what I've learned.";
        }
    }
}

