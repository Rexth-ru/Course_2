package tasks;
import exceptions.TaskNotFoundException;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TaskService{
   private Map<Integer, Task> taskMap = new HashMap<>();
   private Collection<Task> removedTasks;

   public void add(Task task){
       taskMap.put(task.getId(), task);
   }
   public Task remove(int id) throws TaskNotFoundException{
       taskMap.remove(id);
       return null;
   }
   public Collection<Task> getAllByDate(LocalDate date)  {

       return taskMap.values().stream().filter((Task x) -> x.appearsln(date)).collect(Collectors.toList());
   }

    @Override
    public String toString() {
        return "Ежедневник содержит задачи: " + taskMap ;
    }
}
