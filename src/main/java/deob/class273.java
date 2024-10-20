package deob;

@ObfuscatedName("jq")
public class class273 extends class214 {

    @ObfuscatedName("jq.g")
    public static class208 field3429 = new class208(64);

    @ObfuscatedName("jq.b")
    public static class208 field3421 = new class208(64);

    @ObfuscatedName("jq.a")
    public static class208 field3434 = new class208(20);

    @ObfuscatedName("jq.f")
    public int field3424 = -1;

    @ObfuscatedName("jq.i")
    public int field3425 = 16777215;

    @ObfuscatedName("jq.m")
    public int field3426 = 70;

    @ObfuscatedName("jq.v")
    public int field3427 = -1;

    @ObfuscatedName("jq.r")
    public int field3428 = -1;

    @ObfuscatedName("jq.x")
    public int field3423 = -1;

    @ObfuscatedName("jq.y")
    public int field3430 = -1;

    @ObfuscatedName("jq.p")
    public int field3431 = 0;

    @ObfuscatedName("jq.k")
    public int field3432 = 0;

    @ObfuscatedName("jq.o")
    public int field3433 = -1;

    @ObfuscatedName("jq.s")
    public String field3420 = "";

    @ObfuscatedName("jq.u")
    public int field3438 = -1;

    @ObfuscatedName("jq.e")
    public int field3436 = 0;

    @ObfuscatedName("jq.w")
    public int[] field3422;

    @ObfuscatedName("jq.q")
    public int field3418 = -1;

    @ObfuscatedName("jq.aa")
    public int field3439 = -1;

    @ObfuscatedName("hn.n(II)Ljq;")
    public static class273 method4290(int arg0) {
        class273 var1 = (class273) field3429.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3437.method4494(32, arg0);
        class273 var3 = new class273();
        if (var2 != null) {
            var3.method4828(new class190(var2));
        }
        field3429.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.h(Lgc;I)V")
    public void method4828(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4843(arg0, var2);
        }
    }

    @ObfuscatedName("jq.l(Lgc;II)V")
    public void method4843(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3424 = arg0.method3516();
        } else if (arg1 == 2) {
            this.field3425 = arg0.method3515();
        } else if (arg1 == 3) {
            this.field3427 = arg0.method3516();
        } else if (arg1 == 4) {
            this.field3423 = arg0.method3516();
        } else if (arg1 == 5) {
            this.field3428 = arg0.method3516();
        } else if (arg1 == 6) {
            this.field3430 = arg0.method3516();
        } else if (arg1 == 7) {
            this.field3431 = arg0.method3514();
        } else if (arg1 == 8) {
            this.field3420 = arg0.method3659();
        } else if (arg1 == 9) {
            this.field3426 = arg0.method3513();
        } else if (arg1 == 10) {
            this.field3432 = arg0.method3514();
        } else if (arg1 == 11) {
            this.field3433 = 0;
        } else if (arg1 == 12) {
            this.field3438 = arg0.method3511();
        } else if (arg1 == 13) {
            this.field3436 = arg0.method3514();
        } else if (arg1 == 14) {
            this.field3433 = arg0.method3513();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3418 = arg0.method3513();
            if (this.field3418 == 65535) {
                this.field3418 = -1;
            }
            this.field3439 = arg0.method3513();
            if (this.field3439 == 65535) {
                this.field3439 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3513();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3511();
            this.field3422 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3422[var5] = arg0.method3513();
                if (this.field3422[var5] == 65535) {
                    this.field3422[var5] = -1;
                }
            }
            this.field3422[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jq.g(B)Ljq;")
    public final class273 method4830() {
        int var1 = -1;
        if (this.field3418 != -1) {
            var1 = class233.method4441(this.field3418);
        } else if (this.field3439 != -1) {
            var1 = class233.field2632[this.field3439];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3422.length - 1) {
            var2 = this.field3422[var1];
        } else {
            var2 = this.field3422[this.field3422.length - 1];
        }
        return var2 == -1 ? null : method4290(var2);
    }

    @ObfuscatedName("jq.b(II)Ljava/lang/String;")
    public String method4831(int arg0) {
        String var2 = this.field3420;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + Statics.method3137(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jq.a(I)Llu;")
    public class327 method4832() {
        if (this.field3427 < 0) {
            return null;
        }
        class327 var1 = (class327) field3421.method3902((long) this.field3427);
        if (var1 != null) {
            return var1;
        }
        class327 var2 = class328.method1038(Statics.field3419, this.field3427, 0);
        if (var2 != null) {
            field3421.method3908(var2, (long) this.field3427);
        }
        return var2;
    }

    @ObfuscatedName("jq.c(I)Llu;")
    public class327 method4848() {
        if (this.field3428 < 0) {
            return null;
        }
        class327 var1 = (class327) field3421.method3902((long) this.field3428);
        if (var1 != null) {
            return var1;
        }
        class327 var2 = class328.method1038(Statics.field3419, this.field3428, 0);
        if (var2 != null) {
            field3421.method3908(var2, (long) this.field3428);
        }
        return var2;
    }

    @ObfuscatedName("jq.z(B)Llu;")
    public class327 method4834() {
        if (this.field3423 < 0) {
            return null;
        }
        class327 var1 = (class327) field3421.method3902((long) this.field3423);
        if (var1 != null) {
            return var1;
        }
        class327 var2 = class328.method1038(Statics.field3419, this.field3423, 0);
        if (var2 != null) {
            field3421.method3908(var2, (long) this.field3423);
        }
        return var2;
    }

    @ObfuscatedName("jq.j(B)Llu;")
    public class327 method4835() {
        if (this.field3430 < 0) {
            return null;
        }
        class327 var1 = (class327) field3421.method3902((long) this.field3430);
        if (var1 != null) {
            return var1;
        }
        class327 var2 = class328.method1038(Statics.field3419, this.field3430, 0);
        if (var2 != null) {
            field3421.method3908(var2, (long) this.field3430);
        }
        return var2;
    }

    @ObfuscatedName("jq.d(I)Lkf;")
    public class304 method4836() {
        if (this.field3424 == -1) {
            return null;
        }
        class304 var1 = (class304) field3434.method3902((long) this.field3424);
        if (var1 != null) {
            return var1;
        }
        class304 var2 = class328.method1720(Statics.field3419, Statics.field1856, this.field3424, 0);
        if (var2 != null) {
            field3434.method3908(var2, (long) this.field3424);
        }
        return var2;
    }

    @ObfuscatedName("ei.i(I)V")
    public static void method3150() {
        field3429.method3899();
        field3421.method3899();
        field3434.method3899();
    }
}
