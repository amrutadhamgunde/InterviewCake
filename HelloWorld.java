public class HelloWorld{

     public static void main(String args[]){
        MaxProfitFromAppleStock mpas = new MaxProfitFromAppleStock();
        int stockPricesYday[] = {80,40,20,50,90,10,100};
        int max_profit = mpas.getMaxProfit(stockPricesYday);
        System.out.println("Maximum Profit is :" +max_profit);
    }
}
