package deob;

@ObfuscatedName("jm")
public class class265 extends class185 {

    @ObfuscatedName("jm.h")
    public static boolean field3400 = false;

    @ObfuscatedName("jm.w")
    public static class155 field3396 = new class155(4096);

    @ObfuscatedName("jm.t")
    public static class155 field3416 = new class155(500);

    @ObfuscatedName("jm.j")
    public static class155 field3410 = new class155(30);

    @ObfuscatedName("jm.n")
    public static class155 field3386 = new class155(30);

    @ObfuscatedName("jm.p")
    public static class131[] field3387 = new class131[4];

    @ObfuscatedName("jm.l")
    public int field3388;

    @ObfuscatedName("jm.z")
    public int[] field3421;

    @ObfuscatedName("jm.u")
    public int[] field3390;

    @ObfuscatedName("jm.e")
    public String field3395 = class234.field2792;

    @ObfuscatedName("jm.m")
    public short[] field3392;

    @ObfuscatedName("jm.c")
    public short[] field3404;

    @ObfuscatedName("jm.i")
    public short[] field3394;

    @ObfuscatedName("jm.f")
    public short[] field3393;

    @ObfuscatedName("jm.a")
    public int field3419 = 1;

    @ObfuscatedName("jm.b")
    public int field3397 = 1;

    @ObfuscatedName("jm.y")
    public int field3398 = 2;

    @ObfuscatedName("jm.r")
    public boolean field3399 = true;

    @ObfuscatedName("jm.q")
    public int field3424 = -1;

    @ObfuscatedName("jm.g")
    public int field3401 = -1;

    @ObfuscatedName("jm.s")
    public boolean field3402 = false;

    @ObfuscatedName("jm.o")
    public boolean field3403 = false;

    @ObfuscatedName("jm.k")
    public int field3412 = -1;

    @ObfuscatedName("jm.d")
    public int field3405 = 16;

    @ObfuscatedName("jm.an")
    public int field3406 = 0;

    @ObfuscatedName("jm.aj")
    public int field3407 = 0;

    @ObfuscatedName("jm.ax")
    public String[] field3408 = new String[5];

    @ObfuscatedName("jm.ag")
    public int field3415 = -1;

    @ObfuscatedName("jm.au")
    public int field3383 = -1;

    @ObfuscatedName("jm.as")
    public boolean field3411 = false;

    @ObfuscatedName("jm.ae")
    public boolean field3426 = true;

    @ObfuscatedName("jm.ac")
    public int field3413 = 128;

    @ObfuscatedName("jm.ak")
    public int field3414 = 128;

    @ObfuscatedName("jm.av")
    public int field3385 = 128;

    @ObfuscatedName("jm.aq")
    public int field3384 = 0;

    @ObfuscatedName("jm.ah")
    public int field3417 = 0;

    @ObfuscatedName("jm.am")
    public int field3380 = 0;

    @ObfuscatedName("jm.aa")
    public boolean field3381 = false;

    @ObfuscatedName("jm.ao")
    public boolean field3420 = false;

    @ObfuscatedName("jm.ab")
    public int field3418 = -1;

    @ObfuscatedName("jm.aw")
    public int[] field3422;

    @ObfuscatedName("jm.ap")
    public int field3428 = -1;

    @ObfuscatedName("jm.ad")
    public int field3432 = -1;

    @ObfuscatedName("jm.ai")
    public int field3425 = -1;

    @ObfuscatedName("jm.al")
    public int field3409 = 0;

    @ObfuscatedName("jm.ay")
    public int field3427 = 0;

    @ObfuscatedName("jm.af")
    public int field3389 = 0;

    @ObfuscatedName("jm.ar")
    public int[] field3429;

    @ObfuscatedName("jm.az")
    public boolean field3430 = true;

    @ObfuscatedName("jm.at")
    public class327 field3431;

