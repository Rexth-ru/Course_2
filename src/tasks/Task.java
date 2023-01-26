package tasks;

import enums.Type;
import exceptions.IncorrectArgumentException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task {
   private String title;
    private String description;
    private Type type;
    private LocalDateTime dateTime;
    private static int idGenerator;
    private int id;
    public abstract boolean appearsln(LocalDate date);


    public Task(String title, String description, Type type,LocalDateTime dateTime) throws RuntimeException {
        setTitle(title);
        setDescription(description);
        if (type == null){
            throw new IncorrectArgumentException("Не корректно введен тип задачи");
        }else {
            this.type = type;
        }
        if (dateTime.isBefore(LocalDate.now().atStartOfDay())){
            System.out.println("Введите другую дату");
        }else {
            this.dateTime = dateTime;
        }
        idGenerator++;
        id = idGenerator;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }


    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDescription(String description) {
        if (description == null) {
            throw new IncorrectArgumentException("Не введен заголовок");
        } else {
            this.description = description;
        }
    }

    public void setTitle(String title) {
        if (title == null) {
            throw new IncorrectArgumentException("Не введен заголовок");
        }else {

        }this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return getId() == task.getId() && getTitle().equals(task.getTitle()) && Objects.equals(getDescription(), task.getDescription()) && getType() == task.getType() && getDateTime().equals(task.getDateTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription(), getType(), getDateTime(), getId());
    }

    @Override
    public String toString() {
        return "Заголовок задачи: " + title +
                " Описание задачи: " + description +
                " Тип задачи: " + type +
                " Дата создания задачи: " + dateTime +
                " Номер по порядку: " + id;
    }
}
