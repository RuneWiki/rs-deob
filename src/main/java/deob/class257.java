package deob;

@ObfuscatedName("ii")
public class class257 extends class176 {

    @ObfuscatedName("ii.i")
    public static class146 field3472 = new class146(64);

    @ObfuscatedName("ii.k")
    public static class146 field3444 = new class146(50);

    @ObfuscatedName("ii.u")
    public int field3445;

    @ObfuscatedName("ii.n")
    public String field3446 = class225.field2929;

    @ObfuscatedName("ii.t")
    public int field3451 = 1;

    @ObfuscatedName("ii.q")
    public int[] field3448;

    @ObfuscatedName("ii.x")
    public int[] field3449;

    @ObfuscatedName("ii.d")
    public int field3450 = -1;

    @ObfuscatedName("ii.f")
    public int field3462 = -1;

    @ObfuscatedName("ii.c")
    public int field3441 = -1;

    @ObfuscatedName("ii.r")
    public int field3443 = -1;

    @ObfuscatedName("ii.y")
    public int field3454 = -1;

    @ObfuscatedName("ii.p")
    public int field3455 = -1;

    @ObfuscatedName("ii.b")
    public int field3456 = -1;

    @ObfuscatedName("ii.g")
    public short[] field3457;

    @ObfuscatedName("ii.e")
    public short[] field3458;

    @ObfuscatedName("ii.z")
    public short[] field3459;

    @ObfuscatedName("ii.a")
    public short[] field3460;

    @ObfuscatedName("ii.w")
    public String[] field3461 = new String[5];

    @ObfuscatedName("ii.l")
    public boolean field3469 = true;

    @ObfuscatedName("ii.h")
    public int field3463 = -1;

    @ObfuscatedName("ii.v")
    public int field3464 = 128;

    @ObfuscatedName("ii.m")
    public int field3465 = 128;

    @ObfuscatedName("ii.o")
    public boolean field3466 = false;

    @ObfuscatedName("ii.av")
    public int field3467 = 0;

    @ObfuscatedName("ii.am")
    public int field3468 = 0;

    @ObfuscatedName("ii.ai")
    public int field3475 = -1;

    @ObfuscatedName("ii.af")
    public int field3474 = 32;

    @ObfuscatedName("ii.az")
    public int[] field3471;

    @ObfuscatedName("ii.aj")
    public int field3470 = -1;

    @ObfuscatedName("ii.an")
    public int field3473 = -1;

    @ObfuscatedName("ii.at")
    public boolean field3447 = true;

    @ObfuscatedName("ii.as")
    public boolean field3452 = true;

    @ObfuscatedName("ii.ak")
    public boolean field3476 = false;

    @ObfuscatedName("ii.ao")
    public class316 field3453;

    @ObfuscatedName("av.s(Lhz;Lhz;I)V")
    public static void method336(class234 arg0, class234 arg1) {
        Statics.field3477 = arg0;
        Statics.field3442 = arg1;
    }

    @ObfuscatedName("df.j(II)Lii;")
    public static class257 method2739(int arg0) {
        class257 var1 = (class257) field3472.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3477.method3790(9, arg0);
        class257 var3 = new class257();
        var3.field3445 = arg0;
        if (var2 != null) {
            var3.method4319(new class300(var2));
        }
        var3.method4318();
        field3472.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.i(B)V")
    public void method4318() {
    }

    @ObfuscatedName("ii.k(Lky;B)V")
    public void method4319(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4320(arg0, var2);
        }
    }