    @ObfuscatedName("ak.h(II)Ljm;")
    public static class265 method325(int arg0) {
        class265 var1 = (class265) field3396.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3423.method3834(6, arg0);
        class265 var3 = new class265();
        var3.field3388 = arg0;
        if (var2 != null) {
            var3.method4275(new class311(var2));
        }
        var3.method4249();
        if (var3.field3420) {
            var3.field3398 = 0;
            var3.field3399 = false;
        }
        field3396.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.v(I)V")
    public void method4249() {
        if (this.field3424 == -1) {
            this.field3424 = 0;
            if (this.field3421 != null && (this.field3390 == null || this.field3390[0] == 10)) {
                this.field3424 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3408[var1] != null) {
                    this.field3424 = 1;
                }
            }
        }
        if (this.field3418 == -1) {
            this.field3418 = this.field3398 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jm.x(Lkj;B)V")
    public void method4275(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4246(arg0, var2);
        }
    }

    @ObfuscatedName("jm.w(Lkj;II)V")
    public void method4246(class311 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5274();
            if (var3 > 0) {
                if (this.field3421 == null || field3400) {
                    this.field3390 = new int[var3];
                    this.field3421 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3421[var4] = arg0.method5342();
                        this.field3390[var4] = arg0.method5274();
                    }
                } else {
                    arg0.field3752 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3395 = arg0.method5202();
        } else if (arg1 == 5) {
            int var5 = arg0.method5274();
            if (var5 > 0) {
                if (this.field3421 == null || field3400) {
                    this.field3390 = null;
                    this.field3421 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3421[var6] = arg0.method5342();
                    }
                } else {
                    arg0.field3752 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3419 = arg0.method5274();
        } else if (arg1 == 15) {
            this.field3397 = arg0.method5274();
        } else if (arg1 == 17) {
            this.field3398 = 0;
            this.field3399 = false;
        } else if (arg1 == 18) {
            this.field3399 = false;
        } else if (arg1 == 19) {
            this.field3424 = arg0.method5274();
        } else if (arg1 == 21) {
            this.field3401 = 0;
        } else if (arg1 == 22) {
            this.field3402 = true;
        } else if (arg1 == 23) {
            this.field3403 = true;
        } else if (arg1 == 24) {
            this.field3412 = arg0.method5342();
            if (this.field3412 == 65535) {
                this.field3412 = -1;
            }
        } else if (arg1 == 27) {
            this.field3398 = 1;
        } else if (arg1 == 28) {
            this.field3405 = arg0.method5274();
        } else if (arg1 == 29) {
            this.field3406 = arg0.method5148();
        } else if (arg1 == 39) {
            this.field3407 = arg0.method5148() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3408[arg1 - 30] = arg0.method5202();
            if (this.field3408[arg1 - 30].equalsIgnoreCase(class234.field2787)) {
                this.field3408[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5274();
            this.field3392 = new short[var7];
            this.field3404 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3392[var8] = (short) arg0.method5342();
                this.field3404[var8] = (short) arg0.method5342();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5274();
            this.field3394 = new short[var9];
            this.field3393 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3394[var10] = (short) arg0.method5342();
                this.field3393[var10] = (short) arg0.method5342();
            }
        } else if (arg1 == 62) {
            this.field3411 = true;
        } else if (arg1 == 64) {
            this.field3426 = false;
        } else if (arg1 == 65) {
            this.field3413 = arg0.method5342();
        } else if (arg1 == 66) {
            this.field3414 = arg0.method5342();
        } else if (arg1 == 67) {
            this.field3385 = arg0.method5342();
        } else if (arg1 == 68) {
            this.field3383 = arg0.method5342();
        } else if (arg1 == 69) {
            arg0.method5274();
        } else if (arg1 == 70) {
            this.field3384 = arg0.method5118();
        } else if (arg1 == 71) {
            this.field3417 = arg0.method5118();
        } else if (arg1 == 72) {
            this.field3380 = arg0.method5118();
        } else if (arg1 == 73) {
            this.field3381 = true;
        } else if (arg1 == 74) {
            this.field3420 = true;
        } else if (arg1 == 75) {
            this.field3418 = arg0.method5274();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3428 = arg0.method5342();
            if (this.field3428 == 65535) {
                this.field3428 = -1;
            }
            this.field3432 = arg0.method5342();
            if (this.field3432 == 65535) {
                this.field3432 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5342();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5274();
            this.field3422 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3422[var15] = arg0.method5342();
                if (this.field3422[var15] == 65535) {
                    this.field3422[var15] = -1;
                }
            }
            this.field3422[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3425 = arg0.method5342();
            this.field3409 = arg0.method5274();
        } else if (arg1 == 79) {
            this.field3427 = arg0.method5342();
            this.field3389 = arg0.method5342();
            this.field3409 = arg0.method5274();
            int var11 = arg0.method5274();
            this.field3429 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3429[var12] = arg0.method5342();
            }
        } else if (arg1 == 81) {
            this.field3401 = arg0.method5274() * 256;
        } else if (arg1 == 82) {
            this.field3415 = arg0.method5342();
        } else if (arg1 == 89) {
            this.field3430 = false;
        } else if (arg1 == 249) {
            this.field3431 = class259.method3311(arg0, this.field3431);
        }
    }

    @ObfuscatedName("jm.t(II)Z")
    public final boolean method4245(int arg0) {
        if (this.field3390 != null) {
            for (int var4 = 0; var4 < this.field3390.length; var4++) {
                if (this.field3390[var4] == arg0) {
                    return Statics.field3382.method3836(this.field3421[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3421 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3421.length; var3++) {
                var2 &= Statics.field3382.method3836(this.field3421[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jm.j(I)Z")
    public final boolean method4280() {
        if (this.field3421 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3421.length; var2++) {
            var1 &= Statics.field3382.method3836(this.field3421[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jm.n(II[[IIIIS)Ler;")
    public final class145 method4287(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3390 == null) {
            var7 = (long) ((this.field3388 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3388 << 10) + (arg0 << 3) + arg1);
        }
        class145 var9 = (class145) field3410.method3147(var7);
        if (var9 == null) {
            class131 var10 = this.method4248(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3402) {
                var10.field1567 = (short) (this.field3406 + 64);
                var10.field1592 = (short) (this.field3407 + 768);
                var10.method2639();
                var9 = var10;
            } else {
                var9 = var10.method2674(this.field3406 + 64, this.field3407 + 768, -50, -10, -50);
            }
            field3410.method3145(var9, var7);
        }
        if (this.field3402) {
            var9 = ((class131) var9).method2627();
        }
        if (this.field3401 >= 0) {
            if (var9 instanceof class137) {
                var9 = ((class137) var9).method2775(arg2, arg3, arg4, arg5, true, this.field3401);
            } else if (var9 instanceof class131) {
                var9 = ((class131) var9).method2628(arg2, arg3, arg4, arg5, true, this.field3401);
            }
        }
        return var9;
    }

    @ObfuscatedName("jm.p(II[[IIIII)Leh;")
    public final class137 method4250(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3390 == null) {
            var7 = (long) ((this.field3388 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3388 << 10) + (arg0 << 3) + arg1);
        }
        class137 var9 = (class137) field3386.method3147(var7);
        if (var9 == null) {
            class131 var10 = this.method4248(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2674(this.field3406 + 64, this.field3407 + 768, -50, -10, -50);
            field3386.method3145(var9, var7);
        }
        if (this.field3401 >= 0) {
            var9 = var9.method2775(arg2, arg3, arg4, arg5, true, this.field3401);
        }
        return var9;
    }

    @ObfuscatedName("jm.l(II[[IIIILjy;II)Leh;")
    public final class137 method4251(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class270 arg6, int arg7) {
        long var9;
        if (this.field3390 == null) {
            var9 = (long) ((this.field3388 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3388 << 10) + (arg0 << 3) + arg1);
        }
        class137 var11 = (class137) field3386.method3147(var9);
        if (var11 == null) {
            class131 var12 = this.method4248(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2674(this.field3406 + 64, this.field3407 + 768, -50, -10, -50);
            field3386.method3145(var11, var9);
        }
        if (arg6 == null && this.field3401 == -1) {
            return var11;
        }
        class137 var13;
        if (arg6 == null) {
            var13 = var11.method2719(true);
        } else {
            var13 = arg6.method4420(var11, arg7, arg1);
        }
        if (this.field3401 >= 0) {
            var13 = var13.method2775(arg2, arg3, arg4, arg5, false, this.field3401);
        }
        return var13;
    }

    @ObfuscatedName("jm.z(III)Les;")
    public final class131 method4248(int arg0, int arg1) {
        class131 var3 = null;
        if (this.field3390 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3421 == null) {
                return null;
            }
            boolean var4 = this.field3411;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3421.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3421[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class131) field3416.method3147((long) var7);
                if (var3 == null) {
                    var3 = class131.method2622(Statics.field3382, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2637();
                    }
                    field3416.method3145(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3387[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class131(field3387, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3390.length; var9++) {
                if (this.field3390[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3421[var8];
            boolean var11 = this.field3411 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class131) field3416.method3147((long) var10);
            if (var3 == null) {
                var3 = class131.method2622(Statics.field3382, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2637();
                }
                field3416.method3145(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3413 == 128 && this.field3414 == 128 && this.field3385 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3384 == 0 && this.field3417 == 0 && this.field3380 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class131 var14 = new class131(var3, arg1 == 0 && !var12 && !var13, this.field3392 == null, this.field3394 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2641(256);
            var14.method2634(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2630();
        } else if (var15 == 2) {
            var14.method2666();
        } else if (var15 == 3) {
            var14.method2633();
        }
        if (this.field3392 != null) {
            for (int var16 = 0; var16 < this.field3392.length; var16++) {
                var14.method2635(this.field3392[var16], this.field3404[var16]);
            }
        }
        if (this.field3394 != null) {
            for (int var17 = 0; var17 < this.field3394.length; var17++) {
                var14.method2631(this.field3394[var17], this.field3393[var17]);
            }
        }
        if (var12) {
            var14.method2638(this.field3413, this.field3414, this.field3385);
        }
        if (var13) {
            var14.method2634(this.field3384, this.field3417, this.field3380);
        }
        return var14;
    }

    @ObfuscatedName("jm.u(I)Ljm;")
    public final class265 method4263() {
        int var1 = -1;
        if (this.field3428 != -1) {
            var1 = class222.method3680(this.field3428);
        } else if (this.field3432 != -1) {
            var1 = class222.field2542[this.field3432];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3422.length - 1) {
            var2 = this.field3422[var1];
        } else {
            var2 = this.field3422[this.field3422.length - 1];
        }
        return var2 == -1 ? null : method325(var2);
    }

    @ObfuscatedName("jm.e(IIB)I")
    public int method4253(int arg0, int arg1) {
        class327 var3 = this.field3431;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5494((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2136;
            }
        }
        return var4;
    }

    @ObfuscatedName("jm.m(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4254(int arg0, String arg1) {
        class327 var3 = this.field3431;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class186 var5 = (class186) var3.method5494((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2132;
            }
        }
        return var4;
    }

    @ObfuscatedName("jm.c(I)Z")
    public boolean method4255() {
        if (this.field3422 == null) {
            return this.field3425 != -1 || this.field3429 != null;
        }
        for (int var1 = 0; var1 < this.field3422.length; var1++) {
            if (this.field3422[var1] != -1) {
                class265 var2 = method325(this.field3422[var1]);
                if (var2.field3425 != -1 || var2.field3429 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
