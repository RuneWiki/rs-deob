package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class189 implements Iterator {

    @ObfuscatedName("gc.w")
    public class192 field2451;

    @ObfuscatedName("gc.s")
    public class193 field2450;

    @ObfuscatedName("gc.q")
    public class193 field2449 = null;

    public class189(class192 arg0) {
        this.field2451 = arg0;
        this.field2450 = this.field2451.field2463.field2465;
        this.field2449 = null;
    }

    public Object next() {
        class193 var1 = this.field2450;
        if (this.field2451.field2463 == var1) {
            var1 = null;
            this.field2450 = null;
        } else {
            this.field2450 = var1.field2465;
        }
        this.field2449 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2451.field2463 != this.field2450;
    }

    public void remove() {
        if (this.field2449 == null) {
            throw new IllegalStateException();
        }
        this.field2449.method3425();
        this.field2449 = null;
    }
}
