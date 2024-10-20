package deob;

@ObfuscatedName("jy")
public class class275 extends class214 {

    @ObfuscatedName("jy.a")
    public static boolean field3502 = false;

    @ObfuscatedName("jy.x")
    public static class208 field3479 = new class208(4096);

    @ObfuscatedName("jy.h")
    public static class208 field3456 = new class208(500);

    @ObfuscatedName("jy.f")
    public static class208 field3498 = new class208(30);

    @ObfuscatedName("jy.p")
    public static class208 field3458 = new class208(30);

    @ObfuscatedName("jy.m")
    public static class121[] field3459 = new class121[4];

    @ObfuscatedName("jy.q")
    public int field3477;

    @ObfuscatedName("jy.b")
    public int[] field3499;

    @ObfuscatedName("jy.n")
    public int[] field3485;

    @ObfuscatedName("jy.e")
    public String field3463 = class246.field2885;

    @ObfuscatedName("jy.r")
    public short[] field3470;

    @ObfuscatedName("jy.t")
    public short[] field3465;

    @ObfuscatedName("jy.l")
    public short[] field3466;

    @ObfuscatedName("jy.o")
    public short[] field3467;

    @ObfuscatedName("jy.u")
    public int field3491 = 1;

    @ObfuscatedName("jy.y")
    public int field3469 = 1;

    @ObfuscatedName("jy.k")
    public int field3457 = 2;

    @ObfuscatedName("jy.v")
    public boolean field3462 = true;

    @ObfuscatedName("jy.d")
    public int field3472 = -1;

    @ObfuscatedName("jy.w")
    public int field3473 = -1;

    @ObfuscatedName("jy.i")
    public boolean field3474 = false;

    @ObfuscatedName("jy.c")
    public boolean field3475 = false;

    @ObfuscatedName("jy.j")
    public int field3476 = -1;

    @ObfuscatedName("jy.z")
    public int field3483 = 16;

    @ObfuscatedName("jy.ag")
    public int field3478 = 0;

    @ObfuscatedName("jy.af")
    public int field3461 = 0;

    @ObfuscatedName("jy.ay")
    public String[] field3480 = new String[5];

    @ObfuscatedName("jy.aa")
    public int field3481 = -1;

    @ObfuscatedName("jy.ab")
    public int field3482 = -1;

    @ObfuscatedName("jy.ah")
    public boolean field3487 = false;

    @ObfuscatedName("jy.aw")
    public boolean field3484 = true;

    @ObfuscatedName("jy.an")
    public int field3464 = 128;

    @ObfuscatedName("jy.at")
    public int field3486 = 128;

    @ObfuscatedName("jy.ae")
    public int field3468 = 128;

    @ObfuscatedName("jy.av")
    public int field3488 = 0;

    @ObfuscatedName("jy.au")
    public int field3489 = 0;

    @ObfuscatedName("jy.aj")
    public int field3490 = 0;

    @ObfuscatedName("jy.as")
    public boolean field3471 = false;

    @ObfuscatedName("jy.ar")
    public boolean field3492 = false;

    @ObfuscatedName("jy.ai")
    public int field3493 = -1;

    @ObfuscatedName("jy.aq")
    public int[] field3494;

    @ObfuscatedName("jy.al")
    public int field3495 = -1;

    @ObfuscatedName("jy.az")
    public int field3496 = -1;

    @ObfuscatedName("jy.ac")
    public int field3497 = -1;

    @ObfuscatedName("jy.ao")
    public int field3501 = 0;

    @ObfuscatedName("jy.ad")
    public int field3455 = 0;

    @ObfuscatedName("jy.ax")
    public int field3500 = 0;

    @ObfuscatedName("jy.ap")
    public int[] field3452;

    @ObfuscatedName("jy.ak")
    public class205 field3460;

    @ObfuscatedName("er.a(Liz;Liz;ZI)V")
    public static void method3083(class255 arg0, class255 arg1, boolean arg2) {
        Statics.field3453 = arg0;
        Statics.field3454 = arg1;
        field3502 = arg2;
    }

