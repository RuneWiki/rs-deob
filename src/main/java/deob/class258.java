package deob;

@ObfuscatedName("ic")
public class class258 extends class209 {

    @ObfuscatedName("ic.b")
    public static class203 field3292 = new class203(256);

    @ObfuscatedName("ic.l")
    public final int field3311;

    @ObfuscatedName("ic.w")
    public int field3301 = -1;

    @ObfuscatedName("ic.d")
    public int field3295 = -1;

    @ObfuscatedName("ic.n")
    public String field3296;

    @ObfuscatedName("ic.s")
    public int field3297;

    @ObfuscatedName("ic.g")
    public int field3307 = 0;

    @ObfuscatedName("ic.r")
    public String[] field3293 = new String[5];

    @ObfuscatedName("ic.k")
    public String field3309;

    @ObfuscatedName("ic.m")
    public int[] field3302;

    @ObfuscatedName("ic.q")
    public int field3303 = Integer.MAX_VALUE;

    @ObfuscatedName("ic.x")
    public int field3300 = Integer.MAX_VALUE;

    @ObfuscatedName("ic.u")
    public int field3305 = Integer.MIN_VALUE;

    @ObfuscatedName("ic.o")
    public int field3306 = Integer.MIN_VALUE;

    @ObfuscatedName("ic.t")
    public class273 field3290 = class273.field3538;

    @ObfuscatedName("ic.v")
    public class255 field3298 = class255.field3274;

    @ObfuscatedName("ic.p")
    public int[] field3294;

    @ObfuscatedName("ic.z")
    public byte[] field3310;

    @ObfuscatedName("ic.j")
    public int field3308 = -1;

    public class258(int arg0) {
        this.field3311 = arg0;
    }

    @ObfuscatedName("fd.f(II)Lic;")
    public static class258 method3226(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field368.length || Statics.field368[arg0] == null ? new class258(arg0) : Statics.field368[arg0];
    }

    @ObfuscatedName("ic.h(Lgx;I)V")
    public void method4449(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4450(arg0, var2);
        }
    }

    @ObfuscatedName("ic.e(Lgx;II)V")
    public void method4450(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3301 = arg0.method3340();
        } else if (arg1 == 2) {
            this.field3295 = arg0.method3340();
        } else if (arg1 == 3) {
            this.field3296 = arg0.method3435();
        } else if (arg1 == 4) {
            this.field3297 = arg0.method3327();
        } else if (arg1 == 5) {
            arg0.method3327();
        } else if (arg1 == 6) {
            this.field3307 = arg0.method3323();
        } else if (arg1 == 7) {
            int var3 = arg0.method3323();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3323();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3293[arg1 - 10] = arg0.method3435();
        } else if (arg1 == 15) {
            int var4 = arg0.method3323();
            this.field3302 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3302[var5] = arg0.method3540();
            }
            arg0.method3328();
            int var6 = arg0.method3323();
            this.field3294 = new int[var6];
            for (int var7 = 0; var7 < this.field3294.length; var7++) {
                this.field3294[var7] = arg0.method3328();
            }
            this.field3310 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3310[var8] = arg0.method3324();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3309 = arg0.method3435();
            } else if (arg1 == 18) {
                arg0.method3340();
            } else if (arg1 == 19) {
                this.field3308 = arg0.method3325();
            } else if (arg1 == 21) {
                arg0.method3328();
            } else if (arg1 == 22) {
                arg0.method3328();
            } else if (arg1 == 23) {
                arg0.method3323();
                arg0.method3323();
                arg0.method3323();
            } else if (arg1 == 24) {
                arg0.method3540();
                arg0.method3540();
            } else if (arg1 == 25) {
                arg0.method3340();
            } else if (arg1 == 28) {
                arg0.method3323();
            } else if (arg1 == 29) {
                this.field3290 = (class273) class180.method3213(Statics.method4244(), arg0.method3323());
            } else if (arg1 == 30) {
                class255[] var9 = new class255[] { class255.field3275, class255.field3273, class255.field3274 };
                this.field3298 = (class255) class180.method3213(var9, arg0.method3323());
            }
        }
    }

    @ObfuscatedName("ic.b(I)V")
    public void method4451() {
        if (this.field3302 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3302.length; var1 += 2) {
            if (this.field3302[var1] < this.field3303) {
                this.field3303 = this.field3302[var1];
            } else if (this.field3302[var1] > this.field3305) {
                this.field3305 = this.field3302[var1];
            }
            if (this.field3302[var1 + 1] < this.field3300) {
                this.field3300 = this.field3302[var1 + 1];
            } else if (this.field3302[var1 + 1] > this.field3306) {
                this.field3306 = this.field3302[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ic.l(ZI)Lly;")
    public class324 method4452(boolean arg0) {
        int var2 = arg0 ? this.field3295 : this.field3301;
        return this.method4453(var2);
    }

    @ObfuscatedName("ic.w(II)Lly;")
    public class324 method4453(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class324 var2 = (class324) field3292.method3724((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class324 var3 = class325.method149(Statics.field3304, arg0, 0);
        if (var3 != null) {
            field3292.method3723(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ic.d(I)I")
    public int method4454() {
        return this.field3311;
    }
}
