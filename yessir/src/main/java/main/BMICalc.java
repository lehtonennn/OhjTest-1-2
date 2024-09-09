package main;


public class BMICalc 
{
    protected double weight;
    protected double height;

    public BMICalc() {
        this.weight = 0;
        this.height = 0;
    }

    public BMICalc(double height, double weight) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI(double height, double weight) {
        if (weight <= 0 || height <= 0) {
            return -1;  
        }
        
        double bmi = weight / (height * height);
        
        return Math.round(bmi * 10.0) / 10.0;  
    }

    public String getBMICategoryString(double height, double weight) {
        double bmi = calculateBMI(height, weight);

        if (bmi == -1) {
            return "Invalid input";
        } else if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
