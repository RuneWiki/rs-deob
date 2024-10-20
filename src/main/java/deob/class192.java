package deob;

@ObfuscatedName("gg")
public final class class192 {

    @ObfuscatedName("gg.i")
    public int field2468;

    @ObfuscatedName("gg.j")
    public class194[] field2467;

    @ObfuscatedName("gg.a")
    public class194 field2470;

    @ObfuscatedName("gg.r")
    public class194 field2469;

    @ObfuscatedName("gg.o")
    public int field2466 = 0;

    public class192(int arg0) {
        this.field2468 = arg0;
        this.field2467 = new class194[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class194 var3 = this.field2467[var2] = new class194();
            var3.field2474 = var3;
            var3.field2473 = var3;
        }
    }

    @ObfuscatedName("gg.i(J)Lgs;")
    public class194 method3358(long arg0) {
        class194 var3 = this.field2467[(int) (arg0 & (long) (this.field2468 - 1))];
        for (this.field2470 = var3.field2474; this.field2470 != var3; this.field2470 = this.field2470.field2474) {
            if (this.field2470.field2475 == arg0) {
                class194 var4 = this.field2470;
                this.field2470 = this.field2470.field2474;
                return var4;
            }
        }
        this.field2470 = null;
        return null;
    }

    @ObfuscatedName("gg.j(Lgs;J)V")
    public void method3359(class194 arg0, long arg1) {
        if (arg0.field2473 != null) {
            arg0.method3397();
        }
        class194 var4 = this.field2467[(int) (arg1 & (long) (this.field2468 - 1))];
        arg0.field2473 = var4.field2473;
        arg0.field2474 = var4;
        arg0.field2473.field2474 = arg0;
        arg0.field2474.field2473 = arg0;
        arg0.field2475 = arg1;
    }

    @ObfuscatedName("gg.a()V")
    public void method3360() {
        for (int var1 = 0; var1 < this.field2468; var1++) {
            class194 var2 = this.field2467[var1];
            while (true) {
                class194 var3 = var2.field2474;
                if (var2 == var3) {
                    break;
                }
                var3.method3397();
            }
        }
        this.field2470 = null;
        this.field2469 = null;
    }

    @ObfuscatedName("gg.r()Lgs;")
    public class194 method3365() {
        this.field2466 = 0;
        return this.method3362();
    }

    @ObfuscatedName("gg.o()Lgs;")
    public class194 method3362() {
        if (this.field2466 > 0 && this.field2467[this.field2466 - 1] != this.field2469) {
            class194 var1 = this.field2469;
            this.field2469 = var1.field2474;
            return var1;
        }
        class194 var2;
        do {
            if (this.field2466 >= this.field2468) {
                return null;
            }
            var2 = this.field2467[this.field2466++].field2474;
        } while (this.field2467[this.field2466 - 1] == var2);
        this.field2469 = var2.field2474;
        return var2;
    }
}
