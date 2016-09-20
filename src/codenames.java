import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

@SuppressWarnings("serial")
public class codenames extends JFrame
{
	codeWords words[] = new codeWords[25];
	JPanel p = new JPanel();
	JPanel q = new JPanel();
	int numRed;
	int numBlue;
	char currentColor;
	public static void main(String args[])
	{
		new codenames();
	}
	
	public codenames()
	{
		super("Codenames");
		getContentPane().setBackground(new Color(255, 160, 122));
		setBackground(new Color(250, 128, 114));
		setSize(1207, 854);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setBackground(new Color(255, 160, 122));
		p.setLayout(new GridLayout(5,5));
		setVisible(true);
		
		
		
		ArrayList<Pair> dict = new ArrayList<Pair>();
		dict.add(new Pair("Degree"));
		dict.add(new Pair("Bow"));
		dict.add(new Pair("Honey"));
		dict.add(new Pair("Horseshoe"));
		dict.add(new Pair("Bank"));
		dict.add(new Pair("Boom"));
		dict.add(new Pair("Port"));
		dict.add(new Pair("Disease"));
		dict.add(new Pair("Plane"));
		dict.add(new Pair("Rome"));
		dict.add(new Pair("Wake"));
		dict.add(new Pair("Fighter"));
		dict.add(new Pair("Olive"));
		dict.add(new Pair("Grace"));
		dict.add(new Pair("Agent"));
		dict.add(new Pair("Buck"));
		dict.add(new Pair("Spike"));
		dict.add(new Pair("Scientist"));
		dict.add(new Pair("Cast"));
		dict.add(new Pair("Gas"));
		dict.add(new Pair("Ruler"));
		dict.add(new Pair("Bomb"));
		dict.add(new Pair("Sink"));
		dict.add(new Pair("Club"));
		dict.add(new Pair("Center"));
		dict.add(new Pair("Chick"));
		dict.add(new Pair("Snowman"));
		dict.add(new Pair("Helicopter"));
		dict.add(new Pair("Oil"));
		dict.add(new Pair("Superhero"));
		dict.add(new Pair("Cliff"));
		dict.add(new Pair("Lab"));
		dict.add(new Pair("Canada"));
		dict.add(new Pair("Scorpion"));
		dict.add(new Pair("Tablet"));
		dict.add(new Pair("Slip"));
		dict.add(new Pair("Spell"));
		dict.add(new Pair("Grass"));
		dict.add(new Pair("Czech"));
		dict.add(new Pair("Back"));
		dict.add(new Pair("London"));
		dict.add(new Pair("Rock"));
		dict.add(new Pair("Code"));
		dict.add(new Pair("Kiwi"));
		dict.add(new Pair("Space"));
		dict.add(new Pair("Hook"));
		dict.add(new Pair("Wave"));
		dict.add(new Pair("Car"));
		dict.add(new Pair("Square"));
		dict.add(new Pair("Greece"));
		dict.add(new Pair("Switch"));
		dict.add(new Pair("Straw"));
		dict.add(new Pair("Thief"));
		dict.add(new Pair("Bark"));
		dict.add(new Pair("Trunk"));
		dict.add(new Pair("Snow"));
		dict.add(new Pair("State"));
		dict.add(new Pair("Torch"));
		dict.add(new Pair("Round"));
		dict.add(new Pair("India"));
		dict.add(new Pair("Germany"));
		dict.add(new Pair("Fork"));
		dict.add(new Pair("Nut"));
		dict.add(new Pair("Sock"));
		dict.add(new Pair("Saturn"));
		dict.add(new Pair("Hospital"));
		dict.add(new Pair("Maple"));
		dict.add(new Pair("Aztec"));
		dict.add(new Pair("War"));
		dict.add(new Pair("Mouse"));
		dict.add(new Pair("Cold"));
		dict.add(new Pair("Cricket"));
		dict.add(new Pair("Table"));
		dict.add(new Pair("Tie"));
		dict.add(new Pair("Bottle"));
		dict.add(new Pair("Forest"));
		dict.add(new Pair("Shop"));
		dict.add(new Pair("Needle"));
		dict.add(new Pair("England"));
		dict.add(new Pair("Smuggler"));
		dict.add(new Pair("Teacher"));
		dict.add(new Pair("Pumpkin"));
		dict.add(new Pair("Temple"));
		dict.add(new Pair("Orange"));
		dict.add(new Pair("Jam"));
		dict.add(new Pair("Organ"));
		dict.add(new Pair("Band"));
		dict.add(new Pair("Fire"));
		dict.add(new Pair("Amazon"));
		dict.add(new Pair("Luck"));
		dict.add(new Pair("Casino"));
		dict.add(new Pair("Pilot"));
		dict.add(new Pair("Opera"));
		dict.add(new Pair("Pyramid"));
		dict.add(new Pair("Pass"));
		dict.add(new Pair("Green"));
		dict.add(new Pair("Racket"));
		dict.add(new Pair("Beijing"));
		dict.add(new Pair("Ambulance"));
		dict.add(new Pair("Dress"));
		dict.add(new Pair("Knight"));
		dict.add(new Pair("Pie"));
		dict.add(new Pair("Spider"));
		dict.add(new Pair("Angel"));
		dict.add(new Pair("Block"));
		dict.add(new Pair("France"));
		dict.add(new Pair("Battery"));
		dict.add(new Pair("Hawk"));
		dict.add(new Pair("Cloak"));
		dict.add(new Pair("Board"));
		dict.add(new Pair("Mug"));
		dict.add(new Pair("Concert"));
		dict.add(new Pair("Jack"));
		dict.add(new Pair("Copper"));
		dict.add(new Pair("Spy"));
		dict.add(new Pair("Unicorn"));
		dict.add(new Pair("Paper"));
		dict.add(new Pair("Sound"));
		dict.add(new Pair("Bug"));
		dict.add(new Pair("Mint"));
		dict.add(new Pair("Trip"));
		dict.add(new Pair("Crane"));
		dict.add(new Pair("Pool"));
		dict.add(new Pair("Star"));
		dict.add(new Pair("Pitch"));
		dict.add(new Pair("King"));
		dict.add(new Pair("Shark"));
		dict.add(new Pair("Jupiter"));
		dict.add(new Pair("Button"));
		dict.add(new Pair("Film"));
		dict.add(new Pair("Kangaroo"));
		dict.add(new Pair("Strike"));
		dict.add(new Pair("Rose"));
		dict.add(new Pair("Change"));
		dict.add(new Pair("Roulette"));
		dict.add(new Pair("Mercury"));
		dict.add(new Pair("Tail"));
		dict.add(new Pair("Crash"));
		dict.add(new Pair("Bugle"));
		dict.add(new Pair("Part"));
		dict.add(new Pair("Scale"));
		dict.add(new Pair("Fall"));
		dict.add(new Pair("Point"));
		dict.add(new Pair("Tube"));
		dict.add(new Pair("Loch Ness"));
		dict.add(new Pair("Log"));
		dict.add(new Pair("Mine"));
		dict.add(new Pair("Turkey"));
		dict.add(new Pair("Horse"));
		dict.add(new Pair("Pirate"));
		dict.add(new Pair("Draft"));
		dict.add(new Pair("Ham"));
		dict.add(new Pair("Box"));
		dict.add(new Pair("Mount"));
		dict.add(new Pair("Fish"));
		dict.add(new Pair("Cotton"));
		dict.add(new Pair("Ring"));
		dict.add(new Pair("Duck"));
		dict.add(new Pair("Court"));
		dict.add(new Pair("Spring"));
		dict.add(new Pair("Field"));
		dict.add(new Pair("Train"));
		dict.add(new Pair("Slug"));
		dict.add(new Pair("Compound"));
		dict.add(new Pair("Buffalo"));
		dict.add(new Pair("Deck"));
		dict.add(new Pair("Berry"));
		dict.add(new Pair("Soldier"));
		dict.add(new Pair("Cap"));
		dict.add(new Pair("Triangle"));
		dict.add(new Pair("Eagle"));
		dict.add(new Pair("Genius"));
		dict.add(new Pair("Chair"));
		dict.add(new Pair("Water"));
		dict.add(new Pair("Shadow"));
		dict.add(new Pair("Centaur"));
		dict.add(new Pair("Millionaire"));
		dict.add(new Pair("Day"));
		dict.add(new Pair("Witch"));
		dict.add(new Pair("Ketchup"));
		dict.add(new Pair("Flute"));
		dict.add(new Pair("Carrot"));
		dict.add(new Pair("Root"));
		dict.add(new Pair("Penguin"));
		dict.add(new Pair("Olympus"));
		dict.add(new Pair("Ninja"));
		dict.add(new Pair("Thumb"));
		dict.add(new Pair("Antarctica"));
		dict.add(new Pair("Belt"));
		dict.add(new Pair("Light"));
		dict.add(new Pair("Ice Cream"));
		dict.add(new Pair("Rabbit"));
		dict.add(new Pair("Stream"));
		dict.add(new Pair("Glove"));
		dict.add(new Pair("Mexico"));
		dict.add(new Pair("Eye"));
		dict.add(new Pair("Bat"));
		dict.add(new Pair("Mass"));
		dict.add(new Pair("Post"));
		dict.add(new Pair("Ray"));
		dict.add(new Pair("Plot"));
		dict.add(new Pair("Pupil"));
		dict.add(new Pair("Moscow"));
		dict.add(new Pair("Palm"));
		dict.add(new Pair("Key"));
		dict.add(new Pair("Alien"));
		dict.add(new Pair("Knife"));
		dict.add(new Pair("Church"));
		dict.add(new Pair("Soul"));
		dict.add(new Pair("Europe"));
		dict.add(new Pair("School"));
		dict.add(new Pair("Server"));
		dict.add(new Pair("Africa"));
		dict.add(new Pair("Scuba Diver"));
		dict.add(new Pair("Bermuda"));
		dict.add(new Pair("Arm"));
		dict.add(new Pair("Stadium"));
		dict.add(new Pair("Dragon"));
		dict.add(new Pair("Face"));
		dict.add(new Pair("Berlin"));
		dict.add(new Pair("Lap"));
		dict.add(new Pair("Life"));
		dict.add(new Pair("Vacuum"));
		dict.add(new Pair("Atlantis"));
		dict.add(new Pair("Glass"));
		dict.add(new Pair("Bear"));
		dict.add(new Pair("Drill"));
		dict.add(new Pair("Date"));
		dict.add(new Pair("Cat"));
		dict.add(new Pair("Shot"));
		dict.add(new Pair("Robin"));
		dict.add(new Pair("Bridge"));
		dict.add(new Pair("Fair"));
		dict.add(new Pair("Screen"));
		dict.add(new Pair("Himalayas"));
		dict.add(new Pair("Crown"));
		dict.add(new Pair("Ship"));
		dict.add(new Pair("Dice"));
		dict.add(new Pair("Nail"));
		dict.add(new Pair("Giant"));
		dict.add(new Pair("Ball"));
		dict.add(new Pair("Doctor"));
		dict.add(new Pair("Hand"));
		dict.add(new Pair("Swing"));
		dict.add(new Pair("Horn"));
		dict.add(new Pair("Card"));
		dict.add(new Pair("Lead"));
		dict.add(new Pair("Watch"));
		dict.add(new Pair("Fence"));
		dict.add(new Pair("Capital"));
		dict.add(new Pair("Wind"));
		dict.add(new Pair("Kid"));
		dict.add(new Pair("Satellite"));
		dict.add(new Pair("Lawyer"));
		dict.add(new Pair("Tap"));
		dict.add(new Pair("Mouth"));
		dict.add(new Pair("Yard"));
		dict.add(new Pair("Chest"));
		dict.add(new Pair("Hotel"));
		dict.add(new Pair("Parachute"));
		dict.add(new Pair("Calf"));
		dict.add(new Pair("Air"));
		dict.add(new Pair("America"));
		dict.add(new Pair("Ivory"));
		dict.add(new Pair("Bed"));
		dict.add(new Pair("Circle"));
		dict.add(new Pair("Undertaker"));
		dict.add(new Pair("Mail"));
		dict.add(new Pair("Contract"));
		dict.add(new Pair("March"));
		dict.add(new Pair("Link"));
		dict.add(new Pair("Dance"));
		dict.add(new Pair("Telescope"));
		dict.add(new Pair("Cycle"));
		dict.add(new Pair("Theater"));
		dict.add(new Pair("Egypt"));
		dict.add(new Pair("Pants"));
		dict.add(new Pair("Wall"));
		dict.add(new Pair("Pan"));
		dict.add(new Pair("Bond"));
		dict.add(new Pair("Lemon"));
		dict.add(new Pair("Bell"));
		dict.add(new Pair("Alps"));
		dict.add(new Pair("Worm"));
		dict.add(new Pair("Spot"));
		dict.add(new Pair("Piano"));
		dict.add(new Pair("Web"));
		dict.add(new Pair("Fan"));
		dict.add(new Pair("Queen"));
		dict.add(new Pair("Check"));
		dict.add(new Pair("Limousine"));
		dict.add(new Pair("Australia"));
		dict.add(new Pair("Lion"));
		dict.add(new Pair("Police"));
		dict.add(new Pair("Cover"));
		dict.add(new Pair("Cell"));
		dict.add(new Pair("Chocolate"));
		dict.add(new Pair("Suit"));
		dict.add(new Pair("Tower"));
		dict.add(new Pair("Poison"));
		dict.add(new Pair("Bill"));
		dict.add(new Pair("Dinosaur"));
		dict.add(new Pair("Time"));
		dict.add(new Pair("Princess"));
		dict.add(new Pair("Paste"));
		dict.add(new Pair("Missile"));
		dict.add(new Pair("Figure"));
		dict.add(new Pair("Park"));
		dict.add(new Pair("Pole"));
		dict.add(new Pair("Apple"));
		dict.add(new Pair("Iron"));
		dict.add(new Pair("Match"));
		dict.add(new Pair("Heart"));
		dict.add(new Pair("Hood"));
		dict.add(new Pair("Litter"));
		dict.add(new Pair("Head"));
		dict.add(new Pair("Laser"));
		dict.add(new Pair("Skyscraper"));
		dict.add(new Pair("Drop"));
		dict.add(new Pair("Phoenix"));
		dict.add(new Pair("Cross"));
		dict.add(new Pair("Seal"));
		dict.add(new Pair("Beat"));
		dict.add(new Pair("Hole"));
		dict.add(new Pair("Microscope"));
		dict.add(new Pair("Jet"));
		dict.add(new Pair("Pound"));
		dict.add(new Pair("Sub"));
		dict.add(new Pair("Beach"));
		dict.add(new Pair("Charge"));
		dict.add(new Pair("Spine"));
		dict.add(new Pair("Press"));
		dict.add(new Pair("Conductor"));
		dict.add(new Pair("Dog"));
		dict.add(new Pair("Boot"));
		dict.add(new Pair("Ghost"));
		dict.add(new Pair("Whale"));
		dict.add(new Pair("Diamond"));
		dict.add(new Pair("Tag"));
		dict.add(new Pair("Ice"));
		dict.add(new Pair("Fly"));
		dict.add(new Pair("Pit"));
		dict.add(new Pair("Tokyo"));
		dict.add(new Pair("Model"));
		dict.add(new Pair("Mammoth"));
		dict.add(new Pair("Comic"));
		dict.add(new Pair("Shoe"));
		dict.add(new Pair("Mole"));
		dict.add(new Pair("Well"));
		dict.add(new Pair("Holywood"));
		dict.add(new Pair("Dwarf"));
		dict.add(new Pair("Plastic"));
		dict.add(new Pair("Engine"));
		dict.add(new Pair("Shakespeare"));
		dict.add(new Pair("Leprechaun"));
		dict.add(new Pair("Nurse"));
		dict.add(new Pair("Washer"));
		dict.add(new Pair("Game"));
		dict.add(new Pair("Washington"));
		dict.add(new Pair("Pin"));
		dict.add(new Pair("Net"));
		dict.add(new Pair("Moon"));
		dict.add(new Pair("Whip"));
		dict.add(new Pair("Octopus"));
		dict.add(new Pair("Gold"));
		dict.add(new Pair("Tick"));
		dict.add(new Pair("Track"));
		dict.add(new Pair("Force"));
		dict.add(new Pair("Note"));
		dict.add(new Pair("Ground"));
		dict.add(new Pair("Pistol"));
		dict.add(new Pair("Row"));
		dict.add(new Pair("Bar"));
		dict.add(new Pair("File"));
		dict.add(new Pair("Stick"));
		dict.add(new Pair("Platypus"));
		dict.add(new Pair("Marble"));
		dict.add(new Pair("Staff"));
		dict.add(new Pair("Embassy"));
		dict.add(new Pair("Robot"));
		dict.add(new Pair("Tooth"));
		dict.add(new Pair("Play"));
		dict.add(new Pair("Bolt"));
		dict.add(new Pair("China"));
		dict.add(new Pair("String"));
		dict.add(new Pair("Night"));
		dict.add(new Pair("Lock"));
		dict.add(new Pair("Brush"));
		dict.add(new Pair("Revolution"));
		dict.add(new Pair("Cook"));
		dict.add(new Pair("Novel"));
		dict.add(new Pair("Pipe"));
		dict.add(new Pair("Van"));
		dict.add(new Pair("Vet"));
		dict.add(new Pair("Foot"));
		dict.add(new Pair("New York"));
		dict.add(new Pair("Death"));
		dict.add(new Pair("Stock"));
		dict.add(new Pair("Plane"));
		dict.add(new Pair("Line"));
		
		
		
		
		
		
		
		
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.add(new Card("BBNNNBBRRNNABRBRRNRBRBRNB", 'B'));
		cards.add(new Card("RRNBBBRABBRNBRNNRRRNBBBNN", 'B'));
		cards.add(new Card("BNRBRBRNRRBRBANNRRBBNNNBB", 'B'));
		cards.add(new Card("NNBBBNRRRNNRBNRBBARBBBNRR", 'B'));
		cards.add(new Card("BRBNRRNNABBBBBNNRNBRRRRNB", 'B'));
		cards.add(new Card("RNBRBRRBNRRNBNBNBBANBRNBR", 'B'));
		cards.add(new Card("BNRRRRBNRNNBBBBBANNRRNBRB", 'B'));
		cards.add(new Card("RBNRBNABBNBNBNRRNBRRBRBNR", 'B'));
		cards.add(new Card("ANRBNNRBNBBRBRBRNBNRBNRRB", 'B'));
		cards.add(new Card("BRBNANNRRNRBBBRRNRNBBRBBN", 'B'));
		cards.add(new Card("BRRNBRNBNRBRBRBBNBRNNBRNA", 'B'));
		cards.add(new Card("NBBRBBNRNRRBBBRNRRNNANBRB", 'B'));
		cards.add(new Card("BRRRNBRNNBNBBNRRNBABBRNRB", 'B'));
		cards.add(new Card("BRNBBRNBRRNBBNRRANNRBBRBN", 'B'));
		cards.add(new Card("BRNRBBABNRRNBBNBNNRBNRRRB", 'B'));
		cards.add(new Card("NBRBBRNNARRNBBNRRBNRBBNRB", 'B'));
		cards.add(new Card("RBNBBARNRBBNNBNRRRNRNRBBB", 'B'));
		cards.add(new Card("NRBARRRNRBBRNNNBNBRBBRNBB", 'B'));
		cards.add(new Card("BBBRNRNRRRNBNNBBRNRABBNBR", 'B'));
		cards.add(new Card("BBNRBBRBNBNNNRBBRNRRRABRN", 'B'));
		cards.add(new Card("RBNBNNBRRBBRARNNBNBBBRNRR", 'B'));
		cards.add(new Card("BNBNRRBRBBNNARNRBRRBRBNBN", 'B'));
		cards.add(new Card("RRNRBBBNBNNRARBBRRBNNBNBR", 'B'));
		cards.add(new Card("NBNBRBRRBRNRANNBBRBRRNBNB", 'B'));
		cards.add(new Card("NBRNRRANRBRBNRBBBRRBNBNNB", 'B'));
		cards.add(new Card("NBRRNBBBABNRNNRNRRRNBBBBR", 'B'));
		cards.add(new Card("BNNBNBRRBBBRNBRBRNARRNRBN", 'B'));
		cards.add(new Card("RBBBBNRRRNRNNRNBABBBNRRBN", 'B'));
		cards.add(new Card("BNRBNBBNNABBRBRNRRBRRNRBN", 'B'));
		cards.add(new Card("RNBBBNRBBNRRRNRBBBNBNRRAN", 'B'));
		cards.add(new Card("NBRNRRBRRNRBRBBANNBBNBRNB", 'B'));
		cards.add(new Card("NARRNBNBBBRNRRRNBBRNBBBNR", 'B'));
		cards.add(new Card("BNRNRRBNBBRNBRRABBNRNRBNB", 'B'));
		cards.add(new Card("NARRBRBNBNBBBNRNNRBNBRRBR", 'B'));
		cards.add(new Card("BNBRNRNBBARRBNRBBNBRRNRNB", 'B'));
		cards.add(new Card("RBRRBNBRNNRNBBBNBNBRBRRAN", 'B'));
		cards.add(new Card("BBNRNRBBNBRBRBNRRBRNBNANR", 'B'));
		cards.add(new Card("BRRRBNRBBBABRBNNRBNRRNNBN", 'B'));
		cards.add(new Card("RNANBNRBRRNBRBRBNBBRNRNBB", 'B'));
		cards.add(new Card("NBNNRRNBRNNBRBABBBRNBRRRB", 'B'));
		cards.add(new Card("BRRBBNBNBRBNRNNRRBBNBRRNA", 'B'));
		cards.add(new Card("BRBNBRRNBRRBRNRNBNBBANNRB", 'B'));
		cards.add(new Card("ANRRBNBBRRNNRNBRBNBNBBRRB", 'B'));
		cards.add(new Card("BRNNABBNBNRNRBRRBNRRBNBRB", 'B'));
		cards.add(new Card("NRBBBBNANRRRRBBBBRNBRNNRN", 'B'));
		cards.add(new Card("RBRBNNBRNRNRRABRNBNBNBBRB", 'B'));
		cards.add(new Card("NRNNRBNRBBBBRRRRNANBBBBRN", 'B'));
		cards.add(new Card("BRBBNBNBNRBARRNRNRBNNBRBR", 'B'));
		cards.add(new Card("NRBNBRBNRBNNABNBRRBRRRBNB", 'B'));
		cards.add(new Card("RBNRNRRNBRBRANBNBBRNBRNBB", 'B'));
		cards.add(new Card("BNBRRRBRRBNBANNBRNBRBNBRN", 'B'));
		cards.add(new Card("BBNRBNRBBNBNARBRBNRRNRNBR", 'B'));
		cards.add(new Card("NABNRBNRBNRBRBRNRNBBBRRBN", 'B'));
		cards.add(new Card("BNRBNRRBNARNRRBBBBBNNBRNR", 'B'));
		cards.add(new Card("NBRRBBBNRNRBRBRNBRNBRNBAN", 'B'));
		cards.add(new Card("RNRBNNBBBBBRRNRANBRRNBRNB", 'B'));
		cards.add(new Card("NBRBRRRBBNRBNRBRNBRNBNNBA", 'B'));
		cards.add(new Card("BRRRNNNBRBNBNBRBRRBBANBNR", 'B'));
		cards.add(new Card("ABNNBNRBNRBRNBRNBBRRRBRBN", 'B'));
		cards.add(new Card("RNBNABBRRBRBNBNBRBNNNRRRB", 'B'));
		cards.add(new Card("RRRBBNBANNNRNBNBBRBRRNBBR", 'B'));
		cards.add(new Card("RBNNRNBRBRBRNARBBBNBRRNNB", 'B'));
		cards.add(new Card("RBBNRRBRBBNBNRNNNABNBBRRR", 'B'));
		cards.add(new Card("BNNRRBNBBBRANRBRBRBNRNNBR", 'B'));
		cards.add(new Card("NRRBRNBNNBABNRNRRBBRBBBNR", 'B'));
		cards.add(new Card("BRANNBRBBRBBNNRNBRNBRRNBR", 'B'));
		cards.add(new Card("RNBBBRBBRRNRNBABNNBNRBRRN", 'B'));
		cards.add(new Card("RBNRRBNRBNRNNBBRBBRBNNARB", 'B'));
		cards.add(new Card("RRBRNBRNNBBBBNBBNRNRRABRN", 'B'));
		cards.add(new Card("RBBBRANBRRBRBNBRNNNRNRBBN", 'B'));
		cards.add(new Card("NRBARRNRNBBNBBBBNNRBNRBNN", 'B'));
		cards.add(new Card("NBBRNRNNNRBNBRBRRBNARBBBR", 'B'));
		cards.add(new Card("RNBBRNRBRNBRBNRNBRBBNABNR", 'B'));
		cards.add(new Card("NNBNRABRRNBRBBBNBNRBRBRNR", 'B'));
		cards.add(new Card("RNBANBBRBNRNBRBNRBRNRBBNR", 'B'));
		cards.add(new Card("RNRBRBRNBNBBBRBNRRBARNBNN", 'B'));
		cards.add(new Card("NBBNNBRRBRARRRBRNBNBBNNBR", 'B'));
		cards.add(new Card("BRABNNNRRBNBRRBBNRBNRBBRN", 'B'));
		cards.add(new Card("RBNNBBNBNRBRRRARBRRBNNBBN", 'B'));
		cards.add(new Card("NRBBRNBRNBBRRBNBRRNNNBARB", 'B'));
		
		
		
		
		
		
		
		
		
		Color red = new Color(255, 0, 0);
		Color black = new Color(0, 0, 0);
		Color blue = new Color(0, 0, 255);
		Color tan = new Color(255, 221, 128);
		
		
		
		
		
		
		Random cardPicker = new Random();
		int cardNum = cardPicker.nextInt(cards.size());
		Card chosenCard = cards.get(cardNum);
		
		
		for(int i = 0; i < 25; i++)
		{
			words[i] = new codeWords();
			
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(dict.size());
			while(dict.get(randomInt).used)
			{
				randomInt = randomGenerator.nextInt(dict.size());
			}
			dict.get(randomInt).used = true;
			words[i].setText(dict.get(randomInt).word);
			words[i].word = dict.get(randomInt).word;
			words[i].color = chosenCard.colors.charAt(i);
			
			
			p.add(words[i]);
		}
		JButton end = new JButton("End Turn");
		end.setBackground(new Color(222, 184, 135));
		end.setBounds(451, 246, 129, 62);
		q.setBackground(new Color(255, 160, 122));
		q.setLayout(null);
		JButton show = new JButton("Show Color Card");

		show.setForeground(new Color(255, 255, 255));
		show.setBackground(new Color(0, 0, 0));
		show.setBounds(612, 246, 129, 62);
		q.add(show);
		q.add(end);
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		getContentPane().add(p);
		
		JLabel label = new JLabel("");
		label.setLocation(451, 133);
		label.setSize(290, 100);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		q.add(label);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFrame about = new JFrame("About");
				about.setSize(400, 100);
				
				about.setVisible(true);
				JTextArea aboutText = new JTextArea();
				aboutText.setEditable(false);
				aboutText.setBackground(new Color(255, 160, 122));
				aboutText.setText("Programmed by Jeremy Kruman.\nThis is a fan-made game.\n All credit for the original Codenames game goes to Vlaada Chvátil.");
				about.getContentPane().add(aboutText);
			}
		});
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new codenames();
			}
		});
		btnNewGame.setBounds(428, 384, 97, 25);
		q.add(btnNewGame);
		
		JButton btnInstruction = new JButton("Instructions");
		btnInstruction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFrame instrFrame = new JFrame("Instructions");
				instrFrame.setSize(1000, 300);
				instrFrame.setVisible(true);
				JTextArea instructions = new JTextArea();
				instructions.setEditable(false);
				instructions.setFont(new Font("Tahoma", Font.PLAIN, 15));
				instructions.setBackground(new Color(255, 160, 122));
				instructions.setText("Players split up into two teams: Red and Blue.\n"
						+ "Each team selects one player to be the spymaster."
						+ " Only the spymasters may look at the color card.\n \n"
						+ "The color card corresponds to the word grid. "
						+ "Blue squares correspond to words that the Blue Team must guess.\n"
						+ "Red squares correspond to words that the Red Team must guess. "
						+ "Tan squares are neutral, and the black square is the Assassin.\n \n"
						+ "Spymasters take turns giving clues to their teammates in the form of a word followed by a number. \n"
						+ "The word hints at what words on the board are of that team's color, while the number indicates how many words that clue corresponds to. \n"
						+ "The current team clicks on the words that they think were hinted at by the spymaster's clue. This continues until any of the following occur: \n"
						+ "1. The current team guesses a word that is not of their color. Play passes to the next team.\n"
						+ "If the Assassin is guessed, the team who guessed that word loses the game.\n"
						+ "2. The current team has made up to N+1 successful guesses this turn, where N is the number in the clue given this turn.\n"
						+ "Click 'End Turn' to pass to the next team. A team may choose to do this before making N+1 guesses.\n \n"
						+ "The winning team is the first to have guessed all spaces of their team's color.");
				instrFrame.getContentPane().add(instructions);
			}
		});
		
		btnInstruction.setBounds(537, 384, 111, 25);
		q.add(btnInstruction);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		btnAbout.setBounds(660, 384, 97, 25);
		q.add(btnAbout);

		if(chosenCard.first == 'R')
		{
			numRed = 9;
			numBlue = 8;
			currentColor = 'R';
			label.setText("RED");
			label.setForeground(new Color(255, 0, 0));
		}
		else
		{
			numRed = 8;
			numBlue = 9;
			currentColor = 'B';
			label.setText("BLUE");
			label.setForeground(new Color(0, 0, 255));
		}

		getContentPane().add(q);
		
		JLabel lblNewLabel_1 = new JLabel("Blue Spaces Remaining:");
		lblNewLabel_1.setBounds(0, 0, 397, 160);
		q.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("Red Spaces Remaining:");
		lblNewLabel_2.setBounds(797, 0, 397, 160);
		q.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel redScore = new JLabel("");
		redScore.setBounds(797, 143, 399, 160);
		q.add(redScore);
		redScore.setForeground(new Color(255, 0, 0));
		redScore.setHorizontalAlignment(SwingConstants.CENTER);
		redScore.setFont(new Font("Tahoma", Font.BOLD, 24));
		redScore.setText(String.valueOf(numRed));
		
		JLabel blueScore = new JLabel("");
		blueScore.setBounds(0, 148, 397, 160);
		q.add(blueScore);
		blueScore.setForeground(new Color(0, 0, 255));
		blueScore.setHorizontalAlignment(SwingConstants.CENTER);
		blueScore.setFont(new Font("Tahoma", Font.BOLD, 24));
		blueScore.setText(String.valueOf(numBlue));
		
		JLabel lblCurrentTeam = new JLabel("Current Team:");
		lblCurrentTeam.setBounds(0, 0, 1194, 160);
		q.add(lblCurrentTeam);
		lblCurrentTeam.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblCurrentTeam.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		
		for(int i = 0; i < 25; i++)
		{
			int currentWord = i;
			words[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					
					
					if(words[currentWord].color == 'R')
					{
						words[currentWord].setBackground(red);
						numRed--;
						redScore.setText(String.valueOf(numRed));
						if(currentColor == 'B')
						{
							currentColor = 'R';
							label.setText("RED");
							label.setForeground(red);
						}
						if(numRed == 0)
						{
							label.setText("Red Wins!");
							label.setForeground(red);
						}
						
					}
					
					if(words[currentWord].color == 'B')
					{
						words[currentWord].setBackground(blue);
						numBlue--;
						blueScore.setText(String.valueOf(numBlue));
						if(currentColor == 'R')
						{
							currentColor = 'B';
							label.setText("BLUE");
							label.setForeground(blue);
						}
						if(numBlue == 0)
						{
							label.setText("Blue Wins!");
							label.setForeground(blue);

						}
					}
					
					if(words[currentWord].color == 'N')
					{
						words[currentWord].setBackground(tan);
						if(currentColor == 'R')
						{
							currentColor = 'B';
							label.setText("BLUE");
							label.setForeground(blue);
						}
						
						else if(currentColor == 'B')
						{
							currentColor = 'R';
							label.setText("RED");
							label.setForeground(red);
						}
						
					}
					
					if(words[currentWord].color == 'A')
					{
						words[currentWord].setBackground(black);
						if(currentColor == 'R')
						{
							label.setText("Blue Wins!");
							label.setForeground(blue);
						}
						else if(currentColor == 'B')
						{
							label.setText("Red Wins!");
							label.setForeground(red);
						}
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			});
		}
		
		
		
		show.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFrame revealCard = new JFrame("Color Card");
				revealCard.setVisible(true);
				revealCard.setSize(500, 500);
				revealCard.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				revealCard.getContentPane().setLayout(new GridLayout(5, 5));
				for(int i = 0; i < 25; ++i)
				{
					JTextField space = new JTextField("");
					if(words[i].color == 'R')
					{
						space.setBackground(new Color(255, 0, 0));
					}
					else if(words[i].color == 'B')
					{
						space.setBackground(new Color(0, 0, 255));
					}
					else if(words[i].color == 'A')
					{
						space.setBackground(new Color(0, 0, 0));
					}
					else 
					{
						space.setBackground(new Color(255, 221, 128));
					}
					revealCard.getContentPane().add(space);
				}
				
			}
		});
		
		end.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				if(currentColor == 'B')
				{
					currentColor = 'R';
					label.setText("RED");
					label.setForeground(red);
				}
				
				else
				{
					currentColor = 'B';
					label.setText("BLUE");
					label.setForeground(blue);
				}
			}
		});
		
	}
}