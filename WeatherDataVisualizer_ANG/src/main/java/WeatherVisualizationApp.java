import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDate;

public class WeatherVisualizationApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Visualizer erstellen
        WeatherVisualizer visualizer = new WeatherVisualizer();

        // Simulator mit Visualizer verbinden
        WeatherDataSimulator simulator = new WeatherDataSimulator(visualizer, LocalDate.of(2025, 6,1), 60);

        //Observer Shit implementieren und hinzufügen!
        WeatherDataObserver observer = new ConcreteWeatherObserver();
        simulator.registerObserver(observer);

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