package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 * @private Programa que muestra ejemplos de formatos de ventanas de alertas o emergentes.
 * @author Ace Homework Developers
 * @since 16/06/2016
 */
public class Main extends Application implements EventHandler<ActionEvent>{
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane gPane = new GridPane();
			for(int i = 0 ; i < AlertBoxes.CONSTANTS.length; i++){
				for(int j = 0; j < AlertBoxes.CONSTANTS[0].length; j++){
					Button btn = new Button(AlertBoxes.CONSTANTS[i][j]);
					btn.setMaxWidth(Long.MAX_VALUE);
					btn.setMaxHeight(Long.MAX_VALUE);
					btn.setOnAction(this);
					GridPane.setVgrow(btn, Priority.ALWAYS);
					GridPane.setHgrow(btn, Priority.ALWAYS);
					gPane.add(btn, j, i);
				}
			}
			BorderPane root = new BorderPane();
			root.setCenter(gPane);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Ejemplo de cuadros de dialogo");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void handle(ActionEvent event) {
		Button btn = (Button)event.getSource();
		switch(btn.getText()){
			case "info":
				AlertBoxes.infoAlert("Hola", "Bienvenido", "Demo de Alerta de informacion");
			break;
			case "warnning":
				AlertBoxes.warnningAlert("Cuidado", "Los valores no son correctos", "Favor de ingresar solo numeros");
			break;
			case "error":
				AlertBoxes.errorAlert("Error", "No conexion", "No se pudo establecer una conexion a la base de datos");
			break;
			case "confirm":
				AlertBoxes.confirmAlert("Confirmacion", "Ace Homework Developers", "Te gusta el canal?");
			break;
			case "custom":
				AlertBoxes.multiButtons("Botones Extra", "Alerta personalizada", "Elige una opcion..");
			break;
			case "inputText":
				AlertBoxes.inputTextAlert("Bienvenido", "Ingresa la informacion", "Como te llamas?");
			break;
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
