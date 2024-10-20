package deob;

@ObfuscatedName("ft")
public class class166 {

    @ObfuscatedName("ft.i")
    public int[] field2751;

    @ObfuscatedName("ft.b")
    public int[] field2760;

    @ObfuscatedName("ft.r")
    public boolean field2752;

    @ObfuscatedName("ft.l")
    public int field2754;

    @ObfuscatedName("ft.s")
    public long field2755;

    @ObfuscatedName("ft.d")
    public long field2756;

    @ObfuscatedName("ft.v")
    public static final int[] field2758 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ft.m")
    public static class172 field2753 = new class172(260);

    @ObfuscatedName("ft.i([I[IZIB)V")
    public void method3254(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field931; var6++) {
                    class37 var7 = class37.method2737(var6);
                    if (var7 != null && !var7.field929 && var7.field933 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2758[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2751 = arg0;
        this.field2760 = arg1;
        this.field2752 = arg2;
        this.field2754 = arg3;
        this.method3251();
    }

    @ObfuscatedName("ft.b(IZI)V")
    public void method3238(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2752) {
            return;
        }
        int var3 = this.field2751[field2758[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class37 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field931) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field931 - 1;
                }
            }
            var4 = class37.method2737(var3);
        } while (var4 == null || var4.field929 || arg0 + (this.field2752 ? 7 : 0) != var4.field933);
        this.field2751[field2758[arg0]] = var3 + 256;
        this.method3251();
    }

    @ObfuscatedName("ft.r(IZI)V")
    public void method3239(int arg0, boolean arg1) {
        int var3 = this.field2760[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field66[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field66[arg0].length - 1;
            }
        }
        this.field2760[arg0] = var3;
        this.method3251();
    }

    @ObfuscatedName("ft.l(ZI)V")
    public void method3236(boolean arg0) {
        if (this.field2752 != arg0) {
            this.method3254((int[]) null, this.field2760, arg0, -1);
        }
    }

    @ObfuscatedName("ft.s(Lds;B)V")
    public void method3241(class128 arg0) {
        arg0.method2449(this.field2752 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2751[field2758[var2]];
            if (var3 == 0) {
                arg0.method2449(-1);
            } else {
                arg0.method2449(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2449(this.field2760[var4]);
        }
    }

    @ObfuscatedName("ft.d(I)V")
    public void method3251() {
        long var1 = this.field2755;
        int var3 = this.field2751[5];
        int var4 = this.field2751[9];
        this.field2751[5] = var4;
        this.field2751[9] = var3;
        this.field2755 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2755 <<= 0x4;
            if (this.field2751[var5] >= 256) {
                this.field2755 += (long) (this.field2751[var5] - 256);
            }
        }
        if (this.field2751[0] >= 256) {
            this.field2755 += (long) (this.field2751[0] - 256 >> 4);
        }
        if (this.field2751[1] >= 256) {
            this.field2755 += (long) (this.field2751[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2755 <<= 0x3;
            this.field2755 += (long) this.field2760[var6];
        }
        this.field2755 <<= 0x1;
        this.field2755 += (long) (this.field2752 ? 1 : 0);
        this.field2751[5] = var3;
        this.field2751[9] = var4;
        if (var1 != 0L && this.field2755 != var1) {
            field2753.method3278(var1);
        }
    }

    @ObfuscatedName("ft.e(Lai;ILai;II)Ldt;")
    public class113 method3243(class35 arg0, int arg1, class35 arg2, int arg3) {
        if (this.field2754 != -1) {
            return class32.method167(this.field2754).method626(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2755;
        int[] var7 = this.field2751;
        if (arg0 != null && (arg0.field895 >= 0 || arg0.field897 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2751[var8];
            }
            if (arg0.field895 >= 0) {
                var5 += (long) (arg0.field895 - this.field2751[5] << 40);
                var7[5] = arg0.field895;
            }
            if (arg0.field897 >= 0) {
                var5 += (long) (arg0.field897 - this.field2751[3] << 48);
                var7[3] = arg0.field897;
            }
        }
        class113 var9 = (class113) field2753.method3277(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class37.method2737(var12 - 256).method773()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class41.method1342(var12 - 512).method836(this.field2752)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2756 != -1L) {
                    var9 = (class113) field2753.method3277(this.field2756);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class102[] var13 = new class102[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class102 var17 = class37.method2737(var16 - 256).method777();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class102 var18 = class41.method1342(var16 - 512).method837(this.field2752);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class102 var19 = new class102(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2760[var20] < Statics.field66[var20].length) {
                        var19.method2099(Statics.field2493[var20], Statics.field66[var20][this.field2760[var20]]);
                    }
                    if (this.field2760[var20] < Statics.field1640[var20].length) {
                        var19.method2099(Statics.field2757[var20], Statics.field1640[var20][this.field2760[var20]]);
                    }
                }
                var9 = var19.method2076(64, 850, -30, -50, -30);
                field2753.method3281(var9, var5);
                this.field2756 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class113 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method722(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method747(var9, arg3);
        } else {
            var21 = arg0.method747(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ft.u(I)Lco;")
    public class102 method3244() {
        if (this.field2754 != -1) {
            return class32.method167(this.field2754).method627();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2751[var2];
            if (var3 >= 256 && var3 < 512 && !class37.method2737(var3 - 256).method775()) {
                var1 = true;
            }
            if (var3 >= 512 && !class41.method1342(var3 - 512).method838(this.field2752)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class102[] var4 = new class102[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2751[var6];
            if (var7 >= 256 && var7 < 512) {
                class102 var8 = class37.method2737(var7 - 256).method776();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class102 var9 = class41.method1342(var7 - 512).method839(this.field2752);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class102 var10 = new class102(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2760[var11] < Statics.field66[var11].length) {
                var10.method2099(Statics.field2493[var11], Statics.field66[var11][this.field2760[var11]]);
            }
            if (this.field2760[var11] < Statics.field1640[var11].length) {
                var10.method2099(Statics.field2757[var11], Statics.field1640[var11][this.field2760[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ft.q(B)I")
    public int method3260() {
        return this.field2754 == -1 ? (this.field2751[11] << 5) + (this.field2751[8] << 10) + (this.field2751[0] << 15) + (this.field2760[4] << 20) + (this.field2760[0] << 25) + this.field2751[1] : 305419896 + class32.method167(this.field2754).field771;
    }
}
