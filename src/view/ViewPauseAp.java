package view;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ViewPauseAp extends AnchorPane{
	private Button btnMenu;
	private Button btnExit;
	private Button btnQuit;
	private Text txtTitle;
	private Rectangle recPause;
	private CheckBox cbMute;

	public ViewPauseAp() {

		getRecPause().setArcWidth(100.0); 
		getRecPause().setArcHeight(80.0); 

		// This is setting the position of the rectangle.
		AnchorPane.setLeftAnchor(getRecPause(), 750.);
		AnchorPane.setBottomAnchor(getRecPause(),350.);

		// This is setting the position of the text.
		AnchorPane.setLeftAnchor(getTxtTitle(), 865.);
		AnchorPane.setBottomAnchor(getTxtTitle(),750.);		
		getTxtTitle().getStyleClass().add("aftxt");

		// This is setting the position of the button.
		AnchorPane.setLeftAnchor(getBtnMenu(), 825.);
		AnchorPane.setBottomAnchor(getBtnMenu(),500.);

		// This is setting the position of the button.
		AnchorPane.setLeftAnchor(getBtnExit(), 825.);
		AnchorPane.setBottomAnchor(getBtnExit(),400.);

		AnchorPane.setLeftAnchor(getCbMute(), 852.);
		AnchorPane.setBottomAnchor(getCbMute(),600.);

		// This is setting the graphic of the button.
		Image imgQuit= new Image("img/button/quit.png");
		ImageView viewQuit = new ImageView(imgQuit);
		getBtnQuit().setGraphic(viewQuit);
		getBtnQuit().getStyleClass().add("roundButton");
		viewQuit.setFitHeight(50);
		viewQuit.setFitWidth(50);
		// This is setting the position of the button.
		AnchorPane.setBottomAnchor(getBtnQuit(), 770.);
		AnchorPane.setLeftAnchor(getBtnQuit(), 1065.);

		// This is adding all the elements to the view.
		this.getChildren().addAll(getRecPause(), getTxtTitle(), getBtnMenu(), getBtnExit(),getCbMute(), getBtnQuit());
	}

	/**
	 * Returns a button with the text "Menu" if it hasn't been created yet
	 * 
	 * @return A button object.
	 */
	public Button getBtnMenu() {
		if(btnMenu == null)
		{
			btnMenu = new Button("Menu");
		}
		return btnMenu;
	}

	/**
	 * Returns a button with the text "Exit" if it hasn't been created yet
	 * 
	 * @return A button object.
	 */
	public Button getBtnExit() {
		if(btnExit == null)
		{
			btnExit = new Button("Exit");
		}
		return btnExit;
	}

	/**
	 * Returns the Text object
	 * 
	 * @return A Text object.
	 */
	public Text getTxtTitle() {
		if(txtTitle == null)
		{
			txtTitle = new Text("Pause");
		}
		return txtTitle;
	}

	/**
	 * It creates a rectangle that is black.
	 * 
	 * @return A rectangle.
	 */
	public Rectangle getRecPause() {
		if(recPause == null)
		{
			recPause = new Rectangle(400.,500.);
			recPause.setFill(Color.web("#4586ff"));
		}
		return recPause;
	}

	/**
	 * Returns the Button object named btnQuit
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
	 * If the cbMute object is null, create a new CheckBox object and assign it to the cbMute object
	 * 
	 * @return The CheckBox object cbMute.
	 */
	public CheckBox getCbMute() {
		if(cbMute == null)
		{
			cbMute = new CheckBox("MUTE");
		}
		return cbMute;
	}
}