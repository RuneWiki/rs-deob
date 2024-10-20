package deob;

@ObfuscatedName("ev")
public class class148 {

    @ObfuscatedName("ev.n")
    public int[] field2044;

    @ObfuscatedName("ev.d")
    public int[] field2041;

    @ObfuscatedName("ev.m")
    public boolean field2038;

    @ObfuscatedName("ev.h")
    public int field2036;

    @ObfuscatedName("ev.w")
    public long field2040;

    @ObfuscatedName("ev.r")
    public long field2046;

    @ObfuscatedName("ev.q")
    public static final int[] field2043 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ev.l")
    public static class125 field2039 = new class125(260);

    @ObfuscatedName("ev.n([I[IZII)V")
    public void method2584(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2819; var6++) {
                    class193 var7 = class193.method785(var6);
                    if (var7 != null && !var7.field2829 && var7.field2823 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2043[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2044 = arg0;
        this.field2041 = arg1;
        this.field2038 = arg2;
        this.field2036 = arg3;
        this.method2588();
    }

    @ObfuscatedName("ev.d(IZS)V")
    public void method2585(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2038) {
            return;
        }
        int var3 = this.field2044[field2043[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class193 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2819) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2819 - 1;
                }
            }
            var4 = class193.method785(var3);
        } while (var4 == null || var4.field2829 || var4.field2823 != arg0 + (this.field2038 ? 7 : 0));
        this.field2044[field2043[arg0]] = var3 + 256;
        this.method2588();
    }

    @ObfuscatedName("ev.m(IZI)V")
    public void method2586(int arg0, boolean arg1) {
        int var3 = this.field2041[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1824[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1824[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2041[arg0] = var3;
        this.method2588();
    }

    @ObfuscatedName("ev.h(ZS)V")
    public void method2587(boolean arg0) {
        if (this.field2038 != arg0) {
            this.method2584((int[]) null, this.field2041, arg0, -1);
        }
    }

    @ObfuscatedName("ev.w(Lfa;I)V")
    public void method2615(class161 arg0) {
        arg0.method2765(this.field2038 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2044[field2043[var2]];
            if (var3 == 0) {
                arg0.method2765(-1);
            } else {
                arg0.method2765(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2765(this.field2041[var4]);
        }
    }

    @ObfuscatedName("ev.r(I)V")
    public void method2588() {
        long var1 = this.field2040;
        int var3 = this.field2044[5];
        int var4 = this.field2044[9];
        this.field2044[5] = var4;
        this.field2044[9] = var3;
        this.field2040 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2040 <<= 0x4;
            if (this.field2044[var5] >= 256) {
                this.field2040 += (long) (this.field2044[var5] - 256);
            }
        }
        if (this.field2044[0] >= 256) {
            this.field2040 += (long) (this.field2044[0] - 256 >> 4);
        }
        if (this.field2044[1] >= 256) {
            this.field2040 += (long) (this.field2044[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2040 <<= 0x3;
            this.field2040 += (long) this.field2041[var6];
        }
        this.field2040 <<= 0x1;
        this.field2040 += (long) (this.field2038 ? 1 : 0);
        this.field2044[5] = var3;
        this.field2044[9] = var4;
        if (var1 != 0L && this.field2040 != var1) {
            field2039.method2218(var1);
        }
    }

    @ObfuscatedName("ev.c(Lgm;ILgm;II)Lca;")
    public class83 method2589(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field2036 != -1) {
            return class200.method2713(this.field2036).method3512(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2040;
        int[] var7 = this.field2044;
        if (arg0 != null && (arg0.field3060 >= 0 || arg0.field3052 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2044[var8];
            }
            if (arg0.field3060 >= 0) {
                var5 += (long) (arg0.field3060 - this.field2044[5] << 40);
                var7[5] = arg0.field3060;
            }
            if (arg0.field3052 >= 0) {
                var5 += (long) (arg0.field3052 - this.field2044[3] << 48);
                var7[3] = arg0.field3052;
            }
        }
        class83 var9 = (class83) field2039.method2221(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class193.method785(var12 - 256).method3313()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class199.method207(var12 - 512).method3456(this.field2038)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2046 != -1L) {
                    var9 = (class83) field2039.method2221(this.field2046);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class77[] var13 = new class77[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class77 var17 = class193.method785(var16 - 256).method3300();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = class199.method207(var16 - 512).method3457(this.field2038);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2041[var20] < Statics.field1824[var20].length) {
                        var19.method1400(Statics.field2042[var20], Statics.field1824[var20][this.field2041[var20]]);
                    }
                    if (this.field2041[var20] < Statics.field1909[var20].length) {
                        var19.method1400(Statics.field236[var20], Statics.field1909[var20][this.field2041[var20]]);
                    }
                }
                var9 = var19.method1422(64, 850, -30, -50, -30);
                field2039.method2219(var9, var5);
                this.field2046 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3563(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3557(var9, arg3);
        } else {
            var21 = arg0.method3557(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ev.z(I)Lbz;")
    public class77 method2590() {
        if (this.field2036 != -1) {
            return class200.method2713(this.field2036).method3504();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2044[var2];
            if (var3 >= 256 && var3 < 512 && !class193.method785(var3 - 256).method3316()) {
                var1 = true;
            }
            if (var3 >= 512 && !class199.method207(var3 - 512).method3466(this.field2038)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class77[] var4 = new class77[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2044[var6];
            if (var7 >= 256 && var7 < 512) {
                class77 var8 = class193.method785(var7 - 256).method3309();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = class199.method207(var7 - 512).method3459(this.field2038);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2041[var11] < Statics.field1824[var11].length) {
                var10.method1400(Statics.field2042[var11], Statics.field1824[var11][this.field2041[var11]]);
            }
            if (this.field2041[var11] < Statics.field1909[var11].length) {
                var10.method1400(Statics.field236[var11], Statics.field1909[var11][this.field2041[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ev.q(I)I")
    public int method2591() {
        return this.field2036 == -1 ? (this.field2044[11] << 5) + (this.field2044[8] << 10) + (this.field2044[0] << 15) + (this.field2041[4] << 20) + (this.field2041[0] << 25) + this.field2044[1] : 305419896 + class200.method2713(this.field2036).field2997;
    }

    @ObfuscatedName("an.l(I)V")
    public static void method817() {
        field2039.method2220();
    }
}
