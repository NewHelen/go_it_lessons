package module6.dz13;

import java.util.Arrays;
import java.util.Objects;

public class QuarkeTrack {

    private int[] lines;

    public QuarkeTrack(int[] lines){
        this.lines = lines;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        QuarkeTrack that = (QuarkeTrack) obj;
        return Arrays.stream(lines).sum() == Arrays.stream(that.lines).sum();
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.stream(lines).sum());
    }
}
