package view;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import modele.Personne;



public class ViewEndGameAp extends AnchorPane{
	private Text txtTitle;
	private Button btnQuit;
	private Button btnCsv;
	private Button btnPdf;
	private TableView<Personne> table = new TableView<Personne>();
	private final ObservableList<Personne> data = FXCollections.observableArrayList();

	public ViewEndGameAp()
	{
		// This is used to create a column in the table.
		TableColumn positionCol = new TableColumn("POS");
		positionCol.setMinWidth(20);
		positionCol.setCellValueFactory(new PropertyValueFactory<Personne, String>("position"));

		// This is used to create a column in the table.
		TableColumn playerCol = new TableColumn("PLAYER");
		playerCol.setMinWidth(200);
		playerCol.setCellValueFactory(new PropertyValueFactory<Personne, String>("name"));

		// This is used to create a column in the table.
		TableColumn colorCol = new TableColumn("COLOR");
		colorCol.setMinWidth(150);
		colorCol.setCellValueFactory(new PropertyValueFactory<Personne, String>("color"));

		// This is used to create a column in the table.
		TableColumn scoreCol = new TableColumn("SCORE");
		scoreCol.setMinWidth(150);
		scoreCol.setCellValueFactory(new PropertyValueFactory<Personne, String>("totalScore"));

		// This is used to create a column in the table.
		Image imgCheck = new Image("img/boardgame/check.png");
		ImageView viewCheck = new ImageView(imgCheck);
		viewCheck.setFitHeight(20);
		viewCheck.setFitWidth(20);
		TableColumn correctCol = new TableColumn();
		correctCol.setGraphic(viewCheck);
		correctCol.setMinWidth(50);
		correctCol.setCellValueFactory(new PropertyValueFactory<Personne, String>("nbCorrect"));

		// This is used to create a column in the table.
		Image imgNoCheck = new Image("img/boardgame/nocheck.png");
		ImageView viewNoCheck = new ImageView(imgNoCheck);
		viewNoCheck.setFitHeight(20);
		viewNoCheck.setFitWidth(20);
		TableColumn incorrectCol = new TableColumn();
		incorrectCol.setGraphic(viewNoCheck);
		incorrectCol.setMinWidth(50);
		incorrectCol.setCellValueFactory(new PropertyValueFactory<Personne, String>("nbIncorrect"));

		// This is used to create a column in the table.
		TableColumn lstCategCol = new TableColumn("CATEGORY");
		lstCategCol.setMinWidth(600);
		lstCategCol.setCellValueFactory(new PropertyValueFactory<Personne, String>("lstCateg"));

		table.setEditable(false);
		table.getColumns().addAll(positionCol,playerCol, colorCol,scoreCol,correctCol,incorrectCol,lstCategCol);

		// This is used to set the position of the table in the view.
		AnchorPane.setLeftAnchor(table, 275.);
		AnchorPane.setTopAnchor(table, 250.);

		// This is setting the position of the text.
		AnchorPane.setLeftAnchor(getTxtTitle(), 825.);
		AnchorPane.setTopAnchor(getTxtTitle(),125.);		
		getTxtTitle().getStyleClass().add("aftxt");

		// Setting the top and right anchors of the buttons.
		AnchorPane.setTopAnchor(getBtnQuit(), 10.);
		AnchorPane.setRightAnchor(getBtnQuit(), 20.);

		// Setting the top and right anchors of the buttons.
		AnchorPane.setTopAnchor(getBtnCsv(), 10.);
		AnchorPane.setRightAnchor(getBtnCsv(), 100.);

		// Setting the top and right anchors of the buttons.
		AnchorPane.setTopAnchor(getBtnPdf(), 10.);
		AnchorPane.setRightAnchor(getBtnPdf(), 180.);

		// Adding the text and the button to the view.
		this.getChildren().addAll(table,getTxtTitle(), getBtnQuit(),getBtnCsv(), getBtnPdf());
	}

	/**
	 * Returns the Text object
	 * 
	 * @return A Text object.
	 */
	public Text getTxtTitle() {
		if(txtTitle == null)
		{
			txtTitle = new Text("End Game");
		}
		return txtTitle;
	}

	/**
	 * It creates a button that will be used to quit the game.
	 * 
	 * @return A button.
	 */
	public Button getBtnQuit() {
		if(btnQuit == null)
		{
			btnQuit = new Button();
			// Creating a graphic (image) and adding it to the button.
			Image imgQuit= new Image("img/button/quit.png");
			ImageView viewQuit = new ImageView(imgQuit);
			btnQuit.setGraphic(viewQuit);
			btnQuit.getStyleClass().add("roundButton");
			viewQuit.setFitHeight(50);
			viewQuit.setFitWidth(50);
		}
		return btnQuit;
	}


	/**
	 * It creates a button that will be used to export the result.
	 * 
	 * @return A button.
	 */
	public Button getBtnCsv() {
		if(btnCsv == null)
		{
			btnCsv = new Button();
			// Creating a graphic (image) and adding it to the button.
			Image imgExport= new Image("img/button/csv.png");
			ImageView viewExport = new ImageView(imgExport);
			btnCsv.setGraphic(viewExport);
			btnCsv.getStyleClass().add("roundButton");
			viewExport.setFitHeight(50);
			viewExport.setFitWidth(50);
		}
		return btnCsv;
	}

	/**
	 * It creates a button that will be used to export the result.
	 * 
	 * @return A button.
	 */
	public Button getBtnPdf() {
		if(btnPdf == null)
		{
			btnPdf = new Button();
			// Creating a graphic (image) and adding it to the button.
			Image imgExport= new Image("img/button/pdf.png");
			ImageView viewExport = new ImageView(imgExport);
			btnPdf.setGraphic(viewExport);
			btnPdf.getStyleClass().add("roundButton");
			viewExport.setFitHeight(50);
			viewExport.setFitWidth(50);
		}
		return btnPdf;
	}

	/**
	 * *This function returns the table view of the Personne class.*
	 * 
	 * @return A TableView object.
	 */
	public TableView<Personne> getTable() {
		if(table == null)
		{
			table = new TableView<Personne>();
		}
		return table;
	}

	/**
	 * Returns the data of the table
	 * 
	 * @return The ObservableList of Personne objects.
	 */
	public ObservableList<Personne> getData() {
		return data;
	}
}