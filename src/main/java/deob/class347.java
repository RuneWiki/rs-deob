package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("me")
public class class347 implements Iterator {

    @ObfuscatedName("me.c")
    public class348 field4164;

    @ObfuscatedName("me.v")
    public int field4163 = 0;

    @ObfuscatedName("me.q")
    public int field4165 = this.field4164.field4170;

    public class347(class348 arg0) {
        this.field4164 = arg0;
    }

    public boolean hasNext() {
        return this.field4163 < this.field4164.field4166;
    }

    public Object next() {
        if (this.field4164.field4170 != this.field4165) {
            throw new ConcurrentModificationException();
        } else if (this.field4163 < this.field4164.field4166) {
            Object var1 = this.field4164.field4167[this.field4163].field4160;
            this.field4163++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
