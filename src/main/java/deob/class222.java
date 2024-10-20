package deob;

@ObfuscatedName("ht")
public class class222 implements class230 {

    @ObfuscatedName("ht.h")
    public class210[] field2642;

    @ObfuscatedName("ht.e")
    public class352 field2638 = new class352();

    @ObfuscatedName("ht.v")
    public int field2643;

    @ObfuscatedName("ht.x")
    public int field2640 = 0;

    @ObfuscatedName("ht.m")
    public double field2641 = 1.0D;

    @ObfuscatedName("ht.q")
    public int field2639 = 128;

    @ObfuscatedName("ht.f")
    public class333 field2637;

    public class222(class333 arg0, class333 arg1, int arg2, double arg3, int arg4) {
        this.field2637 = arg1;
        this.field2643 = arg2;
        this.field2640 = this.field2643;
        this.field2641 = arg3;
        this.field2639 = arg4;
        int[] var7 = arg0.method5854(0);
        int var8 = var7.length;
        this.field2642 = new class210[arg0.method5869(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class467 var10 = new class467(arg0.method5909(0, var7[var9]));
            this.field2642[var7[var9]] = new class210(var10);
        }
    }

    @ObfuscatedName("ht.h(B)I")
    public int method4239() {
        int var1 = 0;
        int var2 = 0;
        class210[] var3 = this.field2642;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class210 var5 = var3[var4];
            if (var5 != null && var5.field2438 != null) {
                var1 += var5.field2438.length;
                int[] var6 = var5.field2438;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2637.method5882(var8)) {
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

    @ObfuscatedName("ht.e(D)V")
    public void method4240(double arg0) {
        this.field2641 = arg0;
        this.method4238();
    }

    @ObfuscatedName("ht.v(II)[I")
    public int[] method4241(int arg0) {
        class210 var2 = this.field2642[arg0];
        if (var2 != null) {
            if (var2.field2433 != null) {
                this.field2638.method6082(var2);
                var2.field2446 = true;
                return var2.field2433;
            }
            boolean var3 = var2.method3915(this.field2641, this.field2639, this.field2637);
            if (var3) {
                if (this.field2640 == 0) {
                    class210 var4 = (class210) this.field2638.method6107();
                    var4.method3919();
                } else {
                    this.field2640--;
                }
                this.field2638.method6082(var2);
                var2.field2446 = true;
                return var2.field2433;
            }
        }
        return null;
    }

    @ObfuscatedName("ht.x(IB)I")
    public int method4256(int arg0) {
        return this.field2642[arg0] == null ? 0 : this.field2642[arg0].field2437;
    }

    @ObfuscatedName("ht.m(II)Z")
    public boolean method4243(int arg0) {
        return this.field2642[arg0].field2443;
    }

    @ObfuscatedName("ht.q(II)Z")
    public boolean method4244(int arg0) {
        return this.field2639 == 64;
    }

    @ObfuscatedName("ht.f(I)V")
    public void method4238() {
        for (int var1 = 0; var1 < this.field2642.length; var1++) {
            if (this.field2642[var1] != null) {
                this.field2642[var1].method3919();
            }
        }
        this.field2638 = new class352();
        this.field2640 = this.field2643;
    }

    @ObfuscatedName("ht.r(IB)V")
    public void method4260(int arg0) {
        for (int var2 = 0; var2 < this.field2642.length; var2++) {
            class210 var3 = this.field2642[var2];
            if (var3 != null && var3.field2435 != 0 && var3.field2446) {
                var3.method3914(arg0);
                var3.field2446 = false;
            }
        }
    }
}
