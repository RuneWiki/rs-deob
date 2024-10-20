package deob;

@ObfuscatedName("fr")
public class class167 {

    @ObfuscatedName("fr.x")
    public int[] field2168;

    @ObfuscatedName("fr.j")
    public int[] field2161;

    @ObfuscatedName("fr.c")
    public boolean field2162;

    @ObfuscatedName("fr.d")
    public int field2165;

    @ObfuscatedName("fr.w")
    public long field2164;

    @ObfuscatedName("fr.h")
    public long field2163;

    @ObfuscatedName("fr.e")
    public static final int[] field2166 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fr.q")
    public static class125 field2169 = new class125(260);

    @ObfuscatedName("fr.x([I[IZII)V")
    public void method2981(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field919; var6++) {
                    class193 var7 = class193.method3092(var6);
                    if (var7 != null && !var7.field2823 && var7.field2822 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2166[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2168 = arg0;
        this.field2161 = arg1;
        this.field2162 = arg2;
        this.field2165 = arg3;
        this.method2963();
    }

    @ObfuscatedName("fr.j(IZI)V")
    public void method2959(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2162) {
            return;
        }
        int var3 = this.field2168[field2166[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class193 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field919) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field919 - 1;
                }
            }
            var4 = class193.method3092(var3);
        } while (var4 == null || var4.field2823 || var4.field2822 != arg0 + (this.field2162 ? 7 : 0));
        this.field2168[field2166[arg0]] = var3 + 256;
        this.method2963();
    }

    @ObfuscatedName("fr.c(IZI)V")
    public void method2960(int arg0, boolean arg1) {
        int var3 = this.field2161[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field63[arg0].length) {
                    var3 = 0;
                }
            } while (!class168.method2899(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field63[arg0].length - 1;
                }
            } while (!class168.method2899(arg0, var3));
        }
        this.field2161[arg0] = var3;
        this.method2963();
    }

    @ObfuscatedName("fr.d(ZB)V")
    public void method2962(boolean arg0) {
        if (this.field2162 != arg0) {
            this.method2981((int[]) null, this.field2161, arg0, -1);
        }
    }

    @ObfuscatedName("fr.w(Lek;I)V")
    public void method2972(class154 arg0) {
        arg0.method2651(this.field2162 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2168[field2166[var2]];
            if (var3 == 0) {
                arg0.method2651(-1);
            } else {
                arg0.method2651(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2651(this.field2161[var4]);
        }
    }

    @ObfuscatedName("fr.u(I)V")
    public void method2963() {
        long var1 = this.field2164;
        int var3 = this.field2168[5];
        int var4 = this.field2168[9];
        this.field2168[5] = var4;
        this.field2168[9] = var3;
        this.field2164 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2164 <<= 0x4;
            if (this.field2168[var5] >= 256) {
                this.field2164 += (long) (this.field2168[var5] - 256);
            }
        }
        if (this.field2168[0] >= 256) {
            this.field2164 += (long) (this.field2168[0] - 256 >> 4);
        }
        if (this.field2168[1] >= 256) {
            this.field2164 += (long) (this.field2168[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2164 <<= 0x3;
            this.field2164 += (long) this.field2161[var6];
        }
        this.field2164 <<= 0x1;
        this.field2164 += (long) (this.field2162 ? 1 : 0);
        this.field2168[5] = var3;
        this.field2168[9] = var4;
        if (var1 != 0L && this.field2164 != var1) {
            field2169.method2222(var1);
        }
    }

    @ObfuscatedName("fr.y(Lgy;ILgy;II)Lcj;")
    public class83 method2964(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field2165 != -1) {
            return class200.method1605(this.field2165).method3495(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2164;
        int[] var7 = this.field2168;
        if (arg0 != null && (arg0.field3067 >= 0 || arg0.field3068 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2168[var8];
            }
            if (arg0.field3067 >= 0) {
                var5 += (long) (arg0.field3067 - this.field2168[5] << 40);
                var7[5] = arg0.field3067;
            }
            if (arg0.field3068 >= 0) {
                var5 += (long) (arg0.field3068 - this.field2168[3] << 48);
                var7[3] = arg0.field3068;
            }
        }
        class83 var9 = (class83) field2169.method2221(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class193.method3092(var12 - 256).method3294()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class199.method2849(var12 - 512).method3463(this.field2162)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2163 != -1L) {
                    var9 = (class83) field2169.method2221(this.field2163);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class77[] var13 = new class77[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class77 var17 = class193.method3092(var16 - 256).method3295();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = class199.method2849(var16 - 512).method3452(this.field2162);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2161[var20] < Statics.field63[var20].length) {
                        var19.method1470(Statics.field2146[var20], Statics.field63[var20][this.field2161[var20]]);
                    }
                    if (this.field2161[var20] < Statics.field1922[var20].length) {
                        var19.method1470(Statics.field188[var20], Statics.field1922[var20][this.field2161[var20]]);
                    }
                }
                var9 = var19.method1458(64, 850, -30, -50, -30);
                field2169.method2223(var9, var5);
                this.field2163 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3564(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3550(var9, arg3);
        } else {
            var21 = arg0.method3550(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fr.e(I)Lbg;")
    public class77 method2965() {
        if (this.field2165 != -1) {
            return class200.method1605(this.field2165).method3496();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2168[var2];
            if (var3 >= 256 && var3 < 512 && !class193.method3092(var3 - 256).method3293()) {
                var1 = true;
            }
            if (var3 >= 512 && !class199.method2849(var3 - 512).method3454(this.field2162)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class77[] var4 = new class77[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2168[var6];
            if (var7 >= 256 && var7 < 512) {
                class77 var8 = class193.method3092(var7 - 256).method3314();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = class199.method2849(var7 - 512).method3445(this.field2162);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2161[var11] < Statics.field63[var11].length) {
                var10.method1470(Statics.field2146[var11], Statics.field63[var11][this.field2161[var11]]);
            }
            if (this.field2161[var11] < Statics.field1922[var11].length) {
                var10.method1470(Statics.field188[var11], Statics.field1922[var11][this.field2161[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fr.q(I)I")
    public int method2966() {
        return this.field2165 == -1 ? (this.field2168[11] << 5) + (this.field2168[8] << 10) + (this.field2168[0] << 15) + (this.field2161[0] << 25) + (this.field2161[4] << 20) + this.field2168[1] : 305419896 + class200.method1605(this.field2165).field3007;
    }
}
