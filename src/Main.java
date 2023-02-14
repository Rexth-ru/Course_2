import enums.Type;
import exceptions.IncorrectArgumentException;
import exceptions.TaskNotFoundException;
import tasks.*;

import java.time.LocalDate;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws RuntimeException {
//        try {
//            Task task1 = new MonthlyTask(null, "wertyu gfjk", Type.WORKING, LocalDate.now().atStartOfDay());
//
//        } catch (IncorrectArgumentException e) {
//            System.out.println("Поле заголовка должно быть заполнено");
//        } finally {
//            System.out.println("Введите заголовок");
//        }


        MonthlyTask task1 = new MonthlyTask("null", "wertyu gfjk", Type.WORKING, LocalDate.now().atStartOfDay());

        DailyTask task2 = new DailyTask("zxcv", "qw er df", Type.PERSONAL, LocalDate.of(2023, 1, 30).atStartOfDay());
        YearlyTask task3 = new YearlyTask("qwe", "lk df mn", Type.PERSONAL, LocalDate.of(2023, 8, 2).atStartOfDay());
        OneTimeTask task4 = new OneTimeTask("cvb", "df zx", Type.WORKING, LocalDate.now().atStartOfDay());
        WeeklyTask task5 = new WeeklyTask("opi", "sf", Type.PERSONAL, LocalDate.now().atStartOfDay());
        TaskService taskMap = new TaskService();
        taskMap.add(task1);
        taskMap.add(task3);
        taskMap.add(task2);
        taskMap.add(task4);
        taskMap.add(task5);
        try {
            taskMap.remove(8);
        } catch (TaskNotFoundException e) {
            System.out.println("Задачи не существует");
        }

        System.out.println(taskMap);

        System.out.println(taskMap.getAllByDate(LocalDate.of(2023, 1, 26)));


    }
}
