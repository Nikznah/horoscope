import java.util.Locale;

public class Application {

    public static void main(String[] args) {
        String[] arrAllZnak ={"овен", "телец", "близнецы", "рак", "лев", "дева",
                "весы", "скорпион", "стрелец", "козерог", "водолей", "рыбы"};
        if (args.length != 0){
            // проверяю наличие входного параметра
            String Name = args[0].toLowerCase();
            // проверяю на наличие знака задиака в массиве
            boolean checker = false;
            for (int i = 0; i < arrAllZnak.length;i++ ){
                if (arrAllZnak[i].equals(Name)){
                    checker = true;
                    break;
                }
            }
            // если есть
            if (checker){
                // рандомим инт
                int fate =(int) (Math.random()*2);
                // вызываем метод
                Gethoroscope.Horoscope(Name,fate);
            }
            // если нет
            else{
            System.out.println("Данного Знака задиака нет в базе данных");
            }
        }
        else {
            System.out.println("Введите  знак задиака!");
        }
    }
}
