package discountcalculator;
import java.util.Scanner;
public class DiscountCalculator {
 static String Price, Discount;
    static double price, discount; 
        
static void DP(){
    if(discount==5){
     discount=(price*5)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==10){
     discount=(price*10)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==15){
     discount=(price*15)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==20){
     discount=(price*20)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==25){
     discount=(price*25)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==30){
     discount=(price*30)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==35){
     discount=(price*35)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==40){
     discount=(price*40)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==45){
     discount=(price*45)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==50){
     discount=(price*50)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==55){
     discount=(price*55)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==60){
     discount=(price*60)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==65){
     discount=(price*65)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==70){
     discount=(price*70)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==75){
     discount=(price*75)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==80){
     discount=(price*80)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==85){
     discount=(price*85)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==90){
     discount=(price*90)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==95){
     discount=(price*95)/100;
       price=price-discount;
       System.out.println(price);}
    else if(discount==100){
     discount=(price*100)/100;
       price=price-discount;
       System.out.println(price);}
    else
        System.out.println("Enter a discount rate that is a multiple of 5");
   
}
    public static void main(String[] args) {
    
         Scanner data= new Scanner(System.in);
        
        System.out.println("Enter the price");
        price= data.nextDouble();
        
        System.out.println("Enter the discount rate");
        discount= data.nextDouble();
        
        
        System.out.println("The price after discount ");
        DP();
        
        data.close();
    }
    
}
