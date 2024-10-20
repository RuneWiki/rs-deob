package deob;

@ObfuscatedName("jj")
public class class283 extends class219 {

    @ObfuscatedName("jj.c")
    public static boolean field3617 = false;

    @ObfuscatedName("jj.j")
    public static class213 field3601 = new class213(4096);

    @ObfuscatedName("jj.k")
    public static class213 field3610 = new class213(500);

    @ObfuscatedName("jj.x")
    public static class213 field3591 = new class213(30);

    @ObfuscatedName("jj.z")
    public static class213 field3592 = new class213(30);

    @ObfuscatedName("jj.p")
    public static class126[] field3604 = new class126[4];

    @ObfuscatedName("jj.w")
    public int field3594;

    @ObfuscatedName("jj.r")
    public int[] field3627;

    @ObfuscatedName("jj.d")
    public int[] field3596;

    @ObfuscatedName("jj.a")
    public String field3597 = class252.field3012;

    @ObfuscatedName("jj.e")
    public short[] field3598;

    @ObfuscatedName("jj.f")
    public short[] field3599;

    @ObfuscatedName("jj.l")
    public short[] field3600;

    @ObfuscatedName("jj.m")
    public short[] field3607;

    @ObfuscatedName("jj.b")
    public int field3602 = 1;

    @ObfuscatedName("jj.h")
    public int field3603 = 1;

    @ObfuscatedName("jj.t")
    public int field3587 = 2;

    @ObfuscatedName("jj.v")
    public boolean field3605 = true;

    @ObfuscatedName("jj.n")
    public int field3613 = -1;

    @ObfuscatedName("jj.u")
    public int field3606 = -1;

    @ObfuscatedName("jj.q")
    public boolean field3608 = false;

    @ObfuscatedName("jj.g")
    public boolean field3595 = false;

    @ObfuscatedName("jj.y")
    public int field3593 = -1;

    @ObfuscatedName("jj.s")
    public int field3611 = 16;

    @ObfuscatedName("jj.ac")
    public int field3612 = 0;

    @ObfuscatedName("jj.ap")
    public int field3589 = 0;

    @ObfuscatedName("jj.al")
    public String[] field3614 = new String[5];

    @ObfuscatedName("jj.ai")
    public int field3615 = -1;

    @ObfuscatedName("jj.ab")
    public int field3616 = -1;

    @ObfuscatedName("jj.ak")
    public boolean field3609 = false;

    @ObfuscatedName("jj.as")
    public boolean field3632 = true;

    @ObfuscatedName("jj.aa")
    public int field3618 = 128;

    @ObfuscatedName("jj.ah")
    public int field3633 = 128;

    @ObfuscatedName("jj.ao")
    public int field3621 = 128;

    @ObfuscatedName("jj.am")
    public int field3622 = 0;

    @ObfuscatedName("jj.aq")
    public int field3625 = 0;

    @ObfuscatedName("jj.ae")
    public int field3624 = 0;

    @ObfuscatedName("jj.af")
    public boolean field3620 = false;

    @ObfuscatedName("jj.aw")
    public boolean field3626 = false;

    @ObfuscatedName("jj.ax")
    public int field3619 = -1;

    @ObfuscatedName("jj.ag")
    public int[] field3628;

    @ObfuscatedName("jj.ay")
    public int field3629 = -1;

    @ObfuscatedName("jj.ad")
    public int field3630 = -1;

    @ObfuscatedName("jj.at")
    public int field3631 = -1;

    @ObfuscatedName("jj.av")
    public int field3623 = 0;

    @ObfuscatedName("jj.az")
    public int field3590 = 0;

    @ObfuscatedName("jj.aj")
    public int field3634 = 0;

    @ObfuscatedName("jj.ar")
    public int[] field3635;

    @ObfuscatedName("jj.au")
    public class210 field3636;

