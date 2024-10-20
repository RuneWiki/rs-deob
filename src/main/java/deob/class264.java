package deob;

@ObfuscatedName("jg")
public class class264 extends class185 {

    @ObfuscatedName("jg.z")
    public static boolean field3401 = false;

    @ObfuscatedName("jg.t")
    public static class155 field3407 = new class155(4096);

    @ObfuscatedName("jg.i")
    public static class155 field3376 = new class155(500);

    @ObfuscatedName("jg.o")
    public static class155 field3384 = new class155(30);

    @ObfuscatedName("jg.x")
    public static class155 field3377 = new class155(30);

    @ObfuscatedName("jg.w")
    public static class131[] field3378 = new class131[4];

    @ObfuscatedName("jg.g")
    public int field3415;

    @ObfuscatedName("jg.m")
    public int[] field3380;

    @ObfuscatedName("jg.n")
    public int[] field3381;

    @ObfuscatedName("jg.d")
    public String field3382 = class234.field2806;

    @ObfuscatedName("jg.h")
    public short[] field3383;

    @ObfuscatedName("jg.a")
    public short[] field3374;

    @ObfuscatedName("jg.q")
    public short[] field3385;

    @ObfuscatedName("jg.c")
    public short[] field3386;

    @ObfuscatedName("jg.f")
    public int field3387 = 1;

    @ObfuscatedName("jg.y")
    public int field3388 = 1;

    @ObfuscatedName("jg.v")
    public int field3389 = 2;

    @ObfuscatedName("jg.j")
    public boolean field3390 = true;

    @ObfuscatedName("jg.r")
    public int field3391 = -1;

    @ObfuscatedName("jg.u")
    public int field3392 = -1;

    @ObfuscatedName("jg.p")
    public boolean field3393 = false;

    @ObfuscatedName("jg.b")
    public boolean field3417 = false;

    @ObfuscatedName("jg.l")
    public int field3395 = -1;

    @ObfuscatedName("jg.e")
    public int field3373 = 16;

    @ObfuscatedName("jg.ab")
    public int field3397 = 0;

    @ObfuscatedName("jg.ag")
    public int field3398 = 0;

    @ObfuscatedName("jg.ao")
    public String[] field3399 = new String[5];

    @ObfuscatedName("jg.ae")
    public int field3400 = -1;

    @ObfuscatedName("jg.an")
    public int field3409 = -1;

    @ObfuscatedName("jg.am")
    public boolean field3402 = false;

    @ObfuscatedName("jg.ap")
    public boolean field3403 = true;

    @ObfuscatedName("jg.au")
    public int field3375 = 128;

    @ObfuscatedName("jg.aa")
    public int field3405 = 128;

    @ObfuscatedName("jg.ar")
    public int field3414 = 128;

    @ObfuscatedName("jg.at")
    public int field3422 = 0;

    @ObfuscatedName("jg.aq")
    public int field3408 = 0;

    @ObfuscatedName("jg.al")
    public int field3410 = 0;

    @ObfuscatedName("jg.ah")
    public boolean field3396 = false;

    @ObfuscatedName("jg.av")
    public boolean field3411 = false;

    @ObfuscatedName("jg.ax")
    public int field3412 = -1;

    @ObfuscatedName("jg.as")
    public int[] field3413;

    @ObfuscatedName("jg.az")
    public int field3404 = -1;

    @ObfuscatedName("jg.ad")
    public int field3394 = -1;

    @ObfuscatedName("jg.ai")
    public int field3416 = -1;

    @ObfuscatedName("jg.ay")
    public int field3418 = 0;

    @ObfuscatedName("jg.aj")
    public int field3379 = 0;

    @ObfuscatedName("jg.aw")
    public int field3419 = 0;

    @ObfuscatedName("jg.af")
    public int[] field3420;

    @ObfuscatedName("jg.ak")
    public class326 field3421;

