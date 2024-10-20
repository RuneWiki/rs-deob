package deob;

@ObfuscatedName("il")
public class class254 extends class176 {

    @ObfuscatedName("il.u")
    public static boolean field3359 = false;

    @ObfuscatedName("il.g")
    public static class146 field3356 = new class146(4096);

    @ObfuscatedName("il.z")
    public static class146 field3383 = new class146(500);

    @ObfuscatedName("il.p")
    public static class146 field3398 = new class146(30);

    @ObfuscatedName("il.h")
    public static class146 field3373 = new class146(30);

    @ObfuscatedName("il.y")
    public static class122[] field3360 = new class122[4];

    @ObfuscatedName("il.w")
    public int field3355;

    @ObfuscatedName("il.i")
    public int[] field3362;

    @ObfuscatedName("il.k")
    public int[] field3363;

    @ObfuscatedName("il.x")
    public String field3364 = class225.field2777;

    @ObfuscatedName("il.o")
    public short[] field3365;

    @ObfuscatedName("il.e")
    public short[] field3361;

    @ObfuscatedName("il.n")
    public short[] field3377;

    @ObfuscatedName("il.r")
    public short[] field3368;

    @ObfuscatedName("il.c")
    public int field3369 = 1;

    @ObfuscatedName("il.a")
    public int field3370 = 1;

    @ObfuscatedName("il.d")
    public int field3371 = 2;

    @ObfuscatedName("il.s")
    public boolean field3387 = true;

    @ObfuscatedName("il.t")
    public int field3388 = -1;

    @ObfuscatedName("il.m")
    public int field3374 = -1;

    @ObfuscatedName("il.v")
    public boolean field3367 = false;

    @ObfuscatedName("il.q")
    public boolean field3402 = false;

    @ObfuscatedName("il.l")
    public int field3396 = -1;

    @ObfuscatedName("il.j")
    public int field3372 = 16;

    @ObfuscatedName("il.af")
    public int field3380 = 0;

    @ObfuscatedName("il.ad")
    public int field3399 = 0;

    @ObfuscatedName("il.am")
    public String[] field3381 = new String[5];

    @ObfuscatedName("il.ai")
    public int field3382 = -1;

    @ObfuscatedName("il.ag")
    public int field3358 = -1;

    @ObfuscatedName("il.ao")
    public boolean field3384 = false;

    @ObfuscatedName("il.aw")
    public boolean field3385 = true;

    @ObfuscatedName("il.ak")
    public int field3386 = 128;

    @ObfuscatedName("il.aa")
    public int field3357 = 128;

    @ObfuscatedName("il.ab")
    public int field3366 = 128;

    @ObfuscatedName("il.ar")
    public int field3389 = 0;

    @ObfuscatedName("il.av")
    public int field3390 = 0;

    @ObfuscatedName("il.aq")
    public int field3353 = 0;

    @ObfuscatedName("il.ac")
    public boolean field3392 = false;

    @ObfuscatedName("il.az")
    public boolean field3393 = false;

    @ObfuscatedName("il.at")
    public int field3394 = -1;

    @ObfuscatedName("il.ae")
    public int[] field3395;

    @ObfuscatedName("il.aj")
    public int field3378 = -1;

    @ObfuscatedName("il.ap")
    public int field3397 = -1;

    @ObfuscatedName("il.an")
    public int field3379 = -1;

    @ObfuscatedName("il.al")
    public int field3375 = 0;

    @ObfuscatedName("il.ay")
    public int field3400 = 0;

    @ObfuscatedName("il.ax")
    public int field3401 = 0;

    @ObfuscatedName("il.au")
    public int[] field3391;

    @ObfuscatedName("il.as")
    public class316 field3403;

    @ObfuscatedName("aa.u(Lhf;Lhf;ZB)V")
    public static void method529(class234 arg0, class234 arg1, boolean arg2) {
        Statics.field3354 = arg0;
        Statics.field3376 = arg1;
        field3359 = arg2;
    }

