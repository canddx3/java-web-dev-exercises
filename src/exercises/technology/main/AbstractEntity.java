package exercises.technology.main;

import java.util.Date;

public abstract class AbstractEntity {
    private final long Id;

    public AbstractEntity() {
        Date date = new Date();
        Id = date.getTime();
    }

    public long getId () {
        return Id;
    }
}
