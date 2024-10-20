package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class206 implements Iterable {

    @ObfuscatedName("gk.f")
    public class207 field2494 = new class207();

    @ObfuscatedName("gk.l")
    public class207 field2493;

    public class206() {
        this.field2494.field2495 = this.field2494;
        this.field2494.field2496 = this.field2494;
    }

    @ObfuscatedName("gk.f()V")
    public void method3801() {
        while (this.field2494.field2495 != this.field2494) {
            this.field2494.field2495.method3818();
        }
    }

    @ObfuscatedName("gk.l(Lgu;)V")
    public void method3796(class207 arg0) {
        if (arg0.field2496 != null) {
            arg0.method3818();
        }
        arg0.field2496 = this.field2494.field2496;
        arg0.field2495 = this.field2494;
        arg0.field2496.field2495 = arg0;
        arg0.field2495.field2496 = arg0;
    }

    @ObfuscatedName("gk.w(Lgu;)V")
    public void method3810(class207 arg0) {
        if (arg0.field2496 != null) {
            arg0.method3818();
        }
        arg0.field2496 = this.field2494;
        arg0.field2495 = this.field2494.field2495;
        arg0.field2496.field2495 = arg0;
        arg0.field2495.field2496 = arg0;
    }

    @ObfuscatedName("gk.s(Lgu;Lgu;)V")
    public static void method3792(class207 arg0, class207 arg1) {
        if (arg0.field2496 != null) {
            arg0.method3818();
        }
        arg0.field2496 = arg1;
        arg0.field2495 = arg1.field2495;
        arg0.field2496.field2495 = arg0;
        arg0.field2495.field2496 = arg0;
    }

    @ObfuscatedName("gk.e()Lgu;")
    public class207 method3793() {
        return this.method3794((class207) null);
    }

    @ObfuscatedName("gk.c(Lgu;)Lgu;")
    public class207 method3794(class207 arg0) {
        class207 var2;
        if (arg0 == null) {
            var2 = this.field2494.field2495;
        } else {
            var2 = arg0;
        }
        if (this.field2494 == var2) {
            this.field2493 = null;
            return null;
        } else {
            this.field2493 = var2.field2495;
            return var2;
        }
    }

    @ObfuscatedName("gk.p()Lgu;")
    public class207 method3795() {
        class207 var1 = this.field2493;
        if (this.field2494 == var1) {
            this.field2493 = null;
            return null;
        } else {
            this.field2493 = var1.field2495;
            return var1;
        }
    }

    @ObfuscatedName("gk.r()Z")
    public boolean method3805() {
        return this.field2494.field2495 == this.field2494;
    }

    public Iterator iterator() {
        return new class202(this);
    }
}
