package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class206 implements Iterable {

    @ObfuscatedName("gb.g")
    public class207 field2494 = new class207();

    @ObfuscatedName("gb.r")
    public class207 field2495;

    public class206() {
        this.field2494.field2496 = this.field2494;
        this.field2494.field2498 = this.field2494;
    }

    @ObfuscatedName("gb.g()V")
    public void method3948() {
        while (this.field2494.field2496 != this.field2494) {
            this.field2494.field2496.method3952();
        }
    }

    @ObfuscatedName("gb.r(Lgy;)V")
    public void method3950(class207 arg0) {
        if (arg0.field2498 != null) {
            arg0.method3952();
        }
        arg0.field2498 = this.field2494.field2498;
        arg0.field2496 = this.field2494;
        arg0.field2498.field2496 = arg0;
        arg0.field2496.field2498 = arg0;
    }

    @ObfuscatedName("gb.e(Lgy;)V")
    public void method3927(class207 arg0) {
        if (arg0.field2498 != null) {
            arg0.method3952();
        }
        arg0.field2498 = this.field2494;
        arg0.field2496 = this.field2494.field2496;
        arg0.field2498.field2496 = arg0;
        arg0.field2496.field2498 = arg0;
    }

    @ObfuscatedName("gb.q(Lgy;Lgy;)V")
    public static void method3926(class207 arg0, class207 arg1) {
        if (arg0.field2498 != null) {
            arg0.method3952();
        }
        arg0.field2498 = arg1;
        arg0.field2496 = arg1.field2496;
        arg0.field2498.field2496 = arg0;
        arg0.field2496.field2498 = arg0;
    }

    @ObfuscatedName("gb.c()Lgy;")
    public class207 method3931() {
        return this.method3925((class207) null);
    }

    @ObfuscatedName("gb.i(Lgy;)Lgy;")
    public class207 method3925(class207 arg0) {
        class207 var2;
        if (arg0 == null) {
            var2 = this.field2494.field2496;
        } else {
            var2 = arg0;
        }
        if (this.field2494 == var2) {
            this.field2495 = null;
            return null;
        } else {
            this.field2495 = var2.field2496;
            return var2;
        }
    }

    @ObfuscatedName("gb.p()Lgy;")
    public class207 method3929() {
        class207 var1 = this.field2495;
        if (this.field2494 == var1) {
            this.field2495 = null;
            return null;
        } else {
            this.field2495 = var1.field2496;
            return var1;
        }
    }

    @ObfuscatedName("gb.m()Z")
    public boolean method3930() {
        return this.field2494.field2496 == this.field2494;
    }

    public Iterator iterator() {
        return new class202(this);
    }
}
