package deob;

@ObfuscatedName("jp")
public class class236 implements class248 {

    @ObfuscatedName("jp.at")
    public class223[] field2655;

    @ObfuscatedName("jp.an")
    public class376 field2650 = new class376();

    @ObfuscatedName("jp.av")
    public int field2651;

    @ObfuscatedName("jp.as")
    public int field2649 = 0;

    @ObfuscatedName("jp.ax")
    public double field2652 = 1.0D;

    @ObfuscatedName("jp.ap")
    public int field2654 = 128;

    @ObfuscatedName("jp.ab")
    public class357 field2653;

    public class236(class357 arg0, class357 arg1, int arg2, double arg3, int arg4) {
        this.field2653 = arg1;
        this.field2651 = arg2;
        this.field2649 = this.field2651;
        this.field2652 = arg3;
        this.field2654 = arg4;
        int[] var7 = arg0.method6090(0);
        if (var7 == null) {
            this.field2655 = new class223[0];
        } else {
            int var8 = var7.length;
            this.field2655 = new class223[arg0.method6135(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class501 var10 = new class501(arg0.method6080(0, var7[var9]));
                this.field2655[var7[var9]] = new class223(var10);
            }
        }
    }

    @ObfuscatedName("jp.at(I)I")
    public int method4364() {
        if (this.field2655.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class223[] var3 = this.field2655;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class223 var5 = var3[var4];
            if (var5 != null && var5.field2473 != null) {
                var1 += var5.field2473.length;
                int[] var6 = var5.field2473;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2653.method6079(var8)) {
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

    @ObfuscatedName("jp.an(D)V")
    public void method4365(double arg0) {
        this.field2652 = arg0;
        this.method4369();
    }

    @ObfuscatedName("jp.av(II)[I")
    public int[] method4384(int arg0) {
        class223 var2 = this.field2655[arg0];
        if (var2 != null) {
            if (var2.field2479 != null) {
                this.field2650.method6305(var2);
                var2.field2480 = true;
                return var2.field2479;
            }
            boolean var3 = var2.method3999(this.field2652, this.field2654, this.field2653);
            if (var3) {
                if (this.field2649 == 0) {
                    class223 var4 = (class223) this.field2650.method6327();
                    var4.method4000();
                } else {
                    this.field2649--;
                }
                this.field2650.method6305(var2);
                var2.field2480 = true;
                return var2.field2479;
            }
        }
        return null;
    }

    @ObfuscatedName("jp.as(IB)I")
    public int method4367(int arg0) {
        return this.field2655[arg0] == null ? 0 : this.field2655[arg0].field2471;
    }

    @ObfuscatedName("jp.ax(IB)Z")
    public boolean method4377(int arg0) {
        return this.field2655[arg0].field2470;
    }

    @ObfuscatedName("jp.ap(IB)Z")
    public boolean method4368(int arg0) {
        return this.field2654 == 64;
    }

    @ObfuscatedName("jp.ab(B)V")
    public void method4369() {
        for (int var1 = 0; var1 < this.field2655.length; var1++) {
            if (this.field2655[var1] != null) {
                this.field2655[var1].method4000();
            }
        }
        this.field2650 = new class376();
        this.field2649 = this.field2651;
    }

    @ObfuscatedName("jp.ak(II)V")
    public void method4370(int arg0) {
        for (int var2 = 0; var2 < this.field2655.length; var2++) {
            class223 var3 = this.field2655[var2];
            if (var3 != null && var3.field2477 != 0 && var3.field2480) {
                var3.method4001(arg0);
                var3.field2480 = false;
            }
        }
    }
}
