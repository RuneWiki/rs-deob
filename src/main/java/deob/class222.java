package deob;

import java.util.Iterator;

@ObfuscatedName("hm")
public class class222 implements Iterator {

    @ObfuscatedName("hm.a")
    public class223 field2531;

    @ObfuscatedName("hm.s")
    public class214 field2530;

    @ObfuscatedName("hm.g")
    public class214 field2532 = null;

    public class222(class223 arg0) {
        this.field2531 = arg0;
        this.field2530 = this.field2531.field2533.field2516;
        this.field2532 = null;
    }

    public Object next() {
        class214 var1 = this.field2530;
        if (this.field2531.field2533 == var1) {
            var1 = null;
            this.field2530 = null;
        } else {
            this.field2530 = var1.field2516;
        }
        this.field2532 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2531.field2533 != this.field2530;
    }

    public void remove() {
        if (this.field2532 == null) {
            throw new IllegalStateException();
        }
        this.field2532.method3997();
        this.field2532 = null;
    }
}
