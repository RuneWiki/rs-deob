package deob;

@ObfuscatedName("je")
public class class283 extends class219 {

    @ObfuscatedName("je.t")
    public static boolean field3641 = false;

    @ObfuscatedName("je.a")
    public static class213 field3597 = new class213(4096);

    @ObfuscatedName("je.l")
    public static class213 field3598 = new class213(500);

    @ObfuscatedName("je.b")
    public static class213 field3605 = new class213(30);

    @ObfuscatedName("je.e")
    public static class213 field3600 = new class213(30);

    @ObfuscatedName("je.x")
    public static class126[] field3601 = new class126[4];

    @ObfuscatedName("je.p")
    public int field3602;

    @ObfuscatedName("je.g")
    public int[] field3603;

    @ObfuscatedName("je.n")
    public int[] field3604;

    @ObfuscatedName("je.o")
    public String field3638 = class252.field3052;

    @ObfuscatedName("je.c")
    public short[] field3623;

    @ObfuscatedName("je.v")
    public short[] field3607;

    @ObfuscatedName("je.u")
    public short[] field3599;

    @ObfuscatedName("je.j")
    public short[] field3632;

    @ObfuscatedName("je.k")
    public int field3610 = 1;

    @ObfuscatedName("je.z")
    public int field3608 = 1;

    @ObfuscatedName("je.w")
    public int field3612 = 2;

    @ObfuscatedName("je.s")
    public boolean field3595 = true;

    @ObfuscatedName("je.d")
    public int field3614 = -1;

    @ObfuscatedName("je.f")
    public int field3615 = -1;

    @ObfuscatedName("je.r")
    public boolean field3616 = false;

    @ObfuscatedName("je.y")
    public boolean field3617 = false;

    @ObfuscatedName("je.h")
    public int field3630 = -1;

    @ObfuscatedName("je.m")
    public int field3619 = 16;

    @ObfuscatedName("je.ay")
    public int field3620 = 0;

    @ObfuscatedName("je.ao")
    public int field3628 = 0;

    @ObfuscatedName("je.av")
    public String[] field3622 = new String[5];

    @ObfuscatedName("je.aj")
    public int field3611 = -1;

    @ObfuscatedName("je.ae")
    public int field3624 = -1;

    @ObfuscatedName("je.am")
    public boolean field3625 = false;

    @ObfuscatedName("je.az")
    public boolean field3633 = true;

    @ObfuscatedName("je.ap")
    public int field3627 = 128;

    @ObfuscatedName("je.ah")
    public int field3642 = 128;

    @ObfuscatedName("je.au")
    public int field3629 = 128;

    @ObfuscatedName("je.ax")
    public int field3609 = 0;

    @ObfuscatedName("je.ar")
    public int field3631 = 0;

    @ObfuscatedName("je.an")
    public int field3618 = 0;

    @ObfuscatedName("je.ai")
    public boolean field3621 = false;

    @ObfuscatedName("je.al")
    public boolean field3634 = false;

    @ObfuscatedName("je.at")
    public int field3635 = -1;

    @ObfuscatedName("je.ag")
    public int[] field3606;

    @ObfuscatedName("je.as")
    public int field3637 = -1;

    @ObfuscatedName("je.aw")
    public int field3613 = -1;

    @ObfuscatedName("je.aq")
    public int field3639 = -1;

    @ObfuscatedName("je.aa")
    public int field3640 = 0;

    @ObfuscatedName("je.af")
    public int field3626 = 0;

    @ObfuscatedName("je.ak")
    public int field3636 = 0;

    @ObfuscatedName("je.ab")
    public int[] field3643;

    @ObfuscatedName("je.ac")
    public class210 field3644;

    @ObfuscatedName("dr.t(Ljc;Ljc;ZI)V")
    public static void method2056(class262 arg0, class262 arg1, boolean arg2) {
        Statics.field3596 = arg0;
        Statics.field316 = arg1;
        field3641 = arg2;
    }

