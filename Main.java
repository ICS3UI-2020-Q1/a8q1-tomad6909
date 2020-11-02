import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JLabel firstLabel;
  JTextField firstInput;
  JButton helloButton;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Hello");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(1000,800);
    // shows the window
    frame.setVisible(true);

    mainPanel = new JPanel();

    mainPanel.setLayout(null);



    firstLabel = new JLabel();

    firstLabel.setBounds(330, 300, 200, 120);


    firstInput = new JTextField();

    firstInput.setBounds(330, 200, 300, 130);


    helloButton = new JButton("Say Hello");

    helloButton.setBounds(350, 400, 250, 120);

    helloButton.addActionListener(this);


    mainPanel.add(firstLabel);
    mainPanel.add(firstInput);
    mainPanel.add(helloButton);
 
    
    frame.add(mainPanel);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
    if(command.equals("Say Hello")){
      String firstText = firstInput.getText();

      System.out.println(firstLabel + firstText);

      firstLabel.setText("Hello" + firstText);
    }
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
