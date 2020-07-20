
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
public class Suitcase {

    private ArrayList<Item> items;

    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int weight = 0;

        for (Item e : items) {
            weight += e.getWeight();
        }
        return weight;
    }

    public void addItem(Item item) {

        if ((totalWeight() + item.getWeight()) <= maxWeight) {
            items.add(item);
        } else {
            return;
        }

    }

    public Item heaviestItem() {

        if (items.isEmpty()) {
            return null;

        }

        Item heaviestItem = this.items.get(0);

        for (Item e : items) {

            if (e.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = e;
            }
        }
        return heaviestItem;

    }
    
    public void printItems(){
        for(Item e: items)
            
            System.out.println(e);
    }

    @Override
    public String toString() {

        String weightOutput = " (" + totalWeight() + "kg)";
        String itemOutput = "";

        if (items.isEmpty()) {
            itemOutput = "no items";
        } else if (items.size() == 1) {
            itemOutput = "1 item";
        } else {
            itemOutput = items.size() + " items";
        }

        return itemOutput + weightOutput;
    }

}
