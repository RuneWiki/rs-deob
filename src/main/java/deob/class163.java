package deob;

@ObfuscatedName("fd")
public class class163 {

    @ObfuscatedName("fd.a")
    public int[] field2723;

    @ObfuscatedName("fd.r")
    public int[] field2717;

    @ObfuscatedName("fd.u")
    public boolean field2719;

    @ObfuscatedName("fd.t")
    public int field2727;

    @ObfuscatedName("fd.k")
    public long field2721;

    @ObfuscatedName("fd.x")
    public long field2722;

    @ObfuscatedName("fd.i")
    public static final int[] field2725 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fd.p")
    public static class170 field2726 = new class170(260);

    @ObfuscatedName("fd.a([I[IZIB)V")
    public void method3126(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field909; var6++) {
                    class36 var7 = class36.method1321(var6);
                    if (var7 != null && !var7.field914 && var7.field916 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2725[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2723 = arg0;
        this.field2717 = arg1;
        this.field2719 = arg2;
        this.field2727 = arg3;
        this.method3131();
    }

    @ObfuscatedName("fd.r(IZB)V")
    public void method3146(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2719) {
            return;
        }
        int var3 = this.field2723[field2725[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field909) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field909 - 1;
                }
            }
            var4 = class36.method1321(var3);
        } while (var4 == null || var4.field914 || (this.field2719 ? 7 : 0) + arg0 != var4.field916);
        this.field2723[field2725[arg0]] = var3 + 256;
        this.method3131();
    }

    @ObfuscatedName("fd.u(IZB)V")
    public void method3128(int arg0, boolean arg1) {
        int var3 = this.field2717[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2554[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2554[arg0].length - 1;
            }
        }
        this.field2717[arg0] = var3;
        this.method3131();
    }

    @ObfuscatedName("fd.t(ZI)V")
    public void method3151(boolean arg0) {
        if (this.field2719 != arg0) {
            this.method3126((int[]) null, this.field2717, arg0, -1);
        }
    }

    @ObfuscatedName("fd.k(Ldf;B)V")
    public void method3129(class126 arg0) {
        arg0.method2364(this.field2719 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2723[field2725[var2]];
            if (var3 == 0) {
                arg0.method2364(-1);
            } else {
                arg0.method2364(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2364(this.field2717[var4]);
        }
    }

    @ObfuscatedName("fd.x(I)V")
    public void method3131() {
        long var1 = this.field2721;
        int var3 = this.field2723[5];
        int var4 = this.field2723[9];
        this.field2723[5] = var4;
        this.field2723[9] = var3;
        this.field2721 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2721 <<= 0x4;
            if (this.field2723[var5] >= 256) {
                this.field2721 += (long) (this.field2723[var5] - 256);
            }
        }
        if (this.field2723[0] >= 256) {
            this.field2721 += (long) (this.field2723[0] - 256 >> 4);
        }
        if (this.field2723[1] >= 256) {
            this.field2721 += (long) (this.field2723[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2721 <<= 0x3;
            this.field2721 += (long) this.field2717[var6];
        }
        this.field2721 <<= 0x1;
        this.field2721 += (long) (this.field2719 ? 1 : 0);
        this.field2723[5] = var3;
        this.field2723[9] = var4;
        if (var1 != 0L && this.field2721 != var1) {
            field2726.method3207(var1);
        }
    }

    @ObfuscatedName("fd.v(Laf;ILaf;II)Ldw;")
    public class112 method3132(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2727 != -1) {
            return class31.method1792(this.field2727).method581(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2721;
        int[] var7 = this.field2723;
        if (arg0 != null && (arg0.field871 >= 0 || arg0.field876 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2723[var8];
            }
            if (arg0.field871 >= 0) {
                var5 += (long) (arg0.field871 - this.field2723[5] << 40);
                var7[5] = arg0.field871;
            }
            if (arg0.field876 >= 0) {
                var5 += (long) (arg0.field876 - this.field2723[3] << 48);
                var7[3] = arg0.field876;
            }
        }
        class112 var9 = (class112) field2726.method3208(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method1321(var12 - 256).method702()) {
                    var10 = true;
                }
                if (var12 >= 512 && !Statics.method1799(var12 - 512).method772(this.field2719)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2722 != -1L) {
                    var9 = (class112) field2726.method3208(this.field2722);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class101[] var13 = new class101[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class101 var17 = class36.method1321(var16 - 256).method722();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = Statics.method1799(var16 - 512).method796(this.field2719);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2717[var20] < Statics.field2554[var20].length) {
                        var19.method2006(Statics.field2718[var20], Statics.field2554[var20][this.field2717[var20]]);
                    }
                    if (this.field2717[var20] < Statics.field725[var20].length) {
                        var19.method2006(Statics.field2720[var20], Statics.field725[var20][this.field2717[var20]]);
                    }
                }
                var9 = var19.method2014(64, 850, -30, -50, -30);
                field2726.method3210(var9, var5);
                this.field2722 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method666(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method656(var9, arg3);
        } else {
            var21 = arg0.method656(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fd.g(B)Lck;")
    public class101 method3133() {
        if (this.field2727 != -1) {
            return class31.method1792(this.field2727).method556();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2723[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method1321(var3 - 256).method699()) {
                var1 = true;
            }
            if (var3 >= 512 && !Statics.method1799(var3 - 512).method782(this.field2719)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2723[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method1321(var7 - 256).method707();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = Statics.method1799(var7 - 512).method778(this.field2719);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2717[var11] < Statics.field2554[var11].length) {
                var10.method2006(Statics.field2718[var11], Statics.field2554[var11][this.field2717[var11]]);
            }
            if (this.field2717[var11] < Statics.field725[var11].length) {
                var10.method2006(Statics.field2720[var11], Statics.field725[var11][this.field2717[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fd.n(B)I")
    public int method3134() {
        return this.field2727 == -1 ? (this.field2723[11] << 5) + (this.field2723[8] << 10) + (this.field2723[0] << 15) + (this.field2717[0] << 25) + (this.field2717[4] << 20) + this.field2723[1] : 305419896 + class31.method1792(this.field2727).field761;
    }
}
