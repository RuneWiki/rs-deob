package deob;

import java.util.Iterator;

@ObfuscatedName("hp")
public class class212 implements Iterator {

    @ObfuscatedName("hp.a")
    public class213 field2607;

    @ObfuscatedName("hp.w")
    public class206 field2606;

    @ObfuscatedName("hp.e")
    public class206 field2608 = null;

    public class212(class213 arg0) {
        this.field2607 = arg0;
        this.field2606 = this.field2607.field2609.field2595;
        this.field2608 = null;
    }

    public Object next() {
        class206 var1 = this.field2606;
        if (this.field2607.field2609 == var1) {
            var1 = null;
            this.field2606 = null;
        } else {
            this.field2606 = var1.field2595;
        }
        this.field2608 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2607.field2609 != this.field2606;
    }

    public void remove() {
        if (this.field2608 == null) {
            throw new IllegalStateException();
        }
        this.field2608.method3474();
        this.field2608 = null;
    }
}
