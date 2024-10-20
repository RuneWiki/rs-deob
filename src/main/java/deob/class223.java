package deob;

@ObfuscatedName("iq")
public class class223 extends class461 {

    @ObfuscatedName("iq.ax")
    public int field2471;

    @ObfuscatedName("iq.ap")
    public boolean field2470;

    @ObfuscatedName("iq.ab")
    public int[] field2473;

    @ObfuscatedName("iq.ak")
    public int[] field2474;

    @ObfuscatedName("iq.ae")
    public int[] field2475;

    @ObfuscatedName("iq.af")
    public int[] field2468;

    @ObfuscatedName("iq.ao")
    public int field2477;

    @ObfuscatedName("iq.aa")
    public int field2481;

    @ObfuscatedName("iq.aj")
    public int[] field2479;

    @ObfuscatedName("iq.ad")
    public boolean field2480 = false;

    public class223(class501 arg0) {
        this.field2471 = arg0.method8195();
        this.field2470 = arg0.method8129() == 1;
        int var2 = arg0.method8129();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2473 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2473[var3] = arg0.method8195();
        }
        if (var2 > 1) {
            this.field2474 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2474[var4] = arg0.method8129();
            }
        }
        if (var2 > 1) {
            this.field2475 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2475[var5] = arg0.method8129();
            }
        }
        this.field2468 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2468[var6] = arg0.method8134();
        }
        this.field2477 = arg0.method8129();
        this.field2481 = arg0.method8129();
        this.field2479 = null;
    }

    @ObfuscatedName("iq.at(DILnq;)Z")
    public boolean method3999(double arg0, int arg1, class357 arg2) {
        for (int var5 = 0; var5 < this.field2473.length; var5++) {
            if (arg2.method6105(this.field2473[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2479 = new int[var6];
        for (int var7 = 0; var7 < this.field2473.length; var7++) {
            int var8 = this.field2473[var7];
            class514 var9;
            if (class516.method6077(arg2, var8)) {
                class514 var10 = new class514();
                var10.field5112 = Statics.field3756;
                var10.field5113 = Statics.field4971;
                var10.field5106 = Statics.field5127[0];
                var10.field5110 = Statics.field4512[0];
                var10.field5108 = Statics.field5126[0];
                var10.field5109 = Statics.field5129[0];
                var10.field5107 = Statics.field5130;
                var10.field5111 = Statics.field5131[0];
                class516.method4394();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method8577();
            byte[] var13 = var9.field5111;
            int[] var14 = var9.field5107;
            int var15 = this.field2468[var7];
            if ((var15 & 0xFF000000) == 16777216) {
            }
            if ((var15 & 0xFF000000) == 33554432) {
            }
            if ((var15 & 0xFF000000) == 50331648) {
                int var16 = var15 & 0xFF00FF;
                int var17 = var15 >> 8 & 0xFF;
                for (int var18 = 0; var18 < var14.length; var18++) {
                    int var19 = var14[var18];
                    if (var19 >> 8 == (var19 & 0xFFFF)) {
                        int var20 = var19 & 0xFF;
                        var14[var18] = var16 * var20 >> 8 & 0xFF00FF | var17 * var20 & 0xFF00;
                    }
                }
            }
            for (int var21 = 0; var21 < var14.length; var21++) {
                var14[var21] = class226.method4035(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field2474[var7 - 1];
            }
            if (var22 == 0) {
                if (var9.field5108 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field2479[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field5108 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field2479[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field5108 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field2479[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var22 == 1) {
            }
            if (var22 == 2) {
            }
            if (var22 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("iq.an()V")
    public void method4000() {
        this.field2479 = null;
    }

    @ObfuscatedName("iq.av(I)V")
    public void method4001(int arg0) {
        if (this.field2479 == null) {
            return;
        }
        if (this.field2477 == 1 || this.field2477 == 3) {
            if (Statics.field2472 == null || Statics.field2472.length < this.field2479.length) {
                Statics.field2472 = new int[this.field2479.length];
            }
            short var2;
            if (this.field2479.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2479.length;
            int var4 = arg0 * var2 * this.field2481;
            int var5 = var3 - 1;
            if (this.field2477 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2472[var6] = this.field2479[var7];
            }
            int[] var8 = this.field2479;
            this.field2479 = Statics.field2472;
            Statics.field2472 = var8;
        }
        if (this.field2477 != 2 && this.field2477 != 4) {
            return;
        }
        if (Statics.field2472 == null || Statics.field2472.length < this.field2479.length) {
            Statics.field2472 = new int[this.field2479.length];
        }
        short var9;
        if (this.field2479.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2479.length;
        int var11 = this.field2481 * arg0;
        int var12 = var9 - 1;
        if (this.field2477 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2472[var15] = this.field2479[var16];
            }
        }
        int[] var17 = this.field2479;
        this.field2479 = Statics.field2472;
        Statics.field2472 = var17;
    }
}
