package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Cell;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.util.Callback;
import modele.Personne;
import modele.Player;

/**
 * This class is used to add players to the game
 */
public class ViewAddPlayerAp extends AnchorPane {
	private Button btnBack;
	private VBox vbTable;
	private HBox hbBtnPosition;
	private Label lblTitle;
	private Button btnAdd;
	private Button btnRemove;
	private Button btnPlay;
	private VBox vbTxtfPosition;
	private Player player;
	private TableView<Personne> table = new TableView<Personne>();
	private final ObservableList<Personne> data = FXCollections.observableArrayList();

	// This is the constructor of the ViewAddPlayerAp class. It creates the table and the textfield and
	// colorpicker. It also sets the position of the table and textfield.
	public ViewAddPlayerAp(){
		// This is used to create a column in the table.
		TableColumn pseudoCol = new TableColumn("PSEUDO");
		pseudoCol.setMinWidth(300);
		pseudoCol.setCellValueFactory(new PropertyValueFactory<Personne, String>("name"));

		// This is used to create a column in the table.
		TableColumn colorCol = new TableColumn("COLOR");
		colorCol.setMinWidth(300);
		colorCol.setCellValueFactory(new PropertyValueFactory<Personne, String>("color"));
		

		// Used to create a table with two columns, one for the pseudo and one for the color.
		table.setEditable(false);
		table.setItems(data);
		table.getColumns().addAll(pseudoCol, colorCol);

		// It creates a textfield and a colorpicker and sets their width and prompt text.
		final TextField addPseudo = new TextField();
		addPseudo.setMaxWidth(pseudoCol.getPrefWidth());
		addPseudo.setPromptText("PSEUDO");
		final ColorPicker addColor = new ColorPicker();
		addColor.setMaxWidth(colorCol.getPrefWidth());
		addColor.setPromptText("COLOR");

		// This is used to add a player to the game.
		getBtnAdd().setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				Personne p =  new Personne(addPseudo.getText(),addColor.getValue());
				if(!data.contains(p))
				{
					data.add(p);
					addPseudo.clear();
					addColor.setValue(Color.WHITE);
				}
				// This is used to enable the button Play if the number of players is less than 1 and disable the
				// button Add if the number of players is greater than 8.
				if(data.size()>=2) 
				{
					getBtnPlay().setDisable(false);	
				}
				if(data.size()>=8) 
				{
					getBtnAdd().setDisable(true);	
				}
			}
		});

		// This is used to remove a player from the game.
		getBtnRemove().setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				data.removeAll(getTable().getSelectionModel().getSelectedItems());
				if(data.size()<8) 
				{
					getBtnAdd().setDisable(false);	
				}
				if(data.size()<2) 
				{
					getBtnPlay().setDisable(true);	
				}
			}
		});

		// Creating the HBox and VBox objects that will be used to position the buttons and textfields.
		hbBtnPosition = new HBox(100,getBtnBack(),getBtnPlay() );
		vbTxtfPosition = new VBox(25,addPseudo, addColor, getBtnAdd(), getBtnRemove());
		addPseudo.setMinWidth(250);
		addColor.setMinWidth(250);

		vbTable = new VBox(25,getLblTitle(), table, getHbBtnPosition());
		getVbTable().setPadding(new Insets(10, 0, 0, 10));

		// This is used to set the position of the getVbTxtfPosition in the view.
		AnchorPane.setTopAnchor(getVbTxtfPosition(), 400.);
		AnchorPane.setLeftAnchor(getVbTxtfPosition(), 500.);

		// This is used to set the position of the table in the view.
		AnchorPane.setLeftAnchor(getVbTable(), 800.);
		AnchorPane.setTopAnchor(getVbTable(), 250.);

		this.getChildren().addAll(getVbTxtfPosition(),getVbTable());
	}

	/**
	 * It creates a new button and returns it.
	 * 
	 * @return A button object.
	 */
	public Button getBtnBack() {
		if(btnBack == null)
		{
			btnBack = new Button("Back");
		}
		return btnBack;
	}

	/**
	 * This function returns the VBox object that holds the table
	 * 
	 * @return A VBox object.
	 */
	public VBox getVbTable() {
		if(vbTable == null)
		{
			vbTable = new VBox();
		}
		return vbTable;
	}

	/**
	 * This function creates a new HBox if it doesn't already exist, and returns it
	 * 
	 * @return A HBox
	 */
	public HBox getHbBtnPosition() {
		if(hbBtnPosition == null)
		{
			hbBtnPosition = new HBox();
		}
		return hbBtnPosition;
	}

	/**
	 * This function creates a label with the text "LIST PLAYERS" and sets the font to 20 points Arial
	 * 
	 * @return A Label object.
	 */
	public Label getLblTitle() {
		if(lblTitle == null)
		{
			lblTitle = new Label("LIST PLAYERS");
			lblTitle.setFont(new Font("Arial", 20));
			lblTitle.getStyleClass().add("lblBlack");
		}
		return lblTitle;
	}

	/**
	 * Returns the Button object named btnAdd
	 * 
	 * @return A button object.
	 */
	public Button getBtnAdd() {
		if(btnAdd == null)
		{
			btnAdd = new Button("ADD");	
		}
		return btnAdd;
	}

	/**
	 * Returns the Button object named btnAdd
	 * 
	 * @return A button object.
	 */
	public Button getBtnRemove() {
		if(btnRemove == null)
		{
			btnRemove = new Button("REMOVE");	
		}
		return btnRemove;
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
	 * Returns the player object
	 * 
	 * @return The player object.
	 */
	public Player getPlayer() {
		if(player == null)
		{
			player = new Player();
		}
		return player;
	}

	/**
	 * This function copies the list of players from the data list to the player list
	 */
	public void copyList() {
		for (Personne p : data)
		{
			getPlayer().addPlayer(p);
		}
	}

	/**
	 * Returns the button named "PLAY" if it exists, otherwise creates it
	 * 
	 * @return A button object.
	 */
	public Button getBtnPlay() {
		if(btnPlay == null)
		{
			btnPlay = new Button("PLAY");
			btnPlay.setDisable(true);
		}
		return btnPlay;
	}

	/**
	 * Returns the VBox that contains the textfield and the label
	 * 
	 * @return A VBox object.
	 */
	public VBox getVbTxtfPosition() {
		if(vbTxtfPosition == null)
		{
			vbTxtfPosition = new VBox();
		}
		return vbTxtfPosition;
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