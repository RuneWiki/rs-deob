package deob;

@ObfuscatedName("bd")
public class class61 {

    @ObfuscatedName("bd.o")
    public int field1223 = class71.method1404(16);

    @ObfuscatedName("bd.e")
    public int field1218 = class71.method1404(24);

    @ObfuscatedName("bd.u")
    public int field1219 = class71.method1404(24);

    @ObfuscatedName("bd.b")
    public int field1220 = class71.method1404(24) + 1;

    @ObfuscatedName("bd.p")
    public int field1221 = class71.method1404(6) + 1;

    @ObfuscatedName("bd.s")
    public int field1222 = class71.method1404(8);

    @ObfuscatedName("bd.y")
    public int[] field1217;

    public class61() {
        int[] var1 = new int[this.field1221];
        for (int var2 = 0; var2 < this.field1221; var2++) {
            int var3 = 0;
            int var4 = class71.method1404(3);
            boolean var5 = class71.method1406() != 0;
            if (var5) {
                var3 = class71.method1404(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1217 = new int[this.field1221 * 8];
        for (int var6 = 0; var6 < this.field1221 * 8; var6++) {
            this.field1217[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class71.method1404(8);
        }
    }

    @ObfuscatedName("bd.o([FIZ)V")
    public void method1204(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1293[this.field1222].field1354;
        int var6 = this.field1219 - this.field1218;
        int var7 = var6 / this.field1220;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1293[this.field1222].method1453();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1221;
                        }
                        var11 /= this.field1221;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1217[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1220 * var10 + this.field1218;
                        class74 var17 = Statics.field1293[var15];
                        if (this.field1223 == 0) {
                            int var18 = this.field1220 / var17.field1354;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1458();
                                for (int var21 = 0; var21 < var17.field1354; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1220) {
                                float[] var23 = var17.method1458();
                                for (int var24 = 0; var24 < var17.field1354; var24++) {
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
