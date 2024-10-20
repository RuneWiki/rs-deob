package deob;

@ObfuscatedName("iv")
public class class256 extends class195 {

    @ObfuscatedName("iv.w")
    public static boolean field3456 = false;

    @ObfuscatedName("iv.o")
    public static class190 field3438 = new class190(4096);

    @ObfuscatedName("iv.g")
    public static class190 field3439 = new class190(500);

    @ObfuscatedName("iv.v")
    public static class190 field3446 = new class190(30);

    @ObfuscatedName("iv.p")
    public static class190 field3441 = new class190(30);

    @ObfuscatedName("iv.e")
    public static class126[] field3442 = new class126[4];

    @ObfuscatedName("iv.d")
    public int field3443;

    @ObfuscatedName("iv.x")
    public int[] field3451;

    @ObfuscatedName("iv.z")
    public int[] field3482;

    @ObfuscatedName("iv.n")
    public String field3435 = "null";

    @ObfuscatedName("iv.u")
    public short[] field3470;

    @ObfuscatedName("iv.t")
    public short[] field3448;

    @ObfuscatedName("iv.a")
    public short[] field3449;

    @ObfuscatedName("iv.i")
    public short[] field3467;

    @ObfuscatedName("iv.h")
    public int field3445 = 1;

    @ObfuscatedName("iv.b")
    public int field3452 = 1;

    @ObfuscatedName("iv.j")
    public int field3453 = 2;

    @ObfuscatedName("iv.y")
    public boolean field3454 = true;

    @ObfuscatedName("iv.k")
    public int field3455 = -1;

    @ObfuscatedName("iv.c")
    public int field3447 = -1;

    @ObfuscatedName("iv.r")
    public boolean field3457 = false;

    @ObfuscatedName("iv.m")
    public boolean field3458 = false;

    @ObfuscatedName("iv.l")
    public int field3440 = -1;

    @ObfuscatedName("iv.f")
    public int field3475 = 16;

    @ObfuscatedName("iv.ap")
    public int field3461 = 0;

    @ObfuscatedName("iv.af")
    public int field3460 = 0;

    @ObfuscatedName("iv.aa")
    public String[] field3463 = new String[5];

    @ObfuscatedName("iv.ay")
    public int field3464 = -1;

    @ObfuscatedName("iv.aw")
    public int field3465 = -1;

    @ObfuscatedName("iv.az")
    public boolean field3466 = false;

    @ObfuscatedName("iv.at")
    public boolean field3450 = true;

    @ObfuscatedName("iv.ao")
    public int field3468 = 128;

    @ObfuscatedName("iv.aq")
    public int field3469 = 128;

    @ObfuscatedName("iv.ax")
    public int field3462 = 128;

    @ObfuscatedName("iv.av")
    public int field3471 = 0;

    @ObfuscatedName("iv.al")
    public int field3472 = 0;

    @ObfuscatedName("iv.ae")
    public int field3473 = 0;

    @ObfuscatedName("iv.ab")
    public boolean field3474 = false;

    @ObfuscatedName("iv.aj")
    public boolean field3483 = false;

    @ObfuscatedName("iv.ac")
    public int field3476 = -1;

    @ObfuscatedName("iv.ad")
    public int[] field3477;

    @ObfuscatedName("iv.am")
    public int field3478 = -1;

    @ObfuscatedName("iv.ah")
    public int field3479 = -1;

    @ObfuscatedName("iv.ak")
    public int field3480 = -1;

    @ObfuscatedName("iv.ar")
    public int field3481 = 0;

    @ObfuscatedName("iv.ag")
    public int field3444 = 0;

    @ObfuscatedName("iv.ai")
    public int field3459 = 0;

    @ObfuscatedName("iv.au")
    public int[] field3484;

    @ObfuscatedName("iv.an")
    public class187 field3485;

