package deob;

@ObfuscatedName("js")
public class class283 extends class219 {

    @ObfuscatedName("js.g")
    public static boolean field3613 = false;

    @ObfuscatedName("js.z")
    public static class213 field3594 = new class213(4096);

    @ObfuscatedName("js.n")
    public static class213 field3595 = new class213(500);

    @ObfuscatedName("js.l")
    public static class213 field3623 = new class213(30);

    @ObfuscatedName("js.s")
    public static class213 field3597 = new class213(30);

    @ObfuscatedName("js.y")
    public static class126[] field3637 = new class126[4];

    @ObfuscatedName("js.c")
    public int field3599;

    @ObfuscatedName("js.h")
    public int[] field3600;

    @ObfuscatedName("js.i")
    public int[] field3601;

    @ObfuscatedName("js.o")
    public String field3602 = class252.field3028;

    @ObfuscatedName("js.d")
    public short[] field3605;

    @ObfuscatedName("js.r")
    public short[] field3604;

    @ObfuscatedName("js.p")
    public short[] field3611;

    @ObfuscatedName("js.q")
    public short[] field3606;

    @ObfuscatedName("js.f")
    public int field3610 = 1;

    @ObfuscatedName("js.j")
    public int field3608 = 1;

    @ObfuscatedName("js.v")
    public int field3609 = 2;

    @ObfuscatedName("js.u")
    public boolean field3614 = true;

    @ObfuscatedName("js.k")
    public int field3627 = -1;

    @ObfuscatedName("js.w")
    public int field3598 = -1;

    @ObfuscatedName("js.m")
    public boolean field3634 = false;

    @ObfuscatedName("js.a")
    public boolean field3612 = false;

    @ObfuscatedName("js.x")
    public int field3632 = -1;

    @ObfuscatedName("js.t")
    public int field3622 = 16;

    @ObfuscatedName("js.ax")
    public int field3617 = 0;

    @ObfuscatedName("js.ai")
    public int field3618 = 0;

    @ObfuscatedName("js.aj")
    public String[] field3596 = new String[5];

    @ObfuscatedName("js.ac")
    public int field3620 = -1;

    @ObfuscatedName("js.ag")
    public int field3621 = -1;

    @ObfuscatedName("js.ay")
    public boolean field3591 = false;

    @ObfuscatedName("js.as")
    public boolean field3616 = true;

    @ObfuscatedName("js.av")
    public int field3624 = 128;

    @ObfuscatedName("js.ao")
    public int field3625 = 128;

    @ObfuscatedName("js.ak")
    public int field3626 = 128;

    @ObfuscatedName("js.ad")
    public int field3615 = 0;

    @ObfuscatedName("js.az")
    public int field3628 = 0;

    @ObfuscatedName("js.aa")
    public int field3629 = 0;

    @ObfuscatedName("js.ab")
    public boolean field3630 = false;

    @ObfuscatedName("js.al")
    public boolean field3631 = false;

    @ObfuscatedName("js.af")
    public int field3603 = -1;

    @ObfuscatedName("js.ah")
    public int[] field3633;

    @ObfuscatedName("js.au")
    public int field3619 = -1;

    @ObfuscatedName("js.ap")
    public int field3635 = -1;

    @ObfuscatedName("js.at")
    public int field3636 = -1;

    @ObfuscatedName("js.am")
    public int field3607 = 0;

    @ObfuscatedName("js.an")
    public int field3638 = 0;

    @ObfuscatedName("js.ae")
    public int field3639 = 0;

    @ObfuscatedName("js.aw")
    public int[] field3640;

    @ObfuscatedName("js.ar")
    public class210 field3641;

