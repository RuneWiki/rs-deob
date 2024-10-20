package deob;

import java.util.Iterator;

@ObfuscatedName("en")
public class class136 implements Iterator {

    @ObfuscatedName("en.b")
    public class137 field1881;

    @ObfuscatedName("en.e")
    public class130 field1882;

    @ObfuscatedName("en.c")
    public class130 field1883 = null;

    public class136(class137 arg0) {
        this.field1881 = arg0;
        this.field1882 = this.field1881.field1884.field1870;
        this.field1883 = null;
    }

    public Object next() {
        class130 var1 = this.field1882;
        if (this.field1881.field1884 == var1) {
            var1 = null;
            this.field1882 = null;
        } else {
            this.field1882 = var1.field1870;
        }
        this.field1883 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1881.field1884 != this.field1882;
    }

    public void remove() {
        if (this.field1883 == null) {
            throw new IllegalStateException();
        }
        this.field1883.method2343();
        this.field1883 = null;
    }
}
