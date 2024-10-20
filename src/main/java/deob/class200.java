package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class200 implements Iterator {

    @ObfuscatedName("gt.p")
    public class203 field2548;

    @ObfuscatedName("gt.i")
    public class204 field2547;

    @ObfuscatedName("gt.w")
    public class204 field2546 = null;

    public class200(class203 arg0) {
        this.field2548 = arg0;
        this.field2547 = this.field2548.field2559.field2562;
        this.field2546 = null;
    }

    public Object next() {
        class204 var1 = this.field2547;
        if (this.field2548.field2559 == var1) {
            var1 = null;
            this.field2547 = null;
        } else {
            this.field2547 = var1.field2562;
        }
        this.field2546 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2548.field2559 != this.field2547;
    }

    public void remove() {
        if (this.field2546 == null) {
            throw new IllegalStateException();
        }
        this.field2546.method3561();
        this.field2546 = null;
    }
}
