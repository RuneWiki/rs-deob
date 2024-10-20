package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class187 implements Iterator {

    @ObfuscatedName("gz.f")
    public class181 field2879;

    @ObfuscatedName("gz.k")
    public class185 field2878;

    @ObfuscatedName("gz.y")
    public class185 field2877 = null;

    public class187(class181 arg0) {
        this.field2879 = arg0;
        this.field2878 = this.field2879.field2868.field2873;
        this.field2877 = null;
    }

    public Object next() {
        class185 var1 = this.field2878;
        if (this.field2879.field2868 == var1) {
            var1 = null;
            this.field2878 = null;
        } else {
            this.field2878 = var1.field2873;
        }
        this.field2877 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2879.field2868 != this.field2878;
    }

    public void remove() {
        if (this.field2877 == null) {
            throw new IllegalStateException();
        }
        this.field2877.method3347();
        this.field2877 = null;
    }
}
