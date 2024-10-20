package deob;

@ObfuscatedName("jj")
public class class263 extends class202 {

    @ObfuscatedName("jj.m")
    public static boolean field3531 = false;

    @ObfuscatedName("jj.j")
    public static class197 field3529 = new class197(4096);

    @ObfuscatedName("jj.v")
    public static class197 field3491 = new class197(500);

    @ObfuscatedName("jj.x")
    public static class197 field3516 = new class197(30);

    @ObfuscatedName("jj.e")
    public static class197 field3490 = new class197(30);

    @ObfuscatedName("jj.l")
    public static class127[] field3494 = new class127[4];

    @ObfuscatedName("jj.b")
    public int field3495;

    @ObfuscatedName("jj.n")
    public int[] field3496;

    @ObfuscatedName("jj.c")
    public int[] field3497;

    @ObfuscatedName("jj.a")
    public String field3498 = "null";

    @ObfuscatedName("jj.y")
    public short[] field3504;

    @ObfuscatedName("jj.w")
    public short[] field3500;

    @ObfuscatedName("jj.k")
    public short[] field3501;

    @ObfuscatedName("jj.t")
    public short[] field3502;

    @ObfuscatedName("jj.h")
    public int field3503 = 1;

    @ObfuscatedName("jj.u")
    public int field3525 = 1;

    @ObfuscatedName("jj.r")
    public int field3527 = 2;

    @ObfuscatedName("jj.g")
    public boolean field3506 = true;

    @ObfuscatedName("jj.z")
    public int field3507 = -1;

    @ObfuscatedName("jj.o")
    public int field3508 = -1;

    @ObfuscatedName("jj.d")
    public boolean field3509 = false;

    @ObfuscatedName("jj.s")
    public boolean field3510 = false;

    @ObfuscatedName("jj.f")
    public int field3511 = -1;

    @ObfuscatedName("jj.q")
    public int field3492 = 16;

    @ObfuscatedName("jj.al")
    public int field3513 = 0;

    @ObfuscatedName("jj.ao")
    public int field3499 = 0;

    @ObfuscatedName("jj.aq")
    public String[] field3515 = new String[5];

    @ObfuscatedName("jj.ab")
    public int field3493 = -1;

    @ObfuscatedName("jj.as")
    public int field3517 = -1;

    @ObfuscatedName("jj.ag")
    public boolean field3518 = false;

    @ObfuscatedName("jj.ap")
    public boolean field3505 = true;

    @ObfuscatedName("jj.av")
    public int field3520 = 128;

    @ObfuscatedName("jj.ak")
    public int field3514 = 128;

    @ObfuscatedName("jj.at")
    public int field3522 = 128;

    @ObfuscatedName("jj.an")
    public int field3523 = 0;

    @ObfuscatedName("jj.ah")
    public int field3524 = 0;

    @ObfuscatedName("jj.am")
    public int field3521 = 0;

    @ObfuscatedName("jj.ay")
    public boolean field3526 = false;

    @ObfuscatedName("jj.az")
    public boolean field3488 = false;

    @ObfuscatedName("jj.aw")
    public int field3528 = -1;

    @ObfuscatedName("jj.au")
    public int[] field3519;

    @ObfuscatedName("jj.ac")
    public int field3530 = -1;

    @ObfuscatedName("jj.ai")
    public int field3537 = -1;

    @ObfuscatedName("jj.ax")
    public int field3533 = -1;

    @ObfuscatedName("jj.af")
    public int field3512 = 0;

    @ObfuscatedName("jj.aa")
    public int field3534 = 0;

    @ObfuscatedName("jj.ad")
    public int field3535 = 0;

    @ObfuscatedName("jj.aj")
    public int[] field3536;

    @ObfuscatedName("jj.ae")
    public class194 field3538;

