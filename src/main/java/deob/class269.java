package deob;

@ObfuscatedName("jj")
public class class269 extends class207 {

    @ObfuscatedName("jj.z")
    public static boolean field3417 = false;

    @ObfuscatedName("jj.l")
    public static class201 field3372 = new class201(4096);

    @ObfuscatedName("jj.u")
    public static class201 field3392 = new class201(500);

    @ObfuscatedName("jj.q")
    public static class201 field3371 = new class201(30);

    @ObfuscatedName("jj.k")
    public static class201 field3375 = new class201(30);

    @ObfuscatedName("jj.i")
    public static class114[] field3376 = new class114[4];

    @ObfuscatedName("jj.x")
    public int field3377;

    @ObfuscatedName("jj.e")
    public int[] field3391;

    @ObfuscatedName("jj.p")
    public int[] field3379;

    @ObfuscatedName("jj.b")
    public String field3374 = class238.field2798;

    @ObfuscatedName("jj.n")
    public short[] field3382;

    @ObfuscatedName("jj.f")
    public short[] field3393;

    @ObfuscatedName("jj.g")
    public short[] field3383;

    @ObfuscatedName("jj.m")
    public short[] field3394;

    @ObfuscatedName("jj.r")
    public int field3385 = 1;

    @ObfuscatedName("jj.t")
    public int field3386 = 1;

    @ObfuscatedName("jj.o")
    public int field3387 = 2;

    @ObfuscatedName("jj.y")
    public boolean field3405 = true;

    @ObfuscatedName("jj.a")
    public int field3389 = -1;

    @ObfuscatedName("jj.j")
    public int field3390 = -1;

    @ObfuscatedName("jj.d")
    public boolean field3396 = false;

    @ObfuscatedName("jj.h")
    public boolean field3384 = false;

    @ObfuscatedName("jj.c")
    public int field3373 = -1;

    @ObfuscatedName("jj.v")
    public int field3380 = 16;

    @ObfuscatedName("jj.af")
    public int field3395 = 0;

    @ObfuscatedName("jj.ah")
    public int field3404 = 0;

    @ObfuscatedName("jj.ab")
    public String[] field3388 = new String[5];

    @ObfuscatedName("jj.aw")
    public int field3398 = -1;

    @ObfuscatedName("jj.ak")
    public int field3416 = -1;

    @ObfuscatedName("jj.as")
    public boolean field3397 = false;

    @ObfuscatedName("jj.an")
    public boolean field3401 = true;

    @ObfuscatedName("jj.ao")
    public int field3402 = 128;

    @ObfuscatedName("jj.at")
    public int field3403 = 128;

    @ObfuscatedName("jj.ai")
    public int field3400 = 128;

    @ObfuscatedName("jj.ac")
    public int field3370 = 0;

    @ObfuscatedName("jj.ap")
    public int field3406 = 0;

    @ObfuscatedName("jj.aa")
    public int field3407 = 0;

    @ObfuscatedName("jj.ar")
    public boolean field3408 = false;

    @ObfuscatedName("jj.au")
    public boolean field3399 = false;

    @ObfuscatedName("jj.av")
    public int field3410 = -1;

    @ObfuscatedName("jj.al")
    public int[] field3411;

    @ObfuscatedName("jj.ae")
    public int field3412 = -1;

    @ObfuscatedName("jj.az")
    public int field3413 = -1;

    @ObfuscatedName("jj.aq")
    public int field3414 = -1;

    @ObfuscatedName("jj.ad")
    public int field3415 = 0;

    @ObfuscatedName("jj.aj")
    public int field3381 = 0;

    @ObfuscatedName("jj.ax")
    public int field3409 = 0;

    @ObfuscatedName("jj.am")
    public int[] field3418;

    @ObfuscatedName("jj.ay")
    public class198 field3419;

