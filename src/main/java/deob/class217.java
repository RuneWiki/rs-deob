package deob;

import java.util.Iterator;

@ObfuscatedName("hk")
public class class217 implements Iterator {

    @ObfuscatedName("hk.y")
    public class218 field2490;

    @ObfuscatedName("hk.c")
    public class209 field2491;

    @ObfuscatedName("hk.n")
    public class209 field2492 = null;

    public class217(class218 arg0) {
        this.field2490 = arg0;
        this.field2491 = this.field2490.field2494.field2476;
        this.field2492 = null;
    }

    public Object next() {
        class209 var1 = this.field2491;
        if (this.field2490.field2494 == var1) {
            var1 = null;
            this.field2491 = null;
        } else {
            this.field2491 = var1.field2476;
        }
        this.field2492 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2490.field2494 != this.field2491;
    }

    public void remove() {
        if (this.field2492 == null) {
            throw new IllegalStateException();
        }
        this.field2492.method3809();
        this.field2492 = null;
    }
}
