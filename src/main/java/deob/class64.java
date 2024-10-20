package deob;

@ObfuscatedName("bw")
public class class64 {

    @ObfuscatedName("bw.k")
    public int field1283 = class74.method1493(16);

    @ObfuscatedName("bw.q")
    public int field1282 = class74.method1493(24);

    @ObfuscatedName("bw.f")
    public int field1284 = class74.method1493(24);

    @ObfuscatedName("bw.c")
    public int field1285 = class74.method1493(24) + 1;

    @ObfuscatedName("bw.v")
    public int field1286 = class74.method1493(6) + 1;

    @ObfuscatedName("bw.j")
    public int field1287 = class74.method1493(8);

    @ObfuscatedName("bw.m")
    public int[] field1288;

    public class64() {
        int[] var1 = new int[this.field1286];
        for (int var2 = 0; var2 < this.field1286; var2++) {
            int var3 = 0;
            int var4 = class74.method1493(3);
            boolean var5 = class74.method1511() != 0;
            if (var5) {
                var3 = class74.method1493(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field1288 = new int[this.field1286 * 8];
        for (int var6 = 0; var6 < this.field1286 * 8; var6++) {
            this.field1288[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class74.method1493(8);
        }
    }

    @ObfuscatedName("bw.k([FIZ)V")
    public void method1276(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field1358[this.field1287].field1415;
        int var6 = this.field1284 - this.field1282;
        int var7 = var6 / this.field1285;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field1358[this.field1287].method1541();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1286;
                        }
                        var11 /= this.field1286;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1288[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1285 * var10 + this.field1282;
                        class77 var17 = Statics.field1358[var15];
                        if (this.field1283 == 0) {
                            int var18 = this.field1285 / var17.field1415;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1547();
                                for (int var21 = 0; var21 < var17.field1415; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1285) {
                                float[] var23 = var17.method1547();
                                for (int var24 = 0; var24 < var17.field1415; var24++) {
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
