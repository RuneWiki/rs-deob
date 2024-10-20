package deob;

@ObfuscatedName("fl")
public class class179 {

    @ObfuscatedName("fl.g")
    public int[] field2909;

    @ObfuscatedName("fl.b")
    public int[] field2900;

    @ObfuscatedName("fl.w")
    public boolean field2901;

    @ObfuscatedName("fl.d")
    public int field2902;

    @ObfuscatedName("fl.z")
    public long field2904;

    @ObfuscatedName("fl.l")
    public long field2910;

    @ObfuscatedName("fl.v")
    public static final int[] field2906 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fl.o")
    public static class193 field2907 = new class193(260);

    @ObfuscatedName("fl.g([I[IZII)V")
    public void method3283(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1031; var6++) {
                    class45 var7 = class45.method2073(var6);
                    if (var7 != null && !var7.field1040 && var5 + (arg2 ? 7 : 0) == var7.field1037) {
                        arg0[field2906[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2909 = arg0;
        this.field2900 = arg1;
        this.field2901 = arg2;
        this.field2902 = arg3;
        this.method3288();
    }

    @ObfuscatedName("fl.b(IZI)V")
    public void method3284(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2901) {
            return;
        }
        int var3 = this.field2909[field2906[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1031) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1031 - 1;
                }
            }
            var4 = class45.method2073(var3);
        } while (var4 == null || var4.field1040 || arg0 + (this.field2901 ? 7 : 0) != var4.field1037);
        this.field2909[field2906[arg0]] = var3 + 256;
        this.method3288();
    }

    @ObfuscatedName("fl.w(IZI)V")
    public void method3295(int arg0, boolean arg1) {
        int var3 = this.field2900[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2905[arg0].length) {
                    var3 = 0;
                }
            } while (!class174.method131(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2905[arg0].length - 1;
                }
            } while (!class174.method131(arg0, var3));
        }
        this.field2900[arg0] = var3;
        this.method3288();
    }

    @ObfuscatedName("fl.d(ZB)V")
    public void method3286(boolean arg0) {
        if (this.field2901 != arg0) {
            this.method3283((int[]) null, this.field2900, arg0, -1);
        }
    }

    @ObfuscatedName("fl.z(Ldm;I)V")
    public void method3313(class119 arg0) {
        arg0.method2476(this.field2901 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2909[field2906[var2]];
            if (var3 == 0) {
                arg0.method2476(-1);
            } else {
                arg0.method2476(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2476(this.field2900[var4]);
        }
    }

    @ObfuscatedName("fl.l(B)V")
    public void method3288() {
        long var1 = this.field2904;
        int var3 = this.field2909[5];
        int var4 = this.field2909[9];
        this.field2909[5] = var4;
        this.field2909[9] = var3;
        this.field2904 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2904 <<= 0x4;
            if (this.field2909[var5] >= 256) {
                this.field2904 += (long) (this.field2909[var5] - 256);
            }
        }
        if (this.field2909[0] >= 256) {
            this.field2904 += (long) (this.field2909[0] - 256 >> 4);
        }
        if (this.field2909[1] >= 256) {
            this.field2904 += (long) (this.field2909[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2904 <<= 0x3;
            this.field2904 += (long) this.field2900[var6];
        }
        this.field2904 <<= 0x1;
        this.field2904 += (long) (this.field2901 ? 1 : 0);
        this.field2909[5] = var3;
        this.field2909[9] = var4;
        if (var1 != 0L && this.field2904 != var1) {
            field2907.method3534(var1);
        }
    }

    @ObfuscatedName("fl.m(Laj;ILaj;IS)Ldd;")
    public class105 method3306(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2902 != -1) {
            return class40.method140(this.field2902).method768(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2904;
        int[] var7 = this.field2909;
        if (arg0 != null && (arg0.field1002 >= 0 || arg0.field1003 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2909[var8];
            }
            if (arg0.field1002 >= 0) {
                var5 += (long) (arg0.field1002 - this.field2909[5] << 40);
                var7[5] = arg0.field1002;
            }
            if (arg0.field1003 >= 0) {
                var5 += (long) (arg0.field1003 - this.field2909[3] << 48);
                var7[3] = arg0.field1003;
            }
        }
        class105 var9 = (class105) field2907.method3529(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method2073(var12 - 256).method923()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method2767(var12 - 512).method1040(this.field2901)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2910 != -1L) {
                    var9 = (class105) field2907.method3529(this.field2910);
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
                        class100 var17 = class45.method2073(var16 - 256).method924();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method2767(var16 - 512).method1041(this.field2901);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2900[var20] < Statics.field2905[var20].length) {
                        var19.method2093(Statics.field1177[var20], Statics.field2905[var20][this.field2900[var20]]);
                    }
                    if (this.field2900[var20] < Statics.field251[var20].length) {
                        var19.method2093(Statics.field1050[var20], Statics.field251[var20][this.field2900[var20]]);
                    }
                }
                var9 = var19.method2079(64, 850, -30, -50, -30);
                field2907.method3528(var9, var5);
                this.field2910 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method872(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method869(var9, arg3);
        } else {
            var21 = arg0.method869(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fl.p(I)Lcd;")
    public class100 method3290() {
        if (this.field2902 != -1) {
            return class40.method140(this.field2902).method769();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2909[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method2073(var3 - 256).method930()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method2767(var3 - 512).method1042(this.field2901)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2909[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method2073(var7 - 256).method920();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method2767(var7 - 512).method1063(this.field2901);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2900[var11] < Statics.field2905[var11].length) {
                var10.method2093(Statics.field1177[var11], Statics.field2905[var11][this.field2900[var11]]);
            }
            if (this.field2900[var11] < Statics.field251[var11].length) {
                var10.method2093(Statics.field1050[var11], Statics.field251[var11][this.field2900[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fl.u(I)I")
    public int method3291() {
        return this.field2902 == -1 ? (this.field2909[11] << 5) + (this.field2909[8] << 10) + (this.field2909[0] << 15) + (this.field2900[0] << 25) + (this.field2900[4] << 20) + this.field2909[1] : 305419896 + class40.method140(this.field2902).field892;
    }

    @ObfuscatedName("p.c(B)V")
    public static void method110() {
        field2907.method3532();
    }
}
