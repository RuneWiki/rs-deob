package deob;

@ObfuscatedName("gp")
public final class class202 {

    @ObfuscatedName("gp.a")
    public int field2582;

    @ObfuscatedName("gp.w")
    public class204[] field2583;

    @ObfuscatedName("gp.e")
    public class204 field2584;

    @ObfuscatedName("gp.k")
    public class204 field2585;

    @ObfuscatedName("gp.u")
    public int field2586 = 0;

    public class202(int arg0) {
        this.field2582 = arg0;
        this.field2583 = new class204[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class204 var3 = this.field2583[var2] = new class204();
            var3.field2590 = var3;
            var3.field2591 = var3;
        }
    }

    @ObfuscatedName("gp.a(J)Lgn;")
    public class204 method3387(long arg0) {
        class204 var3 = this.field2583[(int) (arg0 & (long) (this.field2582 - 1))];
        for (this.field2584 = var3.field2590; this.field2584 != var3; this.field2584 = this.field2584.field2590) {
            if (this.field2584.field2589 == arg0) {
                class204 var4 = this.field2584;
                this.field2584 = this.field2584.field2590;
                return var4;
            }
        }
        this.field2584 = null;
        return null;
    }

    @ObfuscatedName("gp.w(Lgn;J)V")
    public void method3381(class204 arg0, long arg1) {
        if (arg0.field2591 != null) {
            arg0.method3427();
        }
        class204 var4 = this.field2583[(int) (arg1 & (long) (this.field2582 - 1))];
        arg0.field2591 = var4.field2591;
        arg0.field2590 = var4;
        arg0.field2591.field2590 = arg0;
        arg0.field2590.field2591 = arg0;
        arg0.field2589 = arg1;
    }

    @ObfuscatedName("gp.e()V")
    public void method3382() {
        for (int var1 = 0; var1 < this.field2582; var1++) {
            class204 var2 = this.field2583[var1];
            while (true) {
                class204 var3 = var2.field2590;
                if (var2 == var3) {
                    break;
                }
                var3.method3427();
            }
        }
        this.field2584 = null;
        this.field2585 = null;
    }

    @ObfuscatedName("gp.k()Lgn;")
    public class204 method3379() {
        this.field2586 = 0;
        return this.method3384();
    }

    @ObfuscatedName("gp.u()Lgn;")
    public class204 method3384() {
        if (this.field2586 > 0 && this.field2583[this.field2586 - 1] != this.field2585) {
            class204 var1 = this.field2585;
            this.field2585 = var1.field2590;
            return var1;
        }
        class204 var2;
        do {
            if (this.field2586 >= this.field2582) {
                return null;
            }
            var2 = this.field2583[this.field2586++].field2590;
        } while (this.field2583[this.field2586 - 1] == var2);
        this.field2585 = var2.field2590;
        return var2;
    }
}
