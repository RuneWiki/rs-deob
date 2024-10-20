package deob;

@ObfuscatedName("ba")
public class class64 {

    @ObfuscatedName("ba.m")
    public int field1303 = class74.method1523(16);

    @ObfuscatedName("ba.w")
    public int field1298 = class74.method1523(24);

    @ObfuscatedName("ba.e")
    public int field1299 = class74.method1523(24);

    @ObfuscatedName("ba.o")
    public int field1300 = class74.method1523(24) + 1;

    @ObfuscatedName("ba.g")
    public int field1301 = class74.method1523(6) + 1;

    @ObfuscatedName("ba.l")
    public int field1302 = class74.method1523(8);

    @ObfuscatedName("ba.j")
    public int[] field1297;

    public class64() {
        int[] var1 = new int[this.field1301];
        for (int var2 = 0; var2 < this.field1301; var2++) {
            int var3 = 0;
            int var4 = class74.method1523(3);
            boolean var5 = class74.method1521() != 0;
            if (var5) {
                var3 = class74.method1523(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1297 = new int[this.field1301 * 8];
        for (int var6 = 0; var6 < this.field1301 * 8; var6++) {
            this.field1297[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class74.method1523(8);
        }
    }

    @ObfuscatedName("ba.m([FIZ)V")
    public void method1319(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1373[this.field1302].field1436;
        int var6 = this.field1299 - this.field1298;
        int var7 = var6 / this.field1300;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1373[this.field1302].method1579();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1301;
                        }
                        var11 /= this.field1301;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1297[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1300 * var10 + this.field1298;
                        class77 var17 = Statics.field1373[var15];
                        if (this.field1303 == 0) {
                            int var18 = this.field1300 / var17.field1436;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1573();
                                for (int var21 = 0; var21 < var17.field1436; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1300) {
                                float[] var23 = var17.method1573();
                                for (int var24 = 0; var24 < var17.field1436; var24++) {
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
