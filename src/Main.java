public class Main {
    public static void main(String[] args) {

        User user1 = new User("Aruzhan", 20, 55.5);
        User user2 = new User("Dana", 22, 60.0);

        WorkoutRoutine workout1 =
                new WorkoutRoutine("Cardio", 30, 300);
        WorkoutRoutine workout2 =
                new WorkoutRoutine("Strength", 45, 450);

        user1.displayUser();
        user2.displayUser();

        System.out.println();

        workout1.displayWorkout();
        workout2.displayWorkout();

        System.out.println();

        if (workout1.getCaloriesBurned() > workout2.getCaloriesBurned()) {
            System.out.println("Cardio burns more calories");
        } else if (workout1.getCaloriesBurned() < workout2.getCaloriesBurned()) {
            System.out.println("Strength burns more calories");
        } else {
            System.out.println("Both workouts burn same calories");
        }
    }
}