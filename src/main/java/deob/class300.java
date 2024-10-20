package deob;

import java.util.Iterator;

@ObfuscatedName("ks")
public class class300 implements Iterable {

    @ObfuscatedName("ks.f")
    public class348 field3720 = new class348();

    @ObfuscatedName("ks.e")
    public class348 field3721;

    public class300() {
        this.field3720.field3929 = this.field3720;
        this.field3720.field3928 = this.field3720;
    }

    @ObfuscatedName("ks.f()V")
    public void method4846() {
        while (this.field3720.field3929 != this.field3720) {
            this.field3720.field3929.method5404();
        }
    }

    @ObfuscatedName("ks.e(Lmm;)V")
    public void method4845(class348 arg0) {
        if (arg0.field3928 != null) {
            arg0.method5404();
        }
        arg0.field3928 = this.field3720.field3928;
        arg0.field3929 = this.field3720;
        arg0.field3928.field3929 = arg0;
        arg0.field3929.field3928 = arg0;
    }

    @ObfuscatedName("ks.v(Lmm;Lmm;)V")
    public static void method4847(class348 arg0, class348 arg1) {
        if (arg0.field3928 != null) {
            arg0.method5404();
        }
        arg0.field3928 = arg1;
        arg0.field3929 = arg1.field3929;
        arg0.field3928.field3929 = arg0;
        arg0.field3929.field3928 = arg0;
    }

    @ObfuscatedName("ks.y()Lmm;")
    public class348 method4861() {
        class348 var1 = this.field3720.field3929;
        if (this.field3720 == var1) {
            return null;
        } else {
            var1.method5404();
            return var1;
        }
    }

    @ObfuscatedName("ks.j()Lmm;")
    public class348 method4849() {
        return this.method4850((class348) null);
    }

    @ObfuscatedName("ks.o(Lmm;)Lmm;")
    public class348 method4850(class348 arg0) {
        class348 var2;
        if (arg0 == null) {
            var2 = this.field3720.field3929;
        } else {
            var2 = arg0;
        }
        if (this.field3720 == var2) {
            this.field3721 = null;
            return null;
        } else {
            this.field3721 = var2.field3929;
            return var2;
        }
    }

    @ObfuscatedName("ks.m()Lmm;")
    public class348 method4851() {
        class348 var1 = this.field3721;
        if (this.field3720 == var1) {
            this.field3721 = null;
            return null;
        } else {
            this.field3721 = var1.field3929;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class299(this);
    }
}
