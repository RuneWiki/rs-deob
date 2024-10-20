package deob;

@ObfuscatedName("fz")
public class class179 {

    @ObfuscatedName("fz.d")
    public int[] field2912;

    @ObfuscatedName("fz.p")
    public int[] field2904;

    @ObfuscatedName("fz.v")
    public boolean field2907;

    @ObfuscatedName("fz.l")
    public int field2909;

    @ObfuscatedName("fz.y")
    public long field2910;

    @ObfuscatedName("fz.w")
    public long field2908;

    @ObfuscatedName("fz.o")
    public static final int[] field2911 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fz.m")
    public static class193 field2906 = new class193(260);

    @ObfuscatedName("fz.d([I[IZII)V")
    public void method3308(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1034; var6++) {
                    class45 var7 = class45.method1540(var6);
                    if (var7 != null && !var7.field1044 && (arg2 ? 7 : 0) + var5 == var7.field1037) {
                        arg0[field2911[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2912 = arg0;
        this.field2904 = arg1;
        this.field2907 = arg2;
        this.field2909 = arg3;
        this.method3313();
    }

    @ObfuscatedName("fz.p(IZI)V")
    public void method3310(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2907) {
            return;
        }
        int var3 = this.field2912[field2911[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1034) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1034 - 1;
                }
            }
            var4 = class45.method1540(var3);
        } while (var4 == null || var4.field1044 || (this.field2907 ? 7 : 0) + arg0 != var4.field1037);
        this.field2912[field2911[arg0]] = var3 + 256;
        this.method3313();
    }

    @ObfuscatedName("fz.v(IZI)V")
    public void method3309(int arg0, boolean arg1) {
        int var3 = this.field2904[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2903[arg0].length) {
                    var3 = 0;
                }
            } while (!class174.method2996(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2903[arg0].length - 1;
                }
            } while (!class174.method2996(arg0, var3));
        }
        this.field2904[arg0] = var3;
        this.method3313();
    }

    @ObfuscatedName("fz.l(ZS)V")
    public void method3311(boolean arg0) {
        if (this.field2907 != arg0) {
            this.method3308((int[]) null, this.field2904, arg0, -1);
        }
    }

    @ObfuscatedName("fz.y(Ldf;I)V")
    public void method3312(class119 arg0) {
        arg0.method2388(this.field2907 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2912[field2911[var2]];
            if (var3 == 0) {
                arg0.method2388(-1);
            } else {
                arg0.method2388(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2388(this.field2904[var4]);
        }
    }

    @ObfuscatedName("fz.w(B)V")
    public void method3313() {
        long var1 = this.field2910;
        int var3 = this.field2912[5];
        int var4 = this.field2912[9];
        this.field2912[5] = var4;
        this.field2912[9] = var3;
        this.field2910 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2910 <<= 0x4;
            if (this.field2912[var5] >= 256) {
                this.field2910 += (long) (this.field2912[var5] - 256);
            }
        }
        if (this.field2912[0] >= 256) {
            this.field2910 += (long) (this.field2912[0] - 256 >> 4);
        }
        if (this.field2912[1] >= 256) {
            this.field2910 += (long) (this.field2912[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2910 <<= 0x3;
            this.field2910 += (long) this.field2904[var6];
        }
        this.field2910 <<= 0x1;
        this.field2910 += (long) (this.field2907 ? 1 : 0);
        this.field2912[5] = var3;
        this.field2912[9] = var4;
        if (var1 != 0L && this.field2910 != var1) {
            field2906.method3563(var1);
        }
    }

    @ObfuscatedName("fz.u(Laf;ILaf;II)Ldn;")
    public class105 method3314(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2909 != -1) {
            return class40.method1083(this.field2909).method734(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2910;
        int[] var7 = this.field2912;
        if (arg0 != null && (arg0.field1002 >= 0 || arg0.field1005 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2912[var8];
            }
            if (arg0.field1002 >= 0) {
                var5 += (long) (arg0.field1002 - this.field2912[5] << 40);
                var7[5] = arg0.field1002;
            }
            if (arg0.field1005 >= 0) {
                var5 += (long) (arg0.field1005 - this.field2912[3] << 48);
                var7[3] = arg0.field1005;
            }
        }
        class105 var9 = (class105) field2906.method3553(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method1540(var12 - 256).method894()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method193(var12 - 512).method1022(this.field2907)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2908 != -1L) {
                    var9 = (class105) field2906.method3553(this.field2908);
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
                        class100 var17 = class45.method1540(var16 - 256).method892();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method193(var16 - 512).method1023(this.field2907);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2904[var20] < Statics.field2903[var20].length) {
                        var19.method2075(Statics.field2905[var20], Statics.field2903[var20][this.field2904[var20]]);
                    }
                    if (this.field2904[var20] < Statics.field2634[var20].length) {
                        var19.method2075(Statics.field2869[var20], Statics.field2634[var20][this.field2904[var20]]);
                    }
                }
                var9 = var19.method2083(64, 850, -30, -50, -30);
                field2906.method3554(var9, var5);
                this.field2908 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method846(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method856(var9, arg3);
        } else {
            var21 = arg0.method856(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fz.a(I)Lca;")
    public class100 method3334() {
        if (this.field2909 != -1) {
            return class40.method1083(this.field2909).method735();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2912[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method1540(var3 - 256).method921()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method193(var3 - 512).method1024(this.field2907)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2912[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method1540(var7 - 256).method897();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method193(var7 - 512).method1051(this.field2907);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2904[var11] < Statics.field2903[var11].length) {
                var10.method2075(Statics.field2905[var11], Statics.field2903[var11][this.field2904[var11]]);
            }
            if (this.field2904[var11] < Statics.field2634[var11].length) {
                var10.method2075(Statics.field2869[var11], Statics.field2634[var11][this.field2904[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fz.e(I)I")
    public int method3315() {
        return this.field2909 == -1 ? (this.field2912[11] << 5) + (this.field2912[8] << 10) + (this.field2912[0] << 15) + (this.field2904[0] << 25) + (this.field2904[4] << 20) + this.field2912[1] : 305419896 + class40.method1083(this.field2909).field893;
    }

    @ObfuscatedName("fs.b(I)V")
    public static void method3014() {
        field2906.method3556();
    }
}