    @ObfuscatedName("dv.z(IB)Ljj;")
    public static class269 method2323(int arg0) {
        class269 var1 = (class269) field3372.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3378.method4247(6, arg0);
        class269 var3 = new class269();
        var3.field3377 = arg0;
        if (var2 != null) {
            var3.method4635(new class183(var2));
        }
        var3.method4634();
        if (var3.field3399) {
            var3.field3387 = 0;
            var3.field3405 = false;
        }
        field3372.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.w(I)V")
    public void method4634() {
        if (this.field3389 == -1) {
            this.field3389 = 0;
            if (this.field3391 != null && (this.field3379 == null || this.field3379[0] == 10)) {
                this.field3389 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3388[var1] != null) {
                    this.field3389 = 1;
                }
            }
        }
        if (this.field3410 == -1) {
            this.field3410 = this.field3387 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jj.s(Lgk;I)V")
    public void method4635(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4679(arg0, var2);
        }
    }

    @ObfuscatedName("jj.l(Lgk;IS)V")
    public void method4679(class183 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3247();
            if (var3 > 0) {
                if (this.field3391 == null || field3417) {
                    this.field3379 = new int[var3];
                    this.field3391 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3391[var4] = arg0.method3253();
                        this.field3379[var4] = arg0.method3247();
                    }
                } else {
                    arg0.field2340 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3374 = arg0.method3441();
        } else if (arg1 == 5) {
            int var5 = arg0.method3247();
            if (var5 > 0) {
                if (this.field3391 == null || field3417) {
                    this.field3379 = null;
                    this.field3391 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3391[var6] = arg0.method3253();
                    }
                } else {
                    arg0.field2340 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3385 = arg0.method3247();
        } else if (arg1 == 15) {
            this.field3386 = arg0.method3247();
        } else if (arg1 == 17) {
            this.field3387 = 0;
            this.field3405 = false;
        } else if (arg1 == 18) {
            this.field3405 = false;
        } else if (arg1 == 19) {
            this.field3389 = arg0.method3247();
        } else if (arg1 == 21) {
            this.field3390 = 0;
        } else if (arg1 == 22) {
            this.field3396 = true;
        } else if (arg1 == 23) {
            this.field3384 = true;
        } else if (arg1 == 24) {
            this.field3373 = arg0.method3253();
            if (this.field3373 == 65535) {
                this.field3373 = -1;
            }
        } else if (arg1 == 27) {
            this.field3387 = 1;
        } else if (arg1 == 28) {
            this.field3380 = arg0.method3247();
        } else if (arg1 == 29) {
            this.field3395 = arg0.method3384();
        } else if (arg1 == 39) {
            this.field3404 = arg0.method3384() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3388[arg1 - 30] = arg0.method3441();
            if (this.field3388[arg1 - 30].equalsIgnoreCase(class238.field2960)) {
                this.field3388[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3247();
            this.field3382 = new short[var7];
            this.field3393 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3382[var8] = (short) arg0.method3253();
                this.field3393[var8] = (short) arg0.method3253();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3247();
            this.field3383 = new short[var9];
            this.field3394 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3383[var10] = (short) arg0.method3253();
                this.field3394[var10] = (short) arg0.method3253();
            }
        } else if (arg1 == 62) {
            this.field3397 = true;
        } else if (arg1 == 64) {
            this.field3401 = false;
        } else if (arg1 == 65) {
            this.field3402 = arg0.method3253();
        } else if (arg1 == 66) {
            this.field3403 = arg0.method3253();
        } else if (arg1 == 67) {
            this.field3400 = arg0.method3253();
        } else if (arg1 == 68) {
            this.field3416 = arg0.method3253();
        } else if (arg1 == 69) {
            arg0.method3247();
        } else if (arg1 == 70) {
            this.field3370 = arg0.method3254();
        } else if (arg1 == 71) {
            this.field3406 = arg0.method3254();
        } else if (arg1 == 72) {
            this.field3407 = arg0.method3254();
        } else if (arg1 == 73) {
            this.field3408 = true;
        } else if (arg1 == 74) {
            this.field3399 = true;
        } else if (arg1 == 75) {
            this.field3410 = arg0.method3247();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3412 = arg0.method3253();
            if (this.field3412 == 65535) {
                this.field3412 = -1;
            }
            this.field3413 = arg0.method3253();
            if (this.field3413 == 65535) {
                this.field3413 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3253();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3247();
            this.field3411 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3411[var15] = arg0.method3253();
                if (this.field3411[var15] == 65535) {
                    this.field3411[var15] = -1;
                }
            }
            this.field3411[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3414 = arg0.method3253();
            this.field3415 = arg0.method3247();
        } else if (arg1 == 79) {
            this.field3381 = arg0.method3253();
            this.field3409 = arg0.method3253();
            this.field3415 = arg0.method3247();
            int var11 = arg0.method3247();
            this.field3418 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3418[var12] = arg0.method3253();
            }
        } else if (arg1 == 81) {
            this.field3390 = arg0.method3247() * 256;
        } else if (arg1 == 82) {
            this.field3398 = arg0.method3253();
        } else if (arg1 == 249) {
            this.field3419 = class263.method612(arg0, this.field3419);
        }
    }

    @ObfuscatedName("jj.u(II)Z")
    public final boolean method4657(int arg0) {
        if (this.field3379 != null) {
            for (int var4 = 0; var4 < this.field3379.length; var4++) {
                if (this.field3379[var4] == arg0) {
                    return Statics.field1802.method4318(this.field3391[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3391 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3391.length; var3++) {
                var2 &= Statics.field1802.method4318(this.field3391[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jj.q(I)Z")
    public final boolean method4660() {
        if (this.field3391 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3391.length; var2++) {
            var1 &= Statics.field1802.method4318(this.field3391[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jj.i(II[[IIIII)Ldf;")
    public final class128 method4688(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3379 == null) {
            var7 = (long) ((this.field3377 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3377 << 10) + (arg0 << 3) + arg1);
        }
        class128 var9 = (class128) field3371.method3681(var7);
        if (var9 == null) {
            class114 var10 = this.method4642(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3396) {
                var10.field1487 = (short) (this.field3395 + 64);
                var10.field1488 = (short) (this.field3404 + 768);
                var10.method2381();
                var9 = var10;
            } else {
                var9 = var10.method2385(this.field3395 + 64, this.field3404 + 768, -50, -10, -50);
            }
            field3371.method3675(var9, var7);
        }
        if (this.field3396) {
            var9 = ((class114) var9).method2446();
        }
        if (this.field3390 >= 0) {
            if (var9 instanceof class120) {
                var9 = ((class120) var9).method2461(arg2, arg3, arg4, arg5, true, this.field3390);
            } else if (var9 instanceof class114) {
                var9 = ((class114) var9).method2363(arg2, arg3, arg4, arg5, true, this.field3390);
            }
        }
        return var9;
    }

    @ObfuscatedName("jj.x(II[[IIIIB)Ldc;")
    public final class120 method4640(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3379 == null) {
            var7 = (long) ((this.field3377 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3377 << 10) + (arg0 << 3) + arg1);
        }
        class120 var9 = (class120) field3375.method3681(var7);
        if (var9 == null) {
            class114 var10 = this.method4642(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2385(this.field3395 + 64, this.field3404 + 768, -50, -10, -50);
            field3375.method3675(var9, var7);
        }
        if (this.field3390 >= 0) {
            var9 = var9.method2461(arg2, arg3, arg4, arg5, true, this.field3390);
        }
        return var9;
    }

    @ObfuscatedName("jj.e(II[[IIIILjn;II)Ldc;")
    public final class120 method4641(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class274 arg6, int arg7) {
        long var9;
        if (this.field3379 == null) {
            var9 = (long) ((this.field3377 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3377 << 10) + (arg0 << 3) + arg1);
        }
        class120 var11 = (class120) field3375.method3681(var9);
        if (var11 == null) {
            class114 var12 = this.method4642(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2385(this.field3395 + 64, this.field3404 + 768, -50, -10, -50);
            field3375.method3675(var11, var9);
        }
        if (arg6 == null && this.field3390 == -1) {
            return var11;
        }
        class120 var13;
        if (arg6 == null) {
            var13 = var11.method2462(true);
        } else {
            var13 = arg6.method4822(var11, arg7, arg1);
        }
        if (this.field3390 >= 0) {
            var13 = var13.method2461(arg2, arg3, arg4, arg5, false, this.field3390);
        }
        return var13;
    }

    @ObfuscatedName("jj.p(IIS)Ldb;")
    public final class114 method4642(int arg0, int arg1) {
        class114 var3 = null;
        if (this.field3379 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3391 == null) {
                return null;
            }
            boolean var4 = this.field3397;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3391.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3391[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class114) field3392.method3681((long) var7);
                if (var3 == null) {
                    var3 = class114.method2364(Statics.field1802, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2379();
                    }
                    field3392.method3675(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3376[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class114(field3376, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3379.length; var9++) {
                if (this.field3379[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3391[var8];
            boolean var11 = this.field3397 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class114) field3392.method3681((long) var10);
            if (var3 == null) {
                var3 = class114.method2364(Statics.field1802, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2379();
                }
                field3392.method3675(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3402 == 128 && this.field3403 == 128 && this.field3400 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3370 == 0 && this.field3406 == 0 && this.field3407 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class114 var14 = new class114(var3, arg1 == 0 && !var12 && !var13, this.field3382 == null, this.field3383 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2449(256);
            var14.method2376(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2372();
        } else if (var15 == 2) {
            var14.method2369();
        } else if (var15 == 3) {
            var14.method2374();
        }
        if (this.field3382 != null) {
            for (int var16 = 0; var16 < this.field3382.length; var16++) {
                var14.method2377(this.field3382[var16], this.field3393[var16]);
            }
        }
        if (this.field3383 != null) {
            for (int var17 = 0; var17 < this.field3383.length; var17++) {
                var14.method2378(this.field3383[var17], this.field3394[var17]);
            }
        }
        if (var12) {
            var14.method2388(this.field3402, this.field3403, this.field3400);
        }
        if (var13) {
            var14.method2376(this.field3370, this.field3406, this.field3407);
        }
        return var14;
    }

    @ObfuscatedName("jj.b(I)Ljj;")
    public final class269 method4665() {
        int var1 = -1;
        if (this.field3412 != -1) {
            var1 = class226.method3095(this.field3412);
        } else if (this.field3413 != -1) {
            var1 = class226.field2559[this.field3413];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3411.length - 1) {
            var2 = this.field3411[var1];
        } else {
            var2 = this.field3411[this.field3411.length - 1];
        }
        return var2 == -1 ? null : method2323(var2);
    }

    @ObfuscatedName("jj.n(IIB)I")
    public int method4644(int arg0, int arg1) {
        return class263.method1561(this.field3419, arg0, arg1);
    }

    @ObfuscatedName("jj.f(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4645(int arg0, String arg1) {
        return class263.method172(this.field3419, arg0, arg1);
    }

    @ObfuscatedName("l.g(I)V")
    public static void method35() {
        field3372.method3676();
        field3392.method3676();
        field3371.method3676();
        field3375.method3676();
    }

    @ObfuscatedName("jj.m(I)Z")
    public boolean method4633() {
        if (this.field3411 == null) {
            return this.field3414 != -1 || this.field3418 != null;
        }
        for (int var1 = 0; var1 < this.field3411.length; var1++) {
            if (this.field3411[var1] != -1) {
                class269 var2 = method2323(this.field3411[var1]);
                if (var2.field3414 != -1 || var2.field3418 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
