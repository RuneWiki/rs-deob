package deob;

@ObfuscatedName("ew")
public class class156 {

    @ObfuscatedName("ew.y")
    public int[] field2647;

    @ObfuscatedName("ew.u")
    public int[] field2643;

    @ObfuscatedName("ew.k")
    public boolean field2641;

    @ObfuscatedName("ew.v")
    public int field2642;

    @ObfuscatedName("ew.l")
    public long field2649;

    @ObfuscatedName("ew.g")
    public long field2640;

    @ObfuscatedName("ew.c")
    public static final int[] field2648 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ew.f")
    public static class170 field2639 = new class170(260);

    @ObfuscatedName("ew.y([I[IZII)V")
    public void method2899(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field133; var6++) {
                    class40 var7 = class40.method1590(var6);
                    if (var7 != null && !var7.field923 && (arg2 ? 7 : 0) + var5 == var7.field926) {
                        arg0[field2648[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2647 = arg0;
        this.field2643 = arg1;
        this.field2641 = arg2;
        this.field2642 = arg3;
        this.method2911();
    }

    @ObfuscatedName("ew.u(IZI)V")
    public void method2900(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2641) {
            return;
        }
        int var3 = this.field2647[field2648[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field133) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field133 - 1;
                }
            }
            var4 = class40.method1590(var3);
        } while (var4 == null || var4.field923 || var4.field926 != arg0 + (this.field2641 ? 7 : 0));
        this.field2647[field2648[arg0]] = var3 + 256;
        this.method2911();
    }

    @ObfuscatedName("ew.k(IZB)V")
    public void method2901(int arg0, boolean arg1) {
        int var3 = this.field2643[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2646[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2646[arg0].length - 1;
            }
        }
        this.field2643[arg0] = var3;
        this.method2911();
    }

    @ObfuscatedName("ew.v(ZS)V")
    public void method2902(boolean arg0) {
        if (this.field2641 != arg0) {
            this.method2899((int[]) null, this.field2643, arg0, -1);
        }
    }

    @ObfuscatedName("ew.l(Ldo;B)V")
    public void method2903(class107 arg0) {
        arg0.method2278(this.field2641 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2647[field2648[var2]];
            if (var3 == 0) {
                arg0.method2278(-1);
            } else {
                arg0.method2278(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2278(this.field2643[var4]);
        }
    }

    @ObfuscatedName("ew.g(I)V")
    public void method2911() {
        long var1 = this.field2649;
        int var3 = this.field2647[5];
        int var4 = this.field2647[9];
        this.field2647[5] = var4;
        this.field2647[9] = var3;
        this.field2649 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2649 <<= 0x4;
            if (this.field2647[var5] >= 256) {
                this.field2649 += (long) (this.field2647[var5] - 256);
            }
        }
        if (this.field2647[0] >= 256) {
            this.field2649 += (long) (this.field2647[0] - 256 >> 4);
        }
        if (this.field2647[1] >= 256) {
            this.field2649 += (long) (this.field2647[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2649 <<= 0x3;
            this.field2649 += (long) this.field2643[var6];
        }
        this.field2649 <<= 0x1;
        this.field2649 += (long) (this.field2641 ? 1 : 0);
        this.field2647[5] = var3;
        this.field2647[9] = var4;
        if (var1 != 0L && this.field2649 != var1) {
            field2639.method3139(var1);
        }
    }

    @ObfuscatedName("ew.a(Lao;ILao;II)Lcz;")
    public class98 method2908(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2642 != -1) {
            return class35.method189(this.field2642).method595(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2649;
        int[] var7 = this.field2647;
        if (arg0 != null && (arg0.field894 >= 0 || arg0.field895 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2647[var8];
            }
            if (arg0.field894 >= 0) {
                var5 += (long) (arg0.field894 - this.field2647[5] << 40);
                var7[5] = arg0.field894;
            }
            if (arg0.field895 >= 0) {
                var5 += (long) (arg0.field895 - this.field2647[3] << 48);
                var7[3] = arg0.field895;
            }
        }
        class98 var9 = (class98) field2639.method3145(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method1590(var12 - 256).method756()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method148(var12 - 512).method848(this.field2641)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2640 != -1L) {
                    var9 = (class98) field2639.method3145(this.field2640);
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
                        class93 var17 = class40.method1590(var16 - 256).method757();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method148(var16 - 512).method849(this.field2641);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2643[var20] < Statics.field2646[var20].length) {
                        var19.method1886(Statics.field2645[var20], Statics.field2646[var20][this.field2643[var20]]);
                    }
                    if (this.field2643[var20] < Statics.field1437[var20].length) {
                        var19.method1886(Statics.field2644[var20], Statics.field1437[var20][this.field2643[var20]]);
                    }
                }
                var9 = var19.method1894(64, 850, -30, -50, -30);
                field2639.method3147(var9, var5);
                this.field2640 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method697(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method690(var9, arg3);
        } else {
            var21 = arg0.method690(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ew.x(I)Lca;")
    public class93 method2912() {
        if (this.field2642 != -1) {
            return class35.method189(this.field2642).method590();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2647[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method1590(var3 - 256).method755()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method148(var3 - 512).method871(this.field2641)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2647[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method1590(var7 - 256).method759();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method148(var7 - 512).method851(this.field2641);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2643[var11] < Statics.field2646[var11].length) {
                var10.method1886(Statics.field2645[var11], Statics.field2646[var11][this.field2643[var11]]);
            }
            if (this.field2643[var11] < Statics.field1437[var11].length) {
                var10.method1886(Statics.field2644[var11], Statics.field1437[var11][this.field2643[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ew.r(S)I")
    public int method2924() {
        return this.field2642 == -1 ? (this.field2647[11] << 5) + (this.field2647[8] << 10) + (this.field2647[0] << 15) + (this.field2643[4] << 20) + (this.field2643[0] << 25) + this.field2647[1] : 305419896 + class35.method189(this.field2642).field806;
    }

    @ObfuscatedName("dz.w(B)V")
    public static void method2424() {
        field2639.method3141();
    }
}
