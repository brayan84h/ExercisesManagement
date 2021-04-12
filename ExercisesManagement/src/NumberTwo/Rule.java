package NumberTwo;

import java.util.Objects;

public class Rule {

    private String name;
    private int starting_position;
    private int final_position;
    private String description;

    public Rule(String name, int starting_position, int final_position, String description) {
        this.name = name;
        this.starting_position = starting_position;
        this.final_position = final_position;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStarting_position() {
        return starting_position;
    }

    public void setStarting_position(int starting_position) {
        this.starting_position = starting_position;
    }

    public int getFinal_position() {
        return final_position;
    }

    public void setFinal_position(int final_position) {
        this.final_position = final_position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\tRule{" +
                "Name='" + name + '\'' +
                ", Starting position=" + starting_position +
                ", Final position=" + final_position +
                ", Description='" + description + '\'' +
                '}';
    }
     public void showRule(){
         System.out.println(toString());
     }
}
