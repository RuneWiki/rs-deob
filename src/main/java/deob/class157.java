package deob;

@ObfuscatedName("fe")
public class class157 {

    @ObfuscatedName("fe.b")
    public int[] field2674;

    @ObfuscatedName("fe.u")
    public int[] field2668;

    @ObfuscatedName("fe.x")
    public boolean field2670;

    @ObfuscatedName("fe.j")
    public int field2671;

    @ObfuscatedName("fe.o")
    public long field2672;

    @ObfuscatedName("fe.n")
    public long field2669;

    @ObfuscatedName("fe.k")
    public static final int[] field2675 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fe.q")
    public static class171 field2676 = new class171(260);

    @ObfuscatedName("fe.b([I[IZIB)V")
    public void method2884(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field943; var6++) {
                    class40 var7 = class40.method1870(var6);
                    if (var7 != null && !var7.field954 && var7.field947 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2675[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2674 = arg0;
        this.field2668 = arg1;
        this.field2670 = arg2;
        this.field2671 = arg3;
        this.method2903();
    }

    @ObfuscatedName("fe.u(IZI)V")
    public void method2885(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2670) {
            return;
        }
        int var3 = this.field2674[field2675[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field943) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field943 - 1;
                }
            }
            var4 = class40.method1870(var3);
        } while (var4 == null || var4.field954 || arg0 + (this.field2670 ? 7 : 0) != var4.field947);
        this.field2674[field2675[arg0]] = var3 + 256;
        this.method2903();
    }

    @ObfuscatedName("fe.x(IZI)V")
    public void method2913(int arg0, boolean arg1) {
        int var3 = this.field2668[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2673[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2673[arg0].length - 1;
            }
        }
        this.field2668[arg0] = var3;
        this.method2903();
    }

    @ObfuscatedName("fe.j(ZS)V")
    public void method2887(boolean arg0) {
        if (this.field2670 != arg0) {
            this.method2884((int[]) null, this.field2668, arg0, -1);
        }
    }

    @ObfuscatedName("fe.o(Ldh;B)V")
    public void method2890(class107 arg0) {
        arg0.method2242(this.field2670 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2674[field2675[var2]];
            if (var3 == 0) {
                arg0.method2242(-1);
            } else {
                arg0.method2242(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2242(this.field2668[var4]);
        }
    }

    @ObfuscatedName("fe.n(I)V")
    public void method2903() {
        long var1 = this.field2672;
        int var3 = this.field2674[5];
        int var4 = this.field2674[9];
        this.field2674[5] = var4;
        this.field2674[9] = var3;
        this.field2672 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2672 <<= 0x4;
            if (this.field2674[var5] >= 256) {
                this.field2672 += (long) (this.field2674[var5] - 256);
            }
        }
        if (this.field2674[0] >= 256) {
            this.field2672 += (long) (this.field2674[0] - 256 >> 4);
        }
        if (this.field2674[1] >= 256) {
            this.field2672 += (long) (this.field2674[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2672 <<= 0x3;
            this.field2672 += (long) this.field2668[var6];
        }
        this.field2672 <<= 0x1;
        this.field2672 += (long) (this.field2670 ? 1 : 0);
        this.field2674[5] = var3;
        this.field2674[9] = var4;
        if (var1 != 0L && this.field2672 != var1) {
            field2676.method3115(var1);
        }
    }

    @ObfuscatedName("fe.y(Lac;ILac;IB)Lcu;")
    public class98 method2907(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2671 != -1) {
            return class35.method2793(this.field2671).method635(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2672;
        int[] var7 = this.field2674;
        if (arg0 != null && (arg0.field912 >= 0 || arg0.field913 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2674[var8];
            }
            if (arg0.field912 >= 0) {
                var5 += (long) (arg0.field912 - this.field2674[5] << 40);
                var7[5] = arg0.field912;
            }
            if (arg0.field913 >= 0) {
                var5 += (long) (arg0.field913 - this.field2674[3] << 48);
                var7[3] = arg0.field913;
            }
        }
        class98 var9 = (class98) field2676.method3114(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method1870(var12 - 256).method748()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method2057(var12 - 512).method843(this.field2670)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2669 != -1L) {
                    var9 = (class98) field2676.method3114(this.field2669);
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
                        class93 var17 = class40.method1870(var16 - 256).method750();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method2057(var16 - 512).method835(this.field2670);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2668[var20] < Statics.field2673[var20].length) {
                        var19.method1903(Statics.field1893[var20], Statics.field2673[var20][this.field2668[var20]]);
                    }
                    if (this.field2668[var20] < Statics.field538[var20].length) {
                        var19.method1903(Statics.field2118[var20], Statics.field538[var20][this.field2668[var20]]);
                    }
                }
                var9 = var19.method1910(64, 850, -30, -50, -30);
                field2676.method3116(var9, var5);
                this.field2669 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method701(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method698(var9, arg3);
        } else {
            var21 = arg0.method698(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fe.f(B)Lct;")
    public class93 method2911() {
        if (this.field2671 != -1) {
            return class35.method2793(this.field2671).method613();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2674[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method1870(var3 - 256).method751()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method2057(var3 - 512).method869(this.field2670)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2674[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method1870(var7 - 256).method777();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method2057(var7 - 512).method846(this.field2670);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2668[var11] < Statics.field2673[var11].length) {
                var10.method1903(Statics.field1893[var11], Statics.field2673[var11][this.field2668[var11]]);
            }
            if (this.field2668[var11] < Statics.field538[var11].length) {
                var10.method1903(Statics.field2118[var11], Statics.field538[var11][this.field2668[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fe.p(B)I")
    public int method2891() {
        return this.field2671 == -1 ? (this.field2674[11] << 5) + (this.field2674[8] << 10) + (this.field2674[0] << 15) + (this.field2668[0] << 25) + (this.field2668[4] << 20) + this.field2674[1] : 305419896 + class35.method2793(this.field2671).field796;
    }

    @ObfuscatedName("n.l(I)V")
    public static void method41() {
        field2676.method3117();
    }
}
