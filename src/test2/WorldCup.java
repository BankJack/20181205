package test2;

/**
 * 世界杯
 * @author nick
 */
public class WorldCup {
    private String period;//第几届
    private String year;
    private String location;//地点
    private String winner;

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorldCup worldCup = (WorldCup) o;

        if (!period.equals(worldCup.period)) return false;
        if (!year.equals(worldCup.year)) return false;
        if (!location.equals(worldCup.location)) return false;
        return winner.equals(worldCup.winner);
    }

    @Override
    public int hashCode() {
        int result = period.hashCode();
        result = 31 * result + year.hashCode();
        result = 31 * result + location.hashCode();
        result = 31 * result + winner.hashCode();
        return result;
    }

    public WorldCup() {
    }

    public WorldCup(String period, String year, String location, String winner) {
        this.period = period;
        this.year = year;
        this.location = location;
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "WorldCup{" +
                "period='" + period + '\'' +
                ", year='" + year + '\'' +
                ", location='" + location + '\'' +
                ", winner='" + winner + '\'' +
                '}';
    }
}
