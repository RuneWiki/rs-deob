package deob;

@ObfuscatedName("jk")
public class class240 extends class493 {

    @ObfuscatedName("jk.an")
    public int field2562;

    @ObfuscatedName("jk.ao")
    public boolean field2570;

    @ObfuscatedName("jk.ab")
    public int[] field2564;

    @ObfuscatedName("jk.aw")
    public int[] field2565;

    @ObfuscatedName("jk.ad")
    public int[] field2566;

    @ObfuscatedName("jk.al")
    public int[] field2567;

    @ObfuscatedName("jk.as")
    public int field2568;

    @ObfuscatedName("jk.ag")
    public int field2559;

    @ObfuscatedName("jk.ai")
    public int[] field2561;

    @ObfuscatedName("jk.ax")
    public boolean field2571 = false;

    public class240(class535 arg0) {
        this.field2562 = arg0.method8670();
        this.field2570 = arg0.method8462() == 1;
        int var2 = arg0.method8462();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2564 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2564[var3] = arg0.method8670();
        }
        if (var2 > 1) {
            this.field2565 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2565[var4] = arg0.method8462();
            }
        }
        if (var2 > 1) {
            this.field2566 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2566[var5] = arg0.method8462();
            }
        }
        this.field2567 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2567[var6] = arg0.method8682();
        }
        this.field2568 = arg0.method8462();
        this.field2559 = arg0.method8462();
        this.field2561 = null;
    }

    @ObfuscatedName("jk.az(DILoc;)Z")
    public boolean method4190(double arg0, int arg1, class379 arg2) {
        for (int var5 = 0; var5 < this.field2564.length; var5++) {
            if (arg2.method6337(this.field2564[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2561 = new int[var6];
        for (int var7 = 0; var7 < this.field2564.length; var7++) {
            int var8 = this.field2564[var7];
            byte[] var9 = arg2.method6335(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class550.method7827(var9);
                var10 = true;
            }
            class548 var11;
            if (var10) {
                var11 = class550.method3592();
            } else {
                var11 = null;
            }
            var11.method8870();
            byte[] var13 = var11.field5328;
            int[] var14 = var11.field5322;
            int var15 = this.field2567[var7];
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
                var14[var21] = class243.method4204(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field2565[var7 - 1];
            }
            if (var22 == 0) {
                if (var11.field5321 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field2561[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field5321 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field2561[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field5321 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field2561[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("jk.ah()V")
    public void method4194() {
        this.field2561 = null;
    }

    @ObfuscatedName("jk.af(I)V")
    public void method4189(int arg0) {
        if (this.field2561 == null) {
            return;
        }
        if (this.field2568 == 1 || this.field2568 == 3) {
            if (Statics.field2572 == null || Statics.field2572.length < this.field2561.length) {
                Statics.field2572 = new int[this.field2561.length];
            }
            short var2;
            if (this.field2561.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2561.length;
            int var4 = arg0 * var2 * this.field2559;
            int var5 = var3 - 1;
            if (this.field2568 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2572[var6] = this.field2561[var7];
            }
            int[] var8 = this.field2561;
            this.field2561 = Statics.field2572;
            Statics.field2572 = var8;
        }
        if (this.field2568 != 2 && this.field2568 != 4) {
            return;
        }
        if (Statics.field2572 == null || Statics.field2572.length < this.field2561.length) {
            Statics.field2572 = new int[this.field2561.length];
        }
        short var9;
        if (this.field2561.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2561.length;
        int var11 = this.field2559 * arg0;
        int var12 = var9 - 1;
        if (this.field2568 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2572[var15] = this.field2561[var16];
            }
        }
        int[] var17 = this.field2561;
        this.field2561 = Statics.field2572;
        Statics.field2572 = var17;
    }
}
