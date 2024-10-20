package deob;

@ObfuscatedName("kj")
public class class295 extends class346 {

    @ObfuscatedName("kj.f")
    public static boolean field3637 = false;

    @ObfuscatedName("kj.p")
    public static class199 field3591 = new class199(4096);

    @ObfuscatedName("kj.b")
    public static class199 field3592 = new class199(500);

    @ObfuscatedName("kj.e")
    public static class199 field3629 = new class199(30);

    @ObfuscatedName("kj.k")
    public static class199 field3608 = new class199(30);

    @ObfuscatedName("kj.g")
    public static class169[] field3595 = new class169[4];

    @ObfuscatedName("kj.h")
    public int field3596;

    @ObfuscatedName("kj.n")
    public int[] field3597;

    @ObfuscatedName("kj.l")
    public int[] field3598;

    @ObfuscatedName("kj.m")
    public String field3599 = class246.field2920;

    @ObfuscatedName("kj.d")
    public short[] field3600;

    @ObfuscatedName("kj.c")
    public short[] field3601;

    @ObfuscatedName("kj.j")
    public short[] field3590;

    @ObfuscatedName("kj.r")
    public short[] field3603;

    @ObfuscatedName("kj.q")
    public int field3604 = 1;

    @ObfuscatedName("kj.t")
    public int field3588 = 1;

    @ObfuscatedName("kj.v")
    public int field3614 = 2;

    @ObfuscatedName("kj.x")
    public boolean field3607 = true;

    @ObfuscatedName("kj.z")
    public int field3602 = -1;

    @ObfuscatedName("kj.i")
    public int field3609 = -1;

    @ObfuscatedName("kj.a")
    public boolean field3610 = false;

    @ObfuscatedName("kj.w")
    public boolean field3594 = false;

    @ObfuscatedName("kj.s")
    public int field3612 = -1;

    @ObfuscatedName("kj.y")
    public int field3613 = 16;

    @ObfuscatedName("kj.ac")
    public int field3638 = 0;

    @ObfuscatedName("kj.ay")
    public int field3615 = 0;

    @ObfuscatedName("kj.am")
    public String[] field3616 = new String[5];

    @ObfuscatedName("kj.ag")
    public int field3617 = -1;

    @ObfuscatedName("kj.aq")
    public int field3618 = -1;

    @ObfuscatedName("kj.at")
    public boolean field3619 = false;

    @ObfuscatedName("kj.aj")
    public boolean field3620 = true;

    @ObfuscatedName("kj.aw")
    public int field3632 = 128;

    @ObfuscatedName("kj.ap")
    public int field3593 = 128;

    @ObfuscatedName("kj.ax")
    public int field3623 = 128;

    @ObfuscatedName("kj.as")
    public int field3624 = 0;

    @ObfuscatedName("kj.ad")
    public int field3606 = 0;

    @ObfuscatedName("kj.af")
    public int field3626 = 0;

    @ObfuscatedName("kj.ao")
    public boolean field3627 = false;

    @ObfuscatedName("kj.ai")
    public boolean field3611 = false;

    @ObfuscatedName("kj.av")
    public int field3621 = -1;

    @ObfuscatedName("kj.az")
    public int[] field3630;

    @ObfuscatedName("kj.au")
    public int field3631 = -1;

    @ObfuscatedName("kj.ab")
    public int field3605 = -1;

    @ObfuscatedName("kj.aa")
    public int field3633 = -1;

    @ObfuscatedName("kj.al")
    public int field3634 = 0;

    @ObfuscatedName("kj.ar")
    public int field3635 = 0;

    @ObfuscatedName("kj.ak")
    public int field3636 = 0;

    @ObfuscatedName("kj.an")
    public int[] field3628;

    @ObfuscatedName("kj.ah")
    public boolean field3622 = true;

    @ObfuscatedName("kj.ae")
    public class360 field3639;

