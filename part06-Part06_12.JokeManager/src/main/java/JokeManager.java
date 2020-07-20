
import java.util.ArrayList;
import java.util.Random;

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
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {

        this.jokes.add(joke);
    }

    public void printJokes() {

        for (String joke : jokes) {

            System.out.println(joke);
        }

    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random draw = new Random();

        int randomIndex = draw.nextInt(jokes.size()); //random index from 0 to jokes length/size

        return jokes.get(randomIndex);

    }

}
