import java.util.Date;

/**
 * Вывод гороскопа в консоль
 */
public class Gethoroscope {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static String firstUpperCase(String word) {
        if (word == null || word.isEmpty()) return ""; //или return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static void Horoscope(String name, int fate) {
        Date today = new Date();
        System.out.printf("%1$s %2$td %2$tB %2$tY", "Ваш гороскоп на:", today);
        System.out.println("\n" + firstUpperCase(name) + ":");

        switch (name) {
            case "овен":
                System.out.println(Infohere.Arr1[fate]);
                break;
            case "телец":
                System.out.println(Infohere.Arr2[fate]);
                break;
            case "близнецы":
                System.out.println(Infohere.Arr3[fate]);
                break;
            case "рак":
                System.out.println(Infohere.Arr4[fate]);
                break;
            case "лев":
                System.out.println(Infohere.Arr5[fate]);
                break;
            case "дева":
                System.out.println(Infohere.Arr6[fate]);
                break;
            case "весы":
                System.out.println(Infohere.Arr7[fate]);
                break;
            case "скорпион":
                System.out.println(Infohere.Arr8[fate]);
                break;
            case "стрелец":
                System.out.println(Infohere.Arr9[fate]);
                break;
            case "козерог":
                System.out.println(Infohere.Arr10[fate]);
                break;
            case "водолей":
                System.out.println(Infohere.Arr11[fate]);
                break;
            case "рыбы":
                System.out.println(Infohere.Arr12[fate]);
                break;
        }
        System.out.println(ANSI_RED + "-----------------" + ANSI_RESET);
    }
}
