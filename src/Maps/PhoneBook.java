package Maps;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
// Задание 1.1
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Анастасия Моисеева", "3(250)841-2455");
        phoneBook.put("Александр Зыков", "349(232)942-9328");
        phoneBook.put("Михаил Кузнецов", "315(754)068-5232");
        phoneBook.put("Камилла Козлова", "82(05)450-7539");
        phoneBook.put("Павел Пирогов", "2(57)223-8307");
        phoneBook.put("Александра Авдеева", "211(9320)855-8202");
        phoneBook.put("Михаил Серебряков", "3(581)147-0777");
        phoneBook.put("Виктория Карпова", "09(0812)004-6876");
        phoneBook.put("Илья Чесноков", "0(45)690-1609");
        phoneBook.put("Ольга Завьялова", "75(734)475-5701");
        phoneBook.put("Анастасия Бурова", "87(8714)836-0069");
        phoneBook.put("Мария Колпакова", "44(2848)237-9495");
        phoneBook.put("Родион Трофимов", "6(14)513-8739");
        phoneBook.put("Екатерина Молчанова", "24(7315)970-3507");
        phoneBook.put("Екатерина Кузнецова", "60(81)377-6559");
        phoneBook.put("Лидия Левина", "92(9920)102-1482");
        phoneBook.put("Николь Денисова", "2(2474)017-7737");
        phoneBook.put("Софья Вдовина", "3(1284)354-6784");
        phoneBook.put("Александра Крылова", "077(15)257-0353");


        for (Map.Entry<String, String> item : phoneBook.entrySet()) {
            System.out.printf("Ключ: %s, Зачение: %s \n", item.getKey(), item.getValue());
        }
    }

}
