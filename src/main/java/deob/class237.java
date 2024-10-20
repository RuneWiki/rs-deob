package deob;

@ObfuscatedName("jr")
public class class237 extends class508 {

    @ObfuscatedName("jr.ax")
    public int field2544;

    @ObfuscatedName("jr.aq")
    public boolean field2540;

    @ObfuscatedName("jr.af")
    public int[] field2535;

    @ObfuscatedName("jr.at")
    public int[] field2542;

    @ObfuscatedName("jr.au")
    public int[] field2543;

    @ObfuscatedName("jr.ar")
    public int[] field2541;

    @ObfuscatedName("jr.al")
    public int field2539;

    @ObfuscatedName("jr.ad")
    public int field2546;

    @ObfuscatedName("jr.ah")
    public int[] field2547;

    @ObfuscatedName("jr.ap")
    public boolean field2548 = false;

    public class237(class551 arg0) {
        this.field2544 = arg0.method9119();
        this.field2540 = arg0.method8955() == 1;
        int var2 = arg0.method8955();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2535 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2535[var3] = arg0.method9119();
        }
        if (var2 > 1) {
            this.field2542 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2542[var4] = arg0.method8955();
            }
        }
        if (var2 > 1) {
            this.field2543 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2543[var5] = arg0.method8955();
            }
        }
        this.field2541 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2541[var6] = arg0.method9110();
        }
        this.field2539 = arg0.method8955();
        this.field2546 = arg0.method8955();
        this.field2547 = null;
    }

    @ObfuscatedName("jr.ac(DILpo;)Z")
    public boolean method4320(double arg0, int arg1, class391 arg2) {
        for (int var5 = 0; var5 < this.field2535.length; var5++) {
            if (arg2.method6811(this.field2535[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2547 = new int[var6];
        for (int var7 = 0; var7 < this.field2535.length; var7++) {
            int var8 = this.field2535[var7];
            byte[] var9 = arg2.method6788(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class566.method8813(var9);
                var10 = true;
            }
            class564 var11;
            if (var10) {
                class564 var12 = new class564();
                var12.field5505 = Statics.field5522;
                var12.field5501 = Statics.field5521;
                var12.field5508 = Statics.field4920[0];
                var12.field5506 = Statics.field988[0];
                var12.field5503 = Statics.field4598[0];
                var12.field5504 = Statics.field2922[0];
                var12.field5502 = Statics.field5524;
                var12.field5507 = Statics.field3699[0];
                class566.method3270();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method9403();
            byte[] var15 = var11.field5507;
            int[] var16 = var11.field5502;
            int var17 = this.field2541[var7];
            if ((var17 & 0xFF000000) == 16777216) {
            }
            if ((var17 & 0xFF000000) == 33554432) {
            }
            if ((var17 & 0xFF000000) == 50331648) {
                int var18 = var17 & 0xFF00FF;
                int var19 = var17 >> 8 & 0xFF;
                for (int var20 = 0; var20 < var16.length; var20++) {
                    int var21 = var16[var20];
                    if (var21 >> 8 == (var21 & 0xFFFF)) {
                        int var22 = var21 & 0xFF;
                        var16[var20] = var18 * var22 >> 8 & 0xFF00FF | var19 * var22 & 0xFF00;
                    }
                }
            }
            for (int var23 = 0; var23 < var16.length; var23++) {
                var16[var23] = class240.method4402(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field2542[var7 - 1];
            }
            if (var24 == 0) {
                if (var11.field5503 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field2547[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field5503 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field2547[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field5503 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field2547[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var24 == 1) {
            }
            if (var24 == 2) {
            }
            if (var24 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("jr.ae()V")
    public void method4316() {
        this.field2547 = null;
    }

    @ObfuscatedName("jr.ag(I)V")
    public void method4317(int arg0) {
        if (this.field2547 == null) {
            return;
        }
        if (this.field2539 == 1 || this.field2539 == 3) {
            if (Statics.field2549 == null || Statics.field2549.length < this.field2547.length) {
                Statics.field2549 = new int[this.field2547.length];
            }
            short var2;
            if (this.field2547.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2547.length;
            int var4 = arg0 * var2 * this.field2546;
            int var5 = var3 - 1;
            if (this.field2539 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2549[var6] = this.field2547[var7];
            }
            int[] var8 = this.field2547;
            this.field2547 = Statics.field2549;
            Statics.field2549 = var8;
        }
        if (this.field2539 != 2 && this.field2539 != 4) {
            return;
        }
        if (Statics.field2549 == null || Statics.field2549.length < this.field2547.length) {
            Statics.field2549 = new int[this.field2547.length];
        }
        short var9;
        if (this.field2547.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2547.length;
        int var11 = this.field2546 * arg0;
        int var12 = var9 - 1;
        if (this.field2539 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2549[var15] = this.field2547[var16];
            }
        }
        int[] var17 = this.field2547;
        this.field2547 = Statics.field2549;
        Statics.field2549 = var17;
    }
}