    @ObfuscatedName("cv.g(II)Ljs;")
    public static class283 method1732(int arg0) {
        class283 var1 = (class283) field3594.method3706((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3592.method4294(6, arg0);
        class283 var3 = new class283();
        var3.field3599 = arg0;
        if (var2 != null) {
            var3.method4691(new class195(var2));
        }
        var3.method4728();
        if (var3.field3631) {
            var3.field3609 = 0;
            var3.field3614 = false;
        }
        field3594.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("js.e(I)V")
    public void method4728() {
        if (this.field3627 == -1) {
            this.field3627 = 0;
            if (this.field3600 != null && (this.field3601 == null || this.field3601[0] == 10)) {
                this.field3627 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3596[var1] != null) {
                    this.field3627 = 1;
                }
            }
        }
        if (this.field3603 == -1) {
            this.field3603 = this.field3609 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("js.b(Lgg;I)V")
    public void method4691(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4692(arg0, var2);
        }
    }

    @ObfuscatedName("js.z(Lgg;IB)V")
    public void method4692(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3332();
            if (var3 > 0) {
                if (this.field3600 == null || field3613) {
                    this.field3601 = new int[var3];
                    this.field3600 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3600[var4] = arg0.method3310();
                        this.field3601[var4] = arg0.method3332();
                    }
                } else {
                    arg0.field2562 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3602 = arg0.method3429();
        } else if (arg1 == 5) {
            int var5 = arg0.method3332();
            if (var5 > 0) {
                if (this.field3600 == null || field3613) {
                    this.field3601 = null;
                    this.field3600 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3600[var6] = arg0.method3310();
                    }
                } else {
                    arg0.field2562 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3610 = arg0.method3332();
        } else if (arg1 == 15) {
            this.field3608 = arg0.method3332();
        } else if (arg1 == 17) {
            this.field3609 = 0;
            this.field3614 = false;
        } else if (arg1 == 18) {
            this.field3614 = false;
        } else if (arg1 == 19) {
            this.field3627 = arg0.method3332();
        } else if (arg1 == 21) {
            this.field3598 = 0;
        } else if (arg1 == 22) {
            this.field3634 = true;
        } else if (arg1 == 23) {
            this.field3612 = true;
        } else if (arg1 == 24) {
            this.field3632 = arg0.method3310();
            if (this.field3632 == 65535) {
                this.field3632 = -1;
            }
        } else if (arg1 == 27) {
            this.field3609 = 1;
        } else if (arg1 == 28) {
            this.field3622 = arg0.method3332();
        } else if (arg1 == 29) {
            this.field3617 = arg0.method3309();
        } else if (arg1 == 39) {
            this.field3618 = arg0.method3309() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3596[arg1 - 30] = arg0.method3429();
            if (this.field3596[arg1 - 30].equalsIgnoreCase(class252.field3280)) {
                this.field3596[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3332();
            this.field3605 = new short[var7];
            this.field3604 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3605[var8] = (short) arg0.method3310();
                this.field3604[var8] = (short) arg0.method3310();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3332();
            this.field3611 = new short[var9];
            this.field3606 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3611[var10] = (short) arg0.method3310();
                this.field3606[var10] = (short) arg0.method3310();
            }
        } else if (arg1 == 62) {
            this.field3591 = true;
        } else if (arg1 == 64) {
            this.field3616 = false;
        } else if (arg1 == 65) {
            this.field3624 = arg0.method3310();
        } else if (arg1 == 66) {
            this.field3625 = arg0.method3310();
        } else if (arg1 == 67) {
            this.field3626 = arg0.method3310();
        } else if (arg1 == 68) {
            this.field3621 = arg0.method3310();
        } else if (arg1 == 69) {
            arg0.method3332();
        } else if (arg1 == 70) {
            this.field3615 = arg0.method3414();
        } else if (arg1 == 71) {
            this.field3628 = arg0.method3414();
        } else if (arg1 == 72) {
            this.field3629 = arg0.method3414();
        } else if (arg1 == 73) {
            this.field3630 = true;
        } else if (arg1 == 74) {
            this.field3631 = true;
        } else if (arg1 == 75) {
            this.field3603 = arg0.method3332();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3619 = arg0.method3310();
            if (this.field3619 == 65535) {
                this.field3619 = -1;
            }
            this.field3635 = arg0.method3310();
            if (this.field3635 == 65535) {
                this.field3635 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3310();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3332();
            this.field3633 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3633[var15] = arg0.method3310();
                if (this.field3633[var15] == 65535) {
                    this.field3633[var15] = -1;
                }
            }
            this.field3633[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3636 = arg0.method3310();
            this.field3607 = arg0.method3332();
        } else if (arg1 == 79) {
            this.field3638 = arg0.method3310();
            this.field3639 = arg0.method3310();
            this.field3607 = arg0.method3332();
            int var11 = arg0.method3332();
            this.field3640 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3640[var12] = arg0.method3310();
            }
        } else if (arg1 == 81) {
            this.field3598 = arg0.method3332() * 256;
        } else if (arg1 == 82) {
            this.field3620 = arg0.method3310();
        } else if (arg1 == 249) {
            this.field3641 = class277.method3031(arg0, this.field3641);
        }
    }

    @ObfuscatedName("js.n(II)Z")
    public final boolean method4690(int arg0) {
        if (this.field3601 != null) {
            for (int var4 = 0; var4 < this.field3601.length; var4++) {
                if (this.field3601[var4] == arg0) {
                    return Statics.field3593.method4269(this.field3600[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3600 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3600.length; var3++) {
                var2 &= Statics.field3593.method4269(this.field3600[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("js.l(I)Z")
    public final boolean method4695() {
        if (this.field3600 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3600.length; var2++) {
            var1 &= Statics.field3593.method4269(this.field3600[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("js.s(II[[IIIII)Ley;")
    public final class140 method4717(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3601 == null) {
            var7 = (long) ((this.field3599 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3599 << 10) + (arg0 << 3) + arg1);
        }
        class140 var9 = (class140) field3623.method3706(var7);
        if (var9 == null) {
            class126 var10 = this.method4698(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3634) {
                var10.field1730 = (short) (this.field3617 + 64);
                var10.field1731 = (short) (this.field3618 + 768);
                var10.method2501();
                var9 = var10;
            } else {
                var9 = var10.method2505(this.field3617 + 64, this.field3618 + 768, -50, -10, -50);
            }
            field3623.method3712(var9, var7);
        }
        if (this.field3634) {
            var9 = ((class126) var9).method2489();
        }
        if (this.field3598 >= 0) {
            if (var9 instanceof class132) {
                var9 = ((class132) var9).method2576(arg2, arg3, arg4, arg5, true, this.field3598);
            } else if (var9 instanceof class126) {
                var9 = ((class126) var9).method2490(arg2, arg3, arg4, arg5, true, this.field3598);
            }
        }
        return var9;
    }

    @ObfuscatedName("js.y(II[[IIIIB)Lee;")
    public final class132 method4693(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3601 == null) {
            var7 = (long) ((this.field3599 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3599 << 10) + (arg0 << 3) + arg1);
        }
        class132 var9 = (class132) field3597.method3706(var7);
        if (var9 == null) {
            class126 var10 = this.method4698(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2505(this.field3617 + 64, this.field3618 + 768, -50, -10, -50);
            field3597.method3712(var9, var7);
        }
        if (this.field3598 >= 0) {
            var9 = var9.method2576(arg2, arg3, arg4, arg5, true, this.field3598);
        }
        return var9;
    }

    @ObfuscatedName("js.c(II[[IIIILkc;IS)Lee;")
    public final class132 method4696(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class288 arg6, int arg7) {
        long var9;
        if (this.field3601 == null) {
            var9 = (long) ((this.field3599 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3599 << 10) + (arg0 << 3) + arg1);
        }
        class132 var11 = (class132) field3597.method3706(var9);
        if (var11 == null) {
            class126 var12 = this.method4698(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2505(this.field3617 + 64, this.field3618 + 768, -50, -10, -50);
            field3597.method3712(var11, var9);
        }
        if (arg6 == null && this.field3598 == -1) {
            return var11;
        }
        class132 var13;
        if (arg6 == null) {
            var13 = var11.method2577(true);
        } else {
            var13 = arg6.method4845(var11, arg7, arg1);
        }
        if (this.field3598 >= 0) {
            var13 = var13.method2576(arg2, arg3, arg4, arg5, false, this.field3598);
        }
        return var13;
    }

    @ObfuscatedName("js.o(IIB)Ldi;")
    public final class126 method4698(int arg0, int arg1) {
        class126 var3 = null;
        if (this.field3601 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3600 == null) {
                return null;
            }
            boolean var4 = this.field3591;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3600.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3600[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class126) field3595.method3706((long) var7);
                if (var3 == null) {
                    var3 = class126.method2485(Statics.field3593, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2526();
                    }
                    field3595.method3712(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3637[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class126(field3637, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3601.length; var9++) {
                if (this.field3601[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3600[var8];
            boolean var11 = this.field3591 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class126) field3595.method3706((long) var10);
            if (var3 == null) {
                var3 = class126.method2485(Statics.field3593, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2526();
                }
                field3595.method3712(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3624 == 128 && this.field3625 == 128 && this.field3626 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3615 == 0 && this.field3628 == 0 && this.field3629 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class126 var14 = new class126(var3, arg1 == 0 && !var12 && !var13, this.field3605 == null, this.field3611 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2495(256);
            var14.method2492(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2525();
        } else if (var15 == 2) {
            var14.method2493();
        } else if (var15 == 3) {
            var14.method2494();
        }
        if (this.field3605 != null) {
            for (int var16 = 0; var16 < this.field3605.length; var16++) {
                var14.method2534(this.field3605[var16], this.field3604[var16]);
            }
        }
        if (this.field3611 != null) {
            for (int var17 = 0; var17 < this.field3611.length; var17++) {
                var14.method2498(this.field3611[var17], this.field3606[var17]);
            }
        }
        if (var12) {
            var14.method2500(this.field3624, this.field3625, this.field3626);
        }
        if (var13) {
            var14.method2492(this.field3615, this.field3628, this.field3629);
        }
        return var14;
    }

    @ObfuscatedName("js.d(I)Ljs;")
    public final class283 method4699() {
        int var1 = -1;
        if (this.field3619 != -1) {
            var1 = class238.method4502(this.field3619);
        } else if (this.field3635 != -1) {
            var1 = class238.field2788[this.field3635];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3633.length - 1) {
            var2 = this.field3633[var1];
        } else {
            var2 = this.field3633[this.field3633.length - 1];
        }
        return var2 == -1 ? null : method1732(var2);
    }

    @ObfuscatedName("js.r(III)I")
    public int method4700(int arg0, int arg1) {
        return class277.method2026(this.field3641, arg0, arg1);
    }

    @ObfuscatedName("js.p(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4701(int arg0, String arg1) {
        return class277.method3127(this.field3641, arg0, arg1);
    }

    @ObfuscatedName("s.q(I)V")
    public static void method20() {
        field3594.method3709();
        field3595.method3709();
        field3623.method3709();
        field3597.method3709();
    }

    @ObfuscatedName("js.f(I)Z")
    public boolean method4714() {
        if (this.field3633 == null) {
            return this.field3636 != -1 || this.field3640 != null;
        }
        for (int var1 = 0; var1 < this.field3633.length; var1++) {
            if (this.field3633[var1] != -1) {
                class283 var2 = method1732(this.field3633[var1]);
                if (var2.field3636 != -1 || var2.field3640 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
