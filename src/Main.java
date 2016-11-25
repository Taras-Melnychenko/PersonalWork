

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.setTemperature(24);
        weather.setCloud(Cloud.AVARAGE);
        weather.setDirection(Direction.NORTH);
        weather.setRainfall(88);
        weather.setSpeedWind(15);

        weather.sout();
    }

}
