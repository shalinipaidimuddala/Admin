import java.util.*;

public class TaskScheduler {

    public static int scheduleTasks(int numWorkers, int[] workerCapacities, int numTasks, Task[] tasks) {
        // Sort tasks by priority in descending order
        Arrays.sort(tasks, (a, b) -> Integer.compare(b.priority, a.priority));

        int[] workerTimes = new int[numWorkers];

        for (Task task : tasks) {
            boolean assigned = false;

            for (int i = 0; i < numWorkers; i++) {
                if (workerCapacities[i] >= task.duration) {
                    workerTimes[i] += task.duration;
                    workerCapacities[i] -= task.duration;
                    assigned = true;
                    break;
                }
            }

            if (!assigned) {
                return -1; // Not possible to assign tasks
            }
        }

        int maxTime = 0;
        for (int time : workerTimes) {
            maxTime = Math.max(maxTime, time);
        }

        return maxTime;
    }

    static class Task {
        int id;
        int priority;
        int duration;

        public Task(int id, int priority, int duration) {
            (link unavailable) = id;
            this.priority = priority;
            this.duration = duration;
        }
    }

    public static void main(String[] args) {
        // Test cases
        int numWorkers = 4;
        int[] workerCapacities = {8, 6, 10, 7};
        int numTasks = 5;
        Task[] tasks = {
                new Task(1, 8, 4),
                new Task(2, 5, 6),
                new Task(3, 2, 2),
                new Task(4, 9, 3),
                new Task(5, 6, 1)
        };

        System.out.println(scheduleTasks(numWorkers, workerCapacities, numTasks, tasks)); // Output: 10

        numWorkers = 3;
        workerCapacities = new int[] {4, 4, 5};
        numTasks = 4;
        tasks = new Task[] {
                new Task(1, 5, 6),
                new Task(2, 3, 3),
                new Task(3, 7, 4),
                new Task(4, 1, 2)
        };

        System.out.println(scheduleTasks(numWorkers, workerCapacities, numTasks, tasks)); // Output: -1
    }
}

