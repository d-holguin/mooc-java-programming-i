
import java.util.ArrayList;

/*
 * Copyright (C) 2020 Dantes
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
/**
 *
 * @author Dantes
 */
public class BirdDatabase {

    private ArrayList<Bird> birdList;

    public BirdDatabase() {
        this.birdList = new ArrayList<>();
    }

    public void addBird(Bird bird) {

        birdList.add(bird);

    }

    public void printBirdDatabase() {

        for (Bird e : birdList) {
            System.out.println(e);
        }

    }

    public void printBird(String name) {

        for (Bird e : birdList) {

            if (e.getName().equals(name)) {

                System.out.println(e);
            }
        }
    }

    //probably a better way to do this.
    public void addObservationFromDB(String name) {

        for (Bird e : birdList) {
            if (e.getName().toLowerCase().equals(name.toLowerCase())) {

                e.addObservation();
            }

        }

    }

}
