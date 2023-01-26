package tasks;

import enums.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask extends Task{


    public MonthlyTask(String title, String description, Type type, LocalDateTime dateTime) {
        super(title, description, type, dateTime);

    }

    @Override
    public boolean appearsln(LocalDate date) {
        Boolean b = date.equals(getDateTime().toLocalDate()) ||
                (date.isAfter(getDateTime().toLocalDate()) &&
                        date.getDayOfMonth() == getDateTime().toLocalDate().getDayOfMonth());
        return b;
    }

}
