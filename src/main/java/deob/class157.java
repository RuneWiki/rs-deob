package deob;

@ObfuscatedName("fu")
public class class157 {

    @ObfuscatedName("fu.i")
    public int[] field2673;

    @ObfuscatedName("fu.c")
    public int[] field2672;

    @ObfuscatedName("fu.h")
    public boolean field2671;

    @ObfuscatedName("fu.v")
    public int field2674;

    @ObfuscatedName("fu.q")
    public long field2676;

    @ObfuscatedName("fu.s")
    public long field2675;

    @ObfuscatedName("fu.e")
    public static final int[] field2678 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fu.l")
    public static class171 field2679 = new class171(260);

    @ObfuscatedName("fu.i([I[IZII)V")
    public void method2947(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field946; var6++) {
                    class40 var7 = Statics.method650(var6);
                    if (var7 != null && !var7.field955 && var7.field952 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2678[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2673 = arg0;
        this.field2672 = arg1;
        this.field2671 = arg2;
        this.field2674 = arg3;
        this.method2964();
    }

    @ObfuscatedName("fu.c(IZI)V")
    public void method2972(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2671) {
            return;
        }
        int var3 = this.field2673[field2678[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field946) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field946 - 1;
                }
            }
            var4 = Statics.method650(var3);
        } while (var4 == null || var4.field955 || arg0 + (this.field2671 ? 7 : 0) != var4.field952);
        this.field2673[field2678[arg0]] = var3 + 256;
        this.method2964();
    }

    @ObfuscatedName("fu.h(IZI)V")
    public void method2960(int arg0, boolean arg1) {
        int var3 = this.field2672[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field1665[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field1665[arg0].length - 1;
            }
        }
        this.field2672[arg0] = var3;
        this.method2964();
    }

    @ObfuscatedName("fu.v(ZI)V")
    public void method2949(boolean arg0) {
        if (this.field2671 != arg0) {
            this.method2947((int[]) null, this.field2672, arg0, -1);
        }
    }

    @ObfuscatedName("fu.q(Ldm;B)V")
    public void method2970(class107 arg0) {
        arg0.method2137(this.field2671 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2673[field2678[var2]];
            if (var3 == 0) {
                arg0.method2137(-1);
            } else {
                arg0.method2137(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2137(this.field2672[var4]);
        }
    }

    @ObfuscatedName("fu.s(I)V")
    public void method2964() {
        long var1 = this.field2676;
        int var3 = this.field2673[5];
        int var4 = this.field2673[9];
        this.field2673[5] = var4;
        this.field2673[9] = var3;
        this.field2676 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2676 <<= 0x4;
            if (this.field2673[var5] >= 256) {
                this.field2676 += (long) (this.field2673[var5] - 256);
            }
        }
        if (this.field2673[0] >= 256) {
            this.field2676 += (long) (this.field2673[0] - 256 >> 4);
        }
        if (this.field2673[1] >= 256) {
            this.field2676 += (long) (this.field2673[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2676 <<= 0x3;
            this.field2676 += (long) this.field2672[var6];
        }
        this.field2676 <<= 0x1;
        this.field2676 += (long) (this.field2671 ? 1 : 0);
        this.field2673[5] = var3;
        this.field2673[9] = var4;
        if (var1 != 0L && this.field2676 != var1) {
            field2679.method3184(var1);
        }
    }

    @ObfuscatedName("fu.g(Lao;ILao;II)Lcc;")
    public class98 method2952(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2674 != -1) {
            return class35.method2723(this.field2674).method617(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2676;
        int[] var7 = this.field2673;
        if (arg0 != null && (arg0.field916 >= 0 || arg0.field910 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2673[var8];
            }
            if (arg0.field916 >= 0) {
                var5 += (long) (arg0.field916 - this.field2673[5] << 40);
                var7[5] = arg0.field916;
            }
            if (arg0.field910 >= 0) {
                var5 += (long) (arg0.field910 - this.field2673[3] << 48);
                var7[3] = arg0.field910;
            }
        }
        class98 var9 = (class98) field2679.method3185(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !Statics.method650(var12 - 256).method774()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method2547(var12 - 512).method857(this.field2671)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2675 != -1L) {
                    var9 = (class98) field2679.method3185(this.field2675);
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
                        class93 var17 = Statics.method650(var16 - 256).method775();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method2547(var16 - 512).method858(this.field2671);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2672[var20] < Statics.field1665[var20].length) {
                        var19.method1915(Statics.field1887[var20], Statics.field1665[var20][this.field2672[var20]]);
                    }
                    if (this.field2672[var20] < Statics.field2677[var20].length) {
                        var19.method1915(Statics.field1008[var20], Statics.field2677[var20][this.field2672[var20]]);
                    }
                }
                var9 = var19.method1902(64, 850, -30, -50, -30);
                field2679.method3186(var9, var5);
                this.field2675 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method721(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method718(var9, arg3);
        } else {
            var21 = arg0.method718(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fu.u(I)Lcx;")
    public class93 method2953() {
        if (this.field2674 != -1) {
            return class35.method2723(this.field2674).method618();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2673[var2];
            if (var3 >= 256 && var3 < 512 && !Statics.method650(var3 - 256).method776()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method2547(var3 - 512).method859(this.field2671)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2673[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = Statics.method650(var7 - 256).method771();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method2547(var7 - 512).method860(this.field2671);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2672[var11] < Statics.field1665[var11].length) {
                var10.method1915(Statics.field1887[var11], Statics.field1665[var11][this.field2672[var11]]);
            }
            if (this.field2672[var11] < Statics.field2677[var11].length) {
                var10.method1915(Statics.field1008[var11], Statics.field2677[var11][this.field2672[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fu.d(I)I")
    public int method2954() {
        return this.field2674 == -1 ? (this.field2673[11] << 5) + (this.field2673[8] << 10) + (this.field2673[0] << 15) + (this.field2672[4] << 20) + (this.field2672[0] << 25) + this.field2673[1] : 305419896 + class35.method2723(this.field2674).field806;
    }
}
