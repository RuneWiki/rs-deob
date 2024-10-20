package deob;

@ObfuscatedName("hk")
public class class209 implements class217 {

    @ObfuscatedName("hk.c")
    public class198[] field2477;

    @ObfuscatedName("hk.v")
    public class334 field2476 = new class334();

    @ObfuscatedName("hk.q")
    public int field2479;

    @ObfuscatedName("hk.f")
    public int field2483 = 0;

    @ObfuscatedName("hk.j")
    public double field2478 = 1.0D;

    @ObfuscatedName("hk.e")
    public int field2480 = 128;

    @ObfuscatedName("hk.g")
    public class315 field2481;

    public class209(class315 arg0, class315 arg1, int arg2, double arg3, int arg4) {
        this.field2481 = arg1;
        this.field2479 = arg2;
        this.field2483 = this.field2479;
        this.field2478 = arg3;
        this.field2480 = arg4;
        int[] var7 = arg0.method5309(0);
        int var8 = var7.length;
        this.field2477 = new class198[arg0.method5313(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class443 var10 = new class443(arg0.method5305(0, var7[var9]));
            this.field2477[var7[var9]] = new class198(var10);
        }
    }

    @ObfuscatedName("hk.c(B)I")
    public int method4022() {
        int var1 = 0;
        int var2 = 0;
        class198[] var3 = this.field2477;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class198 var5 = var3[var4];
            if (var5 != null && var5.field2295 != null) {
                var1 += var5.field2295.length;
                int[] var6 = var5.field2295;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2481.method5303(var8)) {
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

    @ObfuscatedName("hk.v(D)V")
    public void method4023(double arg0) {
        this.field2478 = arg0;
        this.method4027();
    }

    @ObfuscatedName("hk.q(IB)[I")
    public int[] method4043(int arg0) {
        class198 var2 = this.field2477[arg0];
        if (var2 != null) {
            if (var2.field2301 != null) {
                this.field2476.method5531(var2);
                var2.field2298 = true;
                return var2.field2301;
            }
            boolean var3 = var2.method3676(this.field2478, this.field2480, this.field2481);
            if (var3) {
                if (this.field2483 == 0) {
                    class198 var4 = (class198) this.field2476.method5534();
                    var4.method3675();
                } else {
                    this.field2483--;
                }
                this.field2476.method5531(var2);
                var2.field2298 = true;
                return var2.field2301;
            }
        }
        return null;
    }

    @ObfuscatedName("hk.f(IS)I")
    public int method4038(int arg0) {
        return this.field2477[arg0] == null ? 0 : this.field2477[arg0].field2293;
    }

    @ObfuscatedName("hk.j(IB)Z")
    public boolean method4024(int arg0) {
        return this.field2477[arg0].field2294;
    }

    @ObfuscatedName("hk.e(II)Z")
    public boolean method4039(int arg0) {
        return this.field2480 == 64;
    }

    @ObfuscatedName("hk.g(I)V")
    public void method4027() {
        for (int var1 = 0; var1 < this.field2477.length; var1++) {
            if (this.field2477[var1] != null) {
                this.field2477[var1].method3675();
            }
        }
        this.field2476 = new class334();
        this.field2483 = this.field2479;
    }

    @ObfuscatedName("hk.w(II)V")
    public void method4028(int arg0) {
        for (int var2 = 0; var2 < this.field2477.length; var2++) {
            class198 var3 = this.field2477[var2];
            if (var3 != null && var3.field2299 != 0 && var3.field2298) {
                var3.method3678(arg0);
                var3.field2298 = false;
            }
        }
    }
}
