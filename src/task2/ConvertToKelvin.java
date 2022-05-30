package src.task2;

public class ConvertToKelvin extends BaseConverter {
    public void convertToKelvin(double value) {
        value += kelvin;
        System.out.println("Your value in Kelvin =  " + value);
    }
}
