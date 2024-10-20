package deob;

@ObfuscatedName("je")
public class class265 extends class185 {

    @ObfuscatedName("je.f")
    public static boolean field3388 = false;

    @ObfuscatedName("je.m")
    public static class155 field3403 = new class155(4096);

    @ObfuscatedName("je.z")
    public static class155 field3377 = new class155(500);

    @ObfuscatedName("je.q")
    public static class155 field3378 = new class155(30);

    @ObfuscatedName("je.k")
    public static class155 field3379 = new class155(30);

    @ObfuscatedName("je.c")
    public static class131[] field3380 = new class131[4];

    @ObfuscatedName("je.u")
    public int field3411;

    @ObfuscatedName("je.t")
    public int[] field3382;

    @ObfuscatedName("je.e")
    public int[] field3383;

    @ObfuscatedName("je.o")
    public String field3384 = class234.field2793;

    @ObfuscatedName("je.n")
    public short[] field3374;

    @ObfuscatedName("je.x")
    public short[] field3386;

    @ObfuscatedName("je.p")
    public short[] field3387;

    @ObfuscatedName("je.r")
    public short[] field3393;

    @ObfuscatedName("je.y")
    public int field3389 = 1;

    @ObfuscatedName("je.s")
    public int field3390 = 1;

    @ObfuscatedName("je.j")
    public int field3391 = 2;

    @ObfuscatedName("je.w")
    public boolean field3381 = true;

    @ObfuscatedName("je.v")
    public int field3401 = -1;

    @ObfuscatedName("je.d")
    public int field3394 = -1;

    @ObfuscatedName("je.a")
    public boolean field3402 = false;

    @ObfuscatedName("je.g")
    public boolean field3415 = false;

    @ObfuscatedName("je.h")
    public int field3397 = -1;

    @ObfuscatedName("je.i")
    public int field3412 = 16;

    @ObfuscatedName("je.ab")
    public int field3419 = 0;

    @ObfuscatedName("je.ac")
    public int field3399 = 0;

    @ObfuscatedName("je.ao")
    public String[] field3395 = new String[5];

    @ObfuscatedName("je.af")
    public int field3420 = -1;

    @ObfuscatedName("je.av")
    public int field3398 = -1;

    @ObfuscatedName("je.ar")
    public boolean field3404 = false;

    @ObfuscatedName("je.ay")
    public boolean field3405 = true;

    @ObfuscatedName("je.ah")
    public int field3406 = 128;

    @ObfuscatedName("je.az")
    public int field3407 = 128;

    @ObfuscatedName("je.ak")
    public int field3408 = 128;

    @ObfuscatedName("je.au")
    public int field3409 = 0;

    @ObfuscatedName("je.ai")
    public int field3410 = 0;

    @ObfuscatedName("je.ax")
    public int field3385 = 0;

    @ObfuscatedName("je.ag")
    public boolean field3421 = false;

    @ObfuscatedName("je.aq")
    public boolean field3413 = false;

    @ObfuscatedName("je.aw")
    public int field3392 = -1;

    @ObfuscatedName("je.an")
    public int[] field3414;

    @ObfuscatedName("je.am")
    public int field3416 = -1;

    @ObfuscatedName("je.aa")
    public int field3417 = -1;

    @ObfuscatedName("je.at")
    public int field3418 = -1;

    @ObfuscatedName("je.as")
    public int field3376 = 0;

    @ObfuscatedName("je.aj")
    public int field3396 = 0;

    @ObfuscatedName("je.ae")
    public int field3400 = 0;

    @ObfuscatedName("je.al")
    public int[] field3422;

    @ObfuscatedName("je.ap")
    public class327 field3423;

