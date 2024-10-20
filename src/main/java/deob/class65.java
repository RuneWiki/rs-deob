package deob;

@ObfuscatedName("bz")
public class class65 {

    @ObfuscatedName("bz.x")
    public int field1112 = class55.method1048(16);

    @ObfuscatedName("bz.n")
    public int field1111 = class55.method1048(24);

    @ObfuscatedName("bz.g")
    public int field1113 = class55.method1048(24);

    @ObfuscatedName("bz.v")
    public int field1114 = class55.method1048(24) + 1;

    @ObfuscatedName("bz.y")
    public int field1115 = class55.method1048(6) + 1;

    @ObfuscatedName("bz.p")
    public int field1116 = class55.method1048(8);

    @ObfuscatedName("bz.j")
    public int[] field1117;

    public class65() {
        int[] var1 = new int[this.field1115];
        for (int var2 = 0; var2 < this.field1115; var2++) {
            int var3 = 0;
            int var4 = class55.method1048(3);
            boolean var5 = class55.method1068() != 0;
            if (var5) {
                var3 = class55.method1048(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1117 = new int[this.field1115 * 8];
        for (int var6 = 0; var6 < this.field1115 * 8; var6++) {
            this.field1117[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class55.method1048(8);
        }
    }

    @ObfuscatedName("bz.x([FIZ)V")
    public void method1200(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1011[this.field1116].field990;
        int var6 = this.field1113 - this.field1111;
        int var7 = var6 / this.field1114;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1011[this.field1116].method1018();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1115;
                        }
                        var11 /= this.field1115;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1117[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1114 * var10 + this.field1111;
                        class53 var17 = Statics.field1011[var15];
                        if (this.field1112 == 0) {
                            int var18 = this.field1114 / var17.field990;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1021();
                                for (int var21 = 0; var21 < var17.field990; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1114) {
                                float[] var23 = var17.method1021();
                                for (int var24 = 0; var24 < var17.field990; var24++) {
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
