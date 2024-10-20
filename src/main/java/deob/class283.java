package deob;

@ObfuscatedName("jd")
public class class283 extends class219 {

    @ObfuscatedName("jd.d")
    public static boolean field3618 = false;

    @ObfuscatedName("jd.r")
    public static class213 field3591 = new class213(4096);

    @ObfuscatedName("jd.e")
    public static class213 field3592 = new class213(500);

    @ObfuscatedName("jd.y")
    public static class213 field3593 = new class213(30);

    @ObfuscatedName("jd.k")
    public static class213 field3594 = new class213(30);

    @ObfuscatedName("jd.s")
    public static class126[] field3595 = new class126[4];

    @ObfuscatedName("jd.p")
    public int field3637;

    @ObfuscatedName("jd.x")
    public int[] field3606;

    @ObfuscatedName("jd.m")
    public int[] field3598;

    @ObfuscatedName("jd.h")
    public String field3599 = class252.field3160;

    @ObfuscatedName("jd.t")
    public short[] field3621;

    @ObfuscatedName("jd.i")
    public short[] field3601;

    @ObfuscatedName("jd.u")
    public short[] field3602;

    @ObfuscatedName("jd.q")
    public short[] field3603;

    @ObfuscatedName("jd.v")
    public int field3604 = 1;

    @ObfuscatedName("jd.f")
    public int field3605 = 1;

    @ObfuscatedName("jd.b")
    public int field3616 = 2;

    @ObfuscatedName("jd.c")
    public boolean field3607 = true;

    @ObfuscatedName("jd.j")
    public int field3608 = -1;

    @ObfuscatedName("jd.l")
    public int field3624 = -1;

    @ObfuscatedName("jd.g")
    public boolean field3596 = false;

    @ObfuscatedName("jd.w")
    public boolean field3611 = false;

    @ObfuscatedName("jd.o")
    public int field3612 = -1;

    @ObfuscatedName("jd.a")
    public int field3635 = 16;

    @ObfuscatedName("jd.ak")
    public int field3614 = 0;

    @ObfuscatedName("jd.ap")
    public int field3615 = 0;

    @ObfuscatedName("jd.ac")
    public String[] field3631 = new String[5];

    @ObfuscatedName("jd.aw")
    public int field3617 = -1;

    @ObfuscatedName("jd.as")
    public int field3609 = -1;

    @ObfuscatedName("jd.au")
    public boolean field3619 = false;

    @ObfuscatedName("jd.al")
    public boolean field3623 = true;

    @ObfuscatedName("jd.af")
    public int field3625 = 128;

    @ObfuscatedName("jd.ai")
    public int field3622 = 128;

    @ObfuscatedName("jd.az")
    public int field3627 = 128;

    @ObfuscatedName("jd.aq")
    public int field3620 = 0;

    @ObfuscatedName("jd.ae")
    public int field3589 = 0;

    @ObfuscatedName("jd.ad")
    public int field3626 = 0;

    @ObfuscatedName("jd.ar")
    public boolean field3632 = false;

    @ObfuscatedName("jd.ao")
    public boolean field3628 = false;

    @ObfuscatedName("jd.at")
    public int field3629 = -1;

    @ObfuscatedName("jd.ag")
    public int[] field3630;

    @ObfuscatedName("jd.an")
    public int field3638 = -1;

    @ObfuscatedName("jd.ax")
    public int field3613 = -1;

    @ObfuscatedName("jd.ah")
    public int field3633 = -1;

    @ObfuscatedName("jd.ab")
    public int field3600 = 0;

    @ObfuscatedName("jd.am")
    public int field3634 = 0;

    @ObfuscatedName("jd.ay")
    public int field3636 = 0;

    @ObfuscatedName("jd.aj")
    public int[] field3597;

    @ObfuscatedName("jd.aa")
    public class210 field3588;

