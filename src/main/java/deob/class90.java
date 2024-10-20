package deob;

@ObfuscatedName("cj")
public class class90 extends class179 {

    @ObfuscatedName("cj.y")
    public int field1507;

    @ObfuscatedName("cj.j")
    public boolean field1508;

    @ObfuscatedName("cj.l")
    public int[] field1511;

    @ObfuscatedName("cj.f")
    public int[] field1510;

    @ObfuscatedName("cj.n")
    public int[] field1503;

    @ObfuscatedName("cj.k")
    public int[] field1512;

    @ObfuscatedName("cj.q")
    public int field1509;

    @ObfuscatedName("cj.w")
    public int field1514;

    @ObfuscatedName("cj.v")
    public int[] field1515;

    @ObfuscatedName("cj.z")
    public boolean field1504 = false;

    public class90(class127 arg0) {
        this.field1507 = arg0.method2496();
        this.field1508 = arg0.method2494() == 1;
        int var2 = arg0.method2494();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1511 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1511[var3] = arg0.method2496();
        }
        if (var2 > 1) {
            this.field1510 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1510[var4] = arg0.method2494();
            }
        }
        if (var2 > 1) {
            this.field1503 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1503[var5] = arg0.method2494();
            }
        }
        this.field1512 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1512[var6] = arg0.method2617();
        }
        this.field1509 = arg0.method2494();
        this.field1514 = arg0.method2494();
        this.field1515 = null;
    }

    @ObfuscatedName("cj.p(DILeu;)Z")
    public boolean method1877(double arg0, int arg1, class153 arg2) {
        for (int var5 = 0; var5 < this.field1511.length; var5++) {
            if (arg2.method3055(this.field1511[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1515 = new int[var6];
        for (int var7 = 0; var7 < this.field1511.length; var7++) {
            class87 var8 = class84.method904(arg2, this.field1511[var7]);
            var8.method1793();
            byte[] var9 = var8.field1491;
            int[] var10 = var8.field1488;
            int var11 = this.field1512[var7];
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
                var10[var17] = class104.method2161(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1510[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1489 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1515[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1489 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1515[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1489 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1515[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("cj.e()V")
    public void method1866() {
        this.field1515 = null;
    }

    @ObfuscatedName("cj.a(I)V")
    public void method1867(int arg0) {
        if (this.field1515 == null) {
            return;
        }
        if (this.field1509 == 1 || this.field1509 == 3) {
            if (Statics.field1513 == null || Statics.field1513.length < this.field1515.length) {
                Statics.field1513 = new int[this.field1515.length];
            }
            short var2;
            if (this.field1515.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1515.length;
            int var4 = arg0 * var2 * this.field1514;
            int var5 = var3 - 1;
            if (this.field1509 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1513[var6] = this.field1515[var7];
            }
            int[] var8 = this.field1515;
            this.field1515 = Statics.field1513;
            Statics.field1513 = var8;
        }
        if (this.field1509 != 2 && this.field1509 != 4) {
            return;
        }
        if (Statics.field1513 == null || Statics.field1513.length < this.field1515.length) {
            Statics.field1513 = new int[this.field1515.length];
        }
        short var9;
        if (this.field1515.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1515.length;
        int var11 = this.field1514 * arg0;
        int var12 = var9 - 1;
        if (this.field1509 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1513[var15] = this.field1515[var16];
            }
        }
        int[] var17 = this.field1515;
        this.field1515 = Statics.field1513;
        Statics.field1513 = var17;
    }
}
