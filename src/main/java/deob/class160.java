package deob;

@ObfuscatedName("fq")
public class class160 {

    @ObfuscatedName("fq.x")
    public int[] field2687;

    @ObfuscatedName("fq.v")
    public int[] field2689;

    @ObfuscatedName("fq.m")
    public boolean field2686;

    @ObfuscatedName("fq.e")
    public int field2690;

    @ObfuscatedName("fq.h")
    public long field2685;

    @ObfuscatedName("fq.p")
    public long field2692;

    @ObfuscatedName("fq.k")
    public static final int[] field2684 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fq.q")
    public static class174 field2693 = new class174(260);

    @ObfuscatedName("fq.x([I[IZIB)V")
    public void method2934(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field954; var6++) {
                    class41 var7 = class41.method2686(var6);
                    if (var7 != null && !var7.field966 && var5 + (arg2 ? 7 : 0) == var7.field956) {
                        arg0[field2684[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2687 = arg0;
        this.field2689 = arg1;
        this.field2686 = arg2;
        this.field2690 = arg3;
        this.method2948();
    }

    @ObfuscatedName("fq.v(IZI)V")
    public void method2949(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2686) {
            return;
        }
        int var3 = this.field2687[field2684[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class41 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field954) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field954 - 1;
                }
            }
            var4 = class41.method2686(var3);
        } while (var4 == null || var4.field966 || arg0 + (this.field2686 ? 7 : 0) != var4.field956);
        this.field2687[field2684[arg0]] = var3 + 256;
        this.method2948();
    }

    @ObfuscatedName("fq.m(IZI)V")
    public void method2932(int arg0, boolean arg1) {
        int var3 = this.field2689[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1902[arg0].length) {
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
                    var3 = Statics.field1902[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2689[arg0] = var3;
        this.method2948();
    }

    @ObfuscatedName("fq.e(ZI)V")
    public void method2933(boolean arg0) {
        if (this.field2686 != arg0) {
            this.method2934((int[]) null, this.field2689, arg0, -1);
        }
    }

    @ObfuscatedName("fq.h(Ldm;I)V")
    public void method2946(class108 arg0) {
        arg0.method2113(this.field2686 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2687[field2684[var2]];
            if (var3 == 0) {
                arg0.method2113(-1);
            } else {
                arg0.method2113(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2113(this.field2689[var4]);
        }
    }

    @ObfuscatedName("fq.p(I)V")
    public void method2948() {
        long var1 = this.field2685;
        int var3 = this.field2687[5];
        int var4 = this.field2687[9];
        this.field2687[5] = var4;
        this.field2687[9] = var3;
        this.field2685 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2685 <<= 0x4;
            if (this.field2687[var5] >= 256) {
                this.field2685 += (long) (this.field2687[var5] - 256);
            }
        }
        if (this.field2687[0] >= 256) {
            this.field2685 += (long) (this.field2687[0] - 256 >> 4);
        }
        if (this.field2687[1] >= 256) {
            this.field2685 += (long) (this.field2687[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2685 <<= 0x3;
            this.field2685 += (long) this.field2689[var6];
        }
        this.field2685 <<= 0x1;
        this.field2685 += (long) (this.field2686 ? 1 : 0);
        this.field2687[5] = var3;
        this.field2687[9] = var4;
        if (var1 != 0L && this.field2685 != var1) {
            field2693.method3179(var1);
        }
    }

    @ObfuscatedName("fq.j(Lar;ILar;IB)Lck;")
    public class99 method2935(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field2690 != -1) {
            return class36.method119(this.field2690).method642(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2685;
        int[] var7 = this.field2687;
        if (arg0 != null && (arg0.field933 >= 0 || arg0.field925 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2687[var8];
            }
            if (arg0.field933 >= 0) {
                var5 += (long) (arg0.field933 - this.field2687[5] << 40);
                var7[5] = arg0.field933;
            }
            if (arg0.field925 >= 0) {
                var5 += (long) (arg0.field925 - this.field2687[3] << 48);
                var7[3] = arg0.field925;
            }
        }
        class99 var9 = (class99) field2693.method3186(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class41.method2686(var12 - 256).method795()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class46.method1975(var12 - 512).method873(this.field2686)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2692 != -1L) {
                    var9 = (class99) field2693.method3186(this.field2692);
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
                        class94 var17 = class41.method2686(var16 - 256).method791();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class94 var18 = class46.method1975(var16 - 512).method870(this.field2686);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class94 var19 = new class94(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2689[var20] < Statics.field1902[var20].length) {
                        var19.method1948(Statics.field2688[var20], Statics.field1902[var20][this.field2689[var20]]);
                    }
                    if (this.field2689[var20] < Statics.field2691[var20].length) {
                        var19.method1948(Statics.field506[var20], Statics.field2691[var20][this.field2689[var20]]);
                    }
                }
                var9 = var19.method1941(64, 850, -30, -50, -30);
                field2693.method3183(var9, var5);
                this.field2692 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class99 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method739(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method736(var9, arg3);
        } else {
            var21 = arg0.method736(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fq.i(I)Lcs;")
    public class94 method2936() {
        if (this.field2690 != -1) {
            return class36.method119(this.field2690).method643();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2687[var2];
            if (var3 >= 256 && var3 < 512 && !class41.method2686(var3 - 256).method790()) {
                var1 = true;
            }
            if (var3 >= 512 && !class46.method1975(var3 - 512).method883(this.field2686)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class94[] var4 = new class94[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2687[var6];
            if (var7 >= 256 && var7 < 512) {
                class94 var8 = class41.method2686(var7 - 256).method788();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class94 var9 = class46.method1975(var7 - 512).method871(this.field2686);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class94 var10 = new class94(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2689[var11] < Statics.field1902[var11].length) {
                var10.method1948(Statics.field2688[var11], Statics.field1902[var11][this.field2689[var11]]);
            }
            if (this.field2689[var11] < Statics.field2691[var11].length) {
                var10.method1948(Statics.field506[var11], Statics.field2691[var11][this.field2689[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fq.u(I)I")
    public int method2937() {
        return this.field2690 == -1 ? (this.field2687[11] << 5) + (this.field2687[8] << 10) + (this.field2687[0] << 15) + (this.field2689[4] << 20) + (this.field2689[0] << 25) + this.field2687[1] : 305419896 + class36.method119(this.field2690).field809;
    }
}
