package view;

import javafx.beans.InvalidationListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import modele.MusicPlayer;

public class ViewSettingsAp extends AnchorPane{
	private CheckBox cbMute;
	private Button btnPause;
	private Button btnBack;
	private Button btnImportJSON;
	private Button btnExportJSON;
	private Slider slider;
	private MusicPlayer mP;


	// This is the constructor of the ViewSettingsAp class. It is creating the buttons and the slider, and
	// adding them to the AnchorPane.
	public ViewSettingsAp() {
		mP = new MusicPlayer("/music/fond.wav");
		mP.getMediaPlayer().setMute(false);

		// This is used to set the position of the CheckBox.
		AnchorPane.setLeftAnchor(getCbMute(), 800.);
		AnchorPane.setTopAnchor(getCbMute(),200.);

		// This is used to set the position of the Button.
		AnchorPane.setLeftAnchor(getBtnPause(), 800.);
		AnchorPane.setTopAnchor(getBtnPause(),250.);

		// This is used to set the position of the Slider.
		AnchorPane.setLeftAnchor(getSlider(), 800.);
		AnchorPane.setTopAnchor(getSlider(),400.);

		// This is used to set the position of the Button.
		AnchorPane.setLeftAnchor(getBtnImportJSON(), 800.);
		AnchorPane.setTopAnchor(getBtnImportJSON(),500.);

		// This is used to set the position of the Button.
		AnchorPane.setLeftAnchor(getBtnExportJSON(), 800.);
		AnchorPane.setTopAnchor(getBtnExportJSON(),600.);

		// This is used to set the position of the Button.
		AnchorPane.setLeftAnchor(getBtnBack(), 800.);
		AnchorPane.setTopAnchor(getBtnBack(),700.);


		this.getChildren().addAll(getCbMute(),getBtnPause(),getSlider(),getBtnImportJSON(),getBtnExportJSON(),getBtnBack());

		mP.getMediaPlayer().play();
	}

	/**
	 * > If the checkbox is null, create a new checkbox, set the text to "MUTE", and set the onAction event
	 * to mute the media player
	 * 
	 * @return A CheckBox object.
	 */
	public CheckBox getCbMute() {
		if(cbMute == null)
		{
			cbMute = new CheckBox("MUTE");
			cbMute.getStyleClass().add("lblWhite");
			cbMute.setSelected(false);
			// Setting the action of the checkbox to mute the media player.
			cbMute.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					getMp().getMediaPlayer().setMute(cbMute.isSelected());;
				}
			});
		}
		return cbMute;
	}

	/**
	 * If the button's text is "⏸", pause the media player and change the button's text to "►". Otherwise,
	 * play the media player and change the button's text to "⏸"
	 * 
	 * @return The button is being returned.
	 */
	public Button getBtnPause() {
		if(btnPause == null)
		{
			btnPause = new Button("⏸");
			btnPause.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					if(btnPause.getText().equalsIgnoreCase("⏸"))
					{
						// Pausing the music and changing the button's text to "►"
						getMp().getMediaPlayer().pause();
						getBtnPause().setText("►");
					}
					else
					{
						// Playing the music and changing the button's text to "⏸"
						getMp().getMediaPlayer().play();
						getBtnPause().setText("⏸");
					}
				}
			});
		}
		return btnPause;
	}

	/**
	 * When the slider is moved, the volume of the media player is set to the value of the slider
	 * 
	 * @return The slider object.
	 */
	public Slider getSlider() {
		if(slider == null) { 
			slider = new Slider(0, 100, 10); 
			slider.getStyleClass().add("lblWhite");
			slider.setMin(0);
			slider.setShowTickLabels(true);
			slider.setShowTickMarks(true);
			slider.setValue(getMp().getMediaPlayer().getVolume()*100);
			slider.valueProperty().addListener(new InvalidationListener() {

				/**
				 * When the slider is moved, the volume of the media player is set to the value of the slider
				 * 
				 * @param observable The Observable object that was invalidated.
				 */
				@Override
				public void invalidated(javafx.beans.Observable observable) {
					getMp().getMediaPlayer().setVolume(slider.getValue()/100);

				}
			});
		}
		return slider;
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
	 * This function returns the value of the variable mP.
	 * 
	 * @return The MusicPlayer object.
	 */
	public MusicPlayer getMp() {
		return mP;
	}

	/**
	 * If the button is null, create a new button with the text "IMPORT JSON"
	 * 
	 * @return A new Button object is being returned.
	 */
	public Button getBtnImportJSON() {
		if(btnImportJSON == null)
		{
			btnImportJSON = new Button("IMPORT JSON");
			btnImportJSON.getStyleClass().add("button_Large_Text");
		}
		return btnImportJSON;
	}

	/**
	 * If the button is null, create a new button with the text "EXPORT JSON"
	 * 
	 * @return A new Button object is being returned.
	 */
	public Button getBtnExportJSON() {
		if(btnExportJSON == null)
		{
			btnExportJSON = new Button("EXPORT JSON");
			btnExportJSON.getStyleClass().add("button_Large_Text");
		}
		return btnExportJSON;
	}
}