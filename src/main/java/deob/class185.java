package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class185 implements Iterator {

    @ObfuscatedName("gd.n")
    public class179 field2883;

    @ObfuscatedName("gd.x")
    public class183 field2881;

    @ObfuscatedName("gd.k")
    public class183 field2882 = null;

    public class185(class179 arg0) {
        this.field2883 = arg0;
        this.field2881 = this.field2883.field2872.field2877;
        this.field2882 = null;
    }

    public Object next() {
        class183 var1 = this.field2881;
        if (this.field2883.field2872 == var1) {
            var1 = null;
            this.field2881 = null;
        } else {
            this.field2881 = var1.field2877;
        }
        this.field2882 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2883.field2872 != this.field2881;
    }

    public void remove() {
        if (this.field2882 == null) {
            throw new IllegalStateException();
        }
        this.field2882.method3253();
        this.field2882 = null;
    }
}
