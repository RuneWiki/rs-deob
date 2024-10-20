package deob;

@ObfuscatedName("jc")
public class class271 extends class209 {

    @ObfuscatedName("jc.y")
    public static boolean field3463 = false;

    @ObfuscatedName("jc.u")
    public static class203 field3458 = new class203(4096);

    @ObfuscatedName("jc.i")
    public static class203 field3425 = new class203(500);

    @ObfuscatedName("jc.r")
    public static class203 field3426 = new class203(30);

    @ObfuscatedName("jc.j")
    public static class203 field3427 = new class203(30);

    @ObfuscatedName("jc.p")
    public static class116[] field3462 = new class116[4];

    @ObfuscatedName("jc.e")
    public int field3429;

    @ObfuscatedName("jc.s")
    public int[] field3467;

    @ObfuscatedName("jc.v")
    public int[] field3431;

    @ObfuscatedName("jc.k")
    public String field3432 = class240.field2840;

    @ObfuscatedName("jc.o")
    public short[] field3450;

    @ObfuscatedName("jc.q")
    public short[] field3434;

    @ObfuscatedName("jc.l")
    public short[] field3428;

    @ObfuscatedName("jc.f")
    public short[] field3436;

    @ObfuscatedName("jc.z")
    public int field3437 = 1;

    @ObfuscatedName("jc.a")
    public int field3438 = 1;

    @ObfuscatedName("jc.x")
    public int field3433 = 2;

    @ObfuscatedName("jc.b")
    public boolean field3440 = true;

    @ObfuscatedName("jc.w")
    public int field3468 = -1;

    @ObfuscatedName("jc.g")
    public int field3442 = -1;

    @ObfuscatedName("jc.d")
    public boolean field3449 = false;

    @ObfuscatedName("jc.m")
    public boolean field3444 = false;

    @ObfuscatedName("jc.t")
    public int field3445 = -1;

    @ObfuscatedName("jc.h")
    public int field3446 = 16;

    @ObfuscatedName("jc.an")
    public int field3447 = 0;

    @ObfuscatedName("jc.al")
    public int field3448 = 0;

    @ObfuscatedName("jc.ah")
    public String[] field3430 = new String[5];

    @ObfuscatedName("jc.ad")
    public int field3454 = -1;

    @ObfuscatedName("jc.aa")
    public int field3443 = -1;

    @ObfuscatedName("jc.ag")
    public boolean field3453 = false;

    @ObfuscatedName("jc.av")
    public boolean field3451 = true;

    @ObfuscatedName("jc.am")
    public int field3423 = 128;

    @ObfuscatedName("jc.ap")
    public int field3455 = 128;

    @ObfuscatedName("jc.au")
    public int field3456 = 128;

    @ObfuscatedName("jc.ae")
    public int field3457 = 0;

    @ObfuscatedName("jc.ai")
    public int field3422 = 0;

    @ObfuscatedName("jc.ab")
    public int field3459 = 0;

    @ObfuscatedName("jc.aw")
    public boolean field3460 = false;

    @ObfuscatedName("jc.ac")
    public boolean field3461 = false;

    @ObfuscatedName("jc.aq")
    public int field3465 = -1;

    @ObfuscatedName("jc.az")
    public int[] field3439;

    @ObfuscatedName("jc.ay")
    public int field3464 = -1;

    @ObfuscatedName("jc.ao")
    public int field3435 = -1;

    @ObfuscatedName("jc.ak")
    public int field3441 = -1;

    @ObfuscatedName("jc.af")
    public int field3424 = 0;

    @ObfuscatedName("jc.ax")
    public int field3466 = 0;

    @ObfuscatedName("jc.ar")
    public int field3469 = 0;

    @ObfuscatedName("jc.at")
    public int[] field3470;

    @ObfuscatedName("jc.aj")
    public class200 field3471;

    @ObfuscatedName("dl.y(Liu;Liu;ZI)V")
    public static void method2581(class250 arg0, class250 arg1, boolean arg2) {
        Statics.field3452 = arg0;
        Statics.field3868 = arg1;
        field3463 = arg2;
    }

