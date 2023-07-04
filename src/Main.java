import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int  kyrgyzstan= scanner.nextInt();
        switch (kyrgyzstan){
            case 1 :
                System.out.println( Oblast.CHUY);
                break;
            case 2 :
                System.out.println(Oblast.BATKEN);
                break;
            case 3 :
                System.out.println(Oblast.OSH);
                break;
            case 4:
                System.out.println(Oblast.JALA_ABAD);
                break;
            case 5 :
                System.out.println(Oblast.NARYN);
                break;
            case 6 :
                System.out.println(Oblast.YSSUK_KOL);
                break;
            case 7:
                System.out.println(Oblast.TALAS);
            default:
                System.out.println(kyrgyzstan);


        }

    }
}