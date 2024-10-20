package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public class class188 implements Iterator {

    @ObfuscatedName("ge.p")
    public class185 field2893;

    @ObfuscatedName("ge.y")
    public class191 field2894;

    @ObfuscatedName("ge.d")
    public class191 field2895 = null;

    public class188(class185 arg0) {
        this.field2893 = arg0;
        this.field2894 = this.field2893.field2889.field2902;
        this.field2895 = null;
    }

    public Object next() {
        class191 var1 = this.field2894;
        if (this.field2893.field2889 == var1) {
            var1 = null;
            this.field2894 = null;
        } else {
            this.field2894 = var1.field2902;
        }
        this.field2895 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2893.field2889 != this.field2894;
    }

    public void remove() {
        if (this.field2895 == null) {
            throw new IllegalStateException();
        }
        this.field2895.method3358();
        this.field2895 = null;
    }
}
