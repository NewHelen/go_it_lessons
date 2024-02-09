package module5.dz20;

import java.util.Objects;

public class StarTrack {
    private Point start;
    private Point finish;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarTrack starTrack = (StarTrack) o;
        return Objects.equals(getStart(), starTrack.getStart()) && Objects.equals(getFinish(), starTrack.getFinish());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStart(), getFinish());
    }
}