    @ObfuscatedName("ii.u(Lky;II)V")
    public void method4320(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5179();
            this.field3448 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3448[var4] = arg0.method5054();
            }
        } else if (arg1 == 2) {
            this.field3446 = arg0.method5150();
        } else if (arg1 == 12) {
            this.field3451 = arg0.method5179();
        } else if (arg1 == 13) {
            this.field3450 = arg0.method5054();
        } else if (arg1 == 14) {
            this.field3443 = arg0.method5054();
        } else if (arg1 == 15) {
            this.field3462 = arg0.method5054();
        } else if (arg1 == 16) {
            this.field3441 = arg0.method5054();
        } else if (arg1 == 17) {
            this.field3443 = arg0.method5054();
            this.field3454 = arg0.method5054();
            this.field3455 = arg0.method5054();
            this.field3456 = arg0.method5054();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3461[arg1 - 30] = arg0.method5150();
            if (this.field3461[arg1 - 30].equalsIgnoreCase(class225.field2741)) {
                this.field3461[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5179();
            this.field3457 = new short[var5];
            this.field3458 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3457[var6] = (short) arg0.method5054();
                this.field3458[var6] = (short) arg0.method5054();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5179();
            this.field3459 = new short[var7];
            this.field3460 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3459[var8] = (short) arg0.method5054();
                this.field3460[var8] = (short) arg0.method5054();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5179();
            this.field3449 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3449[var10] = arg0.method5054();
            }
        } else if (arg1 == 93) {
            this.field3469 = false;
        } else if (arg1 == 95) {
            this.field3463 = arg0.method5054();
        } else if (arg1 == 97) {
            this.field3464 = arg0.method5054();
        } else if (arg1 == 98) {
            this.field3465 = arg0.method5054();
        } else if (arg1 == 99) {
            this.field3466 = true;
        } else if (arg1 == 100) {
            this.field3467 = arg0.method5034();
        } else if (arg1 == 101) {
            this.field3468 = arg0.method5034() * 5;
        } else if (arg1 == 102) {
            this.field3475 = arg0.method5054();
        } else if (arg1 == 103) {
            this.field3474 = arg0.method5054();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3470 = arg0.method5054();
            if (this.field3470 == 65535) {
                this.field3470 = -1;
            }
            this.field3473 = arg0.method5054();
            if (this.field3473 == 65535) {
                this.field3473 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5054();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5179();
            this.field3471 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3471[var13] = arg0.method5054();
                if (this.field3471[var13] == 65535) {
                    this.field3471[var13] = -1;
                }
            }
            this.field3471[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3447 = false;
        } else if (arg1 == 109) {
            this.field3452 = false;
        } else if (arg1 == 111) {
            this.field3476 = true;
        } else if (arg1 == 249) {
            this.field3453 = Statics.method2030(arg0, this.field3453);
        }
    }

    @ObfuscatedName("ii.n(Lij;ILij;II)Ldo;")
    public final class128 method4321(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field3471 != null) {
            class257 var5 = this.method4323();
            return var5 == null ? null : var5.method4321(arg0, arg1, arg2, arg3);
        }
        class128 var6 = (class128) field3444.method3065((long) this.field3445);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3448.length; var8++) {
                if (!Statics.field3442.method3845(this.field3448[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class122[] var9 = new class122[this.field3448.length];
            for (int var10 = 0; var10 < this.field3448.length; var10++) {
                var9[var10] = class122.method2521(Statics.field3442, this.field3448[var10], 0);
            }
            class122 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class122(var9, var9.length);
            }
            if (this.field3457 != null) {
                for (int var12 = 0; var12 < this.field3457.length; var12++) {
                    var11.method2534(this.field3457[var12], this.field3458[var12]);
                }
            }
            if (this.field3459 != null) {
                for (int var13 = 0; var13 < this.field3459.length; var13++) {
                    var11.method2535(this.field3459[var13], this.field3460[var13]);
                }
            }
            var6 = var11.method2542(this.field3467 + 64, this.field3468 + 850, -30, -50, -30);
            field3444.method3067(var6, (long) this.field3445);
        }
        class128 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4366(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4368(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2623(true);
        } else {
            var14 = arg2.method4368(var6, arg3);
        }
        if (this.field3464 != 128 || this.field3465 != 128) {
            var14.method2707(this.field3464, this.field3465, this.field3464);
        }
        return var14;
    }

    @ObfuscatedName("ii.t(I)Ldq;")
    public final class122 method4324() {
        if (this.field3471 != null) {
            class257 var1 = this.method4323();
            return var1 == null ? null : var1.method4324();
        } else if (this.field3449 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3449.length; var3++) {
                if (!Statics.field3442.method3845(this.field3449[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class122[] var4 = new class122[this.field3449.length];
            for (int var5 = 0; var5 < this.field3449.length; var5++) {
                var4[var5] = class122.method2521(Statics.field3442, this.field3449[var5], 0);
            }
            class122 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class122(var4, var4.length);
            }
            if (this.field3457 != null) {
                for (int var7 = 0; var7 < this.field3457.length; var7++) {
                    var6.method2534(this.field3457[var7], this.field3458[var7]);
                }
            }
            if (this.field3459 != null) {
                for (int var8 = 0; var8 < this.field3459.length; var8++) {
                    var6.method2535(this.field3459[var8], this.field3460[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ii.q(B)Lii;")
    public final class257 method4323() {
        int var1 = -1;
        if (this.field3470 != -1) {
            var1 = class213.method3606(this.field3470);
        } else if (this.field3473 != -1) {
            var1 = class213.field2503[this.field3473];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3471.length - 1) {
            var2 = this.field3471[var1];
        } else {
            var2 = this.field3471[this.field3471.length - 1];
        }
        return var2 == -1 ? null : method2739(var2);
    }

    @ObfuscatedName("ii.x(S)Z")
    public boolean method4343() {
        if (this.field3471 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3470 != -1) {
            var1 = class213.method3606(this.field3470);
        } else if (this.field3473 != -1) {
            var1 = class213.field2503[this.field3473];
        }
        if (var1 >= 0 && var1 < this.field3471.length) {
            return this.field3471[var1] != -1;
        } else {
            return this.field3471[this.field3471.length - 1] != -1;
        }
    }

    @ObfuscatedName("ii.d(III)I")
    public int method4329(int arg0, int arg1) {
        class316 var3 = this.field3453;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5405((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2094;
            }
        }
        return var4;
    }

    @ObfuscatedName("ii.f(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4341(int arg0, String arg1) {
        return class248.method3751(this.field3453, arg0, arg1);
    }

    @ObfuscatedName("bh.c(B)V")
    public static void method976() {
        field3472.method3068();
        field3444.method3068();
    }
}
