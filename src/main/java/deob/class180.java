package deob;

@ObfuscatedName("fv")
public class class180 {

    @ObfuscatedName("fv.b")
    public int[] field2919;

    @ObfuscatedName("fv.g")
    public int[] field2913;

    @ObfuscatedName("fv.j")
    public boolean field2914;

    @ObfuscatedName("fv.d")
    public int field2912;

    @ObfuscatedName("fv.x")
    public long field2916;

    @ObfuscatedName("fv.y")
    public long field2917;

    @ObfuscatedName("fv.p")
    public static final int[] field2921 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fv.n")
    public static class194 field2915 = new class194(260);

    @ObfuscatedName("fv.b([I[IZII)V")
    public void method3281(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1011; var6++) {
                    class45 var7 = class45.method1775(var6);
                    if (var7 != null && !var7.field1017 && var7.field1010 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2921[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2919 = arg0;
        this.field2913 = arg1;
        this.field2914 = arg2;
        this.field2912 = arg3;
        this.method3256();
    }

    @ObfuscatedName("fv.g(IZB)V")
    public void method3252(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2914) {
            return;
        }
        int var3 = this.field2919[field2921[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1011) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1011 - 1;
                }
            }
            var4 = class45.method1775(var3);
        } while (var4 == null || var4.field1017 || var4.field1010 != (this.field2914 ? 7 : 0) + arg0);
        this.field2919[field2921[arg0]] = var3 + 256;
        this.method3256();
    }

    @ObfuscatedName("fv.j(IZB)V")
    public void method3253(int arg0, boolean arg1) {
        int var3 = this.field2913[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field761[arg0].length) {
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
                    var3 = Statics.field761[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2913[arg0] = var3;
        this.method3256();
    }

    @ObfuscatedName("fv.d(ZI)V")
    public void method3285(boolean arg0) {
        if (this.field2914 != arg0) {
            this.method3281((int[]) null, this.field2913, arg0, -1);
        }
    }

    @ObfuscatedName("fv.x(Lds;I)V")
    public void method3257(class120 arg0) {
        arg0.method2480(this.field2914 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2919[field2921[var2]];
            if (var3 == 0) {
                arg0.method2480(-1);
            } else {
                arg0.method2480(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2480(this.field2913[var4]);
        }
    }

    @ObfuscatedName("fv.y(I)V")
    public void method3256() {
        long var1 = this.field2916;
        int var3 = this.field2919[5];
        int var4 = this.field2919[9];
        this.field2919[5] = var4;
        this.field2919[9] = var3;
        this.field2916 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2916 <<= 0x4;
            if (this.field2919[var5] >= 256) {
                this.field2916 += (long) (this.field2919[var5] - 256);
            }
        }
        if (this.field2919[0] >= 256) {
            this.field2916 += (long) (this.field2919[0] - 256 >> 4);
        }
        if (this.field2919[1] >= 256) {
            this.field2916 += (long) (this.field2919[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2916 <<= 0x3;
            this.field2916 += (long) this.field2913[var6];
        }
        this.field2916 <<= 0x1;
        this.field2916 += (long) (this.field2914 ? 1 : 0);
        this.field2919[5] = var3;
        this.field2919[9] = var4;
        if (var1 != 0L && this.field2916 != var1) {
            field2915.method3488(var1);
        }
    }

    @ObfuscatedName("fv.r(Lau;ILau;IB)Ldd;")
    public class106 method3284(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2912 != -1) {
            return class40.method3225(this.field2912).method752(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2916;
        int[] var7 = this.field2919;
        if (arg0 != null && (arg0.field975 >= 0 || arg0.field976 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2919[var8];
            }
            if (arg0.field975 >= 0) {
                var5 += (long) (arg0.field975 - this.field2919[5] << 40);
                var7[5] = arg0.field975;
            }
            if (arg0.field976 >= 0) {
                var5 += (long) (arg0.field976 - this.field2919[3] << 48);
                var7[3] = arg0.field976;
            }
        }
        class106 var9 = (class106) field2915.method3495(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method1775(var12 - 256).method904()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method727(var12 - 512).method1006(this.field2914)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2917 != -1L) {
                    var9 = (class106) field2915.method3495(this.field2917);
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
                        class101 var17 = class45.method1775(var16 - 256).method905();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class52.method727(var16 - 512).method1007(this.field2914);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2913[var20] < Statics.field761[var20].length) {
                        var19.method2064(Statics.field2918[var20], Statics.field761[var20][this.field2913[var20]]);
                    }
                    if (this.field2913[var20] < Statics.field2920[var20].length) {
                        var19.method2064(Statics.field2923[var20], Statics.field2920[var20][this.field2913[var20]]);
                    }
                }
                var9 = var19.method2072(64, 850, -30, -50, -30);
                field2915.method3490(var9, var5);
                this.field2917 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class106 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method853(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method875(var9, arg3);
        } else {
            var21 = arg0.method875(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fv.c(B)Lch;")
    public class101 method3283() {
        if (this.field2912 != -1) {
            return class40.method3225(this.field2912).method774();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2919[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method1775(var3 - 256).method916()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method727(var3 - 512).method1010(this.field2914)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2919[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class45.method1775(var7 - 256).method907();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class52.method727(var7 - 512).method1009(this.field2914);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2913[var11] < Statics.field761[var11].length) {
                var10.method2064(Statics.field2918[var11], Statics.field761[var11][this.field2913[var11]]);
            }
            if (this.field2913[var11] < Statics.field2920[var11].length) {
                var10.method2064(Statics.field2923[var11], Statics.field2920[var11][this.field2913[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fv.l(I)I")
    public int method3259() {
        return this.field2912 == -1 ? (this.field2919[11] << 5) + (this.field2919[8] << 10) + (this.field2919[0] << 15) + (this.field2913[0] << 25) + (this.field2913[4] << 20) + this.field2919[1] : 305419896 + class40.method3225(this.field2912).field868;
    }

    @ObfuscatedName("dl.u(I)V")
    public static void method2271() {
        field2915.method3486();
    }
}
