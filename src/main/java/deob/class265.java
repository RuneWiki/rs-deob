package deob;

@ObfuscatedName("jg")
public class class265 extends class185 {

    @ObfuscatedName("jg.n")
    public static boolean field3402 = false;

    @ObfuscatedName("jg.c")
    public static class155 field3383 = new class155(4096);

    @ObfuscatedName("jg.y")
    public static class155 field3424 = new class155(500);

    @ObfuscatedName("jg.h")
    public static class155 field3413 = new class155(30);

    @ObfuscatedName("jg.z")
    public static class155 field3386 = new class155(30);

    @ObfuscatedName("jg.e")
    public static class131[] field3411 = new class131[4];

    @ObfuscatedName("jg.q")
    public int field3407;

    @ObfuscatedName("jg.l")
    public int[] field3389;

    @ObfuscatedName("jg.s")
    public int[] field3390;

    @ObfuscatedName("jg.b")
    public String field3391 = class234.field2795;

    @ObfuscatedName("jg.a")
    public short[] field3387;

    @ObfuscatedName("jg.w")
    public short[] field3393;

    @ObfuscatedName("jg.k")
    public short[] field3394;

    @ObfuscatedName("jg.i")
    public short[] field3401;

    @ObfuscatedName("jg.x")
    public int field3396 = 1;

    @ObfuscatedName("jg.f")
    public int field3397 = 1;

    @ObfuscatedName("jg.g")
    public int field3398 = 2;

    @ObfuscatedName("jg.u")
    public boolean field3399 = true;

    @ObfuscatedName("jg.t")
    public int field3400 = -1;

    @ObfuscatedName("jg.p")
    public int field3381 = -1;

    @ObfuscatedName("jg.m")
    public boolean field3421 = false;

    @ObfuscatedName("jg.r")
    public boolean field3385 = false;

    @ObfuscatedName("jg.o")
    public int field3403 = -1;

    @ObfuscatedName("jg.j")
    public int field3405 = 16;

    @ObfuscatedName("jg.ay")
    public int field3406 = 0;

    @ObfuscatedName("jg.am")
    public int field3404 = 0;

    @ObfuscatedName("jg.ag")
    public String[] field3408 = new String[5];

    @ObfuscatedName("jg.ae")
    public int field3384 = -1;

    @ObfuscatedName("jg.ac")
    public int field3410 = -1;

    @ObfuscatedName("jg.aq")
    public boolean field3423 = false;

    @ObfuscatedName("jg.at")
    public boolean field3412 = true;

    @ObfuscatedName("jg.ak")
    public int field3420 = 128;

    @ObfuscatedName("jg.ax")
    public int field3414 = 128;

    @ObfuscatedName("jg.ar")
    public int field3415 = 128;

    @ObfuscatedName("jg.al")
    public int field3416 = 0;

    @ObfuscatedName("jg.aa")
    public int field3395 = 0;

    @ObfuscatedName("jg.as")
    public int field3388 = 0;

    @ObfuscatedName("jg.aw")
    public boolean field3419 = false;

    @ObfuscatedName("jg.az")
    public boolean field3409 = false;

    @ObfuscatedName("jg.ah")
    public int field3417 = -1;

    @ObfuscatedName("jg.ap")
    public int[] field3422;

    @ObfuscatedName("jg.aj")
    public int field3392 = -1;

    @ObfuscatedName("jg.an")
    public int field3418 = -1;

    @ObfuscatedName("jg.ai")
    public int field3425 = -1;

    @ObfuscatedName("jg.ab")
    public int field3426 = 0;

    @ObfuscatedName("jg.au")
    public int field3427 = 0;

    @ObfuscatedName("jg.ad")
    public int field3428 = 0;

    @ObfuscatedName("jg.af")
    public int[] field3429;

    @ObfuscatedName("jg.av")
    public boolean field3430 = true;

    @ObfuscatedName("jg.ao")
    public class327 field3431;

