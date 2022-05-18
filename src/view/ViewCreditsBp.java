package view;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class ViewCreditsBp extends BorderPane{
	private Label lblFlavian;
	private Label lblMathias;
	private Label lblHelha;
	private Button btnBack;
	private Animation animation;

	public ViewCreditsBp()
	{        

		VBox creditsBox = new VBox();
		creditsBox.setSpacing(10.);
		creditsBox.setPadding( new Insets(10.) );
		creditsBox.setAlignment(Pos.TOP_CENTER);

		VBox logoBox = new VBox();

		/*game logo*/
		Image image = new Image("img/logo/logoText.png");
		ImageView logoImage = new ImageView(image);
		logoImage.setPreserveRatio(true);
		logoBox.getChildren().add(logoImage);
		logoBox.setAlignment(Pos.TOP_CENTER);

		/*Photo of a developer*/
		HBox flavianBox = new HBox();
		Image imgF = new Image("img/developers/flavian.png");
		ImageView imgViewF = new ImageView(imgF);
		imgViewF.setFitWidth(400);
		imgViewF.setFitHeight(400);	
		imgViewF.setPreserveRatio(true);
		flavianBox.getChildren().add(getLblFlavian());
		flavianBox.getChildren().add(imgViewF);
		flavianBox.setAlignment(Pos.CENTER);
		flavianBox.setSpacing(10.);

		/*Photo of a developer*/
		HBox mathiasBox = new HBox();
		Image imgM = new Image("img/developers/mathias.png");
		ImageView imgViewM = new ImageView(imgM);
		imgViewM.setFitWidth(400);
		imgViewM.setFitHeight(400);
		imgViewM.setPreserveRatio(true);
		mathiasBox.getChildren().add(imgViewM);
		mathiasBox.getChildren().add(getLblMathias());
		mathiasBox.setAlignment(Pos.CENTER);
		mathiasBox.setSpacing(10.);

		/*VBox Helha Logo*/
		VBox extraBox = new VBox();
		Image imgHelha = new Image("img/developers/helha.png");
		ImageView imgViewHelha = new ImageView(imgHelha);
		imgViewHelha.setFitWidth(imgHelha.getWidth()/4);
		imgViewHelha.setFitHeight(imgHelha.getWidth()/4);	
		imgViewHelha.setPreserveRatio(true);
		extraBox.getChildren().add(imgViewHelha);
		extraBox.getChildren().add(getLblHelha());
		extraBox.setAlignment(Pos.CENTER);
		extraBox.setSpacing(10.);

		/*VBox with all labels*/
		VBox leadDevelopersBox = new VBox();
		leadDevelopersBox.setSpacing(10.);
		leadDevelopersBox.setPadding(new Insets(10.));
		leadDevelopersBox.getChildren().add(logoBox);
		leadDevelopersBox.getChildren().add(flavianBox);
		leadDevelopersBox.getChildren().add(mathiasBox);
		leadDevelopersBox.getChildren().add(extraBox);
		leadDevelopersBox.setAlignment(Pos.TOP_CENTER);
		leadDevelopersBox.setSpacing(10.);

		creditsBox.getChildren().add(leadDevelopersBox);
		creditsBox.setAlignment(Pos.TOP_CENTER);
		creditsBox.setSpacing(10.);

		/*scrollpane settings*/
		ScrollPane creditsPane = new ScrollPane();
		creditsPane.setContent(creditsBox);
		creditsPane.setHbarPolicy(ScrollBarPolicy.NEVER);
		creditsPane.setVbarPolicy(ScrollBarPolicy.NEVER);
		creditsPane.setFitToWidth(true);
		creditsPane.setFitToHeight(true);
		animation = new Timeline(new KeyFrame( Duration.seconds(15), new KeyValue(creditsPane.vvalueProperty(), 1.2 ))); 
		animation.setCycleCount( Timeline.INDEFINITE );
		animation.play();

		setCenter(creditsPane);
		setBottom(getBtnBack());

		/*CSS class*/
		creditsBox.setStyle("-fx-background-color: #294366;");
		lblFlavian.getStyleClass().add("lblWhite");
		lblMathias.getStyleClass().add("lblWhite");
		lblHelha.getStyleClass().add("lblWhite");
	}

	/**
	 * Returns a button with the text "BACK" and the maximum size of Double.MAX_VALUE
	 * 
	 * @return A button.
	 */
	public Button getBtnBack() {
		if(btnBack == null)
		{
			btnBack = new Button("BACK");

			btnBack.setMaxSize( Double.MAX_VALUE, Double.MAX_VALUE );
		}
		return btnBack;
	}

	/**
	 * Returns a Label with the name and email of the author
	 * 
	 * @return A Label object.
	 */
	public Label getLblFlavian() 
	{
		if(lblFlavian==null)
		{
			lblFlavian = new Label("GODEMONT Flavian\n"
					+ "LA209224\n"
					+ "la209224@student.helha.be");
		}
		return lblFlavian;
	}

	/**
	 * Returns a Label with the name and email of the author
	 * 
	 * @return A Label object.
	 */
	public Label getLblMathias() 
	{
		if(lblMathias==null)
		{
			lblMathias = new Label("MANZANO Mathias\n"
					+ "LA208312\n"
					+ "la208312@student.helha.be");
		}
		return lblMathias;
	}

	/**
	 * Returns a Label object named lblHelha
	 * 
	 * @return A Label object.
	 */
	public Label getLblHelha() 
	{
		if(lblHelha==null)
		{
			lblHelha = new Label("Chaussée de Binche 159 - 7000 Mons");
		}
		return lblHelha;
	}
}