    @ObfuscatedName("x.f(II)Lkj;")
    public static class295 method182(int arg0) {
        class295 var1 = (class295) field3591.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3589.method3933(6, arg0);
        class295 var3 = new class295();
        var3.field3596 = arg0;
        if (var2 != null) {
            var3.method4598(new class382(var2));
        }
        var3.method4638();
        if (var3.field3611) {
            var3.field3614 = 0;
            var3.field3607 = false;
        }
        field3591.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kj.o(B)V")
    public void method4638() {
        if (this.field3602 == -1) {
            this.field3602 = 0;
            if (this.field3597 != null && (this.field3598 == null || this.field3598[0] == 10)) {
                this.field3602 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3616[var1] != null) {
                    this.field3602 = 1;
                }
            }
        }
        if (this.field3621 == -1) {
            this.field3621 = this.field3614 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("kj.u(Lnu;B)V")
    public void method4598(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4599(arg0, var2);
        }
    }

    @ObfuscatedName("kj.p(Lnu;II)V")
    public void method4599(class382 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5856();
            if (var3 > 0) {
                if (this.field3597 == null || field3637) {
                    this.field3598 = new int[var3];
                    this.field3597 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3597[var4] = arg0.method5858();
                        this.field3598[var4] = arg0.method5856();
                    }
                } else {
                    arg0.field4155 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3599 = arg0.method5865();
        } else if (arg1 == 5) {
            int var5 = arg0.method5856();
            if (var5 > 0) {
                if (this.field3597 == null || field3637) {
                    this.field3598 = null;
                    this.field3597 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3597[var6] = arg0.method5858();
                    }
                } else {
                    arg0.field4155 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3604 = arg0.method5856();
        } else if (arg1 == 15) {
            this.field3588 = arg0.method5856();
        } else if (arg1 == 17) {
            this.field3614 = 0;
            this.field3607 = false;
        } else if (arg1 == 18) {
            this.field3607 = false;
        } else if (arg1 == 19) {
            this.field3602 = arg0.method5856();
        } else if (arg1 == 21) {
            this.field3609 = 0;
        } else if (arg1 == 22) {
            this.field3610 = true;
        } else if (arg1 == 23) {
            this.field3594 = true;
        } else if (arg1 == 24) {
            this.field3612 = arg0.method5858();
            if (this.field3612 == 65535) {
                this.field3612 = -1;
            }
        } else if (arg1 == 27) {
            this.field3614 = 1;
        } else if (arg1 == 28) {
            this.field3613 = arg0.method5856();
        } else if (arg1 == 29) {
            this.field3638 = arg0.method6045();
        } else if (arg1 == 39) {
            this.field3615 = arg0.method6045() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3616[arg1 - 30] = arg0.method5865();
            if (this.field3616[arg1 - 30].equalsIgnoreCase(class246.field2915)) {
                this.field3616[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5856();
            this.field3600 = new short[var7];
            this.field3601 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3600[var8] = (short) arg0.method5858();
                this.field3601[var8] = (short) arg0.method5858();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5856();
            this.field3590 = new short[var9];
            this.field3603 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3590[var10] = (short) arg0.method5858();
                this.field3603[var10] = (short) arg0.method5858();
            }
        } else if (arg1 == 62) {
            this.field3619 = true;
        } else if (arg1 == 64) {
            this.field3620 = false;
        } else if (arg1 == 65) {
            this.field3632 = arg0.method5858();
        } else if (arg1 == 66) {
            this.field3593 = arg0.method5858();
        } else if (arg1 == 67) {
            this.field3623 = arg0.method5858();
        } else if (arg1 == 68) {
            this.field3618 = arg0.method5858();
        } else if (arg1 == 69) {
            arg0.method5856();
        } else if (arg1 == 70) {
            this.field3624 = arg0.method5859();
        } else if (arg1 == 71) {
            this.field3606 = arg0.method5859();
        } else if (arg1 == 72) {
            this.field3626 = arg0.method5859();
        } else if (arg1 == 73) {
            this.field3627 = true;
        } else if (arg1 == 74) {
            this.field3611 = true;
        } else if (arg1 == 75) {
            this.field3621 = arg0.method5856();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3631 = arg0.method5858();
            if (this.field3631 == 65535) {
                this.field3631 = -1;
            }
            this.field3605 = arg0.method5858();
            if (this.field3605 == 65535) {
                this.field3605 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5858();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5856();
            this.field3630 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3630[var15] = arg0.method5858();
                if (this.field3630[var15] == 65535) {
                    this.field3630[var15] = -1;
                }
            }
            this.field3630[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3633 = arg0.method5858();
            this.field3634 = arg0.method5856();
        } else if (arg1 == 79) {
            this.field3635 = arg0.method5858();
            this.field3636 = arg0.method5858();
            this.field3634 = arg0.method5856();
            int var11 = arg0.method5856();
            this.field3628 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3628[var12] = arg0.method5858();
            }
        } else if (arg1 == 81) {
            this.field3609 = arg0.method5856() * 256;
        } else if (arg1 == 82) {
            this.field3617 = arg0.method5858();
        } else if (arg1 == 89) {
            this.field3622 = false;
        } else if (arg1 == 249) {
            this.field3639 = class284.method1975(arg0, this.field3639);
        }
    }

    @ObfuscatedName("kj.b(II)Z")
    public final boolean method4600(int arg0) {
        if (this.field3598 != null) {
            for (int var4 = 0; var4 < this.field3598.length; var4++) {
                if (this.field3598[var4] == arg0) {
                    return Statics.field3625.method3935(this.field3597[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3597 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3597.length; var3++) {
                var2 &= Statics.field3625.method3935(this.field3597[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("kj.e(I)Z")
    public final boolean method4601() {
        if (this.field3597 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3597.length; var2++) {
            var1 &= Statics.field3625.method3935(this.field3597[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("kj.k(II[[IIIIB)Lfm;")
    public final class177 method4602(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3598 == null) {
            var7 = (long) ((this.field3596 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3596 << 10) + (arg0 << 3) + arg1);
        }
        class177 var9 = (class177) field3629.method3398(var7);
        if (var9 == null) {
            class169 var10 = this.method4605(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3610) {
                var10.field1807 = (short) (this.field3638 + 64);
                var10.field1824 = (short) (this.field3615 + 768);
                var10.method2898();
                var9 = var10;
            } else {
                var9 = var10.method2860(this.field3638 + 64, this.field3615 + 768, -50, -10, -50);
            }
            field3629.method3400(var9, var7);
        }
        if (this.field3610) {
            var9 = ((class169) var9).method2890();
        }
        if (this.field3609 >= 0) {
            if (var9 instanceof class183) {
                var9 = ((class183) var9).method3235(arg2, arg3, arg4, arg5, true, this.field3609);
            } else if (var9 instanceof class169) {
                var9 = ((class169) var9).method2878(arg2, arg3, arg4, arg5, true, this.field3609);
            }
        }
        return var9;
    }

    @ObfuscatedName("kj.g(II[[IIIII)Lgv;")
    public final class183 method4603(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3598 == null) {
            var7 = (long) ((this.field3596 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3596 << 10) + (arg0 << 3) + arg1);
        }
        class183 var9 = (class183) field3608.method3398(var7);
        if (var9 == null) {
            class169 var10 = this.method4605(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2860(this.field3638 + 64, this.field3615 + 768, -50, -10, -50);
            field3608.method3400(var9, var7);
        }
        if (this.field3609 >= 0) {
            var9 = var9.method3235(arg2, arg3, arg4, arg5, true, this.field3609);
        }
        return var9;
    }

    @ObfuscatedName("kj.h(II[[IIIILkw;II)Lgv;")
    public final class183 method4604(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class298 arg6, int arg7) {
        long var9;
        if (this.field3598 == null) {
            var9 = (long) ((this.field3596 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3596 << 10) + (arg0 << 3) + arg1);
        }
        class183 var11 = (class183) field3608.method3398(var9);
        if (var11 == null) {
            class169 var12 = this.method4605(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2860(this.field3638 + 64, this.field3615 + 768, -50, -10, -50);
            field3608.method3400(var11, var9);
        }
        if (arg6 == null && this.field3609 == -1) {
            return var11;
        }
        class183 var13;
        if (arg6 == null) {
            var13 = var11.method3272(true);
        } else {
            var13 = arg6.method4743(var11, arg7, arg1);
        }
        if (this.field3609 >= 0) {
            var13 = var13.method3235(arg2, arg3, arg4, arg5, false, this.field3609);
        }
        return var13;
    }

    @ObfuscatedName("kj.n(III)Lfs;")
    public final class169 method4605(int arg0, int arg1) {
        class169 var3 = null;
        if (this.field3598 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3597 == null) {
                return null;
            }
            boolean var4 = this.field3619;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3597.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3597[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class169) field3592.method3398((long) var7);
                if (var3 == null) {
                    var3 = class169.method2839(Statics.field3625, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2854();
                    }
                    field3592.method3400(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3595[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class169(field3595, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3598.length; var9++) {
                if (this.field3598[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3597[var8];
            boolean var11 = this.field3619 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class169) field3592.method3398((long) var10);
            if (var3 == null) {
                var3 = class169.method2839(Statics.field3625, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2854();
                }
                field3592.method3400(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3632 == 128 && this.field3593 == 128 && this.field3623 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3624 == 0 && this.field3606 == 0 && this.field3626 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class169 var14 = new class169(var3, arg1 == 0 && !var12 && !var13, this.field3600 == null, this.field3590 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2850(256);
            var14.method2851(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2867();
        } else if (var15 == 2) {
            var14.method2848();
        } else if (var15 == 3) {
            var14.method2849();
        }
        if (this.field3600 != null) {
            for (int var16 = 0; var16 < this.field3600.length; var16++) {
                var14.method2852(this.field3600[var16], this.field3601[var16]);
            }
        }
        if (this.field3590 != null) {
            for (int var17 = 0; var17 < this.field3590.length; var17++) {
                var14.method2842(this.field3590[var17], this.field3603[var17]);
            }
        }
        if (var12) {
            var14.method2855(this.field3632, this.field3593, this.field3623);
        }
        if (var13) {
            var14.method2851(this.field3624, this.field3606, this.field3626);
        }
        return var14;
    }

    @ObfuscatedName("kj.l(I)Lkj;")
    public final class295 method4611() {
        int var1 = -1;
        if (this.field3631 != -1) {
            var1 = class220.method29(this.field3631);
        } else if (this.field3605 != -1) {
            var1 = class220.field2578[this.field3605];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3630.length - 1) {
            var2 = this.field3630[var1];
        } else {
            var2 = this.field3630[this.field3630.length - 1];
        }
        return var2 == -1 ? null : method182(var2);
    }

    @ObfuscatedName("kj.m(III)I")
    public int method4607(int arg0, int arg1) {
        class360 var3 = this.field3639;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class350 var5 = (class350) var3.method5621((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field3940;
            }
        }
        return var4;
    }

    @ObfuscatedName("kj.d(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4608(int arg0, String arg1) {
        class360 var3 = this.field3639;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class347 var5 = (class347) var3.method5621((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field3937;
            }
        }
        return var4;
    }

    @ObfuscatedName("kj.c(B)Z")
    public boolean method4629() {
        if (this.field3630 == null) {
            return this.field3633 != -1 || this.field3628 != null;
        }
        for (int var1 = 0; var1 < this.field3630.length; var1++) {
            if (this.field3630[var1] != -1) {
                class295 var2 = method182(this.field3630[var1]);
                if (var2.field3633 != -1 || var2.field3628 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
