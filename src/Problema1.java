public class Problema1 {
    private String nums;

    public String numbers(){
        int contador = 0;
        for (int i = 0; i < 21 ; i++) {
            if(esMultiplo3(i) && esNumMultiplo5(i)){
               nums =  nums + "FizzBuzz" ;
            } else if(esNumMultiplo5(i) && !esMultiplo3(i)){
                nums =  nums + "Buzz";
            } else if(esMultiplo3(i) && !esNumMultiplo5(i)){
                nums = nums + "Fizz";
            }else{
                nums = nums +  String.valueOf(contador);
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
