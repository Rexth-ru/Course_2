package tasks;

import enums.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task{


    public OneTimeTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title, description, type, dateTime);
    }
//переопределен метод для добавления разовой задачи
    @Override
    public boolean appearsln(LocalDate date) {
        Boolean b = date.equals(getDateTime());
        return b;
    }
}
