package deob;

@ObfuscatedName("fc")
public class class179 {

    @ObfuscatedName("fc.n")
    public int[] field2914;

    @ObfuscatedName("fc.q")
    public int[] field2909;

    @ObfuscatedName("fc.c")
    public boolean field2910;

    @ObfuscatedName("fc.l")
    public int field2908;

    @ObfuscatedName("fc.r")
    public long field2912;

    @ObfuscatedName("fc.u")
    public long field2913;

    @ObfuscatedName("fc.h")
    public static final int[] field2915 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fc.e")
    public static class193 field2911 = new class193(260);

    @ObfuscatedName("fc.n([I[IZII)V")
    public void method3230(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1038; var6++) {
                    class45 var7 = class45.method995(var6);
                    if (var7 != null && !var7.field1036 && (arg2 ? 7 : 0) + var5 == var7.field1041) {
                        arg0[field2915[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2914 = arg0;
        this.field2909 = arg1;
        this.field2910 = arg2;
        this.field2908 = arg3;
        this.method3251();
    }

    @ObfuscatedName("fc.q(IZI)V")
    public void method3232(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2910) {
            return;
        }
        int var3 = this.field2914[field2915[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1038) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1038 - 1;
                }
            }
            var4 = class45.method995(var3);
        } while (var4 == null || var4.field1036 || (this.field2910 ? 7 : 0) + arg0 != var4.field1041);
        this.field2914[field2915[arg0]] = var3 + 256;
        this.method3251();
    }

    @ObfuscatedName("fc.c(IZI)V")
    public void method3255(int arg0, boolean arg1) {
        int var3 = this.field2909[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2593[arg0].length) {
                    var3 = 0;
                }
            } while (!class174.method2311(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2593[arg0].length - 1;
                }
            } while (!class174.method2311(arg0, var3));
        }
        this.field2909[arg0] = var3;
        this.method3251();
    }

    @ObfuscatedName("fc.l(ZI)V")
    public void method3234(boolean arg0) {
        if (this.field2910 != arg0) {
            this.method3230((int[]) null, this.field2909, arg0, -1);
        }
    }

    @ObfuscatedName("fc.r(Ldc;B)V")
    public void method3233(class119 arg0) {
        arg0.method2345(this.field2910 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2914[field2915[var2]];
            if (var3 == 0) {
                arg0.method2345(-1);
            } else {
                arg0.method2345(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2345(this.field2909[var4]);
        }
    }

    @ObfuscatedName("fc.u(I)V")
    public void method3251() {
        long var1 = this.field2912;
        int var3 = this.field2914[5];
        int var4 = this.field2914[9];
        this.field2914[5] = var4;
        this.field2914[9] = var3;
        this.field2912 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2912 <<= 0x4;
            if (this.field2914[var5] >= 256) {
                this.field2912 += (long) (this.field2914[var5] - 256);
            }
        }
        if (this.field2914[0] >= 256) {
            this.field2912 += (long) (this.field2914[0] - 256 >> 4);
        }
        if (this.field2914[1] >= 256) {
            this.field2912 += (long) (this.field2914[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2912 <<= 0x3;
            this.field2912 += (long) this.field2909[var6];
        }
        this.field2912 <<= 0x1;
        this.field2912 += (long) (this.field2910 ? 1 : 0);
        this.field2914[5] = var3;
        this.field2914[9] = var4;
        if (var1 != 0L && this.field2912 != var1) {
            field2911.method3476(var1);
        }
    }

    @ObfuscatedName("fc.j(Laf;ILaf;II)Ldt;")
    public class105 method3235(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2908 != -1) {
            return class40.method177(this.field2908).method770(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2912;
        int[] var7 = this.field2914;
        if (arg0 != null && (arg0.field991 >= 0 || arg0.field992 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2914[var8];
            }
            if (arg0.field991 >= 0) {
                var5 += (long) (arg0.field991 - this.field2914[5] << 40);
                var7[5] = arg0.field991;
            }
            if (arg0.field992 >= 0) {
                var5 += (long) (arg0.field992 - this.field2914[3] << 48);
                var7[3] = arg0.field992;
            }
        }
        class105 var9 = (class105) field2911.method3475(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method995(var12 - 256).method921()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method724(var12 - 512).method1049(this.field2910)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2913 != -1L) {
                    var9 = (class105) field2911.method3475(this.field2913);
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
                        class100 var17 = class45.method995(var16 - 256).method922();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method724(var16 - 512).method1052(this.field2910);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2909[var20] < Statics.field2593[var20].length) {
                        var19.method2085(Statics.field2894[var20], Statics.field2593[var20][this.field2909[var20]]);
                    }
                    if (this.field2909[var20] < Statics.field2051[var20].length) {
                        var19.method2085(Statics.field1887[var20], Statics.field2051[var20][this.field2909[var20]]);
                    }
                }
                var9 = var19.method2079(64, 850, -30, -50, -30);
                field2911.method3488(var9, var5);
                this.field2913 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method863(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method869(var9, arg3);
        } else {
            var21 = arg0.method869(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fc.w(B)Lcg;")
    public class100 method3236() {
        if (this.field2908 != -1) {
            return class40.method177(this.field2908).method795();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2914[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method995(var3 - 256).method923()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method724(var3 - 512).method1031(this.field2910)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2914[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method995(var7 - 256).method924();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method724(var7 - 512).method1064(this.field2910);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2909[var11] < Statics.field2593[var11].length) {
                var10.method2085(Statics.field2894[var11], Statics.field2593[var11][this.field2909[var11]]);
            }
            if (this.field2909[var11] < Statics.field2051[var11].length) {
                var10.method2085(Statics.field1887[var11], Statics.field2051[var11][this.field2909[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fc.y(I)I")
    public int method3237() {
        return this.field2908 == -1 ? (this.field2914[11] << 5) + (this.field2914[8] << 10) + (this.field2914[0] << 15) + (this.field2909[4] << 20) + (this.field2909[0] << 25) + this.field2914[1] : 305419896 + class40.method177(this.field2908).field877;
    }
}
