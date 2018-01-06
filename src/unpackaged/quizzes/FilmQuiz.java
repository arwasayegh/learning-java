import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * This class gives you a little film quiz.
 * It pops up a quiz box and asks you questions.
 * Don't worry if you don't understand all this now.
 * by the end of the course it'll be much more obvious 
 * what's going on.
 * @author Andy Evans http://www.geog.leeds.ac.uk/people/a.evans/
**/
public class FilmQuiz extends JFrame implements ActionListener
{

	// Some checkboxes.

	javax.swing.JCheckBox answer1 = new javax.swing.JCheckBox();
	javax.swing.JCheckBox answer2 = new javax.swing.JCheckBox();
	javax.swing.JCheckBox answer3 = new javax.swing.JCheckBox();
	javax.swing.JTextArea textArea = new javax.swing.JTextArea();

	// Some names which will be associated with numbers.

	int answer;
	int quote;





	/** 
       * This bit of code starts the process of showing the window.
 	**/
	public FilmQuiz()
	{
		// Drop down to the code labeled 'initComponents' below.

		try {
			initComponents();
		} catch (Exception e) {}

	}



	

	/**
 	 * This bit of code is the first bit that's run.
	**/
	static public void main(String[] args) 
	{
		FilmQuiz frame = new FilmQuiz(); // This jumps to the bit of code labeled FilmQuiz above.

		// The following code puts the Window on your screen.

		frame.setVisible(true);
		frame.textArea.setText("Here's a little quiz\nWhich films do the following quotes come from?\n\n");
		frame.showQuote(1);
	}





