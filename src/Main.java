import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log(logger.outTime() + " Начало работы.");
        Scanner in = new Scanner(System.in);
        System.out.print(logger.outTime() + " Введите размер списка: ");
        int size = in.nextInt();
        System.out.print(logger.outTime() + " Введите верхнюю границу для значений: ");
        int upNum = in.nextInt();
        logger.log(logger.outTime() + " Создаём и наполняем список. ");
        List<Integer> randomArr = fillingArr(size, upNum);
        logger.log(logger.outTime() + " Вот случайный список: " + randomArr.toString());
        logger.log(logger.outTime() + " Просим пользователя ввести входные данные для фильтрации.");
        System.out.print(logger.outTime() + " Введите порог для фильтра: ");
        int filterNum = in.nextInt();
        Filter filter = new Filter(filterNum);
        List<Integer> arrResult = filter.filterOut(randomArr);
        logger.log(logger.outTime() + " Отфильтрованный список: " + arrResult.toString());
        logger.log(logger.outTime() + " Окончание работы.");
    }

    public static List<Integer> fillingArr(int size, int upNum) {
        List<Integer> arrSource = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrSource.add(random.nextInt(upNum));
        }
        return arrSource;
    }
}