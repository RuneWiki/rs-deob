package deob;

@ObfuscatedName("fh")
public class class163 {

    @ObfuscatedName("fh.x")
    public int[] field2714;

    @ObfuscatedName("fh.p")
    public int[] field2712;

    @ObfuscatedName("fh.k")
    public boolean field2718;

    @ObfuscatedName("fh.a")
    public int field2713;

    @ObfuscatedName("fh.q")
    public long field2716;

    @ObfuscatedName("fh.j")
    public long field2715;

    @ObfuscatedName("fh.n")
    public static final int[] field2720 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fh.c")
    public static class170 field2721 = new class170(260);

    @ObfuscatedName("fh.x([I[IZII)V")
    public void method3113(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field909; var6++) {
                    class36 var7 = class36.method248(var6);
                    if (var7 != null && !var7.field895 && var7.field897 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2720[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2714 = arg0;
        this.field2712 = arg1;
        this.field2718 = arg2;
        this.field2713 = arg3;
        this.method3118();
    }

    @ObfuscatedName("fh.p(IZB)V")
    public void method3116(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2718) {
            return;
        }
        int var3 = this.field2714[field2720[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field909) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field909 - 1;
                }
            }
            var4 = class36.method248(var3);
        } while (var4 == null || var4.field895 || var4.field897 != arg0 + (this.field2718 ? 7 : 0));
        this.field2714[field2720[arg0]] = var3 + 256;
        this.method3118();
    }

    @ObfuscatedName("fh.k(IZI)V")
    public void method3115(int arg0, boolean arg1) {
        int var3 = this.field2712[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2719[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2719[arg0].length - 1;
            }
        }
        this.field2712[arg0] = var3;
        this.method3118();
    }

    @ObfuscatedName("fh.a(ZB)V")
    public void method3137(boolean arg0) {
        if (this.field2718 != arg0) {
            this.method3113((int[]) null, this.field2712, arg0, -1);
        }
    }

    @ObfuscatedName("fh.q(Ldg;I)V")
    public void method3117(class127 arg0) {
        arg0.method2396(this.field2718 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2714[field2720[var2]];
            if (var3 == 0) {
                arg0.method2396(-1);
            } else {
                arg0.method2396(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2396(this.field2712[var4]);
        }
    }

    @ObfuscatedName("fh.j(I)V")
    public void method3118() {
        long var1 = this.field2716;
        int var3 = this.field2714[5];
        int var4 = this.field2714[9];
        this.field2714[5] = var4;
        this.field2714[9] = var3;
        this.field2716 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2716 <<= 0x4;
            if (this.field2714[var5] >= 256) {
                this.field2716 += (long) (this.field2714[var5] - 256);
            }
        }
        if (this.field2714[0] >= 256) {
            this.field2716 += (long) (this.field2714[0] - 256 >> 4);
        }
        if (this.field2714[1] >= 256) {
            this.field2716 += (long) (this.field2714[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2716 <<= 0x3;
            this.field2716 += (long) this.field2712[var6];
        }
        this.field2716 <<= 0x1;
        this.field2716 += (long) (this.field2718 ? 1 : 0);
        this.field2714[5] = var3;
        this.field2714[9] = var4;
        if (var1 != 0L && this.field2716 != var1) {
            field2721.method3208(var1);
        }
    }

    @ObfuscatedName("fh.v(Lao;ILao;II)Ldi;")
    public class112 method3140(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2713 != -1) {
            return Statics.method1391(this.field2713).method590(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2716;
        int[] var7 = this.field2714;
        if (arg0 != null && (arg0.field859 >= 0 || arg0.field867 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2714[var8];
            }
            if (arg0.field859 >= 0) {
                var5 += (long) (arg0.field859 - this.field2714[5] << 40);
                var7[5] = arg0.field859;
            }
            if (arg0.field867 >= 0) {
                var5 += (long) (arg0.field867 - this.field2714[3] << 48);
                var7[3] = arg0.field867;
            }
        }
        class112 var9 = (class112) field2721.method3196(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method248(var12 - 256).method736()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method125(var12 - 512).method812(this.field2718)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2715 != -1L) {
                    var9 = (class112) field2721.method3196(this.field2715);
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
                        class101 var17 = class36.method248(var16 - 256).method760();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method125(var16 - 512).method813(this.field2718);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2712[var20] < Statics.field2719[var20].length) {
                        var19.method2016(Statics.field2717[var20], Statics.field2719[var20][this.field2712[var20]]);
                    }
                    if (this.field2712[var20] < Statics.field2333[var20].length) {
                        var19.method2016(Statics.field1415[var20], Statics.field2333[var20][this.field2712[var20]]);
                    }
                }
                var9 = var19.method2004(64, 850, -30, -50, -30);
                field2721.method3197(var9, var5);
                this.field2715 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method684(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method686(var9, arg3);
        } else {
            var21 = arg0.method686(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fh.w(I)Lcy;")
    public class101 method3122() {
        if (this.field2713 != -1) {
            return Statics.method1391(this.field2713).method581();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2714[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method248(var3 - 256).method738()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method125(var3 - 512).method821(this.field2718)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2714[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method248(var7 - 256).method739();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method125(var7 - 512).method815(this.field2718);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2712[var11] < Statics.field2719[var11].length) {
                var10.method2016(Statics.field2717[var11], Statics.field2719[var11][this.field2712[var11]]);
            }
            if (this.field2712[var11] < Statics.field2333[var11].length) {
                var10.method2016(Statics.field1415[var11], Statics.field2333[var11][this.field2712[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fh.l(I)I")
    public int method3114() {
        return this.field2713 == -1 ? (this.field2714[11] << 5) + (this.field2714[8] << 10) + (this.field2714[0] << 15) + (this.field2712[4] << 20) + (this.field2712[0] << 25) + this.field2714[1] : 305419896 + Statics.method1391(this.field2713).field747;
    }

    @ObfuscatedName("b.s(I)V")
    public static void method136() {
        field2721.method3198();
    }
}
