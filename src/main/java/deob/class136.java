package deob;

import java.util.Iterator;

@ObfuscatedName("ea")
public class class136 implements Iterator {

    @ObfuscatedName("ea.x")
    public class137 field1902;

    @ObfuscatedName("ea.n")
    public class130 field1901;

    @ObfuscatedName("ea.g")
    public class130 field1903 = null;

    public class136(class137 arg0) {
        this.field1902 = arg0;
        this.field1901 = this.field1902.field1904.field1889;
        this.field1903 = null;
    }

    public Object next() {
        class130 var1 = this.field1901;
        if (this.field1902.field1904 == var1) {
            var1 = null;
            this.field1901 = null;
        } else {
            this.field1901 = var1.field1889;
        }
        this.field1903 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1902.field1904 != this.field1901;
    }

    public void remove() {
        if (this.field1903 == null) {
            throw new IllegalStateException();
        }
        this.field1903.method2362();
        this.field1903 = null;
    }
}
