package deob;

@ObfuscatedName("bw")
public class class58 {

    @ObfuscatedName("bw.u")
    public int field1199 = class52.method1176(16);

    @ObfuscatedName("bw.k")
    public int field1202 = class52.method1176(24);

    @ObfuscatedName("bw.x")
    public int field1201 = class52.method1176(24);

    @ObfuscatedName("bw.m")
    public int field1204 = class52.method1176(24) + 1;

    @ObfuscatedName("bw.n")
    public int field1203 = class52.method1176(6) + 1;

    @ObfuscatedName("bw.q")
    public int field1200 = class52.method1176(8);

    @ObfuscatedName("bw.a")
    public int[] field1205;

    public class58() {
        int[] var1 = new int[this.field1203];
        for (int var2 = 0; var2 < this.field1203; var2++) {
            int var3 = 0;
            int var4 = class52.method1176(3);
            boolean var5 = class52.method1175() != 0;
            if (var5) {
                var3 = class52.method1176(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1205 = new int[this.field1203 * 8];
        for (int var6 = 0; var6 < this.field1203 * 8; var6++) {
            this.field1205[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class52.method1176(8);
        }
    }

    @ObfuscatedName("bw.u([FIZ)V")
    public void method1283(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1115[this.field1200].field1211;
        int var6 = this.field1201 - this.field1202;
        int var7 = var6 / this.field1204;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1115[this.field1200].method1287();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1203;
                        }
                        var11 /= this.field1203;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1205[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1204 * var10 + this.field1202;
                        class59 var17 = Statics.field1115[var15];
                        if (this.field1199 == 0) {
                            int var18 = this.field1204 / var17.field1211;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1292();
                                for (int var21 = 0; var21 < var17.field1211; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1204) {
                                float[] var23 = var17.method1292();
                                for (int var24 = 0; var24 < var17.field1211; var24++) {
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
