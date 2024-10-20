package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class202 implements Iterator {

    @ObfuscatedName("gt.e")
    public class203 field2469;

    @ObfuscatedName("gt.n")
    public class196 field2470;

    @ObfuscatedName("gt.g")
    public class196 field2468 = null;

    public class202(class203 arg0) {
        this.field2469 = arg0;
        this.field2470 = this.field2469.field2471.field2456;
        this.field2468 = null;
    }

    public Object next() {
        class196 var1 = this.field2470;
        if (this.field2469.field2471 == var1) {
            var1 = null;
            this.field2470 = null;
        } else {
            this.field2470 = var1.field2456;
        }
        this.field2468 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2469.field2471 != this.field2470;
    }

    public void remove() {
        if (this.field2468 == null) {
            throw new IllegalStateException();
        }
        this.field2468.method3380();
        this.field2468 = null;
    }
}