    @ObfuscatedName("jw.q(II)Lje;")
    public static class283 method4427(int arg0) {
        class283 var1 = (class283) field3597.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3596.method4265(6, arg0);
        class283 var3 = new class283();
        var3.field3602 = arg0;
        if (var2 != null) {
            var3.method4639(new class195(var2));
        }
        var3.method4601();
        if (var3.field3634) {
            var3.field3612 = 0;
            var3.field3595 = false;
        }
        field3597.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.i(I)V")
    public void method4601() {
        if (this.field3614 == -1) {
            this.field3614 = 0;
            if (this.field3603 != null && (this.field3604 == null || this.field3604[0] == 10)) {
                this.field3614 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3622[var1] != null) {
                    this.field3614 = 1;
                }
            }
        }
        if (this.field3635 == -1) {
            this.field3635 = this.field3612 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("je.a(Lgb;I)V")
    public void method4639(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4603(arg0, var2);
        }
    }

    @ObfuscatedName("je.l(Lgb;IB)V")
    public void method4603(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3236();
            if (var3 > 0) {
                if (this.field3603 == null || field3641) {
                    this.field3604 = new int[var3];
                    this.field3603 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3603[var4] = arg0.method3238();
                        this.field3604[var4] = arg0.method3236();
                    }
                } else {
                    arg0.field2545 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3638 = arg0.method3257();
        } else if (arg1 == 5) {
            int var5 = arg0.method3236();
            if (var5 > 0) {
                if (this.field3603 == null || field3641) {
                    this.field3604 = null;
                    this.field3603 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3603[var6] = arg0.method3238();
                    }
                } else {
                    arg0.field2545 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3610 = arg0.method3236();
        } else if (arg1 == 15) {
            this.field3608 = arg0.method3236();
        } else if (arg1 == 17) {
            this.field3612 = 0;
            this.field3595 = false;
        } else if (arg1 == 18) {
            this.field3595 = false;
        } else if (arg1 == 19) {
            this.field3614 = arg0.method3236();
        } else if (arg1 == 21) {
            this.field3615 = 0;
        } else if (arg1 == 22) {
            this.field3616 = true;
        } else if (arg1 == 23) {
            this.field3617 = true;
        } else if (arg1 == 24) {
            this.field3630 = arg0.method3238();
            if (this.field3630 == 65535) {
                this.field3630 = -1;
            }
        } else if (arg1 == 27) {
            this.field3612 = 1;
        } else if (arg1 == 28) {
            this.field3619 = arg0.method3236();
        } else if (arg1 == 29) {
            this.field3620 = arg0.method3237();
        } else if (arg1 == 39) {
            this.field3628 = arg0.method3237();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3622[arg1 - 30] = arg0.method3257();
            if (this.field3622[arg1 - 30].equalsIgnoreCase(class252.field3024)) {
                this.field3622[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3236();
            this.field3623 = new short[var7];
            this.field3607 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3623[var8] = (short) arg0.method3238();
                this.field3607[var8] = (short) arg0.method3238();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3236();
            this.field3599 = new short[var9];
            this.field3632 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3599[var10] = (short) arg0.method3238();
                this.field3632[var10] = (short) arg0.method3238();
            }
        } else if (arg1 == 62) {
            this.field3625 = true;
        } else if (arg1 == 64) {
            this.field3633 = false;
        } else if (arg1 == 65) {
            this.field3627 = arg0.method3238();
        } else if (arg1 == 66) {
            this.field3642 = arg0.method3238();
        } else if (arg1 == 67) {
            this.field3629 = arg0.method3238();
        } else if (arg1 == 68) {
            this.field3624 = arg0.method3238();
        } else if (arg1 == 69) {
            arg0.method3236();
        } else if (arg1 == 70) {
            this.field3609 = arg0.method3239();
        } else if (arg1 == 71) {
            this.field3631 = arg0.method3239();
        } else if (arg1 == 72) {
            this.field3618 = arg0.method3239();
        } else if (arg1 == 73) {
            this.field3621 = true;
        } else if (arg1 == 74) {
            this.field3634 = true;
        } else if (arg1 == 75) {
            this.field3635 = arg0.method3236();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3637 = arg0.method3238();
            if (this.field3637 == 65535) {
                this.field3637 = -1;
            }
            this.field3613 = arg0.method3238();
            if (this.field3613 == 65535) {
                this.field3613 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3238();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3236();
            this.field3606 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3606[var15] = arg0.method3238();
                if (this.field3606[var15] == 65535) {
                    this.field3606[var15] = -1;
                }
            }
            this.field3606[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3639 = arg0.method3238();
            this.field3640 = arg0.method3236();
        } else if (arg1 == 79) {
            this.field3626 = arg0.method3238();
            this.field3636 = arg0.method3238();
            this.field3640 = arg0.method3236();
            int var11 = arg0.method3236();
            this.field3643 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3643[var12] = arg0.method3238();
            }
        } else if (arg1 == 81) {
            this.field3615 = arg0.method3236() * 256;
        } else if (arg1 == 82) {
            this.field3611 = arg0.method3238();
        } else if (arg1 == 249) {
            this.field3644 = class277.method6(arg0, this.field3644);
        }
    }

    @ObfuscatedName("je.b(II)Z")
    public final boolean method4638(int arg0) {
        if (this.field3604 != null) {
            for (int var4 = 0; var4 < this.field3604.length; var4++) {
                if (this.field3604[var4] == arg0) {
                    return Statics.field316.method4194(this.field3603[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3603 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3603.length; var3++) {
                var2 &= Statics.field316.method4194(this.field3603[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("je.e(I)Z")
    public final boolean method4605() {
        if (this.field3603 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3603.length; var2++) {
            var1 &= Statics.field316.method4194(this.field3603[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("je.x(II[[IIIIB)Len;")
    public final class140 method4606(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3604 == null) {
            var7 = (long) ((this.field3602 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3602 << 10) + (arg0 << 3) + arg1);
        }
        class140 var9 = (class140) field3605.method3625(var7);
        if (var9 == null) {
            class126 var10 = this.method4645(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3616) {
                var10.field1731 = (short) (this.field3620 + 64);
                var10.field1732 = (short) (this.field3628 * 25 + 768);
                var10.method2391();
                var9 = var10;
            } else {
                var9 = var10.method2395(this.field3620 + 64, this.field3628 * 25 + 768, -50, -10, -50);
            }
            field3605.method3627(var9, var7);
        }
        if (this.field3616) {
            var9 = ((class126) var9).method2373();
        }
        if (this.field3615 >= 0) {
            if (var9 instanceof class132) {
                var9 = ((class132) var9).method2465(arg2, arg3, arg4, arg5, true, this.field3615);
            } else if (var9 instanceof class126) {
                var9 = ((class126) var9).method2441(arg2, arg3, arg4, arg5, true, this.field3615);
            }
        }
        return var9;
    }

    @ObfuscatedName("je.p(II[[IIIII)Lek;")
    public final class132 method4637(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3604 == null) {
            var7 = (long) ((this.field3602 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3602 << 10) + (arg0 << 3) + arg1);
        }
        class132 var9 = (class132) field3600.method3625(var7);
        if (var9 == null) {
            class126 var10 = this.method4645(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2395(this.field3620 + 64, this.field3628 * 25 + 768, -50, -10, -50);
            field3600.method3627(var9, var7);
        }
        if (this.field3615 >= 0) {
            var9 = var9.method2465(arg2, arg3, arg4, arg5, true, this.field3615);
        }
        return var9;
    }

    @ObfuscatedName("je.o(II[[IIIILkf;II)Lek;")
    public final class132 method4613(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class288 arg6, int arg7) {
        long var9;
        if (this.field3604 == null) {
            var9 = (long) ((this.field3602 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3602 << 10) + (arg0 << 3) + arg1);
        }
        class132 var11 = (class132) field3600.method3625(var9);
        if (var11 == null) {
            class126 var12 = this.method4645(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2395(this.field3620 + 64, this.field3628 * 25 + 768, -50, -10, -50);
            field3600.method3627(var11, var9);
        }
        if (arg6 == null && this.field3615 == -1) {
            return var11;
        }
        class132 var13;
        if (arg6 == null) {
            var13 = var11.method2466(true);
        } else {
            var13 = arg6.method4795(var11, arg7, arg1);
        }
        if (this.field3615 >= 0) {
            var13 = var13.method2465(arg2, arg3, arg4, arg5, false, this.field3615);
        }
        return var13;
    }

    @ObfuscatedName("je.c(III)Ldi;")
    public final class126 method4645(int arg0, int arg1) {
        class126 var3 = null;
        if (this.field3604 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3603 == null) {
                return null;
            }
            boolean var4 = this.field3625;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3603.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3603[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class126) field3598.method3625((long) var7);
                if (var3 == null) {
                    var3 = class126.method2374(Statics.field316, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2396();
                    }
                    field3598.method3627(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3601[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class126(field3601, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3604.length; var9++) {
                if (this.field3604[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3603[var8];
            boolean var11 = this.field3625 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class126) field3598.method3625((long) var10);
            if (var3 == null) {
                var3 = class126.method2374(Statics.field316, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2396();
                }
                field3598.method3627(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3627 == 128 && this.field3642 == 128 && this.field3629 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3609 == 0 && this.field3631 == 0 && this.field3618 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class126 var14 = new class126(var3, arg1 == 0 && !var12 && !var13, this.field3623 == null, this.field3599 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2380(256);
            var14.method2387(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2383();
        } else if (var15 == 2) {
            var14.method2384();
        } else if (var15 == 3) {
            var14.method2445();
        }
        if (this.field3623 != null) {
            for (int var16 = 0; var16 < this.field3623.length; var16++) {
                var14.method2435(this.field3623[var16], this.field3607[var16]);
            }
        }
        if (this.field3599 != null) {
            for (int var17 = 0; var17 < this.field3599.length; var17++) {
                var14.method2389(this.field3599[var17], this.field3632[var17]);
            }
        }
        if (var12) {
            var14.method2390(this.field3627, this.field3642, this.field3629);
        }
        if (var13) {
            var14.method2387(this.field3609, this.field3631, this.field3618);
        }
        return var14;
    }

    @ObfuscatedName("je.u(B)Lje;")
    public final class283 method4615() {
        int var1 = -1;
        if (this.field3637 != -1) {
            var1 = class238.method1567(this.field3637);
        } else if (this.field3613 != -1) {
            var1 = class238.field2771[this.field3613];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3606.length - 1) {
            var2 = this.field3606[var1];
        } else {
            var2 = this.field3606[this.field3606.length - 1];
        }
        return var2 == -1 ? null : method4427(var2);
    }

    @ObfuscatedName("je.k(III)I")
    public int method4611(int arg0, int arg1) {
        return class277.method4894(this.field3644, arg0, arg1);
    }

    @ObfuscatedName("je.z(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4604(int arg0, String arg1) {
        class210 var3 = this.field3644;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class208 var5 = (class208) var3.method3594((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2609;
            }
        }
        return var4;
    }

    @ObfuscatedName("je.w(I)Z")
    public boolean method4621() {
        if (this.field3606 == null) {
            return this.field3639 != -1 || this.field3643 != null;
        }
        for (int var1 = 0; var1 < this.field3606.length; var1++) {
            if (this.field3606[var1] != -1) {
                class283 var2 = method4427(this.field3606[var1]);
                if (var2.field3639 != -1 || var2.field3643 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
