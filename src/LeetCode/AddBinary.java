package LeetCode;

public class AddBinary {

    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        boolean carry = false;

        while(aIndex >= 0 || bIndex >= 0 || carry)
        {
            char aChar = (aIndex >= 0 ? a.charAt(aIndex--) : '0');
            char bChar = (bIndex >= 0 ? b.charAt(bIndex--) : '0');

            /*
                0 0 -> 0
                0 1 -> 1
                1 0 -> 1
                1 1 -> 0 (carry 1)
            */

            char result = '0';

            if(aChar == '0' && bChar == '0')
            {
                if(carry)
                {
                    result = '1';
                    carry = false;
                }
            }
            else if(aChar == '1' && bChar == '1')
            {
                if(carry)
                {
                    result = '1';
                }
                carry = true;
            }
            else
            {
                if(carry)
                {
                    carry = true;
                }
                else
                {
                    result = '1';
                }
            }

            sb.append(result);
        }

        String ans = sb.reverse().toString();
        System.out.println(ans);
        return ans;
    }


    public static void main(String[] args){
        AddBinary ab = new AddBinary();
        ab.addBinary("11","1");
        ab.addBinary("1010","1011");
    }
}
