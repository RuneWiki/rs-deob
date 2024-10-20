package deob;

@ObfuscatedName("bh")
public class class64 {

    @ObfuscatedName("bh.a")
    public int field1297 = class74.method1512(16);

    @ObfuscatedName("bh.d")
    public int field1296 = class74.method1512(24);

    @ObfuscatedName("bh.v")
    public int field1299 = class74.method1512(24);

    @ObfuscatedName("bh.r")
    public int field1300 = class74.method1512(24) + 1;

    @ObfuscatedName("bh.z")
    public int field1298 = class74.method1512(6) + 1;

    @ObfuscatedName("bh.t")
    public int field1295 = class74.method1512(8);

    @ObfuscatedName("bh.n")
    public int[] field1301;

    public class64() {
        int[] var1 = new int[this.field1298];
        for (int var2 = 0; var2 < this.field1298; var2++) {
            int var3 = 0;
            int var4 = class74.method1512(3);
            boolean var5 = class74.method1495() != 0;
            if (var5) {
                var3 = class74.method1512(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1301 = new int[this.field1298 * 8];
        for (int var6 = 0; var6 < this.field1298 * 8; var6++) {
            this.field1301[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class74.method1512(8);
        }
    }

    @ObfuscatedName("bh.a([FIZ)V")
    public void method1301(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1379[this.field1295].field1432;
        int var6 = this.field1299 - this.field1296;
        int var7 = var6 / this.field1300;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1379[this.field1295].method1541();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1298;
                        }
                        var11 /= this.field1298;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1301[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1300 * var10 + this.field1296;
                        class77 var17 = Statics.field1379[var15];
                        if (this.field1297 == 0) {
                            int var18 = this.field1300 / var17.field1432;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1542();
                                for (int var21 = 0; var21 < var17.field1432; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1300) {
                                float[] var23 = var17.method1542();
                                for (int var24 = 0; var24 < var17.field1432; var24++) {
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
