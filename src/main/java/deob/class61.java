package deob;

@ObfuscatedName("bl")
public class class61 {

    @ObfuscatedName("bl.z")
    public int field1219 = class71.method1400(16);

    @ObfuscatedName("bl.q")
    public int field1220 = class71.method1400(24);

    @ObfuscatedName("bl.k")
    public int field1221 = class71.method1400(24);

    @ObfuscatedName("bl.f")
    public int field1223 = class71.method1400(24) + 1;

    @ObfuscatedName("bl.d")
    public int field1224 = class71.method1400(6) + 1;

    @ObfuscatedName("bl.l")
    public int field1222 = class71.method1400(8);

    @ObfuscatedName("bl.r")
    public int[] field1225;

    public class61() {
        int[] var1 = new int[this.field1224];
        for (int var2 = 0; var2 < this.field1224; var2++) {
            int var3 = 0;
            int var4 = class71.method1400(3);
            boolean var5 = class71.method1399() != 0;
            if (var5) {
                var3 = class71.method1400(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1225 = new int[this.field1224 * 8];
        for (int var6 = 0; var6 < this.field1224 * 8; var6++) {
            this.field1225[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class71.method1400(8);
        }
    }

    @ObfuscatedName("bl.z([FIZ)V")
    public void method1198(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1295[this.field1222].field1357;
        int var6 = this.field1221 - this.field1220;
        int var7 = var6 / this.field1223;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1295[this.field1222].method1447();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1224;
                        }
                        var11 /= this.field1224;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1225[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1223 * var10 + this.field1220;
                        class74 var17 = Statics.field1295[var15];
                        if (this.field1219 == 0) {
                            int var18 = this.field1223 / var17.field1357;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1455();
                                for (int var21 = 0; var21 < var17.field1357; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1223) {
                                float[] var23 = var17.method1455();
                                for (int var24 = 0; var24 < var17.field1357; var24++) {
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
