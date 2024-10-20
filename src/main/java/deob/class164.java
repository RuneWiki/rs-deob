package deob;

@ObfuscatedName("fl")
public class class164 {

    @ObfuscatedName("fl.j")
    public int[] field2734;

    @ObfuscatedName("fl.f")
    public int[] field2735;

    @ObfuscatedName("fl.o")
    public boolean field2736;

    @ObfuscatedName("fl.h")
    public int field2737;

    @ObfuscatedName("fl.u")
    public long field2738;

    @ObfuscatedName("fl.a")
    public long field2739;

    @ObfuscatedName("fl.c")
    public static final int[] field2741 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fl.b")
    public static class170 field2740 = new class170(260);

    @ObfuscatedName("fl.j([I[IZII)V")
    public void method3218(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2012; var6++) {
                    class36 var7 = Statics.method899(var6);
                    if (var7 != null && !var7.field925 && var7.field923 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2741[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2734 = arg0;
        this.field2735 = arg1;
        this.field2736 = arg2;
        this.field2737 = arg3;
        this.method3223();
    }

    @ObfuscatedName("fl.f(IZI)V")
    public void method3246(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2736) {
            return;
        }
        int var3 = this.field2734[field2741[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2012) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2012 - 1;
                }
            }
            var4 = Statics.method899(var3);
        } while (var4 == null || var4.field925 || var4.field923 != (this.field2736 ? 7 : 0) + arg0);
        this.field2734[field2741[arg0]] = var3 + 256;
        this.method3223();
    }

    @ObfuscatedName("fl.o(IZI)V")
    public void method3219(int arg0, boolean arg1) {
        int var3 = this.field2735[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2467[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2467[arg0].length - 1;
            }
        }
        this.field2735[arg0] = var3;
        this.method3223();
    }

    @ObfuscatedName("fl.h(ZB)V")
    public void method3221(boolean arg0) {
        if (this.field2736 != arg0) {
            this.method3218((int[]) null, this.field2735, arg0, -1);
        }
    }

    @ObfuscatedName("fl.u(Ldq;I)V")
    public void method3229(class127 arg0) {
        arg0.method2450(this.field2736 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2734[field2741[var2]];
            if (var3 == 0) {
                arg0.method2450(-1);
            } else {
                arg0.method2450(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2450(this.field2735[var4]);
        }
    }

    @ObfuscatedName("fl.a(I)V")
    public void method3223() {
        long var1 = this.field2738;
        int var3 = this.field2734[5];
        int var4 = this.field2734[9];
        this.field2734[5] = var4;
        this.field2734[9] = var3;
        this.field2738 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2738 <<= 0x4;
            if (this.field2734[var5] >= 256) {
                this.field2738 += (long) (this.field2734[var5] - 256);
            }
        }
        if (this.field2734[0] >= 256) {
            this.field2738 += (long) (this.field2734[0] - 256 >> 4);
        }
        if (this.field2734[1] >= 256) {
            this.field2738 += (long) (this.field2734[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2738 <<= 0x3;
            this.field2738 += (long) this.field2735[var6];
        }
        this.field2738 <<= 0x1;
        this.field2738 += (long) (this.field2736 ? 1 : 0);
        this.field2734[5] = var3;
        this.field2734[9] = var4;
        if (var1 != 0L && this.field2738 != var1) {
            field2740.method3255(var1);
        }
    }

    @ObfuscatedName("fl.q(Lam;ILam;IB)Ldo;")
    public class112 method3224(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2737 != -1) {
            return class31.method318(this.field2737).method625(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2738;
        int[] var7 = this.field2734;
        if (arg0 != null && (arg0.field887 >= 0 || arg0.field888 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2734[var8];
            }
            if (arg0.field887 >= 0) {
                var5 += (long) (arg0.field887 - this.field2734[5] << 40);
                var7[5] = arg0.field887;
            }
            if (arg0.field888 >= 0) {
                var5 += (long) (arg0.field888 - this.field2734[3] << 48);
                var7[3] = arg0.field888;
            }
        }
        class112 var9 = (class112) field2740.method3256(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !Statics.method899(var12 - 256).method774()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method712(var12 - 512).method832(this.field2736)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2739 != -1L) {
                    var9 = (class112) field2740.method3256(this.field2739);
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
                        class101 var17 = Statics.method899(var16 - 256).method775();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method712(var16 - 512).method870(this.field2736);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2735[var20] < Statics.field2467[var20].length) {
                        var19.method2112(Statics.field1389[var20], Statics.field2467[var20][this.field2735[var20]]);
                    }
                    if (this.field2735[var20] < Statics.field753[var20].length) {
                        var19.method2112(Statics.field2742[var20], Statics.field753[var20][this.field2735[var20]]);
                    }
                }
                var9 = var19.method2083(64, 850, -30, -50, -30);
                field2740.method3257(var9, var5);
                this.field2739 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method720(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method747(var9, arg3);
        } else {
            var21 = arg0.method747(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fl.t(I)Lch;")
    public class101 method3238() {
        if (this.field2737 != -1) {
            return class31.method318(this.field2737).method626();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2734[var2];
            if (var3 >= 256 && var3 < 512 && !Statics.method899(var3 - 256).method776()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method712(var3 - 512).method842(this.field2736)) {
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
                class101 var8 = Statics.method899(var7 - 256).method777();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method712(var7 - 512).method839(this.field2736);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2735[var11] < Statics.field2467[var11].length) {
                var10.method2112(Statics.field1389[var11], Statics.field2467[var11][this.field2735[var11]]);
            }
            if (this.field2735[var11] < Statics.field753[var11].length) {
                var10.method2112(Statics.field2742[var11], Statics.field753[var11][this.field2735[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fl.n(I)I")
    public int method3226() {
        return this.field2737 == -1 ? (this.field2734[11] << 5) + (this.field2734[8] << 10) + (this.field2734[0] << 15) + (this.field2735[4] << 20) + (this.field2735[0] << 25) + this.field2734[1] : 305419896 + class31.method318(this.field2737).field770;
    }
}
