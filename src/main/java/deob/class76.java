package deob;

@ObfuscatedName("bt")
public class class76 extends class184 {

    @ObfuscatedName("bt.i")
    public int field1312;

    @ObfuscatedName("bt.b")
    public boolean field1310;

    @ObfuscatedName("bt.s")
    public int[] field1305;

    @ObfuscatedName("bt.q")
    public int[] field1311;

    @ObfuscatedName("bt.p")
    public int[] field1313;

    @ObfuscatedName("bt.h")
    public int[] field1314;

    @ObfuscatedName("bt.r")
    public int field1315;

    @ObfuscatedName("bt.o")
    public int field1319;

    @ObfuscatedName("bt.f")
    public int[] field1317;

    @ObfuscatedName("bt.u")
    public boolean field1318 = false;

    public class76(class107 arg0) {
        this.field1312 = arg0.method2239();
        this.field1310 = arg0.method2122() == 1;
        int var2 = arg0.method2122();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1305 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1305[var3] = arg0.method2239();
        }
        if (var2 > 1) {
            this.field1311 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1311[var4] = arg0.method2122();
            }
        }
        if (var2 > 1) {
            this.field1313 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1313[var5] = arg0.method2122();
            }
        }
        this.field1314 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1314[var6] = arg0.method2127();
        }
        this.field1315 = arg0.method2122();
        this.field1319 = arg0.method2122();
        this.field1317 = null;
    }

    @ObfuscatedName("bt.z(DILer;)Z")
    public boolean method1585(double arg0, int arg1, class146 arg2) {
        for (int var5 = 0; var5 < this.field1305.length; var5++) {
            if (arg2.method2714(this.field1305[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1317 = new int[var6];
        for (int var7 = 0; var7 < this.field1305.length; var7++) {
            int var8 = this.field1305[var7];
            byte[] var9 = arg2.method2710(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class70.method10(var9);
                var10 = true;
            }
            class74 var11;
            if (var10) {
                var11 = class70.method2782();
            } else {
                var11 = null;
            }
            var11.method1570();
            byte[] var13 = var11.field1297;
            int[] var14 = var11.field1301;
            int var15 = this.field1314[var7];
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
                var14[var21] = class84.method1789(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1311[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var11.field1298 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1317[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field1298 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1317[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1298 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1317[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("bt.j()V")
    public void method1587() {
        this.field1317 = null;
    }

    @ObfuscatedName("bt.a(I)V")
    public void method1584(int arg0) {
        if (this.field1317 == null) {
            return;
        }
        if (this.field1315 == 1 || this.field1315 == 3) {
            if (Statics.field1309 == null || Statics.field1309.length < this.field1317.length) {
                Statics.field1309 = new int[this.field1317.length];
            }
            short var2;
            if (this.field1317.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1317.length;
            int var4 = arg0 * var2 * this.field1319;
            int var5 = var3 - 1;
            if (this.field1315 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1309[var6] = this.field1317[var7];
            }
            int[] var8 = this.field1317;
            this.field1317 = Statics.field1309;
            Statics.field1309 = var8;
        }
        if (this.field1315 != 2 && this.field1315 != 4) {
            return;
        }
        if (Statics.field1309 == null || Statics.field1309.length < this.field1317.length) {
            Statics.field1309 = new int[this.field1317.length];
        }
        short var9;
        if (this.field1317.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1317.length;
        int var11 = this.field1319 * arg0;
        int var12 = var9 - 1;
        if (this.field1315 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1309[var15] = this.field1317[var16];
            }
        }
        int[] var17 = this.field1317;
        this.field1317 = Statics.field1309;
        Statics.field1309 = var17;
    }
}
