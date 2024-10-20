package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("md")
public class class348 implements Iterator {

    @ObfuscatedName("md.o")
    public class349 field4176;

    @ObfuscatedName("md.q")
    public int field4175 = 0;

    @ObfuscatedName("md.l")
    public int field4174 = this.field4176.field4183;

    public class348(class349 arg0) {
        this.field4176 = arg0;
    }

    public boolean hasNext() {
        return this.field4175 < this.field4176.field4182;
    }

    public Object next() {
        if (this.field4176.field4183 != this.field4174) {
            throw new ConcurrentModificationException();
        } else if (this.field4175 < this.field4176.field4182) {
            Object var1 = this.field4176.field4180[this.field4175].field4172;
            this.field4175++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
