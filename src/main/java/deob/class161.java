package deob;

@ObfuscatedName("fo")
public class class161 {

    @ObfuscatedName("fo.c")
    public int[] field2671;

    @ObfuscatedName("fo.j")
    public int[] field2665;

    @ObfuscatedName("fo.f")
    public boolean field2666;

    @ObfuscatedName("fo.y")
    public int field2678;

    @ObfuscatedName("fo.x")
    public long field2668;

    @ObfuscatedName("fo.e")
    public long field2669;

    @ObfuscatedName("fo.r")
    public static final int[] field2670 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fo.n")
    public static class168 field2675 = new class168(260);

    @ObfuscatedName("fo.c([I[IZII)V")
    public void method3008(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field907; var6++) {
                    class35 var7 = class35.method132(var6);
                    if (var7 != null && !var7.field912 && (arg2 ? 7 : 0) + var5 == var7.field911) {
                        arg0[field2670[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2671 = arg0;
        this.field2665 = arg1;
        this.field2666 = arg2;
        this.field2678 = arg3;
        this.method3013();
    }

    @ObfuscatedName("fo.j(IZI)V")
    public void method3033(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2666) {
            return;
        }
        int var3 = this.field2671[field2670[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class35 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field907) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field907 - 1;
                }
            }
            var4 = class35.method132(var3);
        } while (var4 == null || var4.field912 || var4.field911 != (this.field2666 ? 7 : 0) + arg0);
        this.field2671[field2670[arg0]] = var3 + 256;
        this.method3013();
    }

    @ObfuscatedName("fo.f(IZI)V")
    public void method3010(int arg0, boolean arg1) {
        int var3 = this.field2665[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2667[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2667[arg0].length - 1;
            }
        }
        this.field2665[arg0] = var3;
        this.method3013();
    }

    @ObfuscatedName("fo.y(ZI)V")
    public void method3011(boolean arg0) {
        if (this.field2666 != arg0) {
            this.method3008((int[]) null, this.field2665, arg0, -1);
        }
    }

    @ObfuscatedName("fo.x(Ldl;I)V")
    public void method3042(class125 arg0) {
        arg0.method2339(this.field2666 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2671[field2670[var2]];
            if (var3 == 0) {
                arg0.method2339(-1);
            } else {
                arg0.method2339(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2339(this.field2665[var4]);
        }
    }

    @ObfuscatedName("fo.e(I)V")
    public void method3013() {
        long var1 = this.field2668;
        int var3 = this.field2671[5];
        int var4 = this.field2671[9];
        this.field2671[5] = var4;
        this.field2671[9] = var3;
        this.field2668 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2668 <<= 0x4;
            if (this.field2671[var5] >= 256) {
                this.field2668 += (long) (this.field2671[var5] - 256);
            }
        }
        if (this.field2671[0] >= 256) {
            this.field2668 += (long) (this.field2671[0] - 256 >> 4);
        }
        if (this.field2671[1] >= 256) {
            this.field2668 += (long) (this.field2671[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2668 <<= 0x3;
            this.field2668 += (long) this.field2665[var6];
        }
        this.field2668 <<= 0x1;
        this.field2668 += (long) (this.field2666 ? 1 : 0);
        this.field2671[5] = var3;
        this.field2671[9] = var4;
        if (var1 != 0L && this.field2668 != var1) {
            field2675.method3088(var1);
        }
    }

    @ObfuscatedName("fo.m(Lax;ILax;II)Ldf;")
    public class111 method3014(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field2678 != -1) {
            return class30.method804(this.field2678).method565(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2668;
        int[] var7 = this.field2671;
        if (arg0 != null && (arg0.field876 >= 0 || arg0.field871 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2671[var8];
            }
            if (arg0.field876 >= 0) {
                var5 += (long) (arg0.field876 - this.field2671[5] << 40);
                var7[5] = arg0.field876;
            }
            if (arg0.field871 >= 0) {
                var5 += (long) (arg0.field871 - this.field2671[3] << 48);
                var7[3] = arg0.field871;
            }
        }
        class111 var9 = (class111) field2675.method3087(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class35.method132(var12 - 256).method725()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class39.method2570(var12 - 512).method808(this.field2666)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2669 != -1L) {
                    var9 = (class111) field2675.method3087(this.field2669);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class100[] var13 = new class100[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class100 var17 = class35.method132(var16 - 256).method729();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class39.method2570(var16 - 512).method801(this.field2666);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2665[var20] < Statics.field2667[var20].length) {
                        var19.method1938(Statics.field2664[var20], Statics.field2667[var20][this.field2665[var20]]);
                    }
                    if (this.field2665[var20] < Statics.field2673[var20].length) {
                        var19.method1938(Statics.field2672[var20], Statics.field2673[var20][this.field2665[var20]]);
                    }
                }
                var9 = var19.method1946(64, 850, -30, -50, -30);
                field2675.method3089(var9, var5);
                this.field2669 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class111 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method667(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method702(var9, arg3);
        } else {
            var21 = arg0.method702(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fo.s(I)Lcl;")
    public class100 method3015() {
        if (this.field2678 != -1) {
            return class30.method804(this.field2678).method563();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2671[var2];
            if (var3 >= 256 && var3 < 512 && !class35.method132(var3 - 256).method727()) {
                var1 = true;
            }
            if (var3 >= 512 && !class39.method2570(var3 - 512).method814(this.field2666)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2671[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class35.method132(var7 - 256).method747();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class39.method2570(var7 - 512).method803(this.field2666);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2665[var11] < Statics.field2667[var11].length) {
                var10.method1938(Statics.field2664[var11], Statics.field2667[var11][this.field2665[var11]]);
            }
            if (this.field2665[var11] < Statics.field2673[var11].length) {
                var10.method1938(Statics.field2672[var11], Statics.field2673[var11][this.field2665[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fo.p(I)I")
    public int method3016() {
        return this.field2678 == -1 ? (this.field2671[11] << 5) + (this.field2671[8] << 10) + (this.field2671[0] << 15) + (this.field2665[0] << 25) + (this.field2665[4] << 20) + this.field2671[1] : 305419896 + class30.method804(this.field2678).field764;
    }
}
