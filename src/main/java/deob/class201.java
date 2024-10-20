package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public class class201 implements Iterator {

    @ObfuscatedName("gv.w")
    public class202 field2482;

    @ObfuscatedName("gv.s")
    public class195 field2483;

    @ObfuscatedName("gv.q")
    public class195 field2481 = null;

    public class201(class202 arg0) {
        this.field2482 = arg0;
        this.field2483 = this.field2482.field2484.field2469;
        this.field2481 = null;
    }

    public Object next() {
        class195 var1 = this.field2483;
        if (this.field2482.field2484 == var1) {
            var1 = null;
            this.field2483 = null;
        } else {
            this.field2483 = var1.field2469;
        }
        this.field2481 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2482.field2484 != this.field2483;
    }

    public void remove() {
        if (this.field2481 == null) {
            throw new IllegalStateException();
        }
        this.field2481.method3457();
        this.field2481 = null;
    }
}
