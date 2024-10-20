package deob;

import java.util.Iterator;

@ObfuscatedName("ep")
public class class136 implements Iterator {

    @ObfuscatedName("ep.k")
    public class137 field1891;

    @ObfuscatedName("ep.y")
    public class130 field1890;

    @ObfuscatedName("ep.o")
    public class130 field1892 = null;

    public class136(class137 arg0) {
        this.field1891 = arg0;
        this.field1890 = this.field1891.field1893.field1878;
        this.field1892 = null;
    }

    public Object next() {
        class130 var1 = this.field1890;
        if (this.field1891.field1893 == var1) {
            var1 = null;
            this.field1890 = null;
        } else {
            this.field1890 = var1.field1878;
        }
        this.field1892 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field1891.field1893 != this.field1890;
    }

    public void remove() {
        if (this.field1892 == null) {
            throw new IllegalStateException();
        }
        this.field1892.method2251();
        this.field1892 = null;
    }
}
