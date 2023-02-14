package tasks;

import enums.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task{


    public YearlyTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title, description, type, dateTime);
    }
//переопределен метод для добавления ежегодной задачи
    @Override
    public boolean appearsln(LocalDate date) {
        Boolean b = date.equals(getDateTime().toLocalDate()) ||
                (date.isAfter(getDateTime().toLocalDate()) &&
                        (date.getDayOfMonth() == getDateTime().toLocalDate().getDayOfMonth() && date.getMonth() == getDateTime().getMonth()));
        return b;
    }
}
