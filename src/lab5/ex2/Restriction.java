package lab5.ex2;


public class Restriction extends IntervalDate {

    private String cnp;
    private String cause;

    public Restriction(short startDay, short endDay, short yearStart, short yearEnd, short monthStart, short monthEnd, String cnp, String cause) {
        super(startDay, endDay, yearStart, yearEnd, monthStart, monthEnd);
        this.cnp = cnp;
        this.cause = cause;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
