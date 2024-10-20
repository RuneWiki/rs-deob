package deob;

@ObfuscatedName("iz")
public class class254 extends class176 {

    @ObfuscatedName("iz.z")
    public static boolean field3354 = false;

    @ObfuscatedName("iz.u")
    public static class146 field3339 = new class146(4096);

    @ObfuscatedName("iz.r")
    public static class146 field3372 = new class146(500);

    @ObfuscatedName("iz.p")
    public static class146 field3340 = new class146(30);

    @ObfuscatedName("iz.q")
    public static class146 field3342 = new class146(30);

    @ObfuscatedName("iz.m")
    public static class122[] field3343 = new class122[4];

    @ObfuscatedName("iz.y")
    public int field3344;

    @ObfuscatedName("iz.i")
    public int[] field3345;

    @ObfuscatedName("iz.c")
    public int[] field3346;

    @ObfuscatedName("iz.b")
    public String field3379 = class225.field2755;

    @ObfuscatedName("iz.o")
    public short[] field3348;

    @ObfuscatedName("iz.a")
    public short[] field3349;

    @ObfuscatedName("iz.e")
    public short[] field3350;

    @ObfuscatedName("iz.w")
    public short[] field3364;

    @ObfuscatedName("iz.t")
    public int field3383 = 1;

    @ObfuscatedName("iz.g")
    public int field3353 = 1;

    @ObfuscatedName("iz.x")
    public int field3368 = 2;

    @ObfuscatedName("iz.h")
    public boolean field3355 = true;

    @ObfuscatedName("iz.s")
    public int field3356 = -1;

    @ObfuscatedName("iz.f")
    public int field3357 = -1;

    @ObfuscatedName("iz.j")
    public boolean field3358 = false;

    @ObfuscatedName("iz.d")
    public boolean field3359 = false;

    @ObfuscatedName("iz.l")
    public int field3347 = -1;

    @ObfuscatedName("iz.k")
    public int field3361 = 16;

    @ObfuscatedName("iz.ac")
    public int field3362 = 0;

    @ObfuscatedName("iz.az")
    public int field3363 = 0;

    @ObfuscatedName("iz.aw")
    public String[] field3351 = new String[5];

    @ObfuscatedName("iz.aa")
    public int field3336 = -1;

    @ObfuscatedName("iz.ap")
    public int field3366 = -1;

    @ObfuscatedName("iz.ar")
    public boolean field3352 = false;

    @ObfuscatedName("iz.ab")
    public boolean field3369 = true;

    @ObfuscatedName("iz.ax")
    public int field3365 = 128;

    @ObfuscatedName("iz.as")
    public int field3370 = 128;

    @ObfuscatedName("iz.ao")
    public int field3371 = 128;

    @ObfuscatedName("iz.al")
    public int field3377 = 0;

    @ObfuscatedName("iz.ad")
    public int field3341 = 0;

    @ObfuscatedName("iz.an")
    public int field3367 = 0;

    @ObfuscatedName("iz.ai")
    public boolean field3375 = false;

    @ObfuscatedName("iz.ak")
    public boolean field3376 = false;

    @ObfuscatedName("iz.aq")
    public int field3360 = -1;

    @ObfuscatedName("iz.am")
    public int[] field3378;

    @ObfuscatedName("iz.ae")
    public int field3374 = -1;

    @ObfuscatedName("iz.av")
    public int field3380 = -1;

    @ObfuscatedName("iz.ah")
    public int field3381 = -1;

    @ObfuscatedName("iz.ag")
    public int field3382 = 0;

    @ObfuscatedName("iz.aj")
    public int field3373 = 0;

    @ObfuscatedName("iz.ay")
    public int field3384 = 0;

    @ObfuscatedName("iz.au")
    public int[] field3385;

    @ObfuscatedName("iz.af")
    public class316 field3386;

