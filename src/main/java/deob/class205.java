package deob;

@ObfuscatedName("gp")
public final class class205 {

    @ObfuscatedName("gp.f")
    public int field2490;

    @ObfuscatedName("gp.l")
    public class207[] field2489;

    @ObfuscatedName("gp.w")
    public class207 field2491;

    @ObfuscatedName("gp.s")
    public class207 field2488;

    @ObfuscatedName("gp.e")
    public int field2492 = 0;

    public class205(int arg0) {
        this.field2490 = arg0;
        this.field2489 = new class207[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field2489[var2] = new class207();
            var3.field2495 = var3;
            var3.field2496 = var3;
        }
    }

    @ObfuscatedName("gp.f(J)Lgu;")
    public class207 method3774(long arg0) {
        class207 var3 = this.field2489[(int) (arg0 & (long) (this.field2490 - 1))];
        for (this.field2491 = var3.field2495; this.field2491 != var3; this.field2491 = this.field2491.field2495) {
            if (this.field2491.field2497 == arg0) {
                class207 var4 = this.field2491;
                this.field2491 = this.field2491.field2495;
                return var4;
            }
        }
        this.field2491 = null;
        return null;
    }

    @ObfuscatedName("gp.l(Lgu;J)V")
    public void method3773(class207 arg0, long arg1) {
        if (arg0.field2496 != null) {
            arg0.method3818();
        }
        class207 var4 = this.field2489[(int) (arg1 & (long) (this.field2490 - 1))];
        arg0.field2496 = var4.field2496;
        arg0.field2495 = var4;
        arg0.field2496.field2495 = arg0;
        arg0.field2495.field2496 = arg0;
        arg0.field2497 = arg1;
    }

    @ObfuscatedName("gp.w()V")
    public void method3775() {
        for (int var1 = 0; var1 < this.field2490; var1++) {
            class207 var2 = this.field2489[var1];
            while (true) {
                class207 var3 = var2.field2495;
                if (var2 == var3) {
                    break;
                }
                var3.method3818();
            }
        }
        this.field2491 = null;
        this.field2488 = null;
    }

    @ObfuscatedName("gp.s()Lgu;")
    public class207 method3781() {
        this.field2492 = 0;
        return this.method3777();
    }

    @ObfuscatedName("gp.e()Lgu;")
    public class207 method3777() {
        if (this.field2492 > 0 && this.field2489[this.field2492 - 1] != this.field2488) {
            class207 var1 = this.field2488;
            this.field2488 = var1.field2495;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2492 >= this.field2490) {
                return null;
            }
            var2 = this.field2489[this.field2492++].field2495;
        } while (this.field2489[this.field2492 - 1] == var2);
        this.field2488 = var2.field2495;
        return var2;
    }
}
