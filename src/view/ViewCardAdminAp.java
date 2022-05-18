package view;

import java.util.HashMap;
import java.util.Map;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import json.Link;
import json.Write;
import modele.Category;

public class ViewCardAdminAp extends AnchorPane{
	private Button btnNext;
	private Button btnPrevious;
	private Button btnBack;
	private Button btnDelete;
	private Button btnAdd;
	private Button btnModify;
	private Button btnChallenges;
	private Text txtText;
	private Text txtTitle;
	private VBox vbTitle;
	private static int numCard =0;
	private Label lblCardCount;
	private ViewAddCardAp vwaddCard;
	private ViewAdminAccesAp vwAdminAccess;
	private Label lblAuthors;

	public ViewCardAdminAp()
	{
		getCardViewAdmin();

		/*New VBox*/
		vbTitle = new VBox(10,getTxtTitle(),getTxtText(),getLblAuthors());
		getVbTitle().setAlignment(Pos.CENTER);
		getTxtText().getStyleClass().add("aftxtWhite");
		getTxtTitle().getStyleClass().add("aftxt");

		/*VBox position*/
		AnchorPane.setTopAnchor(vbTitle,10.);
		AnchorPane.setLeftAnchor(vbTitle,0.);
		AnchorPane.setRightAnchor(vbTitle,0.);

		/*Text position*/
		AnchorPane.setTopAnchor(getTxtTitle(),50.);
		AnchorPane.setTopAnchor(getTxtTitle(),80.);

		/*Button position*/
		AnchorPane.setLeftAnchor(getBtnAdd(), 10.);
		AnchorPane.setTopAnchor(getBtnAdd(), 10.);

		/*Button position*/
		AnchorPane.setLeftAnchor(getBtnDelete(), 85.);
		AnchorPane.setTopAnchor(getBtnDelete(), 10.);

		/*Button position*/
		AnchorPane.setLeftAnchor(getBtnModify(), 160.);
		AnchorPane.setTopAnchor(getBtnModify(), 10.);

		/*Button position*/
		AnchorPane.setLeftAnchor(getBtnChallenges(), 235.);
		AnchorPane.setTopAnchor(getBtnChallenges(), 10.);

		/*Button position*/
		AnchorPane.setLeftAnchor(getBtnBack(), 10.);
		AnchorPane.setBottomAnchor(getBtnBack(), 10.);

		/*Button position*/
		AnchorPane.setBottomAnchor(getBtnNext(), 10.);
		AnchorPane.setRightAnchor(getBtnNext(),60.);
		AnchorPane.setBottomAnchor(getBtnPrevious(), 10.);
		AnchorPane.setRightAnchor(getBtnPrevious(),350.);

		/*Card Counter position*/
		AnchorPane.setTopAnchor(getLblCardCount(),20.);
		AnchorPane.setRightAnchor(getLblCardCount(),130.);

		getLblCardCount().getStyleClass().add("lblWhite");

		this.getChildren().addAll(getVbTitle(),getBtnAdd(),getBtnDelete(),getBtnModify(),getBtnBack(),
				getLblCardCount(),getBtnNext(),getBtnPrevious(),getBtnChallenges());
	}

