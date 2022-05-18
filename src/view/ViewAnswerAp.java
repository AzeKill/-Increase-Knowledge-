package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ViewAnswerAp extends AnchorPane {
	private Rectangle rect;
	private Label lblTheGood;
	private Label lblIsGood;
	private Button btnQuit;

	public ViewAnswerAp() {

		// Creating an image and displaying it.

		AnchorPane.setLeftAnchor(getLblIsGood(), 750.);
		AnchorPane.setBottomAnchor(getLblIsGood(),200.);

		// Setting the color of the rectangle.
		getRect().setFill(Color.web("black"));
		getRect().setArcWidth(100.0); 
		getRect().setArcHeight(80.0); 

		// Setting the position of the rectangle.
		AnchorPane.setLeftAnchor(getRect(), 650.);
		AnchorPane.setBottomAnchor(getRect(),150.);

		// Setting the position of the label.
		AnchorPane.setLeftAnchor(getLblTheGood(), 700.);
		AnchorPane.setBottomAnchor(getLblTheGood(),650.);

		//Creating a graphic (image)
		Image imgQuit= new Image("img/button/quit.png");
		ImageView viewQuit = new ImageView(imgQuit);
		getBtnQuit().setGraphic(viewQuit);
		getBtnQuit().getStyleClass().add("roundButton");
		viewQuit.setFitHeight(50);
		viewQuit.setFitWidth(50);

		// Setting the position of the button.
		AnchorPane.setBottomAnchor(getBtnQuit(), 865.);
		AnchorPane.setLeftAnchor(getBtnQuit(), 1165.);

		// This is adding all the elements to the view.
		this.getChildren().addAll(getRect(),getLblTheGood(),getLblIsGood(),getBtnQuit());
	}

	public void isGood(boolean b)
	{
		// Checking if the answer is good or not.
		if(b)
		{
			Image imgCheck = new Image("img/boardgame/yes.gif");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(400);
			viewCheck.setFitWidth(400);
			getLblIsGood().setGraphic(viewCheck);
		}
		else
		{
			Image imgCheck = new Image("img/boardgame/no.gif");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(400);
			viewCheck.setFitWidth(400);
			getLblIsGood().setGraphic(viewCheck);
		}
	}

	/**
	 * Returns the rectangle that defines the area of the screen
	 * 
	 * @return A rectangle object.
	 */
	public Rectangle getRect() {
		if(rect == null)
		{
			rect = new Rectangle(600.,800.);
		}
		return rect;
	}

	/**
	 * This function creates a new Label Button
	 * 
	 * @return A button.
	 */
	public Button getBtnQuit() {
		if(btnQuit == null)
		{
			btnQuit = new Button();
		}
		return btnQuit;
	}

	/**
	 * This function creates a new Label object and returns it
	 * 
	 * @return A Label object.
	 */
	public Label getLblTheGood() {
		if(lblTheGood == null)
		{
			lblTheGood = new Label();
			lblTheGood.getStyleClass().add("lblWhite");
		}
		return lblTheGood;
	}

	/**
	 * This function creates a new Label object and returns it
	 * 
	 * @return A Label object.
	 */
	public Label getLblIsGood() {
		if(lblIsGood == null)
		{
			lblIsGood = new Label();
		}
		return lblIsGood;
	}
}