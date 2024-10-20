package deob;

@ObfuscatedName("js")
public class class275 extends class215 {

    @ObfuscatedName("js.p")
    public static class210 field3499 = new class210(64);

    @ObfuscatedName("js.a")
    public static class210 field3500 = new class210(64);

    @ObfuscatedName("js.h")
    public static class210 field3501 = new class210(20);

    @ObfuscatedName("js.r")
    public int field3514 = -1;

    @ObfuscatedName("js.d")
    public int field3503 = 16777215;

    @ObfuscatedName("js.v")
    public int field3517 = 70;

    @ObfuscatedName("js.s")
    public int field3505 = -1;

    @ObfuscatedName("js.t")
    public int field3506 = -1;

    @ObfuscatedName("js.f")
    public int field3496 = -1;

    @ObfuscatedName("js.m")
    public int field3508 = -1;

    @ObfuscatedName("js.x")
    public int field3510 = 0;

    @ObfuscatedName("js.w")
    public int field3497 = 0;

    @ObfuscatedName("js.j")
    public int field3511 = -1;

    @ObfuscatedName("js.z")
    public String field3512 = "";

    @ObfuscatedName("js.e")
    public int field3513 = -1;

    @ObfuscatedName("js.k")
    public int field3504 = 0;

    @ObfuscatedName("js.n")
    public int[] field3515;

    @ObfuscatedName("js.i")
    public int field3507 = -1;

    @ObfuscatedName("js.av")
    public int field3509 = -1;

    @ObfuscatedName("cg.b(II)Ljs;")
    public static class275 method1716(int arg0) {
        class275 var1 = (class275) field3499.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3516.method4158(32, arg0);
        class275 var3 = new class275();
        if (var2 != null) {
            var3.method4521(new class194(var2));
        }
        field3499.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("js.q(Lgn;I)V")
    public void method4521(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4549(arg0, var2);
        }
    }

    @ObfuscatedName("js.o(Lgn;II)V")
    public void method4549(class194 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3514 = arg0.method3432();
        } else if (arg1 == 2) {
            this.field3503 = arg0.method3251();
        } else if (arg1 == 3) {
            this.field3505 = arg0.method3432();
        } else if (arg1 == 4) {
            this.field3496 = arg0.method3432();
        } else if (arg1 == 5) {
            this.field3506 = arg0.method3432();
        } else if (arg1 == 6) {
            this.field3508 = arg0.method3432();
        } else if (arg1 == 7) {
            this.field3510 = arg0.method3230();
        } else if (arg1 == 8) {
            this.field3512 = arg0.method3257();
        } else if (arg1 == 9) {
            this.field3517 = arg0.method3249();
        } else if (arg1 == 10) {
            this.field3497 = arg0.method3230();
        } else if (arg1 == 11) {
            this.field3511 = 0;
        } else if (arg1 == 12) {
            this.field3513 = arg0.method3247();
        } else if (arg1 == 13) {
            this.field3504 = arg0.method3230();
        } else if (arg1 == 14) {
            this.field3511 = arg0.method3249();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3507 = arg0.method3249();
            if (this.field3507 == 65535) {
                this.field3507 = -1;
            }
            this.field3509 = arg0.method3249();
            if (this.field3509 == 65535) {
                this.field3509 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3249();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3247();
            this.field3515 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3515[var5] = arg0.method3249();
                if (this.field3515[var5] == 65535) {
                    this.field3515[var5] = -1;
                }
            }
            this.field3515[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("js.p(I)Ljs;")
    public final class275 method4522() {
        int var1 = -1;
        if (this.field3507 != -1) {
            var1 = class232.method248(this.field3507);
        } else if (this.field3509 != -1) {
            var1 = class232.field2740[this.field3509];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3515.length - 1) {
            var2 = this.field3515[var1];
        } else {
            var2 = this.field3515[this.field3515.length - 1];
        }
        return var2 == -1 ? null : method1716(var2);
    }

    @ObfuscatedName("js.a(II)Ljava/lang/String;")
    public String method4523(int arg0) {
        String var2 = this.field3512;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class305.method3503(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("js.h(I)Llm;")
    public class323 method4524() {
        if (this.field3505 < 0) {
            return null;
        }
        class323 var1 = (class323) field3500.method3658((long) this.field3505);
        if (var1 != null) {
            return var1;
        }
        class323 var2 = Statics.method154(Statics.field3502, this.field3505, 0);
        if (var2 != null) {
            field3500.method3659(var2, (long) this.field3505);
        }
        return var2;
    }

    @ObfuscatedName("js.l(I)Llm;")
    public class323 method4541() {
        if (this.field3506 < 0) {
            return null;
        }
        class323 var1 = (class323) field3500.method3658((long) this.field3506);
        if (var1 != null) {
            return var1;
        }
        class323 var2 = Statics.method154(Statics.field3502, this.field3506, 0);
        if (var2 != null) {
            field3500.method3659(var2, (long) this.field3506);
        }
        return var2;
    }

    @ObfuscatedName("js.y(I)Llm;")
    public class323 method4526() {
        if (this.field3496 < 0) {
            return null;
        }
        class323 var1 = (class323) field3500.method3658((long) this.field3496);
        if (var1 != null) {
            return var1;
        }
        class323 var2 = Statics.method154(Statics.field3502, this.field3496, 0);
        if (var2 != null) {
            field3500.method3659(var2, (long) this.field3496);
        }
        return var2;
    }

    @ObfuscatedName("js.g(I)Llm;")
    public class323 method4540() {
        if (this.field3508 < 0) {
            return null;
        }
        class323 var1 = (class323) field3500.method3658((long) this.field3508);
        if (var1 != null) {
            return var1;
        }
        class323 var2 = Statics.method154(Statics.field3502, this.field3508, 0);
        if (var2 != null) {
            field3500.method3659(var2, (long) this.field3508);
        }
        return var2;
    }

    @ObfuscatedName("js.c(I)Lkt;")
    public class298 method4528() {
        if (this.field3514 == -1) {
            return null;
        }
        class298 var1 = (class298) field3501.method3658((long) this.field3514);
        if (var1 != null) {
            return var1;
        }
        class298 var2 = class324.method3084(Statics.field3502, Statics.field3498, this.field3514, 0);
        if (var2 != null) {
            field3501.method3659(var2, (long) this.field3514);
        }
        return var2;
    }

    @ObfuscatedName("fx.u(I)V")
    public static void method3038() {
        field3499.method3661();
        field3500.method3661();
        field3501.method3661();
    }
}
