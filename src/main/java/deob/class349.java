package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("mr")
public class class349 implements Iterator {

    @ObfuscatedName("mr.c")
    public class350 field4210;

    @ObfuscatedName("mr.p")
    public int field4212 = 0;

    @ObfuscatedName("mr.f")
    public int field4211 = this.field4210.field4215;

    public class349(class350 arg0) {
        this.field4210 = arg0;
    }

    public boolean hasNext() {
        return this.field4212 < this.field4210.field4217;
    }

    public Object next() {
        if (this.field4210.field4215 != this.field4211) {
            throw new ConcurrentModificationException();
        } else if (this.field4212 < this.field4210.field4217) {
            Object var1 = this.field4210.field4213[this.field4212].field4205;
            this.field4212++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
