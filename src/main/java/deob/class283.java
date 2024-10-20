package deob;

@ObfuscatedName("ja")
public class class283 extends class219 {

    @ObfuscatedName("ja.o")
    public static boolean field3610 = false;

    @ObfuscatedName("ja.d")
    public static class213 field3618 = new class213(4096);

    @ObfuscatedName("ja.h")
    public static class213 field3594 = new class213(500);

    @ObfuscatedName("ja.m")
    public static class213 field3639 = new class213(30);

    @ObfuscatedName("ja.z")
    public static class213 field3596 = new class213(30);

    @ObfuscatedName("ja.i")
    public static class126[] field3597 = new class126[4];

    @ObfuscatedName("ja.u")
    public int field3590;

    @ObfuscatedName("ja.x")
    public int[] field3599;

    @ObfuscatedName("ja.y")
    public int[] field3623;

    @ObfuscatedName("ja.a")
    public String field3601 = class252.field3032;

    @ObfuscatedName("ja.w")
    public short[] field3602;

    @ObfuscatedName("ja.n")
    public short[] field3633;

    @ObfuscatedName("ja.l")
    public short[] field3604;

    @ObfuscatedName("ja.s")
    public short[] field3620;

    @ObfuscatedName("ja.v")
    public int field3595 = 1;

    @ObfuscatedName("ja.q")
    public int field3607 = 1;

    @ObfuscatedName("ja.r")
    public int field3608 = 2;

    @ObfuscatedName("ja.j")
    public boolean field3609 = true;

    @ObfuscatedName("ja.b")
    public int field3598 = -1;

    @ObfuscatedName("ja.g")
    public int field3611 = -1;

    @ObfuscatedName("ja.f")
    public boolean field3621 = false;

    @ObfuscatedName("ja.p")
    public boolean field3613 = false;

    @ObfuscatedName("ja.e")
    public int field3600 = -1;

    @ObfuscatedName("ja.c")
    public int field3612 = 16;

    @ObfuscatedName("ja.ab")
    public int field3614 = 0;

    @ObfuscatedName("ja.ap")
    public int field3617 = 0;

    @ObfuscatedName("ja.ag")
    public String[] field3603 = new String[5];

    @ObfuscatedName("ja.at")
    public int field3619 = -1;

    @ObfuscatedName("ja.ac")
    public int field3593 = -1;

    @ObfuscatedName("ja.al")
    public boolean field3605 = false;

    @ObfuscatedName("ja.ah")
    public boolean field3622 = true;

    @ObfuscatedName("ja.af")
    public int field3629 = 128;

    @ObfuscatedName("ja.aq")
    public int field3624 = 128;

    @ObfuscatedName("ja.ai")
    public int field3625 = 128;

    @ObfuscatedName("ja.az")
    public int field3626 = 0;

    @ObfuscatedName("ja.aa")
    public int field3627 = 0;

    @ObfuscatedName("ja.av")
    public int field3628 = 0;

    @ObfuscatedName("ja.am")
    public boolean field3606 = false;

    @ObfuscatedName("ja.ao")
    public boolean field3630 = false;

    @ObfuscatedName("ja.ax")
    public int field3631 = -1;

    @ObfuscatedName("ja.ad")
    public int[] field3632;

    @ObfuscatedName("ja.au")
    public int field3638 = -1;

    @ObfuscatedName("ja.ar")
    public int field3634 = -1;

    @ObfuscatedName("ja.an")
    public int field3635 = -1;

    @ObfuscatedName("ja.ae")
    public int field3636 = 0;

    @ObfuscatedName("ja.aw")
    public int field3637 = 0;

    @ObfuscatedName("ja.ak")
    public int field3616 = 0;

    @ObfuscatedName("ja.as")
    public int[] field3615;

    @ObfuscatedName("ja.aj")
    public class210 field3640;

    @ObfuscatedName("gv.o(Ljf;Ljf;ZS)V")
    public static void method3448(class262 arg0, class262 arg1, boolean arg2) {
        Statics.field3591 = arg0;
        Statics.field3592 = arg1;
        field3610 = arg2;
    }

