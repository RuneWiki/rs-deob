package deob;

@ObfuscatedName("fp")
public class class163 {

    @ObfuscatedName("fp.p")
    public int[] field2734;

    @ObfuscatedName("fp.i")
    public int[] field2727;

    @ObfuscatedName("fp.o")
    public boolean field2726;

    @ObfuscatedName("fp.n")
    public int field2729;

    @ObfuscatedName("fp.l")
    public long field2728;

    @ObfuscatedName("fp.v")
    public long field2724;

    @ObfuscatedName("fp.r")
    public static final int[] field2732 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fp.d")
    public static class170 field2725 = new class170(260);

    @ObfuscatedName("fp.p([I[IZIB)V")
    public void method3203(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field934; var6++) {
                    class36 var7 = class36.method118(var6);
                    if (var7 != null && !var7.field931 && (arg2 ? 7 : 0) + var5 == var7.field933) {
                        arg0[field2732[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2734 = arg0;
        this.field2727 = arg1;
        this.field2726 = arg2;
        this.field2729 = arg3;
        this.method3210();
    }

    @ObfuscatedName("fp.i(IZI)V")
    public void method3182(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2726) {
            return;
        }
        int var3 = this.field2734[field2732[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field934) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field934 - 1;
                }
            }
            var4 = class36.method118(var3);
        } while (var4 == null || var4.field931 || var4.field933 != arg0 + (this.field2726 ? 7 : 0));
        this.field2734[field2732[arg0]] = var3 + 256;
        this.method3210();
    }

    @ObfuscatedName("fp.o(IZB)V")
    public void method3183(int arg0, boolean arg1) {
        int var3 = this.field2727[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2733[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2733[arg0].length - 1;
            }
        }
        this.field2727[arg0] = var3;
        this.method3210();
    }

    @ObfuscatedName("fp.n(ZI)V")
    public void method3184(boolean arg0) {
        if (this.field2726 != arg0) {
            this.method3203((int[]) null, this.field2727, arg0, -1);
        }
    }

    @ObfuscatedName("fp.l(Ldt;B)V")
    public void method3185(class127 arg0) {
        arg0.method2474(this.field2726 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2734[field2732[var2]];
            if (var3 == 0) {
                arg0.method2474(-1);
            } else {
                arg0.method2474(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2474(this.field2727[var4]);
        }
    }

    @ObfuscatedName("fp.v(I)V")
    public void method3210() {
        long var1 = this.field2728;
        int var3 = this.field2734[5];
        int var4 = this.field2734[9];
        this.field2734[5] = var4;
        this.field2734[9] = var3;
        this.field2728 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2728 <<= 0x4;
            if (this.field2734[var5] >= 256) {
                this.field2728 += (long) (this.field2734[var5] - 256);
            }
        }
        if (this.field2734[0] >= 256) {
            this.field2728 += (long) (this.field2734[0] - 256 >> 4);
        }
        if (this.field2734[1] >= 256) {
            this.field2728 += (long) (this.field2734[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2728 <<= 0x3;
            this.field2728 += (long) this.field2727[var6];
        }
        this.field2728 <<= 0x1;
        this.field2728 += (long) (this.field2726 ? 1 : 0);
        this.field2734[5] = var3;
        this.field2734[9] = var4;
        if (var1 != 0L && this.field2728 != var1) {
            field2725.method3279(var1);
        }
    }

    @ObfuscatedName("fp.g(Lah;ILah;IB)Ldj;")
    public class112 method3187(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2729 != -1) {
            return class31.method2723(this.field2729).method632(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2728;
        int[] var7 = this.field2734;
        if (arg0 != null && (arg0.field892 >= 0 || arg0.field890 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2734[var8];
            }
            if (arg0.field892 >= 0) {
                var5 += (long) (arg0.field892 - this.field2734[5] << 40);
                var7[5] = arg0.field892;
            }
            if (arg0.field890 >= 0) {
                var5 += (long) (arg0.field890 - this.field2734[3] << 48);
                var7[3] = arg0.field890;
            }
        }
        class112 var9 = (class112) field2725.method3264(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method118(var12 - 256).method796()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method730(var12 - 512).method897(this.field2726)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2724 != -1L) {
                    var9 = (class112) field2725.method3264(this.field2724);
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
                        class101 var17 = class36.method118(var16 - 256).method797();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method730(var16 - 512).method864(this.field2726);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2727[var20] < Statics.field2733[var20].length) {
                        var19.method2092(Statics.field2018[var20], Statics.field2733[var20][this.field2727[var20]]);
                    }
                    if (this.field2727[var20] < Statics.field385[var20].length) {
                        var19.method2092(Statics.field2731[var20], Statics.field385[var20][this.field2727[var20]]);
                    }
                }
                var9 = var19.method2099(64, 850, -30, -50, -30);
                field2725.method3269(var9, var5);
                this.field2724 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method739(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method732(var9, arg3);
        } else {
            var21 = arg0.method732(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fp.x(I)Lcf;")
    public class101 method3188() {
        if (this.field2729 != -1) {
            return class31.method2723(this.field2729).method633();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2734[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method118(var3 - 256).method804()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method730(var3 - 512).method865(this.field2726)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2734[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method118(var7 - 256).method798();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method730(var7 - 512).method875(this.field2726);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2727[var11] < Statics.field2733[var11].length) {
                var10.method2092(Statics.field2018[var11], Statics.field2733[var11][this.field2727[var11]]);
            }
            if (this.field2727[var11] < Statics.field385[var11].length) {
                var10.method2092(Statics.field2731[var11], Statics.field385[var11][this.field2727[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fp.c(I)I")
    public int method3189() {
        return this.field2729 == -1 ? (this.field2734[11] << 5) + (this.field2734[8] << 10) + (this.field2734[0] << 15) + (this.field2727[0] << 25) + (this.field2727[4] << 20) + this.field2734[1] : 305419896 + class31.method2723(this.field2729).field811;
    }

    @ObfuscatedName("dy.f(B)V")
    public static void method2349() {
        field2725.method3265();
    }
}
