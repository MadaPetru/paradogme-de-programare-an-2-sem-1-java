package lab5.ex2;

public class License extends IntervalDate{

    private String name;
    private String cnp;

    public License(short startDay, short endDay, short yearStart, short yearEnd, short monthStart, short monthEnd, String name, String cnp) {
        super(startDay, endDay, yearStart, yearEnd, monthStart, monthEnd);
        this.name = name;
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
}
