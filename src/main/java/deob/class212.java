package deob;

import java.util.Iterator;

@ObfuscatedName("hg")
public class class212 implements Iterator {

    @ObfuscatedName("hg.o")
    public class216 field2633;

    @ObfuscatedName("hg.k")
    public class217 field2634;

    @ObfuscatedName("hg.t")
    public class217 field2635 = null;

    public class212(class216 arg0) {
        this.field2633 = arg0;
        this.field2634 = this.field2633.field2651.field2653;
        this.field2635 = null;
    }

    public Object next() {
        class217 var1 = this.field2634;
        if (this.field2633.field2651 == var1) {
            var1 = null;
            this.field2634 = null;
        } else {
            this.field2634 = var1.field2653;
        }
        this.field2635 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2633.field2651 != this.field2634;
    }

    public void remove() {
        if (this.field2635 == null) {
            throw new IllegalStateException();
        }
        this.field2635.method3681();
        this.field2635 = null;
    }
}
