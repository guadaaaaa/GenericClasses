package Arithmetic;

public class Arithmetic<T extends Number, V extends Number> {
    T num1;
    V num2;

    public Arithmetic(T num1, V num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add(){
        return num1.doubleValue() + num2.doubleValue();
    }
    public Number subtract(){
        return num1.doubleValue() - num2.doubleValue();
    }
    public Number multiply(){
        return num1.doubleValue() * num2.doubleValue();
    }
    public Number divide(){
        if(num2.doubleValue() == 0){
            throw new ArithmeticException("Arithmetic Error; Infinity");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
    public Number getMin(){
        if(num1.doubleValue() < num2.doubleValue()){
            return num1;
        } else {
            return num2;
        }
    }
    public Number getMax(){
        if(num1.doubleValue() > num2.doubleValue()){
            return num1;
        } else {
            return num2;
        }
    }


}
