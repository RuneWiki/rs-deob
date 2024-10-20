package deob;

@ObfuscatedName("fq")
public class class179 {

    @ObfuscatedName("fq.n")
    public int[] field2906;

    @ObfuscatedName("fq.d")
    public int[] field2900;

    @ObfuscatedName("fq.s")
    public boolean field2901;

    @ObfuscatedName("fq.q")
    public int field2899;

    @ObfuscatedName("fq.j")
    public long field2903;

    @ObfuscatedName("fq.k")
    public long field2904;

    @ObfuscatedName("fq.e")
    public static final int[] field2907 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fq.g")
    public static class193 field2910 = new class193(260);

    @ObfuscatedName("fq.n([I[IZII)V")
    public void method3255(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1008; var6++) {
                    class45 var7 = class45.method699(var6);
                    if (var7 != null && !var7.field1018 && var7.field1011 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2907[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2906 = arg0;
        this.field2900 = arg1;
        this.field2901 = arg2;
        this.field2899 = arg3;
        this.method3247();
    }

    @ObfuscatedName("fq.d(IZI)V")
    public void method3251(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2901) {
            return;
        }
        int var3 = this.field2906[field2907[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1008) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1008 - 1;
                }
            }
            var4 = class45.method699(var3);
        } while (var4 == null || var4.field1018 || arg0 + (this.field2901 ? 7 : 0) != var4.field1011);
        this.field2906[field2907[arg0]] = var3 + 256;
        this.method3247();
    }

    @ObfuscatedName("fq.s(IZI)V")
    public void method3244(int arg0, boolean arg1) {
        int var3 = this.field2900[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2905[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 == 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2905[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2900[arg0] = var3;
        this.method3247();
    }

    @ObfuscatedName("fq.q(ZB)V")
    public void method3245(boolean arg0) {
        if (this.field2901 != arg0) {
            this.method3255((int[]) null, this.field2900, arg0, -1);
        }
    }

    @ObfuscatedName("fq.j(Ldq;S)V")
    public void method3246(class119 arg0) {
        arg0.method2323(this.field2901 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2906[field2907[var2]];
            if (var3 == 0) {
                arg0.method2323(-1);
            } else {
                arg0.method2323(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2323(this.field2900[var4]);
        }
    }

    @ObfuscatedName("fq.k(S)V")
    public void method3247() {
        long var1 = this.field2903;
        int var3 = this.field2906[5];
        int var4 = this.field2906[9];
        this.field2906[5] = var4;
        this.field2906[9] = var3;
        this.field2903 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2903 <<= 0x4;
            if (this.field2906[var5] >= 256) {
                this.field2903 += (long) (this.field2906[var5] - 256);
            }
        }
        if (this.field2906[0] >= 256) {
            this.field2903 += (long) (this.field2906[0] - 256 >> 4);
        }
        if (this.field2906[1] >= 256) {
            this.field2903 += (long) (this.field2906[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2903 <<= 0x3;
            this.field2903 += (long) this.field2900[var6];
        }
        this.field2903 <<= 0x1;
        this.field2903 += (long) (this.field2901 ? 1 : 0);
        this.field2906[5] = var3;
        this.field2906[9] = var4;
        if (var1 != 0L && this.field2903 != var1) {
            field2910.method3479(var1);
        }
    }

    @ObfuscatedName("fq.i(Lat;ILat;IB)Ldb;")
    public class105 method3248(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2899 != -1) {
            return class40.method639(this.field2899).method754(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2903;
        int[] var7 = this.field2906;
        if (arg0 != null && (arg0.field967 >= 0 || arg0.field985 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2906[var8];
            }
            if (arg0.field967 >= 0) {
                var5 += (long) (arg0.field967 - this.field2906[5] << 40);
                var7[5] = arg0.field967;
            }
            if (arg0.field985 >= 0) {
                var5 += (long) (arg0.field985 - this.field2906[3] << 48);
                var7[3] = arg0.field985;
            }
        }
        class105 var9 = (class105) field2910.method3478(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method699(var12 - 256).method898()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method2651(var12 - 512).method987(this.field2901)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2904 != -1L) {
                    var9 = (class105) field2910.method3478(this.field2904);
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
                        class100 var17 = class45.method699(var16 - 256).method896();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method2651(var16 - 512).method988(this.field2901);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2900[var20] < Statics.field2905[var20].length) {
                        var19.method2060(Statics.field2634[var20], Statics.field2905[var20][this.field2900[var20]]);
                    }
                    if (this.field2900[var20] < Statics.field2908[var20].length) {
                        var19.method2060(Statics.field1342[var20], Statics.field2908[var20][this.field2900[var20]]);
                    }
                }
                var9 = var19.method2093(64, 850, -30, -50, -30);
                field2910.method3481(var9, var5);
                this.field2904 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method824(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method840(var9, arg3);
        } else {
            var21 = arg0.method840(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fq.m(I)Lcl;")
    public class100 method3249() {
        if (this.field2899 != -1) {
            return class40.method639(this.field2899).method741();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2906[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method699(var3 - 256).method884()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method2651(var3 - 512).method990(this.field2901)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2906[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method699(var7 - 256).method885();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method2651(var7 - 512).method979(this.field2901);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2900[var11] < Statics.field2905[var11].length) {
                var10.method2060(Statics.field2634[var11], Statics.field2905[var11][this.field2900[var11]]);
            }
            if (this.field2900[var11] < Statics.field2908[var11].length) {
                var10.method2060(Statics.field1342[var11], Statics.field2908[var11][this.field2900[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fq.p(I)I")
    public int method3250() {
        return this.field2899 == -1 ? (this.field2906[11] << 5) + (this.field2906[8] << 10) + (this.field2906[0] << 15) + (this.field2900[0] << 25) + (this.field2900[4] << 20) + this.field2906[1] : 305419896 + class40.method639(this.field2899).field881;
    }
}