    @ObfuscatedName("f.m(IB)Ljj;")
    public static class263 method190(int arg0) {
        class263 var1 = (class263) field3529.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3487.method3930(6, arg0);
        class263 var3 = new class263();
        var3.field3495 = arg0;
        if (var2 != null) {
            var3.method4359(new class181(var2));
        }
        var3.method4328();
        if (var3.field3488) {
            var3.field3527 = 0;
            var3.field3506 = false;
        }
        field3529.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.p(I)V")
    public void method4328() {
        if (this.field3507 == -1) {
            this.field3507 = 0;
            if (this.field3496 != null && (this.field3497 == null || this.field3497[0] == 10)) {
                this.field3507 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3515[var1] != null) {
                    this.field3507 = 1;
                }
            }
        }
        if (this.field3528 == -1) {
            this.field3528 = this.field3527 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jj.i(Lfv;I)V")
    public void method4359(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4330(arg0, var2);
        }
    }

    @ObfuscatedName("jj.j(Lfv;IB)V")
    public void method4330(class181 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3012();
            if (var3 > 0) {
                if (this.field3496 == null || field3531) {
                    this.field3497 = new int[var3];
                    this.field3496 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3496[var4] = arg0.method3009();
                        this.field3497[var4] = arg0.method3012();
                    }
                } else {
                    arg0.field2498 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3498 = arg0.method3021();
        } else if (arg1 == 5) {
            int var5 = arg0.method3012();
            if (var5 > 0) {
                if (this.field3496 == null || field3531) {
                    this.field3497 = null;
                    this.field3496 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3496[var6] = arg0.method3009();
                    }
                } else {
                    arg0.field2498 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3503 = arg0.method3012();
        } else if (arg1 == 15) {
            this.field3525 = arg0.method3012();
        } else if (arg1 == 17) {
            this.field3527 = 0;
            this.field3506 = false;
        } else if (arg1 == 18) {
            this.field3506 = false;
        } else if (arg1 == 19) {
            this.field3507 = arg0.method3012();
        } else if (arg1 == 21) {
            this.field3508 = 0;
        } else if (arg1 == 22) {
            this.field3509 = true;
        } else if (arg1 == 23) {
            this.field3510 = true;
        } else if (arg1 == 24) {
            this.field3511 = arg0.method3009();
            if (this.field3511 == 65535) {
                this.field3511 = -1;
            }
        } else if (arg1 == 27) {
            this.field3527 = 1;
        } else if (arg1 == 28) {
            this.field3492 = arg0.method3012();
        } else if (arg1 == 29) {
            this.field3513 = arg0.method3013();
        } else if (arg1 == 39) {
            this.field3499 = arg0.method3013() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3515[arg1 - 30] = arg0.method3021();
            if (this.field3515[arg1 - 30].equalsIgnoreCase(class233.field3100)) {
                this.field3515[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3012();
            this.field3504 = new short[var7];
            this.field3500 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3504[var8] = (short) arg0.method3009();
                this.field3500[var8] = (short) arg0.method3009();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3012();
            this.field3501 = new short[var9];
            this.field3502 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3501[var10] = (short) arg0.method3009();
                this.field3502[var10] = (short) arg0.method3009();
            }
        } else if (arg1 == 62) {
            this.field3518 = true;
        } else if (arg1 == 64) {
            this.field3505 = false;
        } else if (arg1 == 65) {
            this.field3520 = arg0.method3009();
        } else if (arg1 == 66) {
            this.field3514 = arg0.method3009();
        } else if (arg1 == 67) {
            this.field3522 = arg0.method3009();
        } else if (arg1 == 68) {
            this.field3517 = arg0.method3009();
        } else if (arg1 == 69) {
            arg0.method3012();
        } else if (arg1 == 70) {
            this.field3523 = arg0.method3015();
        } else if (arg1 == 71) {
            this.field3524 = arg0.method3015();
        } else if (arg1 == 72) {
            this.field3521 = arg0.method3015();
        } else if (arg1 == 73) {
            this.field3526 = true;
        } else if (arg1 == 74) {
            this.field3488 = true;
        } else if (arg1 == 75) {
            this.field3528 = arg0.method3012();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3530 = arg0.method3009();
            if (this.field3530 == 65535) {
                this.field3530 = -1;
            }
            this.field3537 = arg0.method3009();
            if (this.field3537 == 65535) {
                this.field3537 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3009();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3012();
            this.field3519 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3519[var15] = arg0.method3009();
                if (this.field3519[var15] == 65535) {
                    this.field3519[var15] = -1;
                }
            }
            this.field3519[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3533 = arg0.method3009();
            this.field3512 = arg0.method3012();
        } else if (arg1 == 79) {
            this.field3534 = arg0.method3009();
            this.field3535 = arg0.method3009();
            this.field3512 = arg0.method3012();
            int var11 = arg0.method3012();
            this.field3536 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3536[var12] = arg0.method3009();
            }
        } else if (arg1 == 81) {
            this.field3508 = arg0.method3012() * 256;
        } else if (arg1 == 82) {
            this.field3493 = arg0.method3009();
        } else if (arg1 == 249) {
            this.field3538 = class257.method2376(arg0, this.field3538);
        }
    }

    @ObfuscatedName("jj.v(II)Z")
    public final boolean method4331(int arg0) {
        if (this.field3497 != null) {
            for (int var4 = 0; var4 < this.field3497.length; var4++) {
                if (this.field3497[var4] == arg0) {
                    return Statics.field3489.method3932(this.field3496[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3496 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3496.length; var3++) {
                var2 &= Statics.field3489.method3932(this.field3496[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jj.x(B)Z")
    public final boolean method4332() {
        if (this.field3496 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3496.length; var2++) {
            var1 &= Statics.field3489.method3932(this.field3496[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jj.e(II[[IIIII)Lei;")
    public final class141 method4333(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3497 == null) {
            var7 = (long) ((this.field3495 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3495 << 10) + (arg0 << 3) + arg1);
        }
        class141 var9 = (class141) field3516.method3419(var7);
        if (var9 == null) {
            class127 var10 = this.method4374(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3509) {
                var10.field1750 = (short) (this.field3513 + 64);
                var10.field1747 = (short) (this.field3499 + 768);
                var10.method2313();
                var9 = var10;
            } else {
                var9 = var10.method2335(this.field3513 + 64, this.field3499 + 768, -50, -10, -50);
            }
            field3516.method3418(var9, var7);
        }
        if (this.field3509) {
            var9 = ((class127) var9).method2321();
        }
        if (this.field3508 >= 0) {
            if (var9 instanceof class133) {
                var9 = ((class133) var9).method2380(arg2, arg3, arg4, arg5, true, this.field3508);
            } else if (var9 instanceof class127) {
                var9 = ((class127) var9).method2297(arg2, arg3, arg4, arg5, true, this.field3508);
            }
        }
        return var9;
    }

    @ObfuscatedName("jj.l(II[[IIIII)Len;")
    public final class133 method4334(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3497 == null) {
            var7 = (long) ((this.field3495 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3495 << 10) + (arg0 << 3) + arg1);
        }
        class133 var9 = (class133) field3490.method3419(var7);
        if (var9 == null) {
            class127 var10 = this.method4374(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2335(this.field3513 + 64, this.field3499 + 768, -50, -10, -50);
            field3490.method3418(var9, var7);
        }
        if (this.field3508 >= 0) {
            var9 = var9.method2380(arg2, arg3, arg4, arg5, true, this.field3508);
        }
        return var9;
    }

    @ObfuscatedName("jj.b(II[[IIIILjf;II)Len;")
    public final class133 method4327(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class268 arg6, int arg7) {
        long var9;
        if (this.field3497 == null) {
            var9 = (long) ((this.field3495 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3495 << 10) + (arg0 << 3) + arg1);
        }
        class133 var11 = (class133) field3490.method3419(var9);
        if (var11 == null) {
            class127 var12 = this.method4374(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2335(this.field3513 + 64, this.field3499 + 768, -50, -10, -50);
            field3490.method3418(var11, var9);
        }
        if (arg6 == null && this.field3508 == -1) {
            return var11;
        }
        class133 var13;
        if (arg6 == null) {
            var13 = var11.method2409(true);
        } else {
            var13 = arg6.method4507(var11, arg7, arg1);
        }
        if (this.field3508 >= 0) {
            var13 = var13.method2380(arg2, arg3, arg4, arg5, false, this.field3508);
        }
        return var13;
    }

    @ObfuscatedName("jj.n(III)Ldv;")
    public final class127 method4374(int arg0, int arg1) {
        class127 var3 = null;
        if (this.field3497 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3496 == null) {
                return null;
            }
            boolean var4 = this.field3518;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3496.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3496[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class127) field3491.method3419((long) var7);
                if (var3 == null) {
                    var3 = class127.method2302(Statics.field3489, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2330();
                    }
                    field3491.method3418(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3494[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class127(field3494, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3497.length; var9++) {
                if (this.field3497[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3496[var8];
            boolean var11 = this.field3518 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class127) field3491.method3419((long) var10);
            if (var3 == null) {
                var3 = class127.method2302(Statics.field3489, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2330();
                }
                field3491.method3418(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3520 == 128 && this.field3514 == 128 && this.field3522 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3523 == 0 && this.field3524 == 0 && this.field3521 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class127 var14 = new class127(var3, arg1 == 0 && !var12 && !var13, this.field3504 == null, this.field3501 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2363(256);
            var14.method2345(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2299();
        } else if (var15 == 2) {
            var14.method2325();
        } else if (var15 == 3) {
            var14.method2309();
        }
        if (this.field3504 != null) {
            for (int var16 = 0; var16 < this.field3504.length; var16++) {
                var14.method2360(this.field3504[var16], this.field3500[var16]);
            }
        }
        if (this.field3501 != null) {
            for (int var17 = 0; var17 < this.field3501.length; var17++) {
                var14.method2305(this.field3501[var17], this.field3502[var17]);
            }
        }
        if (var12) {
            var14.method2356(this.field3520, this.field3514, this.field3522);
        }
        if (var13) {
            var14.method2345(this.field3523, this.field3524, this.field3521);
        }
        return var14;
    }

    @ObfuscatedName("jj.c(I)Ljj;")
    public final class263 method4337() {
        int var1 = -1;
        if (this.field3530 != -1) {
            var1 = class219.method1684(this.field3530);
        } else if (this.field3537 != -1) {
            var1 = class219.field2689[this.field3537];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3519.length - 1) {
            var2 = this.field3519[var1];
        } else {
            var2 = this.field3519[this.field3519.length - 1];
        }
        return var2 == -1 ? null : method190(var2);
    }

    @ObfuscatedName("jj.a(III)I")
    public int method4348(int arg0, int arg1) {
        return class257.method2750(this.field3538, arg0, arg1);
    }

    @ObfuscatedName("jj.y(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4339(int arg0, String arg1) {
        return class257.method2471(this.field3538, arg0, arg1);
    }

    @ObfuscatedName("jj.w(B)Z")
    public boolean method4340() {
        if (this.field3519 == null) {
            return this.field3533 != -1 || this.field3536 != null;
        }
        for (int var1 = 0; var1 < this.field3519.length; var1++) {
            if (this.field3519[var1] != -1) {
                class263 var2 = method190(this.field3519[var1]);
                if (var2.field3533 != -1 || var2.field3536 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
