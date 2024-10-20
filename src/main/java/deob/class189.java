package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class189 implements Iterator {

    @ObfuscatedName("gk.b")
    public class183 field2900;

    @ObfuscatedName("gk.e")
    public class187 field2899;

    @ObfuscatedName("gk.i")
    public class187 field2901 = null;

    public class189(class183 arg0) {
        this.field2900 = arg0;
        this.field2899 = this.field2900.field2890.field2894;
        this.field2901 = null;
    }

    public Object next() {
        class187 var1 = this.field2899;
        if (this.field2900.field2890 == var1) {
            var1 = null;
            this.field2899 = null;
        } else {
            this.field2899 = var1.field2894;
        }
        this.field2901 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2900.field2890 != this.field2899;
    }

    public void remove() {
        if (this.field2901 == null) {
            throw new IllegalStateException();
        }
        this.field2901.method3367();
        this.field2901 = null;
    }
}