    @ObfuscatedName("jv.c(II)Ljj;")
    public static class283 method4185(int arg0) {
        class283 var1 = (class283) field3601.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3299.method4190(6, arg0);
        class283 var3 = new class283();
        var3.field3594 = arg0;
        if (var2 != null) {
            var3.method4650(new class195(var2));
        }
        var3.method4626();
        if (var3.field3626) {
            var3.field3587 = 0;
            var3.field3605 = false;
        }
        field3601.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.i(I)V")
    public void method4626() {
        if (this.field3613 == -1) {
            this.field3613 = 0;
            if (this.field3627 != null && (this.field3596 == null || this.field3596[0] == 10)) {
                this.field3613 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3614[var1] != null) {
                    this.field3613 = 1;
                }
            }
        }
        if (this.field3619 == -1) {
            this.field3619 = this.field3587 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jj.o(Lgp;B)V")
    public void method4650(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4628(arg0, var2);
        }
    }

    @ObfuscatedName("jj.j(Lgp;II)V")
    public void method4628(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3429();
            if (var3 > 0) {
                if (this.field3627 == null || field3617) {
                    this.field3596 = new int[var3];
                    this.field3627 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3627[var4] = arg0.method3218();
                        this.field3596[var4] = arg0.method3429();
                    }
                } else {
                    arg0.field2566 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3597 = arg0.method3427();
        } else if (arg1 == 5) {
            int var5 = arg0.method3429();
            if (var5 > 0) {
                if (this.field3627 == null || field3617) {
                    this.field3596 = null;
                    this.field3627 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3627[var6] = arg0.method3218();
                    }
                } else {
                    arg0.field2566 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3602 = arg0.method3429();
        } else if (arg1 == 15) {
            this.field3603 = arg0.method3429();
        } else if (arg1 == 17) {
            this.field3587 = 0;
            this.field3605 = false;
        } else if (arg1 == 18) {
            this.field3605 = false;
        } else if (arg1 == 19) {
            this.field3613 = arg0.method3429();
        } else if (arg1 == 21) {
            this.field3606 = 0;
        } else if (arg1 == 22) {
            this.field3608 = true;
        } else if (arg1 == 23) {
            this.field3595 = true;
        } else if (arg1 == 24) {
            this.field3593 = arg0.method3218();
            if (this.field3593 == 65535) {
                this.field3593 = -1;
            }
        } else if (arg1 == 27) {
            this.field3587 = 1;
        } else if (arg1 == 28) {
            this.field3611 = arg0.method3429();
        } else if (arg1 == 29) {
            this.field3612 = arg0.method3226();
        } else if (arg1 == 39) {
            this.field3589 = arg0.method3226();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3614[arg1 - 30] = arg0.method3427();
            if (this.field3614[arg1 - 30].equalsIgnoreCase(class252.field3015)) {
                this.field3614[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3429();
            this.field3598 = new short[var7];
            this.field3599 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3598[var8] = (short) arg0.method3218();
                this.field3599[var8] = (short) arg0.method3218();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3429();
            this.field3600 = new short[var9];
            this.field3607 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3600[var10] = (short) arg0.method3218();
                this.field3607[var10] = (short) arg0.method3218();
            }
        } else if (arg1 == 62) {
            this.field3609 = true;
        } else if (arg1 == 64) {
            this.field3632 = false;
        } else if (arg1 == 65) {
            this.field3618 = arg0.method3218();
        } else if (arg1 == 66) {
            this.field3633 = arg0.method3218();
        } else if (arg1 == 67) {
            this.field3621 = arg0.method3218();
        } else if (arg1 == 68) {
            this.field3616 = arg0.method3218();
        } else if (arg1 == 69) {
            arg0.method3429();
        } else if (arg1 == 70) {
            this.field3622 = arg0.method3303();
        } else if (arg1 == 71) {
            this.field3625 = arg0.method3303();
        } else if (arg1 == 72) {
            this.field3624 = arg0.method3303();
        } else if (arg1 == 73) {
            this.field3620 = true;
        } else if (arg1 == 74) {
            this.field3626 = true;
        } else if (arg1 == 75) {
            this.field3619 = arg0.method3429();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3629 = arg0.method3218();
            if (this.field3629 == 65535) {
                this.field3629 = -1;
            }
            this.field3630 = arg0.method3218();
            if (this.field3630 == 65535) {
                this.field3630 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3218();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3429();
            this.field3628 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3628[var15] = arg0.method3218();
                if (this.field3628[var15] == 65535) {
                    this.field3628[var15] = -1;
                }
            }
            this.field3628[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3631 = arg0.method3218();
            this.field3623 = arg0.method3429();
        } else if (arg1 == 79) {
            this.field3590 = arg0.method3218();
            this.field3634 = arg0.method3218();
            this.field3623 = arg0.method3429();
            int var11 = arg0.method3429();
            this.field3635 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3635[var12] = arg0.method3218();
            }
        } else if (arg1 == 81) {
            this.field3606 = arg0.method3429() * 256;
        } else if (arg1 == 82) {
            this.field3615 = arg0.method3218();
        } else if (arg1 == 249) {
            this.field3636 = class277.method4160(arg0, this.field3636);
        }
    }

    @ObfuscatedName("jj.k(II)Z")
    public final boolean method4629(int arg0) {
        if (this.field3596 != null) {
            for (int var4 = 0; var4 < this.field3596.length; var4++) {
                if (this.field3596[var4] == arg0) {
                    return Statics.field3588.method4209(this.field3627[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3627 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3627.length; var3++) {
                var2 &= Statics.field3588.method4209(this.field3627[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jj.x(I)Z")
    public final boolean method4630() {
        if (this.field3627 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3627.length; var2++) {
            var1 &= Statics.field3588.method4209(this.field3627[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jj.z(II[[IIIII)Lek;")
    public final class140 method4658(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3596 == null) {
            var7 = (long) ((this.field3594 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3594 << 10) + (arg0 << 3) + arg1);
        }
        class140 var9 = (class140) field3591.method3625(var7);
        if (var9 == null) {
            class126 var10 = this.method4634(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3608) {
                var10.field1750 = (short) (this.field3612 + 64);
                var10.field1747 = (short) (this.field3589 * 25 + 768);
                var10.method2387();
                var9 = var10;
            } else {
                var9 = var10.method2384(this.field3612 + 64, this.field3589 * 25 + 768, -50, -10, -50);
            }
            field3591.method3628(var9, var7);
        }
        if (this.field3608) {
            var9 = ((class126) var9).method2375();
        }
        if (this.field3606 >= 0) {
            if (var9 instanceof class132) {
                var9 = ((class132) var9).method2470(arg2, arg3, arg4, arg5, true, this.field3606);
            } else if (var9 instanceof class126) {
                var9 = ((class126) var9).method2376(arg2, arg3, arg4, arg5, true, this.field3606);
            }
        }
        return var9;
    }

    @ObfuscatedName("jj.p(II[[IIIII)Led;")
    public final class132 method4632(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3596 == null) {
            var7 = (long) ((this.field3594 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3594 << 10) + (arg0 << 3) + arg1);
        }
        class132 var9 = (class132) field3592.method3625(var7);
        if (var9 == null) {
            class126 var10 = this.method4634(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2384(this.field3612 + 64, this.field3589 * 25 + 768, -50, -10, -50);
            field3592.method3628(var9, var7);
        }
        if (this.field3606 >= 0) {
            var9 = var9.method2470(arg2, arg3, arg4, arg5, true, this.field3606);
        }
        return var9;
    }

    @ObfuscatedName("jj.w(II[[IIIILkn;II)Led;")
    public final class132 method4633(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class288 arg6, int arg7) {
        long var9;
        if (this.field3596 == null) {
            var9 = (long) ((this.field3594 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3594 << 10) + (arg0 << 3) + arg1);
        }
        class132 var11 = (class132) field3592.method3625(var9);
        if (var11 == null) {
            class126 var12 = this.method4634(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2384(this.field3612 + 64, this.field3589 * 25 + 768, -50, -10, -50);
            field3592.method3628(var11, var9);
        }
        if (arg6 == null && this.field3606 == -1) {
            return var11;
        }
        class132 var13;
        if (arg6 == null) {
            var13 = var11.method2551(true);
        } else {
            var13 = arg6.method4803(var11, arg7, arg1);
        }
        if (this.field3606 >= 0) {
            var13 = var13.method2470(arg2, arg3, arg4, arg5, false, this.field3606);
        }
        return var13;
    }

    @ObfuscatedName("jj.r(III)Ldj;")
    public final class126 method4634(int arg0, int arg1) {
        class126 var3 = null;
        if (this.field3596 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3627 == null) {
                return null;
            }
            boolean var4 = this.field3609;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3627.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3627[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class126) field3610.method3625((long) var7);
                if (var3 == null) {
                    var3 = class126.method2371(Statics.field3588, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2414();
                    }
                    field3610.method3628(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3604[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class126(field3604, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3596.length; var9++) {
                if (this.field3596[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3627[var8];
            boolean var11 = this.field3609 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class126) field3610.method3625((long) var10);
            if (var3 == null) {
                var3 = class126.method2371(Statics.field3588, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2414();
                }
                field3610.method3628(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3618 == 128 && this.field3633 == 128 && this.field3621 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3622 == 0 && this.field3625 == 0 && this.field3624 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class126 var14 = new class126(var3, arg1 == 0 && !var12 && !var13, this.field3598 == null, this.field3600 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2381(256);
            var14.method2435(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2378();
        } else if (var15 == 2) {
            var14.method2379();
        } else if (var15 == 3) {
            var14.method2380();
        }
        if (this.field3598 != null) {
            for (int var16 = 0; var16 < this.field3598.length; var16++) {
                var14.method2383(this.field3598[var16], this.field3599[var16]);
            }
        }
        if (this.field3600 != null) {
            for (int var17 = 0; var17 < this.field3600.length; var17++) {
                var14.method2448(this.field3600[var17], this.field3607[var17]);
            }
        }
        if (var12) {
            var14.method2432(this.field3618, this.field3633, this.field3621);
        }
        if (var13) {
            var14.method2435(this.field3622, this.field3625, this.field3624);
        }
        return var14;
    }

    @ObfuscatedName("jj.d(B)Ljj;")
    public final class283 method4635() {
        int var1 = -1;
        if (this.field3629 != -1) {
            var1 = class238.method1710(this.field3629);
        } else if (this.field3630 != -1) {
            var1 = class238.field2771[this.field3630];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3628.length - 1) {
            var2 = this.field3628[var1];
        } else {
            var2 = this.field3628[this.field3628.length - 1];
        }
        return var2 == -1 ? null : method4185(var2);
    }

    @ObfuscatedName("jj.a(IIB)I")
    public int method4636(int arg0, int arg1) {
        return class277.method180(this.field3636, arg0, arg1);
    }

    @ObfuscatedName("jj.b(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4637(int arg0, String arg1) {
        return class277.method2942(this.field3636, arg0, arg1);
    }

    @ObfuscatedName("jj.h(B)Z")
    public boolean method4638() {
        if (this.field3628 == null) {
            return this.field3631 != -1 || this.field3635 != null;
        }
        for (int var1 = 0; var1 < this.field3628.length; var1++) {
            if (this.field3628[var1] != -1) {
                class283 var2 = method4185(this.field3628[var1]);
                if (var2.field3631 != -1 || var2.field3635 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
