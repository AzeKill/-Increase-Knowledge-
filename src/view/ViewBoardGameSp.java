package view;

import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import modele.Category;
import modele.Shift;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class ViewBoardGameSp extends StackPane{
	private Button btnQuit;
	private Button btnScore;
	private AnchorPane apPosition;
	private ViewDiceAp vwDice;
	private ViewScoreGridAp vwScore;
	private ViewQuestionChoicesAp vwQuestChoice; 
	private HBox hbCenter;
	private Label lblQuestion;
	private Text txtTitle;
	private HBox hbText;
	private Shift shift;
	private GridPane gridGp;
	private Rectangle rec;
	private List listCateg;

	// The above code is creating a grid of squares with a random color.
	public ViewBoardGameSp()
	{	
		// Creating a list of categories.
		listCateg = new ArrayList();
		// Creating a GridPane.
		gridGp = new GridPane();
		gridGp.setPadding(new Insets(0.,0.,0.,0.));
		gridGp.setHgap(2.);
		gridGp.setVgap(2.);

		int value = -1;
		// The above code is creating a grid of rectangles and adding them to the grid.
		for (int col = 0; col < 12; col++) {
			// Creating a new Rectangle object with a width of 70 and a height of 70.
			rec = new Rectangle(70.,70.);
			// Setting the color of the rectangle based on the value of the variable value.
			if(value == -1)
			{
				getRec().setFill(Color.web("WHITE"));
				listCateg.add("CHALLENGES");
			}
			if(value == 0)
			{
				getRec().setFill(Color.web(Category.IDEAS.getColor()));
				listCateg.add(Category.IDEAS);
			}
			else if(value == 1)
			{
				getRec().setFill(Color.web(Category.SCIENCE.getColor()));
				listCateg.add(Category.SCIENCE);
			}
			else if(value == 2)
			{
				getRec().setFill(Color.web(Category.PLANET.getColor()));
				listCateg.add(Category.PLANET);
			}
			else if(value == 3)
			{
				getRec().setFill(Color.web(Category.HISTORY.getColor()));
				listCateg.add(Category.HISTORY);
			}
			else if(value == 4)
			{
				getRec().setFill(Color.web(Category.LITERATURE.getColor()));
				listCateg.add(Category.LITERATURE);
			}
			else if(value == 5)
			{
				getRec().setFill(Color.web(Category.COMPUTER.getColor()));
				listCateg.add(Category.COMPUTER);
			}
			else if(value == 6)
			{
				getRec().setFill(Color.BLACK);
				listCateg.add("CHALLENGES");
			}
			
			/*Rounded boxes*/
			getRec().setArcWidth(30.0);
			getRec().setArcHeight(15.0);
			/*Adding rectangles based on row and column*/
			GridPane.setRowIndex(getRec(), 0);
			GridPane.setColumnIndex(getRec(), col);
			gridGp.getChildren().addAll(getRec());
			value++;
			if(value>=7) {
				value=0;
			}
		}

		// The above code is creating a grid of rectangles and adding them to the grid.
		for (int row = 0; row < 10; row++) {
			// Creating a new Rectangle object with a width of 70 and a height of 70.
			rec = new Rectangle(70.,70.);
			// Setting the color of the rectangle based on the value of the variable value.
			if(value == 0)
			{
				getRec().setFill(Color.web(Category.IDEAS.getColor()));
				listCateg.add(Category.IDEAS);
			}
			else if(value == 1)
			{
				getRec().setFill(Color.web(Category.SCIENCE.getColor()));
				listCateg.add(Category.SCIENCE);
			}
			else if(value == 2)
			{
				getRec().setFill(Color.web(Category.PLANET.getColor()));
				listCateg.add(Category.PLANET);
			}
			else if(value == 3)
			{
				getRec().setFill(Color.web(Category.HISTORY.getColor()));
				listCateg.add(Category.HISTORY);
			}
			else if(value == 4)
			{
				getRec().setFill(Color.web(Category.LITERATURE.getColor()));
				listCateg.add(Category.LITERATURE);
			}
			else if(value == 5)
			{
				getRec().setFill(Color.web(Category.COMPUTER.getColor()));
				listCateg.add(Category.COMPUTER);
			}
			else if(value == 6)
			{
				getRec().setFill(Color.BLACK);
				listCateg.add("CHALLENGES");
			}
			/*Rounded boxes*/
			getRec().setArcWidth(30.0);
			getRec().setArcHeight(15.0);
			/*Adding rectangles based on row and column*/
			GridPane.setRowIndex(getRec(), row);
			GridPane.setColumnIndex(getRec(), 12);
			gridGp.getChildren().addAll(getRec());
			value++;
			if(value>=7) {
				value=0;
			}
		}

		// The above code is creating a grid of rectangles and adding them to the grid.
		for (int col = 11; col >= 0; col--) {
			// Creating a new Rectangle object with a width of 70 and a height of 70.
			rec = new Rectangle(70.,70.);
			// Setting the color of the rectangle based on the value of the variable value.
			if(value == 0)
			{
				getRec().setFill(Color.web(Category.IDEAS.getColor()));
				listCateg.add(Category.IDEAS);
			}
			else if(value == 1)
			{
				getRec().setFill(Color.web(Category.SCIENCE.getColor()));
				listCateg.add(Category.SCIENCE);
			}
			else if(value == 2)
			{
				getRec().setFill(Color.web(Category.PLANET.getColor()));
				listCateg.add(Category.PLANET);
			}
			else if(value == 3)
			{
				getRec().setFill(Color.web(Category.HISTORY.getColor()));
				listCateg.add(Category.HISTORY);
			}
			else if(value == 4)
			{
				getRec().setFill(Color.web(Category.LITERATURE.getColor()));
				listCateg.add(Category.LITERATURE);
			}
			else if(value == 5)
			{
				getRec().setFill(Color.web(Category.COMPUTER.getColor()));
				listCateg.add(Category.COMPUTER);
			}
			else if(value == 6)
			{
				getRec().setFill(Color.BLACK);
				listCateg.add("CHALLENGES");
			}
			/*Rounded boxes*/
			getRec().setArcWidth(30.0);
			getRec().setArcHeight(15.0);
			/*Adding rectangles based on row and column*/
			GridPane.setRowIndex(getRec(), 9);
			GridPane.setColumnIndex(getRec(), col);
			gridGp.getChildren().addAll(getRec());
			value++;
			if(value>=7) {
				value=0;
			}
		}

		// The above code is creating a grid of rectangles and adding them to the grid.
		for (int row = 8; row > 0; row--) {
			// Creating a new Rectangle object with a width of 70 and a height of 70.
			rec = new Rectangle(70.,70.);
			// Setting the color of the rectangle based on the value of the variable value.
			if(value == 0)
			{
				getRec().setFill(Color.web(Category.IDEAS.getColor()));
				listCateg.add(Category.IDEAS);
			}
			else if(value == 1)
			{
				getRec().setFill(Color.web(Category.SCIENCE.getColor()));
				listCateg.add(Category.SCIENCE);
			}
			else if(value == 2)
			{
				getRec().setFill(Color.web(Category.PLANET.getColor()));
				listCateg.add(Category.PLANET);
			}
			else if(value == 3)
			{
				getRec().setFill(Color.web(Category.HISTORY.getColor()));
				listCateg.add(Category.HISTORY);
			}
			else if(value == 4)
			{
				getRec().setFill(Color.web(Category.LITERATURE.getColor()));
				listCateg.add(Category.LITERATURE);
			}
			else if(value == 5)
			{
				getRec().setFill(Color.web(Category.COMPUTER.getColor()));
				listCateg.add(Category.COMPUTER);
			}
			else if(value == 6)
			{
				getRec().setFill(Color.BLACK);
				listCateg.add("CHALLENGES");
			}
			/*Rounded boxes*/
			getRec().setArcWidth(30.0);
			getRec().setArcHeight(15.0);
			/*Adding rectangles based on row and column*/
			GridPane.setRowIndex(getRec(), row);
			GridPane.setColumnIndex(getRec(), 0);
			gridGp.getChildren().addAll(getRec());
			value++;
			if(value>=7) {
				value=0;
			}
		}

		// Creating a new instance of the class ViewQuestionChoicesAp and setting the bottom anchor of the
		// view to 0.
		vwQuestChoice = new ViewQuestionChoicesAp();
		AnchorPane.setBottomAnchor(vwQuestChoice, 00.);

		// Creating an AnchorPane.
		apPosition = new AnchorPane();

		// Setting the top and right anchors of the buttons.
		AnchorPane.setTopAnchor(getBtnQuit(), 10.);
		AnchorPane.setRightAnchor(getBtnQuit(), 20.);

		AnchorPane.setTopAnchor(getBtnScore(), 10.);
		AnchorPane.setRightAnchor(getBtnScore(), 100.);

		// Adding the buttons and the view question choices to the AnchorPane.
		apPosition.getChildren().addAll(getBtnQuit(), getBtnScore(),vwQuestChoice);

		// This is creating a new instance of the class ViewDiceAp and setting the padding of the view to 0.
		vwDice = new ViewDiceAp();
		vwDice.setPadding(new Insets(0.,0.,0.,0.));

		// This is creating a new instance of the class HBox and setting the max height of the view to 40.
		hbCenter = new HBox(80);
		hbCenter.setMaxHeight(40.);

		/*game title in an HBox*/
		txtTitle  = new Text("Increase Knowledge");
		hbText = new HBox(30,txtTitle);
		getHbText().setAlignment(Pos.TOP_CENTER);
		getHbText().setPadding(new Insets(10.,10., 10., 10.));
		getTxtTitle().getStyleClass().add("aftxt");

		// This is creating a new instance of the class ViewScoreGridAp and setting the padding of the view
		vwScore = new ViewScoreGridAp();
		vwScore.setPadding(new Insets(100.,0.,0.,0.));

		// This is adding the score view, the text view, the anchor pane and the HBox to the StackPane.
		this.getChildren().addAll(getScoreVw(),getHbText(),getApPosition(),getHbCenter());		    
	}

	/**
	 * It creates a button that will be used to quit the game.
	 * 
	 * @return A button.
	 */
	public Button getBtnQuit() {
		if(btnQuit == null)
		{
			btnQuit = new Button();
			// Creating a graphic (image) and adding it to the button.
			Image imgQuit= new Image("img/button/quit.png");
			ImageView viewQuit = new ImageView(imgQuit);
			btnQuit.setGraphic(viewQuit);
			btnQuit.getStyleClass().add("roundButton");
			viewQuit.setFitHeight(50);
			viewQuit.setFitWidth(50);
		}
		return btnQuit;
	}

	/**
	 * It creates a button that will be used to display the score.
	 * 
	 * @return A button
	 */
	public Button getBtnScore() {
		if(btnScore == null)
		{
			btnScore = new Button();
			// Creating a graphic (image) and adding it to the button.
			Image imgQuit= new Image("img/boardgame/score.png");
			ImageView viewQuit = new ImageView(imgQuit);
			btnScore.setGraphic(viewQuit);
			btnScore.getStyleClass().add("roundButton");
			viewQuit.setFitHeight(50);
			viewQuit.setFitWidth(50);
		}
		return btnScore;
	}

	/**
	 * Returns the AnchorPane that contains the position information
	 * 
	 * @return The AnchorPane that is being returned is the apPosition that was created in the
	 * getApPosition method.
	 */
	public AnchorPane getApPosition() {
		if(apPosition == null)
		{
			apPosition = new AnchorPane();
		}
		return apPosition;
	}

	/**
	 * This function creates a new ViewDiceAp object if one does not exist, and returns it
	 * 
	 * @return The ViewDiceAp class.
	 */
	public ViewDiceAp getDiceVw() {
		if(vwDice == null)
		{
			vwDice = new ViewDiceAp();
			getLblQuestion();
		}
		return vwDice;
	}

	/**
	 * Returns the HBox that is the center of the window
	 * 
	 * @return A HBox object.
	 */
	public HBox getHbCenter() {
		if(hbCenter == null)
		{
			hbCenter = new HBox();
		}
		return hbCenter;
	}

	/**
	 * This function creates a new Label object and returns it
	 * 
	 * @return A Label object.
	 */
	public Label getLblQuestion() {
		if(lblQuestion == null)
		{
			lblQuestion = new Label();
		}
		return lblQuestion;
	}

	/**
	 * Returns the text object that contains the title of the page
	 * 
	 * @return A Text object.
	 */
	public Text getTxtTitle() {
		if(txtTitle == null)
		{
			txtTitle = new Text();
		}
		return txtTitle;
	}

	/**
	 * Returns the HBox that contains the text
	 * 
	 * @return A HBox.
	 */
	public HBox getHbText() {
		if(hbText == null)
		{
			hbText = new HBox();
		}
		return hbText;
	}

	/**
	 * It creates a new instance of the ViewScoreGridAp class if one does not already exist.
	 * 
	 * @return A ViewScoreGridAp object.
	 */
	public ViewScoreGridAp getScoreVw() {
		if(vwScore == null)
		{
			vwScore = new ViewScoreGridAp();
		}
		return vwScore;
	}

	/**
	 * This function returns a ViewQuestionChoicesAp object
	 * 
	 * @return A ViewQuestionChoicesAp object.
	 */
	public ViewQuestionChoicesAp getQuestChoiceVw() {
		if(vwQuestChoice == null)
		{
			vwQuestChoice = new ViewQuestionChoicesAp();
		}
		return vwQuestChoice;
	}

	/**
	 * Returns the shift
	 * 
	 * @return A new Shift object.
	 */
	public Shift getShift() {
		if(shift == null)
		{
			shift = new Shift(0);
		}
		return shift;
	}

	/**
	 * This function returns the GridPane object
	 * 
	 * @return A GridPane object.
	 */
	public GridPane getGridGp() {
		if(gridGp == null)
		{
			gridGp = new GridPane();
		}
		return gridGp;
	}

	/**
	 * Returns a rectangle object that represents the bounding box of the shape
	 * 
	 * @return A rectangle object.
	 */
	public Rectangle getRec() {
		if(rec == null)
		{
			rec = new Rectangle();
		}
		return rec;
	}

	/**
	 * This function returns a list of all the categories in the database
	 * 
	 * @return A list of categories.
	 */
	public List getListCateg() {
		return listCateg;
	}
}