package deob;

import java.util.Iterator;

@ObfuscatedName("hg")
public class class212 implements Iterator {

    @ObfuscatedName("hg.d")
    public class216 field2636;

    @ObfuscatedName("hg.z")
    public class217 field2635;

    @ObfuscatedName("hg.n")
    public class217 field2634 = null;

    public class212(class216 arg0) {
        this.field2636 = arg0;
        this.field2635 = this.field2636.field2651.field2654;
        this.field2634 = null;
    }

    public Object next() {
        class217 var1 = this.field2635;
        if (this.field2636.field2651 == var1) {
            var1 = null;
            this.field2635 = null;
        } else {
            this.field2635 = var1.field2654;
        }
        this.field2634 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2636.field2651 != this.field2635;
    }

    public void remove() {
        if (this.field2634 == null) {
            throw new IllegalStateException();
        }
        this.field2634.method3785();
        this.field2634 = null;
    }
}
