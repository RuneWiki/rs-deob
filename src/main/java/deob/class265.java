package deob;

@ObfuscatedName("jo")
public class class265 extends class185 {

    @ObfuscatedName("jo.z")
    public static class155 field3437 = new class155(64);

    @ObfuscatedName("jo.w")
    public static class155 field3438 = new class155(50);

    @ObfuscatedName("jo.y")
    public static class155 field3435 = new class155(200);

    @ObfuscatedName("jo.h")
    public int field3467;

    @ObfuscatedName("jo.k")
    public int field3453;

    @ObfuscatedName("jo.r")
    public String field3442 = class234.field2799;

    @ObfuscatedName("jo.s")
    public short[] field3443;

    @ObfuscatedName("jo.v")
    public short[] field3444;

    @ObfuscatedName("jo.d")
    public short[] field3473;

    @ObfuscatedName("jo.e")
    public short[] field3446;

    @ObfuscatedName("jo.l")
    public int field3447 = 2000;

    @ObfuscatedName("jo.t")
    public int field3448 = 0;

    @ObfuscatedName("jo.x")
    public int field3461 = 0;

    @ObfuscatedName("jo.b")
    public int field3449 = 0;

    @ObfuscatedName("jo.i")
    public int field3451 = 0;

    @ObfuscatedName("jo.f")
    public int field3452 = 0;

    @ObfuscatedName("jo.ah")
    public int field3439 = 0;

    @ObfuscatedName("jo.ai")
    public int field3454 = 1;

    @ObfuscatedName("jo.ao")
    public boolean field3480 = false;

    @ObfuscatedName("jo.ae")
    public String[] field3456 = new String[] { null, null, class234.field2792, null, null };

    @ObfuscatedName("jo.ax")
    public String[] field3457 = new String[] { null, null, null, null, class234.field2891 };

    @ObfuscatedName("jo.ab")
    public int field3458 = -2;

    @ObfuscatedName("jo.am")
    public int field3432 = -1;

    @ObfuscatedName("jo.ak")
    public int field3474 = -1;

    @ObfuscatedName("jo.ad")
    public int field3459 = 0;

    @ObfuscatedName("jo.as")
    public int field3462 = -1;

    @ObfuscatedName("jo.ar")
    public int field3463 = -1;

    @ObfuscatedName("jo.ap")
    public int field3464 = 0;

    @ObfuscatedName("jo.al")
    public int field3465 = -1;

    @ObfuscatedName("jo.an")
    public int field3466 = -1;

    @ObfuscatedName("jo.ac")
    public int field3460 = -1;

    @ObfuscatedName("jo.av")
    public int field3468 = -1;

    @ObfuscatedName("jo.af")
    public int field3476 = -1;

    @ObfuscatedName("jo.at")
    public int field3487 = -1;

    @ObfuscatedName("jo.aa")
    public int[] field3471;

    @ObfuscatedName("jo.aw")
    public int[] field3472;

    @ObfuscatedName("jo.az")
    public int field3434 = -1;

    @ObfuscatedName("jo.aq")
    public int field3431 = -1;

    @ObfuscatedName("jo.ay")
    public int field3475 = 128;

    @ObfuscatedName("jo.au")
    public int field3440 = 128;

    @ObfuscatedName("jo.aj")
    public int field3477 = 128;

    @ObfuscatedName("jo.bk")
    public int field3478 = 0;

    @ObfuscatedName("jo.bh")
    public int field3479 = 0;

    @ObfuscatedName("jo.bg")
    public int field3483 = 0;

    @ObfuscatedName("jo.be")
    public class326 field3481;

    @ObfuscatedName("jo.bf")
    public boolean field3482 = false;

    @ObfuscatedName("jo.ba")
    public int field3450 = -1;

    @ObfuscatedName("jo.bd")
    public int field3484 = -1;

    @ObfuscatedName("jo.bb")
    public int field3485 = -1;

    @ObfuscatedName("jo.bw")
    public int field3486 = -1;

    @ObfuscatedName("fy.m(Lic;Lic;ZLko;S)V")
    public static void method3227(class244 arg0, class244 arg1, boolean arg2, class305 arg3) {
        Statics.field3266 = arg0;
        Statics.field3436 = arg1;
        Statics.field1474 = arg2;
        Statics.field3376 = Statics.field3266.method3903(10);
        Statics.field3099 = arg3;
    }

