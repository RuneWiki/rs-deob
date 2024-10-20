package deob;

import java.util.Iterator;

@ObfuscatedName("ej")
public class class136 implements Iterator {

    @ObfuscatedName("ej.u")
    public class137 field1886;

    @ObfuscatedName("ej.x")
    public class130 field1885;

    @ObfuscatedName("ej.i")
    public class130 field1884 = null;

    public class136(class137 arg0) {
        this.field1886 = arg0;
        this.field1885 = this.field1886.field1887.field1873;
        this.field1884 = null;
    }

    public Object next() {
        class130 var1 = this.field1885;
        if (this.field1886.field1887 == var1) {
            var1 = null;
            this.field1885 = null;
        } else {
            this.field1885 = var1.field1873;
        }
        this.field1884 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1886.field1887 != this.field1885;
    }

    public void remove() {
        if (this.field1884 == null) {
            throw new IllegalStateException();
        }
        this.field1884.method2264();
        this.field1884 = null;
    }
}
