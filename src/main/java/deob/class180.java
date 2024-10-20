package deob;

@ObfuscatedName("fq")
public class class180 {

    @ObfuscatedName("fq.a")
    public int[] field2929;

    @ObfuscatedName("fq.w")
    public int[] field2924;

    @ObfuscatedName("fq.d")
    public boolean field2925;

    @ObfuscatedName("fq.c")
    public int field2930;

    @ObfuscatedName("fq.y")
    public long field2927;

    @ObfuscatedName("fq.k")
    public long field2928;

    @ObfuscatedName("fq.e")
    public static final int[] field2931 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fq.x")
    public static class194 field2932 = new class194(260);

    @ObfuscatedName("fq.a([I[IZIB)V")
    public void method3343(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1039; var6++) {
                    class45 var7 = class45.method3060(var6);
                    if (var7 != null && !var7.field1048 && var5 + (arg2 ? 7 : 0) == var7.field1041) {
                        arg0[field2931[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2929 = arg0;
        this.field2924 = arg1;
        this.field2925 = arg2;
        this.field2930 = arg3;
        this.method3364();
    }

    @ObfuscatedName("fq.w(IZI)V")
    public void method3363(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2925) {
            return;
        }
        int var3 = this.field2929[field2931[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1039) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1039 - 1;
                }
            }
            var4 = class45.method3060(var3);
        } while (var4 == null || var4.field1048 || var4.field1041 != (this.field2925 ? 7 : 0) + arg0);
        this.field2929[field2931[arg0]] = var3 + 256;
        this.method3364();
    }

    @ObfuscatedName("fq.d(IZS)V")
    public void method3340(int arg0, boolean arg1) {
        int var3 = this.field2924[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2926[arg0].length) {
                    var3 = 0;
                }
            } while (!class175.method3034(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2926[arg0].length - 1;
                }
            } while (!class175.method3034(arg0, var3));
        }
        this.field2924[arg0] = var3;
        this.method3364();
    }

    @ObfuscatedName("fq.c(ZB)V")
    public void method3348(boolean arg0) {
        if (this.field2925 != arg0) {
            this.method3343((int[]) null, this.field2924, arg0, -1);
        }
    }

    @ObfuscatedName("fq.y(Ldx;B)V")
    public void method3342(class120 arg0) {
        arg0.method2452(this.field2925 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2929[field2931[var2]];
            if (var3 == 0) {
                arg0.method2452(-1);
            } else {
                arg0.method2452(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2452(this.field2924[var4]);
        }
    }

    @ObfuscatedName("fq.k(I)V")
    public void method3364() {
        long var1 = this.field2927;
        int var3 = this.field2929[5];
        int var4 = this.field2929[9];
        this.field2929[5] = var4;
        this.field2929[9] = var3;
        this.field2927 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2927 <<= 0x4;
            if (this.field2929[var5] >= 256) {
                this.field2927 += (long) (this.field2929[var5] - 256);
            }
        }
        if (this.field2929[0] >= 256) {
            this.field2927 += (long) (this.field2929[0] - 256 >> 4);
        }
        if (this.field2929[1] >= 256) {
            this.field2927 += (long) (this.field2929[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2927 <<= 0x3;
            this.field2927 += (long) this.field2924[var6];
        }
        this.field2927 <<= 0x1;
        this.field2927 += (long) (this.field2925 ? 1 : 0);
        this.field2929[5] = var3;
        this.field2929[9] = var4;
        if (var1 != 0L && this.field2927 != var1) {
            field2932.method3580(var1);
        }
    }

    @ObfuscatedName("fq.r(Lam;ILam;II)Ldr;")
    public class106 method3344(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2930 != -1) {
            return class40.method726(this.field2930).method838(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2927;
        int[] var7 = this.field2929;
        if (arg0 != null && (arg0.field995 >= 0 || arg0.field1002 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2929[var8];
            }
            if (arg0.field995 >= 0) {
                var5 += (long) (arg0.field995 - this.field2929[5] << 40);
                var7[5] = arg0.field995;
            }
            if (arg0.field1002 >= 0) {
                var5 += (long) (arg0.field1002 - this.field2929[3] << 48);
                var7[3] = arg0.field1002;
            }
        }
        class106 var9 = (class106) field2932.method3579(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method3060(var12 - 256).method1011()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method176(var12 - 512).method1112(this.field2925)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2928 != -1L) {
                    var9 = (class106) field2932.method3579(this.field2928);
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
                        class101 var17 = class45.method3060(var16 - 256).method1007();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class52.method176(var16 - 512).method1126(this.field2925);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2924[var20] < Statics.field2926[var20].length) {
                        var19.method2161(Statics.field265[var20], Statics.field2926[var20][this.field2924[var20]]);
                    }
                    if (this.field2924[var20] < Statics.field2923[var20].length) {
                        var19.method2161(Statics.field3019[var20], Statics.field2923[var20][this.field2924[var20]]);
                    }
                }
                var9 = var19.method2226(64, 850, -30, -50, -30);
                field2932.method3581(var9, var5);
                this.field2928 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class106 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method935(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method932(var9, arg3);
        } else {
            var21 = arg0.method932(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fq.p(B)Lcx;")
    public class101 method3345() {
        if (this.field2930 != -1) {
            return class40.method726(this.field2930).method839();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2929[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method3060(var3 - 256).method995()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method176(var3 - 512).method1109(this.field2925)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2929[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class45.method3060(var7 - 256).method1006();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class52.method176(var7 - 512).method1115(this.field2925);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2924[var11] < Statics.field2926[var11].length) {
                var10.method2161(Statics.field265[var11], Statics.field2926[var11][this.field2924[var11]]);
            }
            if (this.field2924[var11] < Statics.field2923[var11].length) {
                var10.method2161(Statics.field3019[var11], Statics.field2923[var11][this.field2924[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fq.q(B)I")
    public int method3346() {
        return this.field2930 == -1 ? (this.field2929[11] << 5) + (this.field2929[8] << 10) + (this.field2929[0] << 15) + (this.field2924[4] << 20) + (this.field2924[0] << 25) + this.field2929[1] : 305419896 + class40.method726(this.field2930).field891;
    }
}
