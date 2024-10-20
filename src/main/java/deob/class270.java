package deob;

@ObfuscatedName("ja")
public class class270 extends class219 {

    @ObfuscatedName("ja.j")
    public static class213 field3452 = new class213(256);

    @ObfuscatedName("ja.k")
    public final int field3453;

    @ObfuscatedName("ja.x")
    public int field3471 = -1;

    @ObfuscatedName("ja.z")
    public int field3455 = -1;

    @ObfuscatedName("ja.p")
    public String field3456;

    @ObfuscatedName("ja.w")
    public int field3460;

    @ObfuscatedName("ja.r")
    public int field3450 = 0;

    @ObfuscatedName("ja.a")
    public String[] field3462 = new String[5];

    @ObfuscatedName("ja.e")
    public String field3461;

    @ObfuscatedName("ja.f")
    public int[] field3454;

    @ObfuscatedName("ja.l")
    public int field3463 = Integer.MAX_VALUE;

    @ObfuscatedName("ja.m")
    public int field3449 = Integer.MAX_VALUE;

    @ObfuscatedName("ja.b")
    public int field3469 = Integer.MIN_VALUE;

    @ObfuscatedName("ja.h")
    public int field3466 = Integer.MIN_VALUE;

    @ObfuscatedName("ja.t")
    public class285 field3467 = class285.field3691;

    @ObfuscatedName("ja.v")
    public class267 field3468 = class267.field3436;

    @ObfuscatedName("ja.n")
    public int[] field3465;

    @ObfuscatedName("ja.u")
    public byte[] field3470;

    @ObfuscatedName("ja.q")
    public int field3464 = -1;

    public class270(int arg0) {
        this.field3453 = arg0;
    }

    @ObfuscatedName("ja.c(Lgp;I)V")
    public void method4378(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4379(arg0, var2);
        }
    }

    @ObfuscatedName("ja.i(Lgp;II)V")
    public void method4379(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3471 = arg0.method3309();
        } else if (arg1 == 2) {
            this.field3455 = arg0.method3309();
        } else if (arg1 == 3) {
            this.field3456 = arg0.method3427();
        } else if (arg1 == 4) {
            this.field3460 = arg0.method3293();
        } else if (arg1 == 5) {
            arg0.method3293();
        } else if (arg1 == 6) {
            this.field3450 = arg0.method3429();
        } else if (arg1 == 7) {
            int var3 = arg0.method3429();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3429();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3462[arg1 - 10] = arg0.method3427();
        } else if (arg1 == 15) {
            int var4 = arg0.method3429();
            this.field3454 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3454[var5] = arg0.method3303();
            }
            arg0.method3230();
            int var6 = arg0.method3429();
            this.field3465 = new int[var6];
            for (int var7 = 0; var7 < this.field3465.length; var7++) {
                this.field3465[var7] = arg0.method3230();
            }
            this.field3470 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3470[var8] = arg0.method3226();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3461 = arg0.method3427();
            } else if (arg1 == 18) {
                arg0.method3309();
            } else if (arg1 == 19) {
                this.field3464 = arg0.method3218();
            } else if (arg1 == 21) {
                arg0.method3230();
            } else if (arg1 == 22) {
                arg0.method3230();
            } else if (arg1 == 23) {
                arg0.method3429();
                arg0.method3429();
                arg0.method3429();
            } else if (arg1 == 24) {
                arg0.method3303();
                arg0.method3303();
            } else if (arg1 == 25) {
                arg0.method3309();
            } else if (arg1 == 28) {
                arg0.method3429();
            } else if (arg1 == 29) {
                this.field3467 = (class285) class190.method578(class285.method1667(), arg0.method3429());
            } else if (arg1 == 30) {
                this.field3468 = (class267) class190.method578(Statics.method4176(), arg0.method3429());
            }
        }
    }

    @ObfuscatedName("ja.o(B)V")
    public void method4383() {
        if (this.field3454 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3454.length; var1 += 2) {
            if (this.field3454[var1] < this.field3463) {
                this.field3463 = this.field3454[var1];
            } else if (this.field3454[var1] > this.field3469) {
                this.field3469 = this.field3454[var1];
            }
            if (this.field3454[var1 + 1] < this.field3449) {
                this.field3449 = this.field3454[var1 + 1];
            } else if (this.field3454[var1 + 1] > this.field3466) {
                this.field3466 = this.field3454[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ja.j(ZI)Lla;")
    public class332 method4380(boolean arg0) {
        int var2 = arg0 ? this.field3455 : this.field3471;
        return this.method4381(var2);
    }

    @ObfuscatedName("ja.k(II)Lla;")
    public class332 method4381(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class332 var2 = (class332) field3452.method3625((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class332 var3 = class333.method5407(Statics.field3457, arg0, 0);
        if (var3 != null) {
            field3452.method3628(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ja.x(I)I")
    public int method4382() {
        return this.field3453;
    }
}