    @ObfuscatedName("el.n(Lig;Lig;ZI)V")
    public static void method3184(class245 arg0, class245 arg1, boolean arg2) {
        Statics.field3380 = arg0;
        Statics.field3382 = arg1;
        field3402 = arg2;
    }

    @ObfuscatedName("au.v(II)Ljg;")
    public static class265 method668(int arg0) {
        class265 var1 = (class265) field3383.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3380.method4032(6, arg0);
        class265 var3 = new class265();
        var3.field3407 = arg0;
        if (var2 != null) {
            var3.method4413(new class311(var2));
        }
        var3.method4408();
        if (var3.field3409) {
            var3.field3398 = 0;
            var3.field3399 = false;
        }
        field3383.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.d(B)V")
    public void method4408() {
        if (this.field3400 == -1) {
            this.field3400 = 0;
            if (this.field3389 != null && (this.field3390 == null || this.field3390[0] == 10)) {
                this.field3400 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3408[var1] != null) {
                    this.field3400 = 1;
                }
            }
        }
        if (this.field3417 == -1) {
            this.field3417 = this.field3398 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jg.c(Lkx;B)V")
    public void method4413(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4410(arg0, var2);
        }
    }

    @ObfuscatedName("jg.y(Lkx;II)V")
    public void method4410(class311 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5310();
            if (var3 > 0) {
                if (this.field3389 == null || field3402) {
                    this.field3390 = new int[var3];
                    this.field3389 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3389[var4] = arg0.method5247();
                        this.field3390[var4] = arg0.method5310();
                    }
                } else {
                    arg0.field3747 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3391 = arg0.method5465();
        } else if (arg1 == 5) {
            int var5 = arg0.method5310();
            if (var5 > 0) {
                if (this.field3389 == null || field3402) {
                    this.field3390 = null;
                    this.field3389 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3389[var6] = arg0.method5247();
                    }
                } else {
                    arg0.field3747 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3396 = arg0.method5310();
        } else if (arg1 == 15) {
            this.field3397 = arg0.method5310();
        } else if (arg1 == 17) {
            this.field3398 = 0;
            this.field3399 = false;
        } else if (arg1 == 18) {
            this.field3399 = false;
        } else if (arg1 == 19) {
            this.field3400 = arg0.method5310();
        } else if (arg1 == 21) {
            this.field3381 = 0;
        } else if (arg1 == 22) {
            this.field3421 = true;
        } else if (arg1 == 23) {
            this.field3385 = true;
        } else if (arg1 == 24) {
            this.field3403 = arg0.method5247();
            if (this.field3403 == 65535) {
                this.field3403 = -1;
            }
        } else if (arg1 == 27) {
            this.field3398 = 1;
        } else if (arg1 == 28) {
            this.field3405 = arg0.method5310();
        } else if (arg1 == 29) {
            this.field3406 = arg0.method5293();
        } else if (arg1 == 39) {
            this.field3404 = arg0.method5293() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3408[arg1 - 30] = arg0.method5465();
            if (this.field3408[arg1 - 30].equalsIgnoreCase(class234.field2964)) {
                this.field3408[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5310();
            this.field3387 = new short[var7];
            this.field3393 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3387[var8] = (short) arg0.method5247();
                this.field3393[var8] = (short) arg0.method5247();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5310();
            this.field3394 = new short[var9];
            this.field3401 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3394[var10] = (short) arg0.method5247();
                this.field3401[var10] = (short) arg0.method5247();
            }
        } else if (arg1 == 62) {
            this.field3423 = true;
        } else if (arg1 == 64) {
            this.field3412 = false;
        } else if (arg1 == 65) {
            this.field3420 = arg0.method5247();
        } else if (arg1 == 66) {
            this.field3414 = arg0.method5247();
        } else if (arg1 == 67) {
            this.field3415 = arg0.method5247();
        } else if (arg1 == 68) {
            this.field3410 = arg0.method5247();
        } else if (arg1 == 69) {
            arg0.method5310();
        } else if (arg1 == 70) {
            this.field3416 = arg0.method5226();
        } else if (arg1 == 71) {
            this.field3395 = arg0.method5226();
        } else if (arg1 == 72) {
            this.field3388 = arg0.method5226();
        } else if (arg1 == 73) {
            this.field3419 = true;
        } else if (arg1 == 74) {
            this.field3409 = true;
        } else if (arg1 == 75) {
            this.field3417 = arg0.method5310();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3392 = arg0.method5247();
            if (this.field3392 == 65535) {
                this.field3392 = -1;
            }
            this.field3418 = arg0.method5247();
            if (this.field3418 == 65535) {
                this.field3418 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5247();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5310();
            this.field3422 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3422[var15] = arg0.method5247();
                if (this.field3422[var15] == 65535) {
                    this.field3422[var15] = -1;
                }
            }
            this.field3422[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3425 = arg0.method5247();
            this.field3426 = arg0.method5310();
        } else if (arg1 == 79) {
            this.field3427 = arg0.method5247();
            this.field3428 = arg0.method5247();
            this.field3426 = arg0.method5310();
            int var11 = arg0.method5310();
            this.field3429 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3429[var12] = arg0.method5247();
            }
        } else if (arg1 == 81) {
            this.field3381 = arg0.method5310() * 256;
        } else if (arg1 == 82) {
            this.field3384 = arg0.method5247();
        } else if (arg1 == 89) {
            this.field3430 = false;
        } else if (arg1 == 249) {
            this.field3431 = class259.method2675(arg0, this.field3431);
        }
    }

    @ObfuscatedName("jg.h(II)Z")
    public final boolean method4411(int arg0) {
        if (this.field3390 != null) {
            for (int var4 = 0; var4 < this.field3390.length; var4++) {
                if (this.field3390[var4] == arg0) {
                    return Statics.field3382.method4024(this.field3389[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3389 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3389.length; var3++) {
                var2 &= Statics.field3382.method4024(this.field3389[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jg.z(B)Z")
    public final boolean method4427() {
        if (this.field3389 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3389.length; var2++) {
            var1 &= Statics.field3382.method4024(this.field3389[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jg.e(II[[IIIII)Lem;")
    public final class145 method4407(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3390 == null) {
            var7 = (long) ((this.field3407 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3407 << 10) + (arg0 << 3) + arg1);
        }
        class145 var9 = (class145) field3413.method3220(var7);
        if (var9 == null) {
            class131 var10 = this.method4443(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3421) {
                var10.field1582 = (short) (this.field3406 + 64);
                var10.field1594 = (short) (this.field3404 + 768);
                var10.method2773();
                var9 = var10;
            } else {
                var9 = var10.method2721(this.field3406 + 64, this.field3404 + 768, -50, -10, -50);
            }
            field3413.method3217(var9, var7);
        }
        if (this.field3421) {
            var9 = ((class131) var9).method2705();
        }
        if (this.field3381 >= 0) {
            if (var9 instanceof class137) {
                var9 = ((class137) var9).method2870(arg2, arg3, arg4, arg5, true, this.field3381);
            } else if (var9 instanceof class131) {
                var9 = ((class131) var9).method2706(arg2, arg3, arg4, arg5, true, this.field3381);
            }
        }
        return var9;
    }

    @ObfuscatedName("jg.q(II[[IIIII)Lef;")
    public final class137 method4414(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3390 == null) {
            var7 = (long) ((this.field3407 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3407 << 10) + (arg0 << 3) + arg1);
        }
        class137 var9 = (class137) field3386.method3220(var7);
        if (var9 == null) {
            class131 var10 = this.method4443(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2721(this.field3406 + 64, this.field3404 + 768, -50, -10, -50);
            field3386.method3217(var9, var7);
        }
        if (this.field3381 >= 0) {
            var9 = var9.method2870(arg2, arg3, arg4, arg5, true, this.field3381);
        }
        return var9;
    }

    @ObfuscatedName("jg.l(II[[IIIILjs;II)Lef;")
    public final class137 method4415(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class270 arg6, int arg7) {
        long var9;
        if (this.field3390 == null) {
            var9 = (long) ((this.field3407 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3407 << 10) + (arg0 << 3) + arg1);
        }
        class137 var11 = (class137) field3386.method3220(var9);
        if (var11 == null) {
            class131 var12 = this.method4443(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2721(this.field3406 + 64, this.field3404 + 768, -50, -10, -50);
            field3386.method3217(var11, var9);
        }
        if (arg6 == null && this.field3381 == -1) {
            return var11;
        }
        class137 var13;
        if (arg6 == null) {
            var13 = var11.method2826(true);
        } else {
            var13 = arg6.method4593(var11, arg7, arg1);
        }
        if (this.field3381 >= 0) {
            var13 = var13.method2870(arg2, arg3, arg4, arg5, false, this.field3381);
        }
        return var13;
    }

    @ObfuscatedName("jg.s(III)Lek;")
    public final class131 method4443(int arg0, int arg1) {
        class131 var3 = null;
        if (this.field3390 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3389 == null) {
                return null;
            }
            boolean var4 = this.field3423;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3389.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3389[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class131) field3424.method3220((long) var7);
                if (var3 == null) {
                    var3 = class131.method2777(Statics.field3382, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2749();
                    }
                    field3424.method3217(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3411[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class131(field3411, var5);
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
            int var10 = this.field3389[var8];
            boolean var11 = this.field3423 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class131) field3424.method3220((long) var10);
            if (var3 == null) {
                var3 = class131.method2777(Statics.field3382, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2749();
                }
                field3424.method3217(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3420 == 128 && this.field3414 == 128 && this.field3415 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3416 == 0 && this.field3395 == 0 && this.field3388 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class131 var14 = new class131(var3, arg1 == 0 && !var12 && !var13, this.field3387 == null, this.field3394 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2711(256);
            var14.method2712(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2708();
        } else if (var15 == 2) {
            var14.method2709();
        } else if (var15 == 3) {
            var14.method2766();
        }
        if (this.field3387 != null) {
            for (int var16 = 0; var16 < this.field3387.length; var16++) {
                var14.method2715(this.field3387[var16], this.field3393[var16]);
            }
        }
        if (this.field3394 != null) {
            for (int var17 = 0; var17 < this.field3394.length; var17++) {
                var14.method2714(this.field3394[var17], this.field3401[var17]);
            }
        }
        if (var12) {
            var14.method2716(this.field3420, this.field3414, this.field3415);
        }
        if (var13) {
            var14.method2712(this.field3416, this.field3395, this.field3388);
        }
        return var14;
    }

    @ObfuscatedName("jg.b(I)Ljg;")
    public final class265 method4417() {
        int var1 = -1;
        if (this.field3392 != -1) {
            var1 = class222.method5065(this.field3392);
        } else if (this.field3418 != -1) {
            var1 = class222.field2556[this.field3418];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3422.length - 1) {
            var2 = this.field3422[var1];
        } else {
            var2 = this.field3422[this.field3422.length - 1];
        }
        return var2 == -1 ? null : method668(var2);
    }

    @ObfuscatedName("jg.a(III)I")
    public int method4418(int arg0, int arg1) {
        class327 var3 = this.field3431;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5648((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2138;
            }
        }
        return var4;
    }

    @ObfuscatedName("jg.w(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4419(int arg0, String arg1) {
        return class259.method1120(this.field3431, arg0, arg1);
    }

    @ObfuscatedName("jg.k(I)Z")
    public boolean method4416() {
        if (this.field3422 == null) {
            return this.field3425 != -1 || this.field3429 != null;
        }
        for (int var1 = 0; var1 < this.field3422.length; var1++) {
            if (this.field3422[var1] != -1) {
                class265 var2 = method668(this.field3422[var1]);
                if (var2.field3425 != -1 || var2.field3429 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
