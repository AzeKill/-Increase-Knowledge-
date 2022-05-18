package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import modele.RandomNumGen;
import modele.Shift;

public class ViewDiceAp extends AnchorPane{
	private Button btnThrow;
	private VBox vbThrow;
	private RandomNumGen randomNum;
	private Shift shift;
	private ViewAddPlayerAp playersVw;
	private ViewBoardGameSp boardgameVw;
	private ViewQuestionChoicesAp questChoicesVw;

	public ViewDiceAp()
	{   
		// This is adding the button to the VBox.
		vbThrow = new VBox(0, getBtnThrow());
		vbThrow.setAlignment(Pos.TOP_CENTER);
		vbThrow.setPadding(new Insets(250,0, 0, 100));
		this.setPrefSize(300, 150);
		this.getChildren().addAll(vbThrow);
	}

	/**
	 * It creates a button that will be used to throw the dice.
	 * 
	 * @return A button
	 */
	public Button getBtnThrow() {
		if(btnThrow == null)
		{
			btnThrow = new Button();
			// Adding the image to the button.
			Image imgDie = new Image("img/button/imgDe/Die.png");
			ImageView viewDie = new ImageView(imgDie);
			getBtnThrow().setGraphic(viewDie);
			/*CSS settings to make the button round*/
			getBtnThrow().getStyleClass().add("recDice");
			/*Image size*/
			viewDie.setFitHeight(190);
			viewDie.setFitWidth(190);
		}
		return btnThrow;
	}

	/**
	 * This function returns a VBox object that is stored in the vbThrow variable. 
	 * If the vbThrow variable is null, then it creates a new VBox object and stores it in the vbThrow
	 * variable.
	 * 
	 * @return A VBox object.
	 */
	public VBox getVbThrow() {
		if(vbThrow == null)
		{
			vbThrow = new VBox();
		}
		return vbThrow;
	}

	/**
	 * This function creates a new RandomNumGen object and returns it
	 * 
	 * @return A RandomNumGen object.
	 */
	public RandomNumGen getRandomNum() {
		randomNum = new RandomNumGen();
		return randomNum;
	}

	/**
	 * Create a new Shift object and return it
	 * 
	 * @param tot the total number of shifts in the shift schedule
	 * @return A new instance of the Shift class.
	 */
	public Shift getShift(int tot) {
		shift = new Shift(tot);
		return shift;
	}

	/**
	 * It creates a new instance of the ViewAddPlayerAp class if it does not already exist.
	 * 
	 * @return A ViewAddPlayerAp object.
	 */
	public ViewAddPlayerAp getPlayersVw() {
		if(playersVw == null)
		{
			playersVw = new ViewAddPlayerAp();
		}
		return playersVw;
	}

	/**
	 * It creates a new instance of the ViewBoardGameSp class if it does not exist.
	 * 
	 * @return A new instance of ViewBoardGameSp.
	 */
	public ViewBoardGameSp getBoardgameVw() {
		if(boardgameVw == null)
		{
			boardgameVw = new ViewBoardGameSp();
		}
		return boardgameVw;
	}

	/**
	 * It creates a new instance of the ViewQuestionChoicesAp class.
	 * 
	 * @return A ViewQuestionChoicesAp object.
	 */
	public ViewQuestionChoicesAp getQuestChoicesVw() {
		if(questChoicesVw == null)
		{
			questChoicesVw = new ViewQuestionChoicesAp();
		}
		return questChoicesVw;
	}
}