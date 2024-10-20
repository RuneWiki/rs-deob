package deob;

@ObfuscatedName("bp")
public class class55 {

    @ObfuscatedName("bp.x")
    public int field1138 = class65.method1302(16);

    @ObfuscatedName("bp.v")
    public int field1136 = class65.method1302(24);

    @ObfuscatedName("bp.m")
    public int field1137 = class65.method1302(24);

    @ObfuscatedName("bp.e")
    public int field1139 = class65.method1302(24) + 1;

    @ObfuscatedName("bp.h")
    public int field1140 = class65.method1302(6) + 1;

    @ObfuscatedName("bp.p")
    public int field1141 = class65.method1302(8);

    @ObfuscatedName("bp.j")
    public int[] field1142;

    public class55() {
        int[] var1 = new int[this.field1140];
        for (int var2 = 0; var2 < this.field1140; var2++) {
            int var3 = 0;
            int var4 = class65.method1302(3);
            boolean var5 = class65.method1284() != 0;
            if (var5) {
                var3 = class65.method1302(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1142 = new int[this.field1140 * 8];
        for (int var6 = 0; var6 < this.field1140 * 8; var6++) {
            this.field1142[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class65.method1302(8);
        }
    }

    @ObfuscatedName("bp.x([FIZ)V")
    public void method1102(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1212[this.field1141].field1273;
        int var6 = this.field1137 - this.field1136;
        int var7 = var6 / this.field1139;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1212[this.field1141].method1338();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1140;
                        }
                        var11 /= this.field1140;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1142[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1139 * var10 + this.field1136;
                        class68 var17 = Statics.field1212[var15];
                        if (this.field1138 == 0) {
                            int var18 = this.field1139 / var17.field1273;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1339();
                                for (int var21 = 0; var21 < var17.field1273; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1139) {
                                float[] var23 = var17.method1339();
                                for (int var24 = 0; var24 < var17.field1273; var24++) {
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
