import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDate;

public class WeatherVisualizationApp extends Application {
    @Override
    public void start(Stage primaryStage) {


        // Visualizer zuweisen
        WeatherVisualizer visualizer = new WeatherVisualizer();

        // Simulator mit Visualizer verbinden
        WeatherDataSimulator simulator = new WeatherDataSimulator(LocalDate.of(2025, 6,1), 60);

        // REGISTER OBSERVER is vorgschriem! Sunst nix kompiliern diese
        simulator.registerObserver(visualizer);

        // Szene erstellen
        Scene scene = new Scene(visualizer.getRoot(), 800, 600);
        primaryStage.setTitle("Wetter-Visualisierung");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);




    }
}