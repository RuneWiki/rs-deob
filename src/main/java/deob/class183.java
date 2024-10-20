package deob;

@ObfuscatedName("gl")
public class class183 {

    @ObfuscatedName("gl.x")
    public int[] field2979;

    @ObfuscatedName("gl.r")
    public int[] field2973;

    @ObfuscatedName("gl.j")
    public boolean field2972;

    @ObfuscatedName("gl.z")
    public int field2971;

    @ObfuscatedName("gl.i")
    public long field2977;

    @ObfuscatedName("gl.b")
    public long field2975;

    @ObfuscatedName("gl.d")
    public static final int[] field2970 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("gl.v")
    public static class197 field2978 = new class197(260);

    @ObfuscatedName("gl.x([I[IZII)V")
    public void method3296(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1035; var6++) {
                    class47 var7 = class47.method155(var6);
                    if (var7 != null && !var7.field1044 && var7.field1034 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2970[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2979 = arg0;
        this.field2973 = arg1;
        this.field2972 = arg2;
        this.field2971 = arg3;
        this.method3306();
    }

    @ObfuscatedName("gl.r(IZI)V")
    public void method3281(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2972) {
            return;
        }
        int var3 = this.field2979[field2970[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class47 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1035) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1035 - 1;
                }
            }
            var4 = class47.method155(var3);
        } while (var4 == null || var4.field1044 || var4.field1034 != arg0 + (this.field2972 ? 7 : 0));
        this.field2979[field2970[arg0]] = var3 + 256;
        this.method3306();
    }

    @ObfuscatedName("gl.j(IZB)V")
    public void method3282(int arg0, boolean arg1) {
        int var3 = this.field2973[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field625[arg0].length) {
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
                    var3 = Statics.field625[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2973[arg0] = var3;
        this.method3306();
    }

    @ObfuscatedName("gl.z(ZI)V")
    public void method3283(boolean arg0) {
        if (this.field2972 != arg0) {
            this.method3296((int[]) null, this.field2973, arg0, -1);
        }
    }

    @ObfuscatedName("gl.i(Ldp;I)V")
    public void method3284(class123 arg0) {
        arg0.method2567(this.field2972 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2979[field2970[var2]];
            if (var3 == 0) {
                arg0.method2567(-1);
            } else {
                arg0.method2567(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2567(this.field2973[var4]);
        }
    }

    @ObfuscatedName("gl.b(I)V")
    public void method3306() {
        long var1 = this.field2977;
        int var3 = this.field2979[5];
        int var4 = this.field2979[9];
        this.field2979[5] = var4;
        this.field2979[9] = var3;
        this.field2977 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2977 <<= 0x4;
            if (this.field2979[var5] >= 256) {
                this.field2977 += (long) (this.field2979[var5] - 256);
            }
        }
        if (this.field2979[0] >= 256) {
            this.field2977 += (long) (this.field2979[0] - 256 >> 4);
        }
        if (this.field2979[1] >= 256) {
            this.field2977 += (long) (this.field2979[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2977 <<= 0x3;
            this.field2977 += (long) this.field2973[var6];
        }
        this.field2977 <<= 0x1;
        this.field2977 += (long) (this.field2972 ? 1 : 0);
        this.field2979[5] = var3;
        this.field2979[9] = var4;
        if (var1 != 0L && this.field2977 != var1) {
            field2978.method3536(var1);
        }
    }

    @ObfuscatedName("gl.l(Lak;ILak;II)Ldj;")
    public class109 method3285(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field2971 != -1) {
            return class42.method2094(this.field2971).method746(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2977;
        int[] var7 = this.field2979;
        if (arg0 != null && (arg0.field1006 >= 0 || arg0.field994 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2979[var8];
            }
            if (arg0.field1006 >= 0) {
                var5 += (long) (arg0.field1006 - this.field2979[5] << 40);
                var7[5] = arg0.field1006;
            }
            if (arg0.field994 >= 0) {
                var5 += (long) (arg0.field994 - this.field2979[3] << 48);
                var7[3] = arg0.field994;
            }
        }
        class109 var9 = (class109) field2978.method3533(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class47.method155(var12 - 256).method894()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class56.method709(var12 - 512).method1077(this.field2972)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2975 != -1L) {
                    var9 = (class109) field2978.method3533(this.field2975);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class104[] var13 = new class104[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class104 var17 = class47.method155(var16 - 256).method895();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class104 var18 = class56.method709(var16 - 512).method1073(this.field2972);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class104 var19 = new class104(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2973[var20] < Statics.field625[var20].length) {
                        var19.method2197(Statics.field2976[var20], Statics.field625[var20][this.field2973[var20]]);
                    }
                    if (this.field2973[var20] < Statics.field186[var20].length) {
                        var19.method2197(Statics.field2713[var20], Statics.field186[var20][this.field2973[var20]]);
                    }
                }
                var9 = var19.method2150(64, 850, -30, -50, -30);
                field2978.method3535(var9, var5);
                this.field2975 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class109 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method849(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method833(var9, arg3);
        } else {
            var21 = arg0.method833(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("gl.m(B)Lcy;")
    public class104 method3286() {
        if (this.field2971 != -1) {
            return class42.method2094(this.field2971).method747();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2979[var2];
            if (var3 >= 256 && var3 < 512 && !class47.method155(var3 - 256).method896()) {
                var1 = true;
            }
            if (var3 >= 512 && !class56.method709(var3 - 512).method1079(this.field2972)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class104[] var4 = new class104[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2979[var6];
            if (var7 >= 256 && var7 < 512) {
                class104 var8 = class47.method155(var7 - 256).method901();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class104 var9 = class56.method709(var7 - 512).method1080(this.field2972);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class104 var10 = new class104(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2973[var11] < Statics.field625[var11].length) {
                var10.method2197(Statics.field2976[var11], Statics.field625[var11][this.field2973[var11]]);
            }
            if (this.field2973[var11] < Statics.field186[var11].length) {
                var10.method2197(Statics.field2713[var11], Statics.field186[var11][this.field2973[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("gl.p(I)I")
    public int method3287() {
        return this.field2971 == -1 ? (this.field2979[11] << 5) + (this.field2979[8] << 10) + (this.field2979[0] << 15) + (this.field2973[0] << 25) + (this.field2973[4] << 20) + this.field2979[1] : 305419896 + class42.method2094(this.field2971).field889;
    }

    @ObfuscatedName("et.f(I)V")
    public static void method2814() {
        field2978.method3534();
    }
}
