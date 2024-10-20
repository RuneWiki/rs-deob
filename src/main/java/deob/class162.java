package deob;

@ObfuscatedName("fo")
public class class162 {

    @ObfuscatedName("fo.b")
    public int[] field2709;

    @ObfuscatedName("fo.e")
    public int[] field2714;

    @ObfuscatedName("fo.i")
    public boolean field2703;

    @ObfuscatedName("fo.k")
    public int field2706;

    @ObfuscatedName("fo.h")
    public long field2705;

    @ObfuscatedName("fo.p")
    public long field2708;

    @ObfuscatedName("fo.t")
    public static final int[] field2710 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fo.y")
    public static class176 field2717 = new class176(260);

    @ObfuscatedName("fo.b([I[IZII)V")
    public void method2967(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3027; var6++) {
                    class41 var7 = class41.method635(var6);
                    if (var7 != null && !var7.field952 && var5 + (arg2 ? 7 : 0) == var7.field945) {
                        arg0[field2710[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2709 = arg0;
        this.field2714 = arg1;
        this.field2703 = arg2;
        this.field2706 = arg3;
        this.method2973();
    }

    @ObfuscatedName("fo.e(IZI)V")
    public void method2969(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2703) {
            return;
        }
        int var3 = this.field2709[field2710[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class41 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3027) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3027 - 1;
                }
            }
            var4 = class41.method635(var3);
        } while (var4 == null || var4.field952 || var4.field945 != arg0 + (this.field2703 ? 7 : 0));
        this.field2709[field2710[arg0]] = var3 + 256;
        this.method2973();
    }

    @ObfuscatedName("fo.i(IZI)V")
    public void method2970(int arg0, boolean arg1) {
        int var3 = this.field2714[arg0];
        boolean var4;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2711[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2711[arg0].length - 1;
                }
            } while (!class158.method2435(arg0, var3));
        }
        this.field2714[arg0] = var3;
        this.method2973();
    }

    @ObfuscatedName("fo.k(ZS)V")
    public void method2971(boolean arg0) {
        if (this.field2703 != arg0) {
            this.method2967((int[]) null, this.field2714, arg0, -1);
        }
    }

    @ObfuscatedName("fo.h(Ldc;B)V")
    public void method2968(class110 arg0) {
        arg0.method2203(this.field2703 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2709[field2710[var2]];
            if (var3 == 0) {
                arg0.method2203(-1);
            } else {
                arg0.method2203(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2203(this.field2714[var4]);
        }
    }

    @ObfuscatedName("fo.p(I)V")
    public void method2973() {
        long var1 = this.field2705;
        int var3 = this.field2709[5];
        int var4 = this.field2709[9];
        this.field2709[5] = var4;
        this.field2709[9] = var3;
        this.field2705 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2705 <<= 0x4;
            if (this.field2709[var5] >= 256) {
                this.field2705 += (long) (this.field2709[var5] - 256);
            }
        }
        if (this.field2709[0] >= 256) {
            this.field2705 += (long) (this.field2709[0] - 256 >> 4);
        }
        if (this.field2709[1] >= 256) {
            this.field2705 += (long) (this.field2709[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2705 <<= 0x3;
            this.field2705 += (long) this.field2714[var6];
        }
        this.field2705 <<= 0x1;
        this.field2705 += (long) (this.field2703 ? 1 : 0);
        this.field2709[5] = var3;
        this.field2709[9] = var4;
        if (var1 != 0L && this.field2705 != var1) {
            field2717.method3219(var1);
        }
    }

    @ObfuscatedName("fo.n(Law;ILaw;II)Lcr;")
    public class99 method2988(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field2706 != -1) {
            return class36.method2556(this.field2706).method640(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2705;
        int[] var7 = this.field2709;
        if (arg0 != null && (arg0.field912 >= 0 || arg0.field905 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2709[var8];
            }
            if (arg0.field912 >= 0) {
                var5 += (long) (arg0.field912 - this.field2709[5] << 40);
                var7[5] = arg0.field912;
            }
            if (arg0.field905 >= 0) {
                var5 += (long) (arg0.field905 - this.field2709[3] << 48);
                var7[3] = arg0.field905;
            }
        }
        class99 var9 = (class99) field2717.method3218(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class41.method635(var12 - 256).method794()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class46.method2398(var12 - 512).method857(this.field2703)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2708 != -1L) {
                    var9 = (class99) field2717.method3218(this.field2708);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class94[] var13 = new class94[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class94 var17 = class41.method635(var16 - 256).method777();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class94 var18 = class46.method2398(var16 - 512).method858(this.field2703);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class94 var19 = new class94(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2714[var20] < Statics.field2711[var20].length) {
                        var19.method1879(Statics.field1662[var20], Statics.field2711[var20][this.field2714[var20]]);
                    }
                    if (this.field2714[var20] < Statics.field2731[var20].length) {
                        var19.method1879(Statics.field1935[var20], Statics.field2731[var20][this.field2714[var20]]);
                    }
                }
                var9 = var19.method1940(64, 850, -30, -50, -30);
                field2717.method3220(var9, var5);
                this.field2708 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class99 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method722(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method720(var9, arg3);
        } else {
            var21 = arg0.method720(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fo.o(I)Lcs;")
    public class94 method2989() {
        if (this.field2706 != -1) {
            return class36.method2556(this.field2706).method614();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2709[var2];
            if (var3 >= 256 && var3 < 512 && !class41.method635(var3 - 256).method778()) {
                var1 = true;
            }
            if (var3 >= 512 && !class46.method2398(var3 - 512).method887(this.field2703)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class94[] var4 = new class94[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2709[var6];
            if (var7 >= 256 && var7 < 512) {
                class94 var8 = class41.method635(var7 - 256).method779();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class94 var9 = class46.method2398(var7 - 512).method860(this.field2703);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class94 var10 = new class94(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2714[var11] < Statics.field2711[var11].length) {
                var10.method1879(Statics.field1662[var11], Statics.field2711[var11][this.field2714[var11]]);
            }
            if (this.field2714[var11] < Statics.field2731[var11].length) {
                var10.method1879(Statics.field1935[var11], Statics.field2731[var11][this.field2714[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fo.g(B)I")
    public int method2972() {
        return this.field2706 == -1 ? (this.field2709[11] << 5) + (this.field2709[8] << 10) + (this.field2709[0] << 15) + (this.field2714[0] << 25) + (this.field2714[4] << 20) + this.field2709[1] : 305419896 + class36.method2556(this.field2706).field802;
    }
}
