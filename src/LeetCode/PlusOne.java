package LeetCode;

public class PlusOne {


    public int[] plusOne(int[] digits) {

        boolean ten = false;
        for(int x = digits.length -1; x>=0; x--){
            int y = 0;
            if(x == digits.length-1){
                y = digits[x]+1;
            }else{
                y = digits[x];
            }
            if(ten == true){
                y +=1;
                ten = false;
            }
            if(y< 10){
                digits[x] = y%10;
                return digits;
            }else{
                if(x != 0){
                    digits[x] = 0;
                    ten = true;
                }else{
                    int[] r = new int[digits.length +1];
                    r[0] = 1;
                    r[1] = y%10;
                    for(int z = 1; z < digits.length-1; z ++){
                        r[z+1] = digits[z];
                    }
                    return r;
                }
            }
        }
        return digits;
    }

    public static void main(String[] args){
        PlusOne po = new PlusOne();
        po.plusOne(new int[]{1,2,3});
        po.plusOne(new int[]{4,3,2,1});

    }
}
