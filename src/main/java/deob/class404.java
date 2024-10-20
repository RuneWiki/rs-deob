package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("pg")
public class class404 implements Iterator {

    @ObfuscatedName("pg.at")
    public class405 field4479;

    @ObfuscatedName("pg.ah")
    public int field4478 = 0;

    @ObfuscatedName("pg.ar")
    public int field4477 = this.field4479.field4484;

    public class404(class405 arg0) {
        this.field4479 = arg0;
    }

    public boolean hasNext() {
        return this.field4478 < this.field4479.field4486;
    }

    public Object next() {
        if (this.field4479.field4484 != this.field4477) {
            throw new ConcurrentModificationException();
        } else if (this.field4478 < this.field4479.field4486) {
            Object var1 = this.field4479.field4482[this.field4478].field4475;
            this.field4478++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
