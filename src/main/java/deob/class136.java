package deob;

import java.util.Iterator;

@ObfuscatedName("er")
public class class136 implements Iterator {

    @ObfuscatedName("er.i")
    public class137 field1895;

    @ObfuscatedName("er.e")
    public class130 field1896;

    @ObfuscatedName("er.f")
    public class130 field1894 = null;

    public class136(class137 arg0) {
        this.field1895 = arg0;
        this.field1896 = this.field1895.field1897.field1882;
        this.field1894 = null;
    }

    public Object next() {
        class130 var1 = this.field1896;
        if (this.field1895.field1897 == var1) {
            var1 = null;
            this.field1896 = null;
        } else {
            this.field1896 = var1.field1882;
        }
        this.field1894 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1895.field1897 != this.field1896;
    }

    public void remove() {
        if (this.field1894 == null) {
            throw new IllegalStateException();
        }
        this.field1894.method2238();
        this.field1894 = null;
    }
}
