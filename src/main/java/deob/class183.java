package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class183 implements Iterator {

    @ObfuscatedName("gi.k")
    public class180 field2859;

    @ObfuscatedName("gi.b")
    public class186 field2858;

    @ObfuscatedName("gi.e")
    public class186 field2860 = null;

    public class183(class180 arg0) {
        this.field2859 = arg0;
        this.field2858 = this.field2859.field2854.field2866;
        this.field2860 = null;
    }

    public Object next() {
        class186 var1 = this.field2858;
        if (this.field2859.field2854 == var1) {
            var1 = null;
            this.field2858 = null;
        } else {
            this.field2858 = var1.field2866;
        }
        this.field2860 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2859.field2854 != this.field2858;
    }

    public void remove() {
        if (this.field2860 == null) {
            throw new IllegalStateException();
        }
        this.field2860.method3321();
        this.field2860 = null;
    }
}
