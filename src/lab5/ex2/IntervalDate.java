package lab5.ex2;

public class IntervalDate {

    private short startDay;
    private short endDay;
    private short yearStart;
    private short yearEnd;
    private short monthStart;
    private short monthEnd;

    public IntervalDate(short startDay, short endDay, short yearStart, short yearEnd, short monthStart, short monthEnd) {
        this.startDay = startDay;
        this.endDay = endDay;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.monthStart = monthStart;
        this.monthEnd = monthEnd;
    }

    public short getYearStart() {
        return yearStart;
    }

    public void setYearStart(short yearStart) {
        this.yearStart = yearStart;
    }

    public short getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(short yearEnd) {
        this.yearEnd = yearEnd;
    }

    public short getMonthStart() {
        return monthStart;
    }

    public void setMonthStart(short monthStart) {
        this.monthStart = monthStart;
    }

    public short getMonthEnd() {
        return monthEnd;
    }

    public void setMonthEnd(short monthEnd) {
        this.monthEnd = monthEnd;
    }

    public short getStartDay() {
        return startDay;
    }

    public void setStartDay(short startDay) {
        this.startDay = startDay;
    }

    public short getEndDay() {
        return endDay;
    }

    public void setEndDay(short endDay) {
        this.endDay = endDay;
    }
}
