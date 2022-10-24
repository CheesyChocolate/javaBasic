package Session6;

public class part3 {
    public static void main(String[] args) {
//        int H_count = 0;
//        int c = 0;
//        while (c < 100) {
//            double r = Math.random();
//            if (r <= 0.5) {
//                System.out.println("H");
//                H_count++;
//            }
//            else {
//                System.out.println("T");
//            }
//            c++;
//        }
//        System.out.println("The number of Heads: " + H_count);
        int s1 = 0, s2=0, s3=0, s4=0, s5=0, s6 = 0;
        int c = 0;
        while (c < 100) {
            int dice1=(int)(Math.random()*6+1);
            switch (dice1) {
                case 1:
                    System.out.println("1");
                    s1++;
                    break;
                case 2:
                    System.out.println("2");
                    s2++;
                    break;
                case 3:
                    System.out.println("3");
                    s3++;
                    break;
                case 4:
                    System.out.println("4");
                    s4++;
                    break;
                case 5:
                    System.out.println("5");
                    s5++;
                    break;
                case 6:
                    System.out.println("6");
                    s6++;
                    break;
            }
            c++;
        }
        System.out.println("1: " + s1);
        System.out.println("2: " + s2);
        System.out.println("3: " + s3);
        System.out.println("4: " + s4);
        System.out.println("5: " + s5);
        System.out.println("6: " + s6);
    }
}
