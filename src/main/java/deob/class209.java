package deob;

@ObfuscatedName("hl")
public class class209 implements class217 {

    @ObfuscatedName("hl.s")
    public class198[] field2481;

    @ObfuscatedName("hl.h")
    public class335 field2486 = new class335();

    @ObfuscatedName("hl.w")
    public int field2480;

    @ObfuscatedName("hl.v")
    public int field2482 = 0;

    @ObfuscatedName("hl.c")
    public double field2483 = 1.0D;

    @ObfuscatedName("hl.q")
    public int field2484 = 128;

    @ObfuscatedName("hl.i")
    public class316 field2485;

    public class209(class316 arg0, class316 arg1, int arg2, double arg3, int arg4) {
        this.field2485 = arg1;
        this.field2480 = arg2;
        this.field2482 = this.field2480;
        this.field2483 = arg3;
        this.field2484 = arg4;
        int[] var7 = arg0.method5245(0);
        int var8 = var7.length;
        this.field2481 = new class198[arg0.method5184(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class444 var10 = new class444(arg0.method5179(0, var7[var9]));
            this.field2481[var7[var9]] = new class198(var10);
        }
    }

    @ObfuscatedName("hl.s(I)I")
    public int method3893() {
        int var1 = 0;
        int var2 = 0;
        class198[] var3 = this.field2481;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class198 var5 = var3[var4];
            if (var5 != null && var5.field2290 != null) {
                var1 += var5.field2290.length;
                int[] var6 = var5.field2290;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2485.method5182(var8)) {
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

    @ObfuscatedName("hl.h(D)V")
    public void method3915(double arg0) {
        this.field2483 = arg0;
        this.method3902();
    }

    @ObfuscatedName("hl.w(II)[I")
    public int[] method3922(int arg0) {
        class198 var2 = this.field2481[arg0];
        if (var2 != null) {
            if (var2.field2298 != null) {
                this.field2486.method5427(var2);
                var2.field2291 = true;
                return var2.field2298;
            }
            boolean var3 = var2.method3580(this.field2483, this.field2484, this.field2485);
            if (var3) {
                if (this.field2482 == 0) {
                    class198 var4 = (class198) this.field2486.method5430();
                    var4.method3584();
                } else {
                    this.field2482--;
                }
                this.field2486.method5427(var2);
                var2.field2291 = true;
                return var2.field2298;
            }
        }
        return null;
    }

    @ObfuscatedName("hl.v(II)I")
    public int method3896(int arg0) {
        return this.field2481[arg0] == null ? 0 : this.field2481[arg0].field2297;
    }

    @ObfuscatedName("hl.c(IB)Z")
    public boolean method3895(int arg0) {
        return this.field2481[arg0].field2289;
    }

    @ObfuscatedName("hl.q(II)Z")
    public boolean method3898(int arg0) {
        return this.field2484 == 64;
    }

    @ObfuscatedName("hl.i(B)V")
    public void method3902() {
        for (int var1 = 0; var1 < this.field2481.length; var1++) {
            if (this.field2481[var1] != null) {
                this.field2481[var1].method3584();
            }
        }
        this.field2486 = new class335();
        this.field2482 = this.field2480;
    }

    @ObfuscatedName("hl.k(II)V")
    public void method3900(int arg0) {
        for (int var2 = 0; var2 < this.field2481.length; var2++) {
            class198 var3 = this.field2481[var2];
            if (var3 != null && var3.field2288 != 0 && var3.field2291) {
                var3.method3583(arg0);
                var3.field2291 = false;
            }
        }
    }
}
