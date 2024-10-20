package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("nk")
public class class370 implements Iterator {

    @ObfuscatedName("nk.f")
    public class371 field4382;

    @ObfuscatedName("nk.w")
    public int field4381 = 0;

    @ObfuscatedName("nk.v")
    public int field4383 = this.field4382.field4387;

    public class370(class371 arg0) {
        this.field4382 = arg0;
    }

    public boolean hasNext() {
        return this.field4381 < this.field4382.field4386;
    }

    public Object next() {
        if (this.field4382.field4387 != this.field4383) {
            throw new ConcurrentModificationException();
        } else if (this.field4381 < this.field4382.field4386) {
            Object var1 = this.field4382.field4388[this.field4381].field4378;
            this.field4381++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
