public class MaxProfitFromAppleStock{
     int getMaxProfit(int stockPricesYday[]){
        int max_profit = 0 ;
        
        // get minimum purchase price first
        for(int purchasetime = 0;purchasetime<stockPricesYday.length;purchasetime++){
            
            int Purchaseprice = stockPricesYday[purchasetime];
            System.out.println("Purchaseprice" + Purchaseprice);
            
            //get selling price
            for(int sallingtime = purchasetime+1;sallingtime<stockPricesYday.length;sallingtime++){
                int sellinPrice = stockPricesYday[sallingtime];
                System.out.println("sellinPrice"+sellinPrice);
                
                int potentialProfit = sellinPrice - Purchaseprice;
                System.out.println("potentialProfit"+potentialProfit);
                max_profit = Math.max(max_profit,potentialProfit);
            }
            
        }
        return max_profit;
    }
}