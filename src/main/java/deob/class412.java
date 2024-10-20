package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("pn")
public class class412 implements Iterator {

    @ObfuscatedName("pn.az")
    public class413 field4575;

    @ObfuscatedName("pn.ah")
    public int field4576 = 0;

    @ObfuscatedName("pn.af")
    public int field4578 = this.field4575.field4583;

    public class412(class413 arg0) {
        this.field4575 = arg0;
    }

    public boolean hasNext() {
        return this.field4576 < this.field4575.field4581;
    }

    public Object next() {
        if (this.field4575.field4583 != this.field4578) {
            throw new ConcurrentModificationException();
        } else if (this.field4576 < this.field4575.field4581) {
            Object var1 = this.field4575.field4585[this.field4576].field4574;
            this.field4576++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
