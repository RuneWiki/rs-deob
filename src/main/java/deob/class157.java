package deob;

import java.util.Iterator;

@ObfuscatedName("fx")
public class class157 implements Iterator {

    @ObfuscatedName("fx.d")
    public class158 field2050;

    @ObfuscatedName("fx.c")
    public class151 field2051;

    @ObfuscatedName("fx.n")
    public class151 field2049 = null;

    public class157(class158 arg0) {
        this.field2050 = arg0;
        this.field2051 = this.field2050.field2052.field2037;
        this.field2049 = null;
    }

    public Object next() {
        class151 var1 = this.field2051;
        if (this.field2050.field2052 == var1) {
            var1 = null;
            this.field2051 = null;
        } else {
            this.field2051 = var1.field2037;
        }
        this.field2049 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2050.field2052 != this.field2051;
    }

    public void remove() {
        if (this.field2049 == null) {
            throw new IllegalStateException();
        }
        this.field2049.method2689();
        this.field2049 = null;
    }
}
