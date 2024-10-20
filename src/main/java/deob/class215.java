package deob;

import java.util.Iterator;

@ObfuscatedName("hx")
public class class215 implements Iterator {

    @ObfuscatedName("hx.w")
    public class216 field2469;

    @ObfuscatedName("hx.m")
    public class207 field2468;

    @ObfuscatedName("hx.q")
    public class207 field2470 = null;

    public class215(class216 arg0) {
        this.field2469 = arg0;
        this.field2468 = this.field2469.field2472.field2454;
        this.field2470 = null;
    }

    public Object next() {
        class207 var1 = this.field2468;
        if (this.field2469.field2472 == var1) {
            var1 = null;
            this.field2468 = null;
        } else {
            this.field2468 = var1.field2454;
        }
        this.field2470 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2469.field2472 != this.field2468;
    }

    public void remove() {
        if (this.field2470 == null) {
            throw new IllegalStateException();
        }
        this.field2470.method3819();
        this.field2470 = null;
    }
}
