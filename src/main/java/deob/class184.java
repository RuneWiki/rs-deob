package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class184 implements Iterator {

    @ObfuscatedName("gt.g")
    public class181 field2878;

    @ObfuscatedName("gt.i")
    public class187 field2879;

    @ObfuscatedName("gt.k")
    public class187 field2877 = null;

    public class184(class181 arg0) {
        this.field2878 = arg0;
        this.field2879 = this.field2878.field2873.field2886;
        this.field2877 = null;
    }

    public Object next() {
        class187 var1 = this.field2879;
        if (this.field2878.field2873 == var1) {
            var1 = null;
            this.field2879 = null;
        } else {
            this.field2879 = var1.field2886;
        }
        this.field2877 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2878.field2873 != this.field2879;
    }

    public void remove() {
        if (this.field2877 == null) {
            throw new IllegalStateException();
        }
        this.field2877.method3304();
        this.field2877 = null;
    }
}
