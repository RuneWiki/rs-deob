package deob;

@ObfuscatedName("br")
public class class59 {

    @ObfuscatedName("br.t")
    public int field1248 = class53.method1234(16);

    @ObfuscatedName("br.l")
    public int field1247 = class53.method1234(24);

    @ObfuscatedName("br.c")
    public int field1249 = class53.method1234(24);

    @ObfuscatedName("br.d")
    public int field1250 = class53.method1234(24) + 1;

    @ObfuscatedName("br.b")
    public int field1251 = class53.method1234(6) + 1;

    @ObfuscatedName("br.i")
    public int field1252 = class53.method1234(8);

    @ObfuscatedName("br.p")
    public int[] field1253;

    public class59() {
        int[] var1 = new int[this.field1251];
        for (int var2 = 0; var2 < this.field1251; var2++) {
            int var3 = 0;
            int var4 = class53.method1234(3);
            boolean var5 = class53.method1211() != 0;
            if (var5) {
                var3 = class53.method1234(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1253 = new int[this.field1251 * 8];
        for (int var6 = 0; var6 < this.field1251 * 8; var6++) {
            this.field1253[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class53.method1234(8);
        }
    }

    @ObfuscatedName("br.t([FIZ)V")
    public void method1294(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1166[this.field1252].field1258;
        int var6 = this.field1249 - this.field1247;
        int var7 = var6 / this.field1250;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1166[this.field1252].method1301();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1251;
                        }
                        var11 /= this.field1251;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1253[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1250 * var10 + this.field1247;
                        class60 var17 = Statics.field1166[var15];
                        if (this.field1248 == 0) {
                            int var18 = this.field1250 / var17.field1258;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1302();
                                for (int var21 = 0; var21 < var17.field1258; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1250) {
                                float[] var23 = var17.method1302();
                                for (int var24 = 0; var24 < var17.field1258; var24++) {
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
