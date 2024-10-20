package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class201 implements Iterator {

    @ObfuscatedName("gt.d")
    public class202 field2503;

    @ObfuscatedName("gt.k")
    public class195 field2504;

    @ObfuscatedName("gt.e")
    public class195 field2502 = null;

    public class201(class202 arg0) {
        this.field2503 = arg0;
        this.field2504 = this.field2503.field2505.field2491;
        this.field2502 = null;
    }

    public Object next() {
        class195 var1 = this.field2504;
        if (this.field2503.field2505 == var1) {
            var1 = null;
            this.field2504 = null;
        } else {
            this.field2504 = var1.field2491;
        }
        this.field2502 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2503.field2505 != this.field2504;
    }

    public void remove() {
        if (this.field2502 == null) {
            throw new IllegalStateException();
        }
        this.field2502.method3449();
        this.field2502 = null;
    }
}
