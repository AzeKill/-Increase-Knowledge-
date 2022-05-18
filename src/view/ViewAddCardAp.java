package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ViewAddCardAp extends AnchorPane {
	private Rectangle rect;
	private Button btnQuit;
	private TextField txtfAuthor;
	private TextField txtfInterr;
	private TextField txtfChoices1;
	private TextField txtfChoices2;
	private TextField txtfChoices3;
	private RadioButton rbTrue1;
	private RadioButton rbTrue2;
	private RadioButton rbTrue3;
	private Label lblCateg;
	private Label lblError;
	private Button btnNext;

	public ViewAddCardAp() {
		// This is used to set the color of the rectangle.
		getRect().setFill(Color.web("#4586ff"));
		getRect().setArcWidth(100.0); 
		getRect().setArcHeight(80.0); 

		// This is used to set the position of the rectangle.
		AnchorPane.setLeftAnchor(getRect(), 375.);
		AnchorPane.setTopAnchor(getRect(),200.);

		// This is used to set the graphic of the button.
		Image imgQuit= new Image("img/button/quit.png");
		ImageView viewQuit = new ImageView(imgQuit);
		getBtnQuit().setGraphic(viewQuit);
		getBtnQuit().getStyleClass().add("roundButton");
		viewQuit.setFitHeight(50);
		viewQuit.setFitWidth(50);

		// This is used to set the position of the button.
		AnchorPane.setTopAnchor(getBtnQuit(), 210.);
		AnchorPane.setLeftAnchor(getBtnQuit(), 1370.);

		// This is used to set the position of the TextField.
		AnchorPane.setTopAnchor(getTxtfAuthor(), 210.);
		AnchorPane.setLeftAnchor(getTxtfAuthor(), 850.);

		// This is used to set the position of the TextField.
		AnchorPane.setTopAnchor(getTxtfInterr(), 350.);
		AnchorPane.setLeftAnchor(getTxtfInterr(), 425.);

		// This is used to set the position of the TextField.
		AnchorPane.setTopAnchor(getTxtfChoices1(), 450.);
		AnchorPane.setLeftAnchor(getTxtfChoices1(), 425.);

		// This is used to set the position of the TextField.
		AnchorPane.setTopAnchor(getTxtfChoices2(), 450.);
		AnchorPane.setLeftAnchor(getTxtfChoices2(), 825.);

		// This is used to set the position of the TextField.
		AnchorPane.setTopAnchor(getTxtfChoices3(), 450.);
		AnchorPane.setLeftAnchor(getTxtfChoices3(), 1225.);

		// This is used to make sure that only one radio button can be selected at a time.
		ToggleGroup group = new ToggleGroup();
		getRbTrue1().setToggleGroup(group);
		getRbTrue1().getStyleClass().add("radiobox");
		getRbTrue2().setToggleGroup(group);
		getRbTrue2().getStyleClass().add("radiobox");
		getRbTrue3().setToggleGroup(group);
		getRbTrue3().getStyleClass().add("radiobox");

		// This is used to set the position of the RadioButton.
		AnchorPane.setTopAnchor(getRbTrue1(), 500.);
		AnchorPane.setLeftAnchor(getRbTrue1(), 475.);

		// This is used to set the position of the RadioButton.
		AnchorPane.setTopAnchor(getRbTrue2(), 500.);
		AnchorPane.setLeftAnchor(getRbTrue2(), 875.);

		// This is used to set the position of the RadioButton.
		AnchorPane.setTopAnchor(getRbTrue3(), 500.);
		AnchorPane.setLeftAnchor(getRbTrue3(), 1275.);

		// This is used to set the position of the label.
		AnchorPane.setTopAnchor(getLblCateg(), 275.);
		AnchorPane.setLeftAnchor(getLblCateg(), 825.);
		getLblCateg().getStyleClass().add("lbl");

		// This is used to set the position of the button.
		AnchorPane.setTopAnchor(getBtnNext(), 600.);
		AnchorPane.setLeftAnchor(getBtnNext(), 800.);

		// This is used to set the position of the label.
		AnchorPane.setTopAnchor(getLblError(), 600.);
		AnchorPane.setLeftAnchor(getLblError(), 500.);

		// This is adding all the objects to the AnchorPane.
		this.getChildren().addAll(getRect(),getBtnQuit(),getTxtfAuthor(),getTxtfInterr(),getTxtfChoices1(),getTxtfChoices2(),getTxtfChoices3(),getRbTrue1(),getRbTrue2(),getRbTrue3(),getLblCateg(),getBtnNext(),getLblError());
	}

	/**
	 * Returns the rectangle
	 * 
	 * @return A rectangle object.
	 */
	public Rectangle getRect() {
		if(rect == null)
		{
			rect = new Rectangle(1100.,500.);
		}
		return rect;
	}

	/**
	 * Returns the Button
	 * 
	 * @return A Button object.
	 */
	public Button getBtnQuit() {
		if(btnQuit == null)
		{
			btnQuit = new Button();
		}
		return btnQuit;
	}

	/**
	 * `txtfAuthor` is a `TextField` object that is initialized to a new `TextField` object
	 * 
	 * @return The TextField object.
	 */
	public TextField getTxtfAuthor() {
		if(txtfAuthor == null)
		{
			txtfAuthor = new TextField();
			txtfAuthor.setPromptText("Author");			
		}
		return txtfAuthor;
	}

	/**
	 * > This function creates a text field for the user to enter an interrogation
	 * 
	 * @return The TextField object txtfInterr is being returned.
	 */
	public TextField getTxtfInterr() {
		if(txtfInterr == null)
		{
			txtfInterr = new TextField();
			txtfInterr.setPromptText("Interrogation");	
			txtfInterr.setPrefWidth(1000);
		}
		return txtfInterr;
	}

	/**
	 * This function creates a text field for the user to enter the first choice of the question
	 * 
	 * @return The textfield for choice 1.
	 */
	public TextField getTxtfChoices1() {
		if(txtfChoices1 == null)
		{
			txtfChoices1 = new TextField();
			txtfChoices1.setPromptText("Choice 1");	
			txtfChoices1.setPrefWidth(200);
		}
		return txtfChoices1;
	}

	/**
	 * This function creates a text field for the user to enter the second choice of the question
	 * 
	 * @return The textfield for choice 2.
	 */
	public TextField getTxtfChoices2() {
		if(txtfChoices2 == null)
		{
			txtfChoices2 = new TextField();
			txtfChoices2.setPromptText("Choice 2");	
			txtfChoices2.setPrefWidth(200);
		}
		return txtfChoices2;
	}

	/**
	 * This function creates a text field for the user to enter the third choice of the question
	 * 
	 * @return The textfield for choice 3.
	 */
	public TextField getTxtfChoices3() {
		if(txtfChoices3 == null)
		{
			txtfChoices3 = new TextField();
			txtfChoices3.setPromptText("Choice 3");	
			txtfChoices3.setPrefWidth(200);
		}
		return txtfChoices3;
	}

	/**
	 * If the rbTrue1 variable is null, create a new RadioButton object with the label "True"
	 * 
	 * @return The radio button for the first question.
	 */
	public RadioButton getRbTrue1() {
		if(rbTrue1 == null)
		{
			rbTrue1 = new RadioButton("True");
		}

		return rbTrue1;
	}

	/**
	 * If the rbTrue2 variable is null, then create a new RadioButton object with the label "True" and
	 * assign it to the rbTrue2 variable
	 * 
	 * @return The radio button for the second question.
	 */
	public RadioButton getRbTrue2() {
		if(rbTrue2 == null)
		{
			rbTrue2 = new RadioButton("True");
		}
		return rbTrue2;
	}

	/**
	 * If the rbTrue3 variable is null, then create a new RadioButton object with the label "True" and
	 * assign it to the rbTrue3 variable
	 * 
	 * @return The radio button for the third question.
	 */
	public RadioButton getRbTrue3() {
		if(rbTrue3 == null)
		{
			rbTrue3 = new RadioButton("True");
		}
		return rbTrue3;
	}

	/**
	 * This function creates a new label object with the text "CATEGORY" and returns it
	 * 
	 * @return A new label with the text "CATEGORY"
	 */
	public Label getLblCateg() {
		if(lblCateg == null)
		{
			lblCateg = new Label("CATEGORY");
		}
		return lblCateg;
	}

	/**
	 * If the button is null, create a new button with the text "NEXT"
	 * 
	 * @return A new Button object is being returned.
	 */
	public Button getBtnNext() {
		if(btnNext == null)
		{
			btnNext = new Button("NEXT");
		}
		return btnNext;
	}

	/**
	 * If the lblError variable is null, create a new Label object and set its text color to red
	 * 
	 * @return A label object.
	 */
	public Label getLblError() {
		if(lblError == null)
		{
			lblError = new Label();
			lblError.setTextFill(Color.RED);
		}
		return lblError;
	}
}