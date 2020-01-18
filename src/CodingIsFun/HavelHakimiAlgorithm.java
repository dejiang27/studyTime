package CodingIsFun;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.ArrayList;
import java.util.List;

public class HavelHakimiAlgorithm {

    public int[] warmup1(int[] list){

        int[] result = new int[list.length];
        int j = 0;
        for(int x = 0; x < list.length; x++){
            if (list[x] != 0){
                result[j] = list[x];
                //System.out.println(result[j]);
                j ++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        HavelHakimiAlgorithm hha = new HavelHakimiAlgorithm();
        int[] test = {0,0,0,4,0};

        int[] result = hha.warmup1(test);
        String s = "";
        for (int y = 0; y < result.length; y ++){
            System.out.print(result[y]);
        }
    }
}
