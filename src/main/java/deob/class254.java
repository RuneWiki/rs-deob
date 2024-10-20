package deob;

@ObfuscatedName("ix")
public class class254 extends class176 {

    @ObfuscatedName("ix.a")
    public static boolean field3381 = false;

    @ObfuscatedName("ix.q")
    public static class146 field3352 = new class146(4096);

    @ObfuscatedName("ix.v")
    public static class146 field3340 = new class146(500);

    @ObfuscatedName("ix.l")
    public static class146 field3343 = new class146(30);

    @ObfuscatedName("ix.c")
    public static class146 field3373 = new class146(30);

    @ObfuscatedName("ix.o")
    public static class122[] field3344 = new class122[4];

    @ObfuscatedName("ix.i")
    public int field3379;

    @ObfuscatedName("ix.d")
    public int[] field3337;

    @ObfuscatedName("ix.m")
    public int[] field3347;

    @ObfuscatedName("ix.p")
    public String field3348 = class225.field2836;

    @ObfuscatedName("ix.h")
    public short[] field3368;

    @ObfuscatedName("ix.k")
    public short[] field3350;

    @ObfuscatedName("ix.x")
    public short[] field3351;

    @ObfuscatedName("ix.j")
    public short[] field3383;

    @ObfuscatedName("ix.r")
    public int field3342 = 1;

    @ObfuscatedName("ix.e")
    public int field3378 = 1;

    @ObfuscatedName("ix.s")
    public int field3377 = 2;

    @ObfuscatedName("ix.b")
    public boolean field3356 = true;

    @ObfuscatedName("ix.z")
    public int field3357 = -1;

    @ObfuscatedName("ix.f")
    public int field3358 = -1;

    @ObfuscatedName("ix.g")
    public boolean field3369 = false;

    @ObfuscatedName("ix.w")
    public boolean field3360 = false;

    @ObfuscatedName("ix.u")
    public int field3361 = -1;

    @ObfuscatedName("ix.y")
    public int field3362 = 16;

    @ObfuscatedName("ix.aa")
    public int field3363 = 0;

    @ObfuscatedName("ix.aw")
    public int field3355 = 0;

    @ObfuscatedName("ix.ar")
    public String[] field3364 = new String[5];

    @ObfuscatedName("ix.aq")
    public int field3366 = -1;

    @ObfuscatedName("ix.ad")
    public int field3367 = -1;

    @ObfuscatedName("ix.ag")
    public boolean field3353 = false;

    @ObfuscatedName("ix.ak")
    public boolean field3375 = true;

    @ObfuscatedName("ix.av")
    public int field3370 = 128;

    @ObfuscatedName("ix.am")
    public int field3371 = 128;

    @ObfuscatedName("ix.ab")
    public int field3365 = 128;

    @ObfuscatedName("ix.ax")
    public int field3349 = 0;

    @ObfuscatedName("ix.al")
    public int field3359 = 0;

    @ObfuscatedName("ix.ap")
    public int field3345 = 0;

    @ObfuscatedName("ix.aj")
    public boolean field3376 = false;

    @ObfuscatedName("ix.ae")
    public boolean field3374 = false;

    @ObfuscatedName("ix.au")
    public int field3346 = -1;

    @ObfuscatedName("ix.ah")
    public int[] field3354;

    @ObfuscatedName("ix.an")
    public int field3380 = -1;

    @ObfuscatedName("ix.af")
    public int field3341 = -1;

    @ObfuscatedName("ix.ay")
    public int field3382 = -1;

    @ObfuscatedName("ix.az")
    public int field3372 = 0;

    @ObfuscatedName("ix.ao")
    public int field3384 = 0;

    @ObfuscatedName("ix.ai")
    public int field3385 = 0;

    @ObfuscatedName("ix.ac")
    public int[] field3386;

    @ObfuscatedName("ix.at")
    public class316 field3387;

