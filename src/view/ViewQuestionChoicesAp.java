package view;

import javafx.animation.AnimationTimer;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class ViewQuestionChoicesAp extends AnchorPane  {
	private HBox hbBottom;
	private Button btnValidate;
	private RadioButton choice1;
	private RadioButton choice2;
	private RadioButton choice3;
	private Label lblQuestion;
	private Label lblCategory;
	private Label lblChrono;
	private int chrono;
	private ViewAddPlayerAp addPlayVw;
	private ViewBoardGameSp boardGaVw;
	private ViewAnswerAp vwAnswer;

	public ViewQuestionChoicesAp() {
		// This is setting the bottom anchor of the button to 205 and the right anchor to 200.
		AnchorPane.setBottomAnchor(getBtnValidate(), 260.);
		AnchorPane.setLeftAnchor(getBtnValidate(), 975.);

		this.getChildren().addAll( getBtnValidate());

		// This is adding the label to the bottom of the AnchorPane.
		AnchorPane.setBottomAnchor(getLblCategory(), 260.);
		AnchorPane.setLeftAnchor(getLblCategory(), 500.);
		getLblCategory().getStyleClass().add("lblWhite");

		this.getChildren().addAll(getLblCategory());

		// This is adding the label to the bottom of the AnchorPane.
		AnchorPane.setBottomAnchor(getLblChrono(), 260.);
		AnchorPane.setLeftAnchor(getLblChrono(), 775.);
		getLblChrono().getStyleClass().add("lblWhite");

		// This is the code for the radio buttons.
		ToggleGroup group = new ToggleGroup();

		choice1 = new RadioButton("Choices 1");
		getChoice1().setToggleGroup(group);
		getChoice1().getStyleClass().add("radiobox");
		choice2 = new RadioButton("Choices 2");
		getChoice2().setToggleGroup(group);
		getChoice2().getStyleClass().add("radiobox");
		choice3 = new RadioButton("Choices 3");
		getChoice3().setToggleGroup(group);
		getChoice3().getStyleClass().add("radiobox");

		// This is setting the bottom anchor of the radio buttons to 50 and the left anchor to 250.
		AnchorPane.setBottomAnchor(choice1, 550.);
		AnchorPane.setLeftAnchor(choice1, 500.);

		// This is setting the bottom anchor of the radio buttons to 50 and the left anchor to 850.
		AnchorPane.setBottomAnchor(choice2, 500.);
		AnchorPane.setLeftAnchor(choice2, 500.);

		// This is setting the bottom anchor of the radio buttons to 50 and the left anchor to 250.
		AnchorPane.setBottomAnchor(choice3, 450.);
		AnchorPane.setLeftAnchor(choice3, 500.);

		// This is adding the radio buttons to the bottom of the AnchorPane.
		this.getChildren().addAll(getChoice1(),getChoice2(),getChoice3(),getLblChrono());

		// This is setting the bottom anchor of the label to 130 and the left anchor to 250.
		AnchorPane.setBottomAnchor(getLblQuestion(), 615.);
		AnchorPane.setLeftAnchor(getLblQuestion(), 500.);

		// This is adding the label to the bottom of the AnchorPane.
		this.getChildren().addAll(getLblQuestion());
	}

	/**
	 * It creates a new HBox if it doesn't exist, and returns it.
	 * 
	 * @return A HBox
	 */
	public HBox getHbBottom() {
		if(hbBottom == null)
		{
			hbBottom = new HBox();
		}
		return hbBottom;
	}

	/**
	 * Returns a button that is used to validate
	 * 
	 * @return A button.
	 */
	public Button getBtnValidate() {
		if(btnValidate == null)
		{
			btnValidate = new Button("Valid");
		}
		return btnValidate;
	}

	/**
	 * Returns the RadioButton object named "choice1"
	 * 
	 * @return A RadioButton object.
	 */
	public RadioButton getChoice1() {
		if(choice1 == null)
		{
			choice1 = new RadioButton();
		}
		return choice1;
	}

	/**
	 * Returns the RadioButton object named "choice2"
	 * 
	 * @return A RadioButton object.
	 */
	public RadioButton getChoice2() {
		if(choice2 == null)
		{
			choice2 = new RadioButton();
		}
		return choice2;
	}

	/**
	 * Returns the RadioButton object named "choice3"
	 * 
	 * @return A RadioButton object.
	 */
	public RadioButton getChoice3() {
		if(choice3 == null)
		{
			choice3 = new RadioButton();
		}
		return choice3;
	}

	/**
	 * Returns a Label object that is used to display the question
	 * 
	 * @return A Label object.
	 */
	public Label getLblQuestion() {
		if(lblQuestion == null)
		{
			lblQuestion = new Label();
			lblQuestion.setPrefWidth(700);
			lblQuestion.setWrapText(true);
			getLblQuestion().getStyleClass().add("lblWhite");
		    getLblQuestion().setStyle("-fx-underline: true;");
		    lblQuestion.setAlignment(Pos.CENTER);
		}
		return lblQuestion;
	}

	/**
	 * Returns a Label object that is used to display the question
	 * 
	 * @return A Label object.
	 */
	public Label getLblCategory() {
		if(lblCategory == null)
		{
			lblCategory = new Label("Category");
			
		}
		return lblCategory;
	}

	/**
	 * It creates a new instance of the ViewAddPlayerAp class if it does not already exist.
	 * 
	 * @return A ViewAddPlayerAp object.
	 */
	public ViewAddPlayerAp getAddPlayVw() {
		if(addPlayVw == null)
		{
			addPlayVw = new ViewAddPlayerAp();
		}
		return addPlayVw;
	}

	/**
	 * Returns a Label object that is used to display the question
	 * 
	 * @return A Label object.
	 */
	public Label getLblChrono() {
		if(lblChrono == null)
		{
			lblChrono = new Label("00:30");
		}
		return lblChrono;
	}

	/**
	 * Returns the value of the chrono variable
	 * 
	 * @return The value of the chrono field.
	 */
	public int getChrono() {
		return chrono;
	}

	/**
	 * @param chrono The number of the chrono to set.
	 */
	public void setChrono(int chro) {
		if(chro < 0)
		{
			this.chrono = chrono + chro;
		}
		else
		{
			this.chrono = chro;
		}
	}

	

	/**
	 * It creates a new instance of the ViewBoardGameSp class if it does not already exist.
	 * 
	 * @return A new instance of ViewBoardGameSp.
	 */
	public ViewBoardGameSp getBoardGaVw() {
		if(boardGaVw == null)
		{
			boardGaVw = new ViewBoardGameSp();
		}
		return boardGaVw;
	}

	/**
	 * This function creates a new instance of the ViewAnswerAp class if one does not already exist
	 * 
	 * @return The ViewAnswerAp object.
	 */
	public ViewAnswerAp getVwAnswer() {
		if(vwAnswer == null)
		{
			vwAnswer = new ViewAnswerAp();
		}
		return vwAnswer;
	}
}