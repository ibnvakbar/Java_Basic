package Pokemon;

import java.util.ArrayList;

/**
 * Created by rama on 10/13/17.
 */
public class Trainer {
    String name;
    Character gender;
    Integer age;
    ArrayList<String> listPokemon = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



}
