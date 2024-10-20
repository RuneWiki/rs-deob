package deob;

@ObfuscatedName("fk")
public class class158 {

    @ObfuscatedName("fk.g")
    public int[] field2685;

    @ObfuscatedName("fk.s")
    public int[] field2686;

    @ObfuscatedName("fk.h")
    public boolean field2679;

    @ObfuscatedName("fk.m")
    public int field2680;

    @ObfuscatedName("fk.u")
    public long field2681;

    @ObfuscatedName("fk.j")
    public long field2678;

    @ObfuscatedName("fk.x")
    public static final int[] field2682 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fk.k")
    public static class172 field2677 = new class172(260);

    @ObfuscatedName("fk.g([I[IZII)V")
    public void method2881(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2970; var6++) {
                    class40 var7 = class40.method1854(var6);
                    if (var7 != null && !var7.field947 && var7.field941 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2682[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2685 = arg0;
        this.field2686 = arg1;
        this.field2679 = arg2;
        this.field2680 = arg3;
        this.method2885();
    }

    @ObfuscatedName("fk.s(IZB)V")
    public void method2909(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2679) {
            return;
        }
        int var3 = this.field2685[field2682[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2970) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2970 - 1;
                }
            }
            var4 = class40.method1854(var3);
        } while (var4 == null || var4.field947 || var4.field941 != arg0 + (this.field2679 ? 7 : 0));
        this.field2685[field2682[arg0]] = var3 + 256;
        this.method2885();
    }

    @ObfuscatedName("fk.h(IZI)V")
    public void method2882(int arg0, boolean arg1) {
        int var3 = this.field2686[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1655[arg0].length) {
                    var3 = 0;
                }
            } while (!class154.method2750(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1655[arg0].length - 1;
                }
            } while (!class154.method2750(arg0, var3));
        }
        this.field2686[arg0] = var3;
        this.method2885();
    }

    @ObfuscatedName("fk.m(ZB)V")
    public void method2883(boolean arg0) {
        if (this.field2679 != arg0) {
            this.method2881((int[]) null, this.field2686, arg0, -1);
        }
    }

    @ObfuscatedName("fk.u(Ldi;I)V")
    public void method2884(class107 arg0) {
        arg0.method2087(this.field2679 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2685[field2682[var2]];
            if (var3 == 0) {
                arg0.method2087(-1);
            } else {
                arg0.method2087(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2087(this.field2686[var4]);
        }
    }

    @ObfuscatedName("fk.j(I)V")
    public void method2885() {
        long var1 = this.field2681;
        int var3 = this.field2685[5];
        int var4 = this.field2685[9];
        this.field2685[5] = var4;
        this.field2685[9] = var3;
        this.field2681 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2681 <<= 0x4;
            if (this.field2685[var5] >= 256) {
                this.field2681 += (long) (this.field2685[var5] - 256);
            }
        }
        if (this.field2685[0] >= 256) {
            this.field2681 += (long) (this.field2685[0] - 256 >> 4);
        }
        if (this.field2685[1] >= 256) {
            this.field2681 += (long) (this.field2685[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2681 <<= 0x3;
            this.field2681 += (long) this.field2686[var6];
        }
        this.field2681 <<= 0x1;
        this.field2681 += (long) (this.field2679 ? 1 : 0);
        this.field2685[5] = var3;
        this.field2685[9] = var4;
        if (var1 != 0L && this.field2681 != var1) {
            field2677.method3125(var1);
        }
    }

    @ObfuscatedName("fk.b(Lac;ILac;II)Lcl;")
    public class98 method2886(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2680 != -1) {
            return class35.method12(this.field2680).method620(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2681;
        int[] var7 = this.field2685;
        if (arg0 != null && (arg0.field898 >= 0 || arg0.field909 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2685[var8];
            }
            if (arg0.field898 >= 0) {
                var5 += (long) (arg0.field898 - this.field2685[5] << 40);
                var7[5] = arg0.field898;
            }
            if (arg0.field909 >= 0) {
                var5 += (long) (arg0.field909 - this.field2685[3] << 48);
                var7[3] = arg0.field909;
            }
        }
        class98 var9 = (class98) field2677.method3130(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method1854(var12 - 256).method760()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method612(var12 - 512).method840(this.field2679)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2678 != -1L) {
                    var9 = (class98) field2677.method3130(this.field2678);
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
                        class93 var17 = class40.method1854(var16 - 256).method761();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method612(var16 - 512).method851(this.field2679);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2686[var20] < Statics.field1655[var20].length) {
                        var19.method1877(Statics.field2683[var20], Statics.field1655[var20][this.field2686[var20]]);
                    }
                    if (this.field2686[var20] < Statics.field1662[var20].length) {
                        var19.method1877(Statics.field2481[var20], Statics.field1662[var20][this.field2686[var20]]);
                    }
                }
                var9 = var19.method1885(64, 850, -30, -50, -30);
                field2677.method3126(var9, var5);
                this.field2678 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method711(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method708(var9, arg3);
        } else {
            var21 = arg0.method708(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fk.v(B)Lcv;")
    public class93 method2887() {
        if (this.field2680 != -1) {
            return class35.method12(this.field2680).method621();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2685[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method1854(var3 - 256).method772()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method612(var3 - 512).method841(this.field2679)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2685[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method1854(var7 - 256).method763();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method612(var7 - 512).method842(this.field2679);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2686[var11] < Statics.field1655[var11].length) {
                var10.method1877(Statics.field2683[var11], Statics.field1655[var11][this.field2686[var11]]);
            }
            if (this.field2686[var11] < Statics.field1662[var11].length) {
                var10.method1877(Statics.field2481[var11], Statics.field1662[var11][this.field2686[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fk.y(B)I")
    public int method2904() {
        return this.field2680 == -1 ? (this.field2685[11] << 5) + (this.field2685[8] << 10) + (this.field2685[0] << 15) + (this.field2686[0] << 25) + (this.field2686[4] << 20) + this.field2685[1] : 305419896 + class35.method12(this.field2680).field791;
    }
}
