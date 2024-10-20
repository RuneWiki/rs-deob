package deob;

@ObfuscatedName("bl")
public class class54 {

    @ObfuscatedName("bl.t")
    public int field1129 = class64.method1256(16);

    @ObfuscatedName("bl.o")
    public int field1126 = class64.method1256(24);

    @ObfuscatedName("bl.i")
    public int field1125 = class64.method1256(24);

    @ObfuscatedName("bl.p")
    public int field1128 = class64.method1256(24) + 1;

    @ObfuscatedName("bl.c")
    public int field1127 = class64.method1256(6) + 1;

    @ObfuscatedName("bl.y")
    public int field1130 = class64.method1256(8);

    @ObfuscatedName("bl.g")
    public int[] field1131;

    public class54() {
        int[] var1 = new int[this.field1127];
        for (int var2 = 0; var2 < this.field1127; var2++) {
            int var3 = 0;
            int var4 = class64.method1256(3);
            boolean var5 = class64.method1272() != 0;
            if (var5) {
                var3 = class64.method1256(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1131 = new int[this.field1127 * 8];
        for (int var6 = 0; var6 < this.field1127 * 8; var6++) {
            this.field1131[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class64.method1256(8);
        }
    }

    @ObfuscatedName("bl.t([FIZ)V")
    public void method1044(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1206[this.field1130].field1263;
        int var6 = this.field1125 - this.field1126;
        int var7 = var6 / this.field1128;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1206[this.field1130].method1309();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1127;
                        }
                        var11 /= this.field1127;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1131[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1128 * var10 + this.field1126;
                        class67 var17 = Statics.field1206[var15];
                        if (this.field1129 == 0) {
                            int var18 = this.field1128 / var17.field1263;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1318();
                                for (int var21 = 0; var21 < var17.field1263; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1128) {
                                float[] var23 = var17.method1318();
                                for (int var24 = 0; var24 < var17.field1263; var24++) {
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
