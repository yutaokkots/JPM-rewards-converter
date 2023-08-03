import java.text.DecimalFormat;

public class RewardValue {
    private double value;


    public RewardValue(
            double value){
        this.value = value;
    }

    public double getCashValue(){
        return this.value * 0.0035;
    }

    public String getMilesValue(){
        double result = this.value / 0.0035;
        final DecimalFormat df = new DecimalFormat("0.00");
        return df.format(result);
    }

}
