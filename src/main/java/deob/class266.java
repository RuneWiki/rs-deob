package deob;

@ObfuscatedName("jj")
public class class266 extends class185 {

    @ObfuscatedName("jj.l")
    public static class155 field3437 = new class155(64);

    @ObfuscatedName("jj.s")
    public static class155 field3485 = new class155(50);

    @ObfuscatedName("jj.b")
    public static class155 field3467 = new class155(200);

    @ObfuscatedName("jj.w")
    public int field3441;

    @ObfuscatedName("jj.k")
    public int field3442;

    @ObfuscatedName("jj.i")
    public String field3448 = class234.field2795;

    @ObfuscatedName("jj.x")
    public short[] field3444;

    @ObfuscatedName("jj.f")
    public short[] field3445;

    @ObfuscatedName("jj.g")
    public short[] field3475;

    @ObfuscatedName("jj.u")
    public short[] field3446;

    @ObfuscatedName("jj.t")
    public int field3434 = 2000;

    @ObfuscatedName("jj.p")
    public int field3449 = 0;

    @ObfuscatedName("jj.m")
    public int field3450 = 0;

    @ObfuscatedName("jj.r")
    public int field3451 = 0;

    @ObfuscatedName("jj.o")
    public int field3481 = 0;

    @ObfuscatedName("jj.j")
    public int field3466 = 0;

    @ObfuscatedName("jj.ay")
    public int field3443 = 0;

    @ObfuscatedName("jj.am")
    public int field3455 = 1;

    @ObfuscatedName("jj.ag")
    public boolean field3456 = false;

    @ObfuscatedName("jj.ae")
    public String[] field3457 = new String[] { null, null, class234.field2788, null, null };

    @ObfuscatedName("jj.ac")
    public String[] field3458 = new String[] { null, null, null, null, class234.field2789 };

    @ObfuscatedName("jj.at")
    public int field3459 = -2;

    @ObfuscatedName("jj.ak")
    public int field3460 = -1;

    @ObfuscatedName("jj.ax")
    public int field3461 = -1;

    @ObfuscatedName("jj.ar")
    public int field3462 = 0;

    @ObfuscatedName("jj.al")
    public int field3463 = -1;

    @ObfuscatedName("jj.aa")
    public int field3478 = -1;

    @ObfuscatedName("jj.as")
    public int field3465 = 0;

    @ObfuscatedName("jj.aw")
    public int field3452 = -1;

    @ObfuscatedName("jj.az")
    public int field3447 = -1;

    @ObfuscatedName("jj.ah")
    public int field3468 = -1;

    @ObfuscatedName("jj.ap")
    public int field3469 = -1;

    @ObfuscatedName("jj.aj")
    public int field3453 = -1;

    @ObfuscatedName("jj.an")
    public int field3439 = -1;

    @ObfuscatedName("jj.ai")
    public int[] field3440;

    @ObfuscatedName("jj.ab")
    public int[] field3473;

    @ObfuscatedName("jj.au")
    public int field3474 = -1;

    @ObfuscatedName("jj.ad")
    public int field3470 = -1;

    @ObfuscatedName("jj.af")
    public int field3464 = 128;

    @ObfuscatedName("jj.av")
    public int field3477 = 128;

    @ObfuscatedName("jj.ao")
    public int field3438 = 128;

    @ObfuscatedName("jj.bj")
    public int field3479 = 0;

    @ObfuscatedName("jj.bn")
    public int field3480 = 0;

    @ObfuscatedName("jj.bi")
    public int field3482 = 0;

    @ObfuscatedName("jj.bp")
    public class327 field3435;

    @ObfuscatedName("jj.br")
    public boolean field3476 = false;

    @ObfuscatedName("jj.bq")
    public int field3484 = -1;

    @ObfuscatedName("jj.bx")
    public int field3454 = -1;

    @ObfuscatedName("jj.bc")
    public int field3486 = -1;

    @ObfuscatedName("jj.bw")
    public int field3487 = -1;

