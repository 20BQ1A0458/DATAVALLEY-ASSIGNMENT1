public class Divisible {
    public static void main(String args[]){
        int[] values = {100,52,43,99,42,40,91};
        int sum = 0;
        for(int i =0;i<values.length;i++){
            if(values[i]%10 == 0){
                sum+=values[i];
            }
        }
        System.out.println(sum);
    }
}
