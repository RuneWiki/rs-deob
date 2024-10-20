package deob;

@ObfuscatedName("bb")
public class class56 {

    @ObfuscatedName("bb.o")
    public int field1149 = class66.method1335(16);

    @ObfuscatedName("bb.l")
    public int field1147 = class66.method1335(24);

    @ObfuscatedName("bb.g")
    public int field1148 = class66.method1335(24);

    @ObfuscatedName("bb.u")
    public int field1150 = class66.method1335(24) + 1;

    @ObfuscatedName("bb.q")
    public int field1146 = class66.method1335(6) + 1;

    @ObfuscatedName("bb.r")
    public int field1151 = class66.method1335(8);

    @ObfuscatedName("bb.v")
    public int[] field1152;

    public class56() {
        int[] var1 = new int[this.field1146];
        for (int var2 = 0; var2 < this.field1146; var2++) {
            int var3 = 0;
            int var4 = class66.method1335(3);
            boolean var5 = class66.method1334() != 0;
            if (var5) {
                var3 = class66.method1335(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1152 = new int[this.field1146 * 8];
        for (int var6 = 0; var6 < this.field1146 * 8; var6++) {
            this.field1152[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class66.method1335(8);
        }
    }

    @ObfuscatedName("bb.o([FIZ)V")
    public void method1148(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1222[this.field1151].field1281;
        int var6 = this.field1148 - this.field1147;
        int var7 = var6 / this.field1150;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1222[this.field1151].method1378();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1146;
                        }
                        var11 /= this.field1146;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1152[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1150 * var10 + this.field1147;
                        class69 var17 = Statics.field1222[var15];
                        if (this.field1149 == 0) {
                            int var18 = this.field1150 / var17.field1281;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1375();
                                for (int var21 = 0; var21 < var17.field1281; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1150) {
                                float[] var23 = var17.method1375();
                                for (int var24 = 0; var24 < var17.field1281; var24++) {
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
