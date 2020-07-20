
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> holdList;

    public Hold(int maxWeight) {

        this.maxWeight = maxWeight;
        this.holdList = new ArrayList<Suitcase>();

    }

    public void addSuitcase(Suitcase suitcase) {

        if (weightOfSuitcases() + suitcase.totalWeight() <= maxWeight) {
            holdList.add(suitcase);
        } else {
            return;
        }

    }

    public int weightOfSuitcases() {
        int weight = 0;

        for (Suitcase e : holdList) {
            weight += e.totalWeight();
        }
        return weight;
    }
    //added a printitems method to suitcase because I don't know to get print a list of a list
    public void printItems() {

        for (Suitcase e : holdList) {

            e.printItems();

        }

    }

    @Override
    public String toString() {

        String weightOutput = " (" + weightOfSuitcases() + "kg)";
        String suitcaseOutput = "";

        if (holdList.isEmpty()) {
            suitcaseOutput = "no suitcases";
        } else if (holdList.size() == 1) {
            suitcaseOutput = "1 suitcase";
        } else {
            suitcaseOutput = holdList.size() + " suitcases";
        }

        return suitcaseOutput + weightOutput;
    }

}
