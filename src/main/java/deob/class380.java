package deob;

import java.util.Iterator;

@ObfuscatedName("ox")
public class class380 implements Iterator {

    @ObfuscatedName("ox.at")
    public class381 field4384;

    @ObfuscatedName("ox.an")
    public class457 field4385;

    @ObfuscatedName("ox.av")
    public class457 field4386 = null;

    public class380(class381 arg0) {
        this.field4384 = arg0;
        this.field4385 = this.field4384.field4388.field4750;
        this.field4386 = null;
    }

    public Object next() {
        class457 var1 = this.field4385;
        if (this.field4384.field4388 == var1) {
            var1 = null;
            this.field4385 = null;
        } else {
            this.field4385 = var1.field4750;
        }
        this.field4386 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4384.field4388 != this.field4385;
    }

    public void remove() {
        if (this.field4386 == null) {
            throw new IllegalStateException();
        }
        this.field4386.method7554();
        this.field4386 = null;
    }
}
