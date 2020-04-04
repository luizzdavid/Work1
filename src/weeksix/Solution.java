package weeksix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
        public static void main(String[] args) {
            new Band("PorcupineTree");
            Instrument gtr = new Instrument("squier",1200.00);
            Instrument mic = new Instrument("shure",570);
            Instrument drum = new Instrument("dw",3000.89);
            List<Instrument> ptInstruments = new ArrayList<Instrument>(3);
            ptInstruments.add(gtr);
            ptInstruments.add(mic);
            ptInstruments.add(drum);
            Person voc= new Person("sw","london","0183746");
            Person gtr1= new Person("john","manchester","018373236");
            Person drummer= new Person("gavinh","liverpool","0183qw746");
            Person bass= new Person("coline","norwich","0183746");
            List<Person> ptmem = new ArrayList<>(4);
            ptmem.add(voc);
            ptmem.add(gtr1);
            ptmem.add(drummer);
            ptmem.add(bass);

            for(int i=0;i<ptmem.size();i++){
                ptmem.get(i).display();
            }
            for(int i=0;i<ptInstruments.size();i++){
                ptInstruments.get(i).display();
            }

        }
    }

