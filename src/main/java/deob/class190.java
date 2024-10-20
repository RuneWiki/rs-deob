package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public final class class190 implements Iterable {

    @ObfuscatedName("gm.s")
    public int field2466;

    @ObfuscatedName("gm.c")
    public class196[] field2465;

    @ObfuscatedName("gm.f")
    public class196 field2467;

    @ObfuscatedName("gm.m")
    public class196 field2468;

    @ObfuscatedName("gm.h")
    public int field2469 = 0;

    public class190(int arg0) {
        this.field2466 = arg0;
        this.field2465 = new class196[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class196 var3 = this.field2465[var2] = new class196();
            var3.field2486 = var3;
            var3.field2488 = var3;
        }
    }

    @ObfuscatedName("gm.s(J)Lgr;")
    public class196 method3283(long arg0) {
        class196 var3 = this.field2465[(int) (arg0 & (long) (this.field2466 - 1))];
        for (this.field2467 = var3.field2486; this.field2467 != var3; this.field2467 = this.field2467.field2486) {
            if (this.field2467.field2487 == arg0) {
                class196 var4 = this.field2467;
                this.field2467 = this.field2467.field2486;
                return var4;
            }
        }
        this.field2467 = null;
        return null;
    }

    @ObfuscatedName("gm.c(Lgr;J)V")
    public void method3291(class196 arg0, long arg1) {
        if (arg0.field2488 != null) {
            arg0.method3372();
        }
        class196 var4 = this.field2465[(int) (arg1 & (long) (this.field2466 - 1))];
        arg0.field2488 = var4.field2488;
        arg0.field2486 = var4;
        arg0.field2488.field2486 = arg0;
        arg0.field2486.field2488 = arg0;
        arg0.field2487 = arg1;
    }

    @ObfuscatedName("gm.f()V")
    public void method3285() {
        for (int var1 = 0; var1 < this.field2466; var1++) {
            class196 var2 = this.field2465[var1];
            while (true) {
                class196 var3 = var2.field2486;
                if (var2 == var3) {
                    break;
                }
                var3.method3372();
            }
        }
        this.field2467 = null;
        this.field2468 = null;
    }

    @ObfuscatedName("gm.m()Lgr;")
    public class196 method3286() {
        this.field2469 = 0;
        return this.method3284();
    }

    @ObfuscatedName("gm.h()Lgr;")
    public class196 method3284() {
        if (this.field2469 > 0 && this.field2465[this.field2469 - 1] != this.field2468) {
            class196 var1 = this.field2468;
            this.field2468 = var1.field2486;
            return var1;
        }
        class196 var2;
        do {
            if (this.field2469 >= this.field2466) {
                return null;
            }
            var2 = this.field2465[this.field2469++].field2486;
        } while (this.field2465[this.field2469 - 1] == var2);
        this.field2468 = var2.field2486;
        return var2;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
