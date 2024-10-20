package deob;

@ObfuscatedName("jp")
public class class269 extends class207 {

    @ObfuscatedName("jp.w")
    public static boolean field3433 = false;

    @ObfuscatedName("jp.b")
    public static class201 field3393 = new class201(4096);

    @ObfuscatedName("jp.f")
    public static class201 field3427 = new class201(500);

    @ObfuscatedName("jp.n")
    public static class201 field3411 = new class201(30);

    @ObfuscatedName("jp.h")
    public static class201 field3395 = new class201(30);

    @ObfuscatedName("jp.x")
    public static class114[] field3420 = new class114[4];

    @ObfuscatedName("jp.j")
    public int field3397;

    @ObfuscatedName("jp.a")
    public int[] field3398;

    @ObfuscatedName("jp.l")
    public int[] field3399;

    @ObfuscatedName("jp.d")
    public String field3417 = class238.field2821;

    @ObfuscatedName("jp.s")
    public short[] field3410;

    @ObfuscatedName("jp.p")
    public short[] field3402;

    @ObfuscatedName("jp.g")
    public short[] field3390;

    @ObfuscatedName("jp.y")
    public short[] field3404;

    @ObfuscatedName("jp.c")
    public int field3405 = 1;

    @ObfuscatedName("jp.e")
    public int field3421 = 1;

    @ObfuscatedName("jp.t")
    public int field3407 = 2;

    @ObfuscatedName("jp.u")
    public boolean field3408 = true;

    @ObfuscatedName("jp.i")
    public int field3409 = -1;

    @ObfuscatedName("jp.z")
    public int field3426 = -1;

    @ObfuscatedName("jp.k")
    public boolean field3437 = false;

    @ObfuscatedName("jp.r")
    public boolean field3394 = false;

    @ObfuscatedName("jp.v")
    public int field3413 = -1;

    @ObfuscatedName("jp.o")
    public int field3414 = 16;

    @ObfuscatedName("jp.ai")
    public int field3403 = 0;

    @ObfuscatedName("jp.at")
    public int field3416 = 0;

    @ObfuscatedName("jp.ad")
    public String[] field3391 = new String[5];

    @ObfuscatedName("jp.ac")
    public int field3418 = -1;

    @ObfuscatedName("jp.ay")
    public int field3419 = -1;

    @ObfuscatedName("jp.an")
    public boolean field3392 = false;

    @ObfuscatedName("jp.as")
    public boolean field3400 = true;

    @ObfuscatedName("jp.aw")
    public int field3422 = 128;

    @ObfuscatedName("jp.ag")
    public int field3423 = 128;

    @ObfuscatedName("jp.ah")
    public int field3424 = 128;

    @ObfuscatedName("jp.az")
    public int field3425 = 0;

    @ObfuscatedName("jp.ao")
    public int field3401 = 0;

    @ObfuscatedName("jp.ap")
    public int field3415 = 0;

    @ObfuscatedName("jp.af")
    public boolean field3428 = false;

    @ObfuscatedName("jp.am")
    public boolean field3429 = false;

    @ObfuscatedName("jp.aq")
    public int field3430 = -1;

    @ObfuscatedName("jp.aj")
    public int[] field3431;

    @ObfuscatedName("jp.ae")
    public int field3412 = -1;

    @ObfuscatedName("jp.au")
    public int field3432 = -1;

    @ObfuscatedName("jp.av")
    public int field3434 = -1;

    @ObfuscatedName("jp.ab")
    public int field3435 = 0;

    @ObfuscatedName("jp.aa")
    public int field3436 = 0;

    @ObfuscatedName("jp.ar")
    public int field3406 = 0;

    @ObfuscatedName("jp.ax")
    public int[] field3438;

    @ObfuscatedName("jp.al")
    public class198 field3439;

    @ObfuscatedName("jk.w(Liv;Liv;ZB)V")
    public static void method4537(class248 arg0, class248 arg1, boolean arg2) {
        Statics.field3396 = arg0;
        Statics.field64 = arg1;
        field3433 = arg2;
    }

