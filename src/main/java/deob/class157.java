package deob;

@ObfuscatedName("fe")
public class class157 {

    @ObfuscatedName("fe.e")
    public int[] field2659;

    @ObfuscatedName("fe.o")
    public int[] field2660;

    @ObfuscatedName("fe.y")
    public boolean field2661;

    @ObfuscatedName("fe.b")
    public int field2662;

    @ObfuscatedName("fe.w")
    public long field2663;

    @ObfuscatedName("fe.r")
    public long field2664;

    @ObfuscatedName("fe.h")
    public static final int[] field2668 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fe.a")
    public static class171 field2669 = new class171(260);

    @ObfuscatedName("fe.e([I[IZII)V")
    public void method2842(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field957; var6++) {
                    class40 var7 = class40.method2618(var6);
                    if (var7 != null && !var7.field966 && var5 + (arg2 ? 7 : 0) == var7.field959) {
                        arg0[field2668[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2659 = arg0;
        this.field2660 = arg1;
        this.field2661 = arg2;
        this.field2662 = arg3;
        this.method2831();
    }

    @ObfuscatedName("fe.o(IZI)V")
    public void method2828(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2661) {
            return;
        }
        int var3 = this.field2659[field2668[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field957) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field957 - 1;
                }
            }
            var4 = class40.method2618(var3);
        } while (var4 == null || var4.field966 || arg0 + (this.field2661 ? 7 : 0) != var4.field959);
        this.field2659[field2668[arg0]] = var3 + 256;
        this.method2831();
    }

    @ObfuscatedName("fe.y(IZI)V")
    public void method2829(int arg0, boolean arg1) {
        int var3 = this.field2660[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2665[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2665[arg0].length - 1;
            }
        }
        this.field2660[arg0] = var3;
        this.method2831();
    }

    @ObfuscatedName("fe.b(ZB)V")
    public void method2836(boolean arg0) {
        if (this.field2661 != arg0) {
            this.method2842((int[]) null, this.field2660, arg0, -1);
        }
    }

    @ObfuscatedName("fe.w(Ldl;B)V")
    public void method2830(class107 arg0) {
        arg0.method2051(this.field2661 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2659[field2668[var2]];
            if (var3 == 0) {
                arg0.method2051(-1);
            } else {
                arg0.method2051(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2051(this.field2660[var4]);
        }
    }

    @ObfuscatedName("fe.r(B)V")
    public void method2831() {
        long var1 = this.field2663;
        int var3 = this.field2659[5];
        int var4 = this.field2659[9];
        this.field2659[5] = var4;
        this.field2659[9] = var3;
        this.field2663 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2663 <<= 0x4;
            if (this.field2659[var5] >= 256) {
                this.field2663 += (long) (this.field2659[var5] - 256);
            }
        }
        if (this.field2659[0] >= 256) {
            this.field2663 += (long) (this.field2659[0] - 256 >> 4);
        }
        if (this.field2659[1] >= 256) {
            this.field2663 += (long) (this.field2659[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2663 <<= 0x3;
            this.field2663 += (long) this.field2660[var6];
        }
        this.field2663 <<= 0x1;
        this.field2663 += (long) (this.field2661 ? 1 : 0);
        this.field2659[5] = var3;
        this.field2659[9] = var4;
        if (var1 != 0L && this.field2663 != var1) {
            field2669.method3059(var1);
        }
    }

    @ObfuscatedName("fe.l(Lar;ILar;IB)Lcd;")
    public class98 method2832(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2662 != -1) {
            return class35.method472(this.field2662).method601(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2663;
        int[] var7 = this.field2659;
        if (arg0 != null && (arg0.field916 >= 0 || arg0.field913 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2659[var8];
            }
            if (arg0.field916 >= 0) {
                var5 += (long) (arg0.field916 - this.field2659[5] << 40);
                var7[5] = arg0.field916;
            }
            if (arg0.field913 >= 0) {
                var5 += (long) (arg0.field913 - this.field2659[3] << 48);
                var7[3] = arg0.field913;
            }
        }
        class98 var9 = (class98) field2669.method3058(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method2618(var12 - 256).method757()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method1729(var12 - 512).method846(this.field2661)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2664 != -1L) {
                    var9 = (class98) field2669.method3058(this.field2664);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class93[] var13 = new class93[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class93 var17 = class40.method2618(var16 - 256).method758();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method1729(var16 - 512).method847(this.field2661);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2660[var20] < Statics.field2665[var20].length) {
                        var19.method1868(Statics.field2667[var20], Statics.field2665[var20][this.field2660[var20]]);
                    }
                    if (this.field2660[var20] < Statics.field2666[var20].length) {
                        var19.method1868(Statics.field1821[var20], Statics.field2666[var20][this.field2660[var20]]);
                    }
                }
                var9 = var19.method1900(64, 850, -30, -50, -30);
                field2669.method3057(var9, var5);
                this.field2664 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method706(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method729(var9, arg3);
        } else {
            var21 = arg0.method729(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fe.s(I)Lck;")
    public class93 method2833() {
        if (this.field2662 != -1) {
            return class35.method472(this.field2662).method602();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2659[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method2618(var3 - 256).method759()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method1729(var3 - 512).method857(this.field2661)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2659[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method2618(var7 - 256).method777();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method1729(var7 - 512).method849(this.field2661);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2660[var11] < Statics.field2665[var11].length) {
                var10.method1868(Statics.field2667[var11], Statics.field2665[var11][this.field2660[var11]]);
            }
            if (this.field2660[var11] < Statics.field2666[var11].length) {
                var10.method1868(Statics.field1821[var11], Statics.field2666[var11][this.field2660[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fe.f(B)I")
    public int method2853() {
        return this.field2662 == -1 ? (this.field2659[11] << 5) + (this.field2659[8] << 10) + (this.field2659[0] << 15) + (this.field2660[0] << 25) + (this.field2660[4] << 20) + this.field2659[1] : 305419896 + class35.method472(this.field2662).field810;
    }
}
