package deob;

@ObfuscatedName("fw")
public class class179 {

    @ObfuscatedName("fw.j")
    public int[] field2904;

    @ObfuscatedName("fw.m")
    public int[] field2900;

    @ObfuscatedName("fw.f")
    public boolean field2901;

    @ObfuscatedName("fw.l")
    public int field2899;

    @ObfuscatedName("fw.u")
    public long field2903;

    @ObfuscatedName("fw.a")
    public long field2909;

    @ObfuscatedName("fw.s")
    public static final int[] field2906 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fw.w")
    public static class193 field2907 = new class193(260);

    @ObfuscatedName("fw.j([I[IZIB)V")
    public void method3300(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1009; var6++) {
                    class45 var7 = class45.method574(var6);
                    if (var7 != null && !var7.field1011 && var7.field1012 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2906[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2904 = arg0;
        this.field2900 = arg1;
        this.field2901 = arg2;
        this.field2899 = arg3;
        this.method3305();
    }

    @ObfuscatedName("fw.m(IZB)V")
    public void method3301(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2901) {
            return;
        }
        int var3 = this.field2904[field2906[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1009) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1009 - 1;
                }
            }
            var4 = class45.method574(var3);
        } while (var4 == null || var4.field1011 || arg0 + (this.field2901 ? 7 : 0) != var4.field1012);
        this.field2904[field2906[arg0]] = var3 + 256;
        this.method3305();
    }

    @ObfuscatedName("fw.f(IZB)V")
    public void method3307(int arg0, boolean arg1) {
        int var3 = this.field2900[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1980[arg0].length) {
                    var3 = 0;
                }
            } while (!class174.method1487(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1980[arg0].length - 1;
                }
            } while (!class174.method1487(arg0, var3));
        }
        this.field2900[arg0] = var3;
        this.method3305();
    }

    @ObfuscatedName("fw.l(ZI)V")
    public void method3303(boolean arg0) {
        if (this.field2901 != arg0) {
            this.method3300((int[]) null, this.field2900, arg0, -1);
        }
    }

    @ObfuscatedName("fw.u(Ldc;I)V")
    public void method3304(class119 arg0) {
        arg0.method2357(this.field2901 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2904[field2906[var2]];
            if (var3 == 0) {
                arg0.method2357(-1);
            } else {
                arg0.method2357(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2357(this.field2900[var4]);
        }
    }

    @ObfuscatedName("fw.a(I)V")
    public void method3305() {
        long var1 = this.field2903;
        int var3 = this.field2904[5];
        int var4 = this.field2904[9];
        this.field2904[5] = var4;
        this.field2904[9] = var3;
        this.field2903 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2903 <<= 0x4;
            if (this.field2904[var5] >= 256) {
                this.field2903 += (long) (this.field2904[var5] - 256);
            }
        }
        if (this.field2904[0] >= 256) {
            this.field2903 += (long) (this.field2904[0] - 256 >> 4);
        }
        if (this.field2904[1] >= 256) {
            this.field2903 += (long) (this.field2904[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2903 <<= 0x3;
            this.field2903 += (long) this.field2900[var6];
        }
        this.field2903 <<= 0x1;
        this.field2903 += (long) (this.field2901 ? 1 : 0);
        this.field2904[5] = var3;
        this.field2904[9] = var4;
        if (var1 != 0L && this.field2903 != var1) {
            field2907.method3539(var1);
        }
    }

    @ObfuscatedName("fw.h(Lak;ILak;II)Lda;")
    public class105 method3306(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2899 != -1) {
            return class40.method609(this.field2899).method789(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2903;
        int[] var7 = this.field2904;
        if (arg0 != null && (arg0.field982 >= 0 || arg0.field983 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2904[var8];
            }
            if (arg0.field982 >= 0) {
                var5 += (long) (arg0.field982 - this.field2904[5] << 40);
                var7[5] = arg0.field982;
            }
            if (arg0.field983 >= 0) {
                var5 += (long) (arg0.field983 - this.field2904[3] << 48);
                var7[3] = arg0.field983;
            }
        }
        class105 var9 = (class105) field2907.method3543(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method574(var12 - 256).method939()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method154(var12 - 512).method1041(this.field2901)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2909 != -1L) {
                    var9 = (class105) field2907.method3543(this.field2909);
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
                        class100 var17 = class45.method574(var16 - 256).method926();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method154(var16 - 512).method1042(this.field2901);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2900[var20] < Statics.field1980[var20].length) {
                        var19.method2143(Statics.field155[var20], Statics.field1980[var20][this.field2900[var20]]);
                    }
                    if (this.field2900[var20] < Statics.field2905[var20].length) {
                        var19.method2143(Statics.field1024[var20], Statics.field2905[var20][this.field2900[var20]]);
                    }
                }
                var9 = var19.method2092(64, 850, -30, -50, -30);
                field2907.method3540(var9, var5);
                this.field2909 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method884(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method871(var9, arg3);
        } else {
            var21 = arg0.method871(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fw.i(I)Lcy;")
    public class100 method3315() {
        if (this.field2899 != -1) {
            return class40.method609(this.field2899).method778();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2904[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method574(var3 - 256).method929()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method154(var3 - 512).method1043(this.field2901)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2904[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method574(var7 - 256).method930();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method154(var7 - 512).method1062(this.field2901);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2900[var11] < Statics.field1980[var11].length) {
                var10.method2143(Statics.field155[var11], Statics.field1980[var11][this.field2900[var11]]);
            }
            if (this.field2900[var11] < Statics.field2905[var11].length) {
                var10.method2143(Statics.field1024[var11], Statics.field2905[var11][this.field2900[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fw.t(I)I")
    public int method3321() {
        return this.field2899 == -1 ? (this.field2904[11] << 5) + (this.field2904[8] << 10) + (this.field2904[0] << 15) + (this.field2900[4] << 20) + (this.field2900[0] << 25) + this.field2904[1] : 305419896 + class40.method609(this.field2899).field870;
    }
}
