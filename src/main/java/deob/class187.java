package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class187 implements Iterator {

    @ObfuscatedName("gf.g")
    public class181 field2880;

    @ObfuscatedName("gf.j")
    public class185 field2881;

    @ObfuscatedName("gf.z")
    public class185 field2882 = null;

    public class187(class181 arg0) {
        this.field2880 = arg0;
        this.field2881 = this.field2880.field2871.field2876;
        this.field2882 = null;
    }

    public Object next() {
        class185 var1 = this.field2881;
        if (this.field2880.field2871 == var1) {
            var1 = null;
            this.field2881 = null;
        } else {
            this.field2881 = var1.field2876;
        }
        this.field2882 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2880.field2871 != this.field2881;
    }

    public void remove() {
        if (this.field2882 == null) {
            throw new IllegalStateException();
        }
        this.field2882.method3235();
        this.field2882 = null;
    }
}