    @ObfuscatedName("ge.z(II)Ljg;")
    public static class264 method3595(int arg0) {
        class264 var1 = (class264) field3407.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3406.method3873(6, arg0);
        class264 var3 = new class264();
        var3.field3415 = arg0;
        if (var2 != null) {
            var3.method4317(new class310(var2));
        }
        var3.method4316();
        if (var3.field3411) {
            var3.field3389 = 0;
            var3.field3390 = false;
        }
        field3407.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.k(I)V")
    public void method4316() {
        if (this.field3391 == -1) {
            this.field3391 = 0;
            if (this.field3380 != null && (this.field3381 == null || this.field3381[0] == 10)) {
                this.field3391 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3399[var1] != null) {
                    this.field3391 = 1;
                }
            }
        }
        if (this.field3412 == -1) {
            this.field3412 = this.field3389 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jg.s(Lkf;B)V")
    public void method4317(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4323(arg0, var2);
        }
    }

    @ObfuscatedName("jg.t(Lkf;II)V")
    public void method4323(class310 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5193();
            if (var3 > 0) {
                if (this.field3380 == null || field3401) {
                    this.field3381 = new int[var3];
                    this.field3380 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3380[var4] = arg0.method5195();
                        this.field3381[var4] = arg0.method5193();
                    }
                } else {
                    arg0.field3734 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3382 = arg0.method5202();
        } else if (arg1 == 5) {
            int var5 = arg0.method5193();
            if (var5 > 0) {
                if (this.field3380 == null || field3401) {
                    this.field3381 = null;
                    this.field3380 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3380[var6] = arg0.method5195();
                    }
                } else {
                    arg0.field3734 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3387 = arg0.method5193();
        } else if (arg1 == 15) {
            this.field3388 = arg0.method5193();
        } else if (arg1 == 17) {
            this.field3389 = 0;
            this.field3390 = false;
        } else if (arg1 == 18) {
            this.field3390 = false;
        } else if (arg1 == 19) {
            this.field3391 = arg0.method5193();
        } else if (arg1 == 21) {
            this.field3392 = 0;
        } else if (arg1 == 22) {
            this.field3393 = true;
        } else if (arg1 == 23) {
            this.field3417 = true;
        } else if (arg1 == 24) {
            this.field3395 = arg0.method5195();
            if (this.field3395 == 65535) {
                this.field3395 = -1;
            }
        } else if (arg1 == 27) {
            this.field3389 = 1;
        } else if (arg1 == 28) {
            this.field3373 = arg0.method5193();
        } else if (arg1 == 29) {
            this.field3397 = arg0.method5194();
        } else if (arg1 == 39) {
            this.field3398 = arg0.method5194() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3399[arg1 - 30] = arg0.method5202();
            if (this.field3399[arg1 - 30].equalsIgnoreCase(class234.field2966)) {
                this.field3399[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5193();
            this.field3383 = new short[var7];
            this.field3374 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3383[var8] = (short) arg0.method5195();
                this.field3374[var8] = (short) arg0.method5195();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5193();
            this.field3385 = new short[var9];
            this.field3386 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3385[var10] = (short) arg0.method5195();
                this.field3386[var10] = (short) arg0.method5195();
            }
        } else if (arg1 == 62) {
            this.field3402 = true;
        } else if (arg1 == 64) {
            this.field3403 = false;
        } else if (arg1 == 65) {
            this.field3375 = arg0.method5195();
        } else if (arg1 == 66) {
            this.field3405 = arg0.method5195();
        } else if (arg1 == 67) {
            this.field3414 = arg0.method5195();
        } else if (arg1 == 68) {
            this.field3409 = arg0.method5195();
        } else if (arg1 == 69) {
            arg0.method5193();
        } else if (arg1 == 70) {
            this.field3422 = arg0.method5196();
        } else if (arg1 == 71) {
            this.field3408 = arg0.method5196();
        } else if (arg1 == 72) {
            this.field3410 = arg0.method5196();
        } else if (arg1 == 73) {
            this.field3396 = true;
        } else if (arg1 == 74) {
            this.field3411 = true;
        } else if (arg1 == 75) {
            this.field3412 = arg0.method5193();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3404 = arg0.method5195();
            if (this.field3404 == 65535) {
                this.field3404 = -1;
            }
            this.field3394 = arg0.method5195();
            if (this.field3394 == 65535) {
                this.field3394 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5195();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5193();
            this.field3413 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3413[var15] = arg0.method5195();
                if (this.field3413[var15] == 65535) {
                    this.field3413[var15] = -1;
                }
            }
            this.field3413[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3416 = arg0.method5195();
            this.field3418 = arg0.method5193();
        } else if (arg1 == 79) {
            this.field3379 = arg0.method5195();
            this.field3419 = arg0.method5195();
            this.field3418 = arg0.method5193();
            int var11 = arg0.method5193();
            this.field3420 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3420[var12] = arg0.method5195();
            }
        } else if (arg1 == 81) {
            this.field3392 = arg0.method5193() * 256;
        } else if (arg1 == 82) {
            this.field3400 = arg0.method5195();
        } else if (arg1 == 249) {
            this.field3421 = class258.method2185(arg0, this.field3421);
        }
    }

    @ObfuscatedName("jg.i(II)Z")
    public final boolean method4319(int arg0) {
        if (this.field3381 != null) {
            for (int var4 = 0; var4 < this.field3381.length; var4++) {
                if (this.field3381[var4] == arg0) {
                    return Statics.field2530.method3883(this.field3380[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3380 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3380.length; var3++) {
                var2 &= Statics.field2530.method3883(this.field3380[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jg.o(I)Z")
    public final boolean method4320() {
        if (this.field3380 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3380.length; var2++) {
            var1 &= Statics.field2530.method3883(this.field3380[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jg.x(II[[IIIIB)Lez;")
    public final class145 method4344(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3381 == null) {
            var7 = (long) ((this.field3415 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3415 << 10) + (arg0 << 3) + arg1);
        }
        class145 var9 = (class145) field3384.method3170(var7);
        if (var9 == null) {
            class131 var10 = this.method4324(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3393) {
                var10.field1579 = (short) (this.field3397 + 64);
                var10.field1577 = (short) (this.field3398 + 768);
                var10.method2649();
                var9 = var10;
            } else {
                var9 = var10.method2656(this.field3397 + 64, this.field3398 + 768, -50, -10, -50);
            }
            field3384.method3169(var9, var7);
        }
        if (this.field3393) {
            var9 = ((class131) var9).method2703();
        }
        if (this.field3392 >= 0) {
            if (var9 instanceof class137) {
                var9 = ((class137) var9).method2742(arg2, arg3, arg4, arg5, true, this.field3392);
            } else if (var9 instanceof class131) {
                var9 = ((class131) var9).method2641(arg2, arg3, arg4, arg5, true, this.field3392);
            }
        }
        return var9;
    }

    @ObfuscatedName("jg.w(II[[IIIIB)Ler;")
    public final class137 method4327(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3381 == null) {
            var7 = (long) ((this.field3415 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3415 << 10) + (arg0 << 3) + arg1);
        }
        class137 var9 = (class137) field3377.method3170(var7);
        if (var9 == null) {
            class131 var10 = this.method4324(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2656(this.field3397 + 64, this.field3398 + 768, -50, -10, -50);
            field3377.method3169(var9, var7);
        }
        if (this.field3392 >= 0) {
            var9 = var9.method2742(arg2, arg3, arg4, arg5, true, this.field3392);
        }
        return var9;
    }

    @ObfuscatedName("jg.g(II[[IIIILjm;II)Ler;")
    public final class137 method4354(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class269 arg6, int arg7) {
        long var9;
        if (this.field3381 == null) {
            var9 = (long) ((this.field3415 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3415 << 10) + (arg0 << 3) + arg1);
        }
        class137 var11 = (class137) field3377.method3170(var9);
        if (var11 == null) {
            class131 var12 = this.method4324(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2656(this.field3397 + 64, this.field3398 + 768, -50, -10, -50);
            field3377.method3169(var11, var9);
        }
        if (arg6 == null && this.field3392 == -1) {
            return var11;
        }
        class137 var13;
        if (arg6 == null) {
            var13 = var11.method2745(true);
        } else {
            var13 = arg6.method4520(var11, arg7, arg1);
        }
        if (this.field3392 >= 0) {
            var13 = var13.method2742(arg2, arg3, arg4, arg5, false, this.field3392);
        }
        return var13;
    }

    @ObfuscatedName("jg.m(III)Lee;")
    public final class131 method4324(int arg0, int arg1) {
        class131 var3 = null;
        if (this.field3381 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3380 == null) {
                return null;
            }
            boolean var4 = this.field3402;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3380.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3380[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class131) field3376.method3170((long) var7);
                if (var3 == null) {
                    var3 = class131.method2636(Statics.field2530, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2650();
                    }
                    field3376.method3169(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3378[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class131(field3378, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3381.length; var9++) {
                if (this.field3381[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3380[var8];
            boolean var11 = this.field3402 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class131) field3376.method3170((long) var10);
            if (var3 == null) {
                var3 = class131.method2636(Statics.field2530, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2650();
                }
                field3376.method3169(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3375 == 128 && this.field3405 == 128 && this.field3414 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3422 == 0 && this.field3408 == 0 && this.field3410 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class131 var14 = new class131(var3, arg1 == 0 && !var12 && !var13, this.field3383 == null, this.field3385 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2646(256);
            var14.method2701(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2643();
        } else if (var15 == 2) {
            var14.method2644();
        } else if (var15 == 3) {
            var14.method2639();
        }
        if (this.field3383 != null) {
            for (int var16 = 0; var16 < this.field3383.length; var16++) {
                var14.method2691(this.field3383[var16], this.field3374[var16]);
            }
        }
        if (this.field3385 != null) {
            for (int var17 = 0; var17 < this.field3385.length; var17++) {
                var14.method2652(this.field3385[var17], this.field3386[var17]);
            }
        }
        if (var12) {
            var14.method2651(this.field3375, this.field3405, this.field3414);
        }
        if (var13) {
            var14.method2701(this.field3422, this.field3408, this.field3410);
        }
        return var14;
    }

    @ObfuscatedName("jg.n(I)Ljg;")
    public final class264 method4325() {
        int var1 = -1;
        if (this.field3404 != -1) {
            var1 = class222.method552(this.field3404);
        } else if (this.field3394 != -1) {
            var1 = class222.field2558[this.field3394];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3413.length - 1) {
            var2 = this.field3413[var1];
        } else {
            var2 = this.field3413[this.field3413.length - 1];
        }
        return var2 == -1 ? null : method3595(var2);
    }

    @ObfuscatedName("jg.d(IIB)I")
    public int method4326(int arg0, int arg1) {
        return class258.method4902(this.field3421, arg0, arg1);
    }

    @ObfuscatedName("jg.h(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4335(int arg0, String arg1) {
        class326 var3 = this.field3421;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class186 var5 = (class186) var3.method5582((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2150;
            }
        }
        return var4;
    }

    @ObfuscatedName("cg.a(I)V")
    public static void method1641() {
        field3407.method3172();
        field3376.method3172();
        field3384.method3172();
        field3377.method3172();
    }

    @ObfuscatedName("jg.q(B)Z")
    public boolean method4328() {
        if (this.field3413 == null) {
            return this.field3416 != -1 || this.field3420 != null;
        }
        for (int var1 = 0; var1 < this.field3413.length; var1++) {
            if (this.field3413[var1] != -1) {
                class264 var2 = method3595(this.field3413[var1]);
                if (var2.field3416 != -1 || var2.field3420 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
