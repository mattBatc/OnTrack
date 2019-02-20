package c.mattb.ontack;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.Date;

@IgnoreExtraProperties
public class Goal {

    private String name;
    private Date date;

    public Goal(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public Goal() {
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
