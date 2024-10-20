package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class208 implements Iterator {

    @ObfuscatedName("gw.m")
    public class209 field2579;

    @ObfuscatedName("gw.p")
    public class202 field2580;

    @ObfuscatedName("gw.i")
    public class202 field2581 = null;

    public class208(class209 arg0) {
        this.field2579 = arg0;
        this.field2580 = this.field2579.field2582.field2567;
        this.field2581 = null;
    }

    public Object next() {
        class202 var1 = this.field2580;
        if (this.field2579.field2582 == var1) {
            var1 = null;
            this.field2580 = null;
        } else {
            this.field2580 = var1.field2567;
        }
        this.field2581 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2579.field2582 != this.field2580;
    }

    public void remove() {
        if (this.field2581 == null) {
            throw new IllegalStateException();
        }
        this.field2581.method3513();
        this.field2581 = null;
    }
}
