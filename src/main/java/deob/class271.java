package deob;

@ObfuscatedName("jd")
public class class271 extends class209 {

    @ObfuscatedName("jd.g")
    public static boolean field3455 = false;

    @ObfuscatedName("jd.q")
    public static class203 field3454 = new class203(4096);

    @ObfuscatedName("jd.c")
    public static class203 field3458 = new class203(500);

    @ObfuscatedName("jd.l")
    public static class203 field3456 = new class203(30);

    @ObfuscatedName("jd.b")
    public static class203 field3474 = new class203(30);

    @ObfuscatedName("jd.w")
    public static class116[] field3495 = new class116[4];

    @ObfuscatedName("jd.n")
    public int field3470;

    @ObfuscatedName("jd.i")
    public int[] field3460;

    @ObfuscatedName("jd.p")
    public int[] field3461;

    @ObfuscatedName("jd.m")
    public String field3462 = class240.field2863;

    @ObfuscatedName("jd.d")
    public short[] field3463;

    @ObfuscatedName("jd.j")
    public short[] field3464;

    @ObfuscatedName("jd.x")
    public short[] field3452;

    @ObfuscatedName("jd.v")
    public short[] field3466;

    @ObfuscatedName("jd.h")
    public int field3502 = 1;

    @ObfuscatedName("jd.f")
    public int field3476 = 1;

    @ObfuscatedName("jd.a")
    public int field3496 = 2;

    @ObfuscatedName("jd.t")
    public boolean field3469 = true;

    @ObfuscatedName("jd.k")
    public int field3471 = -1;

    @ObfuscatedName("jd.z")
    public int field3489 = -1;

    @ObfuscatedName("jd.s")
    public boolean field3473 = false;

    @ObfuscatedName("jd.y")
    public boolean field3468 = false;

    @ObfuscatedName("jd.u")
    public int field3475 = -1;

    @ObfuscatedName("jd.o")
    public int field3459 = 16;

    @ObfuscatedName("jd.af")
    public int field3477 = 0;

    @ObfuscatedName("jd.an")
    public int field3478 = 0;

    @ObfuscatedName("jd.ax")
    public String[] field3479 = new String[5];

    @ObfuscatedName("jd.aw")
    public int field3480 = -1;

    @ObfuscatedName("jd.ae")
    public int field3467 = -1;

    @ObfuscatedName("jd.ac")
    public boolean field3494 = false;

    @ObfuscatedName("jd.az")
    public boolean field3483 = true;

    @ObfuscatedName("jd.aj")
    public int field3484 = 128;

    @ObfuscatedName("jd.ag")
    public int field3485 = 128;

    @ObfuscatedName("jd.ab")
    public int field3486 = 128;

    @ObfuscatedName("jd.ar")
    public int field3487 = 0;

    @ObfuscatedName("jd.at")
    public int field3488 = 0;

    @ObfuscatedName("jd.as")
    public int field3482 = 0;

    @ObfuscatedName("jd.aa")
    public boolean field3490 = false;

    @ObfuscatedName("jd.ai")
    public boolean field3491 = false;

    @ObfuscatedName("jd.ad")
    public int field3465 = -1;

    @ObfuscatedName("jd.al")
    public int[] field3481;

    @ObfuscatedName("jd.ak")
    public int field3493 = -1;

    @ObfuscatedName("jd.ao")
    public int field3472 = -1;

    @ObfuscatedName("jd.am")
    public int field3492 = -1;

    @ObfuscatedName("jd.ay")
    public int field3497 = 0;

    @ObfuscatedName("jd.ah")
    public int field3498 = 0;

    @ObfuscatedName("jd.ap")
    public int field3499 = 0;

    @ObfuscatedName("jd.av")
    public int[] field3500;

    @ObfuscatedName("jd.au")
    public class200 field3501;

