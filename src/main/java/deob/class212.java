package deob;

import java.util.Iterator;

@ObfuscatedName("hx")
public class class212 implements Iterator {

    @ObfuscatedName("hx.g")
    public class216 field2639;

    @ObfuscatedName("hx.e")
    public class217 field2640;

    @ObfuscatedName("hx.b")
    public class217 field2641 = null;

    public class212(class216 arg0) {
        this.field2639 = arg0;
        this.field2640 = this.field2639.field2657.field2659;
        this.field2641 = null;
    }

    public Object next() {
        class217 var1 = this.field2640;
        if (this.field2639.field2657 == var1) {
            var1 = null;
            this.field2640 = null;
        } else {
            this.field2640 = var1.field2659;
        }
        this.field2641 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2639.field2657 != this.field2640;
    }

    public void remove() {
        if (this.field2641 == null) {
            throw new IllegalStateException();
        }
        this.field2641.method3796();
        this.field2641 = null;
    }
}
