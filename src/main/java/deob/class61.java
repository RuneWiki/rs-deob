package deob;

@ObfuscatedName("bb")
public class class61 {

    @ObfuscatedName("bb.b")
    public int field1195 = class71.method1431(16);

    @ObfuscatedName("bb.g")
    public int field1192 = class71.method1431(24);

    @ObfuscatedName("bb.j")
    public int field1193 = class71.method1431(24);

    @ObfuscatedName("bb.d")
    public int field1194 = class71.method1431(24) + 1;

    @ObfuscatedName("bb.x")
    public int field1196 = class71.method1431(6) + 1;

    @ObfuscatedName("bb.y")
    public int field1197 = class71.method1431(8);

    @ObfuscatedName("bb.r")
    public int[] field1191;

    public class61() {
        int[] var1 = new int[this.field1196];
        for (int var2 = 0; var2 < this.field1196; var2++) {
            int var3 = 0;
            int var4 = class71.method1431(3);
            boolean var5 = class71.method1433() != 0;
            if (var5) {
                var3 = class71.method1431(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1191 = new int[this.field1196 * 8];
        for (int var6 = 0; var6 < this.field1196 * 8; var6++) {
            this.field1191[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class71.method1431(8);
        }
    }

    @ObfuscatedName("bb.b([FIZ)V")
    public void method1231(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1266[this.field1197].field1330;
        int var6 = this.field1193 - this.field1192;
        int var7 = var6 / this.field1194;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1266[this.field1197].method1493();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1196;
                        }
                        var11 /= this.field1196;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1191[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1194 * var10 + this.field1192;
                        class74 var17 = Statics.field1266[var15];
                        if (this.field1195 == 0) {
                            int var18 = this.field1194 / var17.field1330;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1491();
                                for (int var21 = 0; var21 < var17.field1330; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1194) {
                                float[] var23 = var17.method1491();
                                for (int var24 = 0; var24 < var17.field1330; var24++) {
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
