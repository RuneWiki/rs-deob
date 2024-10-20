package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("of")
public class class390 implements Iterator {

    @ObfuscatedName("of.at")
    public class391 field4411;

    @ObfuscatedName("of.an")
    public int field4410 = 0;

    @ObfuscatedName("of.av")
    public int field4409 = this.field4411.field4415;

    public class390(class391 arg0) {
        this.field4411 = arg0;
    }

    public boolean hasNext() {
        return this.field4410 < this.field4411.field4413;
    }

    public Object next() {
        if (this.field4411.field4415 != this.field4409) {
            throw new ConcurrentModificationException();
        } else if (this.field4410 < this.field4411.field4413) {
            Object var1 = this.field4411.field4417[this.field4410].field4407;
            this.field4410++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
