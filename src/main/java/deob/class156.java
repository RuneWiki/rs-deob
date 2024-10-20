package deob;

@ObfuscatedName("eq")
public class class156 {

    @ObfuscatedName("eq.e")
    public int[] field2658;

    @ObfuscatedName("eq.p")
    public int[] field2652;

    @ObfuscatedName("eq.a")
    public boolean field2653;

    @ObfuscatedName("eq.g")
    public int field2654;

    @ObfuscatedName("eq.u")
    public long field2655;

    @ObfuscatedName("eq.k")
    public long field2656;

    @ObfuscatedName("eq.c")
    public static final int[] field2661 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("eq.i")
    public static class170 field2651 = new class170(260);

    @ObfuscatedName("eq.e([I[IZIB)V")
    public void method2948(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field935; var6++) {
                    class40 var7 = class40.method777(var6);
                    if (var7 != null && !var7.field944 && var5 + (arg2 ? 7 : 0) == var7.field943) {
                        arg0[field2661[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2658 = arg0;
        this.field2652 = arg1;
        this.field2653 = arg2;
        this.field2654 = arg3;
        this.method2915();
    }

    @ObfuscatedName("eq.p(IZI)V")
    public void method2911(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2653) {
            return;
        }
        int var3 = this.field2658[field2661[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field935) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field935 - 1;
                }
            }
            var4 = class40.method777(var3);
        } while (var4 == null || var4.field944 || arg0 + (this.field2653 ? 7 : 0) != var4.field943);
        this.field2658[field2661[arg0]] = var3 + 256;
        this.method2915();
    }

    @ObfuscatedName("eq.a(IZB)V")
    public void method2936(int arg0, boolean arg1) {
        int var3 = this.field2652[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field1272[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field1272[arg0].length - 1;
            }
        }
        this.field2652[arg0] = var3;
        this.method2915();
    }

    @ObfuscatedName("eq.g(ZI)V")
    public void method2913(boolean arg0) {
        if (this.field2653 != arg0) {
            this.method2948((int[]) null, this.field2652, arg0, -1);
        }
    }

    @ObfuscatedName("eq.u(Ldp;I)V")
    public void method2914(class107 arg0) {
        arg0.method2249(this.field2653 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2658[field2661[var2]];
            if (var3 == 0) {
                arg0.method2249(-1);
            } else {
                arg0.method2249(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2249(this.field2652[var4]);
        }
    }

    @ObfuscatedName("eq.k(I)V")
    public void method2915() {
        long var1 = this.field2655;
        int var3 = this.field2658[5];
        int var4 = this.field2658[9];
        this.field2658[5] = var4;
        this.field2658[9] = var3;
        this.field2655 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2655 <<= 0x4;
            if (this.field2658[var5] >= 256) {
                this.field2655 += (long) (this.field2658[var5] - 256);
            }
        }
        if (this.field2658[0] >= 256) {
            this.field2655 += (long) (this.field2658[0] - 256 >> 4);
        }
        if (this.field2658[1] >= 256) {
            this.field2655 += (long) (this.field2658[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2655 <<= 0x3;
            this.field2655 += (long) this.field2652[var6];
        }
        this.field2655 <<= 0x1;
        this.field2655 += (long) (this.field2653 ? 1 : 0);
        this.field2658[5] = var3;
        this.field2658[9] = var4;
        if (var1 != 0L && this.field2655 != var1) {
            field2651.method3160(var1);
        }
    }

    @ObfuscatedName("eq.m(Laz;ILaz;II)Lcs;")
    public class98 method2937(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2654 != -1) {
            return class35.method131(this.field2654).method634(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2655;
        int[] var7 = this.field2658;
        if (arg0 != null && (arg0.field888 >= 0 || arg0.field898 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2658[var8];
            }
            if (arg0.field888 >= 0) {
                var5 += (long) (arg0.field888 - this.field2658[5] << 40);
                var7[5] = arg0.field888;
            }
            if (arg0.field898 >= 0) {
                var5 += (long) (arg0.field898 - this.field2658[3] << 48);
                var7[3] = arg0.field898;
            }
        }
        class98 var9 = (class98) field2651.method3166(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method777(var12 - 256).method783()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method573(var12 - 512).method875(this.field2653)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2656 != -1L) {
                    var9 = (class98) field2651.method3166(this.field2656);
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
                        class93 var17 = class40.method777(var16 - 256).method784();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method573(var16 - 512).method869(this.field2653);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2652[var20] < Statics.field1272[var20].length) {
                        var19.method1892(Statics.field2657[var20], Statics.field1272[var20][this.field2652[var20]]);
                    }
                    if (this.field2652[var20] < Statics.field1516[var20].length) {
                        var19.method1892(Statics.field1937[var20], Statics.field1516[var20][this.field2652[var20]]);
                    }
                }
                var9 = var19.method1911(64, 850, -30, -50, -30);
                field2651.method3161(var9, var5);
                this.field2656 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method731(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method728(var9, arg3);
        } else {
            var21 = arg0.method728(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("eq.t(B)Lcw;")
    public class93 method2917() {
        if (this.field2654 != -1) {
            return class35.method131(this.field2654).method629();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2658[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method777(var3 - 256).method796()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method573(var3 - 512).method915(this.field2653)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2658[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method777(var7 - 256).method809();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method573(var7 - 512).method878(this.field2653);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2652[var11] < Statics.field1272[var11].length) {
                var10.method1892(Statics.field2657[var11], Statics.field1272[var11][this.field2652[var11]]);
            }
            if (this.field2652[var11] < Statics.field1516[var11].length) {
                var10.method1892(Statics.field1937[var11], Statics.field1516[var11][this.field2652[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("eq.l(B)I")
    public int method2940() {
        return this.field2654 == -1 ? (this.field2658[11] << 5) + (this.field2658[8] << 10) + (this.field2658[0] << 15) + (this.field2652[4] << 20) + (this.field2652[0] << 25) + this.field2658[1] : 305419896 + class35.method131(this.field2654).field787;
    }

    @ObfuscatedName("cy.f(B)V")
    public static void method1889() {
        field2651.method3162();
    }
}
