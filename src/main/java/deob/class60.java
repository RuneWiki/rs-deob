package deob;

@ObfuscatedName("bd")
public class class60 {

    @ObfuscatedName("bd.i")
    public int field1222 = class54.method1185(16);

    @ObfuscatedName("bd.b")
    public int field1217 = class54.method1185(24);

    @ObfuscatedName("bd.r")
    public int field1218 = class54.method1185(24);

    @ObfuscatedName("bd.l")
    public int field1219 = class54.method1185(24) + 1;

    @ObfuscatedName("bd.s")
    public int field1220 = class54.method1185(6) + 1;

    @ObfuscatedName("bd.d")
    public int field1216 = class54.method1185(8);

    @ObfuscatedName("bd.e")
    public int[] field1221;

    public class60() {
        int[] var1 = new int[this.field1220];
        for (int var2 = 0; var2 < this.field1220; var2++) {
            int var3 = 0;
            int var4 = class54.method1185(3);
            boolean var5 = class54.method1184() != 0;
            if (var5) {
                var3 = class54.method1185(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1221 = new int[this.field1220 * 8];
        for (int var6 = 0; var6 < this.field1220 * 8; var6++) {
            this.field1221[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class54.method1185(8);
        }
    }

    @ObfuscatedName("bd.i([FIZ)V")
    public void method1280(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1149[this.field1216].field1227;
        int var6 = this.field1218 - this.field1217;
        int var7 = var6 / this.field1219;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1149[this.field1216].method1285();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1220;
                        }
                        var11 /= this.field1220;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1221[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1219 * var10 + this.field1217;
                        class61 var17 = Statics.field1149[var15];
                        if (this.field1222 == 0) {
                            int var18 = this.field1219 / var17.field1227;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1286();
                                for (int var21 = 0; var21 < var17.field1227; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1219) {
                                float[] var23 = var17.method1286();
                                for (int var24 = 0; var24 < var17.field1227; var24++) {
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
