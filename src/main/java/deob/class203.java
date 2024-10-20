package deob;

@ObfuscatedName("gh")
public class class203 implements class211 {

    @ObfuscatedName("gh.v")
    public class193[] field2394;

    @ObfuscatedName("gh.n")
    public class294 field2390 = new class294();

    @ObfuscatedName("gh.f")
    public int field2389;

    @ObfuscatedName("gh.y")
    public int field2392 = 0;

    @ObfuscatedName("gh.p")
    public double field2395 = 1.0D;

    @ObfuscatedName("gh.j")
    public int field2391 = 128;

    @ObfuscatedName("gh.r")
    public class275 field2393;

    public class203(class275 arg0, class275 arg1, int arg2, double arg3, int arg4) {
        this.field2393 = arg1;
        this.field2389 = arg2;
        this.field2392 = this.field2389;
        this.field2395 = arg3;
        this.field2391 = arg4;
        int[] var7 = arg0.method4477(0);
        int var8 = var7.length;
        this.field2394 = new class193[arg0.method4478(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class383 var10 = new class383(arg0.method4468(0, var7[var9]));
            this.field2394[var7[var9]] = new class193(var10);
        }
    }

    @ObfuscatedName("gh.v(I)I")
    public int method3754() {
        int var1 = 0;
        int var2 = 0;
        class193[] var3 = this.field2394;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class193 var5 = var3[var4];
            if (var5 != null && var5.field2216 != null) {
                var1 += var5.field2216.length;
                int[] var6 = var5.field2216;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2393.method4510(var8)) {
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

    @ObfuscatedName("gh.n(D)V")
    public void method3755(double arg0) {
        this.field2395 = arg0;
        this.method3777();
    }

    @ObfuscatedName("gh.f(II)[I")
    public int[] method3756(int arg0) {
        class193 var2 = this.field2394[arg0];
        if (var2 != null) {
            if (var2.field2222 != null) {
                this.field2390.method4739(var2);
                var2.field2223 = true;
                return var2.field2222;
            }
            boolean var3 = var2.method3482(this.field2395, this.field2391, this.field2393);
            if (var3) {
                if (this.field2392 == 0) {
                    class193 var4 = (class193) this.field2390.method4713();
                    var4.method3487();
                } else {
                    this.field2392--;
                }
                this.field2390.method4739(var2);
                var2.field2223 = true;
                return var2.field2222;
            }
        }
        return null;
    }

    @ObfuscatedName("gh.y(II)I")
    public int method3757(int arg0) {
        return this.field2394[arg0] == null ? 0 : this.field2394[arg0].field2214;
    }

    @ObfuscatedName("gh.p(IB)Z")
    public boolean method3758(int arg0) {
        return this.field2394[arg0].field2221;
    }

    @ObfuscatedName("gh.j(II)Z")
    public boolean method3759(int arg0) {
        return this.field2391 == 64;
    }

    @ObfuscatedName("gh.r(S)V")
    public void method3777() {
        for (int var1 = 0; var1 < this.field2394.length; var1++) {
            if (this.field2394[var1] != null) {
                this.field2394[var1].method3487();
            }
        }
        this.field2390 = new class294();
        this.field2392 = this.field2389;
    }

    @ObfuscatedName("gh.b(II)V")
    public void method3761(int arg0) {
        for (int var2 = 0; var2 < this.field2394.length; var2++) {
            class193 var3 = this.field2394[var2];
            if (var3 != null && var3.field2220 != 0 && var3.field2223) {
                var3.method3483(arg0);
                var3.field2223 = false;
            }
        }
    }
}
