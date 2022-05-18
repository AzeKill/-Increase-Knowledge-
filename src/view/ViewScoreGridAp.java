package view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import json.Link;
import modele.Category;

public class ViewScoreGridAp extends AnchorPane {
	private Label lblPlayer;
	private Label lblScore;
	private Circle crlColorPlay;
	private Label lblIdeas;
	private Label lblScience;
	private Label lblPlanet;
	private Label lblHistory;
	private Label lblLiterature;
	private Label lblComputer;

	public ViewScoreGridAp()
	{
		// This is creating a map of integers and labels.
		Map<Integer, Label> lblCategory = new HashMap<Integer, Label>();

		//background rectangle
		Rectangle rec = new Rectangle(360.,400.);
		rec.setFill(Color.web("#c7d0d8"));
		rec.setArcWidth(100.0); 
		rec.setArcHeight(80.0); 
		// This is setting the bottom and right anchor of the label to 105 and 375.
		AnchorPane.setRightAnchor(rec, 105.);
		AnchorPane.setBottomAnchor(rec,375.);

		// This is setting the bottom and right anchor of the label to 705 and 340.
		AnchorPane.setBottomAnchor(getCrlColorPlay(), 705.);
		AnchorPane.setRightAnchor(getCrlColorPlay(), 230.);

		// This is setting the bottom and right anchor of the label to 705 and 215.
		AnchorPane.setBottomAnchor(getLblScore(), 705.);
		AnchorPane.setRightAnchor(getLblScore(), 130.);
		getLblScore().getStyleClass().add("lblWhite");

		// This is setting the bottom and right anchor of the label to 705 and 395.
		AnchorPane.setBottomAnchor(getLblPlayer(), 705.);
		AnchorPane.setRightAnchor(getLblPlayer(), 280.);
		getLblPlayer().getStyleClass().add("lblWhite");

		//Lines to make the table
		Line line = new Line(0, 0, 0, 350);
		line.setStrokeWidth(2);
		// This is setting the right and bottom anchor of the line to 320 and 400.
		AnchorPane.setRightAnchor(line, 220.);
		AnchorPane.setBottomAnchor(line,400.);

		// This is adding the rectangle and the line
		this.getChildren().addAll(rec,line);

		//Adding categories
		int y=0,x=1;
		for (int i = 0; i < Link.getDeck().getListCards().get(x).getListQuestion().size(); i++) {      
			// This is creating a line object with a width of 2.
			Line line2 = new Line(0, 0, 300, 0);
			line2.setStrokeWidth(2);

			// This is adding the category to the label.
			lblCategory.put(i, new Label(Link.getDeck().getListCards().get(x).getListQuestion().get(i).getCategory().toString()));
			lblCategory.get(i).getStyleClass().add("lbl");

			// This is setting the color of the label depending on the category.
			if(i==0) {
				lblCategory.get(i).setTextFill(Color.web(Category.IDEAS.getColor()));
			}
			else if(i==1) {
				lblCategory.get(i).setTextFill(Color.web(Category.SCIENCE.getColor()));
			}
			else if(i==2) {
				lblCategory.get(i).setTextFill(Color.web(Category.PLANET.getColor()));
			}
			else if(i==3) {
				lblCategory.get(i).setTextFill(Color.web(Category.HISTORY.getColor()));
			}
			else if(i==4) {
				lblCategory.get(i).setTextFill(Color.web(Category.LITERATURE.getColor()));
			}
			else {
				lblCategory.get(i).setTextFill(Color.web(Category.COMPUTER.getColor()));
			}
			// Setting the anchor of the label and the line.
			AnchorPane.setRightAnchor(lblCategory.get(i), 230.);
			AnchorPane.setBottomAnchor(lblCategory.get(i),(y*50.)+400.);
			AnchorPane.setRightAnchor(line2,130.);
			AnchorPane.setBottomAnchor(line2,(y*50.)+450.);
			y++;
			this.getChildren().addAll(line2,lblCategory.get(i));
		}
		// This is adding the three elements to the AnchorPane.
		this.getChildren().addAll(getLblPlayer(),getCrlColorPlay(),getLblScore());
	}

	/**
	 * Returns a Label object that is used to display the question
	 * 
	 * @return A Label object.
	 */
	public Label getLblPlayer() {
		if(lblPlayer == null)
		{
			lblPlayer = new Label();
		}
		return lblPlayer;
	}

	/**
	 * Returns a circle object with a radius of 20.0f and a transparent fill
	 * 
	 * @return A Circle object.
	 */
	public Circle getCrlColorPlay() {
		if(crlColorPlay == null)
		{
			crlColorPlay = new Circle();
			// set Radius of the circle
			crlColorPlay.setRadius(20.0f);
			crlColorPlay.setFill(Color.TRANSPARENT);
		}
		return crlColorPlay;
	}

	/**
	 * Returns a Label object that is used to display the question
	 * 
	 * @return A Label object.
	 */
	public Label getLblScore() {
		if(lblScore == null)
		{
			lblScore = new Label("0");
		}
		return lblScore;
	}

