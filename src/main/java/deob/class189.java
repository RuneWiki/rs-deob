package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class189 implements Iterator {

    @ObfuscatedName("gf.v")
    public class183 field2908;

    @ObfuscatedName("gf.t")
    public class187 field2906;

    @ObfuscatedName("gf.f")
    public class187 field2907 = null;

    public class189(class183 arg0) {
        this.field2908 = arg0;
        this.field2906 = this.field2908.field2897.field2901;
        this.field2907 = null;
    }

    public Object next() {
        class187 var1 = this.field2906;
        if (this.field2908.field2897 == var1) {
            var1 = null;
            this.field2906 = null;
        } else {
            this.field2906 = var1.field2901;
        }
        this.field2907 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2908.field2897 != this.field2906;
    }

    public void remove() {
        if (this.field2907 == null) {
            throw new IllegalStateException();
        }
        this.field2907.method3371();
        this.field2907 = null;
    }
}
