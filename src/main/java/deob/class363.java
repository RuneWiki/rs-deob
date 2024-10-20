package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("mn")
public class class363 implements Iterator {

    @ObfuscatedName("mn.a")
    public class364 field4318;

    @ObfuscatedName("mn.f")
    public int field4313 = 0;

    @ObfuscatedName("mn.c")
    public int field4314 = this.field4318.field4325;

    public class363(class364 arg0) {
        this.field4318 = arg0;
    }

    public boolean hasNext() {
        return this.field4313 < this.field4318.field4323;
    }

    public Object next() {
        if (this.field4318.field4325 != this.field4314) {
            throw new ConcurrentModificationException();
        } else if (this.field4313 < this.field4318.field4323) {
            Object var1 = this.field4318.field4326[this.field4313].field4311;
            this.field4313++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
