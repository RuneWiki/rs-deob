package deob;

@ObfuscatedName("jq")
public class class271 extends class209 {

    @ObfuscatedName("jq.f")
    public static boolean field3474 = false;

    @ObfuscatedName("jq.s")
    public static class203 field3469 = new class203(4096);

    @ObfuscatedName("jq.e")
    public static class203 field3456 = new class203(500);

    @ObfuscatedName("jq.a")
    public static class203 field3451 = new class203(30);

    @ObfuscatedName("jq.c")
    public static class203 field3452 = new class203(30);

    @ObfuscatedName("jq.p")
    public static class116[] field3453 = new class116[4];

    @ObfuscatedName("jq.r")
    public int field3454;

    @ObfuscatedName("jq.m")
    public int[] field3455;

    @ObfuscatedName("jq.d")
    public int[] field3475;

    @ObfuscatedName("jq.z")
    public String field3446 = class240.field2865;

    @ObfuscatedName("jq.x")
    public short[] field3458;

    @ObfuscatedName("jq.v")
    public short[] field3495;

    @ObfuscatedName("jq.g")
    public short[] field3460;

    @ObfuscatedName("jq.j")
    public short[] field3461;

    @ObfuscatedName("jq.b")
    public int field3449 = 1;

    @ObfuscatedName("jq.u")
    public int field3492 = 1;

    @ObfuscatedName("jq.t")
    public int field3472 = 2;

    @ObfuscatedName("jq.n")
    public boolean field3465 = true;

    @ObfuscatedName("jq.h")
    public int field3466 = -1;

    @ObfuscatedName("jq.o")
    public int field3467 = -1;

    @ObfuscatedName("jq.i")
    public boolean field3468 = false;

    @ObfuscatedName("jq.k")
    public boolean field3463 = false;

    @ObfuscatedName("jq.q")
    public int field3470 = -1;

    @ObfuscatedName("jq.y")
    public int field3471 = 16;

    @ObfuscatedName("jq.av")
    public int field3482 = 0;

    @ObfuscatedName("jq.ag")
    public int field3473 = 0;

    @ObfuscatedName("jq.af")
    public String[] field3477 = new String[5];

    @ObfuscatedName("jq.az")
    public int field3447 = -1;

    @ObfuscatedName("jq.at")
    public int field3457 = -1;

    @ObfuscatedName("jq.ac")
    public boolean field3476 = false;

    @ObfuscatedName("jq.am")
    public boolean field3464 = true;

    @ObfuscatedName("jq.aw")
    public int field3479 = 128;

    @ObfuscatedName("jq.aa")
    public int field3480 = 128;

    @ObfuscatedName("jq.as")
    public int field3462 = 128;

    @ObfuscatedName("jq.al")
    public int field3478 = 0;

    @ObfuscatedName("jq.ad")
    public int field3483 = 0;

    @ObfuscatedName("jq.ax")
    public int field3484 = 0;

    @ObfuscatedName("jq.ao")
    public boolean field3485 = false;

    @ObfuscatedName("jq.ae")
    public boolean field3486 = false;

    @ObfuscatedName("jq.ap")
    public int field3487 = -1;

    @ObfuscatedName("jq.ar")
    public int[] field3488;

    @ObfuscatedName("jq.ab")
    public int field3489 = -1;

    @ObfuscatedName("jq.aq")
    public int field3490 = -1;

    @ObfuscatedName("jq.au")
    public int field3491 = -1;

    @ObfuscatedName("jq.aj")
    public int field3450 = 0;

    @ObfuscatedName("jq.ah")
    public int field3493 = 0;

    @ObfuscatedName("jq.ai")
    public int field3494 = 0;

    @ObfuscatedName("jq.an")
    public int[] field3459;

    @ObfuscatedName("jq.ay")
    public class200 field3496;

