package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("pm")
public class class407 implements Iterator {

    @ObfuscatedName("pm.ac")
    public class408 field4498;

    @ObfuscatedName("pm.al")
    public int field4497 = 0;

    @ObfuscatedName("pm.ak")
    public int field4496 = this.field4498.field4499;

    public class407(class408 arg0) {
        this.field4498 = arg0;
    }

    public boolean hasNext() {
        return this.field4497 < this.field4498.field4501;
    }

    public Object next() {
        if (this.field4498.field4499 != this.field4496) {
            throw new ConcurrentModificationException();
        } else if (this.field4497 < this.field4498.field4501) {
            Object var1 = this.field4498.field4503[this.field4497].field4494;
            this.field4497++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
