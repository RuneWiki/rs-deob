package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("pr")
public class class392 implements Iterator {

    @ObfuscatedName("pr.au")
    public class393 field4443;

    @ObfuscatedName("pr.ae")
    public int field4444 = 0;

    @ObfuscatedName("pr.ao")
    public int field4445 = this.field4443.field4447;

    public class392(class393 arg0) {
        this.field4443 = arg0;
    }

    public boolean hasNext() {
        return this.field4444 < this.field4443.field4451;
    }

    public Object next() {
        if (this.field4443.field4447 != this.field4445) {
            throw new ConcurrentModificationException();
        } else if (this.field4444 < this.field4443.field4451) {
            Object var1 = this.field4443.field4449[this.field4444].field4441;
            this.field4444++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
