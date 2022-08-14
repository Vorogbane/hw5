public class Main {
    public static void main(String[] args) {
        // task 1
        int i = 1;
        while  (i <= 10) {
            System.out.print(i + " ");
            if (i==10) {
                break;
            }
            i ++;
        }
        System.out.println( );
        for ( ;i > 0; i --) {
            System.out.print(i + " ");
        }
        System.out.println();




        // task 2
        int firstFriday = 3;
        for (; firstFriday<=31; firstFriday = firstFriday + 7) {
            System.out.println(firstFriday + " - пятница, нужно подготовить отчет.");
            if (firstFriday == 7) {
                break;
            }
        }

        // task 3


        int begin = 0;
        int year = 2017;
        int circle = 79;
        int TwoHundredBack = year - 200;
        int PlusHundred = year + 100;
        while (begin <= PlusHundred) {
            if (begin % circle == 0 & begin >= TwoHundredBack & begin <= PlusHundred) {
                System.out.println(begin);
            }
            begin ++;
        }
    }
}