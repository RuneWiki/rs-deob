package deob;

@ObfuscatedName("fi")
public class class163 {

    @ObfuscatedName("fi.a")
    public int[] field2726;

    @ObfuscatedName("fi.x")
    public int[] field2731;

    @ObfuscatedName("fi.e")
    public boolean field2721;

    @ObfuscatedName("fi.r")
    public int field2722;

    @ObfuscatedName("fi.p")
    public long field2723;

    @ObfuscatedName("fi.n")
    public long field2724;

    @ObfuscatedName("fi.c")
    public static final int[] field2727 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fi.z")
    public static class170 field2728 = new class170(260);

    @ObfuscatedName("fi.a([I[IZII)V")
    public void method3149(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field935; var6++) {
                    class36 var7 = class36.method3(var6);
                    if (var7 != null && !var7.field944 && var7.field937 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2727[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2726 = arg0;
        this.field2731 = arg1;
        this.field2721 = arg2;
        this.field2722 = arg3;
        this.method3122();
    }

    @ObfuscatedName("fi.x(IZS)V")
    public void method3118(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2721) {
            return;
        }
        int var3 = this.field2726[field2727[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
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
            var4 = class36.method3(var3);
        } while (var4 == null || var4.field944 || var4.field937 != arg0 + (this.field2721 ? 7 : 0));
        this.field2726[field2727[arg0]] = var3 + 256;
        this.method3122();
    }

    @ObfuscatedName("fi.e(IZI)V")
    public void method3129(int arg0, boolean arg1) {
        int var3 = this.field2731[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2730[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2730[arg0].length - 1;
            }
        }
        this.field2731[arg0] = var3;
        this.method3122();
    }

    @ObfuscatedName("fi.r(ZI)V")
    public void method3123(boolean arg0) {
        if (this.field2721 != arg0) {
            this.method3149((int[]) null, this.field2731, arg0, -1);
        }
    }

    @ObfuscatedName("fi.p(Ldy;I)V")
    public void method3121(class127 arg0) {
        arg0.method2455(this.field2721 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2726[field2727[var2]];
            if (var3 == 0) {
                arg0.method2455(-1);
            } else {
                arg0.method2455(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2455(this.field2731[var4]);
        }
    }

    @ObfuscatedName("fi.n(B)V")
    public void method3122() {
        long var1 = this.field2723;
        int var3 = this.field2726[5];
        int var4 = this.field2726[9];
        this.field2726[5] = var4;
        this.field2726[9] = var3;
        this.field2723 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2723 <<= 0x4;
            if (this.field2726[var5] >= 256) {
                this.field2723 += (long) (this.field2726[var5] - 256);
            }
        }
        if (this.field2726[0] >= 256) {
            this.field2723 += (long) (this.field2726[0] - 256 >> 4);
        }
        if (this.field2726[1] >= 256) {
            this.field2723 += (long) (this.field2726[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2723 <<= 0x3;
            this.field2723 += (long) this.field2731[var6];
        }
        this.field2723 <<= 0x1;
        this.field2723 += (long) (this.field2721 ? 1 : 0);
        this.field2726[5] = var3;
        this.field2726[9] = var4;
        if (var1 != 0L && this.field2723 != var1) {
            field2728.method3194(var1);
        }
    }

    @ObfuscatedName("fi.o(Lav;ILav;II)Ldd;")
    public class112 method3130(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2722 != -1) {
            return class31.method3064(this.field2722).method609(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2723;
        int[] var7 = this.field2726;
        if (arg0 != null && (arg0.field906 >= 0 || arg0.field908 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2726[var8];
            }
            if (arg0.field906 >= 0) {
                var5 += (long) (arg0.field906 - this.field2726[5] << 40);
                var7[5] = arg0.field906;
            }
            if (arg0.field908 >= 0) {
                var5 += (long) (arg0.field908 - this.field2726[3] << 48);
                var7[3] = arg0.field908;
            }
        }
        class112 var9 = (class112) field2728.method3196(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method3(var12 - 256).method770()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method248(var12 - 512).method840(this.field2721)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2724 != -1L) {
                    var9 = (class112) field2728.method3196(this.field2724);
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
                        class101 var17 = class36.method3(var16 - 256).method771();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method248(var16 - 512).method870(this.field2721);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2731[var20] < Statics.field2730[var20].length) {
                        var19.method2002(Statics.field2725[var20], Statics.field2730[var20][this.field2731[var20]]);
                    }
                    if (this.field2731[var20] < Statics.field2785[var20].length) {
                        var19.method2002(Statics.field1923[var20], Statics.field2785[var20][this.field2731[var20]]);
                    }
                }
                var9 = var19.method2010(64, 850, -30, -50, -30);
                field2728.method3193(var9, var5);
                this.field2724 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method716(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method713(var9, arg3);
        } else {
            var21 = arg0.method713(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fi.l(B)Lcc;")
    public class101 method3125() {
        if (this.field2722 != -1) {
            return class31.method3064(this.field2722).method610();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2726[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method3(var3 - 256).method772()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method248(var3 - 512).method842(this.field2721)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2726[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method3(var7 - 256).method781();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method248(var7 - 512).method843(this.field2721);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2731[var11] < Statics.field2730[var11].length) {
                var10.method2002(Statics.field2725[var11], Statics.field2730[var11][this.field2731[var11]]);
            }
            if (this.field2731[var11] < Statics.field2785[var11].length) {
                var10.method2002(Statics.field1923[var11], Statics.field2785[var11][this.field2731[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fi.t(I)I")
    public int method3132() {
        return this.field2722 == -1 ? (this.field2726[11] << 5) + (this.field2726[8] << 10) + (this.field2726[0] << 15) + (this.field2731[4] << 20) + (this.field2731[0] << 25) + this.field2726[1] : 305419896 + class31.method3064(this.field2722).field788;
    }
}
