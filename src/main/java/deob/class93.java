package deob;

@ObfuscatedName("ca")
public class class93 {

    @ObfuscatedName("ca.t")
    public int[] field1224;

    @ObfuscatedName("ca.n")
    public int[] field1226;

    @ObfuscatedName("ca.q")
    public boolean field1221;

    @ObfuscatedName("ca.h")
    public int field1220;

    @ObfuscatedName("ca.k")
    public long field1222;

    @ObfuscatedName("ca.r")
    public long field1227;

    @ObfuscatedName("ca.g")
    public static final int[] field1223 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ca.w")
    public static class100 field1228 = new class100(260);

    @ObfuscatedName("ca.t([I[IZII)V")
    public void method1130(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field713; var6++) {
                    class157 var7 = class157.method1214(var6);
                    if (var7 != null && !var7.field2388 && var5 + (arg2 ? 7 : 0) == var7.field2390) {
                        arg0[field1223[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field1224 = arg0;
        this.field1226 = arg1;
        this.field1221 = arg2;
        this.field1220 = arg3;
        this.method1135();
    }

    @ObfuscatedName("ca.n(IZB)V")
    public void method1131(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field1221) {
            return;
        }
        int var3 = this.field1224[field1223[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class157 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field713) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field713 - 1;
                }
            }
            var4 = class157.method1214(var3);
        } while (var4 == null || var4.field2388 || (this.field1221 ? 7 : 0) + arg0 != var4.field2390);
        this.field1224[field1223[arg0]] = var3 + 256;
        this.method1135();
    }

    @ObfuscatedName("ca.q(IZI)V")
    public void method1132(int arg0, boolean arg1) {
        int var3 = this.field1226[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field1225[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field1225[arg0].length - 1;
            }
        }
        this.field1226[arg0] = var3;
        this.method1135();
    }

    @ObfuscatedName("ca.h(ZB)V")
    public void method1136(boolean arg0) {
        if (this.field1221 != arg0) {
            this.method1130((int[]) null, this.field1226, arg0, -1);
        }
    }

    @ObfuscatedName("ca.k(Lec;I)V")
    public void method1142(class135 arg0) {
        arg0.method1558(this.field1221 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field1224[field1223[var2]];
            if (var3 == 0) {
                arg0.method1558(-1);
            } else {
                arg0.method1558(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method1558(this.field1226[var4]);
        }
    }

    @ObfuscatedName("ca.r(I)V")
    public void method1135() {
        long var1 = this.field1222;
        int var3 = this.field1224[5];
        int var4 = this.field1224[9];
        this.field1224[5] = var4;
        this.field1224[9] = var3;
        this.field1222 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1222 <<= 0x4;
            if (this.field1224[var5] >= 256) {
                this.field1222 += (long) (this.field1224[var5] - 256);
            }
        }
        if (this.field1224[0] >= 256) {
            this.field1222 += (long) (this.field1224[0] - 256 >> 4);
        }
        if (this.field1224[1] >= 256) {
            this.field1222 += (long) (this.field1224[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1222 <<= 0x3;
            this.field1222 += (long) this.field1226[var6];
        }
        this.field1222 <<= 0x1;
        this.field1222 += (long) (this.field1221 ? 1 : 0);
        this.field1224[5] = var3;
        this.field1224[9] = var4;
        if (var1 != 0L && this.field1222 != var1) {
            field1228.method1226(var1);
        }
    }

    @ObfuscatedName("ca.l(Lea;ILea;II)Lfr;")
    public class180 method1138(class155 arg0, int arg1, class155 arg2, int arg3) {
        if (this.field1220 != -1) {
            return Statics.method1335(this.field1220).method2314(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field1222;
        int[] var7 = this.field1224;
        if (arg0 != null && (arg0.field2367 >= 0 || arg0.field2357 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field1224[var8];
            }
            if (arg0.field2367 >= 0) {
                var5 += (long) (arg0.field2367 - this.field1224[5] << 40);
                var7[5] = arg0.field2367;
            }
            if (arg0.field2357 >= 0) {
                var5 += (long) (arg0.field2357 - this.field1224[3] << 48);
                var7[3] = arg0.field2357;
            }
        }
        class180 var9 = (class180) field1228.method1231(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class157.method1214(var12 - 256).method2434()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class161.method2496(var12 - 512).method2505(this.field1221)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field1227 != -1L) {
                    var9 = (class180) field1228.method1231(this.field1227);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class179[] var13 = new class179[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class179 var17 = class157.method1214(var16 - 256).method2440();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class179 var18 = class161.method2496(var16 - 512).method2512(this.field1221);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class179 var19 = new class179(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field1226[var20] < Statics.field1225[var20].length) {
                        var19.method2920(Statics.field124[var20], Statics.field1225[var20][this.field1226[var20]]);
                    }
                    if (this.field1226[var20] < Statics.field1219[var20].length) {
                        var19.method2920(Statics.field736[var20], Statics.field1219[var20][this.field1226[var20]]);
                    }
                }
                var9 = var19.method2928(64, 850, -30, -50, -30);
                field1228.method1232(var9, var5);
                this.field1227 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class180 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method2389(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method2386(var9, arg3);
        } else {
            var21 = arg0.method2386(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ca.i(B)Lfv;")
    public class179 method1152() {
        if (this.field1220 != -1) {
            return Statics.method1335(this.field1220).method2326();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field1224[var2];
            if (var3 >= 256 && var3 < 512 && !class157.method1214(var3 - 256).method2449()) {
                var1 = true;
            }
            if (var3 >= 512 && !class161.method2496(var3 - 512).method2507(this.field1221)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class179[] var4 = new class179[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field1224[var6];
            if (var7 >= 256 && var7 < 512) {
                class179 var8 = class157.method1214(var7 - 256).method2437();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class179 var9 = class161.method2496(var7 - 512).method2529(this.field1221);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class179 var10 = new class179(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1226[var11] < Statics.field1225[var11].length) {
                var10.method2920(Statics.field124[var11], Statics.field1225[var11][this.field1226[var11]]);
            }
            if (this.field1226[var11] < Statics.field1219[var11].length) {
                var10.method2920(Statics.field736[var11], Statics.field1219[var11][this.field1226[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ca.e(I)I")
    public int method1133() {
        return this.field1220 == -1 ? (this.field1224[11] << 5) + (this.field1224[8] << 10) + (this.field1224[0] << 15) + (this.field1226[4] << 20) + (this.field1226[0] << 25) + this.field1224[1] : 305419896 + Statics.method1335(this.field1220).field2292;
    }
}
