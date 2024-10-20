package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class196 implements Iterator {

    @ObfuscatedName("gc.m")
    public class199 field2547;

    @ObfuscatedName("gc.p")
    public class200 field2548;

    @ObfuscatedName("gc.i")
    public class200 field2549 = null;

    public class196(class199 arg0) {
        this.field2547 = arg0;
        this.field2548 = this.field2547.field2560.field2562;
        this.field2549 = null;
    }

    public Object next() {
        class200 var1 = this.field2548;
        if (this.field2547.field2560 == var1) {
            var1 = null;
            this.field2548 = null;
        } else {
            this.field2548 = var1.field2562;
        }
        this.field2549 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2547.field2560 != this.field2548;
    }

    public void remove() {
        if (this.field2549 == null) {
            throw new IllegalStateException();
        }
        this.field2549.method3476();
        this.field2549 = null;
    }
}
