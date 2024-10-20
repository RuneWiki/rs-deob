package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class189 implements Iterator {

    @ObfuscatedName("gk.n")
    public class192 field2467;

    @ObfuscatedName("gk.p")
    public class193 field2468;

    @ObfuscatedName("gk.i")
    public class193 field2469 = null;

    public class189(class192 arg0) {
        this.field2467 = arg0;
        this.field2468 = this.field2467.field2480.field2482;
        this.field2469 = null;
    }

    public Object next() {
        class193 var1 = this.field2468;
        if (this.field2467.field2480 == var1) {
            var1 = null;
            this.field2468 = null;
        } else {
            this.field2468 = var1.field2482;
        }
        this.field2469 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2467.field2480 != this.field2468;
    }

    public void remove() {
        if (this.field2469 == null) {
            throw new IllegalStateException();
        }
        this.field2469.method3347();
        this.field2469 = null;
    }
}