    @ObfuscatedName("bl.k(II)Lja;")
    public static class283 method713(int arg0) {
        class283 var1 = (class283) field3618.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3591.method4241(6, arg0);
        class283 var3 = new class283();
        var3.field3590 = arg0;
        if (var2 != null) {
            var3.method4608(new class195(var2));
        }
        var3.method4639();
        if (var3.field3630) {
            var3.field3608 = 0;
            var3.field3609 = false;
        }
        field3618.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ja.t(I)V")
    public void method4639() {
        if (this.field3598 == -1) {
            this.field3598 = 0;
            if (this.field3599 != null && (this.field3623 == null || this.field3623[0] == 10)) {
                this.field3598 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3603[var1] != null) {
                    this.field3598 = 1;
                }
            }
        }
        if (this.field3631 == -1) {
            this.field3631 = this.field3608 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ja.d(Lgc;I)V")
    public void method4608(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4609(arg0, var2);
        }
    }

    @ObfuscatedName("ja.h(Lgc;IB)V")
    public void method4609(class195 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3205();
            if (var3 > 0) {
                if (this.field3599 == null || field3610) {
                    this.field3623 = new int[var3];
                    this.field3599 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3599[var4] = arg0.method3207();
                        this.field3623[var4] = arg0.method3205();
                    }
                } else {
                    arg0.field2575 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3601 = arg0.method3284();
        } else if (arg1 == 5) {
            int var5 = arg0.method3205();
            if (var5 > 0) {
                if (this.field3599 == null || field3610) {
                    this.field3623 = null;
                    this.field3599 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3599[var6] = arg0.method3207();
                    }
                } else {
                    arg0.field2575 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3595 = arg0.method3205();
        } else if (arg1 == 15) {
            this.field3607 = arg0.method3205();
        } else if (arg1 == 17) {
            this.field3608 = 0;
            this.field3609 = false;
        } else if (arg1 == 18) {
            this.field3609 = false;
        } else if (arg1 == 19) {
            this.field3598 = arg0.method3205();
        } else if (arg1 == 21) {
            this.field3611 = 0;
        } else if (arg1 == 22) {
            this.field3621 = true;
        } else if (arg1 == 23) {
            this.field3613 = true;
        } else if (arg1 == 24) {
            this.field3600 = arg0.method3207();
            if (this.field3600 == 65535) {
                this.field3600 = -1;
            }
        } else if (arg1 == 27) {
            this.field3608 = 1;
        } else if (arg1 == 28) {
            this.field3612 = arg0.method3205();
        } else if (arg1 == 29) {
            this.field3614 = arg0.method3210();
        } else if (arg1 == 39) {
            this.field3617 = arg0.method3210() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3603[arg1 - 30] = arg0.method3284();
            if (this.field3603[arg1 - 30].equalsIgnoreCase(class252.field3027)) {
                this.field3603[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3205();
            this.field3602 = new short[var7];
            this.field3633 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3602[var8] = (short) arg0.method3207();
                this.field3633[var8] = (short) arg0.method3207();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3205();
            this.field3604 = new short[var9];
            this.field3620 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3604[var10] = (short) arg0.method3207();
                this.field3620[var10] = (short) arg0.method3207();
            }
        } else if (arg1 == 62) {
            this.field3605 = true;
        } else if (arg1 == 64) {
            this.field3622 = false;
        } else if (arg1 == 65) {
            this.field3629 = arg0.method3207();
        } else if (arg1 == 66) {
            this.field3624 = arg0.method3207();
        } else if (arg1 == 67) {
            this.field3625 = arg0.method3207();
        } else if (arg1 == 68) {
            this.field3593 = arg0.method3207();
        } else if (arg1 == 69) {
            arg0.method3205();
        } else if (arg1 == 70) {
            this.field3626 = arg0.method3346();
        } else if (arg1 == 71) {
            this.field3627 = arg0.method3346();
        } else if (arg1 == 72) {
            this.field3628 = arg0.method3346();
        } else if (arg1 == 73) {
            this.field3606 = true;
        } else if (arg1 == 74) {
            this.field3630 = true;
        } else if (arg1 == 75) {
            this.field3631 = arg0.method3205();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3638 = arg0.method3207();
            if (this.field3638 == 65535) {
                this.field3638 = -1;
            }
            this.field3634 = arg0.method3207();
            if (this.field3634 == 65535) {
                this.field3634 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3207();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3205();
            this.field3632 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3632[var15] = arg0.method3207();
                if (this.field3632[var15] == 65535) {
                    this.field3632[var15] = -1;
                }
            }
            this.field3632[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3635 = arg0.method3207();
            this.field3636 = arg0.method3205();
        } else if (arg1 == 79) {
            this.field3637 = arg0.method3207();
            this.field3616 = arg0.method3207();
            this.field3636 = arg0.method3205();
            int var11 = arg0.method3205();
            this.field3615 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3615[var12] = arg0.method3207();
            }
        } else if (arg1 == 81) {
            this.field3611 = arg0.method3205() * 256;
        } else if (arg1 == 82) {
            this.field3619 = arg0.method3207();
        } else if (arg1 == 249) {
            this.field3640 = class277.method241(arg0, this.field3640);
        }
    }

    @ObfuscatedName("ja.m(II)Z")
    public final boolean method4610(int arg0) {
        if (this.field3623 != null) {
            for (int var4 = 0; var4 < this.field3623.length; var4++) {
                if (this.field3623[var4] == arg0) {
                    return Statics.field3592.method4159(this.field3599[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3599 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3599.length; var3++) {
                var2 &= Statics.field3592.method4159(this.field3599[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ja.z(I)Z")
    public final boolean method4641() {
        if (this.field3599 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3599.length; var2++) {
            var1 &= Statics.field3592.method4159(this.field3599[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ja.i(II[[IIIIB)Led;")
    public final class140 method4612(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3623 == null) {
            var7 = (long) ((this.field3590 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3590 << 10) + (arg0 << 3) + arg1);
        }
        class140 var9 = (class140) field3639.method3601(var7);
        if (var9 == null) {
            class126 var10 = this.method4615(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3621) {
                var10.field1732 = (short) (this.field3614 + 64);
                var10.field1743 = (short) (this.field3617 + 768);
                var10.method2389();
                var9 = var10;
            } else {
                var9 = var10.method2393(this.field3614 + 64, this.field3617 + 768, -50, -10, -50);
            }
            field3639.method3603(var9, var7);
        }
        if (this.field3621) {
            var9 = ((class126) var9).method2377();
        }
        if (this.field3611 >= 0) {
            if (var9 instanceof class132) {
                var9 = ((class132) var9).method2459(arg2, arg3, arg4, arg5, true, this.field3611);
            } else if (var9 instanceof class126) {
                var9 = ((class126) var9).method2374(arg2, arg3, arg4, arg5, true, this.field3611);
            }
        }
        return var9;
    }

    @ObfuscatedName("ja.u(II[[IIIII)Lei;")
    public final class132 method4613(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3623 == null) {
            var7 = (long) ((this.field3590 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3590 << 10) + (arg0 << 3) + arg1);
        }
        class132 var9 = (class132) field3596.method3601(var7);
        if (var9 == null) {
            class126 var10 = this.method4615(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2393(this.field3614 + 64, this.field3617 + 768, -50, -10, -50);
            field3596.method3603(var9, var7);
        }
        if (this.field3611 >= 0) {
            var9 = var9.method2459(arg2, arg3, arg4, arg5, true, this.field3611);
        }
        return var9;
    }

    @ObfuscatedName("ja.x(II[[IIIILke;IB)Lei;")
    public final class132 method4614(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class288 arg6, int arg7) {
        long var9;
        if (this.field3623 == null) {
            var9 = (long) ((this.field3590 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3590 << 10) + (arg0 << 3) + arg1);
        }
        class132 var11 = (class132) field3596.method3601(var9);
        if (var11 == null) {
            class126 var12 = this.method4615(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2393(this.field3614 + 64, this.field3617 + 768, -50, -10, -50);
            field3596.method3603(var11, var9);
        }
        if (arg6 == null && this.field3611 == -1) {
            return var11;
        }
        class132 var13;
        if (arg6 == null) {
            var13 = var11.method2505(true);
        } else {
            var13 = arg6.method4806(var11, arg7, arg1);
        }
        if (this.field3611 >= 0) {
            var13 = var13.method2459(arg2, arg3, arg4, arg5, false, this.field3611);
        }
        return var13;
    }

    @ObfuscatedName("ja.y(IIB)Ldg;")
    public final class126 method4615(int arg0, int arg1) {
        class126 var3 = null;
        if (this.field3623 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3599 == null) {
                return null;
            }
            boolean var4 = this.field3605;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3599.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3599[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class126) field3594.method3601((long) var7);
                if (var3 == null) {
                    var3 = class126.method2418(Statics.field3592, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2387();
                    }
                    field3594.method3603(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3597[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class126(field3597, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3623.length; var9++) {
                if (this.field3623[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3599[var8];
            boolean var11 = this.field3605 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class126) field3594.method3601((long) var10);
            if (var3 == null) {
                var3 = class126.method2418(Statics.field3592, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2387();
                }
                field3594.method3603(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3629 == 128 && this.field3624 == 128 && this.field3625 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3626 == 0 && this.field3627 == 0 && this.field3628 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class126 var14 = new class126(var3, arg1 == 0 && !var12 && !var13, this.field3602 == null, this.field3604 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2379(256);
            var14.method2384(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2380();
        } else if (var15 == 2) {
            var14.method2398();
        } else if (var15 == 3) {
            var14.method2383();
        }
        if (this.field3602 != null) {
            for (int var16 = 0; var16 < this.field3602.length; var16++) {
                var14.method2385(this.field3602[var16], this.field3633[var16]);
            }
        }
        if (this.field3604 != null) {
            for (int var17 = 0; var17 < this.field3604.length; var17++) {
                var14.method2386(this.field3604[var17], this.field3620[var17]);
            }
        }
        if (var12) {
            var14.method2388(this.field3629, this.field3624, this.field3625);
        }
        if (var13) {
            var14.method2384(this.field3626, this.field3627, this.field3628);
        }
        return var14;
    }

    @ObfuscatedName("ja.a(I)Lja;")
    public final class283 method4616() {
        int var1 = -1;
        if (this.field3638 != -1) {
            var1 = class238.method1854(this.field3638);
        } else if (this.field3634 != -1) {
            var1 = class238.field2779[this.field3634];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3632.length - 1) {
            var2 = this.field3632[var1];
        } else {
            var2 = this.field3632[this.field3632.length - 1];
        }
        return var2 == -1 ? null : method713(var2);
    }

    @ObfuscatedName("ja.v(IIB)I")
    public int method4617(int arg0, int arg1) {
        return class277.method2827(this.field3640, arg0, arg1);
    }

    @ObfuscatedName("ja.q(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4622(int arg0, String arg1) {
        return class277.method271(this.field3640, arg0, arg1);
    }

    @ObfuscatedName("fb.r(B)V")
    public static void method3106() {
        field3618.method3604();
        field3594.method3604();
        field3639.method3604();
        field3596.method3604();
    }

    @ObfuscatedName("ja.j(I)Z")
    public boolean method4619() {
        if (this.field3632 == null) {
            return this.field3635 != -1 || this.field3615 != null;
        }
        for (int var1 = 0; var1 < this.field3632.length; var1++) {
            if (this.field3632[var1] != -1) {
                class283 var2 = method713(this.field3632[var1]);
                if (var2.field3635 != -1 || var2.field3615 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
