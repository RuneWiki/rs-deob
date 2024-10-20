package deob;

@ObfuscatedName("jj")
public class class270 extends class219 {

    @ObfuscatedName("jj.a")
    public static class213 field3457 = new class213(256);

    @ObfuscatedName("jj.l")
    public final int field3458;

    @ObfuscatedName("jj.b")
    public int field3459 = -1;

    @ObfuscatedName("jj.e")
    public int field3454 = -1;

    @ObfuscatedName("jj.x")
    public String field3461;

    @ObfuscatedName("jj.p")
    public int field3474;

    @ObfuscatedName("jj.g")
    public int field3463 = 0;

    @ObfuscatedName("jj.o")
    public String[] field3466 = new String[5];

    @ObfuscatedName("jj.c")
    public String field3477;

    @ObfuscatedName("jj.v")
    public int[] field3460;

    @ObfuscatedName("jj.u")
    public int field3468 = Integer.MAX_VALUE;

    @ObfuscatedName("jj.j")
    public int field3462 = Integer.MAX_VALUE;

    @ObfuscatedName("jj.k")
    public int field3469 = Integer.MIN_VALUE;

    @ObfuscatedName("jj.z")
    public int field3470 = Integer.MIN_VALUE;

    @ObfuscatedName("jj.w")
    public class285 field3464 = class285.field3702;

    @ObfuscatedName("jj.s")
    public class267 field3465 = class267.field3440;

    @ObfuscatedName("jj.d")
    public int[] field3473;

    @ObfuscatedName("jj.f")
    public byte[] field3472;

    @ObfuscatedName("jj.r")
    public int field3475 = -1;

    public class270(int arg0) {
        this.field3458 = arg0;
    }

    @ObfuscatedName("jj.t(Lgb;B)V")
    public void method4381(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4390(arg0, var2);
        }
    }

    @ObfuscatedName("jj.q(Lgb;IB)V")
    public void method4390(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3459 = arg0.method3252();
        } else if (arg1 == 2) {
            this.field3454 = arg0.method3252();
        } else if (arg1 == 3) {
            this.field3461 = arg0.method3257();
        } else if (arg1 == 4) {
            this.field3474 = arg0.method3399();
        } else if (arg1 == 5) {
            arg0.method3399();
        } else if (arg1 == 6) {
            this.field3463 = arg0.method3236();
        } else if (arg1 == 7) {
            int var3 = arg0.method3236();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3236();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3466[arg1 - 10] = arg0.method3257();
        } else if (arg1 == 15) {
            int var4 = arg0.method3236();
            this.field3460 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3460[var5] = arg0.method3239();
            }
            arg0.method3241();
            int var6 = arg0.method3236();
            this.field3473 = new int[var6];
            for (int var7 = 0; var7 < this.field3473.length; var7++) {
                this.field3473[var7] = arg0.method3241();
            }
            this.field3472 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3472[var8] = arg0.method3237();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3477 = arg0.method3257();
            } else if (arg1 == 18) {
                arg0.method3252();
            } else if (arg1 == 19) {
                this.field3475 = arg0.method3238();
            } else if (arg1 == 21) {
                arg0.method3241();
            } else if (arg1 == 22) {
                arg0.method3241();
            } else if (arg1 == 23) {
                arg0.method3236();
                arg0.method3236();
                arg0.method3236();
            } else if (arg1 == 24) {
                arg0.method3239();
                arg0.method3239();
            } else if (arg1 == 25) {
                arg0.method3252();
            } else if (arg1 == 28) {
                arg0.method3236();
            } else if (arg1 == 29) {
                this.field3464 = (class285) class190.method241(class285.method4030(), arg0.method3236());
            } else if (arg1 == 30) {
                this.field3465 = (class267) class190.method241(class267.method13(), arg0.method3236());
            }
        }
    }

    @ObfuscatedName("jj.i(I)V")
    public void method4395() {
        if (this.field3460 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3460.length; var1 += 2) {
            if (this.field3460[var1] < this.field3468) {
                this.field3468 = this.field3460[var1];
            } else if (this.field3460[var1] > this.field3469) {
                this.field3469 = this.field3460[var1];
            }
            if (this.field3460[var1 + 1] < this.field3462) {
                this.field3462 = this.field3460[var1 + 1];
            } else if (this.field3460[var1 + 1] > this.field3470) {
                this.field3470 = this.field3460[var1 + 1];
            }
        }
    }

    @ObfuscatedName("jj.a(ZI)Lla;")
    public class332 method4384(boolean arg0) {
        int var2 = arg0 ? this.field3454 : this.field3459;
        return this.method4385(var2);
    }

    @ObfuscatedName("jj.l(II)Lla;")
    public class332 method4385(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class332 var2 = (class332) field3457.method3625((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class332 var3 = class333.method2(Statics.field3467, arg0, 0);
        if (var3 != null) {
            field3457.method3627(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("jj.b(I)I")
    public int method4386() {
        return this.field3458;
    }

    @ObfuscatedName("az.e(B)V")
    public static void method326() {
        field3457.method3632();
    }
}
