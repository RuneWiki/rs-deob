package deob;

@ObfuscatedName("jl")
public class class271 extends class209 {

    @ObfuscatedName("jl.c")
    public static boolean field3446 = false;

    @ObfuscatedName("jl.j")
    public static class203 field3418 = new class203(4096);

    @ObfuscatedName("jl.g")
    public static class203 field3419 = new class203(500);

    @ObfuscatedName("jl.i")
    public static class203 field3420 = new class203(30);

    @ObfuscatedName("jl.h")
    public static class203 field3454 = new class203(30);

    @ObfuscatedName("jl.l")
    public static class116[] field3422 = new class116[4];

    @ObfuscatedName("jl.d")
    public int field3461;

    @ObfuscatedName("jl.o")
    public int[] field3424;

    @ObfuscatedName("jl.s")
    public int[] field3425;

    @ObfuscatedName("jl.k")
    public String field3426 = class240.field3056;

    @ObfuscatedName("jl.v")
    public short[] field3427;

    @ObfuscatedName("jl.p")
    public short[] field3428;

    @ObfuscatedName("jl.n")
    public short[] field3437;

    @ObfuscatedName("jl.t")
    public short[] field3421;

    @ObfuscatedName("jl.r")
    public int field3431 = 1;

    @ObfuscatedName("jl.x")
    public int field3433 = 1;

    @ObfuscatedName("jl.b")
    public int field3429 = 2;

    @ObfuscatedName("jl.w")
    public boolean field3423 = true;

    @ObfuscatedName("jl.e")
    public int field3435 = -1;

    @ObfuscatedName("jl.a")
    public int field3436 = -1;

    @ObfuscatedName("jl.z")
    public boolean field3462 = false;

    @ObfuscatedName("jl.y")
    public boolean field3438 = false;

    @ObfuscatedName("jl.u")
    public int field3439 = -1;

    @ObfuscatedName("jl.f")
    public int field3440 = 16;

    @ObfuscatedName("jl.at")
    public int field3441 = 0;

    @ObfuscatedName("jl.ay")
    public int field3430 = 0;

    @ObfuscatedName("jl.ak")
    public String[] field3443 = new String[5];

    @ObfuscatedName("jl.az")
    public int field3459 = -1;

    @ObfuscatedName("jl.aj")
    public int field3445 = -1;

    @ObfuscatedName("jl.af")
    public boolean field3463 = false;

    @ObfuscatedName("jl.ah")
    public boolean field3447 = true;

    @ObfuscatedName("jl.ab")
    public int field3448 = 128;

    @ObfuscatedName("jl.aa")
    public int field3449 = 128;

    @ObfuscatedName("jl.ac")
    public int field3444 = 128;

    @ObfuscatedName("jl.ad")
    public int field3451 = 0;

    @ObfuscatedName("jl.aq")
    public int field3452 = 0;

    @ObfuscatedName("jl.ax")
    public int field3453 = 0;

    @ObfuscatedName("jl.an")
    public boolean field3415 = false;

    @ObfuscatedName("jl.ag")
    public boolean field3455 = false;

    @ObfuscatedName("jl.ap")
    public int field3456 = -1;

    @ObfuscatedName("jl.aw")
    public int[] field3457;

    @ObfuscatedName("jl.al")
    public int field3458 = -1;

    @ObfuscatedName("jl.ar")
    public int field3432 = -1;

    @ObfuscatedName("jl.au")
    public int field3460 = -1;

    @ObfuscatedName("jl.av")
    public int field3450 = 0;

    @ObfuscatedName("jl.am")
    public int field3442 = 0;

    @ObfuscatedName("jl.ao")
    public int field3417 = 0;

    @ObfuscatedName("jl.ai")
    public int[] field3464;

    @ObfuscatedName("jl.ae")
    public class200 field3434;

