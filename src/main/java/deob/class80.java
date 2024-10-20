package deob;

@ObfuscatedName("cb")
public class class80 extends class149 {

    @ObfuscatedName("cb.t")
    public int field1295;

    @ObfuscatedName("cb.p")
    public boolean field1304;

    @ObfuscatedName("cb.u")
    public int[] field1297;

    @ObfuscatedName("cb.z")
    public int[] field1298;

    @ObfuscatedName("cb.l")
    public int[] field1299;

    @ObfuscatedName("cb.v")
    public int[] field1294;

    @ObfuscatedName("cb.g")
    public int field1291;

    @ObfuscatedName("cb.w")
    public int field1302;

    @ObfuscatedName("cb.r")
    public int[] field1303;

    @ObfuscatedName("cb.s")
    public boolean field1301 = false;

    public class80(class130 arg0) {
        this.field1295 = arg0.method2232();
        this.field1304 = arg0.method2379() == 1;
        int var2 = arg0.method2379();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1297 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1297[var3] = arg0.method2232();
        }
        if (var2 > 1) {
            this.field1298 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1298[var4] = arg0.method2379();
            }
        }
        if (var2 > 1) {
            this.field1299 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1299[var5] = arg0.method2379();
            }
        }
        this.field1294 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1294[var6] = arg0.method2246();
        }
        this.field1291 = arg0.method2379();
        this.field1302 = arg0.method2379();
        this.field1303 = null;
    }

    @ObfuscatedName("cb.d(DILgd;)Z")
    public boolean method1470(double arg0, int arg1, class185 arg2) {
        for (int var5 = 0; var5 < this.field1297.length; var5++) {
            if (arg2.method3099(this.field1297[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1303 = new int[var6];
        for (int var7 = 0; var7 < this.field1297.length; var7++) {
            int var8 = this.field1297[var7];
            byte[] var9 = arg2.method3092(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class230.method3055(var9);
                var10 = true;
            }
            class227 var11;
            if (var10) {
                class227 var12 = new class227();
                var12.field3234 = Statics.field3256;
                var12.field3229 = Statics.field3252;
                var12.field3231 = Statics.field2878[0];
                var12.field3232 = Statics.field3253[0];
                var12.field3233 = Statics.field3255[0];
                var12.field3230 = Statics.field773[0];
                var12.field3227 = Statics.field3250;
                var12.field3228 = Statics.field3254[0];
                Statics.field2878 = null;
                Statics.field3253 = null;
                Statics.field3255 = null;
                Statics.field773 = null;
                Statics.field3250 = null;
                Statics.field3254 = (byte[][]) null;
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method3929();
            byte[] var15 = var11.field3228;
            int[] var16 = var11.field3227;
            int var17 = this.field1294[var7];
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
                var16[var23] = class85.method1571(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1298[var7 - 1];
            }
            if (var24 == 0) {
                if (var11.field3233 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1303[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field3233 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1303[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field3233 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1303[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("cb.c()V")
    public void method1471() {
        this.field1303 = null;
    }

    @ObfuscatedName("cb.n(I)V")
    public void method1474(int arg0) {
        if (this.field1303 == null) {
            return;
        }
        if (this.field1291 == 1 || this.field1291 == 3) {
            if (Statics.field1305 == null || Statics.field1305.length < this.field1303.length) {
                Statics.field1305 = new int[this.field1303.length];
            }
            short var2;
            if (this.field1303.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1303.length;
            int var4 = arg0 * var2 * this.field1302;
            int var5 = var3 - 1;
            if (this.field1291 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1305[var6] = this.field1303[var7];
            }
            int[] var8 = this.field1303;
            this.field1303 = Statics.field1305;
            Statics.field1305 = var8;
        }
        if (this.field1291 != 2 && this.field1291 != 4) {
            return;
        }
        if (Statics.field1305 == null || Statics.field1305.length < this.field1303.length) {
            Statics.field1305 = new int[this.field1303.length];
        }
        short var9;
        if (this.field1303.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1303.length;
        int var11 = this.field1302 * arg0;
        int var12 = var9 - 1;
        if (this.field1291 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1305[var15] = this.field1303[var16];
            }
        }
        int[] var17 = this.field1303;
        this.field1303 = Statics.field1305;
        Statics.field1305 = var17;
    }
}
