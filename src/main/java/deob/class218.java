package deob;

import java.util.Iterator;

@ObfuscatedName("hf")
public class class218 implements Iterable {

    @ObfuscatedName("hf.f")
    public class209 field2518 = new class209();

    @ObfuscatedName("hf.l")
    public class209 field2519;

    public class218() {
        this.field2518.field2501 = this.field2518;
        this.field2518.field2502 = this.field2518;
    }

    @ObfuscatedName("hf.f()V")
    public void method3897() {
        while (this.field2518.field2501 != this.field2518) {
            this.field2518.field2501.method3851();
        }
    }

    @ObfuscatedName("hf.l(Lhe;)V")
    public void method3899(class209 arg0) {
        if (arg0.field2502 != null) {
            arg0.method3851();
        }
        arg0.field2502 = this.field2518.field2502;
        arg0.field2501 = this.field2518;
        arg0.field2502.field2501 = arg0;
        arg0.field2501.field2502 = arg0;
    }

    @ObfuscatedName("hf.w()Lhe;")
    public class209 method3898() {
        class209 var1 = this.field2518.field2501;
        if (this.field2518 == var1) {
            return null;
        } else {
            var1.method3851();
            return var1;
        }
    }

    @ObfuscatedName("hf.s()Lhe;")
    public class209 method3907() {
        return this.method3900((class209) null);
    }

    @ObfuscatedName("hf.e(Lhe;)Lhe;")
    public class209 method3900(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field2518.field2501;
        } else {
            var2 = arg0;
        }
        if (this.field2518 == var2) {
            this.field2519 = null;
            return null;
        } else {
            this.field2519 = var2.field2501;
            return var2;
        }
    }

    @ObfuscatedName("hf.c()Lhe;")
    public class209 method3896() {
        class209 var1 = this.field2519;
        if (this.field2518 == var1) {
            this.field2519 = null;
            return null;
        } else {
            this.field2519 = var1.field2501;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class217(this);
    }
}
