package CodingIsFun;

public class LuhnAlgotithm {

    public long getDouble(long num){

        long sums = 0;
        int y = 1;
        while(String.valueOf(num).length()+2 > y){
            System.out.println("While loop test");
            long x = 0;
            if(y - 1 == 0){
                x = num%(10^y);
            }else{
                x = num%(10^y) - num%(10^(y-1));
            }
            if(y %2 == 0){
                if(x *2 > 10){
                    sums = sums +((x *2 )%10 + (x *2 )%100);
                }
                else{
                    sums = sums + x*2;
                }
            }else{
                sums+= x;
            }
            y++;
        }

        return sums;
    }

    public static void main(String[] args){
        LuhnAlgotithm la = new LuhnAlgotithm();

        long result = la.getDouble(Long.parseLong("123"));

        System.out.println(result);
    }


}
