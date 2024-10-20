package deob;

@ObfuscatedName("jz")
public class class264 extends class185 {

    @ObfuscatedName("jz.c")
    public static class155 field3358 = new class155(64);

    @ObfuscatedName("jz.y")
    public static class155 field3375 = new class155(64);

    @ObfuscatedName("jz.h")
    public static class155 field3360 = new class155(20);

    @ObfuscatedName("jz.b")
    public int field3363 = -1;

    @ObfuscatedName("jz.a")
    public int field3374 = 16777215;

    @ObfuscatedName("jz.w")
    public int field3365 = 70;

    @ObfuscatedName("jz.k")
    public int field3366 = -1;

    @ObfuscatedName("jz.i")
    public int field3367 = -1;

    @ObfuscatedName("jz.x")
    public int field3368 = -1;

    @ObfuscatedName("jz.f")
    public int field3373 = -1;

    @ObfuscatedName("jz.g")
    public int field3379 = 0;

    @ObfuscatedName("jz.u")
    public int field3371 = 0;

    @ObfuscatedName("jz.t")
    public int field3372 = -1;

    @ObfuscatedName("jz.p")
    public String field3359 = "";

    @ObfuscatedName("jz.m")
    public int field3376 = -1;

    @ObfuscatedName("jz.r")
    public int field3369 = 0;

    @ObfuscatedName("jz.o")
    public int[] field3356;

    @ObfuscatedName("jz.j")
    public int field3377 = -1;

    @ObfuscatedName("jz.ay")
    public int field3378 = -1;

    @ObfuscatedName("jp.n(Lig;Lig;Lig;B)V")
    public static void method4339(class245 arg0, class245 arg1, class245 arg2) {
        Statics.field3364 = arg0;
        Statics.field1905 = arg1;
        Statics.field3357 = arg2;
    }

    @ObfuscatedName("bz.v(IB)Ljz;")
    public static class264 method1084(int arg0) {
        class264 var1 = (class264) field3358.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3364.method4032(32, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4365(new class311(var2));
        }
        field3358.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jz.d(Lkx;I)V")
    public void method4365(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4366(arg0, var2);
        }
    }

    @ObfuscatedName("jz.c(Lkx;IB)V")
    public void method4366(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3363 = arg0.method5389();
        } else if (arg1 == 2) {
            this.field3374 = arg0.method5263();
        } else if (arg1 == 3) {
            this.field3366 = arg0.method5389();
        } else if (arg1 == 4) {
            this.field3368 = arg0.method5389();
        } else if (arg1 == 5) {
            this.field3367 = arg0.method5389();
        } else if (arg1 == 6) {
            this.field3373 = arg0.method5389();
        } else if (arg1 == 7) {
            this.field3379 = arg0.method5226();
        } else if (arg1 == 8) {
            this.field3359 = arg0.method5453();
        } else if (arg1 == 9) {
            this.field3365 = arg0.method5247();
        } else if (arg1 == 10) {
            this.field3371 = arg0.method5226();
        } else if (arg1 == 11) {
            this.field3372 = 0;
        } else if (arg1 == 12) {
            this.field3376 = arg0.method5310();
        } else if (arg1 == 13) {
            this.field3369 = arg0.method5226();
        } else if (arg1 == 14) {
            this.field3372 = arg0.method5247();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3377 = arg0.method5247();
            if (this.field3377 == 65535) {
                this.field3377 = -1;
            }
            this.field3378 = arg0.method5247();
            if (this.field3378 == 65535) {
                this.field3378 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5247();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5310();
            this.field3356 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3356[var5] = arg0.method5247();
                if (this.field3356[var5] == 65535) {
                    this.field3356[var5] = -1;
                }
            }
            this.field3356[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jz.y(I)Ljz;")
    public final class264 method4367() {
        int var1 = -1;
        if (this.field3377 != -1) {
            var1 = class222.method5065(this.field3377);
        } else if (this.field3378 != -1) {
            var1 = class222.field2556[this.field3378];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3356.length - 1) {
            var2 = this.field3356[var1];
        } else {
            var2 = this.field3356[this.field3356.length - 1];
        }
        return var2 == -1 ? null : method1084(var2);
    }

    @ObfuscatedName("jz.h(II)Ljava/lang/String;")
    public String method4401(int arg0) {
        String var2 = this.field3359;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class302.method1241(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jz.z(I)Llm;")
    public class336 method4369() {
        if (this.field3366 < 0) {
            return null;
        }
        class336 var1 = (class336) field3375.method3220((long) this.field3366);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method5613(Statics.field1905, this.field3366, 0);
        if (var2 != null) {
            field3375.method3217(var2, (long) this.field3366);
        }
        return var2;
    }

    @ObfuscatedName("jz.e(B)Llm;")
    public class336 method4375() {
        if (this.field3367 < 0) {
            return null;
        }
        class336 var1 = (class336) field3375.method3220((long) this.field3367);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method5613(Statics.field1905, this.field3367, 0);
        if (var2 != null) {
            field3375.method3217(var2, (long) this.field3367);
        }
        return var2;
    }

    @ObfuscatedName("jz.q(I)Llm;")
    public class336 method4374() {
        if (this.field3368 < 0) {
            return null;
        }
        class336 var1 = (class336) field3375.method3220((long) this.field3368);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method5613(Statics.field1905, this.field3368, 0);
        if (var2 != null) {
            field3375.method3217(var2, (long) this.field3368);
        }
        return var2;
    }

    @ObfuscatedName("jz.l(I)Llm;")
    public class336 method4371() {
        if (this.field3373 < 0) {
            return null;
        }
        class336 var1 = (class336) field3375.method3220((long) this.field3373);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method5613(Statics.field1905, this.field3373, 0);
        if (var2 != null) {
            field3375.method3217(var2, (long) this.field3373);
        }
        return var2;
    }

    @ObfuscatedName("jz.s(I)Lkl;")
    public class306 method4372() {
        if (this.field3363 == -1) {
            return null;
        }
        class306 var1 = (class306) field3360.method3220((long) this.field3363);
        if (var1 != null) {
            return var1;
        }
        class245 var2 = Statics.field1905;
        class245 var3 = Statics.field3357;
        int var4 = this.field3363;
        byte[] var5 = var2.method4032(var4, 0);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            class337.method190(var5);
            var6 = true;
        }
        class306 var7;
        if (var6) {
            byte[] var8 = var3.method4032(var4, 0);
            class306 var9;
            if (var8 == null) {
                var9 = null;
            } else {
                class306 var10 = new class306(var8, Statics.field1342, Statics.field3925, Statics.field3926, Statics.field2580, Statics.field3496, Statics.field15);
                Statics.field1342 = null;
                Statics.field3925 = null;
                Statics.field3926 = null;
                Statics.field2580 = null;
                Statics.field3496 = null;
                Statics.field15 = (byte[][]) null;
                var9 = var10;
            }
            var7 = var9;
        } else {
            var7 = null;
        }
        if (var7 != null) {
            field3360.method3217(var7, (long) this.field3363);
        }
        return var7;
    }

    @ObfuscatedName("bi.b(I)V")
    public static void method775() {
        field3358.method3218();
        field3375.method3218();
        field3360.method3218();
    }
}
