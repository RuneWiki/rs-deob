package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("qr")
public class class429 implements Iterator {

    @ObfuscatedName("qr.ak")
    public class430 field4716;

    @ObfuscatedName("qr.al")
    public int field4717 = 0;

    @ObfuscatedName("qr.aj")
    public int field4718 = this.field4716.field4723;

    public class429(class430 arg0) {
        this.field4716 = arg0;
    }

    public boolean hasNext() {
        return this.field4717 < this.field4716.field4722;
    }

    public Object next() {
        if (this.field4716.field4723 != this.field4718) {
            throw new ConcurrentModificationException();
        } else if (this.field4717 < this.field4716.field4722) {
            Object var1 = this.field4716.field4724[this.field4717].field4714;
            this.field4717++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
