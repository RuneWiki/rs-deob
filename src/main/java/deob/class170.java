package deob;

@ObfuscatedName("fy")
public class class170 {

    @ObfuscatedName("fy.b")
    public int[] field2808;

    @ObfuscatedName("fy.e")
    public int[] field2809;

    @ObfuscatedName("fy.a")
    public boolean field2798;

    @ObfuscatedName("fy.k")
    public int field2799;

    @ObfuscatedName("fy.p")
    public long field2800;

    @ObfuscatedName("fy.l")
    public long field2801;

    @ObfuscatedName("fy.v")
    public static final int[] field2796 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fy.n")
    public static class184 field2803 = new class184(260);

    @ObfuscatedName("fy.b([I[IZII)V")
    public void method3042(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field958; var6++) {
                    class42 var7 = class42.method2420(var6);
                    if (var7 != null && !var7.field963 && var5 + (arg2 ? 7 : 0) == var7.field959) {
                        arg0[field2796[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2808 = arg0;
        this.field2809 = arg1;
        this.field2798 = arg2;
        this.field2799 = arg3;
        this.method3027();
    }

    @ObfuscatedName("fy.e(IZI)V")
    public void method3023(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2798) {
            return;
        }
        int var3 = this.field2808[field2796[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class42 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field958) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field958 - 1;
                }
            }
            var4 = class42.method2420(var3);
        } while (var4 == null || var4.field963 || (this.field2798 ? 7 : 0) + arg0 != var4.field959);
        this.field2808[field2796[arg0]] = var3 + 256;
        this.method3027();
    }

    @ObfuscatedName("fy.a(IZB)V")
    public void method3024(int arg0, boolean arg1) {
        int var3 = this.field2809[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field540[arg0].length) {
                    var3 = 0;
                }
            } while (!class165.method598(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field540[arg0].length - 1;
                }
            } while (!class165.method598(arg0, var3));
        }
        this.field2809[arg0] = var3;
        this.method3027();
    }

    @ObfuscatedName("fy.k(ZI)V")
    public void method3025(boolean arg0) {
        if (this.field2798 != arg0) {
            this.method3042((int[]) null, this.field2809, arg0, -1);
        }
    }

    @ObfuscatedName("fy.p(Ldj;I)V")
    public void method3051(class111 arg0) {
        arg0.method2112(this.field2798 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2808[field2796[var2]];
            if (var3 == 0) {
                arg0.method2112(-1);
            } else {
                arg0.method2112(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2112(this.field2809[var4]);
        }
    }

    @ObfuscatedName("fy.l(B)V")
    public void method3027() {
        long var1 = this.field2800;
        int var3 = this.field2808[5];
        int var4 = this.field2808[9];
        this.field2808[5] = var4;
        this.field2808[9] = var3;
        this.field2800 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2800 <<= 0x4;
            if (this.field2808[var5] >= 256) {
                this.field2800 += (long) (this.field2808[var5] - 256);
            }
        }
        if (this.field2808[0] >= 256) {
            this.field2800 += (long) (this.field2808[0] - 256 >> 4);
        }
        if (this.field2808[1] >= 256) {
            this.field2800 += (long) (this.field2808[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2800 <<= 0x3;
            this.field2800 += (long) this.field2809[var6];
        }
        this.field2800 <<= 0x1;
        this.field2800 += (long) (this.field2798 ? 1 : 0);
        this.field2808[5] = var3;
        this.field2808[9] = var4;
        if (var1 != 0L && this.field2800 != var1) {
            field2803.method3255(var1);
        }
    }

    @ObfuscatedName("fy.u(Laz;ILaz;IB)Lcx;")
    public class100 method3028(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field2799 != -1) {
            return class37.method890(this.field2799).method638(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2800;
        int[] var7 = this.field2808;
        if (arg0 != null && (arg0.field926 >= 0 || arg0.field929 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2808[var8];
            }
            if (arg0.field926 >= 0) {
                var5 += (long) (arg0.field926 - this.field2808[5] << 40);
                var7[5] = arg0.field926;
            }
            if (arg0.field929 >= 0) {
                var5 += (long) (arg0.field929 - this.field2808[3] << 48);
                var7[3] = arg0.field929;
            }
        }
        class100 var9 = (class100) field2803.method3254(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class42.method2420(var12 - 256).method793()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class47.method1037(var12 - 512).method880(this.field2798)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2801 != -1L) {
                    var9 = (class100) field2803.method3254(this.field2801);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class95[] var13 = new class95[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class95 var17 = class42.method2420(var16 - 256).method781();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class95 var18 = class47.method1037(var16 - 512).method881(this.field2798);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class95 var19 = new class95(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2809[var20] < Statics.field540[var20].length) {
                        var19.method1877(Statics.field539[var20], Statics.field540[var20][this.field2809[var20]]);
                    }
                    if (this.field2809[var20] < Statics.field2802[var20].length) {
                        var19.method1877(Statics.field1481[var20], Statics.field2802[var20][this.field2809[var20]]);
                    }
                }
                var9 = var19.method1898(64, 850, -30, -50, -30);
                field2803.method3256(var9, var5);
                this.field2801 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class100 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method736(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method733(var9, arg3);
        } else {
            var21 = arg0.method733(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fy.o(I)Lcc;")
    public class95 method3029() {
        if (this.field2799 != -1) {
            return class37.method890(this.field2799).method642();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2808[var2];
            if (var3 >= 256 && var3 < 512 && !class42.method2420(var3 - 256).method785()) {
                var1 = true;
            }
            if (var3 >= 512 && !class47.method1037(var3 - 512).method916(this.field2798)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class95[] var4 = new class95[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2808[var6];
            if (var7 >= 256 && var7 < 512) {
                class95 var8 = class42.method2420(var7 - 256).method786();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class95 var9 = class47.method1037(var7 - 512).method883(this.field2798);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class95 var10 = new class95(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2809[var11] < Statics.field540[var11].length) {
                var10.method1877(Statics.field539[var11], Statics.field540[var11][this.field2809[var11]]);
            }
            if (this.field2809[var11] < Statics.field2802[var11].length) {
                var10.method1877(Statics.field1481[var11], Statics.field2802[var11][this.field2809[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fy.m(I)I")
    public int method3030() {
        return this.field2799 == -1 ? (this.field2808[11] << 5) + (this.field2808[8] << 10) + (this.field2808[0] << 15) + (this.field2809[0] << 25) + (this.field2809[4] << 20) + this.field2808[1] : 305419896 + class37.method890(this.field2799).field811;
    }
}
