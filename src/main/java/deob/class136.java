package deob;

import java.util.Iterator;

@ObfuscatedName("eb")
public class class136 implements Iterator {

    @ObfuscatedName("eb.n")
    public class137 field1895;

    @ObfuscatedName("eb.d")
    public class130 field1896;

    @ObfuscatedName("eb.m")
    public class130 field1897 = null;

    public class136(class137 arg0) {
        this.field1895 = arg0;
        this.field1896 = this.field1895.field1898.field1883;
        this.field1897 = null;
    }

    public Object next() {
        class130 var1 = this.field1896;
        if (this.field1895.field1898 == var1) {
            var1 = null;
            this.field1896 = null;
        } else {
            this.field1896 = var1.field1883;
        }
        this.field1897 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1895.field1898 != this.field1896;
    }

    public void remove() {
        if (this.field1897 == null) {
            throw new IllegalStateException();
        }
        this.field1897.method2307();
        this.field1897 = null;
    }
}
