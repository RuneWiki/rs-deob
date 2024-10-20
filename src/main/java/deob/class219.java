package deob;

@ObfuscatedName("hg")
public class class219 implements class227 {

    @ObfuscatedName("hg.a")
    public class208[] field2561;

    @ObfuscatedName("hg.f")
    public class349 field2560 = new class349();

    @ObfuscatedName("hg.c")
    public int field2559;

    @ObfuscatedName("hg.x")
    public int field2565 = 0;

    @ObfuscatedName("hg.h")
    public double field2563 = 1.0D;

    @ObfuscatedName("hg.j")
    public int field2562 = 128;

    @ObfuscatedName("hg.y")
    public class330 field2564;

    public class219(class330 arg0, class330 arg1, int arg2, double arg3, int arg4) {
        this.field2564 = arg1;
        this.field2559 = arg2;
        this.field2565 = this.field2559;
        this.field2563 = arg3;
        this.field2562 = arg4;
        int[] var7 = arg0.method5792(0);
        int var8 = var7.length;
        this.field2561 = new class208[arg0.method5793(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class464 var10 = new class464(arg0.method5859(0, var7[var9]));
            this.field2561[var7[var9]] = new class208(var10);
        }
    }

    @ObfuscatedName("hg.a(I)I")
    public int method4122() {
        int var1 = 0;
        int var2 = 0;
        class208[] var3 = this.field2561;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class208 var5 = var3[var4];
            if (var5 != null && var5.field2367 != null) {
                var1 += var5.field2367.length;
                int[] var6 = var5.field2367;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2564.method5785(var8)) {
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

    @ObfuscatedName("hg.f(D)V")
    public void method4145(double arg0) {
        this.field2563 = arg0;
        this.method4128();
    }

    @ObfuscatedName("hg.c(IB)[I")
    public int[] method4121(int arg0) {
        class208 var2 = this.field2561[arg0];
        if (var2 != null) {
            if (var2.field2373 != null) {
                this.field2560.method6029(var2);
                var2.field2374 = true;
                return var2.field2373;
            }
            boolean var3 = var2.method3791(this.field2563, this.field2562, this.field2564);
            if (var3) {
                if (this.field2565 == 0) {
                    class208 var4 = (class208) this.field2560.method6035();
                    var4.method3792();
                } else {
                    this.field2565--;
                }
                this.field2560.method6029(var2);
                var2.field2374 = true;
                return var2.field2373;
            }
        }
        return null;
    }

    @ObfuscatedName("hg.x(II)I")
    public int method4125(int arg0) {
        return this.field2561[arg0] == null ? 0 : this.field2561[arg0].field2365;
    }

    @ObfuscatedName("hg.h(II)Z")
    public boolean method4126(int arg0) {
        return this.field2561[arg0].field2366;
    }

    @ObfuscatedName("hg.j(II)Z")
    public boolean method4127(int arg0) {
        return this.field2562 == 64;
    }

    @ObfuscatedName("hg.y(I)V")
    public void method4128() {
        for (int var1 = 0; var1 < this.field2561.length; var1++) {
            if (this.field2561[var1] != null) {
                this.field2561[var1].method3792();
            }
        }
        this.field2560 = new class349();
        this.field2565 = this.field2559;
    }

    @ObfuscatedName("hg.d(II)V")
    public void method4129(int arg0) {
        for (int var2 = 0; var2 < this.field2561.length; var2++) {
            class208 var3 = this.field2561[var2];
            if (var3 != null && var3.field2371 != 0 && var3.field2374) {
                var3.method3793(arg0);
                var3.field2374 = false;
            }
        }
    }
}
