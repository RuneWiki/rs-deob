package deob;

@ObfuscatedName("bd")
public class class59 {

    @ObfuscatedName("bd.i")
    public int field1215 = class53.method1151(16);

    @ObfuscatedName("bd.p")
    public int field1213 = class53.method1151(24);

    @ObfuscatedName("bd.a")
    public int field1214 = class53.method1151(24);

    @ObfuscatedName("bd.l")
    public int field1216 = class53.method1151(24) + 1;

    @ObfuscatedName("bd.q")
    public int field1212 = class53.method1151(6) + 1;

    @ObfuscatedName("bd.b")
    public int field1217 = class53.method1151(8);

    @ObfuscatedName("bd.u")
    public int[] field1218;

    public class59() {
        int[] var1 = new int[this.field1212];
        for (int var2 = 0; var2 < this.field1212; var2++) {
            int var3 = 0;
            int var4 = class53.method1151(3);
            boolean var5 = class53.method1150() != 0;
            if (var5) {
                var3 = class53.method1151(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1218 = new int[this.field1212 * 8];
        for (int var6 = 0; var6 < this.field1212 * 8; var6++) {
            this.field1218[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class53.method1151(8);
        }
    }

    @ObfuscatedName("bd.i([FIZ)V")
    public void method1237(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1148[this.field1217].field1221;
        int var6 = this.field1214 - this.field1213;
        int var7 = var6 / this.field1216;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1148[this.field1217].method1241();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1212;
                        }
                        var11 /= this.field1212;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1218[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1216 * var10 + this.field1213;
                        class60 var17 = Statics.field1148[var15];
                        if (this.field1215 == 0) {
                            int var18 = this.field1216 / var17.field1221;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1249();
                                for (int var21 = 0; var21 < var17.field1221; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1216) {
                                float[] var23 = var17.method1249();
                                for (int var24 = 0; var24 < var17.field1221; var24++) {
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
