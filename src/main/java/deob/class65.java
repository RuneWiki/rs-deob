package deob;

@ObfuscatedName("bw")
public class class65 {

    @ObfuscatedName("bw.f")
    public int field1128 = class55.method999(16);

    @ObfuscatedName("bw.i")
    public int field1125 = class55.method999(24);

    @ObfuscatedName("bw.u")
    public int field1126 = class55.method999(24);

    @ObfuscatedName("bw.h")
    public int field1124 = class55.method999(24) + 1;

    @ObfuscatedName("bw.r")
    public int field1130 = class55.method999(6) + 1;

    @ObfuscatedName("bw.o")
    public int field1129 = class55.method999(8);

    @ObfuscatedName("bw.l")
    public int[] field1127;

    public class65() {
        int[] var1 = new int[this.field1130];
        for (int var2 = 0; var2 < this.field1130; var2++) {
            int var3 = 0;
            int var4 = class55.method999(3);
            boolean var5 = class55.method998() != 0;
            if (var5) {
                var3 = class55.method999(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1127 = new int[this.field1130 * 8];
        for (int var6 = 0; var6 < this.field1130 * 8; var6++) {
            this.field1127[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class55.method999(8);
        }
    }

    @ObfuscatedName("bw.f([FIZ)V")
    public void method1144(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1022[this.field1129].field1004;
        int var6 = this.field1126 - this.field1125;
        int var7 = var6 / this.field1124;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1022[this.field1129].method966();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1130;
                        }
                        var11 /= this.field1130;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1127[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1124 * var10 + this.field1125;
                        class53 var17 = Statics.field1022[var15];
                        if (this.field1128 == 0) {
                            int var18 = this.field1124 / var17.field1004;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method975();
                                for (int var21 = 0; var21 < var17.field1004; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1124) {
                                float[] var23 = var17.method975();
                                for (int var24 = 0; var24 < var17.field1004; var24++) {
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
