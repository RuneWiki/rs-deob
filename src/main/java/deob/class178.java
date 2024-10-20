package deob;

@ObfuscatedName("ga")
public class class178 extends class506 {

    @ObfuscatedName("ga.ax")
    public int field1892;

    @ObfuscatedName("ga.ao")
    public boolean field1901;

    @ObfuscatedName("ga.am")
    public int[] field1888;

    @ObfuscatedName("ga.ac")
    public int[] field1895;

    @ObfuscatedName("ga.ae")
    public int[] field1896;

    @ObfuscatedName("ga.ad")
    public int[] field1897;

    @ObfuscatedName("ga.aq")
    public int field1902;

    @ObfuscatedName("ga.al")
    public int field1900;

    @ObfuscatedName("ga.aj")
    public int[] field1893;

    @ObfuscatedName("ga.as")
    public boolean field1894 = false;

    public class178(class549 arg0) {
        this.field1892 = arg0.method8968();
        this.field1901 = arg0.method9025() == 1;
        int var2 = arg0.method9025();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1888 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1888[var3] = arg0.method8968();
        }
        if (var2 > 1) {
            this.field1895 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1895[var4] = arg0.method9025();
            }
        }
        if (var2 > 1) {
            this.field1896 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1896[var5] = arg0.method9025();
            }
        }
        this.field1897 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1897[var6] = arg0.method8803();
        }
        this.field1902 = arg0.method9025();
        this.field1900 = arg0.method9025();
        this.field1893 = null;
    }

    @ObfuscatedName("ga.ab(DILob;)Z")
    public boolean method3430(double arg0, int arg1, class389 arg2) {
        for (int var5 = 0; var5 < this.field1888.length; var5++) {
            if (arg2.method6646(this.field1888[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1893 = new int[var6];
        for (int var7 = 0; var7 < this.field1888.length; var7++) {
            int var8 = this.field1888[var7];
            byte[] var9 = arg2.method6644(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class564.method2626(var9);
                var10 = true;
            }
            class562 var11;
            if (var10) {
                class562 var12 = new class562();
                var12.field5475 = Statics.field3978;
                var12.field5474 = Statics.field5490;
                var12.field5473 = Statics.field1681[0];
                var12.field5471 = Statics.field5491[0];
                var12.field5476 = Statics.field5492[0];
                var12.field5472 = Statics.field4030[0];
                var12.field5470 = Statics.field2966;
                var12.field5469 = Statics.field5493[0];
                Statics.field1681 = null;
                Statics.field5491 = null;
                Statics.field5492 = null;
                Statics.field4030 = null;
                Statics.field2966 = null;
                Statics.field5493 = (byte[][]) null;
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method9215();
            byte[] var15 = var11.field5469;
            int[] var16 = var11.field5470;
            int var17 = this.field1897[var7];
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
                var16[var23] = class181.method3441(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1895[var7 - 1];
            }
            if (var24 == 0) {
                if (var11.field5476 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1893[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field5476 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1893[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field5476 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1893[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("ga.ay()V")
    public void method3431() {
        this.field1893 = null;
    }

    @ObfuscatedName("ga.an(I)V")
    public void method3432(int arg0) {
        if (this.field1893 == null) {
            return;
        }
        if (this.field1902 == 1 || this.field1902 == 3) {
            if (Statics.field1899 == null || Statics.field1899.length < this.field1893.length) {
                Statics.field1899 = new int[this.field1893.length];
            }
            short var2;
            if (this.field1893.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1893.length;
            int var4 = arg0 * var2 * this.field1900;
            int var5 = var3 - 1;
            if (this.field1902 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1899[var6] = this.field1893[var7];
            }
            int[] var8 = this.field1893;
            this.field1893 = Statics.field1899;
            Statics.field1899 = var8;
        }
        if (this.field1902 != 2 && this.field1902 != 4) {
            return;
        }
        if (Statics.field1899 == null || Statics.field1899.length < this.field1893.length) {
            Statics.field1899 = new int[this.field1893.length];
        }
        short var9;
        if (this.field1893.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1893.length;
        int var11 = this.field1900 * arg0;
        int var12 = var9 - 1;
        if (this.field1902 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1899[var15] = this.field1893[var16];
            }
        }
        int[] var17 = this.field1893;
        this.field1893 = Statics.field1899;
        Statics.field1899 = var17;
    }
}
