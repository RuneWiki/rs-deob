package deob;

@ObfuscatedName("bk")
public class class58 {

    @ObfuscatedName("bk.c")
    public int field1193 = class52.method1144(16);

    @ObfuscatedName("bk.j")
    public int field1189 = class52.method1144(24);

    @ObfuscatedName("bk.f")
    public int field1190 = class52.method1144(24);

    @ObfuscatedName("bk.y")
    public int field1188 = class52.method1144(24) + 1;

    @ObfuscatedName("bk.x")
    public int field1192 = class52.method1144(6) + 1;

    @ObfuscatedName("bk.e")
    public int field1191 = class52.method1144(8);

    @ObfuscatedName("bk.m")
    public int[] field1194;

    public class58() {
        int[] var1 = new int[this.field1192];
        for (int var2 = 0; var2 < this.field1192; var2++) {
            int var3 = 0;
            int var4 = class52.method1144(3);
            boolean var5 = class52.method1173() != 0;
            if (var5) {
                var3 = class52.method1144(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1194 = new int[this.field1192 * 8];
        for (int var6 = 0; var6 < this.field1192 * 8; var6++) {
            this.field1194[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class52.method1144(8);
        }
    }

    @ObfuscatedName("bk.c([FIZ)V")
    public void method1248(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1109[this.field1191].field1198;
        int var6 = this.field1190 - this.field1189;
        int var7 = var6 / this.field1188;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1109[this.field1191].method1254();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1192;
                        }
                        var11 /= this.field1192;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1194[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1188 * var10 + this.field1189;
                        class59 var17 = Statics.field1109[var15];
                        if (this.field1193 == 0) {
                            int var18 = this.field1188 / var17.field1198;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1255();
                                for (int var21 = 0; var21 < var17.field1198; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1188) {
                                float[] var23 = var17.method1255();
                                for (int var24 = 0; var24 < var17.field1198; var24++) {
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
