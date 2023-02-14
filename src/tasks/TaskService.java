package tasks;
import exceptions.TaskNotFoundException;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TaskService{
   private Map<Integer, Task> taskMap = new HashMap<>();
   private Collection<Task> removedTasks;
//добавить задачу
   public void add(Task task){
       taskMap.put(task.getId(), task);
   }
//удалить задачу
   public Task remove(int id) throws TaskNotFoundException{
       if (!taskMap.containsKey(id)){
           throw new TaskNotFoundException();
       }else {
           return  taskMap.remove(id);
       }
   }
 //получить задачи на определенную дату
   public Collection<Task> getAllByDate(LocalDate date)  {

       return taskMap.values().stream().filter((Task x) -> x.appearsln(date)).collect(Collectors.toList());
   }

    @Override
    public String toString() {
        return "Ежедневник содержит задачи: " + taskMap ;
    }
}
