package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class187 implements Iterator {

    @ObfuscatedName("gk.e")
    public class181 field2890;

    @ObfuscatedName("gk.v")
    public class185 field2891;

    @ObfuscatedName("gk.k")
    public class185 field2889 = null;

    public class187(class181 arg0) {
        this.field2890 = arg0;
        this.field2891 = this.field2890.field2880.field2884;
        this.field2889 = null;
    }

    public Object next() {
        class185 var1 = this.field2891;
        if (this.field2890.field2880 == var1) {
            var1 = null;
            this.field2891 = null;
        } else {
            this.field2891 = var1.field2884;
        }
        this.field2889 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2890.field2880 != this.field2891;
    }

    public void remove() {
        if (this.field2889 == null) {
            throw new IllegalStateException();
        }
        this.field2889.method3299();
        this.field2889 = null;
    }
}
