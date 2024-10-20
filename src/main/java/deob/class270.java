package deob;

@ObfuscatedName("jx")
public class class270 extends class219 {

    @ObfuscatedName("jx.z")
    public static class213 field3452 = new class213(256);

    @ObfuscatedName("jx.n")
    public final int field3453;

    @ObfuscatedName("jx.l")
    public int field3454 = -1;

    @ObfuscatedName("jx.s")
    public int field3455 = -1;

    @ObfuscatedName("jx.y")
    public String field3456;

    @ObfuscatedName("jx.c")
    public int field3457;

    @ObfuscatedName("jx.h")
    public int field3458 = 0;

    @ObfuscatedName("jx.o")
    public String[] field3471 = new String[5];

    @ObfuscatedName("jx.d")
    public String field3460;

    @ObfuscatedName("jx.r")
    public int[] field3462;

    @ObfuscatedName("jx.p")
    public int field3469 = Integer.MAX_VALUE;

    @ObfuscatedName("jx.q")
    public int field3467 = Integer.MAX_VALUE;

    @ObfuscatedName("jx.f")
    public int field3465 = Integer.MIN_VALUE;

    @ObfuscatedName("jx.j")
    public int field3466 = Integer.MIN_VALUE;

    @ObfuscatedName("jx.v")
    public class285 field3461 = class285.field3705;

    @ObfuscatedName("jx.u")
    public class267 field3468 = class267.field3437;

    @ObfuscatedName("jx.k")
    public int[] field3450;

    @ObfuscatedName("jx.w")
    public byte[] field3470;

    @ObfuscatedName("jx.m")
    public int field3464 = -1;

    public class270(int arg0) {
        this.field3453 = arg0;
    }

    @ObfuscatedName("dx.g(Ljr;Ljr;I)Z")
    public static boolean method2451(class262 arg0, class262 arg1) {
        Statics.field3463 = arg1;
        if (!arg0.method4290()) {
            return false;
        }
        Statics.field3451 = arg0.method4279(35);
        Statics.field2517 = new class270[Statics.field3451];
        for (int var2 = 0; var2 < Statics.field3451; var2++) {
            byte[] var3 = arg0.method4294(35, var2);
            if (var3 != null) {
                Statics.field2517[var2] = new class270(var2);
                Statics.field2517[var2].method4479(new class195(var3));
                Statics.field2517[var2].method4467();
            }
        }
        return true;
    }

    @ObfuscatedName("jx.e(Lgg;I)V")
    public void method4479(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4472(arg0, var2);
        }
    }

    @ObfuscatedName("jx.b(Lgg;IB)V")
    public void method4472(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3454 = arg0.method3324();
        } else if (arg1 == 2) {
            this.field3455 = arg0.method3324();
        } else if (arg1 == 3) {
            this.field3456 = arg0.method3429();
        } else if (arg1 == 4) {
            this.field3457 = arg0.method3312();
        } else if (arg1 == 5) {
            arg0.method3312();
        } else if (arg1 == 6) {
            this.field3458 = arg0.method3332();
        } else if (arg1 == 7) {
            int var3 = arg0.method3332();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3332();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3471[arg1 - 10] = arg0.method3429();
        } else if (arg1 == 15) {
            int var4 = arg0.method3332();
            this.field3462 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3462[var5] = arg0.method3414();
            }
            arg0.method3472();
            int var6 = arg0.method3332();
            this.field3450 = new int[var6];
            for (int var7 = 0; var7 < this.field3450.length; var7++) {
                this.field3450[var7] = arg0.method3472();
            }
            this.field3470 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3470[var8] = arg0.method3309();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3460 = arg0.method3429();
            } else if (arg1 == 18) {
                arg0.method3324();
            } else if (arg1 == 19) {
                this.field3464 = arg0.method3310();
            } else if (arg1 == 21) {
                arg0.method3472();
            } else if (arg1 == 22) {
                arg0.method3472();
            } else if (arg1 == 23) {
                arg0.method3332();
                arg0.method3332();
                arg0.method3332();
            } else if (arg1 == 24) {
                arg0.method3414();
                arg0.method3414();
            } else if (arg1 == 25) {
                arg0.method3324();
            } else if (arg1 == 28) {
                arg0.method3332();
            } else if (arg1 == 29) {
                this.field3461 = (class285) Statics.method3233(class285.method242(), arg0.method3332());
            } else if (arg1 == 30) {
                class267[] var9 = new class267[] { class267.field3438, class267.field3439, class267.field3437 };
                this.field3468 = (class267) Statics.method3233(var9, arg0.method3332());
            }
        }
    }

    @ObfuscatedName("jx.z(B)V")
    public void method4467() {
        if (this.field3462 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3462.length; var1 += 2) {
            if (this.field3462[var1] < this.field3469) {
                this.field3469 = this.field3462[var1];
            } else if (this.field3462[var1] > this.field3465) {
                this.field3465 = this.field3462[var1];
            }
            if (this.field3462[var1 + 1] < this.field3467) {
                this.field3467 = this.field3462[var1 + 1];
            } else if (this.field3462[var1 + 1] > this.field3466) {
                this.field3466 = this.field3462[var1 + 1];
            }
        }
    }

    @ObfuscatedName("jx.n(ZI)Llv;")
    public class332 method4468(boolean arg0) {
        int var2 = arg0 ? this.field3455 : this.field3454;
        return this.method4484(var2);
    }

    @ObfuscatedName("jx.l(II)Llv;")
    public class332 method4484(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class332 var2 = (class332) field3452.method3706((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class332 var3 = class333.method3538(Statics.field3463, arg0, 0);
        if (var3 != null) {
            field3452.method3712(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("jx.s(I)I")
    public int method4475() {
        return this.field3453;
    }

    @ObfuscatedName("q.y(I)V")
    public static void method80() {
        field3452.method3709();
    }
}
