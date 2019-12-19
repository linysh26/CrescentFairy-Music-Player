package address.view;

import java.util.ArrayList;
import java.util.List;

import address.MusicPlayerMainUI;
import address.model.*;
import address.view.SearchPageController.DownloadButtonCell;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;
import javafx.util.Callback;

public class HomePageController {
	
	// HGap and VGap of the flow pane
	private static double flowHGap = 20.0;
	
	private static double flowVGap = 10.0;
	
	/**
	 * indicate fxml id
	 */
	@FXML
	private AnchorPane AnchorPane_HomePage;
	
	@FXML
	private ScrollPane ScrollPane_CoversPane;
	
	@FXML
	private HBox HBox_Userfile;
	
	@FXML
	private ImageView ImageView_Profile;
	
	@FXML
	private TextFlow TextFlow_Username;
	
	
	@FXML
	private TabPane TabPane_HomePage;
	
	@FXML
	private Tab Tab_Music;
	
	@FXML
	private Tab Tab_Manga;
	
	@FXML
	private Tab Tab_Novel;
	
	@FXML
	private Tab Tab_Vedio;
	
	@FXML
	private Tab Tab_Image;
	
	@FXML
	private FlowPane FlowPane_Music;
	
	@FXML
	private FlowPane FlowPane_Manga;
	
	@FXML
	private FlowPane FlowPane_Novel;
	
	@FXML
	private FlowPane FlowPane_Vedio;
	
	@FXML
	private FlowPane FlowPane_Image;
	
	
	@FXML
	private void initialize() {
		
		//
	}
	
	public void setMusicPlayer(MusicPlayerMainUI musicPlayer) {
		this.musicPlayer = musicPlayer;
	}
	
	// reference of the music player
	private MusicPlayerMainUI musicPlayer;
}
