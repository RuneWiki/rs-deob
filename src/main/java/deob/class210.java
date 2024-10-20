package deob;

@ObfuscatedName("ht")
public class class210 implements class218 {

    @ObfuscatedName("ht.o")
    public class199[] field2517;

    @ObfuscatedName("ht.q")
    public class335 field2523 = new class335();

    @ObfuscatedName("ht.l")
    public int field2519;

    @ObfuscatedName("ht.k")
    public int field2520 = 0;

    @ObfuscatedName("ht.a")
    public double field2521 = 1.0D;

    @ObfuscatedName("ht.m")
    public int field2522 = 128;

    @ObfuscatedName("ht.p")
    public class316 field2518;

    public class210(class316 arg0, class316 arg1, int arg2, double arg3, int arg4) {
        this.field2518 = arg1;
        this.field2519 = arg2;
        this.field2520 = this.field2519;
        this.field2521 = arg3;
        this.field2522 = arg4;
        int[] var7 = arg0.method5252(0);
        int var8 = var7.length;
        this.field2517 = new class199[arg0.method5200(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class440 var10 = new class440(arg0.method5249(0, var7[var9]));
            this.field2517[var7[var9]] = new class199(var10);
        }
    }

    @ObfuscatedName("ht.o(I)I")
    public int method3916() {
        int var1 = 0;
        int var2 = 0;
        class199[] var3 = this.field2517;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class199 var5 = var3[var4];
            if (var5 != null && var5.field2334 != null) {
                var1 += var5.field2334.length;
                int[] var6 = var5.field2334;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2518.method5192(var8)) {
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

    @ObfuscatedName("ht.q(D)V")
    public void method3917(double arg0) {
        this.field2521 = arg0;
        this.method3922();
    }

    @ObfuscatedName("ht.l(II)[I")
    public int[] method3918(int arg0) {
        class199 var2 = this.field2517[arg0];
        if (var2 != null) {
            if (var2.field2340 != null) {
                this.field2523.method5414(var2);
                var2.field2328 = true;
                return var2.field2340;
            }
            boolean var3 = var2.method3590(this.field2521, this.field2522, this.field2518);
            if (var3) {
                if (this.field2520 == 0) {
                    class199 var4 = (class199) this.field2523.method5425();
                    var4.method3596();
                } else {
                    this.field2520--;
                }
                this.field2523.method5414(var2);
                var2.field2328 = true;
                return var2.field2340;
            }
        }
        return null;
    }

    @ObfuscatedName("ht.k(II)I")
    public int method3919(int arg0) {
        return this.field2517[arg0] == null ? 0 : this.field2517[arg0].field2332;
    }

    @ObfuscatedName("ht.a(IB)Z")
    public boolean method3920(int arg0) {
        return this.field2517[arg0].field2333;
    }

    @ObfuscatedName("ht.m(IB)Z")
    public boolean method3925(int arg0) {
        return this.field2522 == 64;
    }

    @ObfuscatedName("ht.p(I)V")
    public void method3922() {
        for (int var1 = 0; var1 < this.field2517.length; var1++) {
            if (this.field2517[var1] != null) {
                this.field2517[var1].method3596();
            }
        }
        this.field2523 = new class335();
        this.field2520 = this.field2519;
    }

    @ObfuscatedName("ht.s(II)V")
    public void method3923(int arg0) {
        for (int var2 = 0; var2 < this.field2517.length; var2++) {
            class199 var3 = this.field2517[var2];
            if (var3 != null && var3.field2338 != 0 && var3.field2328) {
                var3.method3591(arg0);
                var3.field2328 = false;
            }
        }
    }
}
