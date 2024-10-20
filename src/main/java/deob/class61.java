package deob;

@ObfuscatedName("bk")
public class class61 {

    @ObfuscatedName("bk.f")
    public int field1239 = class71.method1482(16);

    @ObfuscatedName("bk.u")
    public int field1244 = class71.method1482(24);

    @ObfuscatedName("bk.x")
    public int field1241 = class71.method1482(24);

    @ObfuscatedName("bk.b")
    public int field1242 = class71.method1482(24) + 1;

    @ObfuscatedName("bk.l")
    public int field1243 = class71.method1482(6) + 1;

    @ObfuscatedName("bk.d")
    public int field1240 = class71.method1482(8);

    @ObfuscatedName("bk.n")
    public int[] field1245;

    public class61() {
        int[] var1 = new int[this.field1243];
        for (int var2 = 0; var2 < this.field1243; var2++) {
            int var3 = 0;
            int var4 = class71.method1482(3);
            boolean var5 = class71.method1474() != 0;
            if (var5) {
                var3 = class71.method1482(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1245 = new int[this.field1243 * 8];
        for (int var6 = 0; var6 < this.field1243 * 8; var6++) {
            this.field1245[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class71.method1482(8);
        }
    }

    @ObfuscatedName("bk.f([FIZ)V")
    public void method1281(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1332[this.field1240].field1373;
        int var6 = this.field1241 - this.field1244;
        int var7 = var6 / this.field1242;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1332[this.field1240].method1523();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1243;
                        }
                        var11 /= this.field1243;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1245[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1242 * var10 + this.field1244;
                        class74 var17 = Statics.field1332[var15];
                        if (this.field1239 == 0) {
                            int var18 = this.field1242 / var17.field1373;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1528();
                                for (int var21 = 0; var21 < var17.field1373; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1242) {
                                float[] var23 = var17.method1528();
                                for (int var24 = 0; var24 < var17.field1373; var24++) {
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
