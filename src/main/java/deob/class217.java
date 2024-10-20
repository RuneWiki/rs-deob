package deob;

import java.util.Iterator;

@ObfuscatedName("hs")
public class class217 implements Iterator {

    @ObfuscatedName("hs.c")
    public class218 field2487;

    @ObfuscatedName("hs.q")
    public class209 field2485;

    @ObfuscatedName("hs.m")
    public class209 field2486 = null;

    public class217(class218 arg0) {
        this.field2487 = arg0;
        this.field2485 = this.field2487.field2488.field2471;
        this.field2486 = null;
    }

    public Object next() {
        class209 var1 = this.field2485;
        if (this.field2487.field2488 == var1) {
            var1 = null;
            this.field2485 = null;
        } else {
            this.field2485 = var1.field2471;
        }
        this.field2486 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2487.field2488 != this.field2485;
    }

    public void remove() {
        if (this.field2486 == null) {
            throw new IllegalStateException();
        }
        this.field2486.method3765();
        this.field2486 = null;
    }
}
