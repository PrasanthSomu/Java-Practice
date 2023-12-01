public class Market {

    int price; //this is called as instance variables or global var.
    float gst;
    String name;

    Market(int price, float gst, String name){ //local variable.
        this.price = price;
        this.gst = gst;
        this.name = name;
    }
    public static void main(String[] args) {

        Market prod_1 = new Market(35,1.2f,"soap");
        System.out.println(prod_1.name);
        System.out.println(prod_1.price);
        System.out.println(prod_1.gst);
        //bread.price=35;
        //bread.gst=0.4F;

    }
}