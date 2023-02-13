package tasks;

import enums.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

public class WeeklyTask extends Task{


    public WeeklyTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title, description, type, dateTime);
    }
//переопределен метод для добавления еженедельной задачи
    @Override
    public boolean appearsln(LocalDate date) {
        Boolean b = date.equals(getDateTime().toLocalDate()) || date.getDayOfWeek()==getDateTime().getDayOfWeek();
        return b;
    }
}
