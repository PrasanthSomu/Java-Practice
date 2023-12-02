public class Market {

    int price; //this is called as instance variables or global var.
    float gst;
    String prod_name;

    Market(int price, float gst, String prod_name){ //local variable.
        this.price = price;
        this.gst = gst;
        this.prod_name = prod_name;
        System.out.println(prod_name+price+gst);
    }
    public static void main(String[] args) {

        Market prod_1 = new Market(11,2,"soap");
        prod_1.prod_name="soap";
        prod_1.gst=2;
        prod_1.price=10;
        /*System.out.println(prod_1.gst);
        System.out.println(prod_1.price);
        System.out.println(prod_1.prod_name);*/
        Market prod_2 = new Market(12,1,"oil");
        Market prod_3 = new Market(22,1,"biscuit");
        prod_1.sell();
        prod_2.sell();

    }

    public void sell(){
        System.out.println("product name = "+prod_name);
        System.out.println("gst = "+gst);
        System.out.println("price = "+price);
    }

}