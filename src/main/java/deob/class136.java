package deob;

import java.util.Iterator;

@ObfuscatedName("en")
public class class136 implements Iterator {

    @ObfuscatedName("en.s")
    public class137 field1905;

    @ObfuscatedName("en.c")
    public class130 field1906;

    @ObfuscatedName("en.f")
    public class130 field1904 = null;

    public class136(class137 arg0) {
        this.field1905 = arg0;
        this.field1906 = this.field1905.field1907.field1893;
        this.field1904 = null;
    }

    public Object next() {
        class130 var1 = this.field1906;
        if (this.field1905.field1907 == var1) {
            var1 = null;
            this.field1906 = null;
        } else {
            this.field1906 = var1.field1893;
        }
        this.field1904 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1905.field1907 != this.field1906;
    }

    public void remove() {
        if (this.field1904 == null) {
            throw new IllegalStateException();
        }
        this.field1904.method2218();
        this.field1904 = null;
    }
}
