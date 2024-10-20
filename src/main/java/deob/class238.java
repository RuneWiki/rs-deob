package deob;

@ObfuscatedName("jo")
public class class238 extends class488 {

    @ObfuscatedName("jo.ao")
    public int field2501;

    @ObfuscatedName("jo.ah")
    public boolean field2502;

    @ObfuscatedName("jo.ar")
    public int[] field2505;

    @ObfuscatedName("jo.ab")
    public int[] field2508;

    @ObfuscatedName("jo.am")
    public int[] field2507;

    @ObfuscatedName("jo.av")
    public int[] field2510;

    @ObfuscatedName("jo.ag")
    public int field2511;

    @ObfuscatedName("jo.aa")
    public int field2512;

    @ObfuscatedName("jo.ap")
    public int[] field2513;

    @ObfuscatedName("jo.ay")
    public boolean field2514 = false;

    public class238(class530 arg0) {
        this.field2501 = arg0.method8598();
        this.field2502 = arg0.method8365() == 1;
        int var2 = arg0.method8365();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2505 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2505[var3] = arg0.method8598();
        }
        if (var2 > 1) {
            this.field2508 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2508[var4] = arg0.method8365();
            }
        }
        if (var2 > 1) {
            this.field2507 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2507[var5] = arg0.method8365();
            }
        }
        this.field2510 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2510[var6] = arg0.method8371();
        }
        this.field2511 = arg0.method8365();
        this.field2512 = arg0.method8365();
        this.field2513 = null;
    }

    @ObfuscatedName("jo.ac(DILom;)Z")
    public boolean method4142(double arg0, int arg1, class374 arg2) {
        for (int var5 = 0; var5 < this.field2505.length; var5++) {
            if (arg2.method6271(this.field2505[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2513 = new int[var6];
        for (int var7 = 0; var7 < this.field2505.length; var7++) {
            int var8 = this.field2505[var7];
            class543 var9;
            if (class545.method6749(arg2, var8)) {
                class543 var10 = new class543();
                var10.field5232 = Statics.field1747;
                var10.field5233 = Statics.field5007;
                var10.field5228 = Statics.field3506[0];
                var10.field5226 = Statics.field2854[0];
                var10.field5231 = Statics.field443[0];
                var10.field5229 = Statics.field5247[0];
                var10.field5227 = Statics.field4323;
                var10.field5230 = Statics.field4559[0];
                Statics.method6787();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method8787();
            byte[] var13 = var9.field5230;
            int[] var14 = var9.field5227;
            int var15 = this.field2510[var7];
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
                var14[var21] = class241.method4156(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field2508[var7 - 1];
            }
            if (var22 == 0) {
                if (var9.field5231 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field2513[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field5231 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field2513[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field5231 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field2513[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("jo.al()V")
    public void method4136() {
        this.field2513 = null;
    }

    @ObfuscatedName("jo.ak(I)V")
    public void method4139(int arg0) {
        if (this.field2513 == null) {
            return;
        }
        if (this.field2511 == 1 || this.field2511 == 3) {
            if (Statics.field2515 == null || Statics.field2515.length < this.field2513.length) {
                Statics.field2515 = new int[this.field2513.length];
            }
            short var2;
            if (this.field2513.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2513.length;
            int var4 = arg0 * var2 * this.field2512;
            int var5 = var3 - 1;
            if (this.field2511 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2515[var6] = this.field2513[var7];
            }
            int[] var8 = this.field2513;
            this.field2513 = Statics.field2515;
            Statics.field2515 = var8;
        }
        if (this.field2511 != 2 && this.field2511 != 4) {
            return;
        }
        if (Statics.field2515 == null || Statics.field2515.length < this.field2513.length) {
            Statics.field2515 = new int[this.field2513.length];
        }
        short var9;
        if (this.field2513.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2513.length;
        int var11 = this.field2512 * arg0;
        int var12 = var9 - 1;
        if (this.field2511 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2515[var15] = this.field2513[var16];
            }
        }
        int[] var17 = this.field2513;
        this.field2513 = Statics.field2515;
        Statics.field2515 = var17;
    }
}