	public void getCardViewAdmin()
	{
		//Author
		Map<Integer, Label> lblAuthors = new HashMap<Integer, Label>();
		// Category
		Map<Integer, Label> lblCategory = new HashMap<Integer, Label>();
		// TextField
		Map<Integer, Label> lblQuestion = new HashMap<Integer, Label>();
		// Answers
		Map<Integer, Map<Integer, Label>> lblAnwser = new HashMap<Integer, Map<Integer, Label>>();

		int z=0,y=0;
		getLblCardCount().setText((getNumCard() + 1)+" / " + Link.getDeck().getListCards().size());
		for (int i = 0; i < Link.getDeck().getListCards().get(getNumCard()).getListQuestion().size(); i++) {
			Rectangle rec = new Rectangle(800.,180.);
			rec.setFill(Color.web("#00c2cb"));
			rec.setArcWidth(100.0); 
			rec.setArcHeight(80.0); 
			lblAuthors.put(i, new Label(Link.getDeck().getListCards().get(getNumCard()).getListQuestion().get(i).getAuthor()));
			// D�fini la cat�gorie comme cela
			lblCategory.put(i, new Label(Link.getDeck().getListCards().get(getNumCard()).getListQuestion().get(i).getCategory().toString()));
			// D�fini la question comme �tant cela
			lblQuestion.put(i, new Label(Link.getDeck().getListCards().get(getNumCard()).getListQuestion().get(i).getInterrogation()));
			lblQuestion.get(i).setWrapText(true);

			lblQuestion.get(i).getStyleClass().add("lblQuestion");
			lblCategory.get(i).getStyleClass().add("lbl");
			/*Category color*/
			if(i==0) {
				lblCategory.get(i).setTextFill(Color.web(Category.IDEAS.getColor()));
			}
			else if(i==1) {
				lblCategory.get(i).setTextFill(Color.web(Category.SCIENCE.getColor()));
			}
			else if(i==2) {
				lblCategory.get(i).setTextFill(Color.web(Category.PLANET.getColor()));
			}
			else if(i==3) {
				lblCategory.get(i).setTextFill(Color.web(Category.HISTORY.getColor()));
			}
			else if(i==4) {
				lblCategory.get(i).setTextFill(Color.web(Category.LITERATURE.getColor()));
			}
			else{
				lblCategory.get(i).setTextFill(Color.web(Category.COMPUTER.getColor()));;
			}
			this.getChildren().addAll(rec,lblCategory.get(i), lblQuestion.get(i));

			int n = 0,k=0,l=0;
			for (Map.Entry<String, Boolean> entry : Link.getDeck().getListCards().get(getNumCard()).getListQuestion().get(i).getChoices().entrySet()) {
				String key = entry.getKey();
				Boolean value = entry.getValue();

				lblAnwser.put(i, new HashMap<Integer, Label>());
				lblAnwser.get(i).put(n, new Label());
				lblAnwser.get(i).get(n).setText(key);
				if(entry.getValue()) {
					lblAnwser.get(i).get(n).getStyleClass().add("lblCorrect");
				}
				else {
					lblAnwser.get(i).get(n).getStyleClass().add("lblIncorrect");
				}

				/*Position of responses*/
				if(i==0 || i == 1 || i == 2) {
					AnchorPane.setLeftAnchor(lblAnwser.get(i).get(n),(k*250.)+120.);
					AnchorPane.setTopAnchor(lblAnwser.get(i).get(n),(z*200)+400.);
					k++;
				}
				if(i==3 || i == 4 || i == 5) {
					AnchorPane.setLeftAnchor(lblAnwser.get(i).get(n),(l*250.)+1100.);
					AnchorPane.setTopAnchor(lblAnwser.get(i).get(n),(y*200.)+400.);
					l++;
				}
				this.getChildren().add(lblAnwser.get(i).get(n));
				lblAnwser.get(i).get(n).setWrapText(true);
				lblAnwser.get(i).get(n).setPrefWidth(230);
				n++;	
			}	

			/*Author name position*/
			getLblAuthors().setText(lblAuthors.get(i).getText());
			getLblAuthors().getStyleClass().add("lblAuthor");

			AnchorPane.setTopAnchor(getLblAuthors(),130.);

			/*Position of questions on the left*/
			if(i==0 || i == 1 || i == 2) {
				AnchorPane.setLeftAnchor(lblCategory.get(i), 375.);
				AnchorPane.setTopAnchor(lblCategory.get(i),(z*200.)+305.);
				AnchorPane.setLeftAnchor(lblQuestion.get(i),120.);
				AnchorPane.setTopAnchor(lblQuestion.get(i),(z*200.)+345.);

				AnchorPane.setLeftAnchor(rec,75.);
				AnchorPane.setTopAnchor(rec,(z*200.)+310.);
				z++;
			}
			/*Position of questions on the right*/
			if(i==3 || i == 4 || i == 5) {
				AnchorPane.setRightAnchor(lblCategory.get(i), 375.);
				AnchorPane.setTopAnchor(lblCategory.get(i),(y*200.)+305.);
				AnchorPane.setLeftAnchor(lblQuestion.get(i),1100.);
				AnchorPane.setTopAnchor(lblQuestion.get(i),(y*200.)+345.);
				AnchorPane.setRightAnchor(rec,75.);
				AnchorPane.setTopAnchor(rec,(y*200.)+310.);
				y++;
			}
			lblQuestion.get(i).setPrefWidth(725);
		}
	}


