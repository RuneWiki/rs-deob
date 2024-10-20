package deob;

@ObfuscatedName("fd")
public class class157 {

    @ObfuscatedName("fd.t")
    public int[] field2670;

    @ObfuscatedName("fd.s")
    public int[] field2673;

    @ObfuscatedName("fd.f")
    public boolean field2671;

    @ObfuscatedName("fd.e")
    public int field2672;

    @ObfuscatedName("fd.d")
    public long field2669;

    @ObfuscatedName("fd.n")
    public long field2674;

    @ObfuscatedName("fd.g")
    public static final int[] field2675 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fd.a")
    public static class171 field2676 = new class171(260);

    @ObfuscatedName("fd.t([I[IZIB)V")
    public void method2927(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field930; var6++) {
                    class40 var7 = class40.method810(var6);
                    if (var7 != null && !var7.field939 && var7.field932 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2675[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2670 = arg0;
        this.field2673 = arg1;
        this.field2671 = arg2;
        this.field2672 = arg3;
        this.method2932();
    }

    @ObfuscatedName("fd.s(IZI)V")
    public void method2928(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2671) {
            return;
        }
        int var3 = this.field2670[field2675[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field930) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field930 - 1;
                }
            }
            var4 = class40.method810(var3);
        } while (var4 == null || var4.field939 || var4.field932 != (this.field2671 ? 7 : 0) + arg0);
        this.field2670[field2675[arg0]] = var3 + 256;
        this.method2932();
    }

    @ObfuscatedName("fd.f(IZI)V")
    public void method2929(int arg0, boolean arg1) {
        int var3 = this.field2673[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2477[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2477[arg0].length - 1;
            }
        }
        this.field2673[arg0] = var3;
        this.method2932();
    }

    @ObfuscatedName("fd.e(ZI)V")
    public void method2930(boolean arg0) {
        if (this.field2671 != arg0) {
            this.method2927((int[]) null, this.field2673, arg0, -1);
        }
    }

    @ObfuscatedName("fd.d(Ldb;B)V")
    public void method2931(class107 arg0) {
        arg0.method2214(this.field2671 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2670[field2675[var2]];
            if (var3 == 0) {
                arg0.method2214(-1);
            } else {
                arg0.method2214(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2214(this.field2673[var4]);
        }
    }

    @ObfuscatedName("fd.n(I)V")
    public void method2932() {
        long var1 = this.field2669;
        int var3 = this.field2670[5];
        int var4 = this.field2670[9];
        this.field2670[5] = var4;
        this.field2670[9] = var3;
        this.field2669 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2669 <<= 0x4;
            if (this.field2670[var5] >= 256) {
                this.field2669 += (long) (this.field2670[var5] - 256);
            }
        }
        if (this.field2670[0] >= 256) {
            this.field2669 += (long) (this.field2670[0] - 256 >> 4);
        }
        if (this.field2670[1] >= 256) {
            this.field2669 += (long) (this.field2670[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2669 <<= 0x3;
            this.field2669 += (long) this.field2673[var6];
        }
        this.field2669 <<= 0x1;
        this.field2669 += (long) (this.field2671 ? 1 : 0);
        this.field2670[5] = var3;
        this.field2670[9] = var4;
        if (var1 != 0L && this.field2669 != var1) {
            field2676.method3169(var1);
        }
    }

    @ObfuscatedName("fd.v(Laz;ILaz;IB)Lcc;")
    public class98 method2933(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2672 != -1) {
            return class35.method121(this.field2672).method596(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2669;
        int[] var7 = this.field2670;
        if (arg0 != null && (arg0.field902 >= 0 || arg0.field903 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2670[var8];
            }
            if (arg0.field902 >= 0) {
                var5 += (long) (arg0.field902 - this.field2670[5] << 40);
                var7[5] = arg0.field902;
            }
            if (arg0.field903 >= 0) {
                var5 += (long) (arg0.field903 - this.field2670[3] << 48);
                var7[3] = arg0.field903;
            }
        }
        class98 var9 = (class98) field2676.method3170(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method810(var12 - 256).method764()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method504(var12 - 512).method835(this.field2671)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2674 != -1L) {
                    var9 = (class98) field2676.method3170(this.field2674);
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
                        class93 var17 = class40.method810(var16 - 256).method766();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method504(var16 - 512).method851(this.field2671);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2673[var20] < Statics.field2477[var20].length) {
                        var19.method1864(Statics.field779[var20], Statics.field2477[var20][this.field2673[var20]]);
                    }
                    if (this.field2673[var20] < Statics.field79[var20].length) {
                        var19.method1864(Statics.field24[var20], Statics.field79[var20][this.field2673[var20]]);
                    }
                }
                var9 = var19.method1871(64, 850, -30, -50, -30);
                field2676.method3168(var9, var5);
                this.field2674 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method695(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method703(var9, arg3);
        } else {
            var21 = arg0.method703(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fd.z(B)Lca;")
    public class93 method2926() {
        if (this.field2672 != -1) {
            return class35.method121(this.field2672).method598();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2670[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method810(var3 - 256).method747()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method504(var3 - 512).method865(this.field2671)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2670[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method810(var7 - 256).method748();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method504(var7 - 512).method838(this.field2671);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2673[var11] < Statics.field2477[var11].length) {
                var10.method1864(Statics.field779[var11], Statics.field2477[var11][this.field2673[var11]]);
            }
            if (this.field2673[var11] < Statics.field79[var11].length) {
                var10.method1864(Statics.field24[var11], Statics.field79[var11][this.field2673[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fd.j(I)I")
    public int method2934() {
        return this.field2672 == -1 ? (this.field2670[11] << 5) + (this.field2670[8] << 10) + (this.field2670[0] << 15) + (this.field2673[4] << 20) + (this.field2673[0] << 25) + this.field2670[1] : 305419896 + class35.method121(this.field2672).field785;
    }
}
