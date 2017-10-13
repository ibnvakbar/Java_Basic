package Pokemon;

/**
 * Created by rama on 10/13/17.
 */
public class Gokemon {
    public String name;
    public Integer level;
    public Integer hitpoin;
    public String type;

//    public Gokemon(String name, String level, Integer hitpoin, String type){
//        this.name=name;
//        this.level=level;
//        this.hitpoin=hitpoin;
//        this.type=type;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Integer getHitpoin() {
        return hitpoin;
    }

    public void setHitpoin(Integer hitpoin) {
        this.hitpoin = hitpoin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