	/**
	 * This function creates a button that when clicked, will display the next card in the deck
	 * 
	 * @return The next button is being returned.
	 */
	public Button getBtnNext() {
		if(btnNext == null)
		{
			btnNext = new Button("NEXT");
		}
		btnNext.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				setNumCard(1);
				/*Set de number of card*/
				if(getNumCard()>=Link.getDeck().getListCards().size())
				{
					setNumCard(0);
				}
				getCardViewAdmin();
			}
		});
		return btnNext;
	}

	/**
	 * This function creates a button that when clicked, will display the previous card in the deck
	 * 
	 * @return The button is being returned.
	 */
	public Button getBtnPrevious() {
		if(btnPrevious == null)
		{
			btnPrevious = new Button("PREVIOUS");
		}
		//Go to the previous card
		btnPrevious.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event){
				/*Set de number of card*/
				if(getNumCard()<=0)
				{
					setNumCard(Link.getDeck().getListCards().size());
				}
				setNumCard(-1);;
				getCardViewAdmin();
			}
		});
		return btnPrevious;
	}

	/**
	 * If the button is null, create a new button with the text "Back" and return it
	 * 
	 * @return A new button object is being returned.
	 */
	public Button getBtnBack() {
		if(btnBack == null)
		{
			btnBack = new Button("Back");
		}
		return btnBack;
	}

	/**
	 * Returns the text object that contains the text of the author
	 * 
	 * @return The text object.
	 */
	public Text getTxtText() {
		if(txtText == null)
		{
			txtText = new Text("AUTHOR");
		}
		return txtText;
	}

	/**
	 * Returns the text object that displays the title of the game
	 * 
	 * @return A Text object.
	 */
	public Text getTxtTitle() {
		if(txtTitle == null)
		{
			txtTitle = new Text("CARDS");
		}
		return txtTitle;
	}

	/**
	 * Returns the VBox that contains the title
	 * 
	 * @return A VBox object.
	 */
	public VBox getVbTitle() {
		if(vbTitle == null)
		{
			vbTitle = new VBox();
		}
		return vbTitle;
	}

	/**
	 * This function creates a new Label object and returns it
	 * 
	 * @return A Label object.
	 */
	public Label getLblCardCount() {
		if(lblCardCount == null)
		{
			lblCardCount = new Label();
		}
		return lblCardCount;
	}

	/**
	 * This function creates a new Button object and returns it
	 * 
	 * @return A Button.
	 */
	public Button getBtnDelete() {
		if(btnDelete == null)
		{
			btnDelete = new Button();
			btnDelete.setDisable(true);
			//Creating a graphic (image)
			Image imgDel = new Image("img/button/removeCard.png");
			ImageView viewDel = new ImageView(imgDel);
			btnDelete.setGraphic(viewDel);
			/*CSS settings to make the button round*/
			btnDelete.getStyleClass().add("roundButton");

			/*Image size*/
			viewDel.setFitHeight(35);
			viewDel.setFitWidth(35);

			//Delete a card 
			btnDelete.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					Link.getDeck().removeCard(Link.getDeck().getListCards().get(numCard));
					Write.writeJson(Link.getDeck(),"questions.json");
					numCard=Link.getDeck().getListCards().size();
					Link.jsonCall();
				}
			});
		}
		return btnDelete;
	}

	/**
	 * The function creates a button with an image on it
	 * 
	 * @return The button is being returned.
	 */
	public Button getBtnAdd() {
		if(btnAdd == null)
		{
			btnAdd = new Button();
			// Disabling the button.
			btnAdd.setDisable(true);
			//Creating a graphic (image)
			Image imgAdd = new Image("img/button/addCard.png");
			ImageView viewAdd = new ImageView(imgAdd);
			btnAdd.setGraphic(viewAdd);
			/*CSS settings to make the button round*/
			btnAdd.getStyleClass().add("roundButton");

			/*Image size*/
			viewAdd.setFitHeight(35);
			viewAdd.setFitWidth(35);
		}
		return btnAdd;
	}

	/**
	 * The function creates a button with a graphic (image) and sets the image size
	 * 
	 * @return The button is being returned.
	 */
	public Button getBtnModify() {
		if(btnModify == null)
		{
			btnModify = new Button();
			btnModify.setDisable(true);
			//Creating a graphic (image)
			Image imgMod = new Image("img/button/modifyCard.png");
			ImageView viewMod = new ImageView(imgMod);
			btnModify.setGraphic(viewMod);
			/*CSS settings to make the button round*/
			btnModify.getStyleClass().add("roundButton");

			/*Image size*/
			viewMod.setFitHeight(35);
			viewMod.setFitWidth(35);
		}
		return btnModify;
	}

	/**
	 * If the variable is null, create a new instance of the class and assign it to the variable
	 * 
	 * @return The ViewAddCardAp object.
	 */
	public ViewAddCardAp getVwaddCard() {
		if(vwaddCard == null)
		{
			vwaddCard = new ViewAddCardAp();
		}
		return vwaddCard;
	}

	/**
	 * Returns the Label object named lblAuthors
	 * 
	 * @return A Label object.
	 */
	public Label getLblAuthors() {
		if(lblAuthors == null)
		{
			lblAuthors = new Label();
		}
		return lblAuthors;
	}

	/**
	 * > This function returns the number of cards in the deck
	 * 
	 * @return The value of the variable numCard.
	 */
	public static int getNumCard() {
		return numCard;
	}

	/**
	 * This function sets the number of cards in the deck
	 * 
	 * @param i the number of cards to add or subtract from the current number of cards.
	 */
	public static void setNumCard(int i) {
		if(i==1 || i==-1)
		{
			numCard = numCard + i;
		}
		else
		{
			numCard = i;
		}
	}

	/**
	 * The function creates a button with a graphic (image) and sets the CSS settings to make the button
	 * round
	 * 
	 * @return The button is being returned.
	 */
	public Button getBtnChallenges() {
		if(btnChallenges == null)
		{
			btnChallenges = new Button();

			//Creating a graphic (image)
			Image imgChall = new Image("img/button/challenge.png");
			ImageView viewChall = new ImageView(imgChall);
			btnChallenges.setGraphic(viewChall);
			/*CSS settings to make the button round*/
			btnChallenges.getStyleClass().add("roundButton");

			/*Image size*/
			viewChall.setFitHeight(50);
			viewChall.setFitWidth(50);
		}	
		return btnChallenges;
	}

	/**
	 * If the vwAdminAccess object is null, create a new one and return it
	 * 
	 * @return The ViewAdminAccesAp object is being returned.
	 */
	public ViewAdminAccesAp getVwAdminAccess() {
		if(vwAdminAccess == null)
		{
			vwAdminAccess = new ViewAdminAccesAp();
		}
		return vwAdminAccess;
	}
}