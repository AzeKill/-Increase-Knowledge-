package view;

import export.LinkChallenges;
import export.WriteChallenges;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ViewChallengeAp extends AnchorPane{
	private Button btnNext;
	private Button btnPrevious;
	private Button btnBack;
	private Button btnDelete;
	private Button btnAdd;
	private Label lblChallengesCount;
	private Label lblChallenges;
	private static int numChallenge =0;


	public ViewChallengeAp() {

		//Creating a graphic (image)
		Image imgChal = new Image("img/logo/Challenge.png");
		ImageView viewChal = new ImageView(imgChal);

		// This is used to set the position of viewChal.
		AnchorPane.setLeftAnchor(viewChal, 1200.);
		AnchorPane.setTopAnchor(viewChal, 450.);

		// This is used to set the position of Button.
		AnchorPane.setBottomAnchor(getBtnNext(), 10.);
		AnchorPane.setRightAnchor(getBtnNext(),60.);
		AnchorPane.setBottomAnchor(getBtnPrevious(), 10.);
		AnchorPane.setRightAnchor(getBtnPrevious(),350.);

		// This is used to set the position of Button.
		AnchorPane.setLeftAnchor(getBtnBack(), 10.);
		AnchorPane.setBottomAnchor(getBtnBack(), 10.);

		// This is used to set the position of Button.
		AnchorPane.setLeftAnchor(getBtnAdd(), 10.);
		AnchorPane.setTopAnchor(getBtnAdd(), 10.);

		// This is used to set the position of Button.
		AnchorPane.setLeftAnchor(getBtnDelete(), 85.);
		AnchorPane.setTopAnchor(getBtnDelete(), 10.);

		/*Card Counter position*/
		AnchorPane.setTopAnchor(getLblChallengesCount(),20.);
		AnchorPane.setRightAnchor(getLblChallengesCount(),130.);

		// Create a new Rectangle and set the fill.
		Rectangle rec = new Rectangle(1000.,300.);
		rec.setFill(Color.web("#00c2cb"));
		rec.setArcWidth(100.0); 
		rec.setArcHeight(80.0); 

		// This is used to set the position of label.
		AnchorPane.setLeftAnchor(getLblChallenges(), 460.);
		AnchorPane.setTopAnchor(getLblChallenges(), 375.);

		// This is used to set the position of label.
		AnchorPane.setLeftAnchor(rec, 450.);
		AnchorPane.setTopAnchor(rec, 350.);
		getLblChallenges().getStyleClass().add("lblWhite");

		// This is adding all the objects to the AnchorPane.
		this.getChildren().addAll(rec,getLblChallenges(),getBtnNext(),getBtnPrevious(),getLblChallengesCount(),getBtnBack(),viewChal,getBtnAdd(),getBtnDelete());

		getChallenges();
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
		//Go to the next challenges of the list
		btnNext.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				setNumChallenge(1);
				//Set the number of challenges
				if(getNumChallenge()>=LinkChallenges.getChallenges().getListChallenges().size())
				{
					setNumChallenge(0);
				}
				getChallenges();
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
		//Go to the previous challenges of the list
		btnPrevious.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event){
				//Set the number of challenges
				if(getNumChallenge()<=0)
				{
					setNumChallenge(LinkChallenges.getChallenges().getListChallenges().size());
				}
				setNumChallenge(-1);
				getChallenges();
			}
		});
		return btnPrevious;
	}

	/**
	 * This function return the number of challenges
	 * 
	 * @return The number of challenges is being returned.
	 */
	public static int getNumChallenge() {
		return numChallenge;
	}

	/**
	 * This function set the number of challenges
	 */
	public static void setNumChallenge(int i) {
		if(i==1 || i==-1)
		{
			numChallenge = numChallenge + i;
		}
		else
		{
			numChallenge = i;
		}
	}

	/**
	 * This function creates a label that display the count of challenges
	 * 
	 * @return The label is being returned.
	 */
	public Label getLblChallengesCount() {
		if(lblChallengesCount == null)
		{
			lblChallengesCount = new Label();
			lblChallengesCount.getStyleClass().add("lblWhite");
		}
		return lblChallengesCount;
	}

	/**
	 * This function creates a label that display the challenge
	 * 
	 * @return The label is being returned.
	 */
	public Label getLblChallenges() {
		if(lblChallenges == null)
		{
			lblChallenges = new Label();
			lblChallenges.setPrefWidth(900);
			lblChallenges.setWrapText(true);
			lblChallenges.setAlignment(Pos.CENTER);
		}
		return lblChallenges;
	}

	/**
	 * This function set the text of the lblChallenges and the lblChallengesCount
	 */
	public void getChallenges() {		
		getLblChallengesCount().setText((getNumChallenge() + 1)+" / " + LinkChallenges.getChallenges().getListChallenges().size());
		getLblChallenges().setText(LinkChallenges.getChallenges().getListChallenges().get(getNumChallenge()));
	}

	/**
	 * This function creates a button
	 * 
	 * @return The button is being returned.
	 */
	public Button getBtnBack() {
		if(btnBack == null)
		{
			btnBack = new Button("BACK");
		}
		return btnBack;
	}

	/**
	 * This function creates a button
	 * 
	 * @return The button is being returned.
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

			//delete the challenge at index numChallenge
			btnDelete.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					LinkChallenges.getChallenges().removeChallenge(numChallenge);
					try {
						WriteChallenges.write(LinkChallenges.getChallenges().getListChallenges());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					numChallenge=LinkChallenges.getChallenges().getListChallenges().size();
					LinkChallenges.txtCall();
				}
			});
		}
		return btnDelete;
	}

	/**
	 * This function creates a button that add a challenge to the list of challenge
	 * 
	 * @return The button is being returned.
	 */
	public Button getBtnAdd() {
		if(btnAdd == null)
		{
			btnAdd = new Button();
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
}