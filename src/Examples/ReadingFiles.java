package Examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFiles {




    public static void main(String[] args) throws Exception
    {
        //Example of using BufferedReader

        List<String> list = new ArrayList<>();

        FileReader fr = new FileReader("//Users//dejiangchen//Documents//GitHub//studyTime//src//Examples//ReadingTest.txt");
        BufferedReader br = new BufferedReader(fr);

        //A way to store all lines to a list
        /*
        list = br.lines().collect(Collectors.toList());

        for(int x = 0; x < list.size(); x ++){
            System.out.println(list.get(x));
        }

         */

        String i;
        while((i = br.readLine()) != null){
            System.out.println((String)i);
        }
        br.close();
        fr.close();

        //This is an example of using Scanner

        /*
        //Get the in put
        //Scanner sc = new Scanner(System.in);

        //Get from the TEXT file
        Scanner sc = new Scanner(new File("//Users//dejiangchen//Documents//GitHub//studyTime//src//Examples//ReadingTest.txt"));

        String i;

        while(sc.hasNextLine()){
            i = sc.nextLine();
            System.out.println(i);
        }
        sc.close();

         */

    }


}
