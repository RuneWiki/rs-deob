package deob;

@ObfuscatedName("jw")
public class class270 extends class219 {

    @ObfuscatedName("jw.d")
    public static class213 field3456 = new class213(256);

    @ObfuscatedName("jw.h")
    public final int field3464;

    @ObfuscatedName("jw.m")
    public int field3466 = -1;

    @ObfuscatedName("jw.z")
    public int field3469 = -1;

    @ObfuscatedName("jw.i")
    public String field3458;

    @ObfuscatedName("jw.u")
    public int field3461;

    @ObfuscatedName("jw.x")
    public int field3459 = 0;

    @ObfuscatedName("jw.a")
    public String[] field3463 = new String[5];

    @ObfuscatedName("jw.w")
    public String field3471;

    @ObfuscatedName("jw.n")
    public int[] field3465;

    @ObfuscatedName("jw.l")
    public int field3457 = Integer.MAX_VALUE;

    @ObfuscatedName("jw.s")
    public int field3467 = Integer.MAX_VALUE;

    @ObfuscatedName("jw.v")
    public int field3468 = Integer.MIN_VALUE;

    @ObfuscatedName("jw.q")
    public int field3460 = Integer.MIN_VALUE;

    @ObfuscatedName("jw.r")
    public class285 field3470 = class285.field3703;

    @ObfuscatedName("jw.j")
    public class267 field3454 = class267.field3441;

    @ObfuscatedName("jw.b")
    public int[] field3472;

    @ObfuscatedName("jw.g")
    public byte[] field3473;

    @ObfuscatedName("jw.f")
    public int field3474 = -1;

    public class270(int arg0) {
        this.field3464 = arg0;
    }

    @ObfuscatedName("bz.o(Ljf;Ljf;B)Z")
    public static boolean method1119(class262 arg0, class262 arg1) {
        Statics.field3462 = arg1;
        if (!arg0.method4253()) {
            return false;
        }
        Statics.field2163 = arg0.method4207(35);
        Statics.field3455 = new class270[Statics.field2163];
        for (int var2 = 0; var2 < Statics.field2163; var2++) {
            byte[] var3 = arg0.method4241(35, var2);
            if (var3 != null) {
                Statics.field3455[var2] = new class270(var2);
                Statics.field3455[var2].method4371(new class195(var3));
                Statics.field3455[var2].method4358();
            }
        }
        return true;
    }

    @ObfuscatedName("jw.k(Lgc;B)V")
    public void method4371(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4356(arg0, var2);
        }
    }

    @ObfuscatedName("jw.t(Lgc;IS)V")
    public void method4356(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3466 = arg0.method3264();
        } else if (arg1 == 2) {
            this.field3469 = arg0.method3264();
        } else if (arg1 == 3) {
            this.field3458 = arg0.method3284();
        } else if (arg1 == 4) {
            this.field3461 = arg0.method3233();
        } else if (arg1 == 5) {
            arg0.method3233();
        } else if (arg1 == 6) {
            this.field3459 = arg0.method3205();
        } else if (arg1 == 7) {
            int var3 = arg0.method3205();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3205();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3463[arg1 - 10] = arg0.method3284();
        } else if (arg1 == 15) {
            int var4 = arg0.method3205();
            this.field3465 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3465[var5] = arg0.method3346();
            }
            arg0.method3254();
            int var6 = arg0.method3205();
            this.field3472 = new int[var6];
            for (int var7 = 0; var7 < this.field3472.length; var7++) {
                this.field3472[var7] = arg0.method3254();
            }
            this.field3473 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3473[var8] = arg0.method3210();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3471 = arg0.method3284();
            } else if (arg1 == 18) {
                arg0.method3264();
            } else if (arg1 == 19) {
                this.field3474 = arg0.method3207();
            } else if (arg1 == 21) {
                arg0.method3254();
            } else if (arg1 == 22) {
                arg0.method3254();
            } else if (arg1 == 23) {
                arg0.method3205();
                arg0.method3205();
                arg0.method3205();
            } else if (arg1 == 24) {
                arg0.method3346();
                arg0.method3346();
            } else if (arg1 == 25) {
                arg0.method3264();
            } else if (arg1 == 28) {
                arg0.method3205();
            } else if (arg1 == 29) {
                class285[] var9 = new class285[] { class285.field3703, class285.field3700, class285.field3699 };
                this.field3470 = (class285) class190.method4146(var9, arg0.method3205());
            } else if (arg1 == 30) {
                this.field3454 = (class267) class190.method4146(class267.method4987(), arg0.method3205());
            }
        }
    }

    @ObfuscatedName("jw.d(I)V")
    public void method4358() {
        if (this.field3465 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3465.length; var1 += 2) {
            if (this.field3465[var1] < this.field3457) {
                this.field3457 = this.field3465[var1];
            } else if (this.field3465[var1] > this.field3468) {
                this.field3468 = this.field3465[var1];
            }
            if (this.field3465[var1 + 1] < this.field3467) {
                this.field3467 = this.field3465[var1 + 1];
            } else if (this.field3465[var1 + 1] > this.field3460) {
                this.field3460 = this.field3465[var1 + 1];
            }
        }
    }

    @ObfuscatedName("jw.h(ZI)Lld;")
    public class332 method4385(boolean arg0) {
        int var2 = arg0 ? this.field3469 : this.field3466;
        return this.method4359(var2);
    }

    @ObfuscatedName("jw.m(II)Lld;")
    public class332 method4359(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class332 var2 = (class332) field3456.method3601((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class332 var3 = class333.method704(Statics.field3462, arg0, 0);
        if (var3 != null) {
            field3456.method3603(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("jw.z(I)I")
    public int method4360() {
        return this.field3464;
    }

    @ObfuscatedName("ij.i(B)V")
    public static void method4139() {
        field3456.method3604();
    }
}
