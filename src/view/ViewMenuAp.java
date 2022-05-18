package view;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class ViewMenuAp extends AnchorPane{
	private Button btnAdmin;
	private Button btnCard;
	private Button btnPlay;
	private Button btnSettings;
	private Button btnCredits;
	private Button btnExit;

	public ViewMenuAp() {
		// This is adding a CSS class to the scene.
		this.getStyleClass().add("sceneBack2");

		// This is creating a graphic (image) for the button.
		Image imgAdmin = new Image("img/button/admin.png");
		ImageView viewAdmin = new ImageView(imgAdmin);
		getBtnAdmin().setGraphic(viewAdmin);
		/*CSS settings to make the button round*/
		getBtnAdmin().getStyleClass().add("roundButton");

		/*Image size*/
		viewAdmin.setFitHeight(50);
		viewAdmin.setFitWidth(50);

		// This is creating a graphic (image) for the button.
		Image imgCard = new Image("img/button/card.png");
		ImageView viewCard= new ImageView(imgCard);
		getBtnCard().setGraphic(viewCard);
		/*CSS settings to make the button round*/
		getBtnCard().getStyleClass().add("roundButton");

		/*Image size*/
		viewCard.setFitHeight(50);
		viewCard.setFitWidth(50);

		// This is creating a graphic (image) for the button.
		Image imgSettings = new Image("img/button/settings.png");
		ImageView viewSettings= new ImageView(imgSettings);
		getBtnSettings().setGraphic(viewSettings);
		/*CSS settings to make the button round*/
		getBtnSettings().getStyleClass().add("roundButton");

		/*Image size*/
		viewSettings.setFitHeight(50);
		viewSettings.setFitWidth(50);

		// This is setting the position of the button.
		AnchorPane.setTopAnchor(getBtnAdmin(), 10.);
		AnchorPane.setLeftAnchor(getBtnAdmin(), 10.);

		// This is setting the position of the button.
		AnchorPane.setTopAnchor(getBtnCard(), 10.);
		AnchorPane.setLeftAnchor(getBtnCard(), 85.);


		// This is adding the buttons to the scene.
		this.getChildren().addAll(getBtnCard(),getBtnAdmin());

		// This is setting the position of the button.
		AnchorPane.setBottomAnchor(getBtnPlay(), 250.);
		AnchorPane.setLeftAnchor(getBtnPlay(), 550.);

		// This is setting the position of the button.
		AnchorPane.setBottomAnchor(getBtnCredits(), 250.);
		AnchorPane.setLeftAnchor(getBtnCredits(), 850.);

		// This is setting the position of the button.
		AnchorPane.setBottomAnchor(getBtnExit(), 250.);
		AnchorPane.setLeftAnchor(getBtnExit(), 1150.);

		// This is setting the position of the button.
		AnchorPane.setTopAnchor(getBtnSettings(), 10.);
		AnchorPane.setRightAnchor(getBtnSettings(), 35.);

		// This is adding the buttons to the scene.
		this.getChildren().addAll(getBtnPlay(),getBtnCredits(),getBtnExit(), getBtnSettings());

	}

	/**
	 * It creates a new button object and returns it.
	 * 
	 * @return A button.
	 */
	public Button getBtnAdmin() {
		if(btnAdmin == null)
		{
			btnAdmin = new Button();
		}
		return btnAdmin;
	}

	/**
	 * It creates a new button object and returns it.
	 * 
	 * @return A Button object.
	 */
	public Button getBtnCard() {
		if(btnCard == null)
		{
			btnCard = new Button();
		}
		return btnCard;
	}

	/**
	 * Returns the Button object named btnPlay
	 * 
	 * @return A button object
	 */
	public Button getBtnPlay() {
		if(btnPlay == null)
		{
			btnPlay = new Button("PLAY");
		}
		return btnPlay;
	}

	/**
	 * Returns the Button object named btnCredits
	 * 
	 * @return A button object
	 */
	public Button getBtnCredits() {
		if(btnCredits == null)
		{
			btnCredits = new Button("CREDITS");
		}
		return btnCredits;
	}

	/**
	 * Returns the Button object named btnExit
	 * 
	 * @return A button object
	 */
	public Button getBtnExit() {
		if(btnExit == null)
		{
			btnExit = new Button("EXIT");
		}
		return btnExit;
	}

	/**
	 * If the button is null, create a new button. Otherwise, return the existing button
	 * 
	 * @return A new Button object.
	 */
	public Button getBtnSettings() {
		if(btnSettings == null)
		{
			btnSettings = new Button();
		}
		return btnSettings;
	}
}