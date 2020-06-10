package LeetCode;

public class ComplementofBase10Integer {

    public int bitwiseComplement(int N){

        String bin = Integer.toBinaryString(N);
        String n = "";
        int ans;
        for(char i: bin.toCharArray()){
            if(i == '0'){
                n += '1';
            }else{
                n += '0';
            }
        }
        ans = Integer.parseInt(n,2);
        System.out.println(ans);
        return ans;

    }
    public static void main(String[] args){
        ComplementofBase10Integer cb = new ComplementofBase10Integer();
        cb.bitwiseComplement(25);
    }
}
