package deob;

@ObfuscatedName("br")
public class class59 {

    @ObfuscatedName("br.p")
    public int field1213 = class53.method1259(16);

    @ObfuscatedName("br.l")
    public int field1210 = class53.method1259(24);

    @ObfuscatedName("br.d")
    public int field1211 = class53.method1259(24);

    @ObfuscatedName("br.x")
    public int field1212 = class53.method1259(24) + 1;

    @ObfuscatedName("br.o")
    public int field1209 = class53.method1259(6) + 1;

    @ObfuscatedName("br.a")
    public int field1214 = class53.method1259(8);

    @ObfuscatedName("br.w")
    public int[] field1215;

    public class59() {
        int[] var1 = new int[this.field1209];
        for (int var2 = 0; var2 < this.field1209; var2++) {
            int var3 = 0;
            int var4 = class53.method1259(3);
            boolean var5 = class53.method1241() != 0;
            if (var5) {
                var3 = class53.method1259(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1215 = new int[this.field1209 * 8];
        for (int var6 = 0; var6 < this.field1209 * 8; var6++) {
            this.field1215[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class53.method1259(8);
        }
    }

    @ObfuscatedName("br.p([FIZ)V")
    public void method1333(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1128[this.field1214].field1221;
        int var6 = this.field1211 - this.field1210;
        int var7 = var6 / this.field1212;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1128[this.field1214].method1338();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1209;
                        }
                        var11 /= this.field1209;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1215[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1212 * var10 + this.field1210;
                        class60 var17 = Statics.field1128[var15];
                        if (this.field1213 == 0) {
                            int var18 = this.field1212 / var17.field1221;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1339();
                                for (int var21 = 0; var21 < var17.field1221; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1212) {
                                float[] var23 = var17.method1339();
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
