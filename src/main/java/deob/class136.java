package deob;

import java.util.Iterator;

@ObfuscatedName("ef")
public class class136 implements Iterator {

    @ObfuscatedName("ef.x")
    public class137 field1902;

    @ObfuscatedName("ef.j")
    public class130 field1901;

    @ObfuscatedName("ef.c")
    public class130 field1900 = null;

    public class136(class137 arg0) {
        this.field1902 = arg0;
        this.field1901 = this.field1902.field1903.field1888;
        this.field1900 = null;
    }

    public Object next() {
        class130 var1 = this.field1901;
        if (this.field1902.field1903 == var1) {
            var1 = null;
            this.field1901 = null;
        } else {
            this.field1901 = var1.field1888;
        }
        this.field1900 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1902.field1903 != this.field1901;
    }

    public void remove() {
        if (this.field1900 == null) {
            throw new IllegalStateException();
        }
        this.field1900.method2318();
        this.field1900 = null;
    }
}