    @ObfuscatedName("cj.w(Lip;Lip;ZI)V")
    public static void method1556(class236 arg0, class236 arg1, boolean arg2) {
        Statics.field3436 = arg0;
        Statics.field3437 = arg1;
        field3456 = arg2;
    }

    @ObfuscatedName("fw.s(II)Liv;")
    public static class256 method2861(int arg0) {
        class256 var1 = (class256) field3438.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3436.method3876(6, arg0);
        class256 var3 = new class256();
        var3.field3443 = arg0;
        if (var2 != null) {
            var3.method4309(new class174(var2));
        }
        var3.method4270();
        if (var3.field3483) {
            var3.field3453 = 0;
            var3.field3454 = false;
        }
        field3438.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.q(I)V")
    public void method4270() {
        if (this.field3455 == -1) {
            this.field3455 = 0;
            if (this.field3451 != null && (this.field3482 == null || this.field3482[0] == 10)) {
                this.field3455 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3463[var1] != null) {
                    this.field3455 = 1;
                }
            }
        }
        if (this.field3476 == -1) {
            this.field3476 = this.field3453 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("iv.o(Lfz;I)V")
    public void method4309(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4269(arg0, var2);
        }
    }

    @ObfuscatedName("iv.g(Lfz;IB)V")
    public void method4269(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2971();
            if (var3 > 0) {
                if (this.field3451 == null || field3456) {
                    this.field3482 = new int[var3];
                    this.field3451 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3451[var4] = arg0.method3178();
                        this.field3482[var4] = arg0.method2971();
                    }
                } else {
                    arg0.field2390 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3435 = arg0.method3111();
        } else if (arg1 == 5) {
            int var5 = arg0.method2971();
            if (var5 > 0) {
                if (this.field3451 == null || field3456) {
                    this.field3482 = null;
                    this.field3451 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3451[var6] = arg0.method3178();
                    }
                } else {
                    arg0.field2390 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3445 = arg0.method2971();
        } else if (arg1 == 15) {
            this.field3452 = arg0.method2971();
        } else if (arg1 == 17) {
            this.field3453 = 0;
            this.field3454 = false;
        } else if (arg1 == 18) {
            this.field3454 = false;
        } else if (arg1 == 19) {
            this.field3455 = arg0.method2971();
        } else if (arg1 == 21) {
            this.field3447 = 0;
        } else if (arg1 == 22) {
            this.field3457 = true;
        } else if (arg1 == 23) {
            this.field3458 = true;
        } else if (arg1 == 24) {
            this.field3440 = arg0.method3178();
            if (this.field3440 == 65535) {
                this.field3440 = -1;
            }
        } else if (arg1 == 27) {
            this.field3453 = 1;
        } else if (arg1 == 28) {
            this.field3475 = arg0.method2971();
        } else if (arg1 == 29) {
            this.field3461 = arg0.method2972();
        } else if (arg1 == 39) {
            this.field3460 = arg0.method2972() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3463[arg1 - 30] = arg0.method3111();
            if (this.field3463[arg1 - 30].equalsIgnoreCase(class226.field2857)) {
                this.field3463[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2971();
            this.field3470 = new short[var7];
            this.field3448 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3470[var8] = (short) arg0.method3178();
                this.field3448[var8] = (short) arg0.method3178();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2971();
            this.field3449 = new short[var9];
            this.field3467 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3449[var10] = (short) arg0.method3178();
                this.field3467[var10] = (short) arg0.method3178();
            }
        } else if (arg1 == 62) {
            this.field3466 = true;
        } else if (arg1 == 64) {
            this.field3450 = false;
        } else if (arg1 == 65) {
            this.field3468 = arg0.method3178();
        } else if (arg1 == 66) {
            this.field3469 = arg0.method3178();
        } else if (arg1 == 67) {
            this.field3462 = arg0.method3178();
        } else if (arg1 == 68) {
            this.field3465 = arg0.method3178();
        } else if (arg1 == 69) {
            arg0.method2971();
        } else if (arg1 == 70) {
            this.field3471 = arg0.method2974();
        } else if (arg1 == 71) {
            this.field3472 = arg0.method2974();
        } else if (arg1 == 72) {
            this.field3473 = arg0.method2974();
        } else if (arg1 == 73) {
            this.field3474 = true;
        } else if (arg1 == 74) {
            this.field3483 = true;
        } else if (arg1 == 75) {
            this.field3476 = arg0.method2971();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3478 = arg0.method3178();
            if (this.field3478 == 65535) {
                this.field3478 = -1;
            }
            this.field3479 = arg0.method3178();
            if (this.field3479 == 65535) {
                this.field3479 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3178();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2971();
            this.field3477 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3477[var15] = arg0.method3178();
                if (this.field3477[var15] == 65535) {
                    this.field3477[var15] = -1;
                }
            }
            this.field3477[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3480 = arg0.method3178();
            this.field3481 = arg0.method2971();
        } else if (arg1 == 79) {
            this.field3444 = arg0.method3178();
            this.field3459 = arg0.method3178();
            this.field3481 = arg0.method2971();
            int var11 = arg0.method2971();
            this.field3484 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3484[var12] = arg0.method3178();
            }
        } else if (arg1 == 81) {
            this.field3447 = arg0.method2971() * 256;
        } else if (arg1 == 82) {
            this.field3464 = arg0.method3178();
        } else if (arg1 == 249) {
            this.field3485 = class250.method2227(arg0, this.field3485);
        }
    }

    @ObfuscatedName("iv.v(IB)Z")
    public final boolean method4300(int arg0) {
        if (this.field3482 != null) {
            for (int var4 = 0; var4 < this.field3482.length; var4++) {
                if (this.field3482[var4] == arg0) {
                    return Statics.field3437.method3878(this.field3451[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3451 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3451.length; var3++) {
                var2 &= Statics.field3437.method3878(this.field3451[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iv.p(I)Z")
    public final boolean method4274() {
        if (this.field3451 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3451.length; var2++) {
            var1 &= Statics.field3437.method3878(this.field3451[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("iv.e(II[[IIIII)Len;")
    public final class140 method4275(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3482 == null) {
            var7 = (long) ((this.field3443 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3443 << 10) + (arg0 << 3) + arg1);
        }
        class140 var9 = (class140) field3446.method3357(var7);
        if (var9 == null) {
            class126 var10 = this.method4278(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3457) {
                var10.field1817 = (short) (this.field3461 + 64);
                var10.field1794 = (short) (this.field3460 + 768);
                var10.method2314();
                var9 = var10;
            } else {
                var9 = var10.method2275(this.field3461 + 64, this.field3460 + 768, -50, -10, -50);
            }
            field3446.method3371(var9, var7);
        }
        if (this.field3457) {
            var9 = ((class126) var9).method2304();
        }
        if (this.field3447 >= 0) {
            if (var9 instanceof class132) {
                var9 = ((class132) var9).method2379(arg2, arg3, arg4, arg5, true, this.field3447);
            } else if (var9 instanceof class126) {
                var9 = ((class126) var9).method2260(arg2, arg3, arg4, arg5, true, this.field3447);
            }
        }
        return var9;
    }

    @ObfuscatedName("iv.d(II[[IIIII)Leh;")
    public final class132 method4276(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3482 == null) {
            var7 = (long) ((this.field3443 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3443 << 10) + (arg0 << 3) + arg1);
        }
        class132 var9 = (class132) field3441.method3357(var7);
        if (var9 == null) {
            class126 var10 = this.method4278(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2275(this.field3461 + 64, this.field3460 + 768, -50, -10, -50);
            field3441.method3371(var9, var7);
        }
        if (this.field3447 >= 0) {
            var9 = var9.method2379(arg2, arg3, arg4, arg5, true, this.field3447);
        }
        return var9;
    }

    @ObfuscatedName("iv.x(II[[IIIILjt;II)Leh;")
    public final class132 method4311(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class261 arg6, int arg7) {
        long var9;
        if (this.field3482 == null) {
            var9 = (long) ((this.field3443 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3443 << 10) + (arg0 << 3) + arg1);
        }
        class132 var11 = (class132) field3441.method3357(var9);
        if (var11 == null) {
            class126 var12 = this.method4278(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2275(this.field3461 + 64, this.field3460 + 768, -50, -10, -50);
            field3441.method3371(var11, var9);
        }
        if (arg6 == null && this.field3447 == -1) {
            return var11;
        }
        class132 var13;
        if (arg6 == null) {
            var13 = var11.method2428(true);
        } else {
            var13 = arg6.method4448(var11, arg7, arg1);
        }
        if (this.field3447 >= 0) {
            var13 = var13.method2379(arg2, arg3, arg4, arg5, false, this.field3447);
        }
        return var13;
    }

    @ObfuscatedName("iv.u(III)Ldo;")
    public final class126 method4278(int arg0, int arg1) {
        class126 var3 = null;
        if (this.field3482 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3451 == null) {
                return null;
            }
            boolean var4 = this.field3466;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3451.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3451[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class126) field3439.method3357((long) var7);
                if (var3 == null) {
                    var3 = class126.method2334(Statics.field3437, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2269();
                    }
                    field3439.method3371(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3442[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class126(field3442, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3482.length; var9++) {
                if (this.field3482[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3451[var8];
            boolean var11 = this.field3466 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class126) field3439.method3357((long) var10);
            if (var3 == null) {
                var3 = class126.method2334(Statics.field3437, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2269();
                }
                field3439.method3371(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3468 == 128 && this.field3469 == 128 && this.field3462 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3471 == 0 && this.field3472 == 0 && this.field3473 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class126 var14 = new class126(var3, arg1 == 0 && !var12 && !var13, this.field3470 == null, this.field3449 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2265(256);
            var14.method2263(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2262();
        } else if (var15 == 2) {
            var14.method2274();
        } else if (var15 == 3) {
            var14.method2264();
        }
        if (this.field3470 != null) {
            for (int var16 = 0; var16 < this.field3470.length; var16++) {
                var14.method2267(this.field3470[var16], this.field3448[var16]);
            }
        }
        if (this.field3449 != null) {
            for (int var17 = 0; var17 < this.field3449.length; var17++) {
                var14.method2295(this.field3449[var17], this.field3467[var17]);
            }
        }
        if (var12) {
            var14.method2270(this.field3468, this.field3469, this.field3462);
        }
        if (var13) {
            var14.method2263(this.field3471, this.field3472, this.field3473);
        }
        return var14;
    }

    @ObfuscatedName("iv.i(I)Liv;")
    public final class256 method4279() {
        int var1 = -1;
        if (this.field3478 != -1) {
            var1 = Statics.method1604(this.field3478);
        } else if (this.field3479 != -1) {
            var1 = class212.field2599[this.field3479];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3477.length - 1) {
            var2 = this.field3477[var1];
        } else {
            var2 = this.field3477[this.field3477.length - 1];
        }
        return var2 == -1 ? null : method2861(var2);
    }

    @ObfuscatedName("iv.h(III)I")
    public int method4295(int arg0, int arg1) {
        return class250.method3857(this.field3485, arg0, arg1);
    }

    @ObfuscatedName("iv.b(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4294(int arg0, String arg1) {
        return class250.method3625(this.field3485, arg0, arg1);
    }

    @ObfuscatedName("iv.j(I)Z")
    public boolean method4280() {
        if (this.field3477 == null) {
            return this.field3480 != -1 || this.field3484 != null;
        }
        for (int var1 = 0; var1 < this.field3477.length; var1++) {
            if (this.field3477[var1] != -1) {
                class256 var2 = method2861(this.field3477[var1]);
                if (var2.field3480 != -1 || var2.field3484 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
