package deob;

@ObfuscatedName("gm")
public class class205 implements class213 {

    @ObfuscatedName("gm.s")
    public class195[] field2378;

    @ObfuscatedName("gm.t")
    public class296 field2376 = new class296();

    @ObfuscatedName("gm.v")
    public int field2375;

    @ObfuscatedName("gm.j")
    public int field2377 = 0;

    @ObfuscatedName("gm.l")
    public double field2379 = 1.0D;

    @ObfuscatedName("gm.n")
    public int field2380 = 128;

    @ObfuscatedName("gm.w")
    public class277 field2381;

    public class205(class277 arg0, class277 arg1, int arg2, double arg3, int arg4) {
        this.field2381 = arg1;
        this.field2375 = arg2;
        this.field2377 = this.field2375;
        this.field2379 = arg3;
        this.field2380 = arg4;
        int[] var7 = arg0.method4521(0);
        int var8 = var7.length;
        this.field2378 = new class195[arg0.method4484(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class385 var10 = new class385(arg0.method4459(0, var7[var9]));
            this.field2378[var7[var9]] = new class195(var10);
        }
    }

    @ObfuscatedName("gm.s(I)I")
    public int method3739() {
        int var1 = 0;
        int var2 = 0;
        class195[] var3 = this.field2378;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class195 var5 = var3[var4];
            if (var5 != null && var5.field2206 != null) {
                var1 += var5.field2206.length;
                int[] var6 = var5.field2206;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2381.method4485(var8)) {
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

    @ObfuscatedName("gm.t(D)V")
    public void method3749(double arg0) {
        this.field2379 = arg0;
        this.method3744();
    }

    @ObfuscatedName("gm.v(II)[I")
    public int[] method3741(int arg0) {
        class195 var2 = this.field2378[arg0];
        if (var2 != null) {
            if (var2.field2207 != null) {
                this.field2376.method4707(var2);
                var2.field2210 = true;
                return var2.field2207;
            }
            boolean var3 = var2.method3452(this.field2379, this.field2380, this.field2381);
            if (var3) {
                if (this.field2377 == 0) {
                    class195 var4 = (class195) this.field2376.method4709();
                    var4.method3443();
                } else {
                    this.field2377--;
                }
                this.field2376.method4707(var2);
                var2.field2210 = true;
                return var2.field2207;
            }
        }
        return null;
    }

    @ObfuscatedName("gm.j(II)I")
    public int method3742(int arg0) {
        return this.field2378[arg0] == null ? 0 : this.field2378[arg0].field2201;
    }

    @ObfuscatedName("gm.l(II)Z")
    public boolean method3743(int arg0) {
        return this.field2378[arg0].field2202;
    }

    @ObfuscatedName("gm.n(II)Z")
    public boolean method3740(int arg0) {
        return this.field2380 == 64;
    }

    @ObfuscatedName("gm.w(B)V")
    public void method3744() {
        for (int var1 = 0; var1 < this.field2378.length; var1++) {
            if (this.field2378[var1] != null) {
                this.field2378[var1].method3443();
            }
        }
        this.field2376 = new class296();
        this.field2377 = this.field2375;
    }

    @ObfuscatedName("gm.f(II)V")
    public void method3745(int arg0) {
        for (int var2 = 0; var2 < this.field2378.length; var2++) {
            class195 var3 = this.field2378[var2];
            if (var3 != null && var3.field2197 != 0 && var3.field2210) {
                var3.method3444(arg0);
                var3.field2210 = false;
            }
        }
    }
}