    @ObfuscatedName("ir.o(II)Ljo;")
    public static class265 method4218(int arg0) {
        class265 var1 = (class265) field3437.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3266.method3891(10, arg0);
        class265 var3 = new class265();
        var3.field3467 = arg0;
        if (var2 != null) {
            var3.method4427(new class310(var2));
        }
        var3.method4398();
        if (var3.field3431 != -1) {
            var3.method4401(method4218(var3.field3431), method4218(var3.field3434));
        }
        if (var3.field3484 != -1) {
            var3.method4445(method4218(var3.field3484), method4218(var3.field3450));
        }
        if (var3.field3486 != -1) {
            var3.method4403(method4218(var3.field3486), method4218(var3.field3485));
        }
        if (!Statics.field1474 && var3.field3480) {
            var3.field3442 = class234.field2830;
            var3.field3482 = false;
            var3.field3456 = null;
            var3.field3457 = null;
            var3.field3458 = -1;
            var3.field3483 = 0;
            if (var3.field3481 != null) {
                boolean var4 = false;
                for (class190 var5 = var3.field3481.method5618(); var5 != null; var5 = var3.field3481.method5616()) {
                    class260 var6 = class260.method4255((int) var5.field2152);
                    if (var6.field3337) {
                        var5.method3388();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3481 = null;
                }
            }
        }
        field3437.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jo.q(I)V")
    public void method4398() {
    }

    @ObfuscatedName("jo.j(Lkn;I)V")
    public void method4427(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4400(arg0, var2);
        }
    }

    @ObfuscatedName("jo.p(Lkn;II)V")
    public void method4400(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3453 = arg0.method5283();
        } else if (arg1 == 2) {
            this.field3442 = arg0.method5236();
        } else if (arg1 == 4) {
            this.field3447 = arg0.method5283();
        } else if (arg1 == 5) {
            this.field3448 = arg0.method5283();
        } else if (arg1 == 6) {
            this.field3461 = arg0.method5283();
        } else if (arg1 == 7) {
            this.field3451 = arg0.method5283();
            if (this.field3451 > 32767) {
                this.field3451 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3452 = arg0.method5283();
            if (this.field3452 > 32767) {
                this.field3452 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3439 = 1;
        } else if (arg1 == 12) {
            this.field3454 = arg0.method5209();
        } else if (arg1 == 16) {
            this.field3480 = true;
        } else if (arg1 == 23) {
            this.field3432 = arg0.method5283();
            this.field3459 = arg0.method5227();
        } else if (arg1 == 24) {
            this.field3474 = arg0.method5283();
        } else if (arg1 == 25) {
            this.field3462 = arg0.method5283();
            this.field3464 = arg0.method5227();
        } else if (arg1 == 26) {
            this.field3463 = arg0.method5283();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3456[arg1 - 30] = arg0.method5236();
            if (this.field3456[arg1 - 30].equalsIgnoreCase(class234.field2871)) {
                this.field3456[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3457[arg1 - 35] = arg0.method5236();
        } else if (arg1 == 40) {
            int var3 = arg0.method5227();
            this.field3443 = new short[var3];
            this.field3444 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3443[var4] = (short) arg0.method5283();
                this.field3444[var4] = (short) arg0.method5283();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5227();
            this.field3473 = new short[var5];
            this.field3446 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3473[var6] = (short) arg0.method5283();
                this.field3446[var6] = (short) arg0.method5283();
            }
        } else if (arg1 == 42) {
            this.field3458 = arg0.method5228();
        } else if (arg1 == 65) {
            this.field3482 = true;
        } else if (arg1 == 78) {
            this.field3465 = arg0.method5283();
        } else if (arg1 == 79) {
            this.field3466 = arg0.method5283();
        } else if (arg1 == 90) {
            this.field3460 = arg0.method5283();
        } else if (arg1 == 91) {
            this.field3476 = arg0.method5283();
        } else if (arg1 == 92) {
            this.field3468 = arg0.method5283();
        } else if (arg1 == 93) {
            this.field3487 = arg0.method5283();
        } else if (arg1 == 95) {
            this.field3449 = arg0.method5283();
        } else if (arg1 == 97) {
            this.field3434 = arg0.method5283();
        } else if (arg1 == 98) {
            this.field3431 = arg0.method5283();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3471 == null) {
                this.field3471 = new int[10];
                this.field3472 = new int[10];
            }
            this.field3471[arg1 - 100] = arg0.method5283();
            this.field3472[arg1 - 100] = arg0.method5283();
        } else if (arg1 == 110) {
            this.field3475 = arg0.method5283();
        } else if (arg1 == 111) {
            this.field3440 = arg0.method5283();
        } else if (arg1 == 112) {
            this.field3477 = arg0.method5283();
        } else if (arg1 == 113) {
            this.field3478 = arg0.method5228();
        } else if (arg1 == 114) {
            this.field3479 = arg0.method5228();
        } else if (arg1 == 115) {
            this.field3483 = arg0.method5227();
        } else if (arg1 == 139) {
            this.field3450 = arg0.method5283();
        } else if (arg1 == 140) {
            this.field3484 = arg0.method5283();
        } else if (arg1 == 148) {
            this.field3485 = arg0.method5283();
        } else if (arg1 == 149) {
            this.field3486 = arg0.method5283();
        } else if (arg1 == 249) {
            this.field3481 = class258.method4134(arg0, this.field3481);
        }
    }

    @ObfuscatedName("jo.g(Ljo;Ljo;I)V")
    public void method4401(class265 arg0, class265 arg1) {
        this.field3453 = arg0.field3453;
        this.field3447 = arg0.field3447;
        this.field3448 = arg0.field3448;
        this.field3461 = arg0.field3461;
        this.field3449 = arg0.field3449;
        this.field3451 = arg0.field3451;
        this.field3452 = arg0.field3452;
        this.field3443 = arg0.field3443;
        this.field3444 = arg0.field3444;
        this.field3473 = arg0.field3473;
        this.field3446 = arg0.field3446;
        this.field3442 = arg1.field3442;
        this.field3480 = arg1.field3480;
        this.field3454 = arg1.field3454;
        this.field3439 = 1;
    }

    @ObfuscatedName("jo.n(Ljo;Ljo;B)V")
    public void method4445(class265 arg0, class265 arg1) {
        this.field3453 = arg0.field3453;
        this.field3447 = arg0.field3447;
        this.field3448 = arg0.field3448;
        this.field3461 = arg0.field3461;
        this.field3449 = arg0.field3449;
        this.field3451 = arg0.field3451;
        this.field3452 = arg0.field3452;
        this.field3443 = arg1.field3443;
        this.field3444 = arg1.field3444;
        this.field3473 = arg1.field3473;
        this.field3446 = arg1.field3446;
        this.field3442 = arg1.field3442;
        this.field3480 = arg1.field3480;
        this.field3439 = arg1.field3439;
        this.field3432 = arg1.field3432;
        this.field3474 = arg1.field3474;
        this.field3465 = arg1.field3465;
        this.field3462 = arg1.field3462;
        this.field3463 = arg1.field3463;
        this.field3466 = arg1.field3466;
        this.field3460 = arg1.field3460;
        this.field3468 = arg1.field3468;
        this.field3476 = arg1.field3476;
        this.field3487 = arg1.field3487;
        this.field3483 = arg1.field3483;
        this.field3456 = arg1.field3456;
        this.field3457 = new String[5];
        if (arg1.field3457 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3457[var3] = arg1.field3457[var3];
            }
        }
        this.field3457[4] = class234.field2806;
        this.field3454 = 0;
    }

    @ObfuscatedName("jo.u(Ljo;Ljo;I)V")
    public void method4403(class265 arg0, class265 arg1) {
        this.field3453 = arg0.field3453;
        this.field3447 = arg0.field3447;
        this.field3448 = arg0.field3448;
        this.field3461 = arg0.field3461;
        this.field3449 = arg0.field3449;
        this.field3451 = arg0.field3451;
        this.field3452 = arg0.field3452;
        this.field3443 = arg0.field3443;
        this.field3444 = arg0.field3444;
        this.field3473 = arg0.field3473;
        this.field3446 = arg0.field3446;
        this.field3439 = arg0.field3439;
        this.field3442 = arg1.field3442;
        this.field3454 = 0;
        this.field3480 = false;
        this.field3482 = false;
    }

    @ObfuscatedName("jo.a(IB)Lek;")
    public final class131 method4404(int arg0) {
        if (this.field3471 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3472[var3] && this.field3472[var3] != 0) {
                    var2 = this.field3471[var3];
                }
            }
            if (var2 != -1) {
                return method4218(var2).method4404(1);
            }
        }
        class131 var4 = class131.method2632(Statics.field3436, this.field3453, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3475 != 128 || this.field3440 != 128 || this.field3477 != 128) {
            var4.method2634(this.field3475, this.field3440, this.field3477);
        }
        if (this.field3443 != null) {
            for (int var5 = 0; var5 < this.field3443.length; var5++) {
                var4.method2639(this.field3443[var5], this.field3444[var5]);
            }
        }
        if (this.field3473 != null) {
            for (int var6 = 0; var6 < this.field3473.length; var6++) {
                var4.method2690(this.field3473[var6], this.field3446[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jo.z(II)Lef;")
    public final class137 method4454(int arg0) {
        if (this.field3471 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3472[var3] && this.field3472[var3] != 0) {
                    var2 = this.field3471[var3];
                }
            }
            if (var2 != -1) {
                return method4218(var2).method4454(1);
            }
        }
        class137 var4 = (class137) field3438.method3127((long) this.field3467);
        if (var4 != null) {
            return var4;
        }
        class131 var5 = class131.method2632(Statics.field3436, this.field3453, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3475 != 128 || this.field3440 != 128 || this.field3477 != 128) {
            var5.method2634(this.field3475, this.field3440, this.field3477);
        }
        if (this.field3443 != null) {
            for (int var6 = 0; var6 < this.field3443.length; var6++) {
                var5.method2639(this.field3443[var6], this.field3444[var6]);
            }
        }
        if (this.field3473 != null) {
            for (int var7 = 0; var7 < this.field3473.length; var7++) {
                var5.method2690(this.field3473[var7], this.field3446[var7]);
            }
        }
        class137 var8 = var5.method2619(this.field3478 + 64, this.field3479 * 5 + 768, -50, -10, -50);
        var8.field1755 = true;
        field3438.method3137(var8, (long) this.field3467);
        return var8;
    }

    @ObfuscatedName("jo.w(II)Ljo;")
    public class265 method4406(int arg0) {
        if (this.field3471 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3472[var3] && this.field3472[var3] != 0) {
                    var2 = this.field3471[var3];
                }
            }
            if (var2 != -1) {
                return method4218(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ct.y(IIIIIZI)Llz;")
    public static final class335 method2049(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class335 var8 = (class335) field3435.method3127(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class265 var9 = method4218(arg0);
        if (arg1 > 1 && var9.field3471 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3472[var11] && var9.field3472[var11] != 0) {
                    var10 = var9.field3471[var11];
                }
            }
            if (var10 != -1) {
                var9 = method4218(var10);
            }
        }
        class137 var12 = var9.method4454(1);
        if (var12 == null) {
            return null;
        }
        class335 var13 = null;
        if (var9.field3431 != -1) {
            var13 = method2049(var9.field3434, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3484 != -1) {
            var13 = method2049(var9.field3450, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3486 != -1) {
            var13 = method2049(var9.field3485, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3870;
        int var15 = Statics.field3871;
        int var16 = Statics.field3872;
        int[] var17 = new int[4];
        class331.method5680(var17);
        class335 var18 = new class335(36, 32);
        class331.method5678(var18.field3896, 36, 32);
        class331.method5682();
        class140.method2827();
        class140.method2861(16, 16);
        class140.field1790 = false;
        if (var9.field3486 != -1) {
            var13.method5855(0, 0);
        }
        int var19 = var9.field3447;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class140.field1812[var9.field3448] * var19 >> 16;
        int var21 = class140.field1813[var9.field3448] * var19 >> 16;
        var12.method2711();
        var12.method2724(0, var9.field3461, var9.field3449, var9.field3448, var9.field3451, var9.field3452 + var12.field1898 / 2 + var20, var9.field3452 + var21);
        if (var9.field3484 != -1) {
            var13.method5855(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5797(1);
        }
        if (arg2 >= 2) {
            var18.method5797(16777215);
        }
        if (arg3 != 0) {
            var18.method5818(arg3);
        }
        class331.method5678(var18.field3896, 36, 32);
        if (var9.field3431 != -1) {
            var13.method5855(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3439 == 1) {
            class305 var22 = Statics.field3099;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class234.field2959 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class234.field2957 + "</col>";
            }
            var22.method5070(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3435.method3137(var18, var6);
        }
        class331.method5678(var14, var15, var16);
        class331.method5681(var17);
        class140.method2827();
        class140.field1790 = true;
        return var18;
    }

    @ObfuscatedName("jo.c(ZB)Z")
    public final boolean method4407(boolean arg0) {
        int var2 = this.field3432;
        int var3 = this.field3474;
        int var4 = this.field3465;
        if (arg0) {
            var2 = this.field3462;
            var3 = this.field3463;
            var4 = this.field3466;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3436.method3893(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3436.method3893(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3436.method3893(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jo.h(ZI)Lek;")
    public final class131 method4408(boolean arg0) {
        int var2 = this.field3432;
        int var3 = this.field3474;
        int var4 = this.field3465;
        if (arg0) {
            var2 = this.field3462;
            var3 = this.field3463;
            var4 = this.field3466;
        }
        if (var2 == -1) {
            return null;
        }
        class131 var5 = class131.method2632(Statics.field3436, var2, 0);
        if (var3 != -1) {
            class131 var6 = class131.method2632(Statics.field3436, var3, 0);
            if (var4 == -1) {
                class131[] var9 = new class131[] { var5, var6 };
                var5 = new class131(var9, 2);
            } else {
                class131 var7 = class131.method2632(Statics.field3436, var4, 0);
                class131[] var8 = new class131[] { var5, var6, var7 };
                var5 = new class131(var8, 3);
            }
        }
        if (!arg0 && this.field3459 != 0) {
            var5.method2631(0, this.field3459, 0);
        }
        if (arg0 && this.field3464 != 0) {
            var5.method2631(0, this.field3464, 0);
        }
        if (this.field3443 != null) {
            for (int var10 = 0; var10 < this.field3443.length; var10++) {
                var5.method2639(this.field3443[var10], this.field3444[var10]);
            }
        }
        if (this.field3473 != null) {
            for (int var11 = 0; var11 < this.field3473.length; var11++) {
                var5.method2690(this.field3473[var11], this.field3446[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jo.k(ZI)Z")
    public final boolean method4409(boolean arg0) {
        int var2 = this.field3460;
        int var3 = this.field3468;
        if (arg0) {
            var2 = this.field3476;
            var3 = this.field3487;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3436.method3893(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3436.method3893(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jo.r(ZB)Lek;")
    public final class131 method4410(boolean arg0) {
        int var2 = this.field3460;
        int var3 = this.field3468;
        if (arg0) {
            var2 = this.field3476;
            var3 = this.field3487;
        }
        if (var2 == -1) {
            return null;
        }
        class131 var4 = class131.method2632(Statics.field3436, var2, 0);
        if (var3 != -1) {
            class131 var5 = class131.method2632(Statics.field3436, var3, 0);
            class131[] var6 = new class131[] { var4, var5 };
            var4 = new class131(var6, 2);
        }
        if (this.field3443 != null) {
            for (int var7 = 0; var7 < this.field3443.length; var7++) {
                var4.method2639(this.field3443[var7], this.field3444[var7]);
            }
        }
        if (this.field3473 != null) {
            for (int var8 = 0; var8 < this.field3473.length; var8++) {
                var4.method2690(this.field3473[var8], this.field3446[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jo.d(IIB)I")
    public int method4438(int arg0, int arg1) {
        return class258.method3448(this.field3481, arg0, arg1);
    }

    @ObfuscatedName("jo.e(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4448(int arg0, String arg1) {
        return class258.method4181(this.field3481, arg0, arg1);
    }

    @ObfuscatedName("jo.l(I)I")
    public int method4413() {
        if (this.field3458 == -1 || this.field3457 == null) {
            return -1;
        } else if (this.field3458 >= 0) {
            return this.field3457[this.field3458] == null ? -1 : this.field3458;
        } else if (class234.field2891.equalsIgnoreCase(this.field3457[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bx.t(I)V")
    public static void method1083() {
        field3435.method3130();
    }

    @ObfuscatedName("il.x(ZB)V")
    public static void method4092(boolean arg0) {
        if (Statics.field1474 != arg0) {
            field3437.method3130();
            field3438.method3130();
            field3435.method3130();
            Statics.field1474 = arg0;
        }
    }
}
