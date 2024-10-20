package deob;

@ObfuscatedName("ia")
public class class257 extends class176 {

    @ObfuscatedName("ia.t")
    public static class146 field3435 = new class146(64);

    @ObfuscatedName("ia.g")
    public static class146 field3455 = new class146(50);

    @ObfuscatedName("ia.l")
    public int field3439;

    @ObfuscatedName("ia.u")
    public String field3440 = class225.field2900;

    @ObfuscatedName("ia.j")
    public int field3441 = 1;

    @ObfuscatedName("ia.v")
    public int[] field3442;

    @ObfuscatedName("ia.d")
    public int[] field3443;

    @ObfuscatedName("ia.z")
    public int field3444 = -1;

    @ObfuscatedName("ia.n")
    public int field3445 = -1;

    @ObfuscatedName("ia.h")
    public int field3437 = -1;

    @ObfuscatedName("ia.f")
    public int field3463 = -1;

    @ObfuscatedName("ia.s")
    public int field3448 = -1;

    @ObfuscatedName("ia.p")
    public int field3449 = -1;

    @ObfuscatedName("ia.e")
    public int field3450 = -1;

    @ObfuscatedName("ia.i")
    public short[] field3466;

    @ObfuscatedName("ia.q")
    public short[] field3451;

    @ObfuscatedName("ia.y")
    public short[] field3453;

    @ObfuscatedName("ia.r")
    public short[] field3454;

    @ObfuscatedName("ia.k")
    public String[] field3458 = new String[5];

    @ObfuscatedName("ia.w")
    public boolean field3446 = true;

    @ObfuscatedName("ia.m")
    public int field3457 = -1;

    @ObfuscatedName("ia.o")
    public int field3447 = 128;

    @ObfuscatedName("ia.a")
    public int field3459 = 128;

    @ObfuscatedName("ia.b")
    public boolean field3456 = false;

    @ObfuscatedName("ia.ag")
    public int field3461 = 0;

    @ObfuscatedName("ia.at")
    public int field3462 = 0;

    @ObfuscatedName("ia.ao")
    public int field3452 = -1;

    @ObfuscatedName("ia.av")
    public int field3464 = 32;

    @ObfuscatedName("ia.an")
    public int[] field3465;

    @ObfuscatedName("ia.al")
    public int field3471 = -1;

    @ObfuscatedName("ia.as")
    public int field3467 = -1;

    @ObfuscatedName("ia.ad")
    public boolean field3468 = true;

    @ObfuscatedName("ia.ap")
    public boolean field3469 = true;

    @ObfuscatedName("ia.ax")
    public boolean field3470 = false;

    @ObfuscatedName("ia.aj")
    public class316 field3438;

    @ObfuscatedName("ef.c(Lhz;Lhz;S)V")
    public static void method3038(class234 arg0, class234 arg1) {
        Statics.field3460 = arg0;
        Statics.field3436 = arg1;
    }

    @ObfuscatedName("kn.x(II)Lia;")
    public static class257 method4928(int arg0) {
        class257 var1 = (class257) field3435.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3460.method3825(9, arg0);
        class257 var3 = new class257();
        var3.field3439 = arg0;
        if (var2 != null) {
            var3.method4387(new class300(var2));
        }
        var3.method4386();
        field3435.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.t(I)V")
    public void method4386() {
    }

    @ObfuscatedName("ia.g(Lkz;S)V")
    public void method4387(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4392(arg0, var2);
        }
    }

