package deob;

@ObfuscatedName("ei")
public class class153 {

    @ObfuscatedName("ei.z")
    public int[] field2645;

    @ObfuscatedName("ei.n")
    public int[] field2637;

    @ObfuscatedName("ei.u")
    public boolean field2638;

    @ObfuscatedName("ei.t")
    public int field2644;

    @ObfuscatedName("ei.e")
    public long field2641;

    @ObfuscatedName("ei.a")
    public long field2639;

    @ObfuscatedName("ei.g")
    public static final int[] field2646 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ei.d")
    public static class167 field2647 = new class167(260);

    @ObfuscatedName("ei.z([I[IZIB)V")
    public void method2944(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field916; var6++) {
                    class37 var7 = Statics.method545(var6);
                    if (var7 != null && !var7.field925 && var7.field918 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2646[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2645 = arg0;
        this.field2637 = arg1;
        this.field2638 = arg2;
        this.field2644 = arg3;
        this.method2948();
    }

    @ObfuscatedName("ei.n(IZB)V")
    public void method2953(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2638) {
            return;
        }
        int var3 = this.field2645[field2646[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class37 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field916) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field916 - 1;
                }
            }
            var4 = Statics.method545(var3);
        } while (var4 == null || var4.field925 || arg0 + (this.field2638 ? 7 : 0) != var4.field918);
        this.field2645[field2646[arg0]] = var3 + 256;
        this.method2948();
    }

    @ObfuscatedName("ei.u(IZB)V")
    public void method2945(int arg0, boolean arg1) {
        int var3 = this.field2637[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2643[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2643[arg0].length - 1;
            }
        }
        this.field2637[arg0] = var3;
        this.method2948();
    }

    @ObfuscatedName("ei.t(ZB)V")
    public void method2957(boolean arg0) {
        if (this.field2638 != arg0) {
            this.method2944((int[]) null, this.field2637, arg0, -1);
        }
    }

    @ObfuscatedName("ei.e(Lcj;B)V")
    public void method2947(class104 arg0) {
        arg0.method2113(this.field2638 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2645[field2646[var2]];
            if (var3 == 0) {
                arg0.method2113(-1);
            } else {
                arg0.method2113(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2113(this.field2637[var4]);
        }
    }

    @ObfuscatedName("ei.a(B)V")
    public void method2948() {
        long var1 = this.field2641;
        int var3 = this.field2645[5];
        int var4 = this.field2645[9];
        this.field2645[5] = var4;
        this.field2645[9] = var3;
        this.field2641 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2641 <<= 0x4;
            if (this.field2645[var5] >= 256) {
                this.field2641 += (long) (this.field2645[var5] - 256);
            }
        }
        if (this.field2645[0] >= 256) {
            this.field2641 += (long) (this.field2645[0] - 256 >> 4);
        }
        if (this.field2645[1] >= 256) {
            this.field2641 += (long) (this.field2645[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2641 <<= 0x3;
            this.field2641 += (long) this.field2637[var6];
        }
        this.field2641 <<= 0x1;
        this.field2641 += (long) (this.field2638 ? 1 : 0);
        this.field2645[5] = var3;
        this.field2645[9] = var4;
        if (var1 != 0L && this.field2641 != var1) {
            field2647.method3182(var1);
        }
    }

    @ObfuscatedName("ei.l(Lah;ILah;II)Lcp;")
    public class95 method2949(class35 arg0, int arg1, class35 arg2, int arg3) {
        if (this.field2644 != -1) {
            return Statics.method15(this.field2644).method614(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2641;
        int[] var7 = this.field2645;
        if (arg0 != null && (arg0.field891 >= 0 || arg0.field890 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2645[var8];
            }
            if (arg0.field891 >= 0) {
                var5 += (long) (arg0.field891 - this.field2645[5] << 40);
                var7[5] = arg0.field891;
            }
            if (arg0.field890 >= 0) {
                var5 += (long) (arg0.field890 - this.field2645[3] << 48);
                var7[3] = arg0.field890;
            }
        }
        class95 var9 = (class95) field2647.method3183(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !Statics.method545(var12 - 256).method777()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class42.method2477(var12 - 512).method853(this.field2638)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2639 != -1L) {
                    var9 = (class95) field2647.method3183(this.field2639);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class90[] var13 = new class90[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class90 var17 = Statics.method545(var16 - 256).method774();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class90 var18 = class42.method2477(var16 - 512).method855(this.field2638);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class90 var19 = new class90(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2637[var20] < Statics.field2643[var20].length) {
                        var19.method1909(Statics.field2642[var20], Statics.field2643[var20][this.field2637[var20]]);
                    }
                    if (this.field2637[var20] < Statics.field2636[var20].length) {
                        var19.method1909(Statics.field2640[var20], Statics.field2636[var20][this.field2637[var20]]);
                    }
                }
                var9 = var19.method1975(64, 850, -30, -50, -30);
                field2647.method3185(var9, var5);
                this.field2639 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class95 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method726(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method731(var9, arg3);
        } else {
            var21 = arg0.method731(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ei.v(I)Lcv;")
    public class90 method2958() {
        if (this.field2644 != -1) {
            return Statics.method15(this.field2644).method615();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2645[var2];
            if (var3 >= 256 && var3 < 512 && !Statics.method545(var3 - 256).method775()) {
                var1 = true;
            }
            if (var3 >= 512 && !class42.method2477(var3 - 512).method856(this.field2638)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class90[] var4 = new class90[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2645[var6];
            if (var7 >= 256 && var7 < 512) {
                class90 var8 = Statics.method545(var7 - 256).method776();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class90 var9 = class42.method2477(var7 - 512).method857(this.field2638);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class90 var10 = new class90(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2637[var11] < Statics.field2643[var11].length) {
                var10.method1909(Statics.field2642[var11], Statics.field2643[var11][this.field2637[var11]]);
            }
            if (this.field2637[var11] < Statics.field2636[var11].length) {
                var10.method1909(Statics.field2640[var11], Statics.field2636[var11][this.field2637[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ei.j(I)I")
    public int method2951() {
        return this.field2644 == -1 ? (this.field2645[11] << 5) + (this.field2645[8] << 10) + (this.field2645[0] << 15) + (this.field2637[4] << 20) + (this.field2637[0] << 25) + this.field2645[1] : 305419896 + Statics.method15(this.field2644).field776;
    }
}
