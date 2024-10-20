package deob;

@ObfuscatedName("fr")
public class class164 {

    @ObfuscatedName("fr.p")
    public int[] field2748;

    @ObfuscatedName("fr.l")
    public int[] field2741;

    @ObfuscatedName("fr.d")
    public boolean field2752;

    @ObfuscatedName("fr.x")
    public int field2743;

    @ObfuscatedName("fr.o")
    public long field2744;

    @ObfuscatedName("fr.a")
    public long field2745;

    @ObfuscatedName("fr.u")
    public static final int[] field2750 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fr.s")
    public static class170 field2749 = new class170(260);

    @ObfuscatedName("fr.p([I[IZIB)V")
    public void method3348(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field913; var6++) {
                    class36 var7 = class36.method2078(var6);
                    if (var7 != null && !var7.field920 && var7.field911 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2750[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2748 = arg0;
        this.field2741 = arg1;
        this.field2752 = arg2;
        this.field2743 = arg3;
        this.method3317();
    }

    @ObfuscatedName("fr.l(IZI)V")
    public void method3322(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2752) {
            return;
        }
        int var3 = this.field2748[field2750[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field913) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field913 - 1;
                }
            }
            var4 = class36.method2078(var3);
        } while (var4 == null || var4.field920 || var4.field911 != (this.field2752 ? 7 : 0) + arg0);
        this.field2748[field2750[arg0]] = var3 + 256;
        this.method3317();
    }

    @ObfuscatedName("fr.d(IZI)V")
    public void method3321(int arg0, boolean arg1) {
        int var3 = this.field2741[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2747[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2747[arg0].length - 1;
            }
        }
        this.field2741[arg0] = var3;
        this.method3317();
    }

    @ObfuscatedName("fr.x(ZI)V")
    public void method3319(boolean arg0) {
        if (this.field2752 != arg0) {
            this.method3348((int[]) null, this.field2741, arg0, -1);
        }
    }

    @ObfuscatedName("fr.o(Lds;B)V")
    public void method3349(class127 arg0) {
        arg0.method2484(this.field2752 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2748[field2750[var2]];
            if (var3 == 0) {
                arg0.method2484(-1);
            } else {
                arg0.method2484(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2484(this.field2741[var4]);
        }
    }

    @ObfuscatedName("fr.a(I)V")
    public void method3317() {
        long var1 = this.field2744;
        int var3 = this.field2748[5];
        int var4 = this.field2748[9];
        this.field2748[5] = var4;
        this.field2748[9] = var3;
        this.field2744 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2744 <<= 0x4;
            if (this.field2748[var5] >= 256) {
                this.field2744 += (long) (this.field2748[var5] - 256);
            }
        }
        if (this.field2748[0] >= 256) {
            this.field2744 += (long) (this.field2748[0] - 256 >> 4);
        }
        if (this.field2748[1] >= 256) {
            this.field2744 += (long) (this.field2748[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2744 <<= 0x3;
            this.field2744 += (long) this.field2741[var6];
        }
        this.field2744 <<= 0x1;
        this.field2744 += (long) (this.field2752 ? 1 : 0);
        this.field2748[5] = var3;
        this.field2748[9] = var4;
        if (var1 != 0L && this.field2744 != var1) {
            field2749.method3358(var1);
        }
    }

    @ObfuscatedName("fr.w(Lar;ILar;II)Ldl;")
    public class112 method3338(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2743 != -1) {
            return class31.method2231(this.field2743).method606(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2744;
        int[] var7 = this.field2748;
        if (arg0 != null && (arg0.field868 >= 0 || arg0.field878 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2748[var8];
            }
            if (arg0.field868 >= 0) {
                var5 += (long) (arg0.field868 - this.field2748[5] << 40);
                var7[5] = arg0.field868;
            }
            if (arg0.field878 >= 0) {
                var5 += (long) (arg0.field878 - this.field2748[3] << 48);
                var7[3] = arg0.field878;
            }
        }
        class112 var9 = (class112) field2749.method3357(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method2078(var12 - 256).method779()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method31(var12 - 512).method847(this.field2752)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2745 != -1L) {
                    var9 = (class112) field2749.method3357(this.field2745);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class101[] var13 = new class101[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class101 var17 = class36.method2078(var16 - 256).method761();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method31(var16 - 512).method888(this.field2752);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2741[var20] < Statics.field2747[var20].length) {
                        var19.method2097(Statics.field2746[var20], Statics.field2747[var20][this.field2741[var20]]);
                    }
                    if (this.field2741[var20] < Statics.field2740[var20].length) {
                        var19.method2097(Statics.field2753[var20], Statics.field2740[var20][this.field2741[var20]]);
                    }
                }
                var9 = var19.method2084(64, 850, -30, -50, -30);
                field2749.method3364(var9, var5);
                this.field2745 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method713(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method710(var9, arg3);
        } else {
            var21 = arg0.method710(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fr.i(I)Lcm;")
    public class101 method3323() {
        if (this.field2743 != -1) {
            return class31.method2231(this.field2743).method627();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2748[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method2078(var3 - 256).method777()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method31(var3 - 512).method863(this.field2752)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2748[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method2078(var7 - 256).method763();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method31(var7 - 512).method857(this.field2752);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2741[var11] < Statics.field2747[var11].length) {
                var10.method2097(Statics.field2746[var11], Statics.field2747[var11][this.field2741[var11]]);
            }
            if (this.field2741[var11] < Statics.field2740[var11].length) {
                var10.method2097(Statics.field2753[var11], Statics.field2740[var11][this.field2741[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fr.y(I)I")
    public int method3324() {
        return this.field2743 == -1 ? (this.field2748[11] << 5) + (this.field2748[8] << 10) + (this.field2748[0] << 15) + (this.field2741[4] << 20) + (this.field2741[0] << 25) + this.field2748[1] : 305419896 + class31.method2231(this.field2743).field772;
    }
}
