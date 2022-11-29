import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Multiplication {

    private final Set<Task> tasks = new HashSet<>();

    public void multiplicationTable(){
        Random random = new Random();
        while(tasks.size() < 15){
            tasks.add(new Task(random.nextInt(10),random.nextInt(2)));
        }
    }

    @Override
    public String toString() {
        return "Multiplication{" +
                "tasks=" + tasks +
                '}';
    }
}
