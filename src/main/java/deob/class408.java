package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("pe")
public class class408 implements Iterator {

    @ObfuscatedName("pe.am")
    public class409 field4515;

    @ObfuscatedName("pe.ap")
    public int field4516 = 0;

    @ObfuscatedName("pe.af")
    public int field4517 = this.field4515.field4524;

    public class408(class409 arg0) {
        this.field4515 = arg0;
    }

    public boolean hasNext() {
        return this.field4516 < this.field4515.field4521;
    }

    public Object next() {
        if (this.field4515.field4524 != this.field4517) {
            throw new ConcurrentModificationException();
        } else if (this.field4516 < this.field4515.field4521) {
            Object var1 = this.field4515.field4520[this.field4516].field4513;
            this.field4516++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
