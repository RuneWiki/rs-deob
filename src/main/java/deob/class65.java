package deob;

@ObfuscatedName("bl")
public class class65 {

    @ObfuscatedName("bl.o")
    public int field1103 = class55.method941(16);

    @ObfuscatedName("bl.m")
    public int field1098 = class55.method941(24);

    @ObfuscatedName("bl.b")
    public int field1099 = class55.method941(24);

    @ObfuscatedName("bl.g")
    public int field1100 = class55.method941(24) + 1;

    @ObfuscatedName("bl.h")
    public int field1097 = class55.method941(6) + 1;

    @ObfuscatedName("bl.v")
    public int field1102 = class55.method941(8);

    @ObfuscatedName("bl.l")
    public int[] field1101;

    public class65() {
        int[] var1 = new int[this.field1097];
        for (int var2 = 0; var2 < this.field1097; var2++) {
            int var3 = 0;
            int var4 = class55.method941(3);
            boolean var5 = class55.method940() != 0;
            if (var5) {
                var3 = class55.method941(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1101 = new int[this.field1097 * 8];
        for (int var6 = 0; var6 < this.field1097 * 8; var6++) {
            this.field1101[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class55.method941(8);
        }
    }

    @ObfuscatedName("bl.o([FIZ)V")
    public void method1101(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1010[this.field1102].field983;
        int var6 = this.field1099 - this.field1098;
        int var7 = var6 / this.field1100;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1010[this.field1102].method912();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1097;
                        }
                        var11 /= this.field1097;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1101[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1100 * var10 + this.field1098;
                        class53 var17 = Statics.field1010[var15];
                        if (this.field1103 == 0) {
                            int var18 = this.field1100 / var17.field983;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method915();
                                for (int var21 = 0; var21 < var17.field983; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1100) {
                                float[] var23 = var17.method915();
                                for (int var24 = 0; var24 < var17.field983; var24++) {
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
