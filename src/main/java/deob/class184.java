package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public class class184 implements Iterator {

    @ObfuscatedName("ga.k")
    public class181 field2871;

    @ObfuscatedName("ga.y")
    public class187 field2870;

    @ObfuscatedName("ga.s")
    public class187 field2869 = null;

    public class184(class181 arg0) {
        this.field2871 = arg0;
        this.field2870 = this.field2871.field2865.field2878;
        this.field2869 = null;
    }

    public Object next() {
        class187 var1 = this.field2870;
        if (this.field2871.field2865 == var1) {
            var1 = null;
            this.field2870 = null;
        } else {
            this.field2870 = var1.field2878;
        }
        this.field2869 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2871.field2865 != this.field2870;
    }

    public void remove() {
        if (this.field2869 == null) {
            throw new IllegalStateException();
        }
        this.field2869.method3365();
        this.field2869 = null;
    }
}
