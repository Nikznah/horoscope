import java.util.Locale;

/**
 * Программа - гороскоп
 * Определяет гороскоп на сегодня по введеным знакам задиака.
 * Входные параметры - название знаков задиака на русском языке через пробел
 * Пример: лев близнецы козерог
 */
public class Application {
    public static void main(String[] args) {
        String[] arrAllSign = {"овен", "телец", "близнецы", "рак", "лев", "дева",
                "весы", "скорпион", "стрелец", "козерог", "водолей", "рыбы"};

        if (args.length == 0) {
            throw new IllegalArgumentException("Введите один или более аргументов!");
        }

        for (String arg : args) {
            String name = arg.toLowerCase();
            boolean check = false;
            for (String str : arrAllSign) {
                if (name.equals(str)) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                throw new IllegalArgumentException("Знак задиака \"" + name + "\" отсутствует в базе данных! - ");
            }

            int fate = (int) (Math.random() * 2);
            Gethoroscope.Horoscope(name, fate);
        }
    }
}
