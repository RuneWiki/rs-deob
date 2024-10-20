package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public final class class187 implements Iterable {

    @ObfuscatedName("gq.i")
    public int field2462;

    @ObfuscatedName("gq.c")
    public class193[] field2463;

    @ObfuscatedName("gq.e")
    public class193 field2461;

    @ObfuscatedName("gq.v")
    public class193 field2460;

    @ObfuscatedName("gq.b")
    public int field2459 = 0;

    public class187(int arg0) {
        this.field2462 = arg0;
        this.field2463 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2463[var2] = new class193();
            var3.field2481 = var3;
            var3.field2482 = var3;
        }
    }

    @ObfuscatedName("gq.i(J)Lgz;")
    public class193 method3193(long arg0) {
        class193 var3 = this.field2463[(int) (arg0 & (long) (this.field2462 - 1))];
        for (this.field2461 = var3.field2481; this.field2461 != var3; this.field2461 = this.field2461.field2481) {
            if (this.field2461.field2480 == arg0) {
                class193 var4 = this.field2461;
                this.field2461 = this.field2461.field2481;
                return var4;
            }
        }
        this.field2461 = null;
        return null;
    }

    @ObfuscatedName("gq.c(Lgz;J)V")
    public void method3194(class193 arg0, long arg1) {
        if (arg0.field2482 != null) {
            arg0.method3278();
        }
        class193 var4 = this.field2463[(int) (arg1 & (long) (this.field2462 - 1))];
        arg0.field2482 = var4.field2482;
        arg0.field2481 = var4;
        arg0.field2482.field2481 = arg0;
        arg0.field2481.field2482 = arg0;
        arg0.field2480 = arg1;
    }

    @ObfuscatedName("gq.e()V")
    public void method3202() {
        for (int var1 = 0; var1 < this.field2462; var1++) {
            class193 var2 = this.field2463[var1];
            while (true) {
                class193 var3 = var2.field2481;
                if (var2 == var3) {
                    break;
                }
                var3.method3278();
            }
        }
        this.field2461 = null;
        this.field2460 = null;
    }

    @ObfuscatedName("gq.v()Lgz;")
    public class193 method3200() {
        this.field2459 = 0;
        return this.method3196();
    }

    @ObfuscatedName("gq.b()Lgz;")
    public class193 method3196() {
        if (this.field2459 > 0 && this.field2463[this.field2459 - 1] != this.field2460) {
            class193 var1 = this.field2460;
            this.field2460 = var1.field2481;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2459 >= this.field2462) {
                return null;
            }
            var2 = this.field2463[this.field2459++].field2481;
        } while (this.field2463[this.field2459 - 1] == var2);
        this.field2460 = var2.field2481;
        return var2;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