    @ObfuscatedName("bg.c(Lih;Lih;ZI)V")
    public static void method957(class250 arg0, class250 arg1, boolean arg2) {
        Statics.field3416 = arg0;
        Statics.field3467 = arg1;
        field3446 = arg2;
    }

    @ObfuscatedName("ec.q(II)Ljl;")
    public static class271 method2839(int arg0) {
        class271 var1 = (class271) field3418.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3416.method4210(6, arg0);
        class271 var3 = new class271();
        var3.field3461 = arg0;
        if (var2 != null) {
            var3.method4670(new class185(var2));
        }
        var3.method4669();
        if (var3.field3455) {
            var3.field3429 = 0;
            var3.field3423 = false;
        }
        field3418.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jl.m(B)V")
    public void method4669() {
        if (this.field3435 == -1) {
            this.field3435 = 0;
            if (this.field3424 != null && (this.field3425 == null || this.field3425[0] == 10)) {
                this.field3435 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3443[var1] != null) {
                    this.field3435 = 1;
                }
            }
        }
        if (this.field3456 == -1) {
            this.field3456 = this.field3429 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jl.j(Lgg;S)V")
    public void method4670(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4671(arg0, var2);
        }
    }

    @ObfuscatedName("jl.g(Lgg;II)V")
    public void method4671(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3243();
            if (var3 > 0) {
                if (this.field3424 == null || field3446) {
                    this.field3425 = new int[var3];
                    this.field3424 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3424[var4] = arg0.method3245();
                        this.field3425[var4] = arg0.method3243();
                    }
                } else {
                    arg0.field2386 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3426 = arg0.method3251();
        } else if (arg1 == 5) {
            int var5 = arg0.method3243();
            if (var5 > 0) {
                if (this.field3424 == null || field3446) {
                    this.field3425 = null;
                    this.field3424 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3424[var6] = arg0.method3245();
                    }
                } else {
                    arg0.field2386 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3431 = arg0.method3243();
        } else if (arg1 == 15) {
            this.field3433 = arg0.method3243();
        } else if (arg1 == 17) {
            this.field3429 = 0;
            this.field3423 = false;
        } else if (arg1 == 18) {
            this.field3423 = false;
        } else if (arg1 == 19) {
            this.field3435 = arg0.method3243();
        } else if (arg1 == 21) {
            this.field3436 = 0;
        } else if (arg1 == 22) {
            this.field3462 = true;
        } else if (arg1 == 23) {
            this.field3438 = true;
        } else if (arg1 == 24) {
            this.field3439 = arg0.method3245();
            if (this.field3439 == 65535) {
                this.field3439 = -1;
            }
        } else if (arg1 == 27) {
            this.field3429 = 1;
        } else if (arg1 == 28) {
            this.field3440 = arg0.method3243();
        } else if (arg1 == 29) {
            this.field3441 = arg0.method3244();
        } else if (arg1 == 39) {
            this.field3430 = arg0.method3244() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3443[arg1 - 30] = arg0.method3251();
            if (this.field3443[arg1 - 30].equalsIgnoreCase(class240.field2826)) {
                this.field3443[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3243();
            this.field3427 = new short[var7];
            this.field3428 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3427[var8] = (short) arg0.method3245();
                this.field3428[var8] = (short) arg0.method3245();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3243();
            this.field3437 = new short[var9];
            this.field3421 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3437[var10] = (short) arg0.method3245();
                this.field3421[var10] = (short) arg0.method3245();
            }
        } else if (arg1 == 62) {
            this.field3463 = true;
        } else if (arg1 == 64) {
            this.field3447 = false;
        } else if (arg1 == 65) {
            this.field3448 = arg0.method3245();
        } else if (arg1 == 66) {
            this.field3449 = arg0.method3245();
        } else if (arg1 == 67) {
            this.field3444 = arg0.method3245();
        } else if (arg1 == 68) {
            this.field3445 = arg0.method3245();
        } else if (arg1 == 69) {
            arg0.method3243();
        } else if (arg1 == 70) {
            this.field3451 = arg0.method3369();
        } else if (arg1 == 71) {
            this.field3452 = arg0.method3369();
        } else if (arg1 == 72) {
            this.field3453 = arg0.method3369();
        } else if (arg1 == 73) {
            this.field3415 = true;
        } else if (arg1 == 74) {
            this.field3455 = true;
        } else if (arg1 == 75) {
            this.field3456 = arg0.method3243();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3458 = arg0.method3245();
            if (this.field3458 == 65535) {
                this.field3458 = -1;
            }
            this.field3432 = arg0.method3245();
            if (this.field3432 == 65535) {
                this.field3432 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3245();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3243();
            this.field3457 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3457[var15] = arg0.method3245();
                if (this.field3457[var15] == 65535) {
                    this.field3457[var15] = -1;
                }
            }
            this.field3457[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3460 = arg0.method3245();
            this.field3450 = arg0.method3243();
        } else if (arg1 == 79) {
            this.field3442 = arg0.method3245();
            this.field3417 = arg0.method3245();
            this.field3450 = arg0.method3243();
            int var11 = arg0.method3243();
            this.field3464 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3464[var12] = arg0.method3245();
            }
        } else if (arg1 == 81) {
            this.field3436 = arg0.method3243() * 256;
        } else if (arg1 == 82) {
            this.field3459 = arg0.method3245();
        } else if (arg1 == 249) {
            this.field3434 = class265.method2860(arg0, this.field3434);
        }
    }

    @ObfuscatedName("jl.i(II)Z")
    public final boolean method4698(int arg0) {
        if (this.field3425 != null) {
            for (int var4 = 0; var4 < this.field3425.length; var4++) {
                if (this.field3425[var4] == arg0) {
                    return Statics.field3467.method4300(this.field3424[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3424 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3424.length; var3++) {
                var2 &= Statics.field3467.method4300(this.field3424[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jl.h(B)Z")
    public final boolean method4678() {
        if (this.field3424 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3424.length; var2++) {
            var1 &= Statics.field3467.method4300(this.field3424[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jl.l(II[[IIIII)Ldc;")
    public final class130 method4688(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3425 == null) {
            var7 = (long) ((this.field3461 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3461 << 10) + (arg0 << 3) + arg1);
        }
        class130 var9 = (class130) field3420.method3654(var7);
        if (var9 == null) {
            class116 var10 = this.method4676(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3462) {
                var10.field1552 = (short) (this.field3441 + 64);
                var10.field1553 = (short) (this.field3430 + 768);
                var10.method2334();
                var9 = var10;
            } else {
                var9 = var10.method2338(this.field3441 + 64, this.field3430 + 768, -50, -10, -50);
            }
            field3420.method3646(var9, var7);
        }
        if (this.field3462) {
            var9 = ((class116) var9).method2393();
        }
        if (this.field3436 >= 0) {
            if (var9 instanceof class122) {
                var9 = ((class122) var9).method2486(arg2, arg3, arg4, arg5, true, this.field3436);
            } else if (var9 instanceof class116) {
                var9 = ((class116) var9).method2359(arg2, arg3, arg4, arg5, true, this.field3436);
            }
        }
        return var9;
    }

    @ObfuscatedName("jl.o(II[[IIIII)Ldx;")
    public final class122 method4722(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3425 == null) {
            var7 = (long) ((this.field3461 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3461 << 10) + (arg0 << 3) + arg1);
        }
        class122 var9 = (class122) field3454.method3654(var7);
        if (var9 == null) {
            class116 var10 = this.method4676(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2338(this.field3441 + 64, this.field3430 + 768, -50, -10, -50);
            field3454.method3646(var9, var7);
        }
        if (this.field3436 >= 0) {
            var9 = var9.method2486(arg2, arg3, arg4, arg5, true, this.field3436);
        }
        return var9;
    }

    @ObfuscatedName("jl.k(II[[IIIILjk;II)Ldx;")
    public final class122 method4675(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class276 arg6, int arg7) {
        long var9;
        if (this.field3425 == null) {
            var9 = (long) ((this.field3461 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3461 << 10) + (arg0 << 3) + arg1);
        }
        class122 var11 = (class122) field3454.method3654(var9);
        if (var11 == null) {
            class116 var12 = this.method4676(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2338(this.field3441 + 64, this.field3430 + 768, -50, -10, -50);
            field3454.method3646(var11, var9);
        }
        if (arg6 == null && this.field3436 == -1) {
            return var11;
        }
        class122 var13;
        if (arg6 == null) {
            var13 = var11.method2416(true);
        } else {
            var13 = arg6.method4853(var11, arg7, arg1);
        }
        if (this.field3436 >= 0) {
            var13 = var13.method2486(arg2, arg3, arg4, arg5, false, this.field3436);
        }
        return var13;
    }

    @ObfuscatedName("jl.v(IIB)Ldf;")
    public final class116 method4676(int arg0, int arg1) {
        class116 var3 = null;
        if (this.field3425 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3424 == null) {
                return null;
            }
            boolean var4 = this.field3463;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3424.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3424[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class116) field3419.method3654((long) var7);
                if (var3 == null) {
                    var3 = class116.method2376(Statics.field3467, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2332();
                    }
                    field3419.method3646(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3422[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class116(field3422, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3425.length; var9++) {
                if (this.field3425[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3424[var8];
            boolean var11 = this.field3463 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class116) field3419.method3654((long) var10);
            if (var3 == null) {
                var3 = class116.method2376(Statics.field3467, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2332();
                }
                field3419.method3646(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3448 == 128 && this.field3449 == 128 && this.field3444 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3451 == 0 && this.field3452 == 0 && this.field3453 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class116 var14 = new class116(var3, arg1 == 0 && !var12 && !var13, this.field3427 == null, this.field3437 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2328(256);
            var14.method2329(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2361();
        } else if (var15 == 2) {
            var14.method2326();
        } else if (var15 == 3) {
            var14.method2327();
        }
        if (this.field3427 != null) {
            for (int var16 = 0; var16 < this.field3427.length; var16++) {
                var14.method2330(this.field3427[var16], this.field3428[var16]);
            }
        }
        if (this.field3437 != null) {
            for (int var17 = 0; var17 < this.field3437.length; var17++) {
                var14.method2331(this.field3437[var17], this.field3421[var17]);
            }
        }
        if (var12) {
            var14.method2333(this.field3448, this.field3449, this.field3444);
        }
        if (var13) {
            var14.method2329(this.field3451, this.field3452, this.field3453);
        }
        return var14;
    }

    @ObfuscatedName("jl.p(I)Ljl;")
    public final class271 method4668() {
        int var1 = -1;
        if (this.field3458 != -1) {
            var1 = class228.method1611(this.field3458);
        } else if (this.field3432 != -1) {
            var1 = class228.field2596[this.field3432];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3457.length - 1) {
            var2 = this.field3457[var1];
        } else {
            var2 = this.field3457[this.field3457.length - 1];
        }
        return var2 == -1 ? null : method2839(var2);
    }

    @ObfuscatedName("jl.n(IIB)I")
    public int method4677(int arg0, int arg1) {
        return class265.method2910(this.field3434, arg0, arg1);
    }

    @ObfuscatedName("jl.t(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4679(int arg0, String arg1) {
        return class265.method482(this.field3434, arg0, arg1);
    }

    @ObfuscatedName("jl.r(I)Z")
    public boolean method4680() {
        if (this.field3457 == null) {
            return this.field3460 != -1 || this.field3464 != null;
        }
        for (int var1 = 0; var1 < this.field3457.length; var1++) {
            if (this.field3457[var1] != -1) {
                class271 var2 = method2839(this.field3457[var1]);
                if (var2.field3460 != -1 || var2.field3464 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
