package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class187 implements Iterator {

    @ObfuscatedName("gl.l")
    public class181 field2882;

    @ObfuscatedName("gl.y")
    public class185 field2881;

    @ObfuscatedName("gl.g")
    public class185 field2880 = null;

    public class187(class181 arg0) {
        this.field2882 = arg0;
        this.field2881 = this.field2882.field2871.field2876;
        this.field2880 = null;
    }

    public Object next() {
        class185 var1 = this.field2881;
        if (this.field2882.field2871 == var1) {
            var1 = null;
            this.field2881 = null;
        } else {
            this.field2881 = var1.field2876;
        }
        this.field2880 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2882.field2871 != this.field2881;
    }

    public void remove() {
        if (this.field2880 == null) {
            throw new IllegalStateException();
        }
        this.field2880.method3349();
        this.field2880 = null;
    }
}
