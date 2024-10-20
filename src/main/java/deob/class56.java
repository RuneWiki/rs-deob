package deob;

@ObfuscatedName("by")
public class class56 {

    @ObfuscatedName("by.n")
    public int field1182 = class66.method1361(16);

    @ObfuscatedName("by.g")
    public int field1179 = class66.method1361(24);

    @ObfuscatedName("by.a")
    public int field1180 = class66.method1361(24);

    @ObfuscatedName("by.m")
    public int field1181 = class66.method1361(24) + 1;

    @ObfuscatedName("by.s")
    public int field1184 = class66.method1361(6) + 1;

    @ObfuscatedName("by.j")
    public int field1183 = class66.method1361(8);

    @ObfuscatedName("by.f")
    public int[] field1178;

    public class56() {
        int[] var1 = new int[this.field1184];
        for (int var2 = 0; var2 < this.field1184; var2++) {
            int var3 = 0;
            int var4 = class66.method1361(3);
            boolean var5 = class66.method1342() != 0;
            if (var5) {
                var3 = class66.method1361(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1178 = new int[this.field1184 * 8];
        for (int var6 = 0; var6 < this.field1184 * 8; var6++) {
            this.field1178[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class66.method1361(8);
        }
    }

    @ObfuscatedName("by.n([FIZ)V")
    public void method1130(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1254[this.field1183].field1315;
        int var6 = this.field1180 - this.field1179;
        int var7 = var6 / this.field1181;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1254[this.field1183].method1402();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1184;
                        }
                        var11 /= this.field1184;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1178[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1181 * var10 + this.field1179;
                        class69 var17 = Statics.field1254[var15];
                        if (this.field1182 == 0) {
                            int var18 = this.field1181 / var17.field1315;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1400();
                                for (int var21 = 0; var21 < var17.field1315; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1181) {
                                float[] var23 = var17.method1400();
                                for (int var24 = 0; var24 < var17.field1315; var24++) {
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
