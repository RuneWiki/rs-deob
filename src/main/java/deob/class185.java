package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class185 implements Iterator {

    @ObfuscatedName("gf.g")
    public class179 field2879;

    @ObfuscatedName("gf.s")
    public class183 field2878;

    @ObfuscatedName("gf.v")
    public class183 field2877 = null;

    public class185(class179 arg0) {
        this.field2879 = arg0;
        this.field2878 = this.field2879.field2868.field2872;
        this.field2877 = null;
    }

    public Object next() {
        class183 var1 = this.field2878;
        if (this.field2879.field2868 == var1) {
            var1 = null;
            this.field2878 = null;
        } else {
            this.field2878 = var1.field2872;
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
        this.field2877.method3257();
        this.field2877 = null;
    }
}
