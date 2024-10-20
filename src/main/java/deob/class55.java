package deob;

@ObfuscatedName("bj")
public class class55 {

    @ObfuscatedName("bj.b")
    public int field1126 = class65.method1257(16);

    @ObfuscatedName("bj.e")
    public int field1125 = class65.method1257(24);

    @ObfuscatedName("bj.i")
    public int field1127 = class65.method1257(24);

    @ObfuscatedName("bj.k")
    public int field1128 = class65.method1257(24) + 1;

    @ObfuscatedName("bj.h")
    public int field1129 = class65.method1257(6) + 1;

    @ObfuscatedName("bj.p")
    public int field1130 = class65.method1257(8);

    @ObfuscatedName("bj.n")
    public int[] field1131;

    public class55() {
        int[] var1 = new int[this.field1129];
        for (int var2 = 0; var2 < this.field1129; var2++) {
            int var3 = 0;
            int var4 = class65.method1257(3);
            boolean var5 = class65.method1256() != 0;
            if (var5) {
                var3 = class65.method1257(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1131 = new int[this.field1129 * 8];
        for (int var6 = 0; var6 < this.field1129 * 8; var6++) {
            this.field1131[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class65.method1257(8);
        }
    }

    @ObfuscatedName("bj.b([FIZ)V")
    public void method1052(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1201[this.field1130].field1260;
        int var6 = this.field1127 - this.field1125;
        int var7 = var6 / this.field1128;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1201[this.field1130].method1304();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1129;
                        }
                        var11 /= this.field1129;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1131[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1128 * var10 + this.field1125;
                        class68 var17 = Statics.field1201[var15];
                        if (this.field1126 == 0) {
                            int var18 = this.field1128 / var17.field1260;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1311();
                                for (int var21 = 0; var21 < var17.field1260; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1128) {
                                float[] var23 = var17.method1311();
                                for (int var24 = 0; var24 < var17.field1260; var24++) {
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