    @ObfuscatedName("jq.n(II)Ljj;")
    public static class266 method4793(int arg0) {
        class266 var1 = (class266) field3437.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3682.method4032(10, arg0);
        class266 var3 = new class266();
        var3.field3441 = arg0;
        if (var2 != null) {
            var3.method4524(new class311(var2));
        }
        var3.method4514();
        if (var3.field3470 != -1) {
            var3.method4497(method4793(var3.field3470), method4793(var3.field3474));
        }
        if (var3.field3454 != -1) {
            var3.method4465(method4793(var3.field3454), method4793(var3.field3484));
        }
        if (var3.field3487 != -1) {
            var3.method4466(method4793(var3.field3487), method4793(var3.field3486));
        }
        if (!Statics.field3880 && var3.field3456) {
            var3.field3448 = class234.field3054;
            var3.field3476 = false;
            var3.field3457 = null;
            var3.field3458 = null;
            var3.field3459 = -1;
            var3.field3482 = 0;
            if (var3.field3435 != null) {
                boolean var4 = false;
                for (class190 var5 = var3.field3435.method5651(); var5 != null; var5 = var3.field3435.method5655()) {
                    class261 var6 = class261.method4072((int) var5.field2141);
                    if (var6.field3337) {
                        var5.method3486();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3435 = null;
                }
            }
        }
        field3437.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.v(I)V")
    public void method4514() {
    }

    @ObfuscatedName("jj.d(Lkx;I)V")
    public void method4524(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4463(arg0, var2);
        }
    }

    @ObfuscatedName("jj.c(Lkx;IB)V")
    public void method4463(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3442 = arg0.method5247();
        } else if (arg1 == 2) {
            this.field3448 = arg0.method5465();
        } else if (arg1 == 4) {
            this.field3434 = arg0.method5247();
        } else if (arg1 == 5) {
            this.field3449 = arg0.method5247();
        } else if (arg1 == 6) {
            this.field3450 = arg0.method5247();
        } else if (arg1 == 7) {
            this.field3481 = arg0.method5247();
            if (this.field3481 > 32767) {
                this.field3481 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3466 = arg0.method5247();
            if (this.field3466 > 32767) {
                this.field3466 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3443 = 1;
        } else if (arg1 == 12) {
            this.field3455 = arg0.method5455();
        } else if (arg1 == 16) {
            this.field3456 = true;
        } else if (arg1 == 23) {
            this.field3460 = arg0.method5247();
            this.field3462 = arg0.method5310();
        } else if (arg1 == 24) {
            this.field3461 = arg0.method5247();
        } else if (arg1 == 25) {
            this.field3463 = arg0.method5247();
            this.field3465 = arg0.method5310();
        } else if (arg1 == 26) {
            this.field3478 = arg0.method5247();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3457[arg1 - 30] = arg0.method5465();
            if (this.field3457[arg1 - 30].equalsIgnoreCase(class234.field2964)) {
                this.field3457[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3458[arg1 - 35] = arg0.method5465();
        } else if (arg1 == 40) {
            int var3 = arg0.method5310();
            this.field3444 = new short[var3];
            this.field3445 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3444[var4] = (short) arg0.method5247();
                this.field3445[var4] = (short) arg0.method5247();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5310();
            this.field3475 = new short[var5];
            this.field3446 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3475[var6] = (short) arg0.method5247();
                this.field3446[var6] = (short) arg0.method5247();
            }
        } else if (arg1 == 42) {
            this.field3459 = arg0.method5293();
        } else if (arg1 == 65) {
            this.field3476 = true;
        } else if (arg1 == 78) {
            this.field3452 = arg0.method5247();
        } else if (arg1 == 79) {
            this.field3447 = arg0.method5247();
        } else if (arg1 == 90) {
            this.field3468 = arg0.method5247();
        } else if (arg1 == 91) {
            this.field3453 = arg0.method5247();
        } else if (arg1 == 92) {
            this.field3469 = arg0.method5247();
        } else if (arg1 == 93) {
            this.field3439 = arg0.method5247();
        } else if (arg1 == 95) {
            this.field3451 = arg0.method5247();
        } else if (arg1 == 97) {
            this.field3474 = arg0.method5247();
        } else if (arg1 == 98) {
            this.field3470 = arg0.method5247();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3440 == null) {
                this.field3440 = new int[10];
                this.field3473 = new int[10];
            }
            this.field3440[arg1 - 100] = arg0.method5247();
            this.field3473[arg1 - 100] = arg0.method5247();
        } else if (arg1 == 110) {
            this.field3464 = arg0.method5247();
        } else if (arg1 == 111) {
            this.field3477 = arg0.method5247();
        } else if (arg1 == 112) {
            this.field3438 = arg0.method5247();
        } else if (arg1 == 113) {
            this.field3479 = arg0.method5293();
        } else if (arg1 == 114) {
            this.field3480 = arg0.method5293() * 5;
        } else if (arg1 == 115) {
            this.field3482 = arg0.method5310();
        } else if (arg1 == 139) {
            this.field3484 = arg0.method5247();
        } else if (arg1 == 140) {
            this.field3454 = arg0.method5247();
        } else if (arg1 == 148) {
            this.field3486 = arg0.method5247();
        } else if (arg1 == 149) {
            this.field3487 = arg0.method5247();
        } else if (arg1 == 249) {
            this.field3435 = class259.method2675(arg0, this.field3435);
        }
    }

    @ObfuscatedName("jj.y(Ljj;Ljj;I)V")
    public void method4497(class266 arg0, class266 arg1) {
        this.field3442 = arg0.field3442;
        this.field3434 = arg0.field3434;
        this.field3449 = arg0.field3449;
        this.field3450 = arg0.field3450;
        this.field3451 = arg0.field3451;
        this.field3481 = arg0.field3481;
        this.field3466 = arg0.field3466;
        this.field3444 = arg0.field3444;
        this.field3445 = arg0.field3445;
        this.field3475 = arg0.field3475;
        this.field3446 = arg0.field3446;
        this.field3448 = arg1.field3448;
        this.field3456 = arg1.field3456;
        this.field3455 = arg1.field3455;
        this.field3443 = 1;
    }

    @ObfuscatedName("jj.h(Ljj;Ljj;I)V")
    public void method4465(class266 arg0, class266 arg1) {
        this.field3442 = arg0.field3442;
        this.field3434 = arg0.field3434;
        this.field3449 = arg0.field3449;
        this.field3450 = arg0.field3450;
        this.field3451 = arg0.field3451;
        this.field3481 = arg0.field3481;
        this.field3466 = arg0.field3466;
        this.field3444 = arg1.field3444;
        this.field3445 = arg1.field3445;
        this.field3475 = arg1.field3475;
        this.field3446 = arg1.field3446;
        this.field3448 = arg1.field3448;
        this.field3456 = arg1.field3456;
        this.field3443 = arg1.field3443;
        this.field3460 = arg1.field3460;
        this.field3461 = arg1.field3461;
        this.field3452 = arg1.field3452;
        this.field3463 = arg1.field3463;
        this.field3478 = arg1.field3478;
        this.field3447 = arg1.field3447;
        this.field3468 = arg1.field3468;
        this.field3469 = arg1.field3469;
        this.field3453 = arg1.field3453;
        this.field3439 = arg1.field3439;
        this.field3482 = arg1.field3482;
        this.field3457 = arg1.field3457;
        this.field3458 = new String[5];
        if (arg1.field3458 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3458[var3] = arg1.field3458[var3];
            }
        }
        this.field3458[4] = class234.field2794;
        this.field3455 = 0;
    }

    @ObfuscatedName("jj.z(Ljj;Ljj;I)V")
    public void method4466(class266 arg0, class266 arg1) {
        this.field3442 = arg0.field3442;
        this.field3434 = arg0.field3434;
        this.field3449 = arg0.field3449;
        this.field3450 = arg0.field3450;
        this.field3451 = arg0.field3451;
        this.field3481 = arg0.field3481;
        this.field3466 = arg0.field3466;
        this.field3444 = arg0.field3444;
        this.field3445 = arg0.field3445;
        this.field3475 = arg0.field3475;
        this.field3446 = arg0.field3446;
        this.field3443 = arg0.field3443;
        this.field3448 = arg1.field3448;
        this.field3455 = 0;
        this.field3456 = false;
        this.field3476 = false;
    }

    @ObfuscatedName("jj.e(II)Lek;")
    public final class131 method4467(int arg0) {
        if (this.field3440 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3473[var3] && this.field3473[var3] != 0) {
                    var2 = this.field3440[var3];
                }
            }
            if (var2 != -1) {
                return method4793(var2).method4467(1);
            }
        }
        class131 var4 = class131.method2777(Statics.field50, this.field3442, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3464 != 128 || this.field3477 != 128 || this.field3438 != 128) {
            var4.method2716(this.field3464, this.field3477, this.field3438);
        }
        if (this.field3444 != null) {
            for (int var5 = 0; var5 < this.field3444.length; var5++) {
                var4.method2715(this.field3444[var5], this.field3445[var5]);
            }
        }
        if (this.field3475 != null) {
            for (int var6 = 0; var6 < this.field3475.length; var6++) {
                var4.method2714(this.field3475[var6], this.field3446[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jj.q(II)Lef;")
    public final class137 method4494(int arg0) {
        if (this.field3440 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3473[var3] && this.field3473[var3] != 0) {
                    var2 = this.field3440[var3];
                }
            }
            if (var2 != -1) {
                return method4793(var2).method4494(1);
            }
        }
        class137 var4 = (class137) field3485.method3220((long) this.field3441);
        if (var4 != null) {
            return var4;
        }
        class131 var5 = class131.method2777(Statics.field50, this.field3442, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3464 != 128 || this.field3477 != 128 || this.field3438 != 128) {
            var5.method2716(this.field3464, this.field3477, this.field3438);
        }
        if (this.field3444 != null) {
            for (int var6 = 0; var6 < this.field3444.length; var6++) {
                var5.method2715(this.field3444[var6], this.field3445[var6]);
            }
        }
        if (this.field3475 != null) {
            for (int var7 = 0; var7 < this.field3475.length; var7++) {
                var5.method2714(this.field3475[var7], this.field3446[var7]);
            }
        }
        class137 var8 = var5.method2721(this.field3479 + 64, this.field3480 + 768, -50, -10, -50);
        var8.field1697 = true;
        field3485.method3217(var8, (long) this.field3441);
        return var8;
    }

    @ObfuscatedName("jj.l(II)Ljj;")
    public class266 method4469(int arg0) {
        if (this.field3440 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3473[var3] && this.field3473[var3] != 0) {
                    var2 = this.field3440[var3];
                }
            }
            if (var2 != -1) {
                return method4793(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("fu.s(IIIIIZI)Llm;")
    public static final class336 method3373(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class336 var8 = (class336) field3467.method3220(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class266 var9 = method4793(arg0);
        if (arg1 > 1 && var9.field3440 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3473[var11] && var9.field3473[var11] != 0) {
                    var10 = var9.field3440[var11];
                }
            }
            if (var10 != -1) {
                var9 = method4793(var10);
            }
        }
        class137 var12 = var9.method4494(1);
        if (var12 == null) {
            return null;
        }
        class336 var13 = null;
        if (var9.field3470 != -1) {
            var13 = method3373(var9.field3474, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3454 != -1) {
            var13 = method3373(var9.field3484, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3487 != -1) {
            var13 = method3373(var9.field3486, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3885;
        int var15 = Statics.field3886;
        int var16 = Statics.field3887;
        int[] var17 = new int[4];
        class332.method5762(var17);
        class336 var18 = new class336(36, 32);
        class332.method5727(var18.field3915, 36, 32);
        class332.method5726();
        class140.method2926();
        class140.method2929(16, 16);
        class140.field1778 = false;
        if (var9.field3487 != -1) {
            var13.method5836(0, 0);
        }
        int var19 = var9.field3434;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class140.field1800[var9.field3449] * var19 >> 16;
        int var21 = class140.field1801[var9.field3449] * var19 >> 16;
        var12.method2793();
        var12.method2866(0, var9.field3450, var9.field3451, var9.field3449, var9.field3481, var9.field3466 + var12.field1885 / 2 + var20, var9.field3466 + var21);
        if (var9.field3454 != -1) {
            var13.method5836(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5838(1);
        }
        if (arg2 >= 2) {
            var18.method5838(16777215);
        }
        if (arg3 != 0) {
            var18.method5913(arg3);
        }
        class332.method5727(var18.field3915, 36, 32);
        if (var9.field3470 != -1) {
            var13.method5836(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3443 == 1) {
            Statics.field3472.method5093(method2476(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3467.method3217(var18, var6);
        }
        class332.method5727(var14, var15, var16);
        class332.method5732(var17);
        class140.method2926();
        class140.field1778 = true;
        return var18;
    }

    @ObfuscatedName("dy.b(II)Ljava/lang/String;")
    public static final String method2476(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class234.field2811 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class234.field2812 + "</col>";
        }
    }

    @ObfuscatedName("jj.a(ZI)Z")
    public final boolean method4470(boolean arg0) {
        int var2 = this.field3460;
        int var3 = this.field3461;
        int var4 = this.field3452;
        if (arg0) {
            var2 = this.field3463;
            var3 = this.field3478;
            var4 = this.field3447;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field50.method4024(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field50.method4024(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field50.method4024(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jj.w(ZI)Lek;")
    public final class131 method4471(boolean arg0) {
        int var2 = this.field3460;
        int var3 = this.field3461;
        int var4 = this.field3452;
        if (arg0) {
            var2 = this.field3463;
            var3 = this.field3478;
            var4 = this.field3447;
        }
        if (var2 == -1) {
            return null;
        }
        class131 var5 = class131.method2777(Statics.field50, var2, 0);
        if (var3 != -1) {
            class131 var6 = class131.method2777(Statics.field50, var3, 0);
            if (var4 == -1) {
                class131[] var9 = new class131[] { var5, var6 };
                var5 = new class131(var9, 2);
            } else {
                class131 var7 = class131.method2777(Statics.field50, var4, 0);
                class131[] var8 = new class131[] { var5, var6, var7 };
                var5 = new class131(var8, 3);
            }
        }
        if (!arg0 && this.field3462 != 0) {
            var5.method2712(0, this.field3462, 0);
        }
        if (arg0 && this.field3465 != 0) {
            var5.method2712(0, this.field3465, 0);
        }
        if (this.field3444 != null) {
            for (int var10 = 0; var10 < this.field3444.length; var10++) {
                var5.method2715(this.field3444[var10], this.field3445[var10]);
            }
        }
        if (this.field3475 != null) {
            for (int var11 = 0; var11 < this.field3475.length; var11++) {
                var5.method2714(this.field3475[var11], this.field3446[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jj.k(ZI)Z")
    public final boolean method4484(boolean arg0) {
        int var2 = this.field3468;
        int var3 = this.field3469;
        if (arg0) {
            var2 = this.field3453;
            var3 = this.field3439;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field50.method4024(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field50.method4024(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jj.i(ZB)Lek;")
    public final class131 method4485(boolean arg0) {
        int var2 = this.field3468;
        int var3 = this.field3469;
        if (arg0) {
            var2 = this.field3453;
            var3 = this.field3439;
        }
        if (var2 == -1) {
            return null;
        }
        class131 var4 = class131.method2777(Statics.field50, var2, 0);
        if (var3 != -1) {
            class131 var5 = class131.method2777(Statics.field50, var3, 0);
            class131[] var6 = new class131[] { var4, var5 };
            var4 = new class131(var6, 2);
        }
        if (this.field3444 != null) {
            for (int var7 = 0; var7 < this.field3444.length; var7++) {
                var4.method2715(this.field3444[var7], this.field3445[var7]);
            }
        }
        if (this.field3475 != null) {
            for (int var8 = 0; var8 < this.field3475.length; var8++) {
                var4.method2714(this.field3475[var8], this.field3446[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jj.x(IIB)I")
    public int method4462(int arg0, int arg1) {
        class327 var3 = this.field3435;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5648((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2138;
            }
        }
        return var4;
    }

    @ObfuscatedName("jj.g(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4480(int arg0, String arg1) {
        return class259.method1120(this.field3435, arg0, arg1);
    }

    @ObfuscatedName("jj.u(B)I")
    public int method4476() {
        if (this.field3459 == -1 || this.field3458 == null) {
            return -1;
        } else if (this.field3459 >= 0) {
            return this.field3458[this.field3459] == null ? -1 : this.field3459;
        } else if (class234.field2789.equalsIgnoreCase(this.field3458[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("o.t(B)V")
    public static void method216() {
        field3467.method3218();
    }
}
