package exercises.technology.Main;

import java.util.Date;

public abstract class AbstractEntity {
    private long Id;

    public AbstractEntity() {
        Date date = new Date();
        Id = date.getTime();
    }

    public long getId () {
        return Id;
    }
}
