package CodingIsFun;

public class AxisAlignedPacking {


    public void fit1(int x, int y, int x1, int y1){

        int fx;
        int fy;

        fx = (x-(x%x1))/x1;
        fy = (y-(y%y1))/y1;

        System.out.println("You can fit "+fx*fy+" boxs in the rectangle." );


    }

    public void fit2(int x, int y, int x1, int y1){

        int fx, fy, rx, ry;

        fx = (x-(x%x1))/x1;
        fy = (y-(y%y1))/y1;

        rx = (x-(x%y1))/y1;
        ry = (y-(y%x1))/x1;

        if(fx*fy > rx*ry){
            System.out.println("You can fit "+fx*fy+" boxs in the rectangle." );
        }else {
            System.out.println("You can fit "+rx*ry+" boxs in the rectangle." );
        }
    }

    public void fit3(int x, int y, int z, int x1, int y1, int z1){

        int fx, fy, fz;

        fx = (x-(x%x1))/x1;
        fy = (y-(y%y1))/y1;
        fz = (z-(z%z1))/z1;

        System.out.println("You can fit "+fx*fy*fz+" boxs in the third dimension." );
    }


    public static void main(String[] args){

        AxisAlignedPacking aap = new AxisAlignedPacking();

        System.out.println("----------Testing fit1----------");

        aap.fit1(25, 18, 6, 5);
        aap.fit1(10, 10, 1, 1);
        aap.fit1(12, 34, 5, 6);
        aap.fit1(12345, 678910, 1112, 1314);
        aap.fit1(5, 100, 6, 1);

        System.out.println("----------Testing fit2----------");

        aap.fit2(25, 18, 6, 5);
        aap.fit2(12, 34, 5, 6);
        aap.fit2(12345, 678910, 1112, 1314);
        aap.fit2(5, 5, 3, 2);
        aap.fit2(5, 100, 6, 1);
        aap.fit2(5, 5, 6, 1);

        System.out.println("----------Testing fit3----------");

        aap.fit3(10, 10, 10, 1,1,1);
        aap.fit3(12, 34, 56, 7, 8, 9);
        aap.fit3(123, 456, 789, 10, 11, 12);
        aap.fit3(1234567, 89101112, 13141516, 171819, 202122, 232425);
    }
}
