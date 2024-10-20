package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class201 implements Iterator {

    @ObfuscatedName("gh.i")
    public class202 field2498;

    @ObfuscatedName("gh.c")
    public class195 field2497;

    @ObfuscatedName("gh.e")
    public class195 field2499 = null;

    public class201(class202 arg0) {
        this.field2498 = arg0;
        this.field2497 = this.field2498.field2500.field2485;
        this.field2499 = null;
    }

    public Object next() {
        class195 var1 = this.field2497;
        if (this.field2498.field2500 == var1) {
            var1 = null;
            this.field2497 = null;
        } else {
            this.field2497 = var1.field2485;
        }
        this.field2499 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2498.field2500 != this.field2497;
    }

    public void remove() {
        if (this.field2499 == null) {
            throw new IllegalStateException();
        }
        this.field2499.method3318();
        this.field2499 = null;
    }
}
