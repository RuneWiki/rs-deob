package deob;

@ObfuscatedName("ko")
public class class269 extends class492 {

    @ObfuscatedName("ko.ar")
    public int field2772;

    @ObfuscatedName("ko.as")
    public boolean field2768;

    @ObfuscatedName("ko.aa")
    public int[] field2767;

    @ObfuscatedName("ko.az")
    public int[] field2774;

    @ObfuscatedName("ko.ao")
    public int[] field2776;

    @ObfuscatedName("ko.au")
    public int[] field2773;

    @ObfuscatedName("ko.ak")
    public int field2777;

    @ObfuscatedName("ko.ah")
    public int field2778;

    @ObfuscatedName("ko.aj")
    public int[] field2779;

    @ObfuscatedName("ko.af")
    public boolean field2780 = false;

    public class269(class534 arg0) {
        this.field2772 = arg0.method8593();
        this.field2768 = arg0.method8591() == 1;
        int var2 = arg0.method8591();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2767 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2767[var3] = arg0.method8593();
        }
        if (var2 > 1) {
            this.field2774 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2774[var4] = arg0.method8591();
            }
        }
        if (var2 > 1) {
            this.field2776 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2776[var5] = arg0.method8591();
            }
        }
        this.field2773 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2773[var6] = arg0.method8597();
        }
        this.field2777 = arg0.method8591();
        this.field2778 = arg0.method8591();
        this.field2779 = null;
    }

    @ObfuscatedName("ko.aq(DILof;)Z")
    public boolean method4738(double arg0, int arg1, class378 arg2) {
        for (int var5 = 0; var5 < this.field2767.length; var5++) {
            if (arg2.method6461(this.field2767[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2779 = new int[var6];
        for (int var7 = 0; var7 < this.field2767.length; var7++) {
            class547 var8 = class549.method3150(arg2, this.field2767[var7]);
            var8.method8999();
            byte[] var9 = var8.field5288;
            int[] var10 = var8.field5289;
            int var11 = this.field2773[var7];
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
                var10[var17] = class272.method4751(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2774[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field5290 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2779[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field5290 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2779[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field5290 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2779[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ko.aw()V")
    public void method4741() {
        this.field2779 = null;
    }

    @ObfuscatedName("ko.al(I)V")
    public void method4740(int arg0) {
        if (this.field2779 == null) {
            return;
        }
        if (this.field2777 == 1 || this.field2777 == 3) {
            if (Statics.field2781 == null || Statics.field2781.length < this.field2779.length) {
                Statics.field2781 = new int[this.field2779.length];
            }
            short var2;
            if (this.field2779.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2779.length;
            int var4 = arg0 * var2 * this.field2778;
            int var5 = var3 - 1;
            if (this.field2777 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2781[var6] = this.field2779[var7];
            }
            int[] var8 = this.field2779;
            this.field2779 = Statics.field2781;
            Statics.field2781 = var8;
        }
        if (this.field2777 != 2 && this.field2777 != 4) {
            return;
        }
        if (Statics.field2781 == null || Statics.field2781.length < this.field2779.length) {
            Statics.field2781 = new int[this.field2779.length];
        }
        short var9;
        if (this.field2779.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2779.length;
        int var11 = this.field2778 * arg0;
        int var12 = var9 - 1;
        if (this.field2777 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2781[var15] = this.field2779[var16];
            }
        }
        int[] var17 = this.field2779;
        this.field2779 = Statics.field2781;
        Statics.field2781 = var17;
    }
}