    @ObfuscatedName("ia.l(Lkz;IB)V")
    public void method4392(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5103();
            this.field3442 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3442[var4] = arg0.method5304();
            }
        } else if (arg1 == 2) {
            this.field3440 = arg0.method5112();
        } else if (arg1 == 12) {
            this.field3441 = arg0.method5103();
        } else if (arg1 == 13) {
            this.field3444 = arg0.method5304();
        } else if (arg1 == 14) {
            this.field3463 = arg0.method5304();
        } else if (arg1 == 15) {
            this.field3445 = arg0.method5304();
        } else if (arg1 == 16) {
            this.field3437 = arg0.method5304();
        } else if (arg1 == 17) {
            this.field3463 = arg0.method5304();
            this.field3448 = arg0.method5304();
            this.field3449 = arg0.method5304();
            this.field3450 = arg0.method5304();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3458[arg1 - 30] = arg0.method5112();
            if (this.field3458[arg1 - 30].equalsIgnoreCase(class225.field3033)) {
                this.field3458[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5103();
            this.field3466 = new short[var5];
            this.field3451 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3466[var6] = (short) arg0.method5304();
                this.field3451[var6] = (short) arg0.method5304();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5103();
            this.field3453 = new short[var7];
            this.field3454 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3453[var8] = (short) arg0.method5304();
                this.field3454[var8] = (short) arg0.method5304();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5103();
            this.field3443 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3443[var10] = arg0.method5304();
            }
        } else if (arg1 == 93) {
            this.field3446 = false;
        } else if (arg1 == 95) {
            this.field3457 = arg0.method5304();
        } else if (arg1 == 97) {
            this.field3447 = arg0.method5304();
        } else if (arg1 == 98) {
            this.field3459 = arg0.method5304();
        } else if (arg1 == 99) {
            this.field3456 = true;
        } else if (arg1 == 100) {
            this.field3461 = arg0.method5168();
        } else if (arg1 == 101) {
            this.field3462 = arg0.method5168() * 5;
        } else if (arg1 == 102) {
            this.field3452 = arg0.method5304();
        } else if (arg1 == 103) {
            this.field3464 = arg0.method5304();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3471 = arg0.method5304();
            if (this.field3471 == 65535) {
                this.field3471 = -1;
            }
            this.field3467 = arg0.method5304();
            if (this.field3467 == 65535) {
                this.field3467 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5304();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5103();
            this.field3465 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3465[var13] = arg0.method5304();
                if (this.field3465[var13] == 65535) {
                    this.field3465[var13] = -1;
                }
            }
            this.field3465[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3468 = false;
        } else if (arg1 == 109) {
            this.field3469 = false;
        } else if (arg1 == 111) {
            this.field3470 = true;
        } else if (arg1 == 249) {
            this.field3438 = class248.method4436(arg0, this.field3438);
        }
    }

    @ObfuscatedName("ia.u(Liw;ILiw;II)Ldr;")
    public final class128 method4408(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field3465 != null) {
            class257 var5 = this.method4403();
            return var5 == null ? null : var5.method4408(arg0, arg1, arg2, arg3);
        }
        class128 var6 = (class128) field3455.method3061((long) this.field3439);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3442.length; var8++) {
                if (!Statics.field3436.method3827(this.field3442[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class122[] var9 = new class122[this.field3442.length];
            for (int var10 = 0; var10 < this.field3442.length; var10++) {
                var9[var10] = class122.method2525(Statics.field3436, this.field3442[var10], 0);
            }
            class122 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class122(var9, var9.length);
            }
            if (this.field3466 != null) {
                for (int var12 = 0; var12 < this.field3466.length; var12++) {
                    var11.method2537(this.field3466[var12], this.field3451[var12]);
                }
            }
            if (this.field3453 != null) {
                for (int var13 = 0; var13 < this.field3453.length; var13++) {
                    var11.method2538(this.field3453[var13], this.field3454[var13]);
                }
            }
            var6 = var11.method2545(this.field3461 + 64, this.field3462 + 850, -30, -50, -30);
            field3455.method3062(var6, (long) this.field3439);
        }
        class128 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4444(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4441(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2631(true);
        } else {
            var14 = arg2.method4441(var6, arg3);
        }
        if (this.field3447 != 128 || this.field3459 != 128) {
            var14.method2647(this.field3447, this.field3459, this.field3447);
        }
        return var14;
    }

    @ObfuscatedName("ia.j(S)Lds;")
    public final class122 method4390() {
        if (this.field3465 != null) {
            class257 var1 = this.method4403();
            return var1 == null ? null : var1.method4390();
        } else if (this.field3443 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3443.length; var3++) {
                if (!Statics.field3436.method3827(this.field3443[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class122[] var4 = new class122[this.field3443.length];
            for (int var5 = 0; var5 < this.field3443.length; var5++) {
                var4[var5] = class122.method2525(Statics.field3436, this.field3443[var5], 0);
            }
            class122 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class122(var4, var4.length);
            }
            if (this.field3466 != null) {
                for (int var7 = 0; var7 < this.field3466.length; var7++) {
                    var6.method2537(this.field3466[var7], this.field3451[var7]);
                }
            }
            if (this.field3453 != null) {
                for (int var8 = 0; var8 < this.field3453.length; var8++) {
                    var6.method2538(this.field3453[var8], this.field3454[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ia.v(I)Lia;")
    public final class257 method4403() {
        int var1 = -1;
        if (this.field3471 != -1) {
            var1 = class213.method504(this.field3471);
        } else if (this.field3467 != -1) {
            var1 = class213.field2494[this.field3467];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3465.length - 1) {
            var2 = this.field3465[var1];
        } else {
            var2 = this.field3465[this.field3465.length - 1];
        }
        return var2 == -1 ? null : method4928(var2);
    }

    @ObfuscatedName("ia.d(I)Z")
    public boolean method4391() {
        if (this.field3465 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3471 != -1) {
            var1 = class213.method504(this.field3471);
        } else if (this.field3467 != -1) {
            var1 = class213.field2494[this.field3467];
        }
        if (var1 >= 0 && var1 < this.field3465.length) {
            return this.field3465[var1] != -1;
        } else {
            return this.field3465[this.field3465.length - 1] != -1;
        }
    }

    @ObfuscatedName("ia.z(IIB)I")
    public int method4393(int arg0, int arg1) {
        return class248.method1051(this.field3438, arg0, arg1);
    }

    @ObfuscatedName("ia.s(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4399(int arg0, String arg1) {
        class316 var3 = this.field3438;
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
}
