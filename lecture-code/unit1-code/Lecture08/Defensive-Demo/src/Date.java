/*Class that represents a date*/
public class Date
{
    //collection of valid days
    private static final int[] DAYS_PER_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31};

    //attributes for a date
    private int year;
    private int month;
    private int day;

    //constructor
    public Date(int day, int month, int year) {
        this.setDate(day, month, year);
    }

    private void setDate(int day, int month, int year) {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    private void setYear(int year) {
        if (year < 1900) {
            throw new IllegalArgumentException("The year must be before 1900");
        }
        this.year = year;
    }

    private void setMonth(int month) {
        if (month <= 0 || month >= 13) {
            throw new IllegalArgumentException("The month must be between 0-12");
        }
        this.month = month;
    }

    private void setDay(int day) {
        int month = this.getMonth();
        if (day > DAYS_PER_MONTH[month] || day <= 0) {
            throw new IllegalArgumentException("invalid day");
        }
        this.day = day;
    }

    //getters
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    //to string (represent as a text data)
    public String toString() {
        return String.format("%02d/%02d/%d",this.month, this.day,this.year);
    }
}