	public void getGood(List l)
	{
		if(l.contains(Category.IDEAS.toString()))
		{
			// This is creating a graphic (image) for the button.
			Image imgCheck = new Image("img/boardgame/check.png");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(40);
			viewCheck.setFitWidth(40);
			getLblIdeas().setGraphic(viewCheck);

		}
		else
		{
			Image imgCheck = new Image("img/boardgame/nocheck.png");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(40);
			viewCheck.setFitWidth(40);
			getLblIdeas().setGraphic(viewCheck);
		}
		AnchorPane.setRightAnchor(getLblIdeas(), 150.);
		AnchorPane.setBottomAnchor(getLblIdeas(), 405.);

		this.getChildren().add(getLblIdeas());
		if(l.contains(Category.SCIENCE.toString()))
		{
			// This is creating a graphic (image) for the button.
			Image imgCheck = new Image("img/boardgame/check.png");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(40);
			viewCheck.setFitWidth(40);
			getLblScience().setGraphic(viewCheck);
		}
		else
		{
			Image imgCheck = new Image("img/boardgame/nocheck.png");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(40);
			viewCheck.setFitWidth(40);
			getLblScience().setGraphic(viewCheck);
		}
		AnchorPane.setRightAnchor(getLblScience(), 150.);
		AnchorPane.setBottomAnchor(getLblScience(), 455.);
		this.getChildren().add(getLblScience());

		if(l.contains(Category.PLANET.toString()))
		{
			// This is creating a graphic (image) for the button.
			Image imgCheck = new Image("img/boardgame/check.png");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(40);
			viewCheck.setFitWidth(40);
			getLblPlanet().setGraphic(viewCheck);

		}
		else
		{
			Image imgCheck = new Image("img/boardgame/nocheck.png");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(40);
			viewCheck.setFitWidth(40);
			getLblPlanet().setGraphic(viewCheck);
		}
		AnchorPane.setRightAnchor(getLblPlanet(), 150.);
		AnchorPane.setBottomAnchor(getLblPlanet(), 505.);
		this.getChildren().add(getLblPlanet());

		if(l.contains(Category.HISTORY.toString()))
		{
			// This is creating a graphic (image) for the button.
			Image imgCheck = new Image("img/boardgame/check.png");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(40);
			viewCheck.setFitWidth(40);
			getLblHistory().setGraphic(viewCheck);
		}
		else
		{
			Image imgCheck = new Image("img/boardgame/nocheck.png");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(40);
			viewCheck.setFitWidth(40);
			getLblHistory().setGraphic(viewCheck);
		}
		AnchorPane.setRightAnchor(getLblHistory(), 150.);
		AnchorPane.setBottomAnchor(getLblHistory(), 555.);
		this.getChildren().add(getLblHistory());

		if(l.contains(Category.LITERATURE.toString()))
		{
			// This is creating a graphic (image) for the button.
			Image imgCheck = new Image("img/boardgame/check.png");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(40);
			viewCheck.setFitWidth(40);
			getLblLiterature().setGraphic(viewCheck);

		}
		else
		{
			Image imgCheck = new Image("img/boardgame/nocheck.png");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(40);
			viewCheck.setFitWidth(40);
			getLblLiterature().setGraphic(viewCheck);
		}
		AnchorPane.setRightAnchor(getLblLiterature(), 150.);
		AnchorPane.setBottomAnchor(getLblLiterature(), 605.);
		this.getChildren().add(getLblLiterature());

		if(l.contains(Category.COMPUTER.toString()))
		{
			// This is creating a graphic (image) for the button.
			Image imgCheck = new Image("img/boardgame/check.png");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(40);
			viewCheck.setFitWidth(40);
			getLblComputer().setGraphic(viewCheck);
		}
		else
		{
			Image imgCheck = new Image("img/boardgame/nocheck.png");
			ImageView viewCheck = new ImageView(imgCheck);
			viewCheck.setFitHeight(40);
			viewCheck.setFitWidth(40);
			getLblComputer().setGraphic(viewCheck);
		}
		AnchorPane.setRightAnchor(getLblComputer(), 150.);
		AnchorPane.setBottomAnchor(getLblComputer(), 655.);
		this.getChildren().add(getLblComputer());
	}

	/**
	 * > If the label is null, create a new label and return it
	 * 
	 * @return A new label is being returned.
	 */
	public Label getLblIdeas() {
		if(lblIdeas == null)
		{
			lblIdeas = new Label();
		}
		return lblIdeas;
	}

	/**
	 * If the label is null, create a new label and return it
	 * 
	 * @return A new label is being returned.
	 */
	public Label getLblScience() {
		if(lblScience == null)
		{
			lblScience = new Label();
		}
		return lblScience;
	}

	/**
	 * If the label is null, create a new label and return it
	 * 
	 * @return A new label is being returned.
	 */
	public Label getLblPlanet() {
		if(lblPlanet == null)
		{
			lblPlanet = new Label();
		}
		return lblPlanet;
	}

	/**
	 * > If the label is null, create a new label
	 * 
	 * @return A new Label object is being returned.
	 */
	public Label getLblHistory() {
		if(lblHistory == null)
		{
			lblHistory = new Label();
		}
		return lblHistory;
	}

	/**
	 * > If the label is null, create a new label
	 * 
	 * @return A new label is being returned.
	 */
	public Label getLblLiterature() {
		if(lblLiterature == null)
		{
			lblLiterature = new Label();
		}
		return lblLiterature;
	}

	/**
	 * > If the label is null, create a new label and return it
	 * 
	 * @return A new Label object is being returned.
	 */
	public Label getLblComputer() {
		if(lblComputer == null)
		{
			lblComputer = new Label();
		}
		return lblComputer;
	}
}