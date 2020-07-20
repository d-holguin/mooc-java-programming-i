
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
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();

    }

    public void add(Person person) {

        this.persons.add(person);
    }

    public boolean isEmpty() {
        boolean isRoomEmpty = false;

        if (this.persons.isEmpty()) {

            isRoomEmpty = true;
        }

        return isRoomEmpty;

    }

    public ArrayList<Person> getPersons() {

        return this.persons;

    }

    public Person shortest() {

        if (persons.isEmpty()) {

            return null;
        }
        Person shortestPerson = this.persons.get(0);

        for (Person e : persons) {
            if (e.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = e;
            }

        }

        return shortestPerson;

    }

    public Person take() {
        if (this.persons.isEmpty()) {

            return null;
        }

        Person shortestPerson = shortest();

        this.persons.remove(shortestPerson);

        return shortestPerson;

    }

}
