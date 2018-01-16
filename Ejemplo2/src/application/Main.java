package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox hbox = new HBox();
			hbox.setSpacing(10);
			Label lblHello = new Label("Ingresa tu nombre");
			TextField txtHello = new TextField();
			hbox.getChildren().addAll(lblHello, txtHello);
			
			HBox areaBotones = new HBox();
			Button btnOne = new Button("opcion uno");
			Button btnTwo = new Button("opcion dos");
			Button btnThree = new Button("opcion tres");
			areaBotones.getChildren().addAll(btnOne, btnTwo, btnThree);
			
			BorderPane root = new BorderPane();
			root.setTop(hbox);
			root.setBottom(areaBotones);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Ejemplo label y Textfields");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
