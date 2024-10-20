package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class189 implements Iterator {

    @ObfuscatedName("gs.p")
    public class192 field2468;

    @ObfuscatedName("gs.m")
    public class193 field2469;

    @ObfuscatedName("gs.e")
    public class193 field2467 = null;

    public class189(class192 arg0) {
        this.field2468 = arg0;
        this.field2469 = this.field2468.field2480.field2484;
        this.field2467 = null;
    }

    public Object next() {
        class193 var1 = this.field2469;
        if (this.field2468.field2480 == var1) {
            var1 = null;
            this.field2469 = null;
        } else {
            this.field2469 = var1.field2484;
        }
        this.field2467 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2468.field2480 != this.field2469;
    }

    public void remove() {
        if (this.field2467 == null) {
            throw new IllegalStateException();
        }
        this.field2467.method3234();
        this.field2467 = null;
    }
}
