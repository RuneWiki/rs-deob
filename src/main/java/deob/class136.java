package deob;

import java.util.Iterator;

@ObfuscatedName("eg")
public class class136 implements Iterator {

    @ObfuscatedName("eg.p")
    public class137 field1901;

    @ObfuscatedName("eg.g")
    public class130 field1902;

    @ObfuscatedName("eg.x")
    public class130 field1900 = null;

    public class136(class137 arg0) {
        this.field1901 = arg0;
        this.field1902 = this.field1901.field1903.field1888;
        this.field1900 = null;
    }

    public Object next() {
        class130 var1 = this.field1902;
        if (this.field1901.field1903 == var1) {
            var1 = null;
            this.field1902 = null;
        } else {
            this.field1902 = var1.field1888;
        }
        this.field1900 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1901.field1903 != this.field1902;
    }

    public void remove() {
        if (this.field1900 == null) {
            throw new IllegalStateException();
        }
        this.field1900.method2265();
        this.field1900 = null;
    }
}
