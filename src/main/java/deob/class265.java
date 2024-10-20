package deob;

import java.util.Iterator;

@ObfuscatedName("jx")
public class class265 implements Iterator {

    @ObfuscatedName("jx.z")
    public class261 field3533;

    @ObfuscatedName("jx.n")
    public class181 field3532;

    @ObfuscatedName("jx.v")
    public class181 field3531 = null;

    public class265(class261 arg0) {
        this.method4492(arg0);
    }

    @ObfuscatedName("jx.i(Ljs;)V")
    public void method4492(class261 arg0) {
        this.field3533 = arg0;
        this.method4483();
    }

    @ObfuscatedName("jx.c()V")
    public void method4483() {
        this.field3532 = this.field3533 == null ? null : this.field3533.field3523.field2093;
        this.field3531 = null;
    }

    public Object next() {
        class181 var1 = this.field3532;
        if (this.field3533.field3523 == var1) {
            var1 = null;
            this.field3532 = null;
        } else {
            this.field3532 = var1.field2093;
        }
        this.field3531 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3533.field3523 != this.field3532;
    }

    public void remove() {
        if (this.field3531 == null) {
            throw new IllegalStateException();
        }
        this.field3531.method3249();
        this.field3531 = null;
    }
}
