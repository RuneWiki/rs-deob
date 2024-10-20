package deob;

@ObfuscatedName("hp")
public class class218 implements class226 {

    @ObfuscatedName("hp.n")
    public class208[] field2468;

    @ObfuscatedName("hp.c")
    public class309 field2464 = new class309();

    @ObfuscatedName("hp.m")
    public int field2463;

    @ObfuscatedName("hp.k")
    public int field2469 = 0;

    @ObfuscatedName("hp.o")
    public double field2461 = 1.0D;

    @ObfuscatedName("hp.g")
    public int field2462 = 128;

    @ObfuscatedName("hp.z")
    public class290 field2467;

    public class218(class290 arg0, class290 arg1, int arg2, double arg3, int arg4) {
        this.field2467 = arg1;
        this.field2463 = arg2;
        this.field2469 = this.field2463;
        this.field2461 = arg3;
        this.field2462 = arg4;
        int[] var7 = arg0.method4719(0);
        int var8 = var7.length;
        this.field2468 = new class208[arg0.method4720(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class400 var10 = new class400(arg0.method4710(0, var7[var9]));
            this.field2468[var7[var9]] = new class208(var10);
        }
    }

    @ObfuscatedName("hp.n(B)I")
    public int method3988() {
        int var1 = 0;
        int var2 = 0;
        class208[] var3 = this.field2468;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class208 var5 = var3[var4];
            if (var5 != null && var5.field2292 != null) {
                var1 += var5.field2292.length;
                int[] var6 = var5.field2292;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2467.method4712(var8)) {
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

    @ObfuscatedName("hp.c(D)V")
    public void method3995(double arg0) {
        this.field2461 = arg0;
        this.method3994();
    }

    @ObfuscatedName("hp.m(II)[I")
    public int[] method3987(int arg0) {
        class208 var2 = this.field2468[arg0];
        if (var2 != null) {
            if (var2.field2293 != null) {
                this.field2464.method4968(var2);
                var2.field2294 = true;
                return var2.field2293;
            }
            boolean var3 = var2.method3685(this.field2461, this.field2462, this.field2467);
            if (var3) {
                if (this.field2469 == 0) {
                    class208 var4 = (class208) this.field2464.method4963();
                    var4.method3693();
                } else {
                    this.field2469--;
                }
                this.field2464.method4968(var2);
                var2.field2294 = true;
                return var2.field2293;
            }
        }
        return null;
    }

    @ObfuscatedName("hp.k(II)I")
    public int method3991(int arg0) {
        return this.field2468[arg0] == null ? 0 : this.field2468[arg0].field2285;
    }

    @ObfuscatedName("hp.o(II)Z")
    public boolean method4004(int arg0) {
        return this.field2468[arg0].field2286;
    }

    @ObfuscatedName("hp.g(II)Z")
    public boolean method3993(int arg0) {
        return this.field2462 == 64;
    }

    @ObfuscatedName("hp.z(B)V")
    public void method3994() {
        for (int var1 = 0; var1 < this.field2468.length; var1++) {
            if (this.field2468[var1] != null) {
                this.field2468[var1].method3693();
            }
        }
        this.field2464 = new class309();
        this.field2469 = this.field2463;
    }

    @ObfuscatedName("hp.a(IB)V")
    public void method4005(int arg0) {
        for (int var2 = 0; var2 < this.field2468.length; var2++) {
            class208 var3 = this.field2468[var2];
            if (var3 != null && var3.field2284 != 0 && var3.field2294) {
                var3.method3687(arg0);
                var3.field2294 = false;
            }
        }
    }
}
