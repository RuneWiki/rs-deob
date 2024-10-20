package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class201 implements Iterator {

    @ObfuscatedName("gy.c")
    public class202 field2456;

    @ObfuscatedName("gy.o")
    public class195 field2454;

    @ObfuscatedName("gy.i")
    public class195 field2455 = null;

    public class201(class202 arg0) {
        this.field2456 = arg0;
        this.field2454 = this.field2456.field2457.field2442;
        this.field2455 = null;
    }

    public Object next() {
        class195 var1 = this.field2454;
        if (this.field2456.field2457 == var1) {
            var1 = null;
            this.field2454 = null;
        } else {
            this.field2454 = var1.field2442;
        }
        this.field2455 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2456.field2457 != this.field2454;
    }

    public void remove() {
        if (this.field2455 == null) {
            throw new IllegalStateException();
        }
        this.field2455.method3320();
        this.field2455 = null;
    }
}