    @ObfuscatedName("fz.c(II)Ljc;")
    public static class271 method3187(int arg0) {
        class271 var1 = (class271) field3458.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3452.method4263(6, arg0);
        class271 var3 = new class271();
        var3.field3429 = arg0;
        if (var2 != null) {
            var3.method4674(new class185(var2));
        }
        var3.method4673();
        if (var3.field3461) {
            var3.field3433 = 0;
            var3.field3440 = false;
        }
        field3458.method3687(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jc.n(B)V")
    public void method4673() {
        if (this.field3468 == -1) {
            this.field3468 = 0;
            if (this.field3467 != null && (this.field3431 == null || this.field3431[0] == 10)) {
                this.field3468 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3430[var1] != null) {
                    this.field3468 = 1;
                }
            }
        }
        if (this.field3465 == -1) {
            this.field3465 = this.field3433 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jc.u(Lge;I)V")
    public void method4674(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4675(arg0, var2);
        }
    }

    @ObfuscatedName("jc.i(Lge;IB)V")
    public void method4675(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3299();
            if (var3 > 0) {
                if (this.field3467 == null || field3463) {
                    this.field3431 = new int[var3];
                    this.field3467 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3467[var4] = arg0.method3280();
                        this.field3431[var4] = arg0.method3299();
                    }
                } else {
                    arg0.field2374 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3432 = arg0.method3277();
        } else if (arg1 == 5) {
            int var5 = arg0.method3299();
            if (var5 > 0) {
                if (this.field3467 == null || field3463) {
                    this.field3431 = null;
                    this.field3467 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3467[var6] = arg0.method3280();
                    }
                } else {
                    arg0.field2374 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3437 = arg0.method3299();
        } else if (arg1 == 15) {
            this.field3438 = arg0.method3299();
        } else if (arg1 == 17) {
            this.field3433 = 0;
            this.field3440 = false;
        } else if (arg1 == 18) {
            this.field3440 = false;
        } else if (arg1 == 19) {
            this.field3468 = arg0.method3299();
        } else if (arg1 == 21) {
            this.field3442 = 0;
        } else if (arg1 == 22) {
            this.field3449 = true;
        } else if (arg1 == 23) {
            this.field3444 = true;
        } else if (arg1 == 24) {
            this.field3445 = arg0.method3280();
            if (this.field3445 == 65535) {
                this.field3445 = -1;
            }
        } else if (arg1 == 27) {
            this.field3433 = 1;
        } else if (arg1 == 28) {
            this.field3446 = arg0.method3299();
        } else if (arg1 == 29) {
            this.field3447 = arg0.method3319();
        } else if (arg1 == 39) {
            this.field3448 = arg0.method3319() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3430[arg1 - 30] = arg0.method3277();
            if (this.field3430[arg1 - 30].equalsIgnoreCase(class240.field2835)) {
                this.field3430[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3299();
            this.field3450 = new short[var7];
            this.field3434 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3450[var8] = (short) arg0.method3280();
                this.field3434[var8] = (short) arg0.method3280();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3299();
            this.field3428 = new short[var9];
            this.field3436 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3428[var10] = (short) arg0.method3280();
                this.field3436[var10] = (short) arg0.method3280();
            }
        } else if (arg1 == 62) {
            this.field3453 = true;
        } else if (arg1 == 64) {
            this.field3451 = false;
        } else if (arg1 == 65) {
            this.field3423 = arg0.method3280();
        } else if (arg1 == 66) {
            this.field3455 = arg0.method3280();
        } else if (arg1 == 67) {
            this.field3456 = arg0.method3280();
        } else if (arg1 == 68) {
            this.field3443 = arg0.method3280();
        } else if (arg1 == 69) {
            arg0.method3299();
        } else if (arg1 == 70) {
            this.field3457 = arg0.method3337();
        } else if (arg1 == 71) {
            this.field3422 = arg0.method3337();
        } else if (arg1 == 72) {
            this.field3459 = arg0.method3337();
        } else if (arg1 == 73) {
            this.field3460 = true;
        } else if (arg1 == 74) {
            this.field3461 = true;
        } else if (arg1 == 75) {
            this.field3465 = arg0.method3299();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3464 = arg0.method3280();
            if (this.field3464 == 65535) {
                this.field3464 = -1;
            }
            this.field3435 = arg0.method3280();
            if (this.field3435 == 65535) {
                this.field3435 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3280();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3299();
            this.field3439 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3439[var15] = arg0.method3280();
                if (this.field3439[var15] == 65535) {
                    this.field3439[var15] = -1;
                }
            }
            this.field3439[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3441 = arg0.method3280();
            this.field3424 = arg0.method3299();
        } else if (arg1 == 79) {
            this.field3466 = arg0.method3280();
            this.field3469 = arg0.method3280();
            this.field3424 = arg0.method3299();
            int var11 = arg0.method3299();
            this.field3470 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3470[var12] = arg0.method3280();
            }
        } else if (arg1 == 81) {
            this.field3442 = arg0.method3299() * 256;
        } else if (arg1 == 82) {
            this.field3454 = arg0.method3280();
        } else if (arg1 == 249) {
            this.field3471 = class265.method4229(arg0, this.field3471);
        }
    }

    @ObfuscatedName("jc.p(II)Z")
    public final boolean method4683(int arg0) {
        if (this.field3431 != null) {
            for (int var4 = 0; var4 < this.field3431.length; var4++) {
                if (this.field3431[var4] == arg0) {
                    return Statics.field3868.method4323(this.field3467[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3467 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3467.length; var3++) {
                var2 &= Statics.field3868.method4323(this.field3467[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jc.e(B)Z")
    public final boolean method4676() {
        if (this.field3467 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3467.length; var2++) {
            var1 &= Statics.field3868.method4323(this.field3467[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jc.s(II[[IIIIB)Ldc;")
    public final class130 method4723(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3431 == null) {
            var7 = (long) ((this.field3429 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3429 << 10) + (arg0 << 3) + arg1);
        }
        class130 var9 = (class130) field3426.method3685(var7);
        if (var9 == null) {
            class116 var10 = this.method4681(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3449) {
                var10.field1515 = (short) (this.field3447 + 64);
                var10.field1509 = (short) (this.field3448 + 768);
                var10.method2395();
                var9 = var10;
            } else {
                var9 = var10.method2399(this.field3447 + 64, this.field3448 + 768, -50, -10, -50);
            }
            field3426.method3687(var9, var7);
        }
        if (this.field3449) {
            var9 = ((class116) var9).method2420();
        }
        if (this.field3442 >= 0) {
            if (var9 instanceof class122) {
                var9 = ((class122) var9).method2468(arg2, arg3, arg4, arg5, true, this.field3442);
            } else if (var9 instanceof class116) {
                var9 = ((class116) var9).method2384(arg2, arg3, arg4, arg5, true, this.field3442);
            }
        }
        return var9;
    }

    @ObfuscatedName("jc.v(II[[IIIII)Lde;")
    public final class122 method4708(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3431 == null) {
            var7 = (long) ((this.field3429 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3429 << 10) + (arg0 << 3) + arg1);
        }
        class122 var9 = (class122) field3427.method3685(var7);
        if (var9 == null) {
            class116 var10 = this.method4681(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2399(this.field3447 + 64, this.field3448 + 768, -50, -10, -50);
            field3427.method3687(var9, var7);
        }
        if (this.field3442 >= 0) {
            var9 = var9.method2468(arg2, arg3, arg4, arg5, true, this.field3442);
        }
        return var9;
    }

    @ObfuscatedName("jc.k(II[[IIIILjo;II)Lde;")
    public final class122 method4680(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class276 arg6, int arg7) {
        long var9;
        if (this.field3431 == null) {
            var9 = (long) ((this.field3429 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3429 << 10) + (arg0 << 3) + arg1);
        }
        class122 var11 = (class122) field3427.method3685(var9);
        if (var11 == null) {
            class116 var12 = this.method4681(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2399(this.field3447 + 64, this.field3448 + 768, -50, -10, -50);
            field3427.method3687(var11, var9);
        }
        if (arg6 == null && this.field3442 == -1) {
            return var11;
        }
        class122 var13;
        if (arg6 == null) {
            var13 = var11.method2469(true);
        } else {
            var13 = arg6.method4859(var11, arg7, arg1);
        }
        if (this.field3442 >= 0) {
            var13 = var13.method2468(arg2, arg3, arg4, arg5, false, this.field3442);
        }
        return var13;
    }

    @ObfuscatedName("jc.o(III)Ldz;")
    public final class116 method4681(int arg0, int arg1) {
        class116 var3 = null;
        if (this.field3431 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3467 == null) {
                return null;
            }
            boolean var4 = this.field3453;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3467.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3467[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class116) field3425.method3685((long) var7);
                if (var3 == null) {
                    var3 = class116.method2378(Statics.field3868, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2393();
                    }
                    field3425.method3687(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3462[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class116(field3462, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3431.length; var9++) {
                if (this.field3431[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3467[var8];
            boolean var11 = this.field3453 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class116) field3425.method3685((long) var10);
            if (var3 == null) {
                var3 = class116.method2378(Statics.field3868, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2393();
                }
                field3425.method3687(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3423 == 128 && this.field3455 == 128 && this.field3456 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3457 == 0 && this.field3422 == 0 && this.field3459 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class116 var14 = new class116(var3, arg1 == 0 && !var12 && !var13, this.field3450 == null, this.field3428 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2446(256);
            var14.method2447(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2423();
        } else if (var15 == 2) {
            var14.method2381();
        } else if (var15 == 3) {
            var14.method2388();
        }
        if (this.field3450 != null) {
            for (int var16 = 0; var16 < this.field3450.length; var16++) {
                var14.method2386(this.field3450[var16], this.field3434[var16]);
            }
        }
        if (this.field3428 != null) {
            for (int var17 = 0; var17 < this.field3428.length; var17++) {
                var14.method2392(this.field3428[var17], this.field3436[var17]);
            }
        }
        if (var12) {
            var14.method2394(this.field3423, this.field3455, this.field3456);
        }
        if (var13) {
            var14.method2447(this.field3457, this.field3422, this.field3459);
        }
        return var14;
    }

    @ObfuscatedName("jc.q(I)Ljc;")
    public final class271 method4677() {
        int var1 = -1;
        if (this.field3464 != -1) {
            var1 = class228.method3085(this.field3464);
        } else if (this.field3435 != -1) {
            var1 = class228.field2601[this.field3435];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3439.length - 1) {
            var2 = this.field3439[var1];
        } else {
            var2 = this.field3439[this.field3439.length - 1];
        }
        return var2 == -1 ? null : method3187(var2);
    }

    @ObfuscatedName("jc.l(III)I")
    public int method4713(int arg0, int arg1) {
        return class265.method4405(this.field3471, arg0, arg1);
    }

    @ObfuscatedName("jc.f(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4716(int arg0, String arg1) {
        return class265.method966(this.field3471, arg0, arg1);
    }

    @ObfuscatedName("it.z(S)V")
    public static void method4352() {
        field3458.method3695();
        field3425.method3695();
        field3426.method3695();
        field3427.method3695();
    }

    @ObfuscatedName("jc.a(I)Z")
    public boolean method4685() {
        if (this.field3439 == null) {
            return this.field3441 != -1 || this.field3470 != null;
        }
        for (int var1 = 0; var1 < this.field3439.length; var1++) {
            if (this.field3439[var1] != -1) {
                class271 var2 = method3187(this.field3439[var1]);
                if (var2.field3441 != -1 || var2.field3470 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
