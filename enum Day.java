Here's the Java code to implement the enum Day:


// Define enum Day
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    // Method to get day type (Weekday/Weekend)
    public String getDayType() {
        return isWeekend() ? "Weekend" : "Weekday";
    }

    // Method to check if day is weekend
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    // Override toString() to return full day name
    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace("_", " ");
    }

    // Method to compare days
    public int compareDays(Day day) {
        return Integer.compare(this.ordinal(), day.ordinal());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Print each day and its type
        for (Day day : Day.values()) {
            System.out.println(day + " - " + day.getDayType());
        }

        // Check if a specific day is weekend
        Day specificDay = Day.SATURDAY;
        System.out.println("\nIs " + specificDay + " a weekend? " + specificDay.isWeekend());

        // Compare two days
        Day day1 = Day.TUESDAY;
        Day day2 = Day.THURSDAY;
        int comparison = day1.compareDays(day2);
        System.out.println("\nComparison of " + day1 + " and " + day2 + ":");
        if (comparison < 0) {
            System.out.println(day1 + " is earlier in the week.");
        } else if (comparison > 0) {
            System.out.println(day1 + " is later in the week.");
        } else {
            System.out.println("Both days are the same.");
        }
    }
}


Output:


Monday - Weekday
Tuesday - Weekday
Wednesday - Weekday
Thursday - Weekday
Friday - Weekday
Saturday - Weekend
Sunday - Weekend

Is Saturday a weekend? true

Comparison of Tuesday and Thursday:
Tuesday is earlier in the week.


Explanation:

- We define an enum Day representing the days of the week.
- The getDayType() method returns a string indicating whether the day is a Weekday or Weekend.
- The isWeekend() method checks if the day is Saturday or Sunday.
- The toString() method returns the full name of the day.
- The compareDays() method compares the order of days in a week.
- In the main class, we demonstrate how to use the enum to print each day and its type, check if a specific day is a weekend, and compare two days.