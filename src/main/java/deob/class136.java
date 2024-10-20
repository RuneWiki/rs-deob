package deob;

import java.util.Iterator;

@ObfuscatedName("eq")
public class class136 implements Iterator {

    @ObfuscatedName("eq.o")
    public class137 field1912;

    @ObfuscatedName("eq.m")
    public class130 field1913;

    @ObfuscatedName("eq.b")
    public class130 field1911 = null;

    public class136(class137 arg0) {
        this.field1912 = arg0;
        this.field1913 = this.field1912.field1914.field1900;
        this.field1911 = null;
    }

    public Object next() {
        class130 var1 = this.field1913;
        if (this.field1912.field1914 == var1) {
            var1 = null;
            this.field1913 = null;
        } else {
            this.field1913 = var1.field1900;
        }
        this.field1911 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1912.field1914 != this.field1913;
    }

    public void remove() {
        if (this.field1911 == null) {
            throw new IllegalStateException();
        }
        this.field1911.method2232();
        this.field1911 = null;
    }
}
