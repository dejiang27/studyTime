package LeetCode;

public class CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int n = 0;
        int vv1, vv2;
        while(n < v1.length || n < v2.length){
            if(n >= v1.length){
                vv1 = 0;
            }else{
                vv1 = Integer.valueOf(v1[n]);
            }
            if(n >= v2.length){
                vv2 = 0;
            }else{
                vv2 = Integer.valueOf(v2[n]);
            }

            if(vv1 > vv2){
                System.out.println("V1>V2");
                return 1;
            }else if(vv1< vv2){
                System.out.println("V1<V2");
                return -1;
            }else{
                n++;
                continue;
            }
        }
        System.out.println("V1=V2");
        return 0;
    }

    public static void main(String[] args){
        CompareVersionNumbers cvn = new CompareVersionNumbers();
        cvn.compareVersion("0.1", "1.1");
        cvn.compareVersion("1.0.1", "1");
        cvn.compareVersion("7.5.2.4", "7.5.3");
        cvn.compareVersion("1.01", "1.001");
        cvn.compareVersion("1.0", "1.0.0");

    }
}
