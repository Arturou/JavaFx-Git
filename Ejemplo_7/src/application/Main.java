package application;
	
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Image img = new Image("application/Icon.png");
			ImageView imgView = new ImageView(img);
			
			ImageView imgView2 = new ImageView(img);
			imgView2.setFitWidth(200);
			imgView2.setPreserveRatio(true);
			imgView2.setSmooth(true);
			imgView2.setCache(true);
			
			ImageView imgView3 = new ImageView(img);
			Rectangle2D viewportRect = new Rectangle2D(100, 10, 200, 200);
			imgView3.setViewport(viewportRect);
			imgView3.setRotate(180);
			
			BorderPane root = new BorderPane();
			root.setCenter(imgView);
			root.setTop(imgView2);
			root.setBottom(imgView3);
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
