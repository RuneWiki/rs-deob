package deob;

@ObfuscatedName("hb")
public class class218 implements class226 {

    @ObfuscatedName("hb.l")
    public class208[] field2476;

    @ObfuscatedName("hb.q")
    public class309 field2478 = new class309();

    @ObfuscatedName("hb.f")
    public int field2477;

    @ObfuscatedName("hb.j")
    public int field2480 = 0;

    @ObfuscatedName("hb.m")
    public double field2479 = 1.0D;

    @ObfuscatedName("hb.k")
    public int field2475 = 128;

    @ObfuscatedName("hb.t")
    public class290 field2481;

    public class218(class290 arg0, class290 arg1, int arg2, double arg3, int arg4) {
        this.field2481 = arg1;
        this.field2477 = arg2;
        this.field2480 = this.field2477;
        this.field2479 = arg3;
        this.field2475 = arg4;
        int[] var7 = arg0.method4765(0);
        int var8 = var7.length;
        this.field2476 = new class208[arg0.method4774(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class401 var10 = new class401(arg0.method4756(0, var7[var9]));
            this.field2476[var7[var9]] = new class208(var10);
        }
    }

    @ObfuscatedName("hb.l(I)I")
    public int method4030() {
        int var1 = 0;
        int var2 = 0;
        class208[] var3 = this.field2476;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class208 var5 = var3[var4];
            if (var5 != null && var5.field2297 != null) {
                var1 += var5.field2297.length;
                int[] var6 = var5.field2297;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2481.method4759(var8)) {
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

    @ObfuscatedName("hb.q(D)V")
    public void method4031(double arg0) {
        this.field2479 = arg0;
        this.method4036();
    }

    @ObfuscatedName("hb.f(II)[I")
    public int[] method4051(int arg0) {
        class208 var2 = this.field2476[arg0];
        if (var2 != null) {
            if (var2.field2300 != null) {
                this.field2478.method5037(var2);
                var2.field2295 = true;
                return var2.field2300;
            }
            boolean var3 = var2.method3734(this.field2479, this.field2475, this.field2481);
            if (var3) {
                if (this.field2480 == 0) {
                    class208 var4 = (class208) this.field2478.method5019();
                    var4.method3737();
                } else {
                    this.field2480--;
                }
                this.field2478.method5037(var2);
                var2.field2295 = true;
                return var2.field2300;
            }
        }
        return null;
    }

    @ObfuscatedName("hb.j(IB)I")
    public int method4043(int arg0) {
        return this.field2476[arg0] == null ? 0 : this.field2476[arg0].field2301;
    }

    @ObfuscatedName("hb.m(II)Z")
    public boolean method4034(int arg0) {
        return this.field2476[arg0].field2296;
    }

    @ObfuscatedName("hb.k(II)Z")
    public boolean method4035(int arg0) {
        return this.field2475 == 64;
    }

    @ObfuscatedName("hb.t(B)V")
    public void method4036() {
        for (int var1 = 0; var1 < this.field2476.length; var1++) {
            if (this.field2476[var1] != null) {
                this.field2476[var1].method3737();
            }
        }
        this.field2478 = new class309();
        this.field2480 = this.field2477;
    }

    @ObfuscatedName("hb.a(II)V")
    public void method4037(int arg0) {
        for (int var2 = 0; var2 < this.field2476.length; var2++) {
            class208 var3 = this.field2476[var2];
            if (var3 != null && var3.field2291 != 0 && var3.field2295) {
                var3.method3736(arg0);
                var3.field2295 = false;
            }
        }
    }
}
