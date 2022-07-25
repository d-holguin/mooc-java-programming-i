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
public class Exercise {

    private String name;

    private boolean completed;

    public Exercise(String name) {

        this.name = name;

        this.completed = false;
    }

    Exercise() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {

        return name;
    }

    public void setCompleted(boolean completed) {

        this.completed = completed;
    }

    public boolean isCompleted() {

        return this.completed;
    }
}