    @ObfuscatedName("b.s(IB)Ljy;")
    public static class275 method117(int arg0) {
        class275 var1 = (class275) field3479.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3453.method4422(6, arg0);
        class275 var3 = new class275();
        var3.field3477 = arg0;
        if (var2 != null) {
            var3.method4840(new class190(var2));
        }
        var3.method4839();
        if (var3.field3492) {
            var3.field3457 = 0;
            var3.field3462 = false;
        }
        field3479.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.g(S)V")
    public void method4839() {
        if (this.field3472 == -1) {
            this.field3472 = 0;
            if (this.field3499 != null && (this.field3485 == null || this.field3485[0] == 10)) {
                this.field3472 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3480[var1] != null) {
                    this.field3472 = 1;
                }
            }
        }
        if (this.field3493 == -1) {
            this.field3493 = this.field3457 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jy.x(Lgx;I)V")
    public void method4840(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4887(arg0, var2);
        }
    }

    @ObfuscatedName("jy.h(Lgx;II)V")
    public void method4887(class190 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3443();
            if (var3 > 0) {
                if (this.field3499 == null || field3502) {
                    this.field3485 = new int[var3];
                    this.field3499 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3499[var4] = arg0.method3610();
                        this.field3485[var4] = arg0.method3443();
                    }
                } else {
                    arg0.field2419 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3463 = arg0.method3647();
        } else if (arg1 == 5) {
            int var5 = arg0.method3443();
            if (var5 > 0) {
                if (this.field3499 == null || field3502) {
                    this.field3485 = null;
                    this.field3499 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3499[var6] = arg0.method3610();
                    }
                } else {
                    arg0.field2419 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3491 = arg0.method3443();
        } else if (arg1 == 15) {
            this.field3469 = arg0.method3443();
        } else if (arg1 == 17) {
            this.field3457 = 0;
            this.field3462 = false;
        } else if (arg1 == 18) {
            this.field3462 = false;
        } else if (arg1 == 19) {
            this.field3472 = arg0.method3443();
        } else if (arg1 == 21) {
            this.field3473 = 0;
        } else if (arg1 == 22) {
            this.field3474 = true;
        } else if (arg1 == 23) {
            this.field3475 = true;
        } else if (arg1 == 24) {
            this.field3476 = arg0.method3610();
            if (this.field3476 == 65535) {
                this.field3476 = -1;
            }
        } else if (arg1 == 27) {
            this.field3457 = 1;
        } else if (arg1 == 28) {
            this.field3483 = arg0.method3443();
        } else if (arg1 == 29) {
            this.field3478 = arg0.method3599();
        } else if (arg1 == 39) {
            this.field3461 = arg0.method3599() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3480[arg1 - 30] = arg0.method3647();
            if (this.field3480[arg1 - 30].equalsIgnoreCase(class246.field2880)) {
                this.field3480[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3443();
            this.field3470 = new short[var7];
            this.field3465 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3470[var8] = (short) arg0.method3610();
                this.field3465[var8] = (short) arg0.method3610();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3443();
            this.field3466 = new short[var9];
            this.field3467 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3466[var10] = (short) arg0.method3610();
                this.field3467[var10] = (short) arg0.method3610();
            }
        } else if (arg1 == 62) {
            this.field3487 = true;
        } else if (arg1 == 64) {
            this.field3484 = false;
        } else if (arg1 == 65) {
            this.field3464 = arg0.method3610();
        } else if (arg1 == 66) {
            this.field3486 = arg0.method3610();
        } else if (arg1 == 67) {
            this.field3468 = arg0.method3610();
        } else if (arg1 == 68) {
            this.field3482 = arg0.method3610();
        } else if (arg1 == 69) {
            arg0.method3443();
        } else if (arg1 == 70) {
            this.field3488 = arg0.method3458();
        } else if (arg1 == 71) {
            this.field3489 = arg0.method3458();
        } else if (arg1 == 72) {
            this.field3490 = arg0.method3458();
        } else if (arg1 == 73) {
            this.field3471 = true;
        } else if (arg1 == 74) {
            this.field3492 = true;
        } else if (arg1 == 75) {
            this.field3493 = arg0.method3443();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3495 = arg0.method3610();
            if (this.field3495 == 65535) {
                this.field3495 = -1;
            }
            this.field3496 = arg0.method3610();
            if (this.field3496 == 65535) {
                this.field3496 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3610();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3443();
            this.field3494 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3494[var15] = arg0.method3610();
                if (this.field3494[var15] == 65535) {
                    this.field3494[var15] = -1;
                }
            }
            this.field3494[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3497 = arg0.method3610();
            this.field3501 = arg0.method3443();
        } else if (arg1 == 79) {
            this.field3455 = arg0.method3610();
            this.field3500 = arg0.method3610();
            this.field3501 = arg0.method3443();
            int var11 = arg0.method3443();
            this.field3452 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3452[var12] = arg0.method3610();
            }
        } else if (arg1 == 81) {
            this.field3473 = arg0.method3443() * 256;
        } else if (arg1 == 82) {
            this.field3481 = arg0.method3610();
        } else if (arg1 == 249) {
            this.field3460 = class269.method5420(arg0, this.field3460);
        }
    }

    @ObfuscatedName("jy.f(II)Z")
    public final boolean method4863(int arg0) {
        if (this.field3485 != null) {
            for (int var4 = 0; var4 < this.field3485.length; var4++) {
                if (this.field3485[var4] == arg0) {
                    return Statics.field3454.method4424(this.field3499[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3499 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3499.length; var3++) {
                var2 &= Statics.field3454.method4424(this.field3499[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jy.p(B)Z")
    public final boolean method4843() {
        if (this.field3499 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3499.length; var2++) {
            var1 &= Statics.field3454.method4424(this.field3499[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jy.m(II[[IIIII)Lem;")
    public final class135 method4844(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3485 == null) {
            var7 = (long) ((this.field3477 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3477 << 10) + (arg0 << 3) + arg1);
        }
        class135 var9 = (class135) field3498.method3885(var7);
        if (var9 == null) {
            class121 var10 = this.method4847(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3474) {
                var10.field1567 = (short) (this.field3478 + 64);
                var10.field1546 = (short) (this.field3461 + 768);
                var10.method2602();
                var9 = var10;
            } else {
                var9 = var10.method2658(this.field3478 + 64, this.field3461 + 768, -50, -10, -50);
            }
            field3498.method3878(var9, var7);
        }
        if (this.field3474) {
            var9 = ((class121) var9).method2590();
        }
        if (this.field3473 >= 0) {
            if (var9 instanceof class127) {
                var9 = ((class127) var9).method2677(arg2, arg3, arg4, arg5, true, this.field3473);
            } else if (var9 instanceof class121) {
                var9 = ((class121) var9).method2589(arg2, arg3, arg4, arg5, true, this.field3473);
            }
        }
        return var9;
    }

    @ObfuscatedName("jy.q(II[[IIIIB)Ldv;")
    public final class127 method4845(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3485 == null) {
            var7 = (long) ((this.field3477 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3477 << 10) + (arg0 << 3) + arg1);
        }
        class127 var9 = (class127) field3458.method3885(var7);
        if (var9 == null) {
            class121 var10 = this.method4847(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2658(this.field3478 + 64, this.field3461 + 768, -50, -10, -50);
            field3458.method3878(var9, var7);
        }
        if (this.field3473 >= 0) {
            var9 = var9.method2677(arg2, arg3, arg4, arg5, true, this.field3473);
        }
        return var9;
    }

    @ObfuscatedName("jy.b(II[[IIIILju;II)Ldv;")
    public final class127 method4846(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class280 arg6, int arg7) {
        long var9;
        if (this.field3485 == null) {
            var9 = (long) ((this.field3477 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3477 << 10) + (arg0 << 3) + arg1);
        }
        class127 var11 = (class127) field3458.method3885(var9);
        if (var11 == null) {
            class121 var12 = this.method4847(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2658(this.field3478 + 64, this.field3461 + 768, -50, -10, -50);
            field3458.method3878(var11, var9);
        }
        if (arg6 == null && this.field3473 == -1) {
            return var11;
        }
        class127 var13;
        if (arg6 == null) {
            var13 = var11.method2678(true);
        } else {
            var13 = arg6.method5014(var11, arg7, arg1);
        }
        if (this.field3473 >= 0) {
            var13 = var13.method2677(arg2, arg3, arg4, arg5, false, this.field3473);
        }
        return var13;
    }

    @ObfuscatedName("jy.n(III)Ldk;")
    public final class121 method4847(int arg0, int arg1) {
        class121 var3 = null;
        if (this.field3485 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3499 == null) {
                return null;
            }
            boolean var4 = this.field3487;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3499.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3499[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class121) field3456.method3885((long) var7);
                if (var3 == null) {
                    var3 = class121.method2585(Statics.field3454, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2600();
                    }
                    field3456.method3878(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3459[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class121(field3459, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3485.length; var9++) {
                if (this.field3485[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3499[var8];
            boolean var11 = this.field3487 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class121) field3456.method3885((long) var10);
            if (var3 == null) {
                var3 = class121.method2585(Statics.field3454, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2600();
                }
                field3456.method3878(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3464 == 128 && this.field3486 == 128 && this.field3468 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3488 == 0 && this.field3489 == 0 && this.field3490 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class121 var14 = new class121(var3, arg1 == 0 && !var12 && !var13, this.field3470 == null, this.field3466 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2596(256);
            var14.method2620(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2593();
        } else if (var15 == 2) {
            var14.method2591();
        } else if (var15 == 3) {
            var14.method2595();
        }
        if (this.field3470 != null) {
            for (int var16 = 0; var16 < this.field3470.length; var16++) {
                var14.method2607(this.field3470[var16], this.field3465[var16]);
            }
        }
        if (this.field3466 != null) {
            for (int var17 = 0; var17 < this.field3466.length; var17++) {
                var14.method2656(this.field3466[var17], this.field3467[var17]);
            }
        }
        if (var12) {
            var14.method2601(this.field3464, this.field3486, this.field3468);
        }
        if (var13) {
            var14.method2620(this.field3488, this.field3489, this.field3490);
        }
        return var14;
    }

    @ObfuscatedName("jy.e(I)Ljy;")
    public final class275 method4852() {
        int var1 = -1;
        if (this.field3495 != -1) {
            var1 = class234.method1611(this.field3495);
        } else if (this.field3496 != -1) {
            var1 = class234.field2648[this.field3496];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3494.length - 1) {
            var2 = this.field3494[var1];
        } else {
            var2 = this.field3494[this.field3494.length - 1];
        }
        return var2 == -1 ? null : method117(var2);
    }

    @ObfuscatedName("jy.r(IIB)I")
    public int method4849(int arg0, int arg1) {
        class205 var3 = this.field3460;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class219 var5 = (class219) var3.method3851((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2527;
            }
        }
        return var4;
    }

    @ObfuscatedName("jy.t(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4850(int arg0, String arg1) {
        class205 var3 = this.field3460;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class203 var5 = (class203) var3.method3851((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2483;
            }
        }
        return var4;
    }

    @ObfuscatedName("jy.l(I)Z")
    public boolean method4867() {
        if (this.field3494 == null) {
            return this.field3497 != -1 || this.field3452 != null;
        }
        for (int var1 = 0; var1 < this.field3494.length; var1++) {
            if (this.field3494[var1] != -1) {
                class275 var2 = method117(this.field3494[var1]);
                if (var2.field3497 != -1 || var2.field3452 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
