package deob;

@ObfuscatedName("he")
public class class210 implements class218 {

    @ObfuscatedName("he.c")
    public class199[] field2511;

    @ObfuscatedName("he.p")
    public class336 field2510 = new class336();

    @ObfuscatedName("he.f")
    public int field2509;

    @ObfuscatedName("he.n")
    public int field2508 = 0;

    @ObfuscatedName("he.k")
    public double field2507 = 1.0D;

    @ObfuscatedName("he.w")
    public int field2512 = 128;

    @ObfuscatedName("he.s")
    public class317 field2513;

    public class210(class317 arg0, class317 arg1, int arg2, double arg3, int arg4) {
        this.field2513 = arg1;
        this.field2509 = arg2;
        this.field2508 = this.field2509;
        this.field2507 = arg3;
        this.field2512 = arg4;
        int[] var7 = arg0.method5424(0);
        int var8 = var7.length;
        this.field2511 = new class199[arg0.method5425(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class445 var10 = new class445(arg0.method5499(0, var7[var9]));
            this.field2511[var7[var9]] = new class199(var10);
        }
    }

    @ObfuscatedName("he.c(I)I")
    public int method4101() {
        int var1 = 0;
        int var2 = 0;
        class199[] var3 = this.field2511;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class199 var5 = var3[var4];
            if (var5 != null && var5.field2322 != null) {
                var1 += var5.field2322.length;
                int[] var6 = var5.field2322;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2513.method5417(var8)) {
                        var2++;
                    }
                }
            }
        }
        if (var1 == 0) {
            return 0;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("he.p(D)V")
    public void method4102(double arg0) {
        this.field2507 = arg0;
        this.method4111();
    }

    @ObfuscatedName("he.f(II)[I")
    public int[] method4103(int arg0) {
        class199 var2 = this.field2511[arg0];
        if (var2 != null) {
            if (var2.field2331 != null) {
                this.field2510.method5640(var2);
                var2.field2329 = true;
                return var2.field2331;
            }
            boolean var3 = var2.method3749(this.field2507, this.field2512, this.field2513);
            if (var3) {
                if (this.field2508 == 0) {
                    class199 var4 = (class199) this.field2510.method5664();
                    var4.method3750();
                } else {
                    this.field2508--;
                }
                this.field2510.method5640(var2);
                var2.field2329 = true;
                return var2.field2331;
            }
        }
        return null;
    }

    @ObfuscatedName("he.n(IB)I")
    public int method4113(int arg0) {
        return this.field2511[arg0] == null ? 0 : this.field2511[arg0].field2323;
    }

    @ObfuscatedName("he.k(IB)Z")
    public boolean method4105(int arg0) {
        return this.field2511[arg0].field2324;
    }

    @ObfuscatedName("he.w(II)Z")
    public boolean method4104(int arg0) {
        return this.field2512 == 64;
    }

    @ObfuscatedName("he.s(I)V")
    public void method4111() {
        for (int var1 = 0; var1 < this.field2511.length; var1++) {
            if (this.field2511[var1] != null) {
                this.field2511[var1].method3750();
            }
        }
        this.field2510 = new class336();
        this.field2508 = this.field2509;
    }

    @ObfuscatedName("he.q(IB)V")
    public void method4108(int arg0) {
        for (int var2 = 0; var2 < this.field2511.length; var2++) {
            class199 var3 = this.field2511[var2];
            if (var3 != null && var3.field2327 != 0 && var3.field2329) {
                var3.method3752(arg0);
                var3.field2329 = false;
            }
        }
    }
}
