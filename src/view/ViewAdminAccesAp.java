package view;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ViewAdminAccesAp extends AnchorPane{
	private Label lblAcces;
	private TextField txtUsers;
	private PasswordField txtPassword;
	private Button btnConnexion;
	private Button btnDeconnexion;
	private Button btnBack;
	private VBox vbAcces;
	private VBox vbConnexion;
	private Label lblConnexion;

	public ViewAdminAccesAp() {
		// It creates a VBox with the spacing of 25 and adds the label, text fields, and buttons to it. It
		// then sets the top anchor to 400 and the left anchor to 500.
		vbAcces = new VBox(25, getLblAcces() ,getTxtUsers() ,getTxtPassword() ,getBtnConnexion(),getBtnDeconnexion(), getBtnBack());
		AnchorPane.setTopAnchor(getVbAcces(), 400.);
		AnchorPane.setLeftAnchor(getVbAcces(), 500.);

		// It creates a VBox with the spacing of 25 and adds the label to it. It then sets the top anchor to
		// 500 and the left anchor to 900.
		vbConnexion = new VBox(25,getLblConnexion());
		AnchorPane.setTopAnchor(getVbConnexion(), 500.);
		AnchorPane.setLeftAnchor(getVbConnexion(), 900.);

		// It sets the minimum width of the text fields to 250.
		getTxtUsers().setMinWidth(250);
		getTxtPassword().setMinWidth(250);

		// It adds the VBoxes to the AnchorPane.
		this.getChildren().addAll(getVbAcces(),getVbConnexion());
	}

	/**
	 * If the label is null, create a new label, set the text color to red, and return the label
	 * 
	 * @return The label lblAcces is being returned.
	 */
	public Label getLblAcces() {
		if(lblAcces == null)
		{
			lblAcces = new Label();
			lblAcces.setTextFill(Color.RED);
		}
		return lblAcces;
	}

	/**
	 * If the text field is null, create a new text field, set the prompt text, and return the text field
	 * 
	 * @return A TextField object.
	 */
	public TextField getTxtUsers() {
		if(txtUsers == null)
		{
			txtUsers = new TextField();
			txtUsers.setPromptText("Users");
		}
		return txtUsers;
	}

	/**
	 * If the txtPassword variable is null, create a new PasswordField object, set the prompt text to
	 * "Password", and return the txtPassword variable
	 * 
	 * @return A PasswordField object.
	 */
	public PasswordField getTxtPassword() {
		if(txtPassword == null)
		{
			txtPassword = new PasswordField();
			txtPassword.setPromptText("Password");
		}
		return txtPassword;
	}

	/**
	 * > If the button is null, create a new button with the text "Connexion" and return it
	 * 
	 * @return The button "Connexion"
	 */
	public Button getBtnConnexion() {
		if(btnConnexion == null)
		{
			btnConnexion = new Button("Connexion");
		}
		return btnConnexion;
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
	 * > If the variable vbAcces is null, then create a new VBox and return it
	 * 
	 * @return The VBox vbAcces is being returned.
	 */
	public VBox getVbAcces() {
		if(vbAcces == null)
		{
			vbAcces = new VBox();
		}
		return vbAcces;
	}

	/**
	 * It creates a button with the text "Deconnexion" and disables it.
	 * 
	 * @return The button "Deconnexion"
	 */
	public Button getBtnDeconnexion() {
		if(btnDeconnexion == null)
		{
			btnDeconnexion = new Button("Deconnexion");
			btnDeconnexion.setDisable(true);
		}
		return btnDeconnexion;
	}

	/**
	 * > If the variable vbConnexion is null, then create a new VBox and return it
	 * 
	 * @return A VBox object.
	 */
	public VBox getVbConnexion() {
		if(vbConnexion == null)
		{
			vbConnexion = new VBox();
		}
		return vbConnexion;
	}

	/**
	 * It creates a label with the text "You are not connected" and adds the style class "lblWhite" to it
	 * 
	 * @return A label with the text "You are not connected"
	 */
	public Label getLblConnexion() {
		if(lblConnexion == null)
		{
			lblConnexion = new Label("You are not connected");
			lblConnexion.getStyleClass().add("lblWhite");
		}
		return lblConnexion;
	}
}