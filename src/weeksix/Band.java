package weeksix;

import java.util.List;

public class Band {
    String bandName;
    List<Person> persons;
    List<Instrument> instrument;
    public Band(String bandName) {
        this.bandName = bandName;
        System.out.println(bandName);
        }

    }
