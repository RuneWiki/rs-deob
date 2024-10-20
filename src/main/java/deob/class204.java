package deob;

@ObfuscatedName("gj")
public class class204 implements class212 {

    @ObfuscatedName("gj.f")
    public class194[] field2392;

    @ObfuscatedName("gj.e")
    public class295 field2395 = new class295();

    @ObfuscatedName("gj.v")
    public int field2391;

    @ObfuscatedName("gj.y")
    public int field2390 = 0;

    @ObfuscatedName("gj.j")
    public double field2393 = 1.0D;

    @ObfuscatedName("gj.o")
    public int field2394 = 128;

    @ObfuscatedName("gj.m")
    public class276 field2389;

    public class204(class276 arg0, class276 arg1, int arg2, double arg3, int arg4) {
        this.field2389 = arg1;
        this.field2391 = arg2;
        this.field2390 = this.field2391;
        this.field2393 = arg3;
        this.field2394 = arg4;
        int[] var7 = arg0.method4513(0);
        int var8 = var7.length;
        this.field2392 = new class194[arg0.method4514(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class384 var10 = new class384(arg0.method4504(0, var7[var9]));
            this.field2392[var7[var9]] = new class194(var10);
        }
    }

    @ObfuscatedName("gj.f(I)I")
    public int method3801() {
        int var1 = 0;
        int var2 = 0;
        class194[] var3 = this.field2392;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class194 var5 = var3[var4];
            if (var5 != null && var5.field2216 != null) {
                var1 += var5.field2216.length;
                int[] var6 = var5.field2216;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2389.method4507(var8)) {
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

    @ObfuscatedName("gj.e(D)V")
    public void method3802(double arg0) {
        this.field2393 = arg0;
        this.method3807();
    }

    @ObfuscatedName("gj.v(IB)[I")
    public int[] method3803(int arg0) {
        class194 var2 = this.field2392[arg0];
        if (var2 != null) {
            if (var2.field2211 != null) {
                this.field2395.method4748(var2);
                var2.field2223 = true;
                return var2.field2211;
            }
            boolean var3 = var2.method3486(this.field2393, this.field2394, this.field2389);
            if (var3) {
                if (this.field2390 == 0) {
                    class194 var4 = (class194) this.field2395.method4720();
                    var4.method3481();
                } else {
                    this.field2390--;
                }
                this.field2395.method4748(var2);
                var2.field2223 = true;
                return var2.field2211;
            }
        }
        return null;
    }

    @ObfuscatedName("gj.y(II)I")
    public int method3804(int arg0) {
        return this.field2392[arg0] == null ? 0 : this.field2392[arg0].field2214;
    }

    @ObfuscatedName("gj.j(II)Z")
    public boolean method3805(int arg0) {
        return this.field2392[arg0].field2215;
    }

    @ObfuscatedName("gj.o(II)Z")
    public boolean method3806(int arg0) {
        return this.field2394 == 64;
    }

    @ObfuscatedName("gj.m(S)V")
    public void method3807() {
        for (int var1 = 0; var1 < this.field2392.length; var1++) {
            if (this.field2392[var1] != null) {
                this.field2392[var1].method3481();
            }
        }
        this.field2395 = new class295();
        this.field2390 = this.field2391;
    }

    @ObfuscatedName("gj.r(II)V")
    public void method3808(int arg0) {
        for (int var2 = 0; var2 < this.field2392.length; var2++) {
            class194 var3 = this.field2392[var2];
            if (var3 != null && var3.field2220 != 0 && var3.field2223) {
                var3.method3483(arg0);
                var3.field2223 = false;
            }
        }
    }
}
