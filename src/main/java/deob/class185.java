package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class185 implements Iterator {

    @ObfuscatedName("gf.k")
    public class179 field2872;

    @ObfuscatedName("gf.y")
    public class183 field2873;

    @ObfuscatedName("gf.s")
    public class183 field2874 = null;

    public class185(class179 arg0) {
        this.field2872 = arg0;
        this.field2873 = this.field2872.field2863.field2868;
        this.field2874 = null;
    }

    public Object next() {
        class183 var1 = this.field2873;
        if (this.field2872.field2863 == var1) {
            var1 = null;
            this.field2873 = null;
        } else {
            this.field2873 = var1.field2868;
        }
        this.field2874 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2872.field2863 != this.field2873;
    }

    public void remove() {
        if (this.field2874 == null) {
            throw new IllegalStateException();
        }
        this.field2874.method3346();
        this.field2874 = null;
    }
}
