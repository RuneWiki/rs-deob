package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class202 implements Iterator {

    @ObfuscatedName("gg.f")
    public class206 field2477;

    @ObfuscatedName("gg.l")
    public class207 field2476;

    @ObfuscatedName("gg.w")
    public class207 field2478 = null;

    public class202(class206 arg0) {
        this.field2477 = arg0;
        this.field2476 = this.field2477.field2494.field2495;
        this.field2478 = null;
    }

    public Object next() {
        class207 var1 = this.field2476;
        if (this.field2477.field2494 == var1) {
            var1 = null;
            this.field2476 = null;
        } else {
            this.field2476 = var1.field2495;
        }
        this.field2478 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2477.field2494 != this.field2476;
    }

    public void remove() {
        if (this.field2478 == null) {
            throw new IllegalStateException();
        }
        this.field2478.method3818();
        this.field2478 = null;
    }
}
