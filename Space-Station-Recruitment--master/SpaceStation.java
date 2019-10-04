package spaceStationRecruitment;

import java.util.ArrayList;
import java.util.List;

public class SpaceStation {
    private String name;
    private int capacity;
    private List<Astronaut> data;
    private Astronaut astronaut;

    public SpaceStation(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();

    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCount() {
        return data.size();
    }

    public void add(Astronaut astronaut) {
        if (this.data.size() < this.capacity) {
            this.data.add(astronaut);
        }
    }


    public boolean remove(String name) {
        boolean a = false;
        if (data.contains(name)) {
            a = true;
            data.remove(name);
        }
        return a;
    }


    public Astronaut getOldestAstronaut() {
        Astronaut astronaut = null;
        int oldest = -1;
        for (Astronaut astro : data) {
            if (astro.getAge() > oldest) {
                oldest = astro.getAge();
                astronaut = astro;
            }
        }
        return astronaut;
    }

    public Astronaut getAstronaut(String name) {
        Astronaut astronaut = null;
        for (Astronaut astro : data) {
            if (astro.getName().equals(name)) {
                astronaut = astro;
                break;
            }
            astronaut = astro;
        }
        return astronaut;
    }


    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("Astronauts working at Space Station " + this.name + ":");
        sb.append(System.lineSeparator());
        data.forEach(e -> {
            sb.append(e);
            sb.append(System.lineSeparator());
        });

        return sb.toString().trim();
    }

}
