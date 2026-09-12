import java.util.Scanner;
class VendingMachine {
    enum Coin {
        ONE,
        TWO,
        FIVE,
        TEN
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int price=15;
        int amount=0;
        int change;
        System.out.println("Snac Price :" + price);
        while(!(price <= amount)) {
            System.out.print("Insert the coin :");
            String coin = sc.next().toUpperCase();
            Coin c = Coin.valueOf(coin);
            change = switch(c) {
            case ONE -> 1;  
            case TWO -> 2;
            case FIVE -> 5;
            case TEN -> 10;
            };
            amount = amount + change;
            System.out.println("Inserted So Far :"+amount);
        }
        if(amount - price != 0) {
            System.out.println("Change :"+(amount - price));
        }
        
    }
}