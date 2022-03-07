public class calculator {
    public static void main(String[] args){
        System.out.println("1つ目の数字を入力して下さい。");
        double x = new java.util.Scanner(System.in).nextDouble();
        System.out.println("+ あるいは - あるいは * あるいは / を入力して下さい。");
        String enzanshi = new java.util.Scanner(System.in).nextLine();
        System.out.println("2つ目の数字を入力して下さい。");
        double y = new java.util.Scanner(System.in).nextDouble();

        double kekka;
        switch (enzanshi){
            case "+" :
            kekka = x + y;
            System.out.println("計算結果は" + kekka + "です。");
            case "-" :
            kekka = x - y;
            System.out.println("計算結果は" + kekka + "です。");
            case "*" :
            kekka = x * y;
            System.out.println("計算結果は" + kekka + "です。");
            case "/" :
            kekka = x / y;
            System.out.println("計算結果は" + kekka + "です。");
            default :
            System.out.println("計算できません。");
        }
    }
}
