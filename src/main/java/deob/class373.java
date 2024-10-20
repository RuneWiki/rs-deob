package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("oi")
public class class373 implements Iterator {

    @ObfuscatedName("oi.aj")
    public class374 field4356;

    @ObfuscatedName("oi.al")
    public int field4355 = 0;

    @ObfuscatedName("oi.ac")
    public int field4357 = this.field4356.field4363;

    public class373(class374 arg0) {
        this.field4356 = arg0;
    }

    public boolean hasNext() {
        return this.field4355 < this.field4356.field4360;
    }

    public Object next() {
        if (this.field4356.field4363 != this.field4357) {
            throw new ConcurrentModificationException();
        } else if (this.field4355 < this.field4356.field4360) {
            Object var1 = this.field4356.field4361[this.field4355].field4354;
            this.field4355++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
