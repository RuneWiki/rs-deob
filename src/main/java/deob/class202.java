package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class202 implements Iterator {

    @ObfuscatedName("gw.y")
    public class206 field2452;

    @ObfuscatedName("gw.c")
    public class207 field2451;

    @ObfuscatedName("gw.n")
    public class207 field2453 = null;

    public class202(class206 arg0) {
        this.field2452 = arg0;
        this.field2451 = this.field2452.field2468.field2471;
        this.field2453 = null;
    }

    public Object next() {
        class207 var1 = this.field2451;
        if (this.field2452.field2468 == var1) {
            var1 = null;
            this.field2451 = null;
        } else {
            this.field2451 = var1.field2471;
        }
        this.field2453 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2452.field2468 != this.field2451;
    }

    public void remove() {
        if (this.field2453 == null) {
            throw new IllegalStateException();
        }
        this.field2453.method3766();
        this.field2453 = null;
    }
}
