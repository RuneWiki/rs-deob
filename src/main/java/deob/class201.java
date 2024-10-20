package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public class class201 implements Iterator {

    @ObfuscatedName("gv.p")
    public class202 field2500;

    @ObfuscatedName("gv.m")
    public class195 field2499;

    @ObfuscatedName("gv.e")
    public class195 field2501 = null;

    public class201(class202 arg0) {
        this.field2500 = arg0;
        this.field2499 = this.field2500.field2502.field2488;
        this.field2501 = null;
    }

    public Object next() {
        class195 var1 = this.field2499;
        if (this.field2500.field2502 == var1) {
            var1 = null;
            this.field2499 = null;
        } else {
            this.field2499 = var1.field2488;
        }
        this.field2501 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2500.field2502 != this.field2499;
    }

    public void remove() {
        if (this.field2501 == null) {
            throw new IllegalStateException();
        }
        this.field2501.method3285();
        this.field2501 = null;
    }
}
