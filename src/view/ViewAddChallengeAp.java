package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ViewAddChallengeAp extends AnchorPane {
	private TextField txtfChallenges;
	private Button btnValidate;
	private Label lblError;
	private Button btnQuit;

	// This is the constructor of the class ViewAddChallengeAp.
	public ViewAddChallengeAp() {

		//Creating a graphic (image)
		Image imgChal = new Image("img/logo/Challenge.png");
		ImageView viewChal = new ImageView(imgChal);

		// Setting the position of the image.
		AnchorPane.setLeftAnchor(viewChal, 1200.);
		AnchorPane.setTopAnchor(viewChal, 450.);

		// Creating a rectangle with a width of 1000 and a height of 300. It is then setting the color of the
		// rectangle to a shade of blue. It is then setting the arc width and height to 100 and 80
		// respectively.
		Rectangle rec = new Rectangle(1000.,300.);
		rec.setFill(Color.web("#00c2cb"));
		rec.setArcWidth(100.0); 
		rec.setArcHeight(80.0); 

		// Setting the position of the textfield.
		AnchorPane.setLeftAnchor(getTxtfChallenges(), 510.);
		AnchorPane.setTopAnchor(getTxtfChallenges(), 425.);

		// This is used to set the position of the button.
		AnchorPane.setTopAnchor(getBtnQuit(), 360.);
		AnchorPane.setLeftAnchor(getBtnQuit(), 1370.);

		// Setting the position of the button.
		AnchorPane.setTopAnchor(getBtnValidate(), 525.);
		AnchorPane.setLeftAnchor(getBtnValidate(), 600.);

		// Setting the position of the rectangle.
		AnchorPane.setLeftAnchor(rec, 450.);
		AnchorPane.setTopAnchor(rec, 350.);

		// This is used to set the position of the label.
		AnchorPane.setTopAnchor(getLblError(), 600.);
		AnchorPane.setLeftAnchor(getLblError(), 500.);

		this.getChildren().addAll(rec,getTxtfChallenges(),getBtnValidate(),getBtnQuit(),viewChal,getLblError());
	}

	/**
	 * > This function creates a new text field if it doesn't already exist, sets the prompt text to "NEW
	 * CHALLENGE", and sets the width to 800
	 * 
	 * @return The textfield is being returned.
	 */
	public TextField getTxtfChallenges() {
		if(txtfChallenges == null)
		{
			txtfChallenges = new TextField();
			txtfChallenges.setPromptText("NEW CHALLENGE");	
			txtfChallenges.setPrefWidth(800);
		}
		return txtfChallenges;
	}

	/**
	 * If the button is null, create a new button with the text "VALIDATE"
	 * 
	 * @return A new Button object is being returned.
	 */
	public Button getBtnValidate() {
		if(btnValidate == null)
		{
			btnValidate = new Button("VALIDATE");
		}
		return btnValidate;
	}

	/**
	 * This function is used to create the quit button
	 * 
	 * @return The button is being returned.
	 */
	public Button getBtnQuit() {
		if(btnQuit == null)
		{
			btnQuit = new Button();
			// This is used to set the graphic of the button.
			Image imgQuit= new Image("img/button/quit.png");
			ImageView viewQuit = new ImageView(imgQuit);
			getBtnQuit().setGraphic(viewQuit);
			getBtnQuit().getStyleClass().add("roundButton");
			viewQuit.setFitHeight(50);
			viewQuit.setFitWidth(50);
		}
		return btnQuit;
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