package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class207 implements Iterator {

    @ObfuscatedName("gg.n")
    public class211 field2481;

    @ObfuscatedName("gg.h")
    public class212 field2482;

    @ObfuscatedName("gg.l")
    public class212 field2483 = null;

    public class207(class211 arg0) {
        this.field2481 = arg0;
        this.field2482 = this.field2481.field2499.field2500;
        this.field2483 = null;
    }

    public Object next() {
        class212 var1 = this.field2482;
        if (this.field2481.field2499 == var1) {
            var1 = null;
            this.field2482 = null;
        } else {
            this.field2482 = var1.field2500;
        }
        this.field2483 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2481.field2499 != this.field2482;
    }

    public void remove() {
        if (this.field2483 == null) {
            throw new IllegalStateException();
        }
        this.field2483.method3973();
        this.field2483 = null;
    }
}
