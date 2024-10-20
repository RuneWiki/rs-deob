package deob;

import java.util.Iterator;

@ObfuscatedName("je")
public class class274 implements Iterator {

    @ObfuscatedName("je.z")
    public class276 field3562;

    @ObfuscatedName("je.k")
    public class185 field3560;

    @ObfuscatedName("je.s")
    public class185 field3561 = null;

    public class274(class276 arg0) {
        this.field3562 = arg0;
        this.field3560 = this.field3562.field3566.field2147;
        this.field3561 = null;
    }

    public Object next() {
        class185 var1 = this.field3560;
        if (this.field3562.field3566 == var1) {
            var1 = null;
            this.field3560 = null;
        } else {
            this.field3560 = var1.field2147;
        }
        this.field3561 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3562.field3566 != this.field3560;
    }

    public void remove() {
        if (this.field3561 == null) {
            throw new IllegalStateException();
        }
        this.field3561.method3395();
        this.field3561 = null;
    }
}
