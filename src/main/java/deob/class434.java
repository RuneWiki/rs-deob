package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("qz")
public class class434 implements Iterator {

    @ObfuscatedName("qz.ap")
    public class435 field4808;

    @ObfuscatedName("qz.aw")
    public int field4807 = 0;

    @ObfuscatedName("qz.ak")
    public int field4806 = this.field4808.field4816;

    public class434(class435 arg0) {
        this.field4808 = arg0;
    }

    public boolean hasNext() {
        return this.field4807 < this.field4808.field4814;
    }

    public Object next() {
        if (this.field4808.field4816 != this.field4806) {
            throw new ConcurrentModificationException();
        } else if (this.field4807 < this.field4808.field4814) {
            Object var1 = this.field4808.field4815[this.field4807].field4803;
            this.field4807++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
