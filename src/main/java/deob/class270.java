package deob;

@ObfuscatedName("jw")
public class class270 extends class219 {

    @ObfuscatedName("jw.r")
    public static class213 field3451 = new class213(256);

    @ObfuscatedName("jw.e")
    public final int field3456;

    @ObfuscatedName("jw.y")
    public int field3453 = -1;

    @ObfuscatedName("jw.k")
    public int field3454 = -1;

    @ObfuscatedName("jw.s")
    public String field3459;

    @ObfuscatedName("jw.p")
    public int field3449;

    @ObfuscatedName("jw.x")
    public int field3457 = 0;

    @ObfuscatedName("jw.h")
    public String[] field3468 = new String[5];

    @ObfuscatedName("jw.t")
    public String field3463;

    @ObfuscatedName("jw.i")
    public int[] field3460;

    @ObfuscatedName("jw.u")
    public int field3461 = Integer.MAX_VALUE;

    @ObfuscatedName("jw.q")
    public int field3462 = Integer.MAX_VALUE;

    @ObfuscatedName("jw.v")
    public int field3458 = Integer.MIN_VALUE;

    @ObfuscatedName("jw.f")
    public int field3455 = Integer.MIN_VALUE;

    @ObfuscatedName("jw.b")
    public class285 field3465 = class285.field3697;

    @ObfuscatedName("jw.c")
    public class267 field3464 = class267.field3435;

    @ObfuscatedName("jw.j")
    public int[] field3467;

    @ObfuscatedName("jw.l")
    public byte[] field3466;

    @ObfuscatedName("jw.g")
    public int field3452 = -1;

    public class270(int arg0) {
        this.field3456 = arg0;
    }

    @ObfuscatedName("ir.d(Ljk;Ljk;I)Z")
    public static boolean method4234(class262 arg0, class262 arg1) {
        Statics.field3469 = arg1;
        if (!arg0.method4278()) {
            return false;
        }
        Statics.field2125 = arg0.method4285(35);
        Statics.field3450 = new class270[Statics.field2125];
        for (int var2 = 0; var2 < Statics.field2125; var2++) {
            byte[] var3 = arg0.method4273(35, var2);
            if (var3 != null) {
                Statics.field3450[var2] = new class270(var2);
                Statics.field3450[var2].method4470(new class195(var3));
                Statics.field3450[var2].method4472();
            }
        }
        return true;
    }

    @ObfuscatedName("jw.z(Lgy;B)V")
    public void method4470(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4471(arg0, var2);
        }
    }

    @ObfuscatedName("jw.n(Lgy;II)V")
    public void method4471(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3453 = arg0.method3295();
        } else if (arg1 == 2) {
            this.field3454 = arg0.method3295();
        } else if (arg1 == 3) {
            this.field3459 = arg0.method3268();
        } else if (arg1 == 4) {
            this.field3449 = arg0.method3263();
        } else if (arg1 == 5) {
            arg0.method3263();
        } else if (arg1 == 6) {
            this.field3457 = arg0.method3330();
        } else if (arg1 == 7) {
            int var3 = arg0.method3330();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3330();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3468[arg1 - 10] = arg0.method3268();
        } else if (arg1 == 15) {
            int var4 = arg0.method3330();
            this.field3460 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3460[var5] = arg0.method3262();
            }
            arg0.method3264();
            int var6 = arg0.method3330();
            this.field3467 = new int[var6];
            for (int var7 = 0; var7 < this.field3467.length; var7++) {
                this.field3467[var7] = arg0.method3264();
            }
            this.field3466 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3466[var8] = arg0.method3421();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3463 = arg0.method3268();
            } else if (arg1 == 18) {
                arg0.method3295();
            } else if (arg1 == 19) {
                this.field3452 = arg0.method3269();
            } else if (arg1 == 21) {
                arg0.method3264();
            } else if (arg1 == 22) {
                arg0.method3264();
            } else if (arg1 == 23) {
                arg0.method3330();
                arg0.method3330();
                arg0.method3330();
            } else if (arg1 == 24) {
                arg0.method3262();
                arg0.method3262();
            } else if (arg1 == 25) {
                arg0.method3295();
            } else if (arg1 == 28) {
                arg0.method3330();
            } else if (arg1 == 29) {
                class285[] var9 = new class285[] { class285.field3696, class285.field3697, class285.field3701 };
                this.field3465 = (class285) class190.method500(var9, arg0.method3330());
            } else if (arg1 == 30) {
                class267[] var10 = new class267[] { class267.field3440, class267.field3435, class267.field3434 };
                this.field3464 = (class267) class190.method500(var10, arg0.method3330());
            }
        }
    }

    @ObfuscatedName("jw.r(I)V")
    public void method4472() {
        if (this.field3460 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3460.length; var1 += 2) {
            if (this.field3460[var1] < this.field3461) {
                this.field3461 = this.field3460[var1];
            } else if (this.field3460[var1] > this.field3458) {
                this.field3458 = this.field3460[var1];
            }
            if (this.field3460[var1 + 1] < this.field3462) {
                this.field3462 = this.field3460[var1 + 1];
            } else if (this.field3460[var1 + 1] > this.field3455) {
                this.field3455 = this.field3460[var1 + 1];
            }
        }
    }

    @ObfuscatedName("jw.e(ZB)Lly;")
    public class332 method4492(boolean arg0) {
        int var2 = arg0 ? this.field3454 : this.field3453;
        return this.method4474(var2);
    }

    @ObfuscatedName("jw.y(II)Lly;")
    public class332 method4474(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class332 var2 = (class332) field3451.method3707((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class332 var3 = class333.method560(Statics.field3469, arg0, 0);
        if (var3 != null) {
            field3451.method3697(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("jw.k(B)I")
    public int method4475() {
        return this.field3456;
    }

    @ObfuscatedName("cs.s(I)V")
    public static void method1713() {
        field3451.method3700();
    }
}
