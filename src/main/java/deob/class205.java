package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class205 implements Iterator {

    @ObfuscatedName("gt.v")
    public class202 field3108;

    @ObfuscatedName("gt.f")
    public class208 field3107;

    @ObfuscatedName("gt.i")
    public class208 field3106 = null;

    public class205(class202 arg0) {
        this.field3108 = arg0;
        this.field3107 = this.field3108.field3102.field3116;
        this.field3106 = null;
    }

    public Object next() {
        class208 var1 = this.field3107;
        if (this.field3108.field3102 == var1) {
            var1 = null;
            this.field3107 = null;
        } else {
            this.field3107 = var1.field3116;
        }
        this.field3106 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3108.field3102 != this.field3107;
    }

    public void remove() {
        if (this.field3106 == null) {
            throw new IllegalStateException();
        }
        this.field3106.method3645();
        this.field3106 = null;
    }
}