	/**
  	 * This bit of code sets up how the Window looks.
	**/
	public void initComponents() throws Exception
	{

		// answer1 etc are checkboxes. This code sets up what they look like.
		// It looks more terrifying than it is.

		answer1.setSize(new java.awt.Dimension(400, 20));
		answer1.setVisible(true);
		answer1.setMaximumSize(new java.awt.Dimension(400, 20));
		answer1.setMinimumSize(new java.awt.Dimension(400, 20));
		answer1.setLocation(new java.awt.Point(10, 180));

		answer2.setSize(new java.awt.Dimension(400, 20));
		answer2.setVisible(true);
		answer2.setMaximumSize(new java.awt.Dimension(400, 20));
		answer2.setMinimumSize(new java.awt.Dimension(400, 20));
		answer2.setLocation(new java.awt.Point(10, 210));

		answer3.setSize(new java.awt.Dimension(400, 20));
		answer3.setVisible(true);
		answer3.setMaximumSize(new java.awt.Dimension(400, 20));
		answer3.setMinimumSize(new java.awt.Dimension(400, 20));
		answer3.setLocation(new java.awt.Point(10, 240));

		// This bit of code sets up a text area for the 
		// computer to write replies to.

		textArea.setSize(new java.awt.Dimension(400, 140));
		textArea.setLineWrap(true);
		textArea.setVisible(true);
		textArea.setMaximumSize(new java.awt.Dimension(400, 140));
		textArea.setMinimumSize(new java.awt.Dimension(400, 140));
		textArea.setLocation(new java.awt.Point(10, 20));

		// This sets up the size of the Window.

		setSize(new java.awt.Dimension(430, 300));
		setResizable(false);
		getContentPane().setLayout(null);
		setTitle("A little film quiz");
		setLocation(new java.awt.Point(200, 200));
		getContentPane().add(answer1);
		getContentPane().add(answer2);
		getContentPane().add(answer3);
		getContentPane().add(textArea);

		// This makes sure you can shut the window by clicking 
		// on the close cross.

		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				thisWindowClosing(e);
			}
		});

		// This makes sure the checkboxes can let the 
		// program know when they've been clicked on.	
	
		answer1.addActionListener(this);
		answer2.addActionListener(this);	
		answer3.addActionListener(this);	
	
	
	}

	
  

	
	/**
	 * This code happens when someone clicks on the 
	 * close window cross. It shuts the window down.
	**/
	void thisWindowClosing(java.awt.event.WindowEvent e)
	{
		setVisible(false);
		dispose();
		System.exit(0);
	}
	




	/**
  	 * This code happens when someone clicks an answer checkbox. 
	 * It checks the answer and responds appropriately.
	**/	
	public void actionPerformed(ActionEvent ae)
	{
	
		if (((ae.getSource()).equals(answer1)) && (answer == 1)) {
			correctamundo();
		} else if (((ae.getSource()).equals(answer2)) && (answer == 2)) {
			correctamundo();
		} else if (((ae.getSource()).equals(answer3)) && (answer == 3)) {
			correctamundo();
		} else {
			itsAllGonePeteTong();
		}
	
	
	}


	


	/**
 	 * Code done if right answer given.
	**/	
	private void correctamundo() {
	
		textArea.setText("Correctomundo!\nHere's another one...\n\n");
		showQuote(quote);
	
	}





	/**
	 * Code done if wrong answer given.
	**/
	private void itsAllGonePeteTong() {
	
			
		textArea.setText("Better spend more time watching TV\nTry another one...\n\n");
		showQuote(quote);
	
	}





	/**
 	 * Code to show quotes.
	**/
	private void showQuote(int quotation) {
		
		// Show a quote, depending on a number.
		
		switch (quotation) {
		
			case 1:
				textArea.setText(textArea.getText() + "'You can't really dust for vomit.'");
				answer1.setText("You've Got Mail");
				answer2.setText("Sleepless in Seattle");
				answer3.setText("This is Spinal Tap");
				answer = 3;
				quote = 2;
				answer1.setSelected(false);
				answer2.setSelected(false);
				answer3.setSelected(false);
				break;
			case 2:
				textArea.setText(textArea.getText() + "'Disneyland. F**k, man, this is better than Disneyland.'");
				answer1.setText("Snow White");
				answer2.setText("Pokemon, the first movie");
				answer3.setText("Apocalypse Now");
				answer = 3;
				quote = 3;
				answer1.setSelected(false);
				answer2.setSelected(false);
				answer3.setSelected(false);
				break;
			case 3:
				textArea.setText(textArea.getText() + "'I demand to have some booze!'");
				answer1.setText("The Assassination Bureau");
				answer2.setText("J.F.K.");
				answer3.setText("Withnail and I");
				answer = 3;
				quote = 4;
				answer1.setSelected(false);
				answer2.setSelected(false);
				answer3.setSelected(false);
				break;
			case 4:
				textArea.setText(textArea.getText() + "'Actually I don't remember being born,\nit must have happened during one of my black outs.'");
				answer1.setText("The Assassination Bureau");
				answer2.setText("J.F.K.");
				answer3.setText("The Doors");
				answer = 3;
				quote = 5;
				answer1.setSelected(false);
				answer2.setSelected(false);
				answer3.setSelected(false);
				break;
			case 5:
				textArea.setText(textArea.getText() + "'I know kung fu.'");
				answer1.setText("Notting Hill");
				answer2.setText("Lair of the White Worm");
				answer3.setText("The Matrix");
				answer = 3;
				quote = 6;
				answer1.setSelected(false);
				answer2.setSelected(false);
				answer3.setSelected(false);
				break;
			case 6:
				textArea.setText(textArea.getText() + "'You don't want to get mixed up with a guy like me.\nI'm a loner, Dottie. A rebel.'");
				answer1.setText("Rebel without a cause");
				answer2.setText("Pee-wee's Big Adventure");
				answer3.setText("The Wizard of Oz");
				answer = 2;
				quote = 7;
				answer1.setSelected(false);
				answer2.setSelected(false);
				answer3.setSelected(false);
				break;
			case 7:
				textArea.setText(textArea.getText() + "'Mmmm. Marshmallows. Soft.'");
				answer1.setText("The Blair Witch Project");
				answer2.setText("Ghostbusters");
				answer3.setText("The Cube");
				answer = 1;
				quote = 1;
				answer1.setSelected(false);
				answer2.setSelected(false);
				answer3.setSelected(false);
				break;
		
		
		} // End of switch
	
	} // End of 'quote'

// End of code.
}