    @ObfuscatedName("bb.z(IB)Liz;")
    public static class254 method1148(int arg0) {
        class254 var1 = (class254) field3339.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3337.method3726(6, arg0);
        class254 var3 = new class254();
        var3.field3344 = arg0;
        if (var2 != null) {
            var3.method4142(new class300(var2));
        }
        var3.method4153();
        if (var3.field3376) {
            var3.field3368 = 0;
            var3.field3355 = false;
        }
        field3339.method2994(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.n(B)V")
    public void method4153() {
        if (this.field3356 == -1) {
            this.field3356 = 0;
            if (this.field3345 != null && (this.field3346 == null || this.field3346[0] == 10)) {
                this.field3356 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3351[var1] != null) {
                    this.field3356 = 1;
                }
            }
        }
        if (this.field3360 == -1) {
            this.field3360 = this.field3368 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("iz.v(Lkl;B)V")
    public void method4142(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method4141(arg0, var2);
        }
    }

    @ObfuscatedName("iz.u(Lkl;II)V")
    public void method4141(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method4990();
            if (var3 > 0) {
                if (this.field3345 == null || field3354) {
                    this.field3346 = new int[var3];
                    this.field3345 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3345[var4] = arg0.method4992();
                        this.field3346[var4] = arg0.method4990();
                    }
                } else {
                    arg0.field3702 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3379 = arg0.method4999();
        } else if (arg1 == 5) {
            int var5 = arg0.method4990();
            if (var5 > 0) {
                if (this.field3345 == null || field3354) {
                    this.field3346 = null;
                    this.field3345 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3345[var6] = arg0.method4992();
                    }
                } else {
                    arg0.field3702 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3383 = arg0.method4990();
        } else if (arg1 == 15) {
            this.field3353 = arg0.method4990();
        } else if (arg1 == 17) {
            this.field3368 = 0;
            this.field3355 = false;
        } else if (arg1 == 18) {
            this.field3355 = false;
        } else if (arg1 == 19) {
            this.field3356 = arg0.method4990();
        } else if (arg1 == 21) {
            this.field3357 = 0;
        } else if (arg1 == 22) {
            this.field3358 = true;
        } else if (arg1 == 23) {
            this.field3359 = true;
        } else if (arg1 == 24) {
            this.field3347 = arg0.method4992();
            if (this.field3347 == 65535) {
                this.field3347 = -1;
            }
        } else if (arg1 == 27) {
            this.field3368 = 1;
        } else if (arg1 == 28) {
            this.field3361 = arg0.method4990();
        } else if (arg1 == 29) {
            this.field3362 = arg0.method5002();
        } else if (arg1 == 39) {
            this.field3363 = arg0.method5002() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3351[arg1 - 30] = arg0.method4999();
            if (this.field3351[arg1 - 30].equalsIgnoreCase(class225.field2782)) {
                this.field3351[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method4990();
            this.field3348 = new short[var7];
            this.field3349 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3348[var8] = (short) arg0.method4992();
                this.field3349[var8] = (short) arg0.method4992();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method4990();
            this.field3350 = new short[var9];
            this.field3364 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3350[var10] = (short) arg0.method4992();
                this.field3364[var10] = (short) arg0.method4992();
            }
        } else if (arg1 == 62) {
            this.field3352 = true;
        } else if (arg1 == 64) {
            this.field3369 = false;
        } else if (arg1 == 65) {
            this.field3365 = arg0.method4992();
        } else if (arg1 == 66) {
            this.field3370 = arg0.method4992();
        } else if (arg1 == 67) {
            this.field3371 = arg0.method4992();
        } else if (arg1 == 68) {
            this.field3366 = arg0.method4992();
        } else if (arg1 == 69) {
            arg0.method4990();
        } else if (arg1 == 70) {
            this.field3377 = arg0.method4993();
        } else if (arg1 == 71) {
            this.field3341 = arg0.method4993();
        } else if (arg1 == 72) {
            this.field3367 = arg0.method4993();
        } else if (arg1 == 73) {
            this.field3375 = true;
        } else if (arg1 == 74) {
            this.field3376 = true;
        } else if (arg1 == 75) {
            this.field3360 = arg0.method4990();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3374 = arg0.method4992();
            if (this.field3374 == 65535) {
                this.field3374 = -1;
            }
            this.field3380 = arg0.method4992();
            if (this.field3380 == 65535) {
                this.field3380 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method4992();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method4990();
            this.field3378 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3378[var15] = arg0.method4992();
                if (this.field3378[var15] == 65535) {
                    this.field3378[var15] = -1;
                }
            }
            this.field3378[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3381 = arg0.method4992();
            this.field3382 = arg0.method4990();
        } else if (arg1 == 79) {
            this.field3373 = arg0.method4992();
            this.field3384 = arg0.method4992();
            this.field3382 = arg0.method4990();
            int var11 = arg0.method4990();
            this.field3385 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3385[var12] = arg0.method4992();
            }
        } else if (arg1 == 81) {
            this.field3357 = arg0.method4990() * 256;
        } else if (arg1 == 82) {
            this.field3336 = arg0.method4992();
        } else if (arg1 == 249) {
            this.field3386 = class248.method3085(arg0, this.field3386);
        }
    }

    @ObfuscatedName("iz.r(II)Z")
    public final boolean method4163(int arg0) {
        if (this.field3346 != null) {
            for (int var4 = 0; var4 < this.field3346.length; var4++) {
                if (this.field3346[var4] == arg0) {
                    return Statics.field3338.method3730(this.field3345[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3345 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3345.length; var3++) {
                var2 &= Statics.field3338.method3730(this.field3345[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iz.p(I)Z")
    public final boolean method4146() {
        if (this.field3345 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3345.length; var2++) {
            var1 &= Statics.field3338.method3730(this.field3345[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("iz.q(II[[IIIIB)Ler;")
    public final class136 method4180(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3346 == null) {
            var7 = (long) ((this.field3344 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3344 << 10) + (arg0 << 3) + arg1);
        }
        class136 var9 = (class136) field3340.method2992(var7);
        if (var9 == null) {
            class122 var10 = this.method4144(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3358) {
                var10.field1529 = (short) (this.field3362 + 64);
                var10.field1542 = (short) (this.field3363 + 768);
                var10.method2511();
                var9 = var10;
            } else {
                var9 = var10.method2515(this.field3362 + 64, this.field3363 + 768, -50, -10, -50);
            }
            field3340.method2994(var9, var7);
        }
        if (this.field3358) {
            var9 = ((class122) var9).method2499();
        }
        if (this.field3357 >= 0) {
            if (var9 instanceof class128) {
                var9 = ((class128) var9).method2587(arg2, arg3, arg4, arg5, true, this.field3357);
            } else if (var9 instanceof class122) {
                var9 = ((class122) var9).method2500(arg2, arg3, arg4, arg5, true, this.field3357);
            }
        }
        return var9;
    }

    @ObfuscatedName("iz.m(II[[IIIII)Ldh;")
    public final class128 method4147(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3346 == null) {
            var7 = (long) ((this.field3344 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3344 << 10) + (arg0 << 3) + arg1);
        }
        class128 var9 = (class128) field3342.method2992(var7);
        if (var9 == null) {
            class122 var10 = this.method4144(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2515(this.field3362 + 64, this.field3363 + 768, -50, -10, -50);
            field3342.method2994(var9, var7);
        }
        if (this.field3357 >= 0) {
            var9 = var9.method2587(arg2, arg3, arg4, arg5, true, this.field3357);
        }
        return var9;
    }

    @ObfuscatedName("iz.y(II[[IIIILix;II)Ldh;")
    public final class128 method4148(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class259 arg6, int arg7) {
        long var9;
        if (this.field3346 == null) {
            var9 = (long) ((this.field3344 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3344 << 10) + (arg0 << 3) + arg1);
        }
        class128 var11 = (class128) field3342.method2992(var9);
        if (var11 == null) {
            class122 var12 = this.method4144(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2515(this.field3362 + 64, this.field3363 + 768, -50, -10, -50);
            field3342.method2994(var11, var9);
        }
        if (arg6 == null && this.field3357 == -1) {
            return var11;
        }
        class128 var13;
        if (arg6 == null) {
            var13 = var11.method2588(true);
        } else {
            var13 = arg6.method4319(var11, arg7, arg1);
        }
        if (this.field3357 >= 0) {
            var13 = var13.method2587(arg2, arg3, arg4, arg5, false, this.field3357);
        }
        return var13;
    }

    @ObfuscatedName("iz.i(III)Ldw;")
    public final class122 method4144(int arg0, int arg1) {
        class122 var3 = null;
        if (this.field3346 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3345 == null) {
                return null;
            }
            boolean var4 = this.field3352;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3345.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3345[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class122) field3372.method2992((long) var7);
                if (var3 == null) {
                    var3 = class122.method2560(Statics.field3338, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2509();
                    }
                    field3372.method2994(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3343[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class122(field3343, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3346.length; var9++) {
                if (this.field3346[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3345[var8];
            boolean var11 = this.field3352 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class122) field3372.method2992((long) var10);
            if (var3 == null) {
                var3 = class122.method2560(Statics.field3338, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2509();
                }
                field3372.method2994(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3365 == 128 && this.field3370 == 128 && this.field3371 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3377 == 0 && this.field3341 == 0 && this.field3367 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class122 var14 = new class122(var3, arg1 == 0 && !var12 && !var13, this.field3348 == null, this.field3350 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2502(256);
            var14.method2521(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2570();
        } else if (var15 == 2) {
            var14.method2496();
        } else if (var15 == 3) {
            var14.method2535();
        }
        if (this.field3348 != null) {
            for (int var16 = 0; var16 < this.field3348.length; var16++) {
                var14.method2507(this.field3348[var16], this.field3349[var16]);
            }
        }
        if (this.field3350 != null) {
            for (int var17 = 0; var17 < this.field3350.length; var17++) {
                var14.method2568(this.field3350[var17], this.field3364[var17]);
            }
        }
        if (var12) {
            var14.method2510(this.field3365, this.field3370, this.field3371);
        }
        if (var13) {
            var14.method2521(this.field3377, this.field3341, this.field3367);
        }
        return var14;
    }

    @ObfuscatedName("iz.c(B)Liz;")
    public final class254 method4158() {
        int var1 = -1;
        if (this.field3374 != -1) {
            var1 = class213.method367(this.field3374);
        } else if (this.field3380 != -1) {
            var1 = class213.field2511[this.field3380];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3378.length - 1) {
            var2 = this.field3378[var1];
        } else {
            var2 = this.field3378[this.field3378.length - 1];
        }
        return var2 == -1 ? null : method1148(var2);
    }

    @ObfuscatedName("iz.b(IIB)I")
    public int method4150(int arg0, int arg1) {
        return Statics.method1847(this.field3386, arg0, arg1);
    }

    @ObfuscatedName("iz.o(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4173(int arg0, String arg1) {
        return class248.method2060(this.field3386, arg0, arg1);
    }

    @ObfuscatedName("iz.a(I)Z")
    public boolean method4152() {
        if (this.field3378 == null) {
            return this.field3381 != -1 || this.field3385 != null;
        }
        for (int var1 = 0; var1 < this.field3378.length; var1++) {
            if (this.field3378[var1] != -1) {
                class254 var2 = method1148(this.field3378[var1]);
                if (var2.field3381 != -1 || var2.field3385 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
