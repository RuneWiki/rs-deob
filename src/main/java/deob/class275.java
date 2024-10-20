package deob;

@ObfuscatedName("kz")
public class class275 extends class505 {

    @ObfuscatedName("kz.ap")
    public int field2828;

    @ObfuscatedName("kz.an")
    public boolean field2829;

    @ObfuscatedName("kz.aj")
    public int[] field2831;

    @ObfuscatedName("kz.av")
    public int[] field2832;

    @ObfuscatedName("kz.ab")
    public int[] field2830;

    @ObfuscatedName("kz.ai")
    public int[] field2826;

    @ObfuscatedName("kz.ae")
    public int field2834;

    @ObfuscatedName("kz.au")
    public int field2835;

    @ObfuscatedName("kz.ah")
    public int[] field2836;

    @ObfuscatedName("kz.az")
    public boolean field2837 = false;

    public class275(class547 arg0) {
        this.field2828 = arg0.method8899();
        this.field2829 = arg0.method8804() == 1;
        int var2 = arg0.method8804();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2831 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2831[var3] = arg0.method8899();
        }
        if (var2 > 1) {
            this.field2832 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2832[var4] = arg0.method8804();
            }
        }
        if (var2 > 1) {
            this.field2830 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2830[var5] = arg0.method8804();
            }
        }
        this.field2826 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2826[var6] = arg0.method8734();
        }
        this.field2834 = arg0.method8804();
        this.field2835 = arg0.method8804();
        this.field2836 = null;
    }

    @ObfuscatedName("kz.aq(DILok;)Z")
    public boolean method4747(double arg0, int arg1, class388 arg2) {
        for (int var5 = 0; var5 < this.field2831.length; var5++) {
            if (arg2.method6562(this.field2831[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2836 = new int[var6];
        for (int var7 = 0; var7 < this.field2831.length; var7++) {
            class560 var8 = class562.method5459(arg2, this.field2831[var7]);
            var8.method9137();
            byte[] var9 = var8.field5453;
            int[] var10 = var8.field5456;
            int var11 = this.field2826[var7];
            if ((var11 & 0xFF000000) == 16777216) {
            }
            if ((var11 & 0xFF000000) == 33554432) {
            }
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class278.method4762(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2832[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field5451 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2836[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field5451 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2836[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field5451 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2836[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var18 == 1) {
            }
            if (var18 == 2) {
            }
            if (var18 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("kz.ad()V")
    public void method4748() {
        this.field2836 = null;
    }

    @ObfuscatedName("kz.ag(I)V")
    public void method4749(int arg0) {
        if (this.field2836 == null) {
            return;
        }
        if (this.field2834 == 1 || this.field2834 == 3) {
            if (Statics.field2838 == null || Statics.field2838.length < this.field2836.length) {
                Statics.field2838 = new int[this.field2836.length];
            }
            short var2;
            if (this.field2836.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2836.length;
            int var4 = arg0 * var2 * this.field2835;
            int var5 = var3 - 1;
            if (this.field2834 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2838[var6] = this.field2836[var7];
            }
            int[] var8 = this.field2836;
            this.field2836 = Statics.field2838;
            Statics.field2838 = var8;
        }
        if (this.field2834 != 2 && this.field2834 != 4) {
            return;
        }
        if (Statics.field2838 == null || Statics.field2838.length < this.field2836.length) {
            Statics.field2838 = new int[this.field2836.length];
        }
        short var9;
        if (this.field2836.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2836.length;
        int var11 = this.field2835 * arg0;
        int var12 = var9 - 1;
        if (this.field2834 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2838[var15] = this.field2836[var16];
            }
        }
        int[] var17 = this.field2836;
        this.field2836 = Statics.field2838;
        Statics.field2838 = var17;
    }
}
