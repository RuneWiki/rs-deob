package deob;

@ObfuscatedName("fe")
public class class179 {

    @ObfuscatedName("fe.l")
    public int[] field2906;

    @ObfuscatedName("fe.e")
    public int[] field2907;

    @ObfuscatedName("fe.q")
    public boolean field2901;

    @ObfuscatedName("fe.o")
    public int field2902;

    @ObfuscatedName("fe.g")
    public long field2903;

    @ObfuscatedName("fe.m")
    public long field2899;

    @ObfuscatedName("fe.x")
    public static final int[] field2900 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fe.k")
    public static class193 field2904 = new class193(260);

    @ObfuscatedName("fe.l([I[IZIS)V")
    public void method3240(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1031; var6++) {
                    class45 var7 = class45.method2802(var6);
                    if (var7 != null && !var7.field1027 && (arg2 ? 7 : 0) + var5 == var7.field1021) {
                        arg0[field2900[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2906 = arg0;
        this.field2907 = arg1;
        this.field2901 = arg2;
        this.field2902 = arg3;
        this.method3245();
    }

    @ObfuscatedName("fe.e(IZB)V")
    public void method3241(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2901) {
            return;
        }
        int var3 = this.field2906[field2900[arg0]];
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
            var4 = class45.method2802(var3);
        } while (var4 == null || var4.field1027 || var4.field1021 != arg0 + (this.field2901 ? 7 : 0));
        this.field2906[field2900[arg0]] = var3 + 256;
        this.method3245();
    }

    @ObfuscatedName("fe.q(IZI)V")
    public void method3242(int arg0, boolean arg1) {
        int var3 = this.field2907[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2905[arg0].length) {
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
                    var3 = Statics.field2905[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2907[arg0] = var3;
        this.method3245();
    }

    @ObfuscatedName("fe.o(ZB)V")
    public void method3243(boolean arg0) {
        if (this.field2901 != arg0) {
            this.method3240((int[]) null, this.field2907, arg0, -1);
        }
    }

    @ObfuscatedName("fe.g(Ldl;I)V")
    public void method3244(class119 arg0) {
        arg0.method2503(this.field2901 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2906[field2900[var2]];
            if (var3 == 0) {
                arg0.method2503(-1);
            } else {
                arg0.method2503(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2503(this.field2907[var4]);
        }
    }

    @ObfuscatedName("fe.m(B)V")
    public void method3245() {
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
            this.field2903 += (long) this.field2907[var6];
        }
        this.field2903 <<= 0x1;
        this.field2903 += (long) (this.field2901 ? 1 : 0);
        this.field2906[5] = var3;
        this.field2906[9] = var4;
        if (var1 != 0L && this.field2903 != var1) {
            field2904.method3483(var1);
        }
    }

    @ObfuscatedName("fe.b(Las;ILas;IB)Ldt;")
    public class105 method3246(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2902 != -1) {
            return class40.method710(this.field2902).method760(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2903;
        int[] var7 = this.field2906;
        if (arg0 != null && (arg0.field992 >= 0 || arg0.field993 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2906[var8];
            }
            if (arg0.field992 >= 0) {
                var5 += (long) (arg0.field992 - this.field2906[5] << 40);
                var7[5] = arg0.field992;
            }
            if (arg0.field993 >= 0) {
                var5 += (long) (arg0.field993 - this.field2906[3] << 48);
                var7[3] = arg0.field993;
            }
        }
        class105 var9 = (class105) field2904.method3478(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method2802(var12 - 256).method938()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method646(var12 - 512).method1033(this.field2901)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2899 != -1L) {
                    var9 = (class105) field2904.method3478(this.field2899);
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
                        class100 var17 = class45.method2802(var16 - 256).method914();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method646(var16 - 512).method1036(this.field2901);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2907[var20] < Statics.field2905[var20].length) {
                        var19.method2090(Statics.field2636[var20], Statics.field2905[var20][this.field2907[var20]]);
                    }
                    if (this.field2907[var20] < Statics.field273[var20].length) {
                        var19.method2090(Statics.field2629[var20], Statics.field273[var20][this.field2907[var20]]);
                    }
                }
                var9 = var19.method2085(64, 850, -30, -50, -30);
                field2904.method3479(var9, var5);
                this.field2899 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method869(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method864(var9, arg3);
        } else {
            var21 = arg0.method864(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fe.p(I)Lcm;")
    public class100 method3247() {
        if (this.field2902 != -1) {
            return class40.method710(this.field2902).method759();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2906[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method2802(var3 - 256).method910()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method646(var3 - 512).method1077(this.field2901)) {
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
                class100 var8 = class45.method2802(var7 - 256).method916();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method646(var7 - 512).method1056(this.field2901);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2907[var11] < Statics.field2905[var11].length) {
                var10.method2090(Statics.field2636[var11], Statics.field2905[var11][this.field2907[var11]]);
            }
            if (this.field2907[var11] < Statics.field273[var11].length) {
                var10.method2090(Statics.field2629[var11], Statics.field273[var11][this.field2907[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fe.t(I)I")
    public int method3248() {
        return this.field2902 == -1 ? (this.field2906[11] << 5) + (this.field2906[8] << 10) + (this.field2906[0] << 15) + (this.field2907[0] << 25) + (this.field2907[4] << 20) + this.field2906[1] : 305419896 + class40.method710(this.field2902).field885;
    }

    @ObfuscatedName("aq.w(I)V")
    public static void method656() {
        field2904.method3481();
    }
}
