package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class189 implements Iterator {

    @ObfuscatedName("gi.p")
    public class183 field2897;

    @ObfuscatedName("gi.y")
    public class187 field2896;

    @ObfuscatedName("gi.d")
    public class187 field2898 = null;

    public class189(class183 arg0) {
        this.field2897 = arg0;
        this.field2896 = this.field2897.field2887.field2891;
        this.field2898 = null;
    }

    public Object next() {
        class187 var1 = this.field2896;
        if (this.field2897.field2887 == var1) {
            var1 = null;
            this.field2896 = null;
        } else {
            this.field2896 = var1.field2891;
        }
        this.field2898 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2897.field2887 != this.field2896;
    }

    public void remove() {
        if (this.field2898 == null) {
            throw new IllegalStateException();
        }
        this.field2898.method3331();
        this.field2898 = null;
    }
}
