package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("pm")
public class class411 implements Iterator {

    @ObfuscatedName("pm.aq")
    public class412 field4559;

    @ObfuscatedName("pm.aw")
    public int field4558 = 0;

    @ObfuscatedName("pm.al")
    public int field4560 = this.field4559.field4562;

    public class411(class412 arg0) {
        this.field4559 = arg0;
    }

    public boolean hasNext() {
        return this.field4558 < this.field4559.field4564;
    }

    public Object next() {
        if (this.field4559.field4562 != this.field4560) {
            throw new ConcurrentModificationException();
        } else if (this.field4558 < this.field4559.field4564) {
            Object var1 = this.field4559.field4563[this.field4558].field4555;
            this.field4558++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
