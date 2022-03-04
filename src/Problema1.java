public class Problema1 {
    private String[] nums = new String[20];

    public String[] numbers(){
        int contador = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(esMultiplo3(i) && esNumMultiplo5(i)){
               nums[i] = "FizzBuzz" ;
            } else if(esNumMultiplo5(i) && !esMultiplo3(i)){
                nums[i] = "Buzz";
            } else if(esMultiplo3(i) && !esNumMultiplo5(i)){
                nums[i] = "Fizz";
            }else{
                nums[i] = String.valueOf(contador);
            }
            contador ++;
        }
        return nums;
    }
    private boolean esNumMultiplo5(Integer n){
        return n % 5 == 0;
    }
    private boolean esMultiplo3(Integer n){
        return n % 3 == 0;
    }

}
