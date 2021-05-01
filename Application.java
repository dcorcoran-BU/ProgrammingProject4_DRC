/**
*@author Daniel
*This program is a travel agent chatbot that can help you find a vacation destination.
*The user must begin by saying on of these phrases "hello", "hi", "hola", or "bonjour".
*The program will come alive and ask the user a series of questions.
*By the time all the questions are answered you will have a vactaion spot and a flight.
*
*
*
*/
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
// class chatbot that holds the frame work for the chatbot and also the if thens
class Chatbot extends JFrame {
	 

		

	 	 private JTextArea ta = new JTextArea();
	 	 private JTextField tf = new JTextField();
	 	 private JButton b = new JButton();
	 	 private JLabel l = new JLabel();
	 

//empty constructor for chatbot to set the frame
	 	 Chatbot(){
	 	 	 JFrame f = new JFrame();
	 	 	 f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	 	 	 f.setVisible(true);
	 	 	 f.setResizable(true);
	 	 	 f.setLayout(null);
	 	 	 f.setSize(2000, 575);
	 	 	 f.getContentPane().setBackground(Color.cyan);
	 	 	 f.setTitle("Danny's ChatBot");
	 	 	 f.add(ta);
	 	 	 f.add(tf);
	 	 	 ta.setSize(2000, 500);
	 	 	 ta.setLocation(1, 1);
	 	 	 ta.setBackground(Color.BLACK);
	 	 	 tf.setSize(300, 40);
	 	 	 tf.setLocation(2, 500);	 	 	 f.add(b);
	 	 	 l.setText("SEND");
	 	 	 b.add(l);
	 	 	 b.setSize(400, 40);
	 	 	 b.setLocation(300, 500);
		

	 	 	 b.addActionListener( new ActionListener() {
	 	 	 @Override
	 	 	 	 public void actionPerformed(ActionEvent e) {
							

	 	 	 	 	 //this gets the text entered into the chat field	 	 

					

	 	 	 	 	 if(e.getSource()==b) {
	 	 	 	 		 //sets everything to lower case so the user can enter capitalization and it won't affect the program 
	 	 	 	 	 	 String text = tf.getText().toLowerCase();
	 	 	 	 	 	 ta.setForeground(Color.BLUE);
	 	 	 	 	 	 ta.append("You-->"+text+"\n");
	 	 	 	 	 	 tf.setText("");
					

						

					 //hierarchy of if thens to get down to a final solution.	 

	 	 	 	 	 if(text.contains("hello") || text.contains("hi") ||text.contains("hola") || text.contains("bonjour")) {
	 	 	 	 	 	 replyMeth("Hello, would you like to travel in the states or abroad");
				

	 	 	 	 	 }else if(text.contains("in the states") || text.contains("the states") || text.contains("states")){
	 	 	 	 	 	 replyMeth("Ok in the states it is! Do you want to go somewhere warm or cool?");
					

	 	 	 	 	 }else if(text.contains("warm") || text.contains("someplace warm")) {
	 	 	 	 	 	 replyMeth("I like warm weather too! Would you like to travel to the South or West?");
					

	 	 	 	 	 }else if(text.contains("the south") || text.contains("south")) {
						

	 	 	 	 	 	 replyMeth("Ok here are some popular states to visit in the south. Where do you want to go, Atlanta, Florida, Georgia?");
					

	 	 	 	 	 }else if(text.contains("atlanta")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Atlanta! Do you need help finding flights?");	 

					

	 	 	 	 	 }else if(text.contains("florida")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Flordia! Do you need help finding flights?");
					
	 	 	 	 	 }else if(text.contains("georgia")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Georgia! Do you need help finding flights?");
					

	 	 	 	 	 }else if(text.contains("west") || text.contains("the west")) {
	 	 	 	 	 	 replyMeth("Ok here are some popular places to visit in the west. Where do you want to go, California, Nevada, Arizona?");
					

	 	 	 	 	 }else if(text.contains("california")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in California! Do you need help finding flights?");
					

	 	 	 	 	 }else if(text.contains("nevada")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Nevada! Do you need help finding flights?");
					

	 	 	 	 	 }else if(text.contains("arizona")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Arizona! Do you need help finding flights?");
					

	 	 	 	 	 }else if(text.contains("cool")) {
	 	 	 	 	 	 replyMeth("I like cool weather also! Would you like to travel to the North or EastCoast?");
					

	 	 	 	 	 }else if(text.contains("north") || text.contains("the north")) {
	 	 	 	 	 	 replyMeth("Ok here are some popular states to travel to in the north. Where do you want to go, Wisconson, Indiana, or Iowa?");
					

	 	 	 	 	 }else if(text.contains("wisconson")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Wisconson! Do you need help finding flights?");
					

	 	 	 	 	 }else if(text.contains("indiana")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Indiana! Do you need help finding flights?");
					

	 	 	 	 	 }else if(text.contains("iowa")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Michigan! Do you need help finding flights?");
					

	 	 	 	 	 }else if(text.contains("eastcoast") || text.contains("the east") || text.contains("east") || text.contains("the eastcoast")) {
	 	 	 	 	 	 replyMeth("Ok here are some popular places to visit on the eastcoast. Where do you want to go, Rhode Island, Maine, or Delaware?");
					

	 	 	 	 	 }else if(text.contains("rhode island")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Rhode Island! Do you need help finding flights?");
					

	 	 	 	 	 }else if(text.contains("maine")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in North Carolina! Do you need help finding flights?");
					

	 	 	 	 	 }else if(text.contains("delaware")) {	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Delaware! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("abroad")) {
	 	 	 	 	 	 replyMeth("Do you want to go somewhere hot or cold?");
	 	 	 	 	 }else if(text.contains("hot")) {
	 	 	 	 	 	 replyMeth("Ok good choice. Do you want to go to Europe, Africa, or Australia");
	 	 	 	 	 }else if(text.contains("europe")) {
	 	 	 	 	 	 replyMeth("Ok Europe is a great place to go, here are the most popular countries for tourists, Spain, France, or Italy?");
	 	 	 	 	 }else if(text.contains("spain")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Spain! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("france")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in France! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("italy")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Italy! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("africa")) {
	 	 	 	 	 	 replyMeth("Ok, here is a list of the most popular places to visit in Africa, which sounds the best? Egypt, Morocco, or Rwanda");
	 	 	 	 	 }else if(text.contains("egypt")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Egypt! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("morocco")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Morocco! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("rwanda")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Rwanda! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("australia")) {
	 	 	 	 	 	 replyMeth("Australia is a great place to visit where would you like to go, Sydney, Melbourne, or Perth?");
	 	 	 	 	 }else if(text.contains("sydney")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Sydney! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("melbourne")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Melbourne! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("perth")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Perth! Do you need help finding flights?");
					

	 	 	 	 	 }else if(text.contains("cold")) {
	 	 	 	 	 	 replyMeth("There are many cold places to visit. Where do you want to go, South America, Asia, or Antartica?");
	 	 	 	 	 }else if(text.contains("asia")) {
	 	 	 	 	 	 replyMeth("Ok here are some popular vacation spots in Asia. Russia or Mongolia");
	 	 	 	 	 }else if(text.contains("russia")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Russia! Do you need help finding flights?");	 	 	 	 	 }else if(text.contains("mongolia")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in China! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("antartica")) {
	 	 	 	 	 	 replyMeth("Antartica is a hard place to travel to but good luck!");
	 	 	 	 	 }else if(text.contains("s america")) {
	 	 	 	 	 	 replyMeth("South America is a great place to visit, where do you want to go, Argentina, Uruguay, Paraguay?");
	 	 	 	 	 }else if(text.contains("argentina")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Argentia! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("uruguay")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Uraguay! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("paraguay")) {
	 	 	 	 	 	 replyMeth("I'm happy I could help you find a travel location, have fun in Paraguay! Do you need help finding flights?");
	 	 	 	 	 }else if(text.contains("yes") || text.contains("yes please")) {
	 	 	 	 	 	 replyMeth("Ok I can help you get a flight! How many bags do you have?");
	 	 	 	 	 }else if(text.contains("no") || text.contains("no thanks")) {
	 	 	 	 	 	 replyMeth("Ok have a good rest of your day!");
	 	 	 	 	 }else if(text.contains("1")) {
	 	 	 	 	 	 replyMeth("Ok 1 bag(s)");
	 	 	 	 	 }else if(text.contains("2")) {
	 	 	 	 	 	 replyMeth("Ok 2 bag(s)");
	 	 	 	 	 }else if(text.contains("3")) {
	 	 	 	 	 	 replyMeth("Ok 3 bag(s)");
	 	 	 	 	 }else if(text.contains("4")) {
	 	 	 	 	 	 replyMeth("Ok 4 bag(s)");	 

	 	 	 	 	 }else { 
	 	 	 	 	 	 replyMeth("I'm sorry I did't understand that, please try again!");
	 	 	 	 	 }
						

				

	 	 	 	 }
	 	 	 }	 	 

	 	 });
}
					
		

			

// reply Method to get the chatbots name next to what he said.
	 

			

	 	 public void replyMeth(String s) {	 	 	 
	 		 ta.append("Chatbot-->"+s+"\n");
	 
	 	 }	 

}	 

// application class that initializes chatbot
public class Application {
public static void main(String[] args) {
		

	 	 	 new Chatbot();	

}
}
