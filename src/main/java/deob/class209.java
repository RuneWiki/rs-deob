package deob;

import java.util.Iterator;

@ObfuscatedName("hz")
public class class209 implements Iterator {

    @ObfuscatedName("hz.b")
    public class212 field2596;

    @ObfuscatedName("hz.q")
    public class213 field2597;

    @ObfuscatedName("hz.o")
    public class213 field2598 = null;

    public class209(class212 arg0) {
        this.field2596 = arg0;
        this.field2597 = this.field2596.field2610.field2612;
        this.field2598 = null;
    }

    public Object next() {
        class213 var1 = this.field2597;
        if (this.field2596.field2610 == var1) {
            var1 = null;
            this.field2597 = null;
        } else {
            this.field2597 = var1.field2612;
        }
        this.field2598 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2596.field2610 != this.field2597;
    }

    public void remove() {
        if (this.field2598 == null) {
            throw new IllegalStateException();
        }
        this.field2598.method3726();
        this.field2598 = null;
    }
}
