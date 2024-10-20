package deob;

@ObfuscatedName("br")
public class class65 {

    @ObfuscatedName("br.k")
    public int field1103 = class55.method979(16);

    @ObfuscatedName("br.y")
    public int field1102 = class55.method979(24);

    @ObfuscatedName("br.o")
    public int field1104 = class55.method979(24);

    @ObfuscatedName("br.r")
    public int field1106 = class55.method979(24) + 1;

    @ObfuscatedName("br.w")
    public int field1105 = class55.method979(6) + 1;

    @ObfuscatedName("br.j")
    public int field1101 = class55.method979(8);

    @ObfuscatedName("br.q")
    public int[] field1107;

    public class65() {
        int[] var1 = new int[this.field1105];
        for (int var2 = 0; var2 < this.field1105; var2++) {
            int var3 = 0;
            int var4 = class55.method979(3);
            boolean var5 = class55.method969() != 0;
            if (var5) {
                var3 = class55.method979(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1107 = new int[this.field1105 * 8];
        for (int var6 = 0; var6 < this.field1105 * 8; var6++) {
            this.field1107[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class55.method979(8);
        }
    }

    @ObfuscatedName("br.k([FIZ)V")
    public void method1129(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1001[this.field1101].field985;
        int var6 = this.field1104 - this.field1102;
        int var7 = var6 / this.field1106;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1001[this.field1101].method936();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1105;
                        }
                        var11 /= this.field1105;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1107[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1106 * var10 + this.field1102;
                        class53 var17 = Statics.field1001[var15];
                        if (this.field1103 == 0) {
                            int var18 = this.field1106 / var17.field985;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method937();
                                for (int var21 = 0; var21 < var17.field985; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1106) {
                                float[] var23 = var17.method937();
                                for (int var24 = 0; var24 < var17.field985; var24++) {
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
