import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adesh on 29-08-2019
 */

public class Player implements ISavable {
    private String name;
    private int hitpoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.weapon = "sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,this.weapon);
        values.add(2,""+this.hitpoints);
        values.add(3,""+this.strength);
        return values;
    }

    @Override
    public void read(List<String> lis) {
        if(lis != null && lis.size()>0){
            this.strength = Integer.parseInt(lis.get(3));
            this.hitpoints = Integer.parseInt(lis.get(2));
            this.name = lis.get(0);
            this.weapon = lis.get(1);

        }

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }






}
