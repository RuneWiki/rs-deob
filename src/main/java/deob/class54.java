package deob;

@ObfuscatedName("bq")
public class class54 {

    @ObfuscatedName("bq.y")
    public int field1110 = class64.method1255(16);

    @ObfuscatedName("bq.u")
    public int field1108 = class64.method1255(24);

    @ObfuscatedName("bq.k")
    public int field1109 = class64.method1255(24);

    @ObfuscatedName("bq.v")
    public int field1113 = class64.method1255(24) + 1;

    @ObfuscatedName("bq.l")
    public int field1111 = class64.method1255(6) + 1;

    @ObfuscatedName("bq.g")
    public int field1112 = class64.method1255(8);

    @ObfuscatedName("bq.a")
    public int[] field1107;

    public class54() {
        int[] var1 = new int[this.field1111];
        for (int var2 = 0; var2 < this.field1111; var2++) {
            int var3 = 0;
            int var4 = class64.method1255(3);
            boolean var5 = class64.method1254() != 0;
            if (var5) {
                var3 = class64.method1255(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1107 = new int[this.field1111 * 8];
        for (int var6 = 0; var6 < this.field1111 * 8; var6++) {
            this.field1107[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class64.method1255(8);
        }
    }

    @ObfuscatedName("bq.y([FIZ)V")
    public void method1053(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1183[this.field1112].field1249;
        int var6 = this.field1109 - this.field1108;
        int var7 = var6 / this.field1113;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1183[this.field1112].method1303();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1111;
                        }
                        var11 /= this.field1111;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1107[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1113 * var10 + this.field1108;
                        class67 var17 = Statics.field1183[var15];
                        if (this.field1110 == 0) {
                            int var18 = this.field1113 / var17.field1249;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1306();
                                for (int var21 = 0; var21 < var17.field1249; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1113) {
                                float[] var23 = var17.method1306();
                                for (int var24 = 0; var24 < var17.field1249; var24++) {
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
