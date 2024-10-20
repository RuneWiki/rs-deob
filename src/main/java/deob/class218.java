package deob;

@ObfuscatedName("hr")
public class class218 implements class226 {

    @ObfuscatedName("hr.i")
    public class208[] field2483;

    @ObfuscatedName("hr.w")
    public class309 field2477 = new class309();

    @ObfuscatedName("hr.s")
    public int field2478;

    @ObfuscatedName("hr.a")
    public int field2482 = 0;

    @ObfuscatedName("hr.o")
    public double field2480 = 1.0D;

    @ObfuscatedName("hr.g")
    public int field2481 = 128;

    @ObfuscatedName("hr.e")
    public class290 field2476;

    public class218(class290 arg0, class290 arg1, int arg2, double arg3, int arg4) {
        this.field2476 = arg1;
        this.field2478 = arg2;
        this.field2482 = this.field2478;
        this.field2480 = arg3;
        this.field2481 = arg4;
        int[] var7 = arg0.method4752(0);
        int var8 = var7.length;
        this.field2483 = new class208[arg0.method4768(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class401 var10 = new class401(arg0.method4743(0, var7[var9]));
            this.field2483[var7[var9]] = new class208(var10);
        }
    }

    @ObfuscatedName("hr.i(I)I")
    public int method4031() {
        int var1 = 0;
        int var2 = 0;
        class208[] var3 = this.field2483;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class208 var5 = var3[var4];
            if (var5 != null && var5.field2301 != null) {
                var1 += var5.field2301.length;
                int[] var6 = var5.field2301;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2476.method4793(var8)) {
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

    @ObfuscatedName("hr.w(D)V")
    public void method4032(double arg0) {
        this.field2480 = arg0;
        this.method4035();
    }

    @ObfuscatedName("hr.s(II)[I")
    public int[] method4034(int arg0) {
        class208 var2 = this.field2483[arg0];
        if (var2 != null) {
            if (var2.field2300 != null) {
                this.field2477.method4983(var2);
                var2.field2296 = true;
                return var2.field2300;
            }
            boolean var3 = var2.method3740(this.field2480, this.field2481, this.field2476);
            if (var3) {
                if (this.field2482 == 0) {
                    class208 var4 = (class208) this.field2477.method4984();
                    var4.method3738();
                } else {
                    this.field2482--;
                }
                this.field2477.method4983(var2);
                var2.field2296 = true;
                return var2.field2300;
            }
        }
        return null;
    }

    @ObfuscatedName("hr.a(II)I")
    public int method4033(int arg0) {
        return this.field2483[arg0] == null ? 0 : this.field2483[arg0].field2299;
    }

    @ObfuscatedName("hr.o(II)Z")
    public boolean method4045(int arg0) {
        return this.field2483[arg0].field2298;
    }

    @ObfuscatedName("hr.g(IB)Z")
    public boolean method4030(int arg0) {
        return this.field2481 == 64;
    }

    @ObfuscatedName("hr.e(I)V")
    public void method4035() {
        for (int var1 = 0; var1 < this.field2483.length; var1++) {
            if (this.field2483[var1] != null) {
                this.field2483[var1].method3738();
            }
        }
        this.field2477 = new class309();
        this.field2482 = this.field2478;
    }

    @ObfuscatedName("hr.p(II)V")
    public void method4037(int arg0) {
        for (int var2 = 0; var2 < this.field2483.length; var2++) {
            class208 var3 = this.field2483[var2];
            if (var3 != null && var3.field2295 != 0 && var3.field2296) {
                var3.method3741(arg0);
                var3.field2296 = false;
            }
        }
    }
}
