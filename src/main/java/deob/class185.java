package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class185 implements Iterator {

    @ObfuscatedName("gm.g")
    public class179 field2881;

    @ObfuscatedName("gm.i")
    public class183 field2880;

    @ObfuscatedName("gm.k")
    public class183 field2882 = null;

    public class185(class179 arg0) {
        this.field2881 = arg0;
        this.field2880 = this.field2881.field2871.field2876;
        this.field2882 = null;
    }

    public Object next() {
        class183 var1 = this.field2880;
        if (this.field2881.field2871 == var1) {
            var1 = null;
            this.field2880 = null;
        } else {
            this.field2880 = var1.field2876;
        }
        this.field2882 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2881.field2871 != this.field2880;
    }

    public void remove() {
        if (this.field2882 == null) {
            throw new IllegalStateException();
        }
        this.field2882.method3272();
        this.field2882 = null;
    }
}
