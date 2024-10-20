package deob;

@ObfuscatedName("jy")
public class class262 extends class214 {

    @ObfuscatedName("jy.g")
    public static class208 field3311 = new class208(256);

    @ObfuscatedName("jy.b")
    public final int field3312;

    @ObfuscatedName("jy.a")
    public int field3313 = -1;

    @ObfuscatedName("jy.c")
    public int field3314 = -1;

    @ObfuscatedName("jy.z")
    public String field3315;

    @ObfuscatedName("jy.j")
    public int field3320;

    @ObfuscatedName("jy.d")
    public int field3317 = 0;

    @ObfuscatedName("jy.f")
    public String[] field3330 = new String[5];

    @ObfuscatedName("jy.i")
    public String field3319;

    @ObfuscatedName("jy.m")
    public int[] field3322;

    @ObfuscatedName("jy.v")
    public int field3318 = Integer.MAX_VALUE;

    @ObfuscatedName("jy.r")
    public int field3308 = Integer.MAX_VALUE;

    @ObfuscatedName("jy.x")
    public int field3316 = Integer.MIN_VALUE;

    @ObfuscatedName("jy.y")
    public int field3324 = Integer.MIN_VALUE;

    @ObfuscatedName("jy.p")
    public class276 field3325 = class276.field3545;

    @ObfuscatedName("jy.k")
    public class259 field3323 = class259.field3290;

    @ObfuscatedName("jy.o")
    public int[] field3327;

    @ObfuscatedName("jy.s")
    public byte[] field3328;

    @ObfuscatedName("jy.u")
    public int field3329 = -1;

    public class262(int arg0) {
        this.field3312 = arg0;
    }

    @ObfuscatedName("d.n(II)Ljy;")
    public static class262 method106(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3309.length || Statics.field3309[arg0] == null ? new class262(arg0) : Statics.field3309[arg0];
    }

    @ObfuscatedName("jy.h(Lgc;I)V")
    public void method4653(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4669(arg0, var2);
        }
    }

    @ObfuscatedName("jy.l(Lgc;IB)V")
    public void method4669(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3313 = arg0.method3516();
        } else if (arg1 == 2) {
            this.field3314 = arg0.method3516();
        } else if (arg1 == 3) {
            this.field3315 = arg0.method3520();
        } else if (arg1 == 4) {
            this.field3320 = arg0.method3515();
        } else if (arg1 == 5) {
            arg0.method3515();
        } else if (arg1 == 6) {
            this.field3317 = arg0.method3511();
        } else if (arg1 == 7) {
            int var3 = arg0.method3511();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3511();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3330[arg1 - 10] = arg0.method3520();
        } else if (arg1 == 15) {
            int var4 = arg0.method3511();
            this.field3322 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3322[var5] = arg0.method3514();
            }
            arg0.method3562();
            int var6 = arg0.method3511();
            this.field3327 = new int[var6];
            for (int var7 = 0; var7 < this.field3327.length; var7++) {
                this.field3327[var7] = arg0.method3562();
            }
            this.field3328 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3328[var8] = arg0.method3512();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3319 = arg0.method3520();
            } else if (arg1 == 18) {
                arg0.method3516();
            } else if (arg1 == 19) {
                this.field3329 = arg0.method3513();
            } else if (arg1 == 21) {
                arg0.method3562();
            } else if (arg1 == 22) {
                arg0.method3562();
            } else if (arg1 == 23) {
                arg0.method3511();
                arg0.method3511();
                arg0.method3511();
            } else if (arg1 == 24) {
                arg0.method3514();
                arg0.method3514();
            } else if (arg1 == 25) {
                arg0.method3516();
            } else if (arg1 == 28) {
                arg0.method3511();
            } else if (arg1 == 29) {
                class276[] var9 = new class276[] { class276.field3546, class276.field3544, class276.field3545 };
                this.field3325 = (class276) class185.method3726(var9, arg0.method3511());
            } else if (arg1 == 30) {
                this.field3323 = (class259) class185.method3726(Statics.method3070(), arg0.method3511());
            }
        }
    }

    @ObfuscatedName("jy.g(I)V")
    public void method4674() {
        if (this.field3322 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3322.length; var1 += 2) {
            if (this.field3322[var1] < this.field3318) {
                this.field3318 = this.field3322[var1];
            } else if (this.field3322[var1] > this.field3316) {
                this.field3316 = this.field3322[var1];
            }
            if (this.field3322[var1 + 1] < this.field3308) {
                this.field3308 = this.field3322[var1 + 1];
            } else if (this.field3322[var1 + 1] > this.field3324) {
                this.field3324 = this.field3322[var1 + 1];
            }
        }
    }

    @ObfuscatedName("jy.b(ZI)Llu;")
    public class327 method4655(boolean arg0) {
        int var2 = arg0 ? this.field3314 : this.field3313;
        return this.method4656(var2);
    }

    @ObfuscatedName("jy.a(II)Llu;")
    public class327 method4656(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class327 var2 = (class327) field3311.method3902((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class327 var3 = class328.method1038(Statics.field3321, arg0, 0);
        if (var3 != null) {
            field3311.method3908(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("jy.c(I)I")
    public int method4657() {
        return this.field3312;
    }
}
