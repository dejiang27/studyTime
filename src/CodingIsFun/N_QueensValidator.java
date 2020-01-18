package CodingIsFun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class N_QueensValidator {

    public void qchcker(int[] alist){

        Arrays.sort(alist);

        for(int x = 0; x < alist.length-1; x ++){
            if(alist[x] == alist[x+1]){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }

    public static void main(String[] args){
        N_QueensValidator n = new N_QueensValidator();

        System.out.println("----------Testing----------");
        n.qchcker(new int[]{4, 2, 7, 3, 6, 8, 5, 1});
        n.qchcker(new int[]{2, 5, 7, 4, 1, 8, 6, 3});
        n.qchcker(new int[]{5, 3, 1, 4, 2, 8, 6, 3});
        n.qchcker(new int[]{5, 8, 2, 4, 7, 1, 3, 6});
        n.qchcker(new int[]{4, 3, 1, 8, 1, 3, 5, 2});

    }

}
