package deob;

@ObfuscatedName("id")
public class class255 extends class195 {

    @ObfuscatedName("id.u")
    public static class190 field3402 = new class190(64);

    @ObfuscatedName("id.g")
    public static class190 field3401 = new class190(64);

    @ObfuscatedName("id.m")
    public static class190 field3403 = new class190(20);

    @ObfuscatedName("id.w")
    public int field3395 = -1;

    @ObfuscatedName("id.v")
    public int field3410 = 16777215;

    @ObfuscatedName("id.h")
    public int field3397 = 70;

    @ObfuscatedName("id.t")
    public int field3398 = -1;

    @ObfuscatedName("id.a")
    public int field3399 = -1;

    @ObfuscatedName("id.e")
    public int field3400 = -1;

    @ObfuscatedName("id.y")
    public int field3387 = -1;

    @ObfuscatedName("id.l")
    public int field3396 = 0;

    @ObfuscatedName("id.q")
    public int field3392 = 0;

    @ObfuscatedName("id.f")
    public int field3404 = -1;

    @ObfuscatedName("id.j")
    public String field3405 = "";

    @ObfuscatedName("id.n")
    public int field3388 = -1;

    @ObfuscatedName("id.z")
    public int field3407 = 0;

    @ObfuscatedName("id.b")
    public int[] field3408;

    @ObfuscatedName("id.d")
    public int field3409 = -1;

    @ObfuscatedName("id.ap")
    public int field3391 = -1;

    @ObfuscatedName("j.c(Lip;Lip;Lip;I)V")
    public static void method144(class236 arg0, class236 arg1, class236 arg2) {
        Statics.field3390 = arg0;
        Statics.field3406 = arg1;
        Statics.field3389 = arg2;
    }

    @ObfuscatedName("fs.o(IB)Lid;")
    public static class255 method2842(int arg0) {
        class255 var1 = (class255) field3402.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3390.method3741(32, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4063(new class174(var2));
        }
        field3402.method3233(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.i(Lfp;I)V")
    public void method4063(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method4052(arg0, var2);
        }
    }

    @ObfuscatedName("id.u(Lfp;II)V")
    public void method4052(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3395 = arg0.method3030();
        } else if (arg1 == 2) {
            this.field3410 = arg0.method2994();
        } else if (arg1 == 3) {
            this.field3398 = arg0.method3030();
        } else if (arg1 == 4) {
            this.field3400 = arg0.method3030();
        } else if (arg1 == 5) {
            this.field3399 = arg0.method3030();
        } else if (arg1 == 6) {
            this.field3387 = arg0.method3030();
        } else if (arg1 == 7) {
            this.field3396 = arg0.method3061();
        } else if (arg1 == 8) {
            this.field3405 = arg0.method2974();
        } else if (arg1 == 9) {
            this.field3397 = arg0.method2861();
        } else if (arg1 == 10) {
            this.field3392 = arg0.method3061();
        } else if (arg1 == 11) {
            this.field3404 = 0;
        } else if (arg1 == 12) {
            this.field3388 = arg0.method2843();
        } else if (arg1 == 13) {
            this.field3407 = arg0.method3061();
        } else if (arg1 == 14) {
            this.field3404 = arg0.method2861();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3409 = arg0.method2861();
            if (this.field3409 == 65535) {
                this.field3409 = -1;
            }
            this.field3391 = arg0.method2861();
            if (this.field3391 == 65535) {
                this.field3391 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2861();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2843();
            this.field3408 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3408[var5] = arg0.method2861();
                if (this.field3408[var5] == 65535) {
                    this.field3408[var5] = -1;
                }
            }
            this.field3408[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("id.g(I)Lid;")
    public final class255 method4082() {
        int var1 = -1;
        if (this.field3409 != -1) {
            var1 = class212.method117(this.field3409);
        } else if (this.field3391 != -1) {
            var1 = class212.field2573[this.field3391];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3408.length - 1) {
            var2 = this.field3408[var1];
        } else {
            var2 = this.field3408[this.field3408.length - 1];
        }
        return var2 == -1 ? null : method2842(var2);
    }

    @ObfuscatedName("id.m(II)Ljava/lang/String;")
    public String method4056(int arg0) {
        String var2 = this.field3405;
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

    @ObfuscatedName("id.s(I)Ljj;")
    public class286 method4057() {
        if (this.field3398 < 0) {
            return null;
        }
        class286 var1 = (class286) field3401.method3220((long) this.field3398);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4240(Statics.field3406, this.field3398, 0);
        if (var2 != null) {
            field3401.method3233(var2, (long) this.field3398);
        }
        return var2;
    }

    @ObfuscatedName("id.x(I)Ljj;")
    public class286 method4053() {
        if (this.field3399 < 0) {
            return null;
        }
        class286 var1 = (class286) field3401.method3220((long) this.field3399);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4240(Statics.field3406, this.field3399, 0);
        if (var2 != null) {
            field3401.method3233(var2, (long) this.field3399);
        }
        return var2;
    }

    @ObfuscatedName("id.p(I)Ljj;")
    public class286 method4058() {
        if (this.field3400 < 0) {
            return null;
        }
        class286 var1 = (class286) field3401.method3220((long) this.field3400);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4240(Statics.field3406, this.field3400, 0);
        if (var2 != null) {
            field3401.method3233(var2, (long) this.field3400);
        }
        return var2;
    }

    @ObfuscatedName("id.k(I)Ljj;")
    public class286 method4059() {
        if (this.field3387 < 0) {
            return null;
        }
        class286 var1 = (class286) field3401.method3220((long) this.field3387);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4240(Statics.field3406, this.field3387, 0);
        if (var2 != null) {
            field3401.method3233(var2, (long) this.field3387);
        }
        return var2;
    }

    @ObfuscatedName("id.r(B)Ljt;")
    public class264 method4060() {
        if (this.field3395 == -1) {
            return null;
        }
        class264 var1 = (class264) field3403.method3220((long) this.field3395);
        if (var1 != null) {
            return var1;
        }
        class264 var2 = class287.method4090(Statics.field3406, Statics.field3389, this.field3395, 0);
        if (var2 != null) {
            field3403.method3233(var2, (long) this.field3395);
        }
        return var2;
    }

    @ObfuscatedName("fh.w(I)V")
    public static void method2760() {
        field3402.method3223();
        field3401.method3223();
        field3403.method3223();
    }
}
