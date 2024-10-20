package deob;

import java.util.Iterator;

@ObfuscatedName("jg")
public class class274 implements Iterator {

    @ObfuscatedName("jg.x")
    public class276 field3537;

    @ObfuscatedName("jg.m")
    public class185 field3538;

    @ObfuscatedName("jg.k")
    public class185 field3539 = null;

    public class274(class276 arg0) {
        this.field3537 = arg0;
        this.field3538 = this.field3537.field3543.field2110;
        this.field3539 = null;
    }

    public Object next() {
        class185 var1 = this.field3538;
        if (this.field3537.field3543 == var1) {
            var1 = null;
            this.field3538 = null;
        } else {
            this.field3538 = var1.field2110;
        }
        this.field3539 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3537.field3543 != this.field3538;
    }

    public void remove() {
        if (this.field3539 == null) {
            throw new IllegalStateException();
        }
        this.field3539.method3351();
        this.field3539 = null;
    }
}
