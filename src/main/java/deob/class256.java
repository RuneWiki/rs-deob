package deob;

@ObfuscatedName("if")
public class class256 extends class195 {

    @ObfuscatedName("if.i")
    public static boolean field3429 = false;

    @ObfuscatedName("if.q")
    public static class190 field3432 = new class190(4096);

    @ObfuscatedName("if.g")
    public static class190 field3479 = new class190(500);

    @ObfuscatedName("if.v")
    public static class190 field3434 = new class190(30);

    @ObfuscatedName("if.t")
    public static class190 field3465 = new class190(30);

    @ObfuscatedName("if.p")
    public static class128[] field3436 = new class128[4];

    @ObfuscatedName("if.l")
    public int field3437;

    @ObfuscatedName("if.a")
    public int[] field3438;

    @ObfuscatedName("if.k")
    public int[] field3439;

    @ObfuscatedName("if.r")
    public String field3440 = "null";

    @ObfuscatedName("if.b")
    public short[] field3441;

    @ObfuscatedName("if.x")
    public short[] field3478;

    @ObfuscatedName("if.o")
    public short[] field3443;

    @ObfuscatedName("if.j")
    public short[] field3474;

    @ObfuscatedName("if.m")
    public int field3453 = 1;

    @ObfuscatedName("if.d")
    public int field3431 = 1;

    @ObfuscatedName("if.e")
    public int field3447 = 2;

    @ObfuscatedName("if.s")
    public boolean field3448 = true;

    @ObfuscatedName("if.n")
    public int field3457 = -1;

    @ObfuscatedName("if.y")
    public int field3450 = -1;

    @ObfuscatedName("if.w")
    public boolean field3467 = false;

    @ObfuscatedName("if.f")
    public boolean field3452 = false;

    @ObfuscatedName("if.c")
    public int field3445 = -1;

    @ObfuscatedName("if.z")
    public int field3454 = 16;

    @ObfuscatedName("if.ay")
    public int field3455 = 0;

    @ObfuscatedName("if.ah")
    public int field3435 = 0;

    @ObfuscatedName("if.az")
    public String[] field3451 = new String[5];

    @ObfuscatedName("if.ac")
    public int field3458 = -1;

    @ObfuscatedName("if.aq")
    public int field3459 = -1;

    @ObfuscatedName("if.af")
    public boolean field3446 = false;

    @ObfuscatedName("if.aj")
    public boolean field3461 = true;

    @ObfuscatedName("if.ax")
    public int field3463 = 128;

    @ObfuscatedName("if.ad")
    public int field3476 = 128;

    @ObfuscatedName("if.av")
    public int field3464 = 128;

    @ObfuscatedName("if.ae")
    public int field3449 = 0;

    @ObfuscatedName("if.ar")
    public int field3466 = 0;

    @ObfuscatedName("if.ag")
    public int field3456 = 0;

    @ObfuscatedName("if.at")
    public boolean field3462 = false;

    @ObfuscatedName("if.ai")
    public boolean field3469 = false;

    @ObfuscatedName("if.ao")
    public int field3444 = -1;

    @ObfuscatedName("if.am")
    public int[] field3471;

    @ObfuscatedName("if.ap")
    public int field3472 = -1;

    @ObfuscatedName("if.as")
    public int field3473 = -1;

    @ObfuscatedName("if.aw")
    public int field3433 = -1;

    @ObfuscatedName("if.al")
    public int field3475 = 0;

    @ObfuscatedName("if.ak")
    public int field3470 = 0;

    @ObfuscatedName("if.aa")
    public int field3477 = 0;

    @ObfuscatedName("if.an")
    public int[] field3460;

    @ObfuscatedName("if.au")
    public class187 field3468;

    @ObfuscatedName("client.i(Liy;Liy;ZB)V")
    public static void method1396(class236 arg0, class236 arg1, boolean arg2) {
        Statics.field3430 = arg0;
        Statics.field3442 = arg1;
        field3429 = arg2;
    }

    @ObfuscatedName("if.u(I)V")
    public void method4223() {
        if (this.field3457 == -1) {
            this.field3457 = 0;
            if (this.field3438 != null && (this.field3439 == null || this.field3439[0] == 10)) {
                this.field3457 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3451[var1] != null) {
                    this.field3457 = 1;
                }
            }
        }
        if (this.field3444 == -1) {
            this.field3444 = this.field3447 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("if.q(Lfv;I)V")
    public void method4224(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4225(arg0, var2);
        }
    }

