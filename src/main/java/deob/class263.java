package deob;

@ObfuscatedName("jz")
public class class263 extends class215 {

    @ObfuscatedName("jz.p")
    public static class210 field3392 = new class210(256);

    @ObfuscatedName("jz.a")
    public final int field3407;

    @ObfuscatedName("jz.h")
    public int field3394 = -1;

    @ObfuscatedName("jz.l")
    public int field3411 = -1;

    @ObfuscatedName("jz.y")
    public String field3396;

    @ObfuscatedName("jz.g")
    public int field3397;

    @ObfuscatedName("jz.c")
    public int field3400 = 0;

    @ObfuscatedName("jz.r")
    public String[] field3390 = new String[5];

    @ObfuscatedName("jz.d")
    public String field3401;

    @ObfuscatedName("jz.v")
    public int[] field3402;

    @ObfuscatedName("jz.s")
    public int field3403 = Integer.MAX_VALUE;

    @ObfuscatedName("jz.t")
    public int field3404 = Integer.MAX_VALUE;

    @ObfuscatedName("jz.f")
    public int field3405 = Integer.MIN_VALUE;

    @ObfuscatedName("jz.m")
    public int field3406 = Integer.MIN_VALUE;

    @ObfuscatedName("jz.x")
    public class278 field3391 = class278.field3628;

    @ObfuscatedName("jz.w")
    public class260 field3408 = class260.field3381;

    @ObfuscatedName("jz.j")
    public int[] field3393;

    @ObfuscatedName("jz.z")
    public byte[] field3410;

    @ObfuscatedName("jz.e")
    public int field3398 = -1;

    public class263(int arg0) {
        this.field3407 = arg0;
    }

    @ObfuscatedName("fp.b(Lie;Lie;I)Z")
    public static boolean method3082(class256 arg0, class256 arg1) {
        Statics.field3395 = arg1;
        if (!arg0.method4191()) {
            return false;
        }
        Statics.field3409 = arg0.method4172(35);
        Statics.field4025 = new class263[Statics.field3409];
        for (int var2 = 0; var2 < Statics.field3409; var2++) {
            byte[] var3 = arg0.method4158(35, var2);
            if (var3 != null) {
                Statics.field4025[var2] = new class263(var2);
                Statics.field4025[var2].method4353(new class194(var3));
                Statics.field4025[var2].method4341();
            }
        }
        return true;
    }

    @ObfuscatedName("jz.q(Lgn;B)V")
    public void method4353(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4340(arg0, var2);
        }
    }

    @ObfuscatedName("jz.o(Lgn;II)V")
    public void method4340(class194 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3394 = arg0.method3432();
        } else if (arg1 == 2) {
            this.field3411 = arg0.method3432();
        } else if (arg1 == 3) {
            this.field3396 = arg0.method3256();
        } else if (arg1 == 4) {
            this.field3397 = arg0.method3251();
        } else if (arg1 == 5) {
            arg0.method3251();
        } else if (arg1 == 6) {
            this.field3400 = arg0.method3247();
        } else if (arg1 == 7) {
            int var3 = arg0.method3247();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3247();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3390[arg1 - 10] = arg0.method3256();
        } else if (arg1 == 15) {
            int var4 = arg0.method3247();
            this.field3402 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3402[var5] = arg0.method3230();
            }
            arg0.method3261();
            int var6 = arg0.method3247();
            this.field3393 = new int[var6];
            for (int var7 = 0; var7 < this.field3393.length; var7++) {
                this.field3393[var7] = arg0.method3261();
            }
            this.field3410 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3410[var8] = arg0.method3248();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3401 = arg0.method3256();
            } else if (arg1 == 18) {
                arg0.method3432();
            } else if (arg1 == 19) {
                this.field3398 = arg0.method3249();
            } else if (arg1 == 21) {
                arg0.method3261();
            } else if (arg1 == 22) {
                arg0.method3261();
            } else if (arg1 == 23) {
                arg0.method3247();
                arg0.method3247();
                arg0.method3247();
            } else if (arg1 == 24) {
                arg0.method3230();
                arg0.method3230();
            } else if (arg1 == 25) {
                arg0.method3432();
            } else if (arg1 == 28) {
                arg0.method3247();
            } else if (arg1 == 29) {
                class278[] var9 = new class278[] { class278.field3625, class278.field3628, class278.field3626 };
                this.field3391 = (class278) class189.method2486(var9, arg0.method3247());
            } else if (arg1 == 30) {
                this.field3408 = (class260) class189.method2486(class260.method1030(), arg0.method3247());
            }
        }
    }

    @ObfuscatedName("jz.p(B)V")
    public void method4341() {
        if (this.field3402 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3402.length; var1 += 2) {
            if (this.field3402[var1] < this.field3403) {
                this.field3403 = this.field3402[var1];
            } else if (this.field3402[var1] > this.field3405) {
                this.field3405 = this.field3402[var1];
            }
            if (this.field3402[var1 + 1] < this.field3404) {
                this.field3404 = this.field3402[var1 + 1];
            } else if (this.field3402[var1 + 1] > this.field3406) {
                this.field3406 = this.field3402[var1 + 1];
            }
        }
    }

    @ObfuscatedName("jz.a(ZB)Llm;")
    public class323 method4342(boolean arg0) {
        int var2 = arg0 ? this.field3411 : this.field3394;
        return this.method4365(var2);
    }

    @ObfuscatedName("jz.h(II)Llm;")
    public class323 method4365(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class323 var2 = (class323) field3392.method3658((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class323 var3 = Statics.method154(Statics.field3395, arg0, 0);
        if (var3 != null) {
            field3392.method3659(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("jz.l(I)I")
    public int method4344() {
        return this.field3407;
    }

    @ObfuscatedName("en.y(S)V")
    public static void method2833() {
        field3392.method3661();
    }
}
