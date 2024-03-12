import jdk.jshell.spi.SPIResolutionException;

public class Dessert {
    int flavor;
    int price;
    static int numDesserts = 0;
    public Dessert(int f,int p){
        this.flavor=f;
        this.price=p;
        Dessert.numDesserts++;
    }
    public void printDessert(){
        System.out.println(this.flavor+" "+this.price+" "+Dessert.numDesserts);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
