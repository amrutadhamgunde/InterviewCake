import java.util.Arrays;
public class ProductOfArrayExceptIndex{

     public static void main(String []args){
        int Array[] = {4,2,0,5};
        int[] ProductOfIntExceptIndex = getProdutOfArrayExceptIndex(Array);
        System.out.println ("final : "+Arrays.toString(ProductOfIntExceptIndex));
     }
     
       static int[] getProdutOfArrayExceptIndex(int inputArray[]){
         int prod = 1;
         int[] ProductOfIntExceptIndex = new int[inputArray.length];
         //products before index
         for(int i =0 ; i<inputArray.length ; i++){
            ProductOfIntExceptIndex[i] = prod ;
            prod = prod * inputArray[i];
            System.out.println("product before index :" + ProductOfIntExceptIndex[i]);
         }
         
         prod = 1;
         for (int i = inputArray.length - 1; i>=0;i-- ){
             System.out.println("prod : "+prod);
            ProductOfIntExceptIndex[i] = ProductOfIntExceptIndex[i] * prod;
            System.out.println(i+"th element of ProductOfIntExceptIndex : "+ProductOfIntExceptIndex[i]);
            prod = prod * inputArray[i];
            
         }
         
        return ProductOfIntExceptIndex; 
     }
}

