package deob;

@ObfuscatedName("fq")
public class class179 {

    @ObfuscatedName("fq.z")
    public int[] field2905;

    @ObfuscatedName("fq.q")
    public int[] field2903;

    @ObfuscatedName("fq.k")
    public boolean field2904;

    @ObfuscatedName("fq.f")
    public int field2906;

    @ObfuscatedName("fq.d")
    public long field2909;

    @ObfuscatedName("fq.l")
    public long field2907;

    @ObfuscatedName("fq.j")
    public static final int[] field2908 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fq.a")
    public static class193 field2910 = new class193(260);

    @ObfuscatedName("fq.z([I[IZII)V")
    public void method3185(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2029; var6++) {
                    class45 var7 = class45.method874(var6);
                    if (var7 != null && !var7.field1026 && (arg2 ? 7 : 0) + var5 == var7.field1019) {
                        arg0[field2908[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2905 = arg0;
        this.field2903 = arg1;
        this.field2904 = arg2;
        this.field2906 = arg3;
        this.method3184();
    }

    @ObfuscatedName("fq.q(IZI)V")
    public void method3190(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2904) {
            return;
        }
        int var3 = this.field2905[field2908[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2029) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2029 - 1;
                }
            }
            var4 = class45.method874(var3);
        } while (var4 == null || var4.field1026 || (this.field2904 ? 7 : 0) + arg0 != var4.field1019);
        this.field2905[field2908[arg0]] = var3 + 256;
        this.method3184();
    }

    @ObfuscatedName("fq.k(IZB)V")
    public void method3203(int arg0, boolean arg1) {
        int var3 = this.field2903[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2902[arg0].length) {
                    var3 = 0;
                }
            } while (!class174.method701(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2902[arg0].length - 1;
                }
            } while (!class174.method701(arg0, var3));
        }
        this.field2903[arg0] = var3;
        this.method3184();
    }

    @ObfuscatedName("fq.f(ZI)V")
    public void method3207(boolean arg0) {
        if (this.field2904 != arg0) {
            this.method3185((int[]) null, this.field2903, arg0, -1);
        }
    }

    @ObfuscatedName("fq.d(Lda;I)V")
    public void method3198(class119 arg0) {
        arg0.method2285(this.field2904 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2905[field2908[var2]];
            if (var3 == 0) {
                arg0.method2285(-1);
            } else {
                arg0.method2285(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2285(this.field2903[var4]);
        }
    }

    @ObfuscatedName("fq.l(I)V")
    public void method3184() {
        long var1 = this.field2909;
        int var3 = this.field2905[5];
        int var4 = this.field2905[9];
        this.field2905[5] = var4;
        this.field2905[9] = var3;
        this.field2909 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2909 <<= 0x4;
            if (this.field2905[var5] >= 256) {
                this.field2909 += (long) (this.field2905[var5] - 256);
            }
        }
        if (this.field2905[0] >= 256) {
            this.field2909 += (long) (this.field2905[0] - 256 >> 4);
        }
        if (this.field2905[1] >= 256) {
            this.field2909 += (long) (this.field2905[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2909 <<= 0x3;
            this.field2909 += (long) this.field2903[var6];
        }
        this.field2909 <<= 0x1;
        this.field2909 += (long) (this.field2904 ? 1 : 0);
        this.field2905[5] = var3;
        this.field2905[9] = var4;
        if (var1 != 0L && this.field2909 != var1) {
            field2910.method3428(var1);
        }
    }

    @ObfuscatedName("fq.r(Lah;ILah;IB)Ldb;")
    public class105 method3193(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2906 != -1) {
            return class40.method2177(this.field2906).method730(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2909;
        int[] var7 = this.field2905;
        if (arg0 != null && (arg0.field990 >= 0 || arg0.field989 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2905[var8];
            }
            if (arg0.field990 >= 0) {
                var5 += (long) (arg0.field990 - this.field2905[5] << 40);
                var7[5] = arg0.field990;
            }
            if (arg0.field989 >= 0) {
                var5 += (long) (arg0.field989 - this.field2905[3] << 48);
                var7[3] = arg0.field989;
            }
        }
        class105 var9 = (class105) field2910.method3439(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method874(var12 - 256).method877()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method10(var12 - 512).method997(this.field2904)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2907 != -1L) {
                    var9 = (class105) field2910.method3439(this.field2907);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class100[] var13 = new class100[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class100 var17 = class45.method874(var16 - 256).method878();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method10(var16 - 512).method998(this.field2904);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2903[var20] < Statics.field2902[var20].length) {
                        var19.method2010(Statics.field3198[var20], Statics.field2902[var20][this.field2903[var20]]);
                    }
                    if (this.field2903[var20] < Statics.field2644[var20].length) {
                        var19.method2010(Statics.field768[var20], Statics.field2644[var20][this.field2903[var20]]);
                    }
                }
                var9 = var19.method2019(64, 850, -30, -50, -30);
                field2910.method3429(var9, var5);
                this.field2907 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method843(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method825(var9, arg3);
        } else {
            var21 = arg0.method825(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fq.g(B)Lcn;")
    public class100 method3192() {
        if (this.field2906 != -1) {
            return class40.method2177(this.field2906).method731();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2905[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method874(var3 - 256).method879()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method10(var3 - 512).method1027(this.field2904)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2905[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method874(var7 - 256).method880();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method10(var7 - 512).method999(this.field2904);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2903[var11] < Statics.field2902[var11].length) {
                var10.method2010(Statics.field3198[var11], Statics.field2902[var11][this.field2903[var11]]);
            }
            if (this.field2903[var11] < Statics.field2644[var11].length) {
                var10.method2010(Statics.field768[var11], Statics.field2644[var11][this.field2903[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fq.h(I)I")
    public int method3188() {
        return this.field2906 == -1 ? (this.field2905[11] << 5) + (this.field2905[8] << 10) + (this.field2905[0] << 15) + (this.field2903[0] << 25) + (this.field2903[4] << 20) + this.field2905[1] : 305419896 + class40.method2177(this.field2906).field887;
    }
}