    @ObfuscatedName("ii.g(Liu;Liu;ZS)V")
    public static void method4658(class250 arg0, class250 arg1, boolean arg2) {
        Statics.field3451 = arg0;
        Statics.field3453 = arg1;
        field3455 = arg2;
    }

    @ObfuscatedName("is.r(IB)Ljd;")
    public static class271 method4591(int arg0) {
        class271 var1 = (class271) field3454.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3451.method4438(6, arg0);
        class271 var3 = new class271();
        var3.field3470 = arg0;
        if (var2 != null) {
            var3.method4863(new class185(var2));
        }
        var3.method4892();
        if (var3.field3491) {
            var3.field3496 = 0;
            var3.field3469 = false;
        }
        field3454.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.e(I)V")
    public void method4892() {
        if (this.field3471 == -1) {
            this.field3471 = 0;
            if (this.field3460 != null && (this.field3461 == null || this.field3461[0] == 10)) {
                this.field3471 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3479[var1] != null) {
                    this.field3471 = 1;
                }
            }
        }
        if (this.field3465 == -1) {
            this.field3465 = this.field3496 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jd.q(Lgl;I)V")
    public void method4863(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4864(arg0, var2);
        }
    }

    @ObfuscatedName("jd.c(Lgl;II)V")
    public void method4864(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3679();
            if (var3 > 0) {
                if (this.field3460 == null || field3455) {
                    this.field3461 = new int[var3];
                    this.field3460 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3460[var4] = arg0.method3467();
                        this.field3461[var4] = arg0.method3679();
                    }
                } else {
                    arg0.field2406 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3462 = arg0.method3474();
        } else if (arg1 == 5) {
            int var5 = arg0.method3679();
            if (var5 > 0) {
                if (this.field3460 == null || field3455) {
                    this.field3461 = null;
                    this.field3460 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3460[var6] = arg0.method3467();
                    }
                } else {
                    arg0.field2406 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3502 = arg0.method3679();
        } else if (arg1 == 15) {
            this.field3476 = arg0.method3679();
        } else if (arg1 == 17) {
            this.field3496 = 0;
            this.field3469 = false;
        } else if (arg1 == 18) {
            this.field3469 = false;
        } else if (arg1 == 19) {
            this.field3471 = arg0.method3679();
        } else if (arg1 == 21) {
            this.field3489 = 0;
        } else if (arg1 == 22) {
            this.field3473 = true;
        } else if (arg1 == 23) {
            this.field3468 = true;
        } else if (arg1 == 24) {
            this.field3475 = arg0.method3467();
            if (this.field3475 == 65535) {
                this.field3475 = -1;
            }
        } else if (arg1 == 27) {
            this.field3496 = 1;
        } else if (arg1 == 28) {
            this.field3459 = arg0.method3679();
        } else if (arg1 == 29) {
            this.field3477 = arg0.method3627();
        } else if (arg1 == 39) {
            this.field3478 = arg0.method3627() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3479[arg1 - 30] = arg0.method3474();
            if (this.field3479[arg1 - 30].equalsIgnoreCase(class240.field2858)) {
                this.field3479[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3679();
            this.field3463 = new short[var7];
            this.field3464 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3463[var8] = (short) arg0.method3467();
                this.field3464[var8] = (short) arg0.method3467();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3679();
            this.field3452 = new short[var9];
            this.field3466 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3452[var10] = (short) arg0.method3467();
                this.field3466[var10] = (short) arg0.method3467();
            }
        } else if (arg1 == 62) {
            this.field3494 = true;
        } else if (arg1 == 64) {
            this.field3483 = false;
        } else if (arg1 == 65) {
            this.field3484 = arg0.method3467();
        } else if (arg1 == 66) {
            this.field3485 = arg0.method3467();
        } else if (arg1 == 67) {
            this.field3486 = arg0.method3467();
        } else if (arg1 == 68) {
            this.field3467 = arg0.method3467();
        } else if (arg1 == 69) {
            arg0.method3679();
        } else if (arg1 == 70) {
            this.field3487 = arg0.method3510();
        } else if (arg1 == 71) {
            this.field3488 = arg0.method3510();
        } else if (arg1 == 72) {
            this.field3482 = arg0.method3510();
        } else if (arg1 == 73) {
            this.field3490 = true;
        } else if (arg1 == 74) {
            this.field3491 = true;
        } else if (arg1 == 75) {
            this.field3465 = arg0.method3679();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3493 = arg0.method3467();
            if (this.field3493 == 65535) {
                this.field3493 = -1;
            }
            this.field3472 = arg0.method3467();
            if (this.field3472 == 65535) {
                this.field3472 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3467();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3679();
            this.field3481 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3481[var15] = arg0.method3467();
                if (this.field3481[var15] == 65535) {
                    this.field3481[var15] = -1;
                }
            }
            this.field3481[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3492 = arg0.method3467();
            this.field3497 = arg0.method3679();
        } else if (arg1 == 79) {
            this.field3498 = arg0.method3467();
            this.field3499 = arg0.method3467();
            this.field3497 = arg0.method3679();
            int var11 = arg0.method3679();
            this.field3500 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3500[var12] = arg0.method3467();
            }
        } else if (arg1 == 81) {
            this.field3489 = arg0.method3679() * 256;
        } else if (arg1 == 82) {
            this.field3480 = arg0.method3467();
        } else if (arg1 == 249) {
            this.field3501 = Statics.method4265(arg0, this.field3501);
        }
    }

    @ObfuscatedName("jd.i(II)Z")
    public final boolean method4893(int arg0) {
        if (this.field3461 != null) {
            for (int var4 = 0; var4 < this.field3461.length; var4++) {
                if (this.field3461[var4] == arg0) {
                    return Statics.field3453.method4437(this.field3460[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3460 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3460.length; var3++) {
                var2 &= Statics.field3453.method4437(this.field3460[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jd.p(I)Z")
    public final boolean method4866() {
        if (this.field3460 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3460.length; var2++) {
            var1 &= Statics.field3453.method4437(this.field3460[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jd.m(II[[IIIII)Ldd;")
    public final class130 method4880(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3461 == null) {
            var7 = (long) ((this.field3470 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3470 << 10) + (arg0 << 3) + arg1);
        }
        class130 var9 = (class130) field3456.method3879(var7);
        if (var9 == null) {
            class116 var10 = this.method4870(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3473) {
                var10.field1549 = (short) (this.field3477 + 64);
                var10.field1550 = (short) (this.field3478 + 768);
                var10.method2600();
                var9 = var10;
            } else {
                var9 = var10.method2570(this.field3477 + 64, this.field3478 + 768, -50, -10, -50);
            }
            field3456.method3885(var9, var7);
        }
        if (this.field3473) {
            var9 = ((class116) var9).method2580();
        }
        if (this.field3489 >= 0) {
            if (var9 instanceof class122) {
                var9 = ((class122) var9).method2666(arg2, arg3, arg4, arg5, true, this.field3489);
            } else if (var9 instanceof class116) {
                var9 = ((class116) var9).method2589(arg2, arg3, arg4, arg5, true, this.field3489);
            }
        }
        return var9;
    }

    @ObfuscatedName("jd.d(II[[IIIII)Ldl;")
    public final class122 method4868(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3461 == null) {
            var7 = (long) ((this.field3470 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3470 << 10) + (arg0 << 3) + arg1);
        }
        class122 var9 = (class122) field3474.method3879(var7);
        if (var9 == null) {
            class116 var10 = this.method4870(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2570(this.field3477 + 64, this.field3478 + 768, -50, -10, -50);
            field3474.method3885(var9, var7);
        }
        if (this.field3489 >= 0) {
            var9 = var9.method2666(arg2, arg3, arg4, arg5, true, this.field3489);
        }
        return var9;
    }

    @ObfuscatedName("jd.j(II[[IIIILjg;II)Ldl;")
    public final class122 method4904(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class276 arg6, int arg7) {
        long var9;
        if (this.field3461 == null) {
            var9 = (long) ((this.field3470 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3470 << 10) + (arg0 << 3) + arg1);
        }
        class122 var11 = (class122) field3474.method3879(var9);
        if (var11 == null) {
            class116 var12 = this.method4870(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2570(this.field3477 + 64, this.field3478 + 768, -50, -10, -50);
            field3474.method3885(var11, var9);
        }
        if (arg6 == null && this.field3489 == -1) {
            return var11;
        }
        class122 var13;
        if (arg6 == null) {
            var13 = var11.method2667(true);
        } else {
            var13 = arg6.method5044(var11, arg7, arg1);
        }
        if (this.field3489 >= 0) {
            var13 = var13.method2666(arg2, arg3, arg4, arg5, false, this.field3489);
        }
        return var13;
    }

    @ObfuscatedName("jd.x(IIB)Ldu;")
    public final class116 method4870(int arg0, int arg1) {
        class116 var3 = null;
        if (this.field3461 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3460 == null) {
                return null;
            }
            boolean var4 = this.field3494;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3460.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3460[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class116) field3458.method3879((long) var7);
                if (var3 == null) {
                    var3 = class116.method2641(Statics.field3453, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2604();
                    }
                    field3458.method3885(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3495[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class116(field3495, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3461.length; var9++) {
                if (this.field3461[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3460[var8];
            boolean var11 = this.field3494 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class116) field3458.method3879((long) var10);
            if (var3 == null) {
                var3 = class116.method2641(Statics.field3453, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2604();
                }
                field3458.method3885(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3484 == 128 && this.field3485 == 128 && this.field3486 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3487 == 0 && this.field3488 == 0 && this.field3482 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class116 var14 = new class116(var3, arg1 == 0 && !var12 && !var13, this.field3463 == null, this.field3452 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2579(256);
            var14.method2625(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2602();
        } else if (var15 == 2) {
            var14.method2577();
        } else if (var15 == 3) {
            var14.method2578();
        }
        if (this.field3463 != null) {
            for (int var16 = 0; var16 < this.field3463.length; var16++) {
                var14.method2573(this.field3463[var16], this.field3464[var16]);
            }
        }
        if (this.field3452 != null) {
            for (int var17 = 0; var17 < this.field3452.length; var17++) {
                var14.method2583(this.field3452[var17], this.field3466[var17]);
            }
        }
        if (var12) {
            var14.method2581(this.field3484, this.field3485, this.field3486);
        }
        if (var13) {
            var14.method2625(this.field3487, this.field3488, this.field3482);
        }
        return var14;
    }

    @ObfuscatedName("jd.v(B)Ljd;")
    public final class271 method4871() {
        int var1 = -1;
        if (this.field3493 != -1) {
            var1 = class228.method2246(this.field3493);
        } else if (this.field3472 != -1) {
            var1 = class228.field2630[this.field3472];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3481.length - 1) {
            var2 = this.field3481[var1];
        } else {
            var2 = this.field3481[this.field3481.length - 1];
        }
        return var2 == -1 ? null : method4591(var2);
    }

    @ObfuscatedName("jd.h(IIB)I")
    public int method4872(int arg0, int arg1) {
        return class265.method3138(this.field3501, arg0, arg1);
    }

    @ObfuscatedName("jd.f(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4873(int arg0, String arg1) {
        return class265.method3140(this.field3501, arg0, arg1);
    }

    @ObfuscatedName("jd.a(I)Z")
    public boolean method4874() {
        if (this.field3481 == null) {
            return this.field3492 != -1 || this.field3500 != null;
        }
        for (int var1 = 0; var1 < this.field3481.length; var1++) {
            if (this.field3481[var1] != -1) {
                class271 var2 = method4591(this.field3481[var1]);
                if (var2.field3492 != -1 || var2.field3500 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
