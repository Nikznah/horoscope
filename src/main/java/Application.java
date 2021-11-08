import java.util.Locale;

public class Application {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    // добавим красок ---> коду
    public static void main(String[] args) {
        String[] arrAllZnak ={"овен", "телец", "близнецы", "рак", "лев", "дева",
                "весы", "скорпион", "стрелец", "козерог", "водолей", "рыбы"};
        // проверяю наличие входного параметра
        if (args.length != 0){
            // добавил вохможность вводить сразу несколько знаков задиака через пробел
            for (String arg: args
                 ) {
             // делаю все маленькое
            String name = arg.toLowerCase();
            // проверяю на наличие знака задиака в массиве
            boolean checker = false;
            for (int i = 0; i < arrAllZnak.length;i++ ){
                if (arrAllZnak[i].equals(name)){
                    checker = true;
                    break;
                }
            }
            // если есть
            if (checker){
                // рандомим инт
                int fate =(int) (Math.random()*2);
                // вызываем метод
                Gethoroscope.Horoscope(name,fate);
            }
            // если нет
            else{
                // красный вывод (ошибка)
            System.out.println(ANSI_RED + "Знака задиака: \"" + name +"\" нет в базе данных"+ ANSI_RESET);
            }
            }
        }
        else {
            System.out.println(ANSI_RED + "Введите знак(и) задиака!" + ANSI_RESET);
        }
    }
}
