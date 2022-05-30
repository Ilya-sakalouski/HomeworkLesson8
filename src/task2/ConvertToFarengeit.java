package src.task2;

public class ConvertToFarengeit extends BaseConverter {
    public void convertToFarengeit(double value) {
        value *= farengeit1;
        value += farengeit2;
        System.out.println("Your value in Farengeit =  " + value);
    }
}