    @ObfuscatedName("bd.f(IB)Lje;")
    public static class265 method1122(int arg0) {
        class265 var1 = (class265) field3403.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3375.method3905(6, arg0);
        class265 var3 = new class265();
        var3.field3411 = arg0;
        if (var2 != null) {
            var3.method4353(new class311(var2));
        }
        var3.method4352();
        if (var3.field3413) {
            var3.field3391 = 0;
            var3.field3381 = false;
        }
        field3403.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.b(S)V")
    public void method4352() {
        if (this.field3401 == -1) {
            this.field3401 = 0;
            if (this.field3382 != null && (this.field3383 == null || this.field3383[0] == 10)) {
                this.field3401 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3395[var1] != null) {
                    this.field3401 = 1;
                }
            }
        }
        if (this.field3392 == -1) {
            this.field3392 = this.field3391 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("je.l(Lkb;I)V")
    public void method4353(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4354(arg0, var2);
        }
    }

    @ObfuscatedName("je.m(Lkb;II)V")
    public void method4354(class311 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5276();
            if (var3 > 0) {
                if (this.field3382 == null || field3388) {
                    this.field3383 = new int[var3];
                    this.field3382 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3382[var4] = arg0.method5163();
                        this.field3383[var4] = arg0.method5276();
                    }
                } else {
                    arg0.field3741 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3384 = arg0.method5189();
        } else if (arg1 == 5) {
            int var5 = arg0.method5276();
            if (var5 > 0) {
                if (this.field3382 == null || field3388) {
                    this.field3383 = null;
                    this.field3382 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3382[var6] = arg0.method5163();
                    }
                } else {
                    arg0.field3741 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3389 = arg0.method5276();
        } else if (arg1 == 15) {
            this.field3390 = arg0.method5276();
        } else if (arg1 == 17) {
            this.field3391 = 0;
            this.field3381 = false;
        } else if (arg1 == 18) {
            this.field3381 = false;
        } else if (arg1 == 19) {
            this.field3401 = arg0.method5276();
        } else if (arg1 == 21) {
            this.field3394 = 0;
        } else if (arg1 == 22) {
            this.field3402 = true;
        } else if (arg1 == 23) {
            this.field3415 = true;
        } else if (arg1 == 24) {
            this.field3397 = arg0.method5163();
            if (this.field3397 == 65535) {
                this.field3397 = -1;
            }
        } else if (arg1 == 27) {
            this.field3391 = 1;
        } else if (arg1 == 28) {
            this.field3412 = arg0.method5276();
        } else if (arg1 == 29) {
            this.field3419 = arg0.method5181();
        } else if (arg1 == 39) {
            this.field3399 = arg0.method5181() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3395[arg1 - 30] = arg0.method5189();
            if (this.field3395[arg1 - 30].equalsIgnoreCase(class234.field2788)) {
                this.field3395[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5276();
            this.field3374 = new short[var7];
            this.field3386 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3374[var8] = (short) arg0.method5163();
                this.field3386[var8] = (short) arg0.method5163();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5276();
            this.field3387 = new short[var9];
            this.field3393 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3387[var10] = (short) arg0.method5163();
                this.field3393[var10] = (short) arg0.method5163();
            }
        } else if (arg1 == 62) {
            this.field3404 = true;
        } else if (arg1 == 64) {
            this.field3405 = false;
        } else if (arg1 == 65) {
            this.field3406 = arg0.method5163();
        } else if (arg1 == 66) {
            this.field3407 = arg0.method5163();
        } else if (arg1 == 67) {
            this.field3408 = arg0.method5163();
        } else if (arg1 == 68) {
            this.field3398 = arg0.method5163();
        } else if (arg1 == 69) {
            arg0.method5276();
        } else if (arg1 == 70) {
            this.field3409 = arg0.method5183();
        } else if (arg1 == 71) {
            this.field3410 = arg0.method5183();
        } else if (arg1 == 72) {
            this.field3385 = arg0.method5183();
        } else if (arg1 == 73) {
            this.field3421 = true;
        } else if (arg1 == 74) {
            this.field3413 = true;
        } else if (arg1 == 75) {
            this.field3392 = arg0.method5276();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3416 = arg0.method5163();
            if (this.field3416 == 65535) {
                this.field3416 = -1;
            }
            this.field3417 = arg0.method5163();
            if (this.field3417 == 65535) {
                this.field3417 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5163();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5276();
            this.field3414 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3414[var15] = arg0.method5163();
                if (this.field3414[var15] == 65535) {
                    this.field3414[var15] = -1;
                }
            }
            this.field3414[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3418 = arg0.method5163();
            this.field3376 = arg0.method5276();
        } else if (arg1 == 79) {
            this.field3396 = arg0.method5163();
            this.field3400 = arg0.method5163();
            this.field3376 = arg0.method5276();
            int var11 = arg0.method5276();
            this.field3422 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3422[var12] = arg0.method5163();
            }
        } else if (arg1 == 81) {
            this.field3394 = arg0.method5276() * 256;
        } else if (arg1 == 82) {
            this.field3420 = arg0.method5163();
        } else if (arg1 == 249) {
            this.field3423 = class259.method4092(arg0, this.field3423);
        }
    }

    @ObfuscatedName("je.z(II)Z")
    public final boolean method4355(int arg0) {
        if (this.field3383 != null) {
            for (int var4 = 0; var4 < this.field3383.length; var4++) {
                if (this.field3383[var4] == arg0) {
                    return Statics.field109.method3902(this.field3382[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3382 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3382.length; var3++) {
                var2 &= Statics.field109.method3902(this.field3382[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("je.q(I)Z")
    public final boolean method4356() {
        if (this.field3382 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3382.length; var2++) {
            var1 &= Statics.field109.method3902(this.field3382[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("je.k(II[[IIIII)Lej;")
    public final class145 method4357(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3383 == null) {
            var7 = (long) ((this.field3411 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3411 << 10) + (arg0 << 3) + arg1);
        }
        class145 var9 = (class145) field3378.method3155(var7);
        if (var9 == null) {
            class131 var10 = this.method4360(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3402) {
                var10.field1601 = (short) (this.field3419 + 64);
                var10.field1602 = (short) (this.field3399 + 768);
                var10.method2659();
                var9 = var10;
            } else {
                var9 = var10.method2668(this.field3419 + 64, this.field3399 + 768, -50, -10, -50);
            }
            field3378.method3157(var9, var7);
        }
        if (this.field3402) {
            var9 = ((class131) var9).method2667();
        }
        if (this.field3394 >= 0) {
            if (var9 instanceof class137) {
                var9 = ((class137) var9).method2741(arg2, arg3, arg4, arg5, true, this.field3394);
            } else if (var9 instanceof class131) {
                var9 = ((class131) var9).method2650(arg2, arg3, arg4, arg5, true, this.field3394);
            }
        }
        return var9;
    }

    @ObfuscatedName("je.c(II[[IIIII)Leh;")
    public final class137 method4358(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3383 == null) {
            var7 = (long) ((this.field3411 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3411 << 10) + (arg0 << 3) + arg1);
        }
        class137 var9 = (class137) field3379.method3155(var7);
        if (var9 == null) {
            class131 var10 = this.method4360(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2668(this.field3419 + 64, this.field3399 + 768, -50, -10, -50);
            field3379.method3157(var9, var7);
        }
        if (this.field3394 >= 0) {
            var9 = var9.method2741(arg2, arg3, arg4, arg5, true, this.field3394);
        }
        return var9;
    }

    @ObfuscatedName("je.u(II[[IIIILjg;II)Leh;")
    public final class137 method4377(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class270 arg6, int arg7) {
        long var9;
        if (this.field3383 == null) {
            var9 = (long) ((this.field3411 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3411 << 10) + (arg0 << 3) + arg1);
        }
        class137 var11 = (class137) field3379.method3155(var9);
        if (var11 == null) {
            class131 var12 = this.method4360(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2668(this.field3419 + 64, this.field3399 + 768, -50, -10, -50);
            field3379.method3157(var11, var9);
        }
        if (arg6 == null && this.field3394 == -1) {
            return var11;
        }
        class137 var13;
        if (arg6 == null) {
            var13 = var11.method2766(true);
        } else {
            var13 = arg6.method4524(var11, arg7, arg1);
        }
        if (this.field3394 >= 0) {
            var13 = var13.method2741(arg2, arg3, arg4, arg5, false, this.field3394);
        }
        return var13;
    }

    @ObfuscatedName("je.t(III)Len;")
    public final class131 method4360(int arg0, int arg1) {
        class131 var3 = null;
        if (this.field3383 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3382 == null) {
                return null;
            }
            boolean var4 = this.field3404;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3382.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3382[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class131) field3377.method3155((long) var7);
                if (var3 == null) {
                    var3 = class131.method2647(Statics.field109, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2662();
                    }
                    field3377.method3157(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3380[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class131(field3380, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3383.length; var9++) {
                if (this.field3383[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3382[var8];
            boolean var11 = this.field3404 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class131) field3377.method3155((long) var10);
            if (var3 == null) {
                var3 = class131.method2647(Statics.field109, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2662();
                }
                field3377.method3157(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3406 == 128 && this.field3407 == 128 && this.field3408 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3409 == 0 && this.field3410 == 0 && this.field3385 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class131 var14 = new class131(var3, arg1 == 0 && !var12 && !var13, this.field3374 == null, this.field3387 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2672(256);
            var14.method2707(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2675();
        } else if (var15 == 2) {
            var14.method2656();
        } else if (var15 == 3) {
            var14.method2657();
        }
        if (this.field3374 != null) {
            for (int var16 = 0; var16 < this.field3374.length; var16++) {
                var14.method2660(this.field3374[var16], this.field3386[var16]);
            }
        }
        if (this.field3387 != null) {
            for (int var17 = 0; var17 < this.field3387.length; var17++) {
                var14.method2661(this.field3387[var17], this.field3393[var17]);
            }
        }
        if (var12) {
            var14.method2703(this.field3406, this.field3407, this.field3408);
        }
        if (var13) {
            var14.method2707(this.field3409, this.field3410, this.field3385);
        }
        return var14;
    }

    @ObfuscatedName("je.e(B)Lje;")
    public final class265 method4361() {
        int var1 = -1;
        if (this.field3416 != -1) {
            var1 = class222.method1164(this.field3416);
        } else if (this.field3417 != -1) {
            var1 = class222.field2551[this.field3417];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3414.length - 1) {
            var2 = this.field3414[var1];
        } else {
            var2 = this.field3414[this.field3414.length - 1];
        }
        return var2 == -1 ? null : method1122(var2);
    }

    @ObfuscatedName("je.o(III)I")
    public int method4351(int arg0, int arg1) {
        class327 var3 = this.field3423;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5561((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2139;
            }
        }
        return var4;
    }

    @ObfuscatedName("je.n(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4363(int arg0, String arg1) {
        return class259.method275(this.field3423, arg0, arg1);
    }

    @ObfuscatedName("je.x(I)Z")
    public boolean method4367() {
        if (this.field3414 == null) {
            return this.field3418 != -1 || this.field3422 != null;
        }
        for (int var1 = 0; var1 < this.field3414.length; var1++) {
            if (this.field3414[var1] != -1) {
                class265 var2 = method1122(this.field3414[var1]);
                if (var2.field3418 != -1 || var2.field3422 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
