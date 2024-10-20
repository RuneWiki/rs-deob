package deob;

@ObfuscatedName("bf")
public class class59 {

    @ObfuscatedName("bf.d")
    public int field1210 = class53.method1179(16);

    @ObfuscatedName("bf.g")
    public int field1212 = class53.method1179(24);

    @ObfuscatedName("bf.a")
    public int field1208 = class53.method1179(24);

    @ObfuscatedName("bf.t")
    public int field1209 = class53.method1179(24) + 1;

    @ObfuscatedName("bf.f")
    public int field1207 = class53.method1179(6) + 1;

    @ObfuscatedName("bf.c")
    public int field1211 = class53.method1179(8);

    @ObfuscatedName("bf.p")
    public int[] field1206;

    public class59() {
        int[] var1 = new int[this.field1207];
        for (int var2 = 0; var2 < this.field1207; var2++) {
            int var3 = 0;
            int var4 = class53.method1179(3);
            boolean var5 = class53.method1167() != 0;
            if (var5) {
                var3 = class53.method1179(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1206 = new int[this.field1207 * 8];
        for (int var6 = 0; var6 < this.field1207 * 8; var6++) {
            this.field1206[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class53.method1179(8);
        }
    }

    @ObfuscatedName("bf.d([FIZ)V")
    public void method1258(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1125[this.field1211].field1218;
        int var6 = this.field1208 - this.field1212;
        int var7 = var6 / this.field1209;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1125[this.field1211].method1262();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1207;
                        }
                        var11 /= this.field1207;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1206[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1209 * var10 + this.field1212;
                        class60 var17 = Statics.field1125[var15];
                        if (this.field1210 == 0) {
                            int var18 = this.field1209 / var17.field1218;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1263();
                                for (int var21 = 0; var21 < var17.field1218; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1209) {
                                float[] var23 = var17.method1263();
                                for (int var24 = 0; var24 < var17.field1218; var24++) {
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
