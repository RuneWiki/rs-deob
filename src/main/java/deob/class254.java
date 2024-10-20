package deob;

@ObfuscatedName("iy")
public class class254 extends class176 {

    @ObfuscatedName("iy.c")
    public static boolean field3359 = false;

    @ObfuscatedName("iy.g")
    public static class146 field3324 = new class146(4096);

    @ObfuscatedName("iy.l")
    public static class146 field3352 = new class146(500);

    @ObfuscatedName("iy.u")
    public static class146 field3339 = new class146(30);

    @ObfuscatedName("iy.j")
    public static class146 field3335 = new class146(30);

    @ObfuscatedName("iy.v")
    public static class122[] field3328 = new class122[4];

    @ObfuscatedName("iy.d")
    public int field3371;

    @ObfuscatedName("iy.z")
    public int[] field3330;

    @ObfuscatedName("iy.n")
    public int[] field3331;

    @ObfuscatedName("iy.h")
    public String field3332 = class225.field2900;

    @ObfuscatedName("iy.f")
    public short[] field3333;

    @ObfuscatedName("iy.s")
    public short[] field3334;

    @ObfuscatedName("iy.p")
    public short[] field3322;

    @ObfuscatedName("iy.e")
    public short[] field3336;

    @ObfuscatedName("iy.i")
    public int field3366 = 1;

    @ObfuscatedName("iy.q")
    public int field3329 = 1;

    @ObfuscatedName("iy.y")
    public int field3364 = 2;

    @ObfuscatedName("iy.r")
    public boolean field3340 = true;

    @ObfuscatedName("iy.k")
    public int field3341 = -1;

    @ObfuscatedName("iy.w")
    public int field3342 = -1;

    @ObfuscatedName("iy.m")
    public boolean field3345 = false;

    @ObfuscatedName("iy.o")
    public boolean field3356 = false;

    @ObfuscatedName("iy.a")
    public int field3327 = -1;

    @ObfuscatedName("iy.b")
    public int field3346 = 16;

    @ObfuscatedName("iy.ag")
    public int field3347 = 0;

    @ObfuscatedName("iy.at")
    public int field3348 = 0;

    @ObfuscatedName("iy.ao")
    public String[] field3349 = new String[5];

    @ObfuscatedName("iy.av")
    public int field3350 = -1;

    @ObfuscatedName("iy.an")
    public int field3362 = -1;

    @ObfuscatedName("iy.al")
    public boolean field3344 = false;

    @ObfuscatedName("iy.as")
    public boolean field3353 = true;

    @ObfuscatedName("iy.ad")
    public int field3325 = 128;

    @ObfuscatedName("iy.ap")
    public int field3355 = 128;

    @ObfuscatedName("iy.ax")
    public int field3354 = 128;

    @ObfuscatedName("iy.aj")
    public int field3357 = 0;

    @ObfuscatedName("iy.ab")
    public int field3372 = 0;

    @ObfuscatedName("iy.af")
    public int field3351 = 0;

    @ObfuscatedName("iy.ak")
    public boolean field3337 = false;

    @ObfuscatedName("iy.ay")
    public boolean field3361 = false;

    @ObfuscatedName("iy.ae")
    public int field3360 = -1;

    @ObfuscatedName("iy.ah")
    public int[] field3363;

    @ObfuscatedName("iy.aa")
    public int field3338 = -1;

    @ObfuscatedName("iy.aq")
    public int field3365 = -1;

    @ObfuscatedName("iy.ar")
    public int field3358 = -1;

    @ObfuscatedName("iy.ac")
    public int field3367 = 0;

    @ObfuscatedName("iy.az")
    public int field3368 = 0;

    @ObfuscatedName("iy.ai")
    public int field3369 = 0;

    @ObfuscatedName("iy.am")
    public int[] field3370;

    @ObfuscatedName("iy.aw")
    public class316 field3343;

