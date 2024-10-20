package deob;

@ObfuscatedName("jp")
public class class268 extends class207 {

    @ObfuscatedName("jp.l")
    public static class201 field3350 = new class201(64);

    @ObfuscatedName("jp.u")
    public static class201 field3357 = new class201(64);

    @ObfuscatedName("jp.q")
    public static class201 field3352 = new class201(20);

    @ObfuscatedName("jp.b")
    public int field3354 = -1;

    @ObfuscatedName("jp.n")
    public int field3365 = 16777215;

    @ObfuscatedName("jp.f")
    public int field3356 = 70;

    @ObfuscatedName("jp.g")
    public int field3359 = -1;

    @ObfuscatedName("jp.m")
    public int field3358 = -1;

    @ObfuscatedName("jp.r")
    public int field3351 = -1;

    @ObfuscatedName("jp.t")
    public int field3360 = -1;

    @ObfuscatedName("jp.o")
    public int field3366 = 0;

    @ObfuscatedName("jp.y")
    public int field3362 = 0;

    @ObfuscatedName("jp.a")
    public int field3355 = -1;

    @ObfuscatedName("jp.j")
    public String field3364 = "";

    @ObfuscatedName("jp.d")
    public int field3361 = -1;

    @ObfuscatedName("jp.h")
    public int field3348 = 0;

    @ObfuscatedName("jp.c")
    public int[] field3367;

    @ObfuscatedName("jp.v")
    public int field3363 = -1;

    @ObfuscatedName("jp.af")
    public int field3369 = -1;

    @ObfuscatedName("ia.z(Lir;Lir;Lir;I)V")
    public static void method4378(class248 arg0, class248 arg1, class248 arg2) {
        Statics.field3368 = arg0;
        Statics.field3349 = arg1;
        Statics.field1878 = arg2;
    }

    @ObfuscatedName("g.w(IB)Ljp;")
    public static class268 method124(int arg0) {
        class268 var1 = (class268) field3350.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3368.method4247(32, arg0);
        class268 var3 = new class268();
        if (var2 != null) {
            var3.method4599(new class183(var2));
        }
        field3350.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.s(Lgk;B)V")
    public void method4599(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4600(arg0, var2);
        }
    }

    @ObfuscatedName("jp.l(Lgk;IB)V")
    public void method4600(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3354 = arg0.method3249();
        } else if (arg1 == 2) {
            this.field3365 = arg0.method3255();
        } else if (arg1 == 3) {
            this.field3359 = arg0.method3249();
        } else if (arg1 == 4) {
            this.field3351 = arg0.method3249();
        } else if (arg1 == 5) {
            this.field3358 = arg0.method3249();
        } else if (arg1 == 6) {
            this.field3360 = arg0.method3249();
        } else if (arg1 == 7) {
            this.field3366 = arg0.method3254();
        } else if (arg1 == 8) {
            this.field3364 = arg0.method3261();
        } else if (arg1 == 9) {
            this.field3356 = arg0.method3253();
        } else if (arg1 == 10) {
            this.field3362 = arg0.method3254();
        } else if (arg1 == 11) {
            this.field3355 = 0;
        } else if (arg1 == 12) {
            this.field3361 = arg0.method3247();
        } else if (arg1 == 13) {
            this.field3348 = arg0.method3254();
        } else if (arg1 == 14) {
            this.field3355 = arg0.method3253();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3363 = arg0.method3253();
            if (this.field3363 == 65535) {
                this.field3363 = -1;
            }
            this.field3369 = arg0.method3253();
            if (this.field3369 == 65535) {
                this.field3369 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3253();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3247();
            this.field3367 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3367[var5] = arg0.method3253();
                if (this.field3367[var5] == 65535) {
                    this.field3367[var5] = -1;
                }
            }
            this.field3367[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jp.u(I)Ljp;")
    public final class268 method4604() {
        int var1 = -1;
        if (this.field3363 != -1) {
            var1 = class226.method3095(this.field3363);
        } else if (this.field3369 != -1) {
            var1 = class226.field2559[this.field3369];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3367.length - 1) {
            var2 = this.field3367[var1];
        } else {
            var2 = this.field3367[this.field3367.length - 1];
        }
        return var2 == -1 ? null : method124(var2);
    }

    @ObfuscatedName("jp.q(IB)Ljava/lang/String;")
    public String method4623(int arg0) {
        String var2 = this.field3364;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            String var4 = var2.substring(0, var3);
            String var5 = Integer.toString(arg0);
            var2 = var4 + var5 + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jp.i(I)Lll;")
    public class319 method4603() {
        if (this.field3359 < 0) {
            return null;
        }
        class319 var1 = (class319) field3357.method3681((long) this.field3359);
        if (var1 != null) {
            return var1;
        }
        class319 var2 = class320.method4133(Statics.field3349, this.field3359, 0);
        if (var2 != null) {
            field3357.method3675(var2, (long) this.field3359);
        }
        return var2;
    }

    @ObfuscatedName("jp.x(I)Lll;")
    public class319 method4609() {
        if (this.field3358 < 0) {
            return null;
        }
        class319 var1 = (class319) field3357.method3681((long) this.field3358);
        if (var1 != null) {
            return var1;
        }
        class319 var2 = class320.method4133(Statics.field3349, this.field3358, 0);
        if (var2 != null) {
            field3357.method3675(var2, (long) this.field3358);
        }
        return var2;
    }

    @ObfuscatedName("jp.e(B)Lll;")
    public class319 method4605() {
        if (this.field3351 < 0) {
            return null;
        }
        class319 var1 = (class319) field3357.method3681((long) this.field3351);
        if (var1 != null) {
            return var1;
        }
        class319 var2 = class320.method4133(Statics.field3349, this.field3351, 0);
        if (var2 != null) {
            field3357.method3675(var2, (long) this.field3351);
        }
        return var2;
    }

    @ObfuscatedName("jp.p(I)Lll;")
    public class319 method4606() {
        if (this.field3360 < 0) {
            return null;
        }
        class319 var1 = (class319) field3357.method3681((long) this.field3360);
        if (var1 != null) {
            return var1;
        }
        class319 var2 = class320.method4133(Statics.field3349, this.field3360, 0);
        if (var2 != null) {
            field3357.method3675(var2, (long) this.field3360);
        }
        return var2;
    }

    @ObfuscatedName("jp.b(B)Lkj;")
    public class299 method4607() {
        if (this.field3354 == -1) {
            return null;
        }
        class299 var1 = (class299) field3352.method3681((long) this.field3354);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class320.method979(Statics.field3349, Statics.field1878, this.field3354, 0);
        if (var2 != null) {
            field3352.method3675(var2, (long) this.field3354);
        }
        return var2;
    }
}
