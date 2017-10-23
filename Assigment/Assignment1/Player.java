package Assignment1;

/**
 * Created by rama on 10/23/17.
 */
public class Player {
    String Name;
    Integer LP;
    Integer Score;

    public Player(String name, Integer LP, Integer score) {
        Name = name;
        this.LP = LP;
        Score = score;
    }

    public String getName() {
        return Name;
    }

    public Integer getLP() {
        return LP;
    }

    public void setLP(Integer LP) {
        this.LP = LP;
    }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }
}
