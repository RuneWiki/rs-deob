package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public class class184 implements Iterator {

    @ObfuscatedName("gn.i")
    public class178 field2864;

    @ObfuscatedName("gn.c")
    public class182 field2865;

    @ObfuscatedName("gn.h")
    public class182 field2866 = null;

    public class184(class178 arg0) {
        this.field2864 = arg0;
        this.field2865 = this.field2864.field2855.field2859;
        this.field2866 = null;
    }

    public Object next() {
        class182 var1 = this.field2865;
        if (this.field2864.field2855 == var1) {
            var1 = null;
            this.field2865 = null;
        } else {
            this.field2865 = var1.field2859;
        }
        this.field2866 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2864.field2855 != this.field2865;
    }

    public void remove() {
        if (this.field2866 == null) {
            throw new IllegalStateException();
        }
        this.field2866.method3305();
        this.field2866 = null;
    }
}
