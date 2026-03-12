import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatbotGUI {

    private ChatbotEngine engine = new ChatbotEngine();

    public void createUI() {

        JFrame frame = new JFrame("AI Chatbot");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);

        JTextField userInput = new JTextField();

        JButton sendButton = new JButton("Send");

        sendButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String input = userInput.getText();

                chatArea.append("You: " + input + "\n");

                String response = engine.getResponse(input);

                chatArea.append("Bot: " + response + "\n\n");

                userInput.setText("");
            }
        });

        frame.setLayout(new BorderLayout());

        frame.add(new JScrollPane(chatArea), BorderLayout.CENTER);
        frame.add(userInput, BorderLayout.SOUTH);
        frame.add(sendButton, BorderLayout.EAST);

        frame.setVisible(true);
        userInput.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String input = userInput.getText();

                chatArea.append("You: " + input + "\n");

                String response = engine.getResponse(input);

                chatArea.append("Bot: " + response + "\n\n");

                userInput.setText("");
            }
        });
    }
}