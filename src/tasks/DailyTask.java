package tasks;

import enums.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTask extends Task {


    public DailyTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title, description, type, dateTime);
    }
//переопределен метод для добавления ежедневной задачи
    @Override
    public boolean appearsln(LocalDate date) {
        boolean b = date.equals(getDateTime().toLocalDate()) || date.isAfter(getDateTime().toLocalDate());
        return b;
    }
}
