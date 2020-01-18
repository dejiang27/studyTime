package CodingIsFun;

public class AddingOneForEachDigit {

    long fun(long x) {
        if (x<10) return x+1;
        long a = x%10 + 1;
        long b = fun(x/10)*10;
        return (a==10) ? ((b+1)*10) : (b+a);
    }

    public static void main(String[] args){
        AddingOneForEachDigit ao = new AddingOneForEachDigit();

        long ans = ao.fun(998);
        System.out.println(ans);
    }
}

//return a ? b : c; means "return b if a is true, else return c".