package deob;

@ObfuscatedName("ff")
public class class166 {

    @ObfuscatedName("ff.e")
    public int[] field2772;

    @ObfuscatedName("ff.i")
    public int[] field2770;

    @ObfuscatedName("ff.k")
    public boolean field2766;

    @ObfuscatedName("ff.q")
    public int field2767;

    @ObfuscatedName("ff.j")
    public long field2768;

    @ObfuscatedName("ff.z")
    public long field2769;

    @ObfuscatedName("ff.u")
    public static final int[] field2773 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ff.p")
    public static class172 field2774 = new class172(260);

    @ObfuscatedName("ff.e([I[IZIB)V")
    public void method3237(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2359; var6++) {
                    class37 var7 = class37.method161(var6);
                    if (var7 != null && !var7.field958 && var5 + (arg2 ? 7 : 0) == var7.field942) {
                        arg0[field2773[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2772 = arg0;
        this.field2770 = arg1;
        this.field2766 = arg2;
        this.field2767 = arg3;
        this.method3225();
    }

    @ObfuscatedName("ff.i(IZI)V")
    public void method3222(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2766) {
            return;
        }
        int var3 = this.field2772[field2773[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class37 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2359) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2359 - 1;
                }
            }
            var4 = class37.method161(var3);
        } while (var4 == null || var4.field958 || var4.field942 != arg0 + (this.field2766 ? 7 : 0));
        this.field2772[field2773[arg0]] = var3 + 256;
        this.method3225();
    }

    @ObfuscatedName("ff.k(IZI)V")
    public void method3244(int arg0, boolean arg1) {
        int var3 = this.field2770[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2771[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2771[arg0].length - 1;
            }
        }
        this.field2770[arg0] = var3;
        this.method3225();
    }

    @ObfuscatedName("ff.q(ZI)V")
    public void method3251(boolean arg0) {
        if (this.field2766 != arg0) {
            this.method3237((int[]) null, this.field2770, arg0, -1);
        }
    }

    @ObfuscatedName("ff.j(Ldl;B)V")
    public void method3224(class128 arg0) {
        arg0.method2634(this.field2766 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2772[field2773[var2]];
            if (var3 == 0) {
                arg0.method2634(-1);
            } else {
                arg0.method2634(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2634(this.field2770[var4]);
        }
    }

    @ObfuscatedName("ff.z(B)V")
    public void method3225() {
        long var1 = this.field2768;
        int var3 = this.field2772[5];
        int var4 = this.field2772[9];
        this.field2772[5] = var4;
        this.field2772[9] = var3;
        this.field2768 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2768 <<= 0x4;
            if (this.field2772[var5] >= 256) {
                this.field2768 += (long) (this.field2772[var5] - 256);
            }
        }
        if (this.field2772[0] >= 256) {
            this.field2768 += (long) (this.field2772[0] - 256 >> 4);
        }
        if (this.field2772[1] >= 256) {
            this.field2768 += (long) (this.field2772[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2768 <<= 0x3;
            this.field2768 += (long) this.field2770[var6];
        }
        this.field2768 <<= 0x1;
        this.field2768 += (long) (this.field2766 ? 1 : 0);
        this.field2772[5] = var3;
        this.field2772[9] = var4;
        if (var1 != 0L && this.field2768 != var1) {
            field2774.method3263(var1);
        }
    }

    @ObfuscatedName("ff.m(Lae;ILae;II)Ldo;")
    public class113 method3226(class35 arg0, int arg1, class35 arg2, int arg3) {
        if (this.field2767 != -1) {
            return class32.method48(this.field2767).method648(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2768;
        int[] var7 = this.field2772;
        if (arg0 != null && (arg0.field908 >= 0 || arg0.field909 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2772[var8];
            }
            if (arg0.field908 >= 0) {
                var5 += (long) (arg0.field908 - this.field2772[5] << 40);
                var7[5] = arg0.field908;
            }
            if (arg0.field909 >= 0) {
                var5 += (long) (arg0.field909 - this.field2772[3] << 48);
                var7[3] = arg0.field909;
            }
        }
        class113 var9 = (class113) field2774.method3262(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class37.method161(var12 - 256).method829()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class41.method2718(var12 - 512).method898(this.field2766)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2769 != -1L) {
                    var9 = (class113) field2774.method3262(this.field2769);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class102[] var13 = new class102[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class102 var17 = class37.method161(var16 - 256).method810();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class102 var18 = class41.method2718(var16 - 512).method888(this.field2766);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class102 var19 = new class102(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2770[var20] < Statics.field2771[var20].length) {
                        var19.method2063(Statics.field2775[var20], Statics.field2771[var20][this.field2770[var20]]);
                    }
                    if (this.field2770[var20] < Statics.field1384[var20].length) {
                        var19.method2063(Statics.field2764[var20], Statics.field1384[var20][this.field2770[var20]]);
                    }
                }
                var9 = var19.method2054(64, 850, -30, -50, -30);
                field2774.method3264(var9, var5);
                this.field2769 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class113 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method760(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method764(var9, arg3);
        } else {
            var21 = arg0.method764(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ff.w(I)Lcq;")
    public class102 method3227() {
        if (this.field2767 != -1) {
            return class32.method48(this.field2767).method649();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2772[var2];
            if (var3 >= 256 && var3 < 512 && !class37.method161(var3 - 256).method830()) {
                var1 = true;
            }
            if (var3 >= 512 && !class41.method2718(var3 - 512).method920(this.field2766)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class102[] var4 = new class102[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2772[var6];
            if (var7 >= 256 && var7 < 512) {
                class102 var8 = class37.method161(var7 - 256).method827();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class102 var9 = class41.method2718(var7 - 512).method889(this.field2766);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class102 var10 = new class102(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2770[var11] < Statics.field2771[var11].length) {
                var10.method2063(Statics.field2775[var11], Statics.field2771[var11][this.field2770[var11]]);
            }
            if (this.field2770[var11] < Statics.field1384[var11].length) {
                var10.method2063(Statics.field2764[var11], Statics.field1384[var11][this.field2770[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ff.a(I)I")
    public int method3228() {
        return this.field2767 == -1 ? (this.field2772[11] << 5) + (this.field2772[8] << 10) + (this.field2772[0] << 15) + (this.field2770[4] << 20) + (this.field2770[0] << 25) + this.field2772[1] : 305419896 + class32.method48(this.field2767).field797;
    }
}
