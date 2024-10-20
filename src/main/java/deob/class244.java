package deob;

@ObfuscatedName("ig")
public class class244 extends class196 {

    @ObfuscatedName("ig.r")
    public static class191 field3296 = new class191(256);

    @ObfuscatedName("ig.o")
    public final int field3297;

    @ObfuscatedName("ig.n")
    public int field3298 = -1;

    @ObfuscatedName("ig.q")
    public int field3299 = -1;

    @ObfuscatedName("ig.b")
    public String field3300;

    @ObfuscatedName("ig.k")
    public int field3301;

    @ObfuscatedName("ig.s")
    public int field3302 = 0;

    @ObfuscatedName("ig.l")
    public String[] field3303 = new String[5];

    @ObfuscatedName("ig.t")
    public String field3304;

    @ObfuscatedName("ig.y")
    public int[] field3294;

    @ObfuscatedName("ig.v")
    public int field3306 = Integer.MAX_VALUE;

    @ObfuscatedName("ig.c")
    public int field3307 = Integer.MAX_VALUE;

    @ObfuscatedName("ig.z")
    public int field3308 = Integer.MIN_VALUE;

    @ObfuscatedName("ig.u")
    public int field3309 = Integer.MIN_VALUE;

    @ObfuscatedName("ig.e")
    public class259 field3310 = class259.field3541;

    @ObfuscatedName("ig.p")
    public class241 field3313 = class241.field3278;

    @ObfuscatedName("ig.m")
    public int[] field3312;

    @ObfuscatedName("ig.x")
    public byte[] field3305;

    @ObfuscatedName("ig.h")
    public int field3314 = -1;

    public class244(int arg0) {
        this.field3297 = arg0;
    }

    @ObfuscatedName("ig.i(Lfp;I)V")
    public void method3969(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method3978(arg0, var2);
        }
    }

    @ObfuscatedName("ig.j(Lfp;IB)V")
    public void method3978(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3298 = arg0.method3009();
        } else if (arg1 == 2) {
            this.field3299 = arg0.method3009();
        } else if (arg1 == 3) {
            this.field3300 = arg0.method3002();
        } else if (arg1 == 4) {
            this.field3301 = arg0.method2997();
        } else if (arg1 == 5) {
            arg0.method2997();
        } else if (arg1 == 6) {
            this.field3302 = arg0.method2999();
        } else if (arg1 == 7) {
            int var3 = arg0.method2999();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2999();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3303[arg1 - 10] = arg0.method3002();
        } else if (arg1 == 15) {
            int var4 = arg0.method2999();
            this.field3294 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3294[var5] = arg0.method2996();
            }
            arg0.method2998();
            int var6 = arg0.method2999();
            this.field3312 = new int[var6];
            for (int var7 = 0; var7 < this.field3312.length; var7++) {
                this.field3312[var7] = arg0.method2998();
            }
            this.field3305 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3305[var8] = arg0.method3172();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3304 = arg0.method3002();
            } else if (arg1 == 18) {
                arg0.method3009();
            } else if (arg1 == 19) {
                this.field3314 = arg0.method2995();
            } else if (arg1 == 21) {
                arg0.method2998();
            } else if (arg1 == 22) {
                arg0.method2998();
            } else if (arg1 == 23) {
                arg0.method2999();
                arg0.method2999();
                arg0.method2999();
            } else if (arg1 == 24) {
                arg0.method2996();
                arg0.method2996();
            } else if (arg1 == 25) {
                arg0.method3009();
            } else if (arg1 == 28) {
                arg0.method2999();
            } else if (arg1 == 29) {
                class259[] var9 = new class259[] { class259.field3542, class259.field3540, class259.field3541 };
                this.field3310 = (class259) class170.method1570(var9, arg0.method2999());
            } else if (arg1 == 30) {
                class241[] var10 = new class241[] { class241.field3276, class241.field3279, class241.field3278 };
                this.field3313 = (class241) class170.method1570(var10, arg0.method2999());
            }
        }
    }

    @ObfuscatedName("ig.a(I)V")
    public void method3985() {
        if (this.field3294 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3294.length; var1 += 2) {
            if (this.field3294[var1] < this.field3306) {
                this.field3306 = this.field3294[var1];
            } else if (this.field3294[var1] > this.field3308) {
                this.field3308 = this.field3294[var1];
            }
            if (this.field3294[var1 + 1] < this.field3307) {
                this.field3307 = this.field3294[var1 + 1];
            } else if (this.field3294[var1 + 1] > this.field3309) {
                this.field3309 = this.field3294[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ig.r(ZS)Lkd;")
    public class287 method3980(boolean arg0) {
        int var2 = arg0 ? this.field3299 : this.field3298;
        return this.method3972(var2);
    }

    @ObfuscatedName("ig.o(II)Lkd;")
    public class287 method3972(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class287 var2 = (class287) field3296.method3347((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class287 var3 = class288.method4185(Statics.field3311, arg0, 0);
        if (var3 != null) {
            field3296.method3346(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ig.n(I)I")
    public int method3973() {
        return this.field3297;
    }
}