    @ObfuscatedName("ej.f(II)Lil;")
    public static class254 method3048(int arg0) {
        class254 var1 = (class254) field3356.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3354.method3928(6, arg0);
        class254 var3 = new class254();
        var3.field3355 = arg0;
        if (var2 != null) {
            var3.method4334(new class300(var2));
        }
        var3.method4283();
        if (var3.field3393) {
            var3.field3371 = 0;
            var3.field3387 = false;
        }
        field3356.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.b(S)V")
    public void method4283() {
        if (this.field3388 == -1) {
            this.field3388 = 0;
            if (this.field3362 != null && (this.field3363 == null || this.field3363[0] == 10)) {
                this.field3388 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3381[var1] != null) {
                    this.field3388 = 1;
                }
            }
        }
        if (this.field3394 == -1) {
            this.field3394 = this.field3371 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("il.g(Lkg;I)V")
    public void method4334(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4285(arg0, var2);
        }
    }

    @ObfuscatedName("il.z(Lkg;II)V")
    public void method4285(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5138();
            if (var3 > 0) {
                if (this.field3362 == null || field3359) {
                    this.field3363 = new int[var3];
                    this.field3362 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3362[var4] = arg0.method5337();
                        this.field3363[var4] = arg0.method5138();
                    }
                } else {
                    arg0.field3707 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3364 = arg0.method5147();
        } else if (arg1 == 5) {
            int var5 = arg0.method5138();
            if (var5 > 0) {
                if (this.field3362 == null || field3359) {
                    this.field3363 = null;
                    this.field3362 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3362[var6] = arg0.method5337();
                    }
                } else {
                    arg0.field3707 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3369 = arg0.method5138();
        } else if (arg1 == 15) {
            this.field3370 = arg0.method5138();
        } else if (arg1 == 17) {
            this.field3371 = 0;
            this.field3387 = false;
        } else if (arg1 == 18) {
            this.field3387 = false;
        } else if (arg1 == 19) {
            this.field3388 = arg0.method5138();
        } else if (arg1 == 21) {
            this.field3374 = 0;
        } else if (arg1 == 22) {
            this.field3367 = true;
        } else if (arg1 == 23) {
            this.field3402 = true;
        } else if (arg1 == 24) {
            this.field3396 = arg0.method5337();
            if (this.field3396 == 65535) {
                this.field3396 = -1;
            }
        } else if (arg1 == 27) {
            this.field3371 = 1;
        } else if (arg1 == 28) {
            this.field3372 = arg0.method5138();
        } else if (arg1 == 29) {
            this.field3380 = arg0.method5139();
        } else if (arg1 == 39) {
            this.field3399 = arg0.method5139() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3381[arg1 - 30] = arg0.method5147();
            if (this.field3381[arg1 - 30].equalsIgnoreCase(class225.field3037)) {
                this.field3381[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5138();
            this.field3365 = new short[var7];
            this.field3361 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3365[var8] = (short) arg0.method5337();
                this.field3361[var8] = (short) arg0.method5337();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5138();
            this.field3377 = new short[var9];
            this.field3368 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3377[var10] = (short) arg0.method5337();
                this.field3368[var10] = (short) arg0.method5337();
            }
        } else if (arg1 == 62) {
            this.field3384 = true;
        } else if (arg1 == 64) {
            this.field3385 = false;
        } else if (arg1 == 65) {
            this.field3386 = arg0.method5337();
        } else if (arg1 == 66) {
            this.field3357 = arg0.method5337();
        } else if (arg1 == 67) {
            this.field3366 = arg0.method5337();
        } else if (arg1 == 68) {
            this.field3358 = arg0.method5337();
        } else if (arg1 == 69) {
            arg0.method5138();
        } else if (arg1 == 70) {
            this.field3389 = arg0.method5141();
        } else if (arg1 == 71) {
            this.field3390 = arg0.method5141();
        } else if (arg1 == 72) {
            this.field3353 = arg0.method5141();
        } else if (arg1 == 73) {
            this.field3392 = true;
        } else if (arg1 == 74) {
            this.field3393 = true;
        } else if (arg1 == 75) {
            this.field3394 = arg0.method5138();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3378 = arg0.method5337();
            if (this.field3378 == 65535) {
                this.field3378 = -1;
            }
            this.field3397 = arg0.method5337();
            if (this.field3397 == 65535) {
                this.field3397 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5337();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5138();
            this.field3395 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3395[var15] = arg0.method5337();
                if (this.field3395[var15] == 65535) {
                    this.field3395[var15] = -1;
                }
            }
            this.field3395[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3379 = arg0.method5337();
            this.field3375 = arg0.method5138();
        } else if (arg1 == 79) {
            this.field3400 = arg0.method5337();
            this.field3401 = arg0.method5337();
            this.field3375 = arg0.method5138();
            int var11 = arg0.method5138();
            this.field3391 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3391[var12] = arg0.method5337();
            }
        } else if (arg1 == 81) {
            this.field3374 = arg0.method5138() * 256;
        } else if (arg1 == 82) {
            this.field3382 = arg0.method5337();
        } else if (arg1 == 249) {
            this.field3403 = class248.method3036(arg0, this.field3403);
        }
    }

    @ObfuscatedName("il.p(II)Z")
    public final boolean method4286(int arg0) {
        if (this.field3363 != null) {
            for (int var4 = 0; var4 < this.field3363.length; var4++) {
                if (this.field3363[var4] == arg0) {
                    return Statics.field3376.method3897(this.field3362[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3362 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3362.length; var3++) {
                var2 &= Statics.field3376.method3897(this.field3362[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("il.h(B)Z")
    public final boolean method4287() {
        if (this.field3362 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3362.length; var2++) {
            var1 &= Statics.field3376.method3897(this.field3362[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("il.y(II[[IIIII)Lee;")
    public final class136 method4288(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3363 == null) {
            var7 = (long) ((this.field3355 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3355 << 10) + (arg0 << 3) + arg1);
        }
        class136 var9 = (class136) field3398.method3076(var7);
        if (var9 == null) {
            class122 var10 = this.method4333(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3367) {
                var10.field1540 = (short) (this.field3380 + 64);
                var10.field1568 = (short) (this.field3399 + 768);
                var10.method2547();
                var9 = var10;
            } else {
                var9 = var10.method2568(this.field3380 + 64, this.field3399 + 768, -50, -10, -50);
            }
            field3398.method3078(var9, var7);
        }
        if (this.field3367) {
            var9 = ((class122) var9).method2574();
        }
        if (this.field3374 >= 0) {
            if (var9 instanceof class128) {
                var9 = ((class128) var9).method2711(arg2, arg3, arg4, arg5, true, this.field3374);
            } else if (var9 instanceof class122) {
                var9 = ((class122) var9).method2554(arg2, arg3, arg4, arg5, true, this.field3374);
            }
        }
        return var9;
    }

    @ObfuscatedName("il.w(II[[IIIIS)Ldf;")
    public final class128 method4323(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3363 == null) {
            var7 = (long) ((this.field3355 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3355 << 10) + (arg0 << 3) + arg1);
        }
        class128 var9 = (class128) field3373.method3076(var7);
        if (var9 == null) {
            class122 var10 = this.method4333(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2568(this.field3380 + 64, this.field3399 + 768, -50, -10, -50);
            field3373.method3078(var9, var7);
        }
        if (this.field3374 >= 0) {
            var9 = var9.method2711(arg2, arg3, arg4, arg5, true, this.field3374);
        }
        return var9;
    }

    @ObfuscatedName("il.i(II[[IIIILiy;IB)Ldf;")
    public final class128 method4290(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class259 arg6, int arg7) {
        long var9;
        if (this.field3363 == null) {
            var9 = (long) ((this.field3355 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3355 << 10) + (arg0 << 3) + arg1);
        }
        class128 var11 = (class128) field3373.method3076(var9);
        if (var11 == null) {
            class122 var12 = this.method4333(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2568(this.field3380 + 64, this.field3399 + 768, -50, -10, -50);
            field3373.method3078(var11, var9);
        }
        if (arg6 == null && this.field3374 == -1) {
            return var11;
        }
        class128 var13;
        if (arg6 == null) {
            var13 = var11.method2636(true);
        } else {
            var13 = arg6.method4456(var11, arg7, arg1);
        }
        if (this.field3374 >= 0) {
            var13 = var13.method2711(arg2, arg3, arg4, arg5, false, this.field3374);
        }
        return var13;
    }

    @ObfuscatedName("il.k(III)Ldq;")
    public final class122 method4333(int arg0, int arg1) {
        class122 var3 = null;
        if (this.field3363 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3362 == null) {
                return null;
            }
            boolean var4 = this.field3384;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3362.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3362[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class122) field3383.method3076((long) var7);
                if (var3 == null) {
                    var3 = class122.method2548(Statics.field3376, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2613();
                    }
                    field3383.method3078(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3360[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class122(field3360, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3363.length; var9++) {
                if (this.field3363[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3362[var8];
            boolean var11 = this.field3384 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class122) field3383.method3076((long) var10);
            if (var3 == null) {
                var3 = class122.method2548(Statics.field3376, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2613();
                }
                field3383.method3078(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3386 == 128 && this.field3357 == 128 && this.field3366 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3389 == 0 && this.field3390 == 0 && this.field3353 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class122 var14 = new class122(var3, arg1 == 0 && !var12 && !var13, this.field3365 == null, this.field3377 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2557(256);
            var14.method2559(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2619();
        } else if (var15 == 2) {
            var14.method2607();
        } else if (var15 == 3) {
            var14.method2558();
        }
        if (this.field3365 != null) {
            for (int var16 = 0; var16 < this.field3365.length; var16++) {
                var14.method2561(this.field3365[var16], this.field3361[var16]);
            }
        }
        if (this.field3377 != null) {
            for (int var17 = 0; var17 < this.field3377.length; var17++) {
                var14.method2617(this.field3377[var17], this.field3368[var17]);
            }
        }
        if (var12) {
            var14.method2564(this.field3386, this.field3357, this.field3366);
        }
        if (var13) {
            var14.method2559(this.field3389, this.field3390, this.field3353);
        }
        return var14;
    }

    @ObfuscatedName("il.x(I)Lil;")
    public final class254 method4321() {
        int var1 = -1;
        if (this.field3378 != -1) {
            var1 = class213.method3238(this.field3378);
        } else if (this.field3397 != -1) {
            var1 = class213.field2531[this.field3397];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3395.length - 1) {
            var2 = this.field3395[var1];
        } else {
            var2 = this.field3395[this.field3395.length - 1];
        }
        return var2 == -1 ? null : method3048(var2);
    }

    @ObfuscatedName("il.o(IIB)I")
    public int method4293(int arg0, int arg1) {
        class316 var3 = this.field3403;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5521((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2125;
            }
        }
        return var4;
    }

    @ObfuscatedName("il.e(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4294(int arg0, String arg1) {
        return class248.method3828(this.field3403, arg0, arg1);
    }

    @ObfuscatedName("bk.n(I)V")
    public static void method1855() {
        field3356.method3075();
        field3383.method3075();
        field3398.method3075();
        field3373.method3075();
    }

    @ObfuscatedName("il.c(I)Z")
    public boolean method4292() {
        if (this.field3395 == null) {
            return this.field3379 != -1 || this.field3391 != null;
        }
        for (int var1 = 0; var1 < this.field3395.length; var1++) {
            if (this.field3395[var1] != -1) {
                class254 var2 = method3048(this.field3395[var1]);
                if (var2.field3379 != -1 || var2.field3391 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
