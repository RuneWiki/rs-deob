package deob;

@ObfuscatedName("it")
public class class239 implements class247 {

    @ObfuscatedName("it.v")
    public class228[] field2696;

    @ObfuscatedName("it.c")
    public class335 field2691 = new class335();

    @ObfuscatedName("it.i")
    public int field2692;

    @ObfuscatedName("it.f")
    public int field2693 = 0;

    @ObfuscatedName("it.b")
    public double field2690 = 1.0D;

    @ObfuscatedName("it.n")
    public int field2695 = 128;

    @ObfuscatedName("it.s")
    public class316 field2694;

    public class239(class316 arg0, class316 arg1, int arg2, double arg3, int arg4) {
        this.field2694 = arg1;
        this.field2692 = arg2;
        this.field2693 = this.field2692;
        this.field2690 = arg3;
        this.field2695 = arg4;
        int[] var7 = arg0.method5304(0);
        int var8 = var7.length;
        this.field2696 = new class228[arg0.method5305(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class438 var10 = new class438(arg0.method5296(0, var7[var9]));
            this.field2696[var7[var9]] = new class228(var10);
        }
    }

    @ObfuscatedName("it.v(I)I")
    public int method4454() {
        int var1 = 0;
        int var2 = 0;
        class228[] var3 = this.field2696;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class228 var5 = var3[var4];
            if (var5 != null && var5.field2506 != null) {
                var1 += var5.field2506.length;
                int[] var6 = var5.field2506;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2694.method5298(var8)) {
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

    @ObfuscatedName("it.c(D)V")
    public void method4480(double arg0) {
        this.field2690 = arg0;
        this.method4460();
    }

    @ObfuscatedName("it.i(II)[I")
    public int[] method4456(int arg0) {
        class228 var2 = this.field2696[arg0];
        if (var2 != null) {
            if (var2.field2504 != null) {
                this.field2691.method5528(var2);
                var2.field2513 = true;
                return var2.field2504;
            }
            boolean var3 = var2.method4115(this.field2690, this.field2695, this.field2694);
            if (var3) {
                if (this.field2693 == 0) {
                    class228 var4 = (class228) this.field2691.method5531();
                    var4.method4117();
                } else {
                    this.field2693--;
                }
                this.field2691.method5528(var2);
                var2.field2513 = true;
                return var2.field2504;
            }
        }
        return null;
    }

    @ObfuscatedName("it.f(II)I")
    public int method4477(int arg0) {
        return this.field2696[arg0] == null ? 0 : this.field2696[arg0].field2511;
    }

    @ObfuscatedName("it.b(II)Z")
    public boolean method4458(int arg0) {
        return this.field2696[arg0].field2512;
    }

    @ObfuscatedName("it.n(II)Z")
    public boolean method4455(int arg0) {
        return this.field2695 == 64;
    }

    @ObfuscatedName("it.s(S)V")
    public void method4460() {
        for (int var1 = 0; var1 < this.field2696.length; var1++) {
            if (this.field2696[var1] != null) {
                this.field2696[var1].method4117();
            }
        }
        this.field2691 = new class335();
        this.field2693 = this.field2692;
    }

    @ObfuscatedName("it.l(II)V")
    public void method4459(int arg0) {
        for (int var2 = 0; var2 < this.field2696.length; var2++) {
            class228 var3 = this.field2696[var2];
            if (var3 != null && var3.field2510 != 0 && var3.field2513) {
                var3.method4120(arg0);
                var3.field2513 = false;
            }
        }
    }
}
