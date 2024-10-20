package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class188 implements Iterator {

    @ObfuscatedName("go.b")
    public class185 field2898;

    @ObfuscatedName("go.e")
    public class191 field2897;

    @ObfuscatedName("go.i")
    public class191 field2896 = null;

    public class188(class185 arg0) {
        this.field2898 = arg0;
        this.field2897 = this.field2898.field2892.field2904;
        this.field2896 = null;
    }

    public Object next() {
        class191 var1 = this.field2897;
        if (this.field2898.field2892 == var1) {
            var1 = null;
            this.field2897 = null;
        } else {
            this.field2897 = var1.field2904;
        }
        this.field2896 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2898.field2892 != this.field2897;
    }

    public void remove() {
        if (this.field2896 == null) {
            throw new IllegalStateException();
        }
        this.field2896.method3392();
        this.field2896 = null;
    }
}
