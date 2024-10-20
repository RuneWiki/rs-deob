package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class186 implements Iterator {

    @ObfuscatedName("gg.l")
    public class183 field2879;

    @ObfuscatedName("gg.y")
    public class189 field2878;

    @ObfuscatedName("gg.g")
    public class189 field2877 = null;

    public class186(class183 arg0) {
        this.field2879 = arg0;
        this.field2878 = this.field2879.field2873.field2885;
        this.field2877 = null;
    }

    public Object next() {
        class189 var1 = this.field2878;
        if (this.field2879.field2873 == var1) {
            var1 = null;
            this.field2878 = null;
        } else {
            this.field2878 = var1.field2885;
        }
        this.field2877 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2879.field2873 != this.field2878;
    }

    public void remove() {
        if (this.field2877 == null) {
            throw new IllegalStateException();
        }
        this.field2877.method3375();
        this.field2877 = null;
    }
}
