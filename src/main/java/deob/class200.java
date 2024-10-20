package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public final class class200 implements Iterable {

    @ObfuscatedName("ga.f")
    public int field2473;

    @ObfuscatedName("ga.l")
    public class207[] field2471;

    @ObfuscatedName("ga.w")
    public class207 field2470;

    @ObfuscatedName("ga.s")
    public class207 field2472;

    @ObfuscatedName("ga.e")
    public int field2474 = 0;

    public class200(int arg0) {
        this.field2473 = arg0;
        this.field2471 = new class207[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field2471[var2] = new class207();
            var3.field2495 = var3;
            var3.field2496 = var3;
        }
    }

    @ObfuscatedName("ga.f(J)Lgu;")
    public class207 method3706(long arg0) {
        class207 var3 = this.field2471[(int) (arg0 & (long) (this.field2473 - 1))];
        for (this.field2470 = var3.field2495; this.field2470 != var3; this.field2470 = this.field2470.field2495) {
            if (this.field2470.field2497 == arg0) {
                class207 var4 = this.field2470;
                this.field2470 = this.field2470.field2495;
                return var4;
            }
        }
        this.field2470 = null;
        return null;
    }

    @ObfuscatedName("ga.l(Lgu;J)V")
    public void method3708(class207 arg0, long arg1) {
        if (arg0.field2496 != null) {
            arg0.method3818();
        }
        class207 var4 = this.field2471[(int) (arg1 & (long) (this.field2473 - 1))];
        arg0.field2496 = var4.field2496;
        arg0.field2495 = var4;
        arg0.field2496.field2495 = arg0;
        arg0.field2495.field2496 = arg0;
        arg0.field2497 = arg1;
    }

    @ObfuscatedName("ga.w()V")
    public void method3709() {
        for (int var1 = 0; var1 < this.field2473; var1++) {
            class207 var2 = this.field2471[var1];
            while (true) {
                class207 var3 = var2.field2495;
                if (var2 == var3) {
                    break;
                }
                var3.method3818();
            }
        }
        this.field2470 = null;
        this.field2472 = null;
    }

    @ObfuscatedName("ga.s()Lgu;")
    public class207 method3710() {
        this.field2474 = 0;
        return this.method3711();
    }

    @ObfuscatedName("ga.e()Lgu;")
    public class207 method3711() {
        if (this.field2474 > 0 && this.field2471[this.field2474 - 1] != this.field2472) {
            class207 var1 = this.field2472;
            this.field2472 = var1.field2495;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2474 >= this.field2473) {
                return null;
            }
            var2 = this.field2471[this.field2474++].field2495;
        } while (this.field2471[this.field2474 - 1] == var2);
        this.field2472 = var2.field2495;
        return var2;
    }

    public Iterator iterator() {
        return new class213(this);
    }
}
