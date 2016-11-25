

public class Weather {

    private Direction direction;
    private  int speedWind;
    private int temperature;
    private Cloud cloud;
    private int rainfall;

    public Weather() {}

    @Override
    public String toString() {
        return "Weather{" +
                "direction=" + direction +
                ", speedWind=" + speedWind +
                ", temperature=" + temperature +
                ", cloud=" + cloud +
                ", rainfall=" + rainfall +
                '}';
    }

    public void sout(){
        System.out.println(this.toString());
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setSpeedWind(int speedWind) {
        this.speedWind = speedWind;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setCloud(Cloud cloud) {
        this.cloud = cloud;
    }

    public void setRainfall(int rainfall) {
        this.rainfall = rainfall;
    }
}
