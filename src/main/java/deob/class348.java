package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("mb")
public class class348 implements Iterator {

    @ObfuscatedName("mb.s")
    public class349 field4168;

    @ObfuscatedName("mb.h")
    public int field4166 = 0;

    @ObfuscatedName("mb.w")
    public int field4167 = this.field4168.field4173;

    public class348(class349 arg0) {
        this.field4168 = arg0;
    }

    public boolean hasNext() {
        return this.field4166 < this.field4168.field4170;
    }

    public Object next() {
        if (this.field4168.field4173 != this.field4167) {
            throw new ConcurrentModificationException();
        } else if (this.field4166 < this.field4168.field4170) {
            Object var1 = this.field4168.field4169[this.field4166].field4161;
            this.field4166++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
