package deob;

@ObfuscatedName("cu")
public class class83 extends class208 {

    @ObfuscatedName("cu.x")
    public int field1435;

    @ObfuscatedName("cu.q")
    public boolean field1436;

    @ObfuscatedName("cu.h")
    public int[] field1437;

    @ObfuscatedName("cu.d")
    public int[] field1439;

    @ObfuscatedName("cu.c")
    public int[] field1433;

    @ObfuscatedName("cu.y")
    public int[] field1440;

    @ObfuscatedName("cu.m")
    public int field1441;

    @ObfuscatedName("cu.e")
    public int field1442;

    @ObfuscatedName("cu.z")
    public int[] field1443;

    @ObfuscatedName("cu.t")
    public boolean field1431 = false;

    public class83(class119 arg0) {
        this.field1435 = arg0.method2347();
        this.field1436 = arg0.method2380() == 1;
        int var2 = arg0.method2380();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1437 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1437[var3] = arg0.method2347();
        }
        if (var2 > 1) {
            this.field1439 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1439[var4] = arg0.method2380();
            }
        }
        if (var2 > 1) {
            this.field1433 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1433[var5] = arg0.method2380();
            }
        }
        this.field1440 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1440[var6] = arg0.method2350();
        }
        this.field1441 = arg0.method2380();
        this.field1442 = arg0.method2380();
        this.field1443 = null;
    }

    @ObfuscatedName("cu.i(DILfe;)Z")
    public boolean method1746(double arg0, int arg1, class167 arg2) {
        for (int var5 = 0; var5 < this.field1437.length; var5++) {
            if (arg2.method3060(this.field1437[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1443 = new int[var6];
        for (int var7 = 0; var7 < this.field1437.length; var7++) {
            int var8 = this.field1437[var7];
            byte[] var9 = arg2.method3077(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class77.method3227(var9);
                var10 = true;
            }
            class81 var11;
            if (var10) {
                class81 var12 = new class81();
                var12.field1427 = Statics.field1383;
                var12.field1429 = Statics.field1390;
                var12.field1426 = Statics.field2891[0];
                var12.field1425 = Statics.field3144[0];
                var12.field1424 = Statics.field1384[0];
                var12.field1422 = Statics.field1386[0];
                var12.field1423 = Statics.field1041;
                var12.field1428 = Statics.field1755[0];
                Statics.field2891 = null;
                Statics.field3144 = null;
                Statics.field1384 = null;
                Statics.field1386 = null;
                Statics.field1041 = null;
                Statics.field1755 = (byte[][]) null;
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1737();
            byte[] var15 = var11.field1428;
            int[] var16 = var11.field1423;
            int var17 = this.field1440[var7];
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
                var16[var23] = class91.method1958(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1439[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1424 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1443[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1424 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1443[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1424 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1443[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("cu.v()V")
    public void method1751() {
        this.field1443 = null;
    }

    @ObfuscatedName("cu.r(I)V")
    public void method1745(int arg0) {
        if (this.field1443 == null) {
            return;
        }
        if (this.field1441 == 1 || this.field1441 == 3) {
            if (Statics.field1445 == null || Statics.field1445.length < this.field1443.length) {
                Statics.field1445 = new int[this.field1443.length];
            }
            short var2;
            if (this.field1443.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1443.length;
            int var4 = arg0 * var2 * this.field1442;
            int var5 = var3 - 1;
            if (this.field1441 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1445[var6] = this.field1443[var7];
            }
            int[] var8 = this.field1443;
            this.field1443 = Statics.field1445;
            Statics.field1445 = var8;
        }
        if (this.field1441 != 2 && this.field1441 != 4) {
            return;
        }
        if (Statics.field1445 == null || Statics.field1445.length < this.field1443.length) {
            Statics.field1445 = new int[this.field1443.length];
        }
        short var9;
        if (this.field1443.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1443.length;
        int var11 = this.field1442 * arg0;
        int var12 = var9 - 1;
        if (this.field1441 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1445[var15] = this.field1443[var16];
            }
        }
        int[] var17 = this.field1443;
        this.field1443 = Statics.field1445;
        Statics.field1445 = var17;
    }
}
