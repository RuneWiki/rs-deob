package deob;

@ObfuscatedName("hl")
public class class215 {

    @ObfuscatedName("hl.c")
    public int[] field2510;

    @ObfuscatedName("hl.x")
    public int[] field2508;

    @ObfuscatedName("hl.t")
    public boolean field2507;

    @ObfuscatedName("hl.g")
    public int field2515;

    @ObfuscatedName("hl.l")
    public long field2511;

    @ObfuscatedName("hl.u")
    public long field2513;

    @ObfuscatedName("hl.n")
    public static final int[] field2516 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hl.h")
    public static class146 field2517 = new class146(260);

    @ObfuscatedName("hl.c([I[IZII)V")
    public void method3700(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3246; var6++) {
                    class246 var7 = class246.method3388(var6);
                    if (var7 != null && !var7.field3249 && var7.field3244 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2516[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2510 = arg0;
        this.field2508 = arg1;
        this.field2507 = arg2;
        this.field2515 = arg3;
        this.method3685();
    }

    @ObfuscatedName("hl.x(IZB)V")
    public void method3682(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2507) {
            return;
        }
        int var3 = this.field2510[field2516[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class246 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3246) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3246 - 1;
                }
            }
            var4 = class246.method3388(var3);
        } while (var4 == null || var4.field3249 || arg0 + (this.field2507 ? 7 : 0) != var4.field3244);
        this.field2510[field2516[arg0]] = var3 + 256;
        this.method3685();
    }

    @ObfuscatedName("hl.t(IZS)V")
    public void method3681(int arg0, boolean arg1) {
        int var3 = this.field2508[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2509[arg0].length) {
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
                    var3 = Statics.field2509[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2508[arg0] = var3;
        this.method3685();
    }

    @ObfuscatedName("hl.g(ZB)V")
    public void method3683(boolean arg0) {
        if (this.field2507 != arg0) {
            this.method3700((int[]) null, this.field2508, arg0, -1);
        }
    }

    @ObfuscatedName("hl.l(Lkz;I)V")
    public void method3684(class300 arg0) {
        arg0.method5087(this.field2507 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2510[field2516[var2]];
            if (var3 == 0) {
                arg0.method5087(-1);
            } else {
                arg0.method5087(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5087(this.field2508[var4]);
        }
    }

    @ObfuscatedName("hl.u(I)V")
    public void method3685() {
        long var1 = this.field2511;
        int var3 = this.field2510[5];
        int var4 = this.field2510[9];
        this.field2510[5] = var4;
        this.field2510[9] = var3;
        this.field2511 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2511 <<= 0x4;
            if (this.field2510[var5] >= 256) {
                this.field2511 += (long) (this.field2510[var5] - 256);
            }
        }
        if (this.field2510[0] >= 256) {
            this.field2511 += (long) (this.field2510[0] - 256 >> 4);
        }
        if (this.field2510[1] >= 256) {
            this.field2511 += (long) (this.field2510[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2511 <<= 0x3;
            this.field2511 += (long) this.field2508[var6];
        }
        this.field2511 <<= 0x1;
        this.field2511 += (long) (this.field2507 ? 1 : 0);
        this.field2510[5] = var3;
        this.field2510[9] = var4;
        if (var1 != 0L && this.field2511 != var1) {
            field2517.method3066(var1);
        }
    }

    @ObfuscatedName("hl.j(Liw;ILiw;II)Ldr;")
    public class128 method3686(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field2515 != -1) {
            return class257.method4928(this.field2515).method4408(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2511;
        int[] var7 = this.field2510;
        if (arg0 != null && (arg0.field3498 >= 0 || arg0.field3499 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2510[var8];
            }
            if (arg0.field3498 >= 0) {
                var5 += (long) (arg0.field3498 - this.field2510[5] << 40);
                var7[5] = arg0.field3498;
            }
            if (arg0.field3499 >= 0) {
                var5 += (long) (arg0.field3499 - this.field2510[3] << 48);
                var7[3] = arg0.field3499;
            }
        }
        class128 var9 = (class128) field2517.method3061(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class246.method3388(var12 - 256).method4116()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class255.method1055(var12 - 512).method4327(this.field2507)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2513 != -1L) {
                    var9 = (class128) field2517.method3061(this.field2513);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class122[] var13 = new class122[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class122 var17 = class246.method3388(var16 - 256).method4131();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class122 var18 = class255.method1055(var16 - 512).method4328(this.field2507);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class122 var19 = new class122(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2508[var20] < Statics.field2509[var20].length) {
                        var19.method2537(Statics.field1945[var20], Statics.field2509[var20][this.field2508[var20]]);
                    }
                    if (this.field2508[var20] < Statics.field2512[var20].length) {
                        var19.method2537(Statics.field2514[var20], Statics.field2512[var20][this.field2508[var20]]);
                    }
                }
                var9 = var19.method2545(64, 850, -30, -50, -30);
                field2517.method3062(var9, var5);
                this.field2513 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class128 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4444(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4441(var9, arg3);
        } else {
            var21 = arg0.method4441(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hl.v(I)Lds;")
    public class122 method3707() {
        if (this.field2515 != -1) {
            return class257.method4928(this.field2515).method4390();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2510[var2];
            if (var3 >= 256 && var3 < 512 && !class246.method3388(var3 - 256).method4128()) {
                var1 = true;
            }
            if (var3 >= 512 && !class255.method1055(var3 - 512).method4336(this.field2507)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class122[] var4 = new class122[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2510[var6];
            if (var7 >= 256 && var7 < 512) {
                class122 var8 = class246.method3388(var7 - 256).method4115();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class122 var9 = class255.method1055(var7 - 512).method4330(this.field2507);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class122 var10 = new class122(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2508[var11] < Statics.field2509[var11].length) {
                var10.method2537(Statics.field1945[var11], Statics.field2509[var11][this.field2508[var11]]);
            }
            if (this.field2508[var11] < Statics.field2512[var11].length) {
                var10.method2537(Statics.field2514[var11], Statics.field2512[var11][this.field2508[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hl.d(I)I")
    public int method3708() {
        return this.field2515 == -1 ? (this.field2510[11] << 5) + (this.field2510[8] << 10) + (this.field2510[0] << 15) + (this.field2508[4] << 20) + (this.field2508[0] << 25) + this.field2510[1] : 305419896 + class257.method4928(this.field2515).field3439;
    }
}
