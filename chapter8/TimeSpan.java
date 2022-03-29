//Represents a time span of elapsed hours and minutes
// Second implementation using only a single field of total minutes
// Class invariant: totalMinutes >= 0

public class TimeSpan {
    private int totalMinutes;
    
    // Constructs time span with given interval
    // pre: hours >= 0 && minutes >= 0
    public TimeSpan(int hours, int minutes) {
        this.totalMinutes = 0;
        add(hours, minutes);
    }

    // Add the given interval into this time span
    // pre: hours >= 0 $$ minutes >= 0
    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }
        this.totalMinutes += hours * 60 + minutes;
    }
    
    // return String of this time span, for example: "6h 25m"
    public String toString() {
        return (this.totalMinutes / 60) + "h " +
         (this.totalMinutes % 60) + "m";
    }

    // Adds the given amount of time to this time span
    public void add(TimeSpan span) {
        this.totalMinutes += span.totalMinutes;
    }

    // Subtracts the given amount of time to this time span
    public void subtract(TimeSpan span) {
        this.totalMinutes -= span.totalMinutes;
    }
}
