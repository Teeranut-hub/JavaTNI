package CoffeeShop;

public abstract class Espresso extends Drink{
    private int shot;

    public Espresso (String size){
        super("Esprssso", 35, size);
        this.shot = 0;
    }

    public void addShot (int shot){
        this.shot += shot;
    }

    public int getShot (){
        return shot;
    }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + (shot * 15) + getSizeExtra();
    }
    @Override
    public String toString(){
        String result = super.toString() + "\n";
        if(shot > 0){
            result += "Added " + shot + " shot\n";
        }
        result += "Total price = " + calculateFinalPrice() + " Baht";
        return result;
    }
}