package deob;

@ObfuscatedName("fy")
public class class180 {

    @ObfuscatedName("fy.w")
    public int[] field2931;

    @ObfuscatedName("fy.x")
    public int[] field2932;

    @ObfuscatedName("fy.t")
    public boolean field2928;

    @ObfuscatedName("fy.p")
    public int field2929;

    @ObfuscatedName("fy.e")
    public long field2930;

    @ObfuscatedName("fy.y")
    public long field2935;

    @ObfuscatedName("fy.z")
    public static final int[] field2926 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fy.s")
    public static class194 field2934 = new class194(260);

    @ObfuscatedName("fy.w([I[IZII)V")
    public void method3276(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1042; var6++) {
                    class45 var7 = class45.method130(var6);
                    if (var7 != null && !var7.field1044 && var7.field1037 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2926[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2931 = arg0;
        this.field2932 = arg1;
        this.field2928 = arg2;
        this.field2929 = arg3;
        this.method3288();
    }

    @ObfuscatedName("fy.x(IZI)V")
    public void method3313(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2928) {
            return;
        }
        int var3 = this.field2931[field2926[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1042) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1042 - 1;
                }
            }
            var4 = class45.method130(var3);
        } while (var4 == null || var4.field1044 || (this.field2928 ? 7 : 0) + arg0 != var4.field1037);
        this.field2931[field2926[arg0]] = var3 + 256;
        this.method3288();
    }

    @ObfuscatedName("fy.t(IZI)V")
    public void method3278(int arg0, boolean arg1) {
        int var3 = this.field2932[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field585[arg0].length) {
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
                    var3 = Statics.field585[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2932[arg0] = var3;
        this.method3288();
    }

    @ObfuscatedName("fy.p(ZI)V")
    public void method3279(boolean arg0) {
        if (this.field2928 != arg0) {
            this.method3276((int[]) null, this.field2932, arg0, -1);
        }
    }

    @ObfuscatedName("fy.e(Lde;I)V")
    public void method3291(class120 arg0) {
        arg0.method2430(this.field2928 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2931[field2926[var2]];
            if (var3 == 0) {
                arg0.method2430(-1);
            } else {
                arg0.method2430(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2430(this.field2932[var4]);
        }
    }

    @ObfuscatedName("fy.y(I)V")
    public void method3288() {
        long var1 = this.field2930;
        int var3 = this.field2931[5];
        int var4 = this.field2931[9];
        this.field2931[5] = var4;
        this.field2931[9] = var3;
        this.field2930 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2930 <<= 0x4;
            if (this.field2931[var5] >= 256) {
                this.field2930 += (long) (this.field2931[var5] - 256);
            }
        }
        if (this.field2931[0] >= 256) {
            this.field2930 += (long) (this.field2931[0] - 256 >> 4);
        }
        if (this.field2931[1] >= 256) {
            this.field2930 += (long) (this.field2931[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2930 <<= 0x3;
            this.field2930 += (long) this.field2932[var6];
        }
        this.field2930 <<= 0x1;
        this.field2930 += (long) (this.field2928 ? 1 : 0);
        this.field2931[5] = var3;
        this.field2931[9] = var4;
        if (var1 != 0L && this.field2930 != var1) {
            field2934.method3519(var1);
        }
    }

    @ObfuscatedName("fy.m(Lao;ILao;II)Ldp;")
    public class106 method3282(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2929 != -1) {
            return class40.method745(this.field2929).method773(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2930;
        int[] var7 = this.field2931;
        if (arg0 != null && (arg0.field997 >= 0 || arg0.field1001 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2931[var8];
            }
            if (arg0.field997 >= 0) {
                var5 += (long) (arg0.field997 - this.field2931[5] << 40);
                var7[5] = arg0.field997;
            }
            if (arg0.field1001 >= 0) {
                var5 += (long) (arg0.field1001 - this.field2931[3] << 48);
                var7[3] = arg0.field1001;
            }
        }
        class106 var9 = (class106) field2934.method3520(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method130(var12 - 256).method936()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method1036(var12 - 512).method1066(this.field2928)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2935 != -1L) {
                    var9 = (class106) field2934.method3520(this.field2935);
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
                        class101 var17 = class45.method130(var16 - 256).method944();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class52.method1036(var16 - 512).method1050(this.field2928);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2932[var20] < Statics.field585[var20].length) {
                        var19.method2105(Statics.field788[var20], Statics.field585[var20][this.field2932[var20]]);
                    }
                    if (this.field2932[var20] < Statics.field1921[var20].length) {
                        var19.method2105(Statics.field2933[var20], Statics.field1921[var20][this.field2932[var20]]);
                    }
                }
                var9 = var19.method2079(64, 850, -30, -50, -30);
                field2934.method3522(var9, var5);
                this.field2935 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class106 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method890(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method883(var9, arg3);
        } else {
            var21 = arg0.method883(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fy.c(I)Lcu;")
    public class101 method3311() {
        if (this.field2929 != -1) {
            return class40.method745(this.field2929).method790();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2931[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method130(var3 - 256).method933()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method1036(var3 - 512).method1051(this.field2928)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2931[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class45.method130(var7 - 256).method939();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class52.method1036(var7 - 512).method1053(this.field2928);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2932[var11] < Statics.field585[var11].length) {
                var10.method2105(Statics.field788[var11], Statics.field585[var11][this.field2932[var11]]);
            }
            if (this.field2932[var11] < Statics.field1921[var11].length) {
                var10.method2105(Statics.field2933[var11], Statics.field1921[var11][this.field2932[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fy.v(B)I")
    public int method3275() {
        return this.field2929 == -1 ? (this.field2931[11] << 5) + (this.field2931[8] << 10) + (this.field2931[0] << 15) + (this.field2932[4] << 20) + (this.field2932[0] << 25) + this.field2931[1] : 305419896 + class40.method745(this.field2929).field890;
    }

    @ObfuscatedName("fd.l(B)V")
    public static void method3187() {
        field2934.method3525();
    }
}
