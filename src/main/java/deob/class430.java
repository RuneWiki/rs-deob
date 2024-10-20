package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("qc")
public class class430 implements Iterator {

    @ObfuscatedName("qc.aq")
    public class431 field4733;

    @ObfuscatedName("qc.ad")
    public int field4734 = 0;

    @ObfuscatedName("qc.ag")
    public int field4735 = this.field4733.field4740;

    public class430(class431 arg0) {
        this.field4733 = arg0;
    }

    public boolean hasNext() {
        return this.field4734 < this.field4733.field4738;
    }

    public Object next() {
        if (this.field4733.field4740 != this.field4735) {
            throw new ConcurrentModificationException();
        } else if (this.field4734 < this.field4733.field4738) {
            Object var1 = this.field4733.field4736[this.field4734].field4731;
            this.field4734++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
