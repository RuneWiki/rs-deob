package deob;

@ObfuscatedName("fz")
public class class164 {

    @ObfuscatedName("fz.b")
    public int[] field2759;

    @ObfuscatedName("fz.c")
    public int[] field2751;

    @ObfuscatedName("fz.j")
    public boolean field2753;

    @ObfuscatedName("fz.i")
    public int field2752;

    @ObfuscatedName("fz.k")
    public long field2755;

    @ObfuscatedName("fz.q")
    public long field2756;

    @ObfuscatedName("fz.g")
    public static final int[] field2758 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fz.s")
    public static class170 field2761 = new class170(260);

    @ObfuscatedName("fz.b([I[IZII)V")
    public void method3167(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field929; var6++) {
                    class36 var7 = Statics.method260(var6);
                    if (var7 != null && !var7.field934 && var7.field927 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2758[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2759 = arg0;
        this.field2751 = arg1;
        this.field2753 = arg2;
        this.field2752 = arg3;
        this.method3152();
    }

    @ObfuscatedName("fz.c(IZI)V")
    public void method3153(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2753) {
            return;
        }
        int var3 = this.field2759[field2758[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field929) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field929 - 1;
                }
            }
            var4 = Statics.method260(var3);
        } while (var4 == null || var4.field934 || arg0 + (this.field2753 ? 7 : 0) != var4.field927);
        this.field2759[field2758[arg0]] = var3 + 256;
        this.method3152();
    }

    @ObfuscatedName("fz.j(IZB)V")
    public void method3154(int arg0, boolean arg1) {
        int var3 = this.field2751[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2757[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2757[arg0].length - 1;
            }
        }
        this.field2751[arg0] = var3;
        this.method3152();
    }

    @ObfuscatedName("fz.i(ZI)V")
    public void method3173(boolean arg0) {
        if (this.field2753 != arg0) {
            this.method3167((int[]) null, this.field2751, arg0, -1);
        }
    }

    @ObfuscatedName("fz.k(Ldv;I)V")
    public void method3161(class127 arg0) {
        arg0.method2590(this.field2753 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2759[field2758[var2]];
            if (var3 == 0) {
                arg0.method2590(-1);
            } else {
                arg0.method2590(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2590(this.field2751[var4]);
        }
    }

    @ObfuscatedName("fz.q(I)V")
    public void method3152() {
        long var1 = this.field2755;
        int var3 = this.field2759[5];
        int var4 = this.field2759[9];
        this.field2759[5] = var4;
        this.field2759[9] = var3;
        this.field2755 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2755 <<= 0x4;
            if (this.field2759[var5] >= 256) {
                this.field2755 += (long) (this.field2759[var5] - 256);
            }
        }
        if (this.field2759[0] >= 256) {
            this.field2755 += (long) (this.field2759[0] - 256 >> 4);
        }
        if (this.field2759[1] >= 256) {
            this.field2755 += (long) (this.field2759[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2755 <<= 0x3;
            this.field2755 += (long) this.field2751[var6];
        }
        this.field2755 <<= 0x1;
        this.field2755 += (long) (this.field2753 ? 1 : 0);
        this.field2759[5] = var3;
        this.field2759[9] = var4;
        if (var1 != 0L && this.field2755 != var1) {
            field2761.method3189(var1);
        }
    }

    @ObfuscatedName("fz.t(Law;ILaw;II)Ldr;")
    public class112 method3179(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2752 != -1) {
            return class31.method1217(this.field2752).method592(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2755;
        int[] var7 = this.field2759;
        if (arg0 != null && (arg0.field901 >= 0 || arg0.field895 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2759[var8];
            }
            if (arg0.field901 >= 0) {
                var5 += (long) (arg0.field901 - this.field2759[5] << 40);
                var7[5] = arg0.field901;
            }
            if (arg0.field895 >= 0) {
                var5 += (long) (arg0.field895 - this.field2759[3] << 48);
                var7[3] = arg0.field895;
            }
        }
        class112 var9 = (class112) field2761.method3188(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !Statics.method260(var12 - 256).method745()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method1565(var12 - 512).method826(this.field2753)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2756 != -1L) {
                    var9 = (class112) field2761.method3188(this.field2756);
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
                        class101 var17 = Statics.method260(var16 - 256).method758();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method1565(var16 - 512).method827(this.field2753);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2751[var20] < Statics.field2757[var20].length) {
                        var19.method2077(Statics.field2438[var20], Statics.field2757[var20][this.field2751[var20]]);
                    }
                    if (this.field2751[var20] < Statics.field2506[var20].length) {
                        var19.method2077(Statics.field1548[var20], Statics.field2506[var20][this.field2751[var20]]);
                    }
                }
                var9 = var19.method2046(64, 850, -30, -50, -30);
                field2761.method3190(var9, var5);
                this.field2756 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method712(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method729(var9, arg3);
        } else {
            var21 = arg0.method729(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fz.v(I)Lcu;")
    public class101 method3156() {
        if (this.field2752 != -1) {
            return class31.method1217(this.field2752).method605();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2759[var2];
            if (var3 >= 256 && var3 < 512 && !Statics.method260(var3 - 256).method748()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method1565(var3 - 512).method840(this.field2753)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2759[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = Statics.method260(var7 - 256).method762();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method1565(var7 - 512).method829(this.field2753);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2751[var11] < Statics.field2757[var11].length) {
                var10.method2077(Statics.field2438[var11], Statics.field2757[var11][this.field2751[var11]]);
            }
            if (this.field2751[var11] < Statics.field2506[var11].length) {
                var10.method2077(Statics.field1548[var11], Statics.field2506[var11][this.field2751[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fz.y(I)I")
    public int method3159() {
        return this.field2752 == -1 ? (this.field2759[11] << 5) + (this.field2759[8] << 10) + (this.field2759[0] << 15) + (this.field2751[4] << 20) + (this.field2751[0] << 25) + this.field2759[1] : 305419896 + class31.method1217(this.field2752).field791;
    }
}