    @ObfuscatedName("if.g(Lfv;IB)V")
    public void method4225(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2930();
            if (var3 > 0) {
                if (this.field3438 == null || field3429) {
                    this.field3439 = new int[var3];
                    this.field3438 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3438[var4] = arg0.method2932();
                        this.field3439[var4] = arg0.method2930();
                    }
                } else {
                    arg0.field2384 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3440 = arg0.method2938();
        } else if (arg1 == 5) {
            int var5 = arg0.method2930();
            if (var5 > 0) {
                if (this.field3438 == null || field3429) {
                    this.field3439 = null;
                    this.field3438 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3438[var6] = arg0.method2932();
                    }
                } else {
                    arg0.field2384 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3453 = arg0.method2930();
        } else if (arg1 == 15) {
            this.field3431 = arg0.method2930();
        } else if (arg1 == 17) {
            this.field3447 = 0;
            this.field3448 = false;
        } else if (arg1 == 18) {
            this.field3448 = false;
        } else if (arg1 == 19) {
            this.field3457 = arg0.method2930();
        } else if (arg1 == 21) {
            this.field3450 = 0;
        } else if (arg1 == 22) {
            this.field3467 = true;
        } else if (arg1 == 23) {
            this.field3452 = true;
        } else if (arg1 == 24) {
            this.field3445 = arg0.method2932();
            if (this.field3445 == 65535) {
                this.field3445 = -1;
            }
        } else if (arg1 == 27) {
            this.field3447 = 1;
        } else if (arg1 == 28) {
            this.field3454 = arg0.method2930();
        } else if (arg1 == 29) {
            this.field3455 = arg0.method2931();
        } else if (arg1 == 39) {
            this.field3435 = arg0.method2931();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3451[arg1 - 30] = arg0.method2938();
            if (this.field3451[arg1 - 30].equalsIgnoreCase(class226.field2845)) {
                this.field3451[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2930();
            this.field3441 = new short[var7];
            this.field3478 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3441[var8] = (short) arg0.method2932();
                this.field3478[var8] = (short) arg0.method2932();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2930();
            this.field3443 = new short[var9];
            this.field3474 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3443[var10] = (short) arg0.method2932();
                this.field3474[var10] = (short) arg0.method2932();
            }
        } else if (arg1 == 62) {
            this.field3446 = true;
        } else if (arg1 == 64) {
            this.field3461 = false;
        } else if (arg1 == 65) {
            this.field3463 = arg0.method2932();
        } else if (arg1 == 66) {
            this.field3476 = arg0.method2932();
        } else if (arg1 == 67) {
            this.field3464 = arg0.method2932();
        } else if (arg1 == 68) {
            this.field3459 = arg0.method2932();
        } else if (arg1 == 69) {
            arg0.method2930();
        } else if (arg1 == 70) {
            this.field3449 = arg0.method2933();
        } else if (arg1 == 71) {
            this.field3466 = arg0.method2933();
        } else if (arg1 == 72) {
            this.field3456 = arg0.method2933();
        } else if (arg1 == 73) {
            this.field3462 = true;
        } else if (arg1 == 74) {
            this.field3469 = true;
        } else if (arg1 == 75) {
            this.field3444 = arg0.method2930();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3472 = arg0.method2932();
            if (this.field3472 == 65535) {
                this.field3472 = -1;
            }
            this.field3473 = arg0.method2932();
            if (this.field3473 == 65535) {
                this.field3473 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2932();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2930();
            this.field3471 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3471[var15] = arg0.method2932();
                if (this.field3471[var15] == 65535) {
                    this.field3471[var15] = -1;
                }
            }
            this.field3471[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3433 = arg0.method2932();
            this.field3475 = arg0.method2930();
        } else if (arg1 == 79) {
            this.field3470 = arg0.method2932();
            this.field3477 = arg0.method2932();
            this.field3475 = arg0.method2930();
            int var11 = arg0.method2930();
            this.field3460 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3460[var12] = arg0.method2932();
            }
        } else if (arg1 == 81) {
            this.field3450 = arg0.method2930() * 256;
        } else if (arg1 == 82) {
            this.field3458 = arg0.method2932();
        } else if (arg1 == 249) {
            this.field3468 = class250.method2688(arg0, this.field3468);
        }
    }

    @ObfuscatedName("if.v(IB)Z")
    public final boolean method4233(int arg0) {
        if (this.field3439 != null) {
            for (int var4 = 0; var4 < this.field3439.length; var4++) {
                if (this.field3439[var4] == arg0) {
                    return Statics.field3442.method3838(this.field3438[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3438 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3438.length; var3++) {
                var2 &= Statics.field3442.method3838(this.field3438[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("if.t(I)Z")
    public final boolean method4227() {
        if (this.field3438 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3438.length; var2++) {
            var1 &= Statics.field3442.method3838(this.field3438[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("if.p(II[[IIIIB)Leq;")
    public final class142 method4247(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3439 == null) {
            var7 = (long) ((this.field3437 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3437 << 10) + (arg0 << 3) + arg1);
        }
        class142 var9 = (class142) field3434.method3308(var7);
        if (var9 == null) {
            class128 var10 = this.method4231(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3467) {
                var10.field1811 = (short) (this.field3455 + 64);
                var10.field1783 = (short) (this.field3435 * 25 + 768);
                var10.method2245();
                var9 = var10;
            } else {
                var9 = var10.method2271(this.field3455 + 64, this.field3435 * 25 + 768, -50, -10, -50);
            }
            field3434.method3316(var9, var7);
        }
        if (this.field3467) {
            var9 = ((class128) var9).method2233();
        }
        if (this.field3450 >= 0) {
            if (var9 instanceof class134) {
                var9 = ((class134) var9).method2318(arg2, arg3, arg4, arg5, true, this.field3450);
            } else if (var9 instanceof class128) {
                var9 = ((class128) var9).method2234(arg2, arg3, arg4, arg5, true, this.field3450);
            }
        }
        return var9;
    }

    @ObfuscatedName("if.l(II[[IIIII)Lew;")
    public final class134 method4229(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3439 == null) {
            var7 = (long) ((this.field3437 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3437 << 10) + (arg0 << 3) + arg1);
        }
        class134 var9 = (class134) field3465.method3308(var7);
        if (var9 == null) {
            class128 var10 = this.method4231(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2271(this.field3455 + 64, this.field3435 * 25 + 768, -50, -10, -50);
            field3465.method3316(var9, var7);
        }
        if (this.field3450 >= 0) {
            var9 = var9.method2318(arg2, arg3, arg4, arg5, true, this.field3450);
        }
        return var9;
    }

    @ObfuscatedName("if.a(II[[IIIILje;II)Lew;")
    public final class134 method4230(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class261 arg6, int arg7) {
        long var9;
        if (this.field3439 == null) {
            var9 = (long) ((this.field3437 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3437 << 10) + (arg0 << 3) + arg1);
        }
        class134 var11 = (class134) field3465.method3308(var9);
        if (var11 == null) {
            class128 var12 = this.method4231(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2271(this.field3455 + 64, this.field3435 * 25 + 768, -50, -10, -50);
            field3465.method3316(var11, var9);
        }
        if (arg6 == null && this.field3450 == -1) {
            return var11;
        }
        class134 var13;
        if (arg6 == null) {
            var13 = var11.method2319(true);
        } else {
            var13 = arg6.method4396(var11, arg7, arg1);
        }
        if (this.field3450 >= 0) {
            var13 = var13.method2318(arg2, arg3, arg4, arg5, false, this.field3450);
        }
        return var13;
    }

    @ObfuscatedName("if.k(III)Ldf;")
    public final class128 method4231(int arg0, int arg1) {
        class128 var3 = null;
        if (this.field3439 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3438 == null) {
                return null;
            }
            boolean var4 = this.field3446;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3438.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3438[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class128) field3479.method3308((long) var7);
                if (var3 == null) {
                    var3 = class128.method2227(Statics.field3442, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2243();
                    }
                    field3479.method3316(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3436[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class128(field3436, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3439.length; var9++) {
                if (this.field3439[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3438[var8];
            boolean var11 = this.field3446 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class128) field3479.method3308((long) var10);
            if (var3 == null) {
                var3 = class128.method2227(Statics.field3442, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2243();
                }
                field3479.method3316(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3463 == 128 && this.field3476 == 128 && this.field3464 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3449 == 0 && this.field3466 == 0 && this.field3456 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class128 var14 = new class128(var3, arg1 == 0 && !var12 && !var13, this.field3441 == null, this.field3443 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2239(256);
            var14.method2240(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2236();
        } else if (var15 == 2) {
            var14.method2266();
        } else if (var15 == 3) {
            var14.method2296();
        }
        if (this.field3441 != null) {
            for (int var16 = 0; var16 < this.field3441.length; var16++) {
                var14.method2289(this.field3441[var16], this.field3478[var16]);
            }
        }
        if (this.field3443 != null) {
            for (int var17 = 0; var17 < this.field3443.length; var17++) {
                var14.method2295(this.field3443[var17], this.field3474[var17]);
            }
        }
        if (var12) {
            var14.method2294(this.field3463, this.field3476, this.field3464);
        }
        if (var13) {
            var14.method2240(this.field3449, this.field3466, this.field3456);
        }
        return var14;
    }

    @ObfuscatedName("if.b(S)Lif;")
    public final class256 method4253() {
        int var1 = -1;
        if (this.field3472 != -1) {
            var1 = class212.method1417(this.field3472);
        } else if (this.field3473 != -1) {
            var1 = class212.field2597[this.field3473];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3471.length - 1) {
            var2 = this.field3471[var1];
        } else {
            var2 = this.field3471[this.field3471.length - 1];
        }
        return var2 == -1 ? null : Statics.method564(var2);
    }

    @ObfuscatedName("if.x(III)I")
    public int method4232(int arg0, int arg1) {
        return class250.method2899(this.field3468, arg0, arg1);
    }

    @ObfuscatedName("if.o(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4258(int arg0, String arg1) {
        return Statics.method4095(this.field3468, arg0, arg1);
    }

    @ObfuscatedName("if.j(I)Z")
    public boolean method4267() {
        if (this.field3471 == null) {
            return this.field3433 != -1 || this.field3460 != null;
        }
        for (int var1 = 0; var1 < this.field3471.length; var1++) {
            if (this.field3471[var1] != -1) {
                class256 var2 = Statics.method564(this.field3471[var1]);
                if (var2.field3433 != -1 || var2.field3460 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
