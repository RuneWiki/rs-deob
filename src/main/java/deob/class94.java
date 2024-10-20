package deob;

@ObfuscatedName("ct")
public class class94 {

    @ObfuscatedName("ct.q")
    public int[] field1243;

    @ObfuscatedName("ct.l")
    public int[] field1233;

    @ObfuscatedName("ct.a")
    public boolean field1238;

    @ObfuscatedName("ct.o")
    public int field1235;

    @ObfuscatedName("ct.c")
    public long field1236;

    @ObfuscatedName("ct.h")
    public long field1237;

    @ObfuscatedName("ct.v")
    public static final int[] field1241 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ct.f")
    public static class101 field1242 = new class101(260);

    @ObfuscatedName("ct.q([I[IZII)V")
    public void method1149(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2393; var6++) {
                    class158 var7 = class158.method767(var6);
                    if (var7 != null && !var7.field2398 && var7.field2395 == (arg2 ? 7 : 0) + var5) {
                        arg0[field1241[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field1243 = arg0;
        this.field1233 = arg1;
        this.field1238 = arg2;
        this.field1235 = arg3;
        this.method1147();
    }

    @ObfuscatedName("ct.l(IZI)V")
    public void method1145(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field1238) {
            return;
        }
        int var3 = this.field1243[field1241[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class158 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2393) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2393 - 1;
                }
            }
            var4 = class158.method767(var3);
        } while (var4 == null || var4.field2398 || arg0 + (this.field1238 ? 7 : 0) != var4.field2395);
        this.field1243[field1241[arg0]] = var3 + 256;
        this.method1147();
    }

    @ObfuscatedName("ct.a(IZB)V")
    public void method1148(int arg0, boolean arg1) {
        int var3 = this.field1233[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field1239[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field1239[arg0].length - 1;
            }
        }
        this.field1233[arg0] = var3;
        this.method1147();
    }

    @ObfuscatedName("ct.o(ZI)V")
    public void method1152(boolean arg0) {
        if (this.field1238 != arg0) {
            this.method1149((int[]) null, this.field1233, arg0, -1);
        }
    }

    @ObfuscatedName("ct.c(Let;I)V")
    public void method1150(class136 arg0) {
        arg0.method1612(this.field1238 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field1243[field1241[var2]];
            if (var3 == 0) {
                arg0.method1612(-1);
            } else {
                arg0.method1612(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method1612(this.field1233[var4]);
        }
    }

    @ObfuscatedName("ct.h(I)V")
    public void method1147() {
        long var1 = this.field1236;
        int var3 = this.field1243[5];
        int var4 = this.field1243[9];
        this.field1243[5] = var4;
        this.field1243[9] = var3;
        this.field1236 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1236 <<= 0x4;
            if (this.field1243[var5] >= 256) {
                this.field1236 += (long) (this.field1243[var5] - 256);
            }
        }
        if (this.field1243[0] >= 256) {
            this.field1236 += (long) (this.field1243[0] - 256 >> 4);
        }
        if (this.field1243[1] >= 256) {
            this.field1236 += (long) (this.field1243[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1236 <<= 0x3;
            this.field1236 += (long) this.field1233[var6];
        }
        this.field1236 <<= 0x1;
        this.field1236 += (long) (this.field1238 ? 1 : 0);
        this.field1243[5] = var3;
        this.field1243[9] = var4;
        if (var1 != 0L && this.field1236 != var1) {
            field1242.method1237(var1);
        }
    }

    @ObfuscatedName("ct.r(Leu;ILeu;IB)Lfb;")
    public class181 method1146(class156 arg0, int arg1, class156 arg2, int arg3) {
        if (this.field1235 != -1) {
            return class153.method1016(this.field1235).method2349(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field1236;
        int[] var7 = this.field1243;
        if (arg0 != null && (arg0.field2358 >= 0 || arg0.field2371 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field1243[var8];
            }
            if (arg0.field2358 >= 0) {
                var5 += (long) (arg0.field2358 - this.field1243[5] << 40);
                var7[5] = arg0.field2358;
            }
            if (arg0.field2371 >= 0) {
                var5 += (long) (arg0.field2371 - this.field1243[3] << 48);
                var7[3] = arg0.field2371;
            }
        }
        class181 var9 = (class181) field1242.method1236(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class158.method767(var12 - 256).method2489()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class162.method768(var12 - 512).method2525(this.field1238)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field1237 != -1L) {
                    var9 = (class181) field1242.method1236(this.field1237);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class180[] var13 = new class180[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class180 var17 = class158.method767(var16 - 256).method2472();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class180 var18 = class162.method768(var16 - 512).method2526(this.field1238);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class180 var19 = new class180(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field1233[var20] < Statics.field1239[var20].length) {
                        var19.method2930(Statics.field834[var20], Statics.field1239[var20][this.field1233[var20]]);
                    }
                    if (this.field1233[var20] < Statics.field1240[var20].length) {
                        var19.method2930(Statics.field1232[var20], Statics.field1240[var20][this.field1233[var20]]);
                    }
                }
                var9 = var19.method2938(64, 850, -30, -50, -30);
                field1242.method1238(var9, var5);
                this.field1237 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class181 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method2437(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method2420(var9, arg3);
        } else {
            var21 = arg0.method2420(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ct.d(I)Lfy;")
    public class180 method1153() {
        if (this.field1235 != -1) {
            return class153.method1016(this.field1235).method2338();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field1243[var2];
            if (var3 >= 256 && var3 < 512 && !class158.method767(var3 - 256).method2473()) {
                var1 = true;
            }
            if (var3 >= 512 && !class162.method768(var3 - 512).method2527(this.field1238)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class180[] var4 = new class180[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field1243[var6];
            if (var7 >= 256 && var7 < 512) {
                class180 var8 = class158.method767(var7 - 256).method2493();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class180 var9 = class162.method768(var7 - 512).method2528(this.field1238);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class180 var10 = new class180(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1233[var11] < Statics.field1239[var11].length) {
                var10.method2930(Statics.field834[var11], Statics.field1239[var11][this.field1233[var11]]);
            }
            if (this.field1233[var11] < Statics.field1240[var11].length) {
                var10.method2930(Statics.field1232[var11], Statics.field1240[var11][this.field1233[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ct.k(I)I")
    public int method1154() {
        return this.field1235 == -1 ? (this.field1243[11] << 5) + (this.field1243[8] << 10) + (this.field1243[0] << 15) + (this.field1233[0] << 25) + (this.field1233[4] << 20) + this.field1243[1] : 305419896 + class153.method1016(this.field1235).field2270;
    }

    @ObfuscatedName("bp.u(I)V")
    public static void method736() {
        field1242.method1239();
    }
}
