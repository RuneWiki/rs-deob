package deob;

@ObfuscatedName("bb")
public class class64 {

    @ObfuscatedName("bb.s")
    public int field1267 = class74.method1470(16);

    @ObfuscatedName("bb.z")
    public int field1265 = class74.method1470(24);

    @ObfuscatedName("bb.t")
    public int field1268 = class74.method1470(24);

    @ObfuscatedName("bb.y")
    public int field1271 = class74.method1470(24) + 1;

    @ObfuscatedName("bb.p")
    public int field1269 = class74.method1470(6) + 1;

    @ObfuscatedName("bb.g")
    public int field1270 = class74.method1470(8);

    @ObfuscatedName("bb.m")
    public int[] field1266;

    public class64() {
        int[] var1 = new int[this.field1269];
        for (int var2 = 0; var2 < this.field1269; var2++) {
            int var3 = 0;
            int var4 = class74.method1470(3);
            boolean var5 = class74.method1469() != 0;
            if (var5) {
                var3 = class74.method1470(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1266 = new int[this.field1269 * 8];
        for (int var6 = 0; var6 < this.field1269 * 8; var6++) {
            this.field1266[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class74.method1470(8);
        }
    }

    @ObfuscatedName("bb.s([FIZ)V")
    public void method1265(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1341[this.field1270].field1403;
        int var6 = this.field1268 - this.field1265;
        int var7 = var6 / this.field1271;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1341[this.field1270].method1524();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1269;
                        }
                        var11 /= this.field1269;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1266[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1271 * var10 + this.field1265;
                        class77 var17 = Statics.field1341[var15];
                        if (this.field1267 == 0) {
                            int var18 = this.field1271 / var17.field1403;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1519();
                                for (int var21 = 0; var21 < var17.field1403; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1271) {
                                float[] var23 = var17.method1519();
                                for (int var24 = 0; var24 < var17.field1403; var24++) {
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
