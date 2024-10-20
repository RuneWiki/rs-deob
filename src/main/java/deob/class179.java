package deob;

@ObfuscatedName("fu")
public class class179 {

    @ObfuscatedName("fu.k")
    public int[] field2910;

    @ObfuscatedName("fu.h")
    public int[] field2899;

    @ObfuscatedName("fu.o")
    public boolean field2912;

    @ObfuscatedName("fu.z")
    public int field2901;

    @ObfuscatedName("fu.c")
    public long field2902;

    @ObfuscatedName("fu.d")
    public long field2909;

    @ObfuscatedName("fu.i")
    public static final int[] field2906 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fu.g")
    public static class193 field2900 = new class193(260);

    @ObfuscatedName("fu.k([I[IZII)V")
    public void method3273(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1015; var6++) {
                    class45 var7 = class45.method2269(var6);
                    if (var7 != null && !var7.field1018 && (arg2 ? 7 : 0) + var5 == var7.field1012) {
                        arg0[field2906[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2910 = arg0;
        this.field2899 = arg1;
        this.field2912 = arg2;
        this.field2901 = arg3;
        this.method3278();
    }

    @ObfuscatedName("fu.h(IZI)V")
    public void method3285(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2912) {
            return;
        }
        int var3 = this.field2910[field2906[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1015) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1015 - 1;
                }
            }
            var4 = class45.method2269(var3);
        } while (var4 == null || var4.field1018 || (this.field2912 ? 7 : 0) + arg0 != var4.field1012);
        this.field2910[field2906[arg0]] = var3 + 256;
        this.method3278();
    }

    @ObfuscatedName("fu.o(IZI)V")
    public void method3275(int arg0, boolean arg1) {
        int var3 = this.field2899[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field171[arg0].length) {
                    var3 = 0;
                }
            } while (!class174.method2781(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field171[arg0].length - 1;
                }
            } while (!class174.method2781(arg0, var3));
        }
        this.field2899[arg0] = var3;
        this.method3278();
    }

    @ObfuscatedName("fu.z(ZI)V")
    public void method3279(boolean arg0) {
        if (this.field2912 != arg0) {
            this.method3273((int[]) null, this.field2899, arg0, -1);
        }
    }

    @ObfuscatedName("fu.c(Ldk;I)V")
    public void method3277(class119 arg0) {
        arg0.method2315(this.field2912 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2910[field2906[var2]];
            if (var3 == 0) {
                arg0.method2315(-1);
            } else {
                arg0.method2315(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2315(this.field2899[var4]);
        }
    }

    @ObfuscatedName("fu.d(B)V")
    public void method3278() {
        long var1 = this.field2902;
        int var3 = this.field2910[5];
        int var4 = this.field2910[9];
        this.field2910[5] = var4;
        this.field2910[9] = var3;
        this.field2902 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2902 <<= 0x4;
            if (this.field2910[var5] >= 256) {
                this.field2902 += (long) (this.field2910[var5] - 256);
            }
        }
        if (this.field2910[0] >= 256) {
            this.field2902 += (long) (this.field2910[0] - 256 >> 4);
        }
        if (this.field2910[1] >= 256) {
            this.field2902 += (long) (this.field2910[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2902 <<= 0x3;
            this.field2902 += (long) this.field2899[var6];
        }
        this.field2902 <<= 0x1;
        this.field2902 += (long) (this.field2912 ? 1 : 0);
        this.field2910[5] = var3;
        this.field2910[9] = var4;
        if (var1 != 0L && this.field2902 != var1) {
            field2900.method3511(var1);
        }
    }

    @ObfuscatedName("fu.l(Lah;ILah;IS)Ldl;")
    public class105 method3287(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2901 != -1) {
            return class40.method96(this.field2901).method726(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2902;
        int[] var7 = this.field2910;
        if (arg0 != null && (arg0.field979 >= 0 || arg0.field983 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2910[var8];
            }
            if (arg0.field979 >= 0) {
                var5 += (long) (arg0.field979 - this.field2910[5] << 40);
                var7[5] = arg0.field979;
            }
            if (arg0.field983 >= 0) {
                var5 += (long) (arg0.field983 - this.field2910[3] << 48);
                var7[3] = arg0.field983;
            }
        }
        class105 var9 = (class105) field2900.method3510(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method2269(var12 - 256).method857()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method2522(var12 - 512).method982(this.field2912)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2909 != -1L) {
                    var9 = (class105) field2900.method3510(this.field2909);
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
                        class100 var17 = class45.method2269(var16 - 256).method867();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method2522(var16 - 512).method983(this.field2912);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2899[var20] < Statics.field171[var20].length) {
                        var19.method2064(Statics.field2646[var20], Statics.field171[var20][this.field2899[var20]]);
                    }
                    if (this.field2899[var20] < Statics.field2905[var20].length) {
                        var19.method2064(Statics.field2904[var20], Statics.field2905[var20][this.field2899[var20]]);
                    }
                }
                var9 = var19.method2089(64, 850, -30, -50, -30);
                field2900.method3512(var9, var5);
                this.field2909 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method806(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method805(var9, arg3);
        } else {
            var21 = arg0.method805(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fu.b(B)Lcg;")
    public class100 method3282() {
        if (this.field2901 != -1) {
            return class40.method96(this.field2901).method718();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2910[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method2269(var3 - 256).method859()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method2522(var3 - 512).method984(this.field2912)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2910[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method2269(var7 - 256).method869();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method2522(var7 - 512).method985(this.field2912);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2899[var11] < Statics.field171[var11].length) {
                var10.method2064(Statics.field2646[var11], Statics.field171[var11][this.field2899[var11]]);
            }
            if (this.field2899[var11] < Statics.field2905[var11].length) {
                var10.method2064(Statics.field2904[var11], Statics.field2905[var11][this.field2899[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fu.j(I)I")
    public int method3281() {
        return this.field2901 == -1 ? (this.field2910[11] << 5) + (this.field2910[8] << 10) + (this.field2910[0] << 15) + (this.field2899[0] << 25) + (this.field2899[4] << 20) + this.field2910[1] : 305419896 + class40.method96(this.field2901).field861;
    }

    @ObfuscatedName("hw.f(B)V")
    public static void method3704() {
        field2900.method3518();
    }
}
