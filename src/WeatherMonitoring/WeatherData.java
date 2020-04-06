package WeatherMonitoring;

public  class WeatherData {

    public  float getTemperature(){return 0;}
    public  float getHumidity(){return 0;}
    public  float getPressure(){return 0;}


    /**
     * This method get called
     * whenever the weather measurements
     * have been updated
     *
     */
    public void measurementsChanged(){


        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temp,humidity,pressure);
        statisticsDisplay.update(temp,humidity,pressure);
        forecastDisplay.update(temp,humidity,pressure);

    }
}
