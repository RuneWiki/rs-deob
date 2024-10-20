package deob;

@ObfuscatedName("gs")
public final class class191 {

    @ObfuscatedName("gs.i")
    public int field2470;

    @ObfuscatedName("gs.w")
    public class193[] field2466;

    @ObfuscatedName("gs.a")
    public class193 field2468;

    @ObfuscatedName("gs.t")
    public class193 field2469;

    @ObfuscatedName("gs.s")
    public int field2467 = 0;

    public class191(int arg0) {
        this.field2470 = arg0;
        this.field2466 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2466[var2] = new class193();
            var3.field2474 = var3;
            var3.field2475 = var3;
        }
    }

    @ObfuscatedName("gs.i(J)Lgm;")
    public class193 method3249(long arg0) {
        class193 var3 = this.field2466[(int) (arg0 & (long) (this.field2470 - 1))];
        for (this.field2468 = var3.field2474; this.field2468 != var3; this.field2468 = this.field2468.field2474) {
            if (this.field2468.field2473 == arg0) {
                class193 var4 = this.field2468;
                this.field2468 = this.field2468.field2474;
                return var4;
            }
        }
        this.field2468 = null;
        return null;
    }

    @ObfuscatedName("gs.w(Lgm;J)V")
    public void method3248(class193 arg0, long arg1) {
        if (arg0.field2475 != null) {
            arg0.method3290();
        }
        class193 var4 = this.field2466[(int) (arg1 & (long) (this.field2470 - 1))];
        arg0.field2475 = var4.field2475;
        arg0.field2474 = var4;
        arg0.field2475.field2474 = arg0;
        arg0.field2474.field2475 = arg0;
        arg0.field2473 = arg1;
    }

    @ObfuscatedName("gs.a()V")
    public void method3251() {
        for (int var1 = 0; var1 < this.field2470; var1++) {
            class193 var2 = this.field2466[var1];
            while (true) {
                class193 var3 = var2.field2474;
                if (var2 == var3) {
                    break;
                }
                var3.method3290();
            }
        }
        this.field2468 = null;
        this.field2469 = null;
    }

    @ObfuscatedName("gs.t()Lgm;")
    public class193 method3252() {
        this.field2467 = 0;
        return this.method3257();
    }

    @ObfuscatedName("gs.s()Lgm;")
    public class193 method3257() {
        if (this.field2467 > 0 && this.field2466[this.field2467 - 1] != this.field2469) {
            class193 var1 = this.field2469;
            this.field2469 = var1.field2474;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2467 >= this.field2470) {
                return null;
            }
            var2 = this.field2466[this.field2467++].field2474;
        } while (this.field2466[this.field2467 - 1] == var2);
        this.field2469 = var2.field2474;
        return var2;
    }
}
