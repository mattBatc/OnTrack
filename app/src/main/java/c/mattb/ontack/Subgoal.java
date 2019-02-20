package c.mattb.ontack;

import java.util.Date;

public class Subgoal{

    private int subId;
    private int goalId;
    private String name;
    private Date date;


    public Subgoal(int subId, int goalId, String name, Date date) {
        this.subId = subId;
        this.goalId = goalId;
        this.name = name;
        this.date = date;
    }

    public Subgoal() {
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public int getGoalId() {
        return goalId;
    }

    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
