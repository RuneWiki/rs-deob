package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class183 implements Iterator {

    @ObfuscatedName("gi.e")
    public class180 field2857;

    @ObfuscatedName("gi.v")
    public class186 field2858;

    @ObfuscatedName("gi.i")
    public class186 field2859 = null;

    public class183(class180 arg0) {
        this.field2857 = arg0;
        this.field2858 = this.field2857.field2853.field2865;
        this.field2859 = null;
    }

    public Object next() {
        class186 var1 = this.field2858;
        if (this.field2857.field2853 == var1) {
            var1 = null;
            this.field2858 = null;
        } else {
            this.field2858 = var1.field2865;
        }
        this.field2859 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2857.field2853 != this.field2858;
    }

    public void remove() {
        if (this.field2859 == null) {
            throw new IllegalStateException();
        }
        this.field2859.method3273();
        this.field2859 = null;
    }
}
