package deob;

import java.util.Iterator;

@ObfuscatedName("jx")
public class class273 implements Iterator {

    @ObfuscatedName("jx.f")
    public class274 field3383;

    @ObfuscatedName("jx.o")
    public class351 field3384;

    @ObfuscatedName("jx.u")
    public class351 field3385 = null;

    public class273(class274 arg0) {
        this.method4203(arg0);
    }

    @ObfuscatedName("jx.f(Ljc;)V")
    public void method4203(class274 arg0) {
        this.field3383 = arg0;
        this.method4193();
    }

    @ObfuscatedName("jx.o()V")
    public void method4193() {
        this.field3384 = this.field3383 == null ? null : this.field3383.field3387.field3942;
        this.field3385 = null;
    }

    public Object next() {
        class351 var1 = this.field3384;
        if (this.field3383.field3387 == var1) {
            var1 = null;
            this.field3384 = null;
        } else {
            this.field3384 = var1.field3942;
        }
        this.field3385 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3383.field3387 != this.field3384;
    }

    public void remove() {
        if (this.field3385 == null) {
            throw new IllegalStateException();
        }
        this.field3385.method5354();
        this.field3385 = null;
    }
}
