package deob;

@ObfuscatedName("jk")
public class class237 implements class249 {

    @ObfuscatedName("jk.au")
    public class224[] field2671;

    @ObfuscatedName("jk.ae")
    public class378 field2672 = new class378();

    @ObfuscatedName("jk.ao")
    public int field2667;

    @ObfuscatedName("jk.at")
    public int field2668 = 0;

    @ObfuscatedName("jk.ac")
    public double field2670 = 1.0D;

    @ObfuscatedName("jk.ai")
    public int field2675 = 128;

    @ObfuscatedName("jk.az")
    public class359 field2669;

    public class237(class359 arg0, class359 arg1, int arg2, double arg3, int arg4) {
        this.field2669 = arg1;
        this.field2667 = arg2;
        this.field2668 = this.field2667;
        this.field2670 = arg3;
        this.field2675 = arg4;
        int[] var7 = arg0.method6137(0);
        if (var7 == null) {
            this.field2671 = new class224[0];
        } else {
            int var8 = var7.length;
            this.field2671 = new class224[arg0.method6173(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class515 var10 = new class515(arg0.method6128(0, var7[var9]));
                this.field2671[var7[var9]] = new class224(var10);
            }
        }
    }

    @ObfuscatedName("jk.au(B)I")
    public int method4401() {
        if (this.field2671.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class224[] var3 = this.field2671;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class224 var5 = var3[var4];
            if (var5 != null && var5.field2488 != null) {
                var1 += var5.field2488.length;
                int[] var6 = var5.field2488;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2669.method6131(var8)) {
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

    @ObfuscatedName("jk.ae(D)V")
    public void method4402(double arg0) {
        this.field2670 = arg0;
        this.method4413();
    }

    @ObfuscatedName("jk.ao(II)[I")
    public int[] method4407(int arg0) {
        class224 var2 = this.field2671[arg0];
        if (var2 != null) {
            if (var2.field2494 != null) {
                this.field2672.method6407(var2);
                var2.field2493 = true;
                return var2.field2494;
            }
            boolean var3 = var2.method4045(this.field2670, this.field2675, this.field2669);
            if (var3) {
                if (this.field2668 == 0) {
                    class224 var4 = (class224) this.field2672.method6392();
                    var4.method4036();
                } else {
                    this.field2668--;
                }
                this.field2672.method6407(var2);
                var2.field2493 = true;
                return var2.field2494;
            }
        }
        return null;
    }

    @ObfuscatedName("jk.at(II)I")
    public int method4404(int arg0) {
        return this.field2671[arg0] == null ? 0 : this.field2671[arg0].field2482;
    }

    @ObfuscatedName("jk.ac(IB)Z")
    public boolean method4405(int arg0) {
        return this.field2671[arg0].field2487;
    }

    @ObfuscatedName("jk.ai(II)Z")
    public boolean method4400(int arg0) {
        return this.field2675 == 64;
    }

    @ObfuscatedName("jk.az(I)V")
    public void method4413() {
        for (int var1 = 0; var1 < this.field2671.length; var1++) {
            if (this.field2671[var1] != null) {
                this.field2671[var1].method4036();
            }
        }
        this.field2672 = new class378();
        this.field2668 = this.field2667;
    }

    @ObfuscatedName("jk.ap(II)V")
    public void method4403(int arg0) {
        for (int var2 = 0; var2 < this.field2671.length; var2++) {
            class224 var3 = this.field2671[var2];
            if (var3 != null && var3.field2492 != 0 && var3.field2493) {
                var3.method4038(arg0);
                var3.field2493 = false;
            }
        }
    }
}
