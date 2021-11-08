import java.util.Date;

public class Gethoroscope {

    public static String firstUpperCase(String word) {
        // 1-ая заглавная
        if (word == null || word.isEmpty()) return ""; //или return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

public static void Horoscope(String name,int fate){
    Date today = new Date();
    System.out.printf("%1$s %2$td %2$tB %2$tY", "Ваш гороскоп на:", today);
    System.out.println("\n"+  firstUpperCase(name)+ ":");
    switch(name){
        case "овен":
            System.out.println(Infohere.Arr1[fate]);
            System.out.println("-----------------");
            break;
        case "телец":
            System.out.println(Infohere.Arr2[fate]);
            System.out.println("-----------------");
            break;
        case "близнецы":
            System.out.println(Infohere.Arr3[fate]);
            System.out.println("-----------------");
            break;
        case "рак":
            System.out.println(Infohere.Arr4[fate]);
            System.out.println("-----------------");
            break;
        case "лев":
            System.out.println(Infohere.Arr5[fate]);
            System.out.println("-----------------");
            break;
        case "дева":
            System.out.println(Infohere.Arr6[fate]);
            System.out.println("-----------------");
            break;
        case "весы":
            System.out.println(Infohere.Arr7[fate]);
            System.out.println("-----------------");
            break;
        case "скорпион":
            System.out.println(Infohere.Arr8[fate]);
            System.out.println("-----------------");
            break;
        case "стрелец":
            System.out.println(Infohere.Arr9[fate]);
            System.out.println("-----------------");
            break;
        case "козерог":
            System.out.println(Infohere.Arr10[fate]);
            System.out.println("-----------------");
            break;
        case "водолей":
            System.out.println(Infohere.Arr11[fate]);
            System.out.println("-----------------");
            break;
        case "рыбы":
            System.out.println(Infohere.Arr12[fate]);
            System.out.println("-----------------");
            break;
    }
    }
}
