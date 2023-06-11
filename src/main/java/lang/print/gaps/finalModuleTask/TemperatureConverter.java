package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double temperatureFahrenheits = 0;
        temperatureFahrenheits = (temperatureCelsius * (9/5)) + 32;

        System.out.println(temperatureFahrenheits);
    }
}
