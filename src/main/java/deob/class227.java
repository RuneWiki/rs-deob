package deob;

import java.util.Iterator;

@ObfuscatedName("hb")
public class class227 implements Iterator {

    @ObfuscatedName("hb.o")
    public class228 field2672;

    @ObfuscatedName("hb.k")
    public class219 field2673;

    @ObfuscatedName("hb.t")
    public class219 field2674 = null;

    public class227(class228 arg0) {
        this.field2672 = arg0;
        this.field2673 = this.field2672.field2676.field2658;
        this.field2674 = null;
    }

    public Object next() {
        class219 var1 = this.field2673;
        if (this.field2672.field2676 == var1) {
            var1 = null;
            this.field2673 = null;
        } else {
            this.field2673 = var1.field2658;
        }
        this.field2674 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2672.field2676 != this.field2673;
    }

    public void remove() {
        if (this.field2674 == null) {
            throw new IllegalStateException();
        }
        this.field2674.method3721();
        this.field2674 = null;
    }
}