    @ObfuscatedName("fi.d(II)Ljd;")
    public static class283 method3065(int arg0) {
        class283 var1 = (class283) field3591.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3610.method4273(6, arg0);
        class283 var3 = new class283();
        var3.field3637 = arg0;
        if (var2 != null) {
            var3.method4704(new class195(var2));
        }
        var3.method4703();
        if (var3.field3628) {
            var3.field3616 = 0;
            var3.field3607 = false;
        }
        field3591.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.z(B)V")
    public void method4703() {
        if (this.field3608 == -1) {
            this.field3608 = 0;
            if (this.field3606 != null && (this.field3598 == null || this.field3598[0] == 10)) {
                this.field3608 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3631[var1] != null) {
                    this.field3608 = 1;
                }
            }
        }
        if (this.field3629 == -1) {
            this.field3629 = this.field3616 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jd.n(Lgy;I)V")
    public void method4704(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4705(arg0, var2);
        }
    }

    @ObfuscatedName("jd.r(Lgy;II)V")
    public void method4705(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3330();
            if (var3 > 0) {
                if (this.field3606 == null || field3618) {
                    this.field3598 = new int[var3];
                    this.field3606 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3606[var4] = arg0.method3269();
                        this.field3598[var4] = arg0.method3330();
                    }
                } else {
                    arg0.field2568 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3599 = arg0.method3268();
        } else if (arg1 == 5) {
            int var5 = arg0.method3330();
            if (var5 > 0) {
                if (this.field3606 == null || field3618) {
                    this.field3598 = null;
                    this.field3606 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3606[var6] = arg0.method3269();
                    }
                } else {
                    arg0.field2568 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3604 = arg0.method3330();
        } else if (arg1 == 15) {
            this.field3605 = arg0.method3330();
        } else if (arg1 == 17) {
            this.field3616 = 0;
            this.field3607 = false;
        } else if (arg1 == 18) {
            this.field3607 = false;
        } else if (arg1 == 19) {
            this.field3608 = arg0.method3330();
        } else if (arg1 == 21) {
            this.field3624 = 0;
        } else if (arg1 == 22) {
            this.field3596 = true;
        } else if (arg1 == 23) {
            this.field3611 = true;
        } else if (arg1 == 24) {
            this.field3612 = arg0.method3269();
            if (this.field3612 == 65535) {
                this.field3612 = -1;
            }
        } else if (arg1 == 27) {
            this.field3616 = 1;
        } else if (arg1 == 28) {
            this.field3635 = arg0.method3330();
        } else if (arg1 == 29) {
            this.field3614 = arg0.method3421();
        } else if (arg1 == 39) {
            this.field3615 = arg0.method3421() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3631[arg1 - 30] = arg0.method3268();
            if (this.field3631[arg1 - 30].equalsIgnoreCase(class252.field3022)) {
                this.field3631[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3330();
            this.field3621 = new short[var7];
            this.field3601 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3621[var8] = (short) arg0.method3269();
                this.field3601[var8] = (short) arg0.method3269();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3330();
            this.field3602 = new short[var9];
            this.field3603 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3602[var10] = (short) arg0.method3269();
                this.field3603[var10] = (short) arg0.method3269();
            }
        } else if (arg1 == 62) {
            this.field3619 = true;
        } else if (arg1 == 64) {
            this.field3623 = false;
        } else if (arg1 == 65) {
            this.field3625 = arg0.method3269();
        } else if (arg1 == 66) {
            this.field3622 = arg0.method3269();
        } else if (arg1 == 67) {
            this.field3627 = arg0.method3269();
        } else if (arg1 == 68) {
            this.field3609 = arg0.method3269();
        } else if (arg1 == 69) {
            arg0.method3330();
        } else if (arg1 == 70) {
            this.field3620 = arg0.method3262();
        } else if (arg1 == 71) {
            this.field3589 = arg0.method3262();
        } else if (arg1 == 72) {
            this.field3626 = arg0.method3262();
        } else if (arg1 == 73) {
            this.field3632 = true;
        } else if (arg1 == 74) {
            this.field3628 = true;
        } else if (arg1 == 75) {
            this.field3629 = arg0.method3330();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3638 = arg0.method3269();
            if (this.field3638 == 65535) {
                this.field3638 = -1;
            }
            this.field3613 = arg0.method3269();
            if (this.field3613 == 65535) {
                this.field3613 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3269();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3330();
            this.field3630 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3630[var15] = arg0.method3269();
                if (this.field3630[var15] == 65535) {
                    this.field3630[var15] = -1;
                }
            }
            this.field3630[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3633 = arg0.method3269();
            this.field3600 = arg0.method3330();
        } else if (arg1 == 79) {
            this.field3634 = arg0.method3269();
            this.field3636 = arg0.method3269();
            this.field3600 = arg0.method3330();
            int var11 = arg0.method3330();
            this.field3597 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3597[var12] = arg0.method3269();
            }
        } else if (arg1 == 81) {
            this.field3624 = arg0.method3330() * 256;
        } else if (arg1 == 82) {
            this.field3617 = arg0.method3269();
        } else if (arg1 == 249) {
            this.field3588 = class277.method3037(arg0, this.field3588);
        }
    }

    @ObfuscatedName("jd.e(II)Z")
    public final boolean method4706(int arg0) {
        if (this.field3598 != null) {
            for (int var4 = 0; var4 < this.field3598.length; var4++) {
                if (this.field3598[var4] == arg0) {
                    return Statics.field3590.method4275(this.field3606[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3606 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3606.length; var3++) {
                var2 &= Statics.field3590.method4275(this.field3606[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jd.y(I)Z")
    public final boolean method4707() {
        if (this.field3606 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3606.length; var2++) {
            var1 &= Statics.field3590.method4275(this.field3606[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jd.k(II[[IIIII)Leb;")
    public final class140 method4732(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3598 == null) {
            var7 = (long) ((this.field3637 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3637 << 10) + (arg0 << 3) + arg1);
        }
        class140 var9 = (class140) field3593.method3707(var7);
        if (var9 == null) {
            class126 var10 = this.method4710(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3596) {
                var10.field1715 = (short) (this.field3614 + 64);
                var10.field1742 = (short) (this.field3615 + 768);
                var10.method2445();
                var9 = var10;
            } else {
                var9 = var10.method2449(this.field3614 + 64, this.field3615 + 768, -50, -10, -50);
            }
            field3593.method3697(var9, var7);
        }
        if (this.field3596) {
            var9 = ((class126) var9).method2434();
        }
        if (this.field3624 >= 0) {
            if (var9 instanceof class132) {
                var9 = ((class132) var9).method2596(arg2, arg3, arg4, arg5, true, this.field3624);
            } else if (var9 instanceof class126) {
                var9 = ((class126) var9).method2435(arg2, arg3, arg4, arg5, true, this.field3624);
            }
        }
        return var9;
    }

    @ObfuscatedName("jd.s(II[[IIIII)Lel;")
    public final class132 method4708(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3598 == null) {
            var7 = (long) ((this.field3637 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3637 << 10) + (arg0 << 3) + arg1);
        }
        class132 var9 = (class132) field3594.method3707(var7);
        if (var9 == null) {
            class126 var10 = this.method4710(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2449(this.field3614 + 64, this.field3615 + 768, -50, -10, -50);
            field3594.method3697(var9, var7);
        }
        if (this.field3624 >= 0) {
            var9 = var9.method2596(arg2, arg3, arg4, arg5, true, this.field3624);
        }
        return var9;
    }

    @ObfuscatedName("jd.x(II[[IIIILki;II)Lel;")
    public final class132 method4739(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class288 arg6, int arg7) {
        long var9;
        if (this.field3598 == null) {
            var9 = (long) ((this.field3637 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3637 << 10) + (arg0 << 3) + arg1);
        }
        class132 var11 = (class132) field3594.method3707(var9);
        if (var11 == null) {
            class126 var12 = this.method4710(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2449(this.field3614 + 64, this.field3615 + 768, -50, -10, -50);
            field3594.method3697(var11, var9);
        }
        if (arg6 == null && this.field3624 == -1) {
            return var11;
        }
        class132 var13;
        if (arg6 == null) {
            var13 = var11.method2524(true);
        } else {
            var13 = arg6.method4876(var11, arg7, arg1);
        }
        if (this.field3624 >= 0) {
            var13 = var13.method2596(arg2, arg3, arg4, arg5, false, this.field3624);
        }
        return var13;
    }

    @ObfuscatedName("jd.h(III)Ldf;")
    public final class126 method4710(int arg0, int arg1) {
        class126 var3 = null;
        if (this.field3598 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3606 == null) {
                return null;
            }
            boolean var4 = this.field3619;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3606.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3606[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class126) field3592.method3707((long) var7);
                if (var3 == null) {
                    var3 = class126.method2428(Statics.field3590, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2457();
                    }
                    field3592.method3697(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3595[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class126(field3595, var5);
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
            int var10 = this.field3606[var8];
            boolean var11 = this.field3619 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class126) field3592.method3707((long) var10);
            if (var3 == null) {
                var3 = class126.method2428(Statics.field3590, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2457();
                }
                field3592.method3697(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3625 == 128 && this.field3622 == 128 && this.field3627 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3620 == 0 && this.field3589 == 0 && this.field3626 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class126 var14 = new class126(var3, arg1 == 0 && !var12 && !var13, this.field3621 == null, this.field3602 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2453(256);
            var14.method2440(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2480();
        } else if (var15 == 2) {
            var14.method2438();
        } else if (var15 == 3) {
            var14.method2437();
        }
        if (this.field3621 != null) {
            for (int var16 = 0; var16 < this.field3621.length; var16++) {
                var14.method2441(this.field3621[var16], this.field3601[var16]);
            }
        }
        if (this.field3602 != null) {
            for (int var17 = 0; var17 < this.field3602.length; var17++) {
                var14.method2442(this.field3602[var17], this.field3603[var17]);
            }
        }
        if (var12) {
            var14.method2444(this.field3625, this.field3622, this.field3627);
        }
        if (var13) {
            var14.method2440(this.field3620, this.field3589, this.field3626);
        }
        return var14;
    }

    @ObfuscatedName("jd.t(I)Ljd;")
    public final class283 method4723() {
        int var1 = -1;
        if (this.field3638 != -1) {
            var1 = class238.method728(this.field3638);
        } else if (this.field3613 != -1) {
            var1 = class238.field2783[this.field3613];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3630.length - 1) {
            var2 = this.field3630[var1];
        } else {
            var2 = this.field3630[this.field3630.length - 1];
        }
        return var2 == -1 ? null : method3065(var2);
    }

    @ObfuscatedName("jd.i(III)I")
    public int method4712(int arg0, int arg1) {
        return class277.method619(this.field3588, arg0, arg1);
    }

    @ObfuscatedName("jd.u(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4713(int arg0, String arg1) {
        return class277.method3190(this.field3588, arg0, arg1);
    }

    @ObfuscatedName("jd.q(I)Z")
    public boolean method4714() {
        if (this.field3630 == null) {
            return this.field3633 != -1 || this.field3597 != null;
        }
        for (int var1 = 0; var1 < this.field3630.length; var1++) {
            if (this.field3630[var1] != -1) {
                class283 var2 = method3065(this.field3630[var1]);
                if (var2.field3633 != -1 || var2.field3597 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
