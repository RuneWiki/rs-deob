package deob;

@ObfuscatedName("gd")
public final class class191 {

    @ObfuscatedName("gd.i")
    public int field2473;

    @ObfuscatedName("gd.c")
    public class193[] field2474;

    @ObfuscatedName("gd.e")
    public class193 field2475;

    @ObfuscatedName("gd.v")
    public class193 field2476;

    @ObfuscatedName("gd.b")
    public int field2477 = 0;

    public class191(int arg0) {
        this.field2473 = arg0;
        this.field2474 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2474[var2] = new class193();
            var3.field2481 = var3;
            var3.field2482 = var3;
        }
    }

    @ObfuscatedName("gd.i(J)Lgz;")
    public class193 method3238(long arg0) {
        class193 var3 = this.field2474[(int) (arg0 & (long) (this.field2473 - 1))];
        for (this.field2475 = var3.field2481; this.field2475 != var3; this.field2475 = this.field2475.field2481) {
            if (this.field2475.field2480 == arg0) {
                class193 var4 = this.field2475;
                this.field2475 = this.field2475.field2481;
                return var4;
            }
        }
        this.field2475 = null;
        return null;
    }

    @ObfuscatedName("gd.c(Lgz;J)V")
    public void method3234(class193 arg0, long arg1) {
        if (arg0.field2482 != null) {
            arg0.method3278();
        }
        class193 var4 = this.field2474[(int) (arg1 & (long) (this.field2473 - 1))];
        arg0.field2482 = var4.field2482;
        arg0.field2481 = var4;
        arg0.field2482.field2481 = arg0;
        arg0.field2481.field2482 = arg0;
        arg0.field2480 = arg1;
    }

    @ObfuscatedName("gd.e()V")
    public void method3235() {
        for (int var1 = 0; var1 < this.field2473; var1++) {
            class193 var2 = this.field2474[var1];
            while (true) {
                class193 var3 = var2.field2481;
                if (var2 == var3) {
                    break;
                }
                var3.method3278();
            }
        }
        this.field2475 = null;
        this.field2476 = null;
    }

    @ObfuscatedName("gd.v()Lgz;")
    public class193 method3236() {
        this.field2477 = 0;
        return this.method3242();
    }

    @ObfuscatedName("gd.b()Lgz;")
    public class193 method3242() {
        if (this.field2477 > 0 && this.field2474[this.field2477 - 1] != this.field2476) {
            class193 var1 = this.field2476;
            this.field2476 = var1.field2481;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2477 >= this.field2473) {
                return null;
            }
            var2 = this.field2474[this.field2477++].field2481;
        } while (this.field2474[this.field2477 - 1] == var2);
        this.field2476 = var2.field2481;
        return var2;
    }
}
