package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class188 implements Iterator {

    @ObfuscatedName("gf.a")
    public class185 field2900;

    @ObfuscatedName("gf.v")
    public class191 field2899;

    @ObfuscatedName("gf.i")
    public class191 field2901 = null;

    public class188(class185 arg0) {
        this.field2900 = arg0;
        this.field2899 = this.field2900.field2895.field2909;
        this.field2901 = null;
    }

    public Object next() {
        class191 var1 = this.field2899;
        if (this.field2900.field2895 == var1) {
            var1 = null;
            this.field2899 = null;
        } else {
            this.field2899 = var1.field2909;
        }
        this.field2901 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2900.field2895 != this.field2899;
    }

    public void remove() {
        if (this.field2901 == null) {
            throw new IllegalStateException();
        }
        this.field2901.method3343();
        this.field2901 = null;
    }
}
