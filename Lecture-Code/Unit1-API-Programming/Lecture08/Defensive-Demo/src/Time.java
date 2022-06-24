public class Time {
    //Attribute for time
    //Hours
    private int hours;
    //Minutes
    private int minutes;
    //Seconds
    private int seconds;

    //constructor to create a time instance
    public Time(int hours, int minutes, int seconds) {
        this.setTime(hours, minutes, seconds);
    }

    //set time
    public void setTime(int hours, int minutes, int seconds) {
        this.setHour(hours);
        this.setMinute(minutes);
        this.setSecond(seconds);

    }

    private void setHour(int hours) {
        if (hours < 0 || hours >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.hours = hours;
    }

    private void setMinute(int minutes) {
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        this.minutes = minutes;
    }

    private void setSecond(int seconds) {
        if (seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("seconds must be 0-59");
        }
        this.seconds = seconds;
    }

    //print Universal
    public String getUniversal() {
        return String.format("%02d:%02d:%02d",
                this.hours,
                this.minutes,
                this.seconds);
    }

    //print Standard time --> toString
    public String toString() {
        return String.format("%02d:%02d:%02d %s",
                (this.hours % 12 == 0)?12:this.hours%12,
                this.minutes,
                this.seconds,
                (this.hours < 12)? "AM" : "PM" );
    }
}