    @ObfuscatedName("es.c(IB)Liy;")
    public static class254 method3035(int arg0) {
        class254 var1 = (class254) field3324.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field79.method3825(6, arg0);
        class254 var3 = new class254();
        var3.field3371 = arg0;
        if (var2 != null) {
            var3.method4264(new class300(var2));
        }
        var3.method4263();
        if (var3.field3361) {
            var3.field3364 = 0;
            var3.field3340 = false;
        }
        field3324.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.x(I)V")
    public void method4263() {
        if (this.field3341 == -1) {
            this.field3341 = 0;
            if (this.field3330 != null && (this.field3331 == null || this.field3331[0] == 10)) {
                this.field3341 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3349[var1] != null) {
                    this.field3341 = 1;
                }
            }
        }
        if (this.field3360 == -1) {
            this.field3360 = this.field3364 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("iy.t(Lkz;I)V")
    public void method4264(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4267(arg0, var2);
        }
    }

    @ObfuscatedName("iy.g(Lkz;II)V")
    public void method4267(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5103();
            if (var3 > 0) {
                if (this.field3330 == null || field3359) {
                    this.field3331 = new int[var3];
                    this.field3330 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3330[var4] = arg0.method5304();
                        this.field3331[var4] = arg0.method5103();
                    }
                } else {
                    arg0.field3696 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3332 = arg0.method5112();
        } else if (arg1 == 5) {
            int var5 = arg0.method5103();
            if (var5 > 0) {
                if (this.field3330 == null || field3359) {
                    this.field3331 = null;
                    this.field3330 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3330[var6] = arg0.method5304();
                    }
                } else {
                    arg0.field3696 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3366 = arg0.method5103();
        } else if (arg1 == 15) {
            this.field3329 = arg0.method5103();
        } else if (arg1 == 17) {
            this.field3364 = 0;
            this.field3340 = false;
        } else if (arg1 == 18) {
            this.field3340 = false;
        } else if (arg1 == 19) {
            this.field3341 = arg0.method5103();
        } else if (arg1 == 21) {
            this.field3342 = 0;
        } else if (arg1 == 22) {
            this.field3345 = true;
        } else if (arg1 == 23) {
            this.field3356 = true;
        } else if (arg1 == 24) {
            this.field3327 = arg0.method5304();
            if (this.field3327 == 65535) {
                this.field3327 = -1;
            }
        } else if (arg1 == 27) {
            this.field3364 = 1;
        } else if (arg1 == 28) {
            this.field3346 = arg0.method5103();
        } else if (arg1 == 29) {
            this.field3347 = arg0.method5168();
        } else if (arg1 == 39) {
            this.field3348 = arg0.method5168() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3349[arg1 - 30] = arg0.method5112();
            if (this.field3349[arg1 - 30].equalsIgnoreCase(class225.field3033)) {
                this.field3349[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5103();
            this.field3333 = new short[var7];
            this.field3334 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3333[var8] = (short) arg0.method5304();
                this.field3334[var8] = (short) arg0.method5304();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5103();
            this.field3322 = new short[var9];
            this.field3336 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3322[var10] = (short) arg0.method5304();
                this.field3336[var10] = (short) arg0.method5304();
            }
        } else if (arg1 == 62) {
            this.field3344 = true;
        } else if (arg1 == 64) {
            this.field3353 = false;
        } else if (arg1 == 65) {
            this.field3325 = arg0.method5304();
        } else if (arg1 == 66) {
            this.field3355 = arg0.method5304();
        } else if (arg1 == 67) {
            this.field3354 = arg0.method5304();
        } else if (arg1 == 68) {
            this.field3362 = arg0.method5304();
        } else if (arg1 == 69) {
            arg0.method5103();
        } else if (arg1 == 70) {
            this.field3357 = arg0.method5106();
        } else if (arg1 == 71) {
            this.field3372 = arg0.method5106();
        } else if (arg1 == 72) {
            this.field3351 = arg0.method5106();
        } else if (arg1 == 73) {
            this.field3337 = true;
        } else if (arg1 == 74) {
            this.field3361 = true;
        } else if (arg1 == 75) {
            this.field3360 = arg0.method5103();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3338 = arg0.method5304();
            if (this.field3338 == 65535) {
                this.field3338 = -1;
            }
            this.field3365 = arg0.method5304();
            if (this.field3365 == 65535) {
                this.field3365 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5304();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5103();
            this.field3363 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3363[var15] = arg0.method5304();
                if (this.field3363[var15] == 65535) {
                    this.field3363[var15] = -1;
                }
            }
            this.field3363[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3358 = arg0.method5304();
            this.field3367 = arg0.method5103();
        } else if (arg1 == 79) {
            this.field3368 = arg0.method5304();
            this.field3369 = arg0.method5304();
            this.field3367 = arg0.method5103();
            int var11 = arg0.method5103();
            this.field3370 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3370[var12] = arg0.method5304();
            }
        } else if (arg1 == 81) {
            this.field3342 = arg0.method5103() * 256;
        } else if (arg1 == 82) {
            this.field3350 = arg0.method5304();
        } else if (arg1 == 249) {
            this.field3343 = class248.method4436(arg0, this.field3343);
        }
    }

    @ObfuscatedName("iy.l(II)Z")
    public final boolean method4270(int arg0) {
        if (this.field3331 != null) {
            for (int var4 = 0; var4 < this.field3331.length; var4++) {
                if (this.field3331[var4] == arg0) {
                    return Statics.field3323.method3827(this.field3330[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3330 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3330.length; var3++) {
                var2 &= Statics.field3323.method3827(this.field3330[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iy.u(I)Z")
    public final boolean method4272() {
        if (this.field3330 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3330.length; var2++) {
            var1 &= Statics.field3323.method3827(this.field3330[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("iy.j(II[[IIIII)Lel;")
    public final class136 method4268(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3331 == null) {
            var7 = (long) ((this.field3371 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3371 << 10) + (arg0 << 3) + arg1);
        }
        class136 var9 = (class136) field3339.method3061(var7);
        if (var9 == null) {
            class122 var10 = this.method4271(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3345) {
                var10.field1544 = (short) (this.field3347 + 64);
                var10.field1545 = (short) (this.field3348 + 768);
                var10.method2569();
                var9 = var10;
            } else {
                var9 = var10.method2545(this.field3347 + 64, this.field3348 + 768, -50, -10, -50);
            }
            field3339.method3062(var9, var7);
        }
        if (this.field3345) {
            var9 = ((class122) var9).method2529();
        }
        if (this.field3342 >= 0) {
            if (var9 instanceof class128) {
                var9 = ((class128) var9).method2654(arg2, arg3, arg4, arg5, true, this.field3342);
            } else if (var9 instanceof class122) {
                var9 = ((class122) var9).method2527(arg2, arg3, arg4, arg5, true, this.field3342);
            }
        }
        return var9;
    }

    @ObfuscatedName("iy.v(II[[IIIII)Ldr;")
    public final class128 method4265(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3331 == null) {
            var7 = (long) ((this.field3371 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3371 << 10) + (arg0 << 3) + arg1);
        }
        class128 var9 = (class128) field3335.method3061(var7);
        if (var9 == null) {
            class122 var10 = this.method4271(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2545(this.field3347 + 64, this.field3348 + 768, -50, -10, -50);
            field3335.method3062(var9, var7);
        }
        if (this.field3342 >= 0) {
            var9 = var9.method2654(arg2, arg3, arg4, arg5, true, this.field3342);
        }
        return var9;
    }

    @ObfuscatedName("iy.d(II[[IIIILiw;II)Ldr;")
    public final class128 method4275(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class259 arg6, int arg7) {
        long var9;
        if (this.field3331 == null) {
            var9 = (long) ((this.field3371 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3371 << 10) + (arg0 << 3) + arg1);
        }
        class128 var11 = (class128) field3335.method3061(var9);
        if (var11 == null) {
            class122 var12 = this.method4271(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2545(this.field3347 + 64, this.field3348 + 768, -50, -10, -50);
            field3335.method3062(var11, var9);
        }
        if (arg6 == null && this.field3342 == -1) {
            return var11;
        }
        class128 var13;
        if (arg6 == null) {
            var13 = var11.method2631(true);
        } else {
            var13 = arg6.method4442(var11, arg7, arg1);
        }
        if (this.field3342 >= 0) {
            var13 = var13.method2654(arg2, arg3, arg4, arg5, false, this.field3342);
        }
        return var13;
    }

    @ObfuscatedName("iy.z(III)Lds;")
    public final class122 method4271(int arg0, int arg1) {
        class122 var3 = null;
        if (this.field3331 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3330 == null) {
                return null;
            }
            boolean var4 = this.field3344;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3330.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3330[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class122) field3352.method3061((long) var7);
                if (var3 == null) {
                    var3 = class122.method2525(Statics.field3323, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2570();
                    }
                    field3352.method3062(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3328[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class122(field3328, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3331.length; var9++) {
                if (this.field3331[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3330[var8];
            boolean var11 = this.field3344 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class122) field3352.method3061((long) var10);
            if (var3 == null) {
                var3 = class122.method2525(Statics.field3323, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2570();
                }
                field3352.method3062(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3325 == 128 && this.field3355 == 128 && this.field3354 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3357 == 0 && this.field3372 == 0 && this.field3351 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class122 var14 = new class122(var3, arg1 == 0 && !var12 && !var13, this.field3333 == null, this.field3322 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2535(256);
            var14.method2536(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2532();
        } else if (var15 == 2) {
            var14.method2533();
        } else if (var15 == 3) {
            var14.method2534();
        }
        if (this.field3333 != null) {
            for (int var16 = 0; var16 < this.field3333.length; var16++) {
                var14.method2537(this.field3333[var16], this.field3334[var16]);
            }
        }
        if (this.field3322 != null) {
            for (int var17 = 0; var17 < this.field3322.length; var17++) {
                var14.method2538(this.field3322[var17], this.field3336[var17]);
            }
        }
        if (var12) {
            var14.method2540(this.field3325, this.field3355, this.field3354);
        }
        if (var13) {
            var14.method2536(this.field3357, this.field3372, this.field3351);
        }
        return var14;
    }

    @ObfuscatedName("iy.s(I)Liy;")
    public final class254 method4291() {
        int var1 = -1;
        if (this.field3338 != -1) {
            var1 = class213.method504(this.field3338);
        } else if (this.field3365 != -1) {
            var1 = class213.field2494[this.field3365];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3363.length - 1) {
            var2 = this.field3363[var1];
        } else {
            var2 = this.field3363[this.field3363.length - 1];
        }
        return var2 == -1 ? null : method3035(var2);
    }

    @ObfuscatedName("iy.p(III)I")
    public int method4273(int arg0, int arg1) {
        return class248.method1051(this.field3343, arg0, arg1);
    }

    @ObfuscatedName("iy.e(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4289(int arg0, String arg1) {
        class316 var3 = this.field3343;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class177 var5 = (class177) var3.method5493((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2089;
            }
        }
        return var4;
    }

    @ObfuscatedName("iy.i(B)Z")
    public boolean method4301() {
        if (this.field3363 == null) {
            return this.field3358 != -1 || this.field3370 != null;
        }
        for (int var1 = 0; var1 < this.field3363.length; var1++) {
            if (this.field3363[var1] != -1) {
                class254 var2 = method3035(this.field3363[var1]);
                if (var2.field3358 != -1 || var2.field3370 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
