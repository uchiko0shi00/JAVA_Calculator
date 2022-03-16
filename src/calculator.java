public class calculator {
    public static void main(String[] args) {
        while (true) {

            System.out.println("1つ目の数字を入力して下さい。");
            double x = new java.util.Scanner(System.in).nextDouble();
            System.out.println("+ あるいは - あるいは * あるいは / を入力して下さい。");
            String enzanshi = new java.util.Scanner(System.in).nextLine();
            System.out.println("2つ目の数字を入力して下さい。");
            double y = new java.util.Scanner(System.in).nextDouble();

            double kekka;
            int seisuukekka;
            switch (enzanshi) {
                case "+":
                    kekka = x + y;
                    if (kekka % 1 == 0) {
                        seisuukekka = (int) kekka;
                        System.out.println("計算結果は" + seisuukekka + "です。");
                    } else {
                        System.out.println("計算結果は" + kekka + "です。");
                    }
                    break;
                case "-":
                    kekka = x - y;

                    if (kekka % 1 == 0) {
                        seisuukekka = (int) kekka;
                        System.out.println("計算結果は" + seisuukekka + "です。");
                    } else {
                        System.out.println("計算結果は" + kekka + "です。");
                    }
                    break;
                case "*":
                    kekka = x * y;

                    if (kekka % 1 == 0) {
                        seisuukekka = (int) kekka;
                        System.out.println("計算結果は" + seisuukekka + "です。");
                    } else {
                        System.out.println("計算結果は" + kekka + "です。");
                    }
                    break;
                case "/":
                    kekka = x / y;
                    if (kekka % 1 == 0) {
                        seisuukekka = (int) kekka;
                        System.out.println("計算結果は" + seisuukekka + "です。");
                    } else {
                        System.out.println("計算結果は" + kekka + "です。");
                    }
                    break;
                default:
                    System.out.println("計算できません。");
            }
        }
    }
}
