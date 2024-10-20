package deob;

@ObfuscatedName("hu")
public class class224 {

    @ObfuscatedName("hu.f")
    public int[] field2566;

    @ObfuscatedName("hu.b")
    public int[] field2561;

    @ObfuscatedName("hu.l")
    public boolean field2562;

    @ObfuscatedName("hu.m")
    public int field2563;

    @ObfuscatedName("hu.z")
    public long field2564;

    @ObfuscatedName("hu.q")
    public long field2565;

    @ObfuscatedName("hu.e")
    public static final int[] field2567 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hu.o")
    public static class155 field2568 = new class155(260);

    @ObfuscatedName("hu.f([I[IZIB)V")
    public void method3768(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3295; var6++) {
                    class257 var7 = class257.method256(var6);
                    if (var7 != null && !var7.field3304 && var7.field3293 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2567[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2566 = arg0;
        this.field2561 = arg1;
        this.field2562 = arg2;
        this.field2563 = arg3;
        this.method3772();
    }

    @ObfuscatedName("hu.b(IZI)V")
    public void method3769(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2562) {
            return;
        }
        int var3 = this.field2566[field2567[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class257 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3295) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3295 - 1;
                }
            }
            var4 = class257.method256(var3);
        } while (var4 == null || var4.field3304 || (this.field2562 ? 7 : 0) + arg0 != var4.field3293);
        this.field2566[field2567[arg0]] = var3 + 256;
        this.method3772();
    }

    @ObfuscatedName("hu.l(IZI)V")
    public void method3770(int arg0, boolean arg1) {
        int var3 = this.field2561[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field629[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field629[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2561[arg0] = var3;
        this.method3772();
    }

    @ObfuscatedName("hu.m(ZB)V")
    public void method3771(boolean arg0) {
        if (this.field2562 != arg0) {
            this.method3768((int[]) null, this.field2561, arg0, -1);
        }
    }

    @ObfuscatedName("hu.z(Lkb;I)V")
    public void method3787(class311 arg0) {
        arg0.method5203(this.field2562 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2566[field2567[var2]];
            if (var3 == 0) {
                arg0.method5203(-1);
            } else {
                arg0.method5203(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5203(this.field2561[var4]);
        }
    }

    @ObfuscatedName("hu.q(I)V")
    public void method3772() {
        long var1 = this.field2564;
        int var3 = this.field2566[5];
        int var4 = this.field2566[9];
        this.field2566[5] = var4;
        this.field2566[9] = var3;
        this.field2564 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2564 <<= 0x4;
            if (this.field2566[var5] >= 256) {
                this.field2564 += (long) (this.field2566[var5] - 256);
            }
        }
        if (this.field2566[0] >= 256) {
            this.field2564 += (long) (this.field2566[0] - 256 >> 4);
        }
        if (this.field2566[1] >= 256) {
            this.field2564 += (long) (this.field2566[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2564 <<= 0x3;
            this.field2564 += (long) this.field2561[var6];
        }
        this.field2564 <<= 0x1;
        this.field2564 += (long) (this.field2562 ? 1 : 0);
        this.field2566[5] = var3;
        this.field2566[9] = var4;
        if (var1 != 0L && this.field2564 != var1) {
            field2568.method3154(var1);
        }
    }

    @ObfuscatedName("hu.k(Ljg;ILjg;II)Leh;")
    public class137 method3781(class270 arg0, int arg1, class270 arg2, int arg3) {
        if (this.field2563 != -1) {
            return class268.method3332(this.field2563).method4486(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2564;
        int[] var7 = this.field2566;
        if (arg0 != null && (arg0.field3547 >= 0 || arg0.field3535 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2566[var8];
            }
            if (arg0.field3547 >= 0) {
                var5 += (long) (arg0.field3547 - this.field2566[5] << 40);
                var7[5] = arg0.field3547;
            }
            if (arg0.field3535 >= 0) {
                var5 += (long) (arg0.field3535 - this.field2566[3] << 48);
                var7[3] = arg0.field3535;
            }
        }
        class137 var9 = (class137) field2568.method3155(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class257.method256(var12 - 256).method4200()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class266.method335(var12 - 512).method4410(this.field2562)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2565 != -1L) {
                    var9 = (class137) field2568.method3155(this.field2565);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class131[] var13 = new class131[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class131 var17 = class257.method256(var16 - 256).method4219();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class131 var18 = class266.method335(var16 - 512).method4411(this.field2562);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class131 var19 = new class131(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2561[var20] < Statics.field629[var20].length) {
                        var19.method2660(Statics.field2560[var20], Statics.field629[var20][this.field2561[var20]]);
                    }
                    if (this.field2561[var20] < Statics.field2517[var20].length) {
                        var19.method2660(Statics.field3672[var20], Statics.field2517[var20][this.field2561[var20]]);
                    }
                }
                var9 = var19.method2668(64, 850, -30, -50, -30);
                field2568.method3157(var9, var5);
                this.field2565 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class137 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4532(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4523(var9, arg3);
        } else {
            var21 = arg0.method4523(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hu.c(B)Len;")
    public class131 method3774() {
        if (this.field2563 != -1) {
            return class268.method3332(this.field2563).method4474();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2566[var2];
            if (var3 >= 256 && var3 < 512 && !class257.method256(var3 - 256).method4211()) {
                var1 = true;
            }
            if (var3 >= 512 && !class266.method335(var3 - 512).method4400(this.field2562)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class131[] var4 = new class131[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2566[var6];
            if (var7 >= 256 && var7 < 512) {
                class131 var8 = class257.method256(var7 - 256).method4205();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class131 var9 = class266.method335(var7 - 512).method4413(this.field2562);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class131 var10 = new class131(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2561[var11] < Statics.field629[var11].length) {
                var10.method2660(Statics.field2560[var11], Statics.field629[var11][this.field2561[var11]]);
            }
            if (this.field2561[var11] < Statics.field2517[var11].length) {
                var10.method2660(Statics.field3672[var11], Statics.field2517[var11][this.field2561[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hu.u(I)I")
    public int method3775() {
        return this.field2563 == -1 ? (this.field2566[11] << 5) + (this.field2566[8] << 10) + (this.field2566[0] << 15) + (this.field2561[4] << 20) + (this.field2561[0] << 25) + this.field2566[1] : 305419896 + class268.method3332(this.field2563).field3489;
    }

    @ObfuscatedName("ay.t(I)V")
    public static void method344() {
        field2568.method3158();
    }
}
