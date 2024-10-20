package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public final class class190 implements Iterable {

    @ObfuscatedName("gq.w")
    public int field2470;

    @ObfuscatedName("gq.o")
    public class196[] field2467;

    @ObfuscatedName("gq.x")
    public class196 field2469;

    @ObfuscatedName("gq.k")
    public class196 field2468;

    @ObfuscatedName("gq.f")
    public int field2471 = 0;

    public class190(int arg0) {
        this.field2470 = arg0;
        this.field2467 = new class196[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class196 var3 = this.field2467[var2] = new class196();
            var3.field2489 = var3;
            var3.field2488 = var3;
        }
    }

    @ObfuscatedName("gq.w(J)Lgd;")
    public class196 method3216(long arg0) {
        class196 var3 = this.field2467[(int) (arg0 & (long) (this.field2470 - 1))];
        for (this.field2469 = var3.field2489; this.field2469 != var3; this.field2469 = this.field2469.field2489) {
            if (this.field2469.field2490 == arg0) {
                class196 var4 = this.field2469;
                this.field2469 = this.field2469.field2489;
                return var4;
            }
        }
        this.field2469 = null;
        return null;
    }

    @ObfuscatedName("gq.o(Lgd;J)V")
    public void method3213(class196 arg0, long arg1) {
        if (arg0.field2488 != null) {
            arg0.method3294();
        }
        class196 var4 = this.field2467[(int) (arg1 & (long) (this.field2470 - 1))];
        arg0.field2488 = var4.field2488;
        arg0.field2489 = var4;
        arg0.field2488.field2489 = arg0;
        arg0.field2489.field2488 = arg0;
        arg0.field2490 = arg1;
    }

    @ObfuscatedName("gq.x()V")
    public void method3220() {
        for (int var1 = 0; var1 < this.field2470; var1++) {
            class196 var2 = this.field2467[var1];
            while (true) {
                class196 var3 = var2.field2489;
                if (var2 == var3) {
                    break;
                }
                var3.method3294();
            }
        }
        this.field2469 = null;
        this.field2468 = null;
    }

    @ObfuscatedName("gq.k()Lgd;")
    public class196 method3210() {
        this.field2471 = 0;
        return this.method3211();
    }

    @ObfuscatedName("gq.f()Lgd;")
    public class196 method3211() {
        if (this.field2471 > 0 && this.field2467[this.field2471 - 1] != this.field2468) {
            class196 var1 = this.field2468;
            this.field2468 = var1.field2489;
            return var1;
        }
        class196 var2;
        do {
            if (this.field2471 >= this.field2470) {
                return null;
            }
            var2 = this.field2467[this.field2471++].field2489;
        } while (this.field2467[this.field2471 - 1] == var2);
        this.field2468 = var2.field2489;
        return var2;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
