package deob;

@ObfuscatedName("gv")
public final class class191 {

    @ObfuscatedName("gv.i")
    public int field2462;

    @ObfuscatedName("gv.h")
    public class193[] field2460;

    @ObfuscatedName("gv.u")
    public class193 field2459;

    @ObfuscatedName("gv.q")
    public class193 field2461;

    @ObfuscatedName("gv.g")
    public int field2463 = 0;

    public class191(int arg0) {
        this.field2462 = arg0;
        this.field2460 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2460[var2] = new class193();
            var3.field2468 = var3;
            var3.field2466 = var3;
        }
    }

    @ObfuscatedName("gv.i(J)Lgn;")
    public class193 method3331(long arg0) {
        class193 var3 = this.field2460[(int) (arg0 & (long) (this.field2462 - 1))];
        for (this.field2459 = var3.field2468; this.field2459 != var3; this.field2459 = this.field2459.field2468) {
            if (this.field2459.field2467 == arg0) {
                class193 var4 = this.field2459;
                this.field2459 = this.field2459.field2468;
                return var4;
            }
        }
        this.field2459 = null;
        return null;
    }

    @ObfuscatedName("gv.h(Lgn;J)V")
    public void method3333(class193 arg0, long arg1) {
        if (arg0.field2466 != null) {
            arg0.method3364();
        }
        class193 var4 = this.field2460[(int) (arg1 & (long) (this.field2462 - 1))];
        arg0.field2466 = var4.field2466;
        arg0.field2468 = var4;
        arg0.field2466.field2468 = arg0;
        arg0.field2468.field2466 = arg0;
        arg0.field2467 = arg1;
    }

    @ObfuscatedName("gv.u()V")
    public void method3321() {
        for (int var1 = 0; var1 < this.field2462; var1++) {
            class193 var2 = this.field2460[var1];
            while (true) {
                class193 var3 = var2.field2468;
                if (var2 == var3) {
                    break;
                }
                var3.method3364();
            }
        }
        this.field2459 = null;
        this.field2461 = null;
    }

    @ObfuscatedName("gv.q()Lgn;")
    public class193 method3322() {
        this.field2463 = 0;
        return this.method3323();
    }

    @ObfuscatedName("gv.g()Lgn;")
    public class193 method3323() {
        if (this.field2463 > 0 && this.field2460[this.field2463 - 1] != this.field2461) {
            class193 var1 = this.field2461;
            this.field2461 = var1.field2468;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2463 >= this.field2462) {
                return null;
            }
            var2 = this.field2460[this.field2463++].field2468;
        } while (this.field2460[this.field2463 - 1] == var2);
        this.field2461 = var2.field2468;
        return var2;
    }
}
