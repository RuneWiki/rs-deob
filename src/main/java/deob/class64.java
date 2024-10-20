package deob;

@ObfuscatedName("bj")
public class class64 {

    @ObfuscatedName("bj.i")
    public int field1279 = class74.method1480(16);

    @ObfuscatedName("bj.h")
    public int field1278 = class74.method1480(24);

    @ObfuscatedName("bj.e")
    public int field1280 = class74.method1480(24);

    @ObfuscatedName("bj.g")
    public int field1277 = class74.method1480(24) + 1;

    @ObfuscatedName("bj.n")
    public int field1281 = class74.method1480(6) + 1;

    @ObfuscatedName("bj.u")
    public int field1282 = class74.method1480(8);

    @ObfuscatedName("bj.d")
    public int[] field1283;

    public class64() {
        int[] var1 = new int[this.field1281];
        for (int var2 = 0; var2 < this.field1281; var2++) {
            int var3 = 0;
            int var4 = class74.method1480(3);
            boolean var5 = class74.method1479() != 0;
            if (var5) {
                var3 = class74.method1480(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1283 = new int[this.field1281 * 8];
        for (int var6 = 0; var6 < this.field1281 * 8; var6++) {
            this.field1283[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class74.method1480(8);
        }
    }

    @ObfuscatedName("bj.i([FIZ)V")
    public void method1281(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1353[this.field1282].field1415;
        int var6 = this.field1280 - this.field1278;
        int var7 = var6 / this.field1277;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1353[this.field1282].method1529();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1281;
                        }
                        var11 /= this.field1281;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1283[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1277 * var10 + this.field1278;
                        class77 var17 = Statics.field1353[var15];
                        if (this.field1279 == 0) {
                            int var18 = this.field1277 / var17.field1415;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1530();
                                for (int var21 = 0; var21 < var17.field1415; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1277) {
                                float[] var23 = var17.method1530();
                                for (int var24 = 0; var24 < var17.field1415; var24++) {
                                    arg0[var16 + var22] += var23[var24];
                                    var22++;
                                }
                            }
                        }
                    }
                    var10++;
                    if (var10 >= var7) {
                        break;
                    }
                }
            }
        }
    }
}
