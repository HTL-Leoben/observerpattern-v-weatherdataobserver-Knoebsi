public class ConcreteWeatherObserver implements WeatherDataObserver{

    WeatherVisualizer visualizer = new WeatherVisualizer();

    @Override
    public void update(WeatherData weatherData) {
        visualizer.updateWeatherVisualization(weatherData);
    }
}