    @ObfuscatedName("hv.a(IB)Lix;")
    public static class254 method3848(int arg0) {
        class254 var1 = (class254) field3352.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3338.method3873(6, arg0);
        class254 var3 = new class254();
        var3.field3379 = arg0;
        if (var2 != null) {
            var3.method4302(new class300(var2));
        }
        var3.method4293();
        if (var3.field3374) {
            var3.field3377 = 0;
            var3.field3356 = false;
        }
        field3352.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.t(I)V")
    public void method4293() {
        if (this.field3357 == -1) {
            this.field3357 = 0;
            if (this.field3337 != null && (this.field3347 == null || this.field3347[0] == 10)) {
                this.field3357 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3364[var1] != null) {
                    this.field3357 = 1;
                }
            }
        }
        if (this.field3346 == -1) {
            this.field3346 = this.field3377 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ix.n(Lkc;I)V")
    public void method4302(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4295(arg0, var2);
        }
    }

    @ObfuscatedName("ix.q(Lkc;IB)V")
    public void method4295(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5123();
            if (var3 > 0) {
                if (this.field3337 == null || field3381) {
                    this.field3347 = new int[var3];
                    this.field3337 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3337[var4] = arg0.method5166();
                        this.field3347[var4] = arg0.method5123();
                    }
                } else {
                    arg0.field3694 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3348 = arg0.method5132();
        } else if (arg1 == 5) {
            int var5 = arg0.method5123();
            if (var5 > 0) {
                if (this.field3337 == null || field3381) {
                    this.field3347 = null;
                    this.field3337 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3337[var6] = arg0.method5166();
                    }
                } else {
                    arg0.field3694 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3342 = arg0.method5123();
        } else if (arg1 == 15) {
            this.field3378 = arg0.method5123();
        } else if (arg1 == 17) {
            this.field3377 = 0;
            this.field3356 = false;
        } else if (arg1 == 18) {
            this.field3356 = false;
        } else if (arg1 == 19) {
            this.field3357 = arg0.method5123();
        } else if (arg1 == 21) {
            this.field3358 = 0;
        } else if (arg1 == 22) {
            this.field3369 = true;
        } else if (arg1 == 23) {
            this.field3360 = true;
        } else if (arg1 == 24) {
            this.field3361 = arg0.method5166();
            if (this.field3361 == 65535) {
                this.field3361 = -1;
            }
        } else if (arg1 == 27) {
            this.field3377 = 1;
        } else if (arg1 == 28) {
            this.field3362 = arg0.method5123();
        } else if (arg1 == 29) {
            this.field3363 = arg0.method5268();
        } else if (arg1 == 39) {
            this.field3355 = arg0.method5268() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3364[arg1 - 30] = arg0.method5132();
            if (this.field3364[arg1 - 30].equalsIgnoreCase(class225.field2746)) {
                this.field3364[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5123();
            this.field3368 = new short[var7];
            this.field3350 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3368[var8] = (short) arg0.method5166();
                this.field3350[var8] = (short) arg0.method5166();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5123();
            this.field3351 = new short[var9];
            this.field3383 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3351[var10] = (short) arg0.method5166();
                this.field3383[var10] = (short) arg0.method5166();
            }
        } else if (arg1 == 62) {
            this.field3353 = true;
        } else if (arg1 == 64) {
            this.field3375 = false;
        } else if (arg1 == 65) {
            this.field3370 = arg0.method5166();
        } else if (arg1 == 66) {
            this.field3371 = arg0.method5166();
        } else if (arg1 == 67) {
            this.field3365 = arg0.method5166();
        } else if (arg1 == 68) {
            this.field3367 = arg0.method5166();
        } else if (arg1 == 69) {
            arg0.method5123();
        } else if (arg1 == 70) {
            this.field3349 = arg0.method5126();
        } else if (arg1 == 71) {
            this.field3359 = arg0.method5126();
        } else if (arg1 == 72) {
            this.field3345 = arg0.method5126();
        } else if (arg1 == 73) {
            this.field3376 = true;
        } else if (arg1 == 74) {
            this.field3374 = true;
        } else if (arg1 == 75) {
            this.field3346 = arg0.method5123();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3380 = arg0.method5166();
            if (this.field3380 == 65535) {
                this.field3380 = -1;
            }
            this.field3341 = arg0.method5166();
            if (this.field3341 == 65535) {
                this.field3341 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5166();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5123();
            this.field3354 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3354[var15] = arg0.method5166();
                if (this.field3354[var15] == 65535) {
                    this.field3354[var15] = -1;
                }
            }
            this.field3354[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3382 = arg0.method5166();
            this.field3372 = arg0.method5123();
        } else if (arg1 == 79) {
            this.field3384 = arg0.method5166();
            this.field3385 = arg0.method5166();
            this.field3372 = arg0.method5123();
            int var11 = arg0.method5123();
            this.field3386 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3386[var12] = arg0.method5166();
            }
        } else if (arg1 == 81) {
            this.field3358 = arg0.method5123() * 256;
        } else if (arg1 == 82) {
            this.field3366 = arg0.method5166();
        } else if (arg1 == 249) {
            this.field3387 = class248.method3205(arg0, this.field3387);
        }
    }

    @ObfuscatedName("ix.v(IB)Z")
    public final boolean method4292(int arg0) {
        if (this.field3347 != null) {
            for (int var4 = 0; var4 < this.field3347.length; var4++) {
                if (this.field3347[var4] == arg0) {
                    return Statics.field3339.method3875(this.field3337[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3337 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3337.length; var3++) {
                var2 &= Statics.field3339.method3875(this.field3337[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ix.l(B)Z")
    public final boolean method4297() {
        if (this.field3337 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3337.length; var2++) {
            var1 &= Statics.field3339.method3875(this.field3337[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ix.c(II[[IIIII)Lep;")
    public final class136 method4307(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3347 == null) {
            var7 = (long) ((this.field3379 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3379 << 10) + (arg0 << 3) + arg1);
        }
        class136 var9 = (class136) field3343.method3120(var7);
        if (var9 == null) {
            class122 var10 = this.method4301(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3369) {
                var10.field1529 = (short) (this.field3363 + 64);
                var10.field1543 = (short) (this.field3355 + 768);
                var10.method2656();
                var9 = var10;
            } else {
                var9 = var10.method2660(this.field3363 + 64, this.field3355 + 768, -50, -10, -50);
            }
            field3343.method3122(var9, var7);
        }
        if (this.field3369) {
            var9 = ((class122) var9).method2645();
        }
        if (this.field3358 >= 0) {
            if (var9 instanceof class128) {
                var9 = ((class128) var9).method2765(arg2, arg3, arg4, arg5, true, this.field3358);
            } else if (var9 instanceof class122) {
                var9 = ((class122) var9).method2646(arg2, arg3, arg4, arg5, true, this.field3358);
            }
        }
        return var9;
    }

    @ObfuscatedName("ix.o(II[[IIIIB)Ldv;")
    public final class128 method4299(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3347 == null) {
            var7 = (long) ((this.field3379 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3379 << 10) + (arg0 << 3) + arg1);
        }
        class128 var9 = (class128) field3373.method3120(var7);
        if (var9 == null) {
            class122 var10 = this.method4301(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2660(this.field3363 + 64, this.field3355 + 768, -50, -10, -50);
            field3373.method3122(var9, var7);
        }
        if (this.field3358 >= 0) {
            var9 = var9.method2765(arg2, arg3, arg4, arg5, true, this.field3358);
        }
        return var9;
    }

    @ObfuscatedName("ix.i(II[[IIIILiv;II)Ldv;")
    public final class128 method4300(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class259 arg6, int arg7) {
        long var9;
        if (this.field3347 == null) {
            var9 = (long) ((this.field3379 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3379 << 10) + (arg0 << 3) + arg1);
        }
        class128 var11 = (class128) field3373.method3120(var9);
        if (var11 == null) {
            class122 var12 = this.method4301(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2660(this.field3363 + 64, this.field3355 + 768, -50, -10, -50);
            field3373.method3122(var11, var9);
        }
        if (arg6 == null && this.field3358 == -1) {
            return var11;
        }
        class128 var13;
        if (arg6 == null) {
            var13 = var11.method2757(true);
        } else {
            var13 = arg6.method4458(var11, arg7, arg1);
        }
        if (this.field3358 >= 0) {
            var13 = var13.method2765(arg2, arg3, arg4, arg5, false, this.field3358);
        }
        return var13;
    }

    @ObfuscatedName("ix.d(III)Ldu;")
    public final class122 method4301(int arg0, int arg1) {
        class122 var3 = null;
        if (this.field3347 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3337 == null) {
                return null;
            }
            boolean var4 = this.field3353;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3337.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3337[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class122) field3340.method3120((long) var7);
                if (var3 == null) {
                    var3 = class122.method2685(Statics.field3339, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2654();
                    }
                    field3340.method3122(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3344[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class122(field3344, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3347.length; var9++) {
                if (this.field3347[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3337[var8];
            boolean var11 = this.field3353 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class122) field3340.method3120((long) var10);
            if (var3 == null) {
                var3 = class122.method2685(Statics.field3339, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2654();
                }
                field3340.method3122(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3370 == 128 && this.field3371 == 128 && this.field3365 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3349 == 0 && this.field3359 == 0 && this.field3345 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class122 var14 = new class122(var3, arg1 == 0 && !var12 && !var13, this.field3368 == null, this.field3351 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2651(256);
            var14.method2644(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2643();
        } else if (var15 == 2) {
            var14.method2649();
        } else if (var15 == 3) {
            var14.method2650();
        }
        if (this.field3368 != null) {
            for (int var16 = 0; var16 < this.field3368.length; var16++) {
                var14.method2640(this.field3368[var16], this.field3350[var16]);
            }
        }
        if (this.field3351 != null) {
            for (int var17 = 0; var17 < this.field3351.length; var17++) {
                var14.method2653(this.field3351[var17], this.field3383[var17]);
            }
        }
        if (var12) {
            var14.method2655(this.field3370, this.field3371, this.field3365);
        }
        if (var13) {
            var14.method2644(this.field3349, this.field3359, this.field3345);
        }
        return var14;
    }

    @ObfuscatedName("ix.m(I)Lix;")
    public final class254 method4333() {
        int var1 = -1;
        if (this.field3380 != -1) {
            var1 = class213.method3185(this.field3380);
        } else if (this.field3341 != -1) {
            var1 = class213.field2507[this.field3341];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3354.length - 1) {
            var2 = this.field3354[var1];
        } else {
            var2 = this.field3354[this.field3354.length - 1];
        }
        return var2 == -1 ? null : method3848(var2);
    }

    @ObfuscatedName("ix.p(III)I")
    public int method4303(int arg0, int arg1) {
        return class248.method4841(this.field3387, arg0, arg1);
    }

    @ObfuscatedName("ix.h(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4319(int arg0, String arg1) {
        class316 var3 = this.field3387;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class177 var5 = (class177) var3.method5494((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2084;
            }
        }
        return var4;
    }

    @ObfuscatedName("ix.k(I)Z")
    public boolean method4305() {
        if (this.field3354 == null) {
            return this.field3382 != -1 || this.field3386 != null;
        }
        for (int var1 = 0; var1 < this.field3354.length; var1++) {
            if (this.field3354[var1] != -1) {
                class254 var2 = method3848(this.field3354[var1]);
                if (var2.field3382 != -1 || var2.field3386 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
