package deob;

@ObfuscatedName("fa")
public class class160 {

    @ObfuscatedName("fa.g")
    public int[] field2693;

    @ObfuscatedName("fa.j")
    public int[] field2685;

    @ObfuscatedName("fa.z")
    public boolean field2686;

    @ObfuscatedName("fa.b")
    public int field2687;

    @ObfuscatedName("fa.k")
    public long field2692;

    @ObfuscatedName("fa.c")
    public long field2689;

    @ObfuscatedName("fa.h")
    public static final int[] field2690 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fa.y")
    public static class174 field2688 = new class174(260);

    @ObfuscatedName("fa.g([I[IZIB)V")
    public void method2891(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field956; var6++) {
                    class41 var7 = class41.method667(var6);
                    if (var7 != null && !var7.field958 && var5 + (arg2 ? 7 : 0) == var7.field955) {
                        arg0[field2690[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2693 = arg0;
        this.field2685 = arg1;
        this.field2686 = arg2;
        this.field2687 = arg3;
        this.method2874();
    }

    @ObfuscatedName("fa.j(IZB)V")
    public void method2871(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2686) {
            return;
        }
        int var3 = this.field2693[field2690[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class41 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field956) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field956 - 1;
                }
            }
            var4 = class41.method667(var3);
        } while (var4 == null || var4.field958 || arg0 + (this.field2686 ? 7 : 0) != var4.field955);
        this.field2693[field2690[arg0]] = var3 + 256;
        this.method2874();
    }

    @ObfuscatedName("fa.z(IZI)V")
    public void method2872(int arg0, boolean arg1) {
        int var3 = this.field2685[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1450[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 == 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1450[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2685[arg0] = var3;
        this.method2874();
    }

    @ObfuscatedName("fa.b(ZS)V")
    public void method2873(boolean arg0) {
        if (this.field2686 != arg0) {
            this.method2891((int[]) null, this.field2685, arg0, -1);
        }
    }

    @ObfuscatedName("fa.k(Ldf;I)V")
    public void method2883(class108 arg0) {
        arg0.method2069(this.field2686 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2693[field2690[var2]];
            if (var3 == 0) {
                arg0.method2069(-1);
            } else {
                arg0.method2069(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2069(this.field2685[var4]);
        }
    }

    @ObfuscatedName("fa.c(B)V")
    public void method2874() {
        long var1 = this.field2692;
        int var3 = this.field2693[5];
        int var4 = this.field2693[9];
        this.field2693[5] = var4;
        this.field2693[9] = var3;
        this.field2692 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2692 <<= 0x4;
            if (this.field2693[var5] >= 256) {
                this.field2692 += (long) (this.field2693[var5] - 256);
            }
        }
        if (this.field2693[0] >= 256) {
            this.field2692 += (long) (this.field2693[0] - 256 >> 4);
        }
        if (this.field2693[1] >= 256) {
            this.field2692 += (long) (this.field2693[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2692 <<= 0x3;
            this.field2692 += (long) this.field2685[var6];
        }
        this.field2692 <<= 0x1;
        this.field2692 += (long) (this.field2686 ? 1 : 0);
        this.field2693[5] = var3;
        this.field2693[9] = var4;
        if (var1 != 0L && this.field2692 != var1) {
            field2688.method3098(var1);
        }
    }

    @ObfuscatedName("fa.w(Lah;ILah;IB)Lcx;")
    public class99 method2875(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field2687 != -1) {
            return class36.method2273(this.field2687).method584(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2692;
        int[] var7 = this.field2693;
        if (arg0 != null && (arg0.field922 >= 0 || arg0.field926 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2693[var8];
            }
            if (arg0.field922 >= 0) {
                var5 += (long) (arg0.field922 - this.field2693[5] << 40);
                var7[5] = arg0.field922;
            }
            if (arg0.field926 >= 0) {
                var5 += (long) (arg0.field926 - this.field2693[3] << 48);
                var7[3] = arg0.field926;
            }
        }
        class99 var9 = (class99) field2688.method3097(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class41.method667(var12 - 256).method729()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class46.method86(var12 - 512).method824(this.field2686)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2689 != -1L) {
                    var9 = (class99) field2688.method3097(this.field2689);
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
                        class94 var17 = class41.method667(var16 - 256).method730();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class94 var18 = class46.method86(var16 - 512).method810(this.field2686);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class94 var19 = new class94(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2685[var20] < Statics.field1450[var20].length) {
                        var19.method1847(Statics.field2684[var20], Statics.field1450[var20][this.field2685[var20]]);
                    }
                    if (this.field2685[var20] < Statics.field2691[var20].length) {
                        var19.method1847(Statics.field795[var20], Statics.field2691[var20][this.field2685[var20]]);
                    }
                }
                var9 = var19.method1917(64, 850, -30, -50, -30);
                field2688.method3099(var9, var5);
                this.field2689 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class99 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method679(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method701(var9, arg3);
        } else {
            var21 = arg0.method701(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fa.l(I)Lci;")
    public class94 method2876() {
        if (this.field2687 != -1) {
            return class36.method2273(this.field2687).method581();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2693[var2];
            if (var3 >= 256 && var3 < 512 && !class41.method667(var3 - 256).method731()) {
                var1 = true;
            }
            if (var3 >= 512 && !class46.method86(var3 - 512).method819(this.field2686)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class94[] var4 = new class94[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2693[var6];
            if (var7 >= 256 && var7 < 512) {
                class94 var8 = class41.method667(var7 - 256).method732();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class94 var9 = class46.method86(var7 - 512).method820(this.field2686);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class94 var10 = new class94(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2685[var11] < Statics.field1450[var11].length) {
                var10.method1847(Statics.field2684[var11], Statics.field1450[var11][this.field2685[var11]]);
            }
            if (this.field2685[var11] < Statics.field2691[var11].length) {
                var10.method1847(Statics.field795[var11], Statics.field2691[var11][this.field2685[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fa.n(I)I")
    public int method2877() {
        return this.field2687 == -1 ? (this.field2693[11] << 5) + (this.field2693[8] << 10) + (this.field2693[0] << 15) + (this.field2685[4] << 20) + (this.field2685[0] << 25) + this.field2693[1] : 305419896 + class36.method2273(this.field2687).field820;
    }

    @ObfuscatedName("e.d(I)V")
    public static void method493() {
        field2688.method3100();
    }
}
