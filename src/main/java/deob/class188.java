package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class188 implements Iterator {

    @ObfuscatedName("gs.v")
    public class185 field2903;

    @ObfuscatedName("gs.t")
    public class191 field2904;

    @ObfuscatedName("gs.f")
    public class191 field2905 = null;

    public class188(class185 arg0) {
        this.field2903 = arg0;
        this.field2904 = this.field2903.field2899.field2912;
        this.field2905 = null;
    }

    public Object next() {
        class191 var1 = this.field2904;
        if (this.field2903.field2899 == var1) {
            var1 = null;
            this.field2904 = null;
        } else {
            this.field2904 = var1.field2912;
        }
        this.field2905 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2903.field2899 != this.field2904;
    }

    public void remove() {
        if (this.field2905 == null) {
            throw new IllegalStateException();
        }
        this.field2905.method3392();
        this.field2905 = null;
    }
}
