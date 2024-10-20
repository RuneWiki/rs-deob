package deob;

@ObfuscatedName("if")
public class class254 extends class206 {

    @ObfuscatedName("if.k")
    public static class201 field3381 = new class201(256);

    @ObfuscatedName("if.u")
    public final int field3396;

    @ObfuscatedName("if.z")
    public int field3383 = -1;

    @ObfuscatedName("if.t")
    public int field3392 = -1;

    @ObfuscatedName("if.f")
    public String field3385;

    @ObfuscatedName("if.g")
    public int field3386;

    @ObfuscatedName("if.j")
    public int field3387 = 0;

    @ObfuscatedName("if.c")
    public String[] field3388 = new String[5];

    @ObfuscatedName("if.s")
    public String field3391;

    @ObfuscatedName("if.n")
    public int[] field3390;

    @ObfuscatedName("if.y")
    public int field3382 = Integer.MAX_VALUE;

    @ObfuscatedName("if.o")
    public int field3398 = Integer.MAX_VALUE;

    @ObfuscatedName("if.r")
    public int field3384 = Integer.MIN_VALUE;

    @ObfuscatedName("if.i")
    public int field3378 = Integer.MIN_VALUE;

    @ObfuscatedName("if.l")
    public class269 field3395 = class269.field3615;

    @ObfuscatedName("if.m")
    public class251 field3389 = class251.field3364;

    @ObfuscatedName("if.q")
    public int[] field3397;

    @ObfuscatedName("if.b")
    public byte[] field3394;

    @ObfuscatedName("if.h")
    public int field3399 = -1;

    public class254(int arg0) {
        this.field3396 = arg0;
    }

    @ObfuscatedName("if.a(Lgh;I)V")
    public void method4065(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4068(arg0, var2);
        }
    }

    @ObfuscatedName("if.w(Lgh;II)V")
    public void method4068(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3383 = arg0.method3073();
        } else if (arg1 == 2) {
            this.field3392 = arg0.method3073();
        } else if (arg1 == 3) {
            this.field3385 = arg0.method3168();
        } else if (arg1 == 4) {
            this.field3386 = arg0.method2966();
        } else if (arg1 == 5) {
            arg0.method2966();
        } else if (arg1 == 6) {
            this.field3387 = arg0.method2962();
        } else if (arg1 == 7) {
            int var3 = arg0.method2962();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2962();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3388[arg1 - 10] = arg0.method3168();
        } else if (arg1 == 15) {
            int var4 = arg0.method2962();
            this.field3390 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3390[var5] = arg0.method2965();
            }
            arg0.method2967();
            int var6 = arg0.method2962();
            this.field3397 = new int[var6];
            for (int var7 = 0; var7 < this.field3397.length; var7++) {
                this.field3397[var7] = arg0.method2967();
            }
            this.field3394 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3394[var8] = arg0.method3015();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3391 = arg0.method3168();
            } else if (arg1 == 18) {
                arg0.method3073();
            } else if (arg1 == 19) {
                this.field3399 = arg0.method3194();
            } else if (arg1 == 21) {
                arg0.method2967();
            } else if (arg1 == 22) {
                arg0.method2967();
            } else if (arg1 == 23) {
                arg0.method2962();
                arg0.method2962();
                arg0.method2962();
            } else if (arg1 == 24) {
                arg0.method2965();
                arg0.method2965();
            } else if (arg1 == 25) {
                arg0.method3073();
            } else if (arg1 == 28) {
                arg0.method2962();
            } else if (arg1 == 29) {
                this.field3395 = (class269) class180.method1581(class269.method978(), arg0.method2962());
            } else if (arg1 == 30) {
                this.field3389 = (class251) class180.method1581(class251.method3894(), arg0.method2962());
            }
        }
    }

    @ObfuscatedName("if.e(S)V")
    public void method4067() {
        if (this.field3390 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3390.length; var1 += 2) {
            if (this.field3390[var1] < this.field3382) {
                this.field3382 = this.field3390[var1];
            } else if (this.field3390[var1] > this.field3384) {
                this.field3384 = this.field3390[var1];
            }
            if (this.field3390[var1 + 1] < this.field3398) {
                this.field3398 = this.field3390[var1 + 1];
            } else if (this.field3390[var1 + 1] > this.field3378) {
                this.field3378 = this.field3390[var1 + 1];
            }
        }
    }

    @ObfuscatedName("if.k(ZS)Lks;")
    public class299 method4077(boolean arg0) {
        int var2 = arg0 ? this.field3392 : this.field3383;
        return this.method4075(var2);
    }

    @ObfuscatedName("if.u(IB)Lks;")
    public class299 method4075(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class299 var2 = (class299) field3381.method3373((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class299 var3 = class300.method2809(Statics.field3393, arg0, 0);
        if (var3 != null) {
            field3381.method3375(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("if.z(B)I")
    public int method4070() {
        return this.field3396;
    }
}
