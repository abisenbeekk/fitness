public class WorkoutRoutine {
    private String name;
    private int duration;
    private int caloriesBurned;

    public WorkoutRoutine(String name, int duration, int caloriesBurned) {
        this.name = name;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public void displayWorkout() {
        System.out.println("Workout: " + name +
                ", Duration: " + duration +
                " min, Calories: " + caloriesBurned);
    }
}

