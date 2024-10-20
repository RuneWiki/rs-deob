package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public final class class198 implements Iterable {

    @ObfuscatedName("gs.p")
    public int field2544;

    @ObfuscatedName("gs.i")
    public class204[] field2541;

    @ObfuscatedName("gs.w")
    public class204 field2543;

    @ObfuscatedName("gs.s")
    public class204 field2540;

    @ObfuscatedName("gs.j")
    public int field2542 = 0;

    public class198(int arg0) {
        this.field2544 = arg0;
        this.field2541 = new class204[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class204 var3 = this.field2541[var2] = new class204();
            var3.field2562 = var3;
            var3.field2561 = var3;
        }
    }

    @ObfuscatedName("gs.p(J)Lgw;")
    public class204 method3472(long arg0) {
        class204 var3 = this.field2541[(int) (arg0 & (long) (this.field2544 - 1))];
        for (this.field2543 = var3.field2562; this.field2543 != var3; this.field2543 = this.field2543.field2562) {
            if (this.field2543.field2563 == arg0) {
                class204 var4 = this.field2543;
                this.field2543 = this.field2543.field2562;
                return var4;
            }
        }
        this.field2543 = null;
        return null;
    }

    @ObfuscatedName("gs.i(Lgw;J)V")
    public void method3483(class204 arg0, long arg1) {
        if (arg0.field2561 != null) {
            arg0.method3561();
        }
        class204 var4 = this.field2541[(int) (arg1 & (long) (this.field2544 - 1))];
        arg0.field2561 = var4.field2561;
        arg0.field2562 = var4;
        arg0.field2561.field2562 = arg0;
        arg0.field2562.field2561 = arg0;
        arg0.field2563 = arg1;
    }

    @ObfuscatedName("gs.w()V")
    public void method3474() {
        for (int var1 = 0; var1 < this.field2544; var1++) {
            class204 var2 = this.field2541[var1];
            while (true) {
                class204 var3 = var2.field2562;
                if (var2 == var3) {
                    break;
                }
                var3.method3561();
            }
        }
        this.field2543 = null;
        this.field2540 = null;
    }

    @ObfuscatedName("gs.s()Lgw;")
    public class204 method3475() {
        this.field2542 = 0;
        return this.method3477();
    }

    @ObfuscatedName("gs.j()Lgw;")
    public class204 method3477() {
        if (this.field2542 > 0 && this.field2541[this.field2542 - 1] != this.field2540) {
            class204 var1 = this.field2540;
            this.field2540 = var1.field2562;
            return var1;
        }
        class204 var2;
        do {
            if (this.field2542 >= this.field2544) {
                return null;
            }
            var2 = this.field2541[this.field2542++].field2562;
        } while (this.field2541[this.field2542 - 1] == var2);
        this.field2540 = var2.field2562;
        return var2;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
