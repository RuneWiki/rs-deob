package deob;

@ObfuscatedName("gv")
public class class183 {

    @ObfuscatedName("gv.s")
    public int[] field2968;

    @ObfuscatedName("gv.z")
    public int[] field2960;

    @ObfuscatedName("gv.t")
    public boolean field2961;

    @ObfuscatedName("gv.y")
    public int field2964;

    @ObfuscatedName("gv.p")
    public long field2963;

    @ObfuscatedName("gv.g")
    public long field2966;

    @ObfuscatedName("gv.r")
    public static final int[] field2967 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("gv.w")
    public static class197 field2959 = new class197(260);

    @ObfuscatedName("gv.s([I[IZII)V")
    public void method3284(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1006; var6++) {
                    class47 var7 = class47.method572(var6);
                    if (var7 != null && !var7.field1015 && var7.field1009 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2967[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2968 = arg0;
        this.field2960 = arg1;
        this.field2961 = arg2;
        this.field2964 = arg3;
        this.method3290();
    }

    @ObfuscatedName("gv.z(IZI)V")
    public void method3301(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2961) {
            return;
        }
        int var3 = this.field2968[field2967[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class47 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1006) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1006 - 1;
                }
            }
            var4 = class47.method572(var3);
        } while (var4 == null || var4.field1015 || var4.field1009 != arg0 + (this.field2961 ? 7 : 0));
        this.field2968[field2967[arg0]] = var3 + 256;
        this.method3290();
    }

    @ObfuscatedName("gv.t(IZI)V")
    public void method3287(int arg0, boolean arg1) {
        int var3 = this.field2960[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2965[arg0].length) {
                    var3 = 0;
                }
            } while (!class178.method1609(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2965[arg0].length - 1;
                }
            } while (!class178.method1609(arg0, var3));
        }
        this.field2960[arg0] = var3;
        this.method3290();
    }

    @ObfuscatedName("gv.y(ZB)V")
    public void method3288(boolean arg0) {
        if (this.field2961 != arg0) {
            this.method3284((int[]) null, this.field2960, arg0, -1);
        }
    }

    @ObfuscatedName("gv.p(Ldy;I)V")
    public void method3289(class123 arg0) {
        arg0.method2349(this.field2961 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2968[field2967[var2]];
            if (var3 == 0) {
                arg0.method2349(-1);
            } else {
                arg0.method2349(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2349(this.field2960[var4]);
        }
    }

    @ObfuscatedName("gv.g(I)V")
    public void method3290() {
        long var1 = this.field2963;
        int var3 = this.field2968[5];
        int var4 = this.field2968[9];
        this.field2968[5] = var4;
        this.field2968[9] = var3;
        this.field2963 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2963 <<= 0x4;
            if (this.field2968[var5] >= 256) {
                this.field2963 += (long) (this.field2968[var5] - 256);
            }
        }
        if (this.field2968[0] >= 256) {
            this.field2963 += (long) (this.field2968[0] - 256 >> 4);
        }
        if (this.field2968[1] >= 256) {
            this.field2963 += (long) (this.field2968[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2963 <<= 0x3;
            this.field2963 += (long) this.field2960[var6];
        }
        this.field2963 <<= 0x1;
        this.field2963 += (long) (this.field2961 ? 1 : 0);
        this.field2968[5] = var3;
        this.field2968[9] = var4;
        if (var1 != 0L && this.field2963 != var1) {
            field2959.method3520(var1);
        }
    }

    @ObfuscatedName("gv.m(Lay;ILay;II)Lde;")
    public class109 method3307(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field2964 != -1) {
            return class42.method2674(this.field2964).method773(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2963;
        int[] var7 = this.field2968;
        if (arg0 != null && (arg0.field978 >= 0 || arg0.field979 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2968[var8];
            }
            if (arg0.field978 >= 0) {
                var5 += (long) (arg0.field978 - this.field2968[5] << 40);
                var7[5] = arg0.field978;
            }
            if (arg0.field979 >= 0) {
                var5 += (long) (arg0.field979 - this.field2968[3] << 48);
                var7[3] = arg0.field979;
            }
        }
        class109 var9 = (class109) field2959.method3523(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class47.method572(var12 - 256).method912()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class56.method3201(var12 - 512).method1072(this.field2961)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2966 != -1L) {
                    var9 = (class109) field2959.method3523(this.field2966);
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
                        class104 var17 = class47.method572(var16 - 256).method919();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class104 var18 = class56.method3201(var16 - 512).method1073(this.field2961);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class104 var19 = new class104(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2960[var20] < Statics.field2965[var20].length) {
                        var19.method2091(Statics.field2122[var20], Statics.field2965[var20][this.field2960[var20]]);
                    }
                    if (this.field2960[var20] < Statics.field1943[var20].length) {
                        var19.method2091(Statics.field2969[var20], Statics.field1943[var20][this.field2960[var20]]);
                    }
                }
                var9 = var19.method2097(64, 850, -30, -50, -30);
                field2959.method3521(var9, var5);
                this.field2966 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class109 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method869(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method893(var9, arg3);
        } else {
            var21 = arg0.method893(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("gv.f(I)Lch;")
    public class104 method3292() {
        if (this.field2964 != -1) {
            return class42.method2674(this.field2964).method769();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2968[var2];
            if (var3 >= 256 && var3 < 512 && !class47.method572(var3 - 256).method909()) {
                var1 = true;
            }
            if (var3 >= 512 && !class56.method3201(var3 - 512).method1074(this.field2961)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class104[] var4 = new class104[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2968[var6];
            if (var7 >= 256 && var7 < 512) {
                class104 var8 = class47.method572(var7 - 256).method915();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class104 var9 = class56.method3201(var7 - 512).method1070(this.field2961);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class104 var10 = new class104(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2960[var11] < Statics.field2965[var11].length) {
                var10.method2091(Statics.field2122[var11], Statics.field2965[var11][this.field2960[var11]]);
            }
            if (this.field2960[var11] < Statics.field1943[var11].length) {
                var10.method2091(Statics.field2969[var11], Statics.field1943[var11][this.field2960[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("gv.k(B)I")
    public int method3305() {
        return this.field2964 == -1 ? (this.field2968[11] << 5) + (this.field2968[8] << 10) + (this.field2968[0] << 15) + (this.field2960[4] << 20) + (this.field2960[0] << 25) + this.field2968[1] : 305419896 + class42.method2674(this.field2964).field881;
    }
}
