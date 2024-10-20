package deob;

import java.util.Iterator;

@ObfuscatedName("kc")
public class class301 implements Iterable {

    @ObfuscatedName("kc.s")
    public class349 field3731 = new class349();

    @ObfuscatedName("kc.t")
    public class349 field3730;

    public class301() {
        this.field3731.field3959 = this.field3731;
        this.field3731.field3960 = this.field3731;
    }

    @ObfuscatedName("kc.s()V")
    public void method4844() {
        while (this.field3731.field3959 != this.field3731) {
            this.field3731.field3959.method5445();
        }
    }

    @ObfuscatedName("kc.t(Lmw;)V")
    public void method4845(class349 arg0) {
        if (arg0.field3960 != null) {
            arg0.method5445();
        }
        arg0.field3960 = this.field3731.field3960;
        arg0.field3959 = this.field3731;
        arg0.field3960.field3959 = arg0;
        arg0.field3959.field3960 = arg0;
    }

    @ObfuscatedName("kc.v(Lmw;Lmw;)V")
    public static void method4846(class349 arg0, class349 arg1) {
        if (arg0.field3960 != null) {
            arg0.method5445();
        }
        arg0.field3960 = arg1;
        arg0.field3959 = arg1.field3959;
        arg0.field3960.field3959 = arg0;
        arg0.field3959.field3960 = arg0;
    }

    @ObfuscatedName("kc.j()Lmw;")
    public class349 method4847() {
        class349 var1 = this.field3731.field3959;
        if (this.field3731 == var1) {
            return null;
        } else {
            var1.method5445();
            return var1;
        }
    }

    @ObfuscatedName("kc.l()Lmw;")
    public class349 method4848() {
        return this.method4849((class349) null);
    }

    @ObfuscatedName("kc.n(Lmw;)Lmw;")
    public class349 method4849(class349 arg0) {
        class349 var2;
        if (arg0 == null) {
            var2 = this.field3731.field3959;
        } else {
            var2 = arg0;
        }
        if (this.field3731 == var2) {
            this.field3730 = null;
            return null;
        } else {
            this.field3730 = var2.field3959;
            return var2;
        }
    }

    @ObfuscatedName("kc.w()Lmw;")
    public class349 method4850() {
        class349 var1 = this.field3730;
        if (this.field3731 == var1) {
            this.field3730 = null;
            return null;
        } else {
            this.field3730 = var1.field3959;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class300(this);
    }
}
