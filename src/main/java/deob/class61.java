package deob;

@ObfuscatedName("bf")
public class class61 {

    @ObfuscatedName("bf.i")
    public int field1228 = class71.method1463(16);

    @ObfuscatedName("bf.v")
    public int field1233 = class71.method1463(24);

    @ObfuscatedName("bf.r")
    public int field1230 = class71.method1463(24);

    @ObfuscatedName("bf.n")
    public int field1231 = class71.method1463(24) + 1;

    @ObfuscatedName("bf.x")
    public int field1232 = class71.method1463(6) + 1;

    @ObfuscatedName("bf.q")
    public int field1229 = class71.method1463(8);

    @ObfuscatedName("bf.h")
    public int[] field1234;

    public class61() {
        int[] var1 = new int[this.field1232];
        for (int var2 = 0; var2 < this.field1232; var2++) {
            int var3 = 0;
            int var4 = class71.method1463(3);
            boolean var5 = class71.method1474() != 0;
            if (var5) {
                var3 = class71.method1463(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1234 = new int[this.field1232 * 8];
        for (int var6 = 0; var6 < this.field1232 * 8; var6++) {
            this.field1234[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class71.method1463(8);
        }
    }

    @ObfuscatedName("bf.i([FIZ)V")
    public void method1270(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1304[this.field1229].field1361;
        int var6 = this.field1230 - this.field1233;
        int var7 = var6 / this.field1231;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1304[this.field1229].method1503();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1232;
                        }
                        var11 /= this.field1232;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1234[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1231 * var10 + this.field1233;
                        class74 var17 = Statics.field1304[var15];
                        if (this.field1228 == 0) {
                            int var18 = this.field1231 / var17.field1361;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1504();
                                for (int var21 = 0; var21 < var17.field1361; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1231) {
                                float[] var23 = var17.method1504();
                                for (int var24 = 0; var24 < var17.field1361; var24++) {
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
