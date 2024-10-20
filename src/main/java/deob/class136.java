package deob;

import java.util.Iterator;

@ObfuscatedName("eq")
public class class136 implements Iterator {

    @ObfuscatedName("eq.q")
    public class137 field1898;

    @ObfuscatedName("eq.d")
    public class130 field1899;

    @ObfuscatedName("eq.h")
    public class130 field1900 = null;

    public class136(class137 arg0) {
        this.field1898 = arg0;
        this.field1899 = this.field1898.field1901.field1886;
        this.field1900 = null;
    }

    public Object next() {
        class130 var1 = this.field1899;
        if (this.field1898.field1901 == var1) {
            var1 = null;
            this.field1899 = null;
        } else {
            this.field1899 = var1.field1886;
        }
        this.field1900 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1898.field1901 != this.field1899;
    }

    public void remove() {
        if (this.field1900 == null) {
            throw new IllegalStateException();
        }
        this.field1900.method2345();
        this.field1900 = null;
    }
}
