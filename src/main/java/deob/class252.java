package deob;

@ObfuscatedName("iv")
public class class252 extends class185 {

    @ObfuscatedName("iv.t")
    public static class155 field3239 = new class155(256);

    @ObfuscatedName("iv.i")
    public final int field3240;

    @ObfuscatedName("iv.o")
    public int field3241 = -1;

    @ObfuscatedName("iv.x")
    public int field3242 = -1;

    @ObfuscatedName("iv.w")
    public String field3246;

    @ObfuscatedName("iv.g")
    public int field3244;

    @ObfuscatedName("iv.m")
    public int field3245 = 0;

    @ObfuscatedName("iv.d")
    public String[] field3237 = new String[5];

    @ObfuscatedName("iv.h")
    public String field3247;

    @ObfuscatedName("iv.a")
    public int[] field3248;

    @ObfuscatedName("iv.q")
    public int field3249 = Integer.MAX_VALUE;

    @ObfuscatedName("iv.c")
    public int field3250 = Integer.MAX_VALUE;

    @ObfuscatedName("iv.f")
    public int field3251 = Integer.MIN_VALUE;

    @ObfuscatedName("iv.y")
    public int field3252 = Integer.MIN_VALUE;

    @ObfuscatedName("iv.v")
    public class266 field3255 = class266.field3481;

    @ObfuscatedName("iv.j")
    public class249 field3253 = class249.field3224;

    @ObfuscatedName("iv.r")
    public int[] field3254;

    @ObfuscatedName("iv.u")
    public byte[] field3243;

    @ObfuscatedName("iv.p")
    public int field3257 = -1;

    public class252(int arg0) {
        this.field3240 = arg0;
    }

    @ObfuscatedName("iv.k(Lkf;B)V")
    public void method4082(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4094(arg0, var2);
        }
    }

    @ObfuscatedName("iv.s(Lkf;IB)V")
    public void method4094(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3241 = arg0.method5210();
        } else if (arg1 == 2) {
            this.field3242 = arg0.method5210();
        } else if (arg1 == 3) {
            this.field3246 = arg0.method5202();
        } else if (arg1 == 4) {
            this.field3244 = arg0.method5197();
        } else if (arg1 == 5) {
            arg0.method5197();
        } else if (arg1 == 6) {
            this.field3245 = arg0.method5193();
        } else if (arg1 == 7) {
            int var3 = arg0.method5193();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method5193();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3237[arg1 - 10] = arg0.method5202();
        } else if (arg1 == 15) {
            int var4 = arg0.method5193();
            this.field3248 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3248[var5] = arg0.method5196();
            }
            arg0.method5270();
            int var6 = arg0.method5193();
            this.field3254 = new int[var6];
            for (int var7 = 0; var7 < this.field3254.length; var7++) {
                this.field3254[var7] = arg0.method5270();
            }
            this.field3243 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3243[var8] = arg0.method5194();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3247 = arg0.method5202();
            } else if (arg1 == 18) {
                arg0.method5210();
            } else if (arg1 == 19) {
                this.field3257 = arg0.method5195();
            } else if (arg1 == 21) {
                arg0.method5270();
            } else if (arg1 == 22) {
                arg0.method5270();
            } else if (arg1 == 23) {
                arg0.method5193();
                arg0.method5193();
                arg0.method5193();
            } else if (arg1 == 24) {
                arg0.method5196();
                arg0.method5196();
            } else if (arg1 == 25) {
                arg0.method5210();
            } else if (arg1 == 28) {
                arg0.method5193();
            } else if (arg1 == 29) {
                this.field3255 = (class266) class205.method2633(class266.method3139(), arg0.method5193());
            } else if (arg1 == 30) {
                class249[] var9 = new class249[] { class249.field3224, class249.field3222, class249.field3226 };
                this.field3253 = (class249) class205.method2633(var9, arg0.method5193());
            }
        }
    }

    @ObfuscatedName("iv.t(I)V")
    public void method4085() {
        if (this.field3248 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3248.length; var1 += 2) {
            if (this.field3248[var1] < this.field3249) {
                this.field3249 = this.field3248[var1];
            } else if (this.field3248[var1] > this.field3251) {
                this.field3251 = this.field3248[var1];
            }
            if (this.field3248[var1 + 1] < this.field3250) {
                this.field3250 = this.field3248[var1 + 1];
            } else if (this.field3248[var1 + 1] > this.field3252) {
                this.field3252 = this.field3248[var1 + 1];
            }
        }
    }

    @ObfuscatedName("iv.i(ZI)Llp;")
    public class335 method4089(boolean arg0) {
        int var2 = arg0 ? this.field3242 : this.field3241;
        return this.method4086(var2);
    }

    @ObfuscatedName("iv.o(II)Llp;")
    public class335 method4086(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class335 var2 = (class335) field3239.method3170((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class335 var3 = class336.method4791(Statics.field3256, arg0, 0);
        if (var3 != null) {
            field3239.method3169(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("iv.x(B)I")
    public int method4088() {
        return this.field3240;
    }

    @ObfuscatedName("hv.w(I)V")
    public static void method3720() {
        field3239.method3172();
    }
}