    @ObfuscatedName("j.f(Lik;Lik;ZB)V")
    public static void method154(class250 arg0, class250 arg1, boolean arg2) {
        Statics.field3481 = arg0;
        Statics.field3448 = arg1;
        field3474 = arg2;
    }

    @ObfuscatedName("bh.l(II)Ljq;")
    public static class271 method1776(int arg0) {
        class271 var1 = (class271) field3469.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3481.method4289(6, arg0);
        class271 var3 = new class271();
        var3.field3454 = arg0;
        if (var2 != null) {
            var3.method4719(new class185(var2));
        }
        var3.method4730();
        if (var3.field3486) {
            var3.field3472 = 0;
            var3.field3465 = false;
        }
        field3469.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.w(B)V")
    public void method4730() {
        if (this.field3466 == -1) {
            this.field3466 = 0;
            if (this.field3455 != null && (this.field3475 == null || this.field3475[0] == 10)) {
                this.field3466 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3477[var1] != null) {
                    this.field3466 = 1;
                }
            }
        }
        if (this.field3487 == -1) {
            this.field3487 = this.field3472 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jq.s(Lgm;I)V")
    public void method4719(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4715(arg0, var2);
        }
    }

    @ObfuscatedName("jq.e(Lgm;II)V")
    public void method4715(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3344();
            if (var3 > 0) {
                if (this.field3455 == null || field3474) {
                    this.field3475 = new int[var3];
                    this.field3455 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3455[var4] = arg0.method3346();
                        this.field3475[var4] = arg0.method3344();
                    }
                } else {
                    arg0.field2414 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3446 = arg0.method3353();
        } else if (arg1 == 5) {
            int var5 = arg0.method3344();
            if (var5 > 0) {
                if (this.field3455 == null || field3474) {
                    this.field3475 = null;
                    this.field3455 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3455[var6] = arg0.method3346();
                    }
                } else {
                    arg0.field2414 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3449 = arg0.method3344();
        } else if (arg1 == 15) {
            this.field3492 = arg0.method3344();
        } else if (arg1 == 17) {
            this.field3472 = 0;
            this.field3465 = false;
        } else if (arg1 == 18) {
            this.field3465 = false;
        } else if (arg1 == 19) {
            this.field3466 = arg0.method3344();
        } else if (arg1 == 21) {
            this.field3467 = 0;
        } else if (arg1 == 22) {
            this.field3468 = true;
        } else if (arg1 == 23) {
            this.field3463 = true;
        } else if (arg1 == 24) {
            this.field3470 = arg0.method3346();
            if (this.field3470 == 65535) {
                this.field3470 = -1;
            }
        } else if (arg1 == 27) {
            this.field3472 = 1;
        } else if (arg1 == 28) {
            this.field3471 = arg0.method3344();
        } else if (arg1 == 29) {
            this.field3482 = arg0.method3345();
        } else if (arg1 == 39) {
            this.field3473 = arg0.method3345();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3477[arg1 - 30] = arg0.method3353();
            if (this.field3477[arg1 - 30].equalsIgnoreCase(class240.field2860)) {
                this.field3477[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3344();
            this.field3458 = new short[var7];
            this.field3495 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3458[var8] = (short) arg0.method3346();
                this.field3495[var8] = (short) arg0.method3346();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3344();
            this.field3460 = new short[var9];
            this.field3461 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3460[var10] = (short) arg0.method3346();
                this.field3461[var10] = (short) arg0.method3346();
            }
        } else if (arg1 == 62) {
            this.field3476 = true;
        } else if (arg1 == 64) {
            this.field3464 = false;
        } else if (arg1 == 65) {
            this.field3479 = arg0.method3346();
        } else if (arg1 == 66) {
            this.field3480 = arg0.method3346();
        } else if (arg1 == 67) {
            this.field3462 = arg0.method3346();
        } else if (arg1 == 68) {
            this.field3457 = arg0.method3346();
        } else if (arg1 == 69) {
            arg0.method3344();
        } else if (arg1 == 70) {
            this.field3478 = arg0.method3544();
        } else if (arg1 == 71) {
            this.field3483 = arg0.method3544();
        } else if (arg1 == 72) {
            this.field3484 = arg0.method3544();
        } else if (arg1 == 73) {
            this.field3485 = true;
        } else if (arg1 == 74) {
            this.field3486 = true;
        } else if (arg1 == 75) {
            this.field3487 = arg0.method3344();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3489 = arg0.method3346();
            if (this.field3489 == 65535) {
                this.field3489 = -1;
            }
            this.field3490 = arg0.method3346();
            if (this.field3490 == 65535) {
                this.field3490 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3346();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3344();
            this.field3488 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3488[var15] = arg0.method3346();
                if (this.field3488[var15] == 65535) {
                    this.field3488[var15] = -1;
                }
            }
            this.field3488[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3491 = arg0.method3346();
            this.field3450 = arg0.method3344();
        } else if (arg1 == 79) {
            this.field3493 = arg0.method3346();
            this.field3494 = arg0.method3346();
            this.field3450 = arg0.method3344();
            int var11 = arg0.method3344();
            this.field3459 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3459[var12] = arg0.method3346();
            }
        } else if (arg1 == 81) {
            this.field3467 = arg0.method3344() * 256;
        } else if (arg1 == 82) {
            this.field3447 = arg0.method3346();
        } else if (arg1 == 249) {
            this.field3496 = class265.method1002(arg0, this.field3496);
        }
    }

    @ObfuscatedName("jq.c(II)Z")
    public final boolean method4747(int arg0) {
        if (this.field3475 != null) {
            for (int var4 = 0; var4 < this.field3475.length; var4++) {
                if (this.field3475[var4] == arg0) {
                    return Statics.field3448.method4359(this.field3455[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3455 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3455.length; var3++) {
                var2 &= Statics.field3448.method4359(this.field3455[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jq.p(I)Z")
    public final boolean method4725() {
        if (this.field3455 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3455.length; var2++) {
            var1 &= Statics.field3448.method4359(this.field3455[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jq.r(II[[IIIII)Ldj;")
    public final class130 method4717(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3475 == null) {
            var7 = (long) ((this.field3454 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3454 << 10) + (arg0 << 3) + arg1);
        }
        class130 var9 = (class130) field3451.method3737(var7);
        if (var9 == null) {
            class116 var10 = this.method4720(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3468) {
                var10.field1545 = (short) (this.field3482 + 64);
                var10.field1546 = (short) (this.field3473 * 25 + 768);
                var10.method2451();
                var9 = var10;
            } else {
                var9 = var10.method2468(this.field3482 + 64, this.field3473 * 25 + 768, -50, -10, -50);
            }
            field3451.method3744(var9, var7);
        }
        if (this.field3468) {
            var9 = ((class116) var9).method2439();
        }
        if (this.field3467 >= 0) {
            if (var9 instanceof class122) {
                var9 = ((class122) var9).method2530(arg2, arg3, arg4, arg5, true, this.field3467);
            } else if (var9 instanceof class116) {
                var9 = ((class116) var9).method2440(arg2, arg3, arg4, arg5, true, this.field3467);
            }
        }
        return var9;
    }

    @ObfuscatedName("jq.m(II[[IIIII)Lds;")
    public final class122 method4718(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3475 == null) {
            var7 = (long) ((this.field3454 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3454 << 10) + (arg0 << 3) + arg1);
        }
        class122 var9 = (class122) field3452.method3737(var7);
        if (var9 == null) {
            class116 var10 = this.method4720(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2468(this.field3482 + 64, this.field3473 * 25 + 768, -50, -10, -50);
            field3452.method3744(var9, var7);
        }
        if (this.field3467 >= 0) {
            var9 = var9.method2530(arg2, arg3, arg4, arg5, true, this.field3467);
        }
        return var9;
    }

    @ObfuscatedName("jq.d(II[[IIIILjw;IB)Lds;")
    public final class122 method4723(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class276 arg6, int arg7) {
        long var9;
        if (this.field3475 == null) {
            var9 = (long) ((this.field3454 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3454 << 10) + (arg0 << 3) + arg1);
        }
        class122 var11 = (class122) field3452.method3737(var9);
        if (var11 == null) {
            class116 var12 = this.method4720(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2468(this.field3482 + 64, this.field3473 * 25 + 768, -50, -10, -50);
            field3452.method3744(var11, var9);
        }
        if (arg6 == null && this.field3467 == -1) {
            return var11;
        }
        class122 var13;
        if (arg6 == null) {
            var13 = var11.method2536(true);
        } else {
            var13 = arg6.method4926(var11, arg7, arg1);
        }
        if (this.field3467 >= 0) {
            var13 = var13.method2530(arg2, arg3, arg4, arg5, false, this.field3467);
        }
        return var13;
    }

    @ObfuscatedName("jq.z(IIB)Ldb;")
    public final class116 method4720(int arg0, int arg1) {
        class116 var3 = null;
        if (this.field3475 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3455 == null) {
                return null;
            }
            boolean var4 = this.field3476;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3455.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3455[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class116) field3456.method3737((long) var7);
                if (var3 == null) {
                    var3 = class116.method2435(Statics.field3448, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2449();
                    }
                    field3456.method3744(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3453[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class116(field3453, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3475.length; var9++) {
                if (this.field3475[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3455[var8];
            boolean var11 = this.field3476 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class116) field3456.method3737((long) var10);
            if (var3 == null) {
                var3 = class116.method2435(Statics.field3448, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2449();
                }
                field3456.method3744(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3479 == 128 && this.field3480 == 128 && this.field3462 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3478 == 0 && this.field3483 == 0 && this.field3484 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class116 var14 = new class116(var3, arg1 == 0 && !var12 && !var13, this.field3458 == null, this.field3460 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2445(256);
            var14.method2446(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2442();
        } else if (var15 == 2) {
            var14.method2476();
        } else if (var15 == 3) {
            var14.method2444();
        }
        if (this.field3458 != null) {
            for (int var16 = 0; var16 < this.field3458.length; var16++) {
                var14.method2447(this.field3458[var16], this.field3495[var16]);
            }
        }
        if (this.field3460 != null) {
            for (int var17 = 0; var17 < this.field3460.length; var17++) {
                var14.method2448(this.field3460[var17], this.field3461[var17]);
            }
        }
        if (var12) {
            var14.method2450(this.field3479, this.field3480, this.field3462);
        }
        if (var13) {
            var14.method2446(this.field3478, this.field3483, this.field3484);
        }
        return var14;
    }

    @ObfuscatedName("jq.x(I)Ljq;")
    public final class271 method4721() {
        int var1 = -1;
        if (this.field3489 != -1) {
            var1 = class228.method2155(this.field3489);
        } else if (this.field3490 != -1) {
            var1 = class228.field2628[this.field3490];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3488.length - 1) {
            var2 = this.field3488[var1];
        } else {
            var2 = this.field3488[this.field3488.length - 1];
        }
        return var2 == -1 ? null : method1776(var2);
    }

    @ObfuscatedName("jq.v(III)I")
    public int method4722(int arg0, int arg1) {
        return class265.method944(this.field3496, arg0, arg1);
    }

    @ObfuscatedName("jq.g(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4732(int arg0, String arg1) {
        class200 var3 = this.field3496;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class198 var5 = (class198) var3.method3706((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2468;
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.u(I)Z")
    public boolean method4724() {
        if (this.field3488 == null) {
            return this.field3491 != -1 || this.field3459 != null;
        }
        for (int var1 = 0; var1 < this.field3488.length; var1++) {
            if (this.field3488[var1] != -1) {
                class271 var2 = method1776(this.field3488[var1]);
                if (var2.field3491 != -1 || var2.field3459 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
