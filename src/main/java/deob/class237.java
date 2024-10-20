package deob;

@ObfuscatedName("ju")
public class class237 extends class515 {

    @ObfuscatedName("ju.ai")
    public int field2537;

    @ObfuscatedName("ju.ay")
    public boolean field2540;

    @ObfuscatedName("ju.as")
    public int[] field2543;

    @ObfuscatedName("ju.ae")
    public int[] field2544;

    @ObfuscatedName("ju.am")
    public int[] field2545;

    @ObfuscatedName("ju.at")
    public int[] field2546;

    @ObfuscatedName("ju.au")
    public int field2547;

    @ObfuscatedName("ju.an")
    public int field2548;

    @ObfuscatedName("ju.ao")
    public int[] field2549;

    @ObfuscatedName("ju.af")
    public boolean field2550 = false;

    public class237(class558 arg0) {
        this.field2537 = arg0.method9260();
        this.field2540 = arg0.method9258() == 1;
        int var2 = arg0.method9258();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2543 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2543[var3] = arg0.method9260();
        }
        if (var2 > 1) {
            this.field2544 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2544[var4] = arg0.method9258();
            }
        }
        if (var2 > 1) {
            this.field2545 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2545[var5] = arg0.method9258();
            }
        }
        this.field2546 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2546[var6] = arg0.method9264();
        }
        this.field2547 = arg0.method9258();
        this.field2548 = arg0.method9258();
        this.field2549 = null;
    }

    @ObfuscatedName("ju.ap(DILpe;)Z")
    public boolean method4482(double arg0, int arg1, class392 arg2) {
        for (int var5 = 0; var5 < this.field2543.length; var5++) {
            if (arg2.method7045(this.field2543[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2549 = new int[var6];
        for (int var7 = 0; var7 < this.field2543.length; var7++) {
            int var8 = this.field2543[var7];
            class571 var9;
            if (class573.method2469(arg2, var8)) {
                var9 = class573.method1875();
            } else {
                var9 = null;
            }
            var9.method9711();
            byte[] var11 = var9.field5552;
            int[] var12 = var9.field5550;
            int var13 = this.field2546[var7];
            if ((var13 & 0xFF000000) == 16777216) {
            }
            if ((var13 & 0xFF000000) == 33554432) {
            }
            if ((var13 & 0xFF000000) == 50331648) {
                int var14 = var13 & 0xFF00FF;
                int var15 = var13 >> 8 & 0xFF;
                for (int var16 = 0; var16 < var12.length; var16++) {
                    int var17 = var12[var16];
                    if (var17 >> 8 == (var17 & 0xFFFF)) {
                        int var18 = var17 & 0xFF;
                        var12[var16] = var14 * var18 >> 8 & 0xFF00FF | var15 * var18 & 0xFF00;
                    }
                }
            }
            for (int var19 = 0; var19 < var12.length; var19++) {
                var12[var19] = class240.method4496(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2544[var7 - 1];
            }
            if (var20 == 0) {
                if (var9.field5549 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2549[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field5549 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2549[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field5549 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2549[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var20 == 1) {
            }
            if (var20 == 2) {
            }
            if (var20 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("ju.aw()V")
    public void method4483() {
        this.field2549 = null;
    }

    @ObfuscatedName("ju.ak(I)V")
    public void method4484(int arg0) {
        if (this.field2549 == null) {
            return;
        }
        if (this.field2547 == 1 || this.field2547 == 3) {
            if (Statics.field2551 == null || Statics.field2551.length < this.field2549.length) {
                Statics.field2551 = new int[this.field2549.length];
            }
            short var2;
            if (this.field2549.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2549.length;
            int var4 = arg0 * var2 * this.field2548;
            int var5 = var3 - 1;
            if (this.field2547 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2551[var6] = this.field2549[var7];
            }
            int[] var8 = this.field2549;
            this.field2549 = Statics.field2551;
            Statics.field2551 = var8;
        }
        if (this.field2547 != 2 && this.field2547 != 4) {
            return;
        }
        if (Statics.field2551 == null || Statics.field2551.length < this.field2549.length) {
            Statics.field2551 = new int[this.field2549.length];
        }
        short var9;
        if (this.field2549.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2549.length;
        int var11 = this.field2548 * arg0;
        int var12 = var9 - 1;
        if (this.field2547 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2551[var15] = this.field2549[var16];
            }
        }
        int[] var17 = this.field2549;
        this.field2549 = Statics.field2551;
        Statics.field2551 = var17;
    }
}
