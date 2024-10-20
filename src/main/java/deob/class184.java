package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class184 implements Iterator {

    @ObfuscatedName("gs.t")
    public class178 field2861;

    @ObfuscatedName("gs.o")
    public class182 field2859;

    @ObfuscatedName("gs.i")
    public class182 field2860 = null;

    public class184(class178 arg0) {
        this.field2861 = arg0;
        this.field2859 = this.field2861.field2850.field2854;
        this.field2860 = null;
    }

    public Object next() {
        class182 var1 = this.field2859;
        if (this.field2861.field2850 == var1) {
            var1 = null;
            this.field2859 = null;
        } else {
            this.field2859 = var1.field2854;
        }
        this.field2860 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2861.field2850 != this.field2859;
    }

    public void remove() {
        if (this.field2860 == null) {
            throw new IllegalStateException();
        }
        this.field2860.method3242();
        this.field2860 = null;
    }
}
