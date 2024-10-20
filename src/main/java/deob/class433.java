package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("qz")
public class class433 implements Iterator {

    @ObfuscatedName("qz.ac")
    public class434 field4763;

    @ObfuscatedName("qz.ae")
    public int field4764 = 0;

    @ObfuscatedName("qz.ag")
    public int field4762 = this.field4763.field4769;

    public class433(class434 arg0) {
        this.field4763 = arg0;
    }

    public boolean hasNext() {
        return this.field4764 < this.field4763.field4768;
    }

    public Object next() {
        if (this.field4763.field4769 != this.field4762) {
            throw new ConcurrentModificationException();
        } else if (this.field4764 < this.field4763.field4768) {
            Object var1 = this.field4763.field4771[this.field4764].field4759;
            this.field4764++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
