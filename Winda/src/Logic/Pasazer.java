/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author Tomek
 */
public class Pasazer {
    private int start;
    private int stop;
    private int name;

    public Pasazer(int name, int start, int stop) {
        this.name = name;
        this.start = start;
        this.stop = stop;
    }

    public int GetName() {
        return this.name;
    }

    public int GetStart() {
        return this.start;
    }

    public int GetStop() {
        return this.stop;
    }
}
