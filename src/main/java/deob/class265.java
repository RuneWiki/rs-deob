package deob;

import java.util.Iterator;

@ObfuscatedName("jn")
public class class265 implements Iterator {

    @ObfuscatedName("jn.s")
    public class261 field3523;

    @ObfuscatedName("jn.j")
    public class181 field3522;

    @ObfuscatedName("jn.i")
    public class181 field3521 = null;

    public class265(class261 arg0) {
        this.method4530(arg0);
    }

    @ObfuscatedName("jn.r(Ljp;)V")
    public void method4530(class261 arg0) {
        this.field3523 = arg0;
        this.method4535();
    }

    @ObfuscatedName("jn.y()V")
    public void method4535() {
        this.field3522 = this.field3523 == null ? null : this.field3523.field3513.field2097;
        this.field3521 = null;
    }

    public Object next() {
        class181 var1 = this.field3522;
        if (this.field3523.field3513 == var1) {
            var1 = null;
            this.field3522 = null;
        } else {
            this.field3522 = var1.field2097;
        }
        this.field3521 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3523.field3513 != this.field3522;
    }

    public void remove() {
        if (this.field3521 == null) {
            throw new IllegalStateException();
        }
        this.field3521.method3304();
        this.field3521 = null;
    }
}
