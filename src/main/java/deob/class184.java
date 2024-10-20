package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class184 implements Iterator {

    @ObfuscatedName("gd.g")
    public class181 field2865;

    @ObfuscatedName("gd.s")
    public class187 field2864;

    @ObfuscatedName("gd.h")
    public class187 field2866 = null;

    public class184(class181 arg0) {
        this.field2865 = arg0;
        this.field2864 = this.field2865.field2860.field2874;
        this.field2866 = null;
    }

    public Object next() {
        class187 var1 = this.field2864;
        if (this.field2865.field2860 == var1) {
            var1 = null;
            this.field2864 = null;
        } else {
            this.field2864 = var1.field2874;
        }
        this.field2866 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2865.field2860 != this.field2864;
    }

    public void remove() {
        if (this.field2866 == null) {
            throw new IllegalStateException();
        }
        this.field2866.method3280();
        this.field2866 = null;
    }
}
