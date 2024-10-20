package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class192 implements Iterator {

    @ObfuscatedName("gy.s")
    public class195 field2471;

    @ObfuscatedName("gy.c")
    public class196 field2472;

    @ObfuscatedName("gy.f")
    public class196 field2473 = null;

    public class192(class195 arg0) {
        this.field2471 = arg0;
        this.field2472 = this.field2471.field2485.field2486;
        this.field2473 = null;
    }

    public Object next() {
        class196 var1 = this.field2472;
        if (this.field2471.field2485 == var1) {
            var1 = null;
            this.field2472 = null;
        } else {
            this.field2472 = var1.field2486;
        }
        this.field2473 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2471.field2485 != this.field2472;
    }

    public void remove() {
        if (this.field2473 == null) {
            throw new IllegalStateException();
        }
        this.field2473.method3372();
        this.field2473 = null;
    }
}
