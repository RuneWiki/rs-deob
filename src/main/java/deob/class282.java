package deob;

@ObfuscatedName("kd")
public class class282 implements class294 {

    @ObfuscatedName("kd.aq")
    public class269[] field2956;

    @ObfuscatedName("kd.aw")
    public class397 field2951 = new class397();

    @ObfuscatedName("kd.al")
    public int field2954;

    @ObfuscatedName("kd.ai")
    public int field2952 = 0;

    @ObfuscatedName("kd.ar")
    public double field2955 = 1.0D;

    @ObfuscatedName("kd.as")
    public int field2953 = 128;

    @ObfuscatedName("kd.aa")
    public class378 field2957;

    public class282(class378 arg0, class378 arg1, int arg2, double arg3, int arg4) {
        this.field2957 = arg1;
        this.field2954 = arg2;
        this.field2952 = this.field2954;
        this.field2955 = arg3;
        this.field2953 = arg4;
        int[] var7 = arg0.method6510(0);
        if (var7 == null) {
            this.field2956 = new class269[0];
        } else {
            int var8 = var7.length;
            this.field2956 = new class269[arg0.method6429(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class534 var10 = new class534(arg0.method6489(0, var7[var9]));
                this.field2956[var7[var9]] = new class269(var10);
            }
        }
    }

    @ObfuscatedName("kd.aq(I)I")
    public int method5104() {
        if (this.field2956.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class269[] var3 = this.field2956;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class269 var5 = var3[var4];
            if (var5 != null && var5.field2767 != null) {
                var1 += var5.field2767.length;
                int[] var6 = var5.field2767;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2957.method6421(var8)) {
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

    @ObfuscatedName("kd.aw(D)V")
    public void method5105(double arg0) {
        this.field2955 = arg0;
        this.method5110();
    }

    @ObfuscatedName("kd.al(IB)[I")
    public int[] method5121(int arg0) {
        class269 var2 = this.field2956[arg0];
        if (var2 != null) {
            if (var2.field2779 != null) {
                this.field2951.method6686(var2);
                var2.field2780 = true;
                return var2.field2779;
            }
            boolean var3 = var2.method4738(this.field2955, this.field2953, this.field2957);
            if (var3) {
                if (this.field2952 == 0) {
                    class269 var4 = (class269) this.field2951.method6682();
                    var4.method4741();
                } else {
                    this.field2952--;
                }
                this.field2951.method6686(var2);
                var2.field2780 = true;
                return var2.field2779;
            }
        }
        return null;
    }

    @ObfuscatedName("kd.ai(II)I")
    public int method5107(int arg0) {
        return this.field2956[arg0] == null ? 0 : this.field2956[arg0].field2772;
    }

    @ObfuscatedName("kd.ar(II)Z")
    public boolean method5108(int arg0) {
        return this.field2956[arg0].field2768;
    }

    @ObfuscatedName("kd.as(IB)Z")
    public boolean method5109(int arg0) {
        return this.field2953 == 64;
    }

    @ObfuscatedName("kd.aa(I)V")
    public void method5110() {
        for (int var1 = 0; var1 < this.field2956.length; var1++) {
            if (this.field2956[var1] != null) {
                this.field2956[var1].method4741();
            }
        }
        this.field2951 = new class397();
        this.field2952 = this.field2954;
    }

    @ObfuscatedName("kd.az(IB)V")
    public void method5111(int arg0) {
        for (int var2 = 0; var2 < this.field2956.length; var2++) {
            class269 var3 = this.field2956[var2];
            if (var3 != null && var3.field2777 != 0 && var3.field2780) {
                var3.method4740(arg0);
                var3.field2780 = false;
            }
        }
    }
}
