package app.textRevers;

public class ComponentsForDividing {

    private  Integer dividend;
    private  Integer divisor;

    ComponentsForDividing(){
        setDivisor(0);
        setDividend(0);
    }

    ComponentsForDividing(Integer dividend, Integer divisor){
        setDividend(dividend);
        setDivisor(divisor);
    }

    public Integer getDivisor() {
        return divisor;
    }

    public void setDivisor(Integer divisor) {
        this.divisor = divisor;
    }

    public Integer getDividend() {
        return dividend;
    }

    public void setDividend(Integer dividend) {
        this.dividend = dividend;
    }


}