    @ObfuscatedName("am.m(II)Ljp;")
    public static class269 method675(int arg0) {
        class269 var1 = (class269) field3393.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3396.method4250(6, arg0);
        class269 var3 = new class269();
        var3.field3397 = arg0;
        if (var2 != null) {
            var3.method4660(new class183(var2));
        }
        var3.method4668();
        if (var3.field3429) {
            var3.field3407 = 0;
            var3.field3408 = false;
        }
        field3393.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.q(S)V")
    public void method4668() {
        if (this.field3409 == -1) {
            this.field3409 = 0;
            if (this.field3398 != null && (this.field3399 == null || this.field3399[0] == 10)) {
                this.field3409 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3391[var1] != null) {
                    this.field3409 = 1;
                }
            }
        }
        if (this.field3430 == -1) {
            this.field3430 = this.field3407 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jp.x(Lgy;I)V")
    public void method4660(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4661(arg0, var2);
        }
    }

    @ObfuscatedName("jp.j(Lgy;II)V")
    public void method4661(class183 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3436();
            if (var3 > 0) {
                if (this.field3398 == null || field3433) {
                    this.field3399 = new int[var3];
                    this.field3398 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3398[var4] = arg0.method3268();
                        this.field3399[var4] = arg0.method3436();
                    }
                } else {
                    arg0.field2360 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3417 = arg0.method3271();
        } else if (arg1 == 5) {
            int var5 = arg0.method3436();
            if (var5 > 0) {
                if (this.field3398 == null || field3433) {
                    this.field3399 = null;
                    this.field3398 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3398[var6] = arg0.method3268();
                    }
                } else {
                    arg0.field2360 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3405 = arg0.method3436();
        } else if (arg1 == 15) {
            this.field3421 = arg0.method3436();
        } else if (arg1 == 17) {
            this.field3407 = 0;
            this.field3408 = false;
        } else if (arg1 == 18) {
            this.field3408 = false;
        } else if (arg1 == 19) {
            this.field3409 = arg0.method3436();
        } else if (arg1 == 21) {
            this.field3426 = 0;
        } else if (arg1 == 22) {
            this.field3437 = true;
        } else if (arg1 == 23) {
            this.field3394 = true;
        } else if (arg1 == 24) {
            this.field3413 = arg0.method3268();
            if (this.field3413 == 65535) {
                this.field3413 = -1;
            }
        } else if (arg1 == 27) {
            this.field3407 = 1;
        } else if (arg1 == 28) {
            this.field3414 = arg0.method3436();
        } else if (arg1 == 29) {
            this.field3403 = arg0.method3263();
        } else if (arg1 == 39) {
            this.field3416 = arg0.method3263() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3391[arg1 - 30] = arg0.method3271();
            if (this.field3391[arg1 - 30].equalsIgnoreCase(class238.field2816)) {
                this.field3391[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3436();
            this.field3410 = new short[var7];
            this.field3402 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3410[var8] = (short) arg0.method3268();
                this.field3402[var8] = (short) arg0.method3268();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3436();
            this.field3390 = new short[var9];
            this.field3404 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3390[var10] = (short) arg0.method3268();
                this.field3404[var10] = (short) arg0.method3268();
            }
        } else if (arg1 == 62) {
            this.field3392 = true;
        } else if (arg1 == 64) {
            this.field3400 = false;
        } else if (arg1 == 65) {
            this.field3422 = arg0.method3268();
        } else if (arg1 == 66) {
            this.field3423 = arg0.method3268();
        } else if (arg1 == 67) {
            this.field3424 = arg0.method3268();
        } else if (arg1 == 68) {
            this.field3419 = arg0.method3268();
        } else if (arg1 == 69) {
            arg0.method3436();
        } else if (arg1 == 70) {
            this.field3425 = arg0.method3498();
        } else if (arg1 == 71) {
            this.field3401 = arg0.method3498();
        } else if (arg1 == 72) {
            this.field3415 = arg0.method3498();
        } else if (arg1 == 73) {
            this.field3428 = true;
        } else if (arg1 == 74) {
            this.field3429 = true;
        } else if (arg1 == 75) {
            this.field3430 = arg0.method3436();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3412 = arg0.method3268();
            if (this.field3412 == 65535) {
                this.field3412 = -1;
            }
            this.field3432 = arg0.method3268();
            if (this.field3432 == 65535) {
                this.field3432 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3268();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3436();
            this.field3431 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3431[var15] = arg0.method3268();
                if (this.field3431[var15] == 65535) {
                    this.field3431[var15] = -1;
                }
            }
            this.field3431[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3434 = arg0.method3268();
            this.field3435 = arg0.method3436();
        } else if (arg1 == 79) {
            this.field3436 = arg0.method3268();
            this.field3406 = arg0.method3268();
            this.field3435 = arg0.method3436();
            int var11 = arg0.method3436();
            this.field3438 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3438[var12] = arg0.method3268();
            }
        } else if (arg1 == 81) {
            this.field3426 = arg0.method3436() * 256;
        } else if (arg1 == 82) {
            this.field3418 = arg0.method3268();
        } else if (arg1 == 249) {
            this.field3439 = Statics.method2312(arg0, this.field3439);
        }
    }

    @ObfuscatedName("jp.a(IB)Z")
    public final boolean method4662(int arg0) {
        if (this.field3399 != null) {
            for (int var4 = 0; var4 < this.field3399.length; var4++) {
                if (this.field3399[var4] == arg0) {
                    return Statics.field64.method4332(this.field3398[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3398 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3398.length; var3++) {
                var2 &= Statics.field64.method4332(this.field3398[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jp.l(I)Z")
    public final boolean method4659() {
        if (this.field3398 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3398.length; var2++) {
            var1 &= Statics.field64.method4332(this.field3398[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jp.d(II[[IIIIB)Ldz;")
    public final class128 method4664(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3399 == null) {
            var7 = (long) ((this.field3397 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3397 << 10) + (arg0 << 3) + arg1);
        }
        class128 var9 = (class128) field3411.method3707(var7);
        if (var9 == null) {
            class114 var10 = this.method4663(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3437) {
                var10.field1516 = (short) (this.field3403 + 64);
                var10.field1491 = (short) (this.field3416 + 768);
                var10.method2422();
                var9 = var10;
            } else {
                var9 = var10.method2418(this.field3403 + 64, this.field3416 + 768, -50, -10, -50);
            }
            field3411.method3712(var9, var7);
        }
        if (this.field3437) {
            var9 = ((class114) var9).method2411();
        }
        if (this.field3426 >= 0) {
            if (var9 instanceof class120) {
                var9 = ((class120) var9).method2507(arg2, arg3, arg4, arg5, true, this.field3426);
            } else if (var9 instanceof class114) {
                var9 = ((class114) var9).method2412(arg2, arg3, arg4, arg5, true, this.field3426);
            }
        }
        return var9;
    }

    @ObfuscatedName("jp.s(II[[IIIII)Ldk;")
    public final class120 method4665(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3399 == null) {
            var7 = (long) ((this.field3397 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3397 << 10) + (arg0 << 3) + arg1);
        }
        class120 var9 = (class120) field3395.method3707(var7);
        if (var9 == null) {
            class114 var10 = this.method4663(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2418(this.field3403 + 64, this.field3416 + 768, -50, -10, -50);
            field3395.method3712(var9, var7);
        }
        if (this.field3426 >= 0) {
            var9 = var9.method2507(arg2, arg3, arg4, arg5, true, this.field3426);
        }
        return var9;
    }

    @ObfuscatedName("jp.p(II[[IIIILjh;II)Ldk;")
    public final class120 method4705(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class274 arg6, int arg7) {
        long var9;
        if (this.field3399 == null) {
            var9 = (long) ((this.field3397 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3397 << 10) + (arg0 << 3) + arg1);
        }
        class120 var11 = (class120) field3395.method3707(var9);
        if (var11 == null) {
            class114 var12 = this.method4663(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2418(this.field3403 + 64, this.field3416 + 768, -50, -10, -50);
            field3395.method3712(var11, var9);
        }
        if (arg6 == null && this.field3426 == -1) {
            return var11;
        }
        class120 var13;
        if (arg6 == null) {
            var13 = var11.method2516(true);
        } else {
            var13 = arg6.method4831(var11, arg7, arg1);
        }
        if (this.field3426 >= 0) {
            var13 = var13.method2507(arg2, arg3, arg4, arg5, false, this.field3426);
        }
        return var13;
    }

    @ObfuscatedName("jp.g(III)Ldo;")
    public final class114 method4663(int arg0, int arg1) {
        class114 var3 = null;
        if (this.field3399 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3398 == null) {
                return null;
            }
            boolean var4 = this.field3392;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3398.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3398[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class114) field3427.method3707((long) var7);
                if (var3 == null) {
                    var3 = class114.method2406(Statics.field64, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2420();
                    }
                    field3427.method3712(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3420[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class114(field3420, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3399.length; var9++) {
                if (this.field3399[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3398[var8];
            boolean var11 = this.field3392 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class114) field3427.method3707((long) var10);
            if (var3 == null) {
                var3 = class114.method2406(Statics.field64, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2420();
                }
                field3427.method3712(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3422 == 128 && this.field3423 == 128 && this.field3424 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3425 == 0 && this.field3401 == 0 && this.field3415 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class114 var14 = new class114(var3, arg1 == 0 && !var12 && !var13, this.field3410 == null, this.field3390 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2450(256);
            var14.method2417(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2436();
        } else if (var15 == 2) {
            var14.method2414();
        } else if (var15 == 3) {
            var14.method2428();
        }
        if (this.field3410 != null) {
            for (int var16 = 0; var16 < this.field3410.length; var16++) {
                var14.method2476(this.field3410[var16], this.field3402[var16]);
            }
        }
        if (this.field3390 != null) {
            for (int var17 = 0; var17 < this.field3390.length; var17++) {
                var14.method2419(this.field3390[var17], this.field3404[var17]);
            }
        }
        if (var12) {
            var14.method2461(this.field3422, this.field3423, this.field3424);
        }
        if (var13) {
            var14.method2417(this.field3425, this.field3401, this.field3415);
        }
        return var14;
    }

    @ObfuscatedName("jp.y(I)Ljp;")
    public final class269 method4689() {
        int var1 = -1;
        if (this.field3412 != -1) {
            var1 = class226.method2926(this.field3412);
        } else if (this.field3432 != -1) {
            var1 = class226.field2579[this.field3432];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3431.length - 1) {
            var2 = this.field3431[var1];
        } else {
            var2 = this.field3431[this.field3431.length - 1];
        }
        return var2 == -1 ? null : method675(var2);
    }

    @ObfuscatedName("jp.c(III)I")
    public int method4691(int arg0, int arg1) {
        class198 var3 = this.field3439;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class212 var5 = (class212) var3.method3675((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2465;
            }
        }
        return var4;
    }

    @ObfuscatedName("jp.e(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4670(int arg0, String arg1) {
        return class263.method1701(this.field3439, arg0, arg1);
    }

    @ObfuscatedName("jp.t(B)Z")
    public boolean method4675() {
        if (this.field3431 == null) {
            return this.field3434 != -1 || this.field3438 != null;
        }
        for (int var1 = 0; var1 < this.field3431.length; var1++) {
            if (this.field3431[var1] != -1) {
                class269 var2 = method675(this.field3431[var1]);
                if (var2.field3434 != -1 || var2.field3438 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
