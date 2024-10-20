package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class206 implements Iterator {

    @ObfuscatedName("gz.v")
    public class200 field3111;

    @ObfuscatedName("gz.f")
    public class204 field3109;

    @ObfuscatedName("gz.i")
    public class204 field3110 = null;

    public class206(class200 arg0) {
        this.field3111 = arg0;
        this.field3109 = this.field3111.field3100.field3105;
        this.field3110 = null;
    }

    public Object next() {
        class204 var1 = this.field3109;
        if (this.field3111.field3100 == var1) {
            var1 = null;
            this.field3109 = null;
        } else {
            this.field3109 = var1.field3105;
        }
        this.field3110 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3111.field3100 != this.field3109;
    }

    public void remove() {
        if (this.field3110 == null) {
            throw new IllegalStateException();
        }
        this.field3110.method3623();
        this.field3110 = null;
    }
}
