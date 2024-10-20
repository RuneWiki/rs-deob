package deob;

@ObfuscatedName("bc")
public class class61 {

    @ObfuscatedName("bc.l")
    public int field1214 = class71.method1461(16);

    @ObfuscatedName("bc.e")
    public int field1209 = class71.method1461(24);

    @ObfuscatedName("bc.q")
    public int field1210 = class71.method1461(24);

    @ObfuscatedName("bc.o")
    public int field1211 = class71.method1461(24) + 1;

    @ObfuscatedName("bc.g")
    public int field1212 = class71.method1461(6) + 1;

    @ObfuscatedName("bc.m")
    public int field1213 = class71.method1461(8);

    @ObfuscatedName("bc.b")
    public int[] field1208;

    public class61() {
        int[] var1 = new int[this.field1212];
        for (int var2 = 0; var2 < this.field1212; var2++) {
            int var3 = 0;
            int var4 = class71.method1461(3);
            boolean var5 = class71.method1460() != 0;
            if (var5) {
                var3 = class71.method1461(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1208 = new int[this.field1212 * 8];
        for (int var6 = 0; var6 < this.field1212 * 8; var6++) {
            this.field1208[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class71.method1461(8);
        }
    }

    @ObfuscatedName("bc.l([FIZ)V")
    public void method1262(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1276[this.field1213].field1342;
        int var6 = this.field1210 - this.field1209;
        int var7 = var6 / this.field1211;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1276[this.field1213].method1516();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1212;
                        }
                        var11 /= this.field1212;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1208[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1211 * var10 + this.field1209;
                        class74 var17 = Statics.field1276[var15];
                        if (this.field1214 == 0) {
                            int var18 = this.field1211 / var17.field1342;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1512();
                                for (int var21 = 0; var21 < var17.field1342; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1211) {
                                float[] var23 = var17.method1512();
                                for (int var24 = 0; var24 < var17.field1342; var24++) {
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
