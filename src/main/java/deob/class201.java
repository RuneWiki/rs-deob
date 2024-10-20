package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class201 implements Iterator {

    @ObfuscatedName("gd.i")
    public class202 field2490;

    @ObfuscatedName("gd.w")
    public class195 field2491;

    @ObfuscatedName("gd.a")
    public class195 field2492 = null;

    public class201(class202 arg0) {
        this.field2490 = arg0;
        this.field2491 = this.field2490.field2493.field2478;
        this.field2492 = null;
    }

    public Object next() {
        class195 var1 = this.field2491;
        if (this.field2490.field2493 == var1) {
            var1 = null;
            this.field2491 = null;
        } else {
            this.field2491 = var1.field2478;
        }
        this.field2492 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2490.field2493 != this.field2491;
    }

    public void remove() {
        if (this.field2492 == null) {
            throw new IllegalStateException();
        }
        this.field2492.method3323();
        this.field2492 = null;
    }
}
