package deob;

@ObfuscatedName("jx")
public class class264 extends class185 {

    @ObfuscatedName("jx.m")
    public static class155 field3353 = new class155(64);

    @ObfuscatedName("jx.z")
    public static class155 field3354 = new class155(64);

    @ObfuscatedName("jx.q")
    public static class155 field3355 = new class155(20);

    @ObfuscatedName("jx.o")
    public int field3372 = -1;

    @ObfuscatedName("jx.n")
    public int field3359 = 16777215;

    @ObfuscatedName("jx.x")
    public int field3371 = 70;

    @ObfuscatedName("jx.p")
    public int field3361 = -1;

    @ObfuscatedName("jx.r")
    public int field3350 = -1;

    @ObfuscatedName("jx.y")
    public int field3363 = -1;

    @ObfuscatedName("jx.s")
    public int field3364 = -1;

    @ObfuscatedName("jx.j")
    public int field3365 = 0;

    @ObfuscatedName("jx.w")
    public int field3366 = 0;

    @ObfuscatedName("jx.v")
    public int field3367 = -1;

    @ObfuscatedName("jx.d")
    public String field3368 = "";

    @ObfuscatedName("jx.a")
    public int field3362 = -1;

    @ObfuscatedName("jx.g")
    public int field3352 = 0;

    @ObfuscatedName("jx.h")
    public int[] field3358;

    @ObfuscatedName("jx.i")
    public int field3370 = -1;

    @ObfuscatedName("jx.ab")
    public int field3373 = -1;

    @ObfuscatedName("iu.f(II)Ljx;")
    public static class264 method4245(int arg0) {
        class264 var1 = (class264) field3353.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3360.method3905(32, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4319(new class311(var2));
        }
        field3353.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.b(Lkb;I)V")
    public void method4319(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4323(arg0, var2);
        }
    }

    @ObfuscatedName("jx.l(Lkb;II)V")
    public void method4323(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3372 = arg0.method5394();
        } else if (arg1 == 2) {
            this.field3359 = arg0.method5184();
        } else if (arg1 == 3) {
            this.field3361 = arg0.method5394();
        } else if (arg1 == 4) {
            this.field3363 = arg0.method5394();
        } else if (arg1 == 5) {
            this.field3350 = arg0.method5394();
        } else if (arg1 == 6) {
            this.field3364 = arg0.method5394();
        } else if (arg1 == 7) {
            this.field3365 = arg0.method5183();
        } else if (arg1 == 8) {
            this.field3368 = arg0.method5190();
        } else if (arg1 == 9) {
            this.field3371 = arg0.method5163();
        } else if (arg1 == 10) {
            this.field3366 = arg0.method5183();
        } else if (arg1 == 11) {
            this.field3367 = 0;
        } else if (arg1 == 12) {
            this.field3362 = arg0.method5276();
        } else if (arg1 == 13) {
            this.field3352 = arg0.method5183();
        } else if (arg1 == 14) {
            this.field3367 = arg0.method5163();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3370 = arg0.method5163();
            if (this.field3370 == 65535) {
                this.field3370 = -1;
            }
            this.field3373 = arg0.method5163();
            if (this.field3373 == 65535) {
                this.field3373 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5163();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5276();
            this.field3358 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3358[var5] = arg0.method5163();
                if (this.field3358[var5] == 65535) {
                    this.field3358[var5] = -1;
                }
            }
            this.field3358[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jx.m(B)Ljx;")
    public final class264 method4321() {
        int var1 = -1;
        if (this.field3370 != -1) {
            var1 = class222.method1164(this.field3370);
        } else if (this.field3373 != -1) {
            var1 = class222.field2551[this.field3373];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3358.length - 1) {
            var2 = this.field3358[var1];
        } else {
            var2 = this.field3358[this.field3358.length - 1];
        }
        return var2 == -1 ? null : method4245(var2);
    }

    @ObfuscatedName("jx.z(II)Ljava/lang/String;")
    public String method4328(int arg0) {
        String var2 = this.field3368;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class302.method3453(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jx.q(I)Llc;")
    public class336 method4339() {
        if (this.field3361 < 0) {
            return null;
        }
        class336 var1 = (class336) field3354.method3155((long) this.field3361);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method2722(Statics.field3351, this.field3361, 0);
        if (var2 != null) {
            field3354.method3157(var2, (long) this.field3361);
        }
        return var2;
    }

    @ObfuscatedName("jx.k(B)Llc;")
    public class336 method4324() {
        if (this.field3350 < 0) {
            return null;
        }
        class336 var1 = (class336) field3354.method3155((long) this.field3350);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method2722(Statics.field3351, this.field3350, 0);
        if (var2 != null) {
            field3354.method3157(var2, (long) this.field3350);
        }
        return var2;
    }

    @ObfuscatedName("jx.c(S)Llc;")
    public class336 method4322() {
        if (this.field3363 < 0) {
            return null;
        }
        class336 var1 = (class336) field3354.method3155((long) this.field3363);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method2722(Statics.field3351, this.field3363, 0);
        if (var2 != null) {
            field3354.method3157(var2, (long) this.field3363);
        }
        return var2;
    }

    @ObfuscatedName("jx.u(I)Llc;")
    public class336 method4318() {
        if (this.field3364 < 0) {
            return null;
        }
        class336 var1 = (class336) field3354.method3155((long) this.field3364);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method2722(Statics.field3351, this.field3364, 0);
        if (var2 != null) {
            field3354.method3157(var2, (long) this.field3364);
        }
        return var2;
    }

    @ObfuscatedName("jx.t(I)Lkq;")
    public class306 method4341() {
        if (this.field3372 == -1) {
            return null;
        }
        class306 var1 = (class306) field3355.method3155((long) this.field3372);
        if (var1 != null) {
            return var1;
        }
        class245 var2 = Statics.field3351;
        class245 var3 = Statics.field3369;
        int var4 = this.field3372;
        byte[] var5 = var2.method3905(var4, 0);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            class337.method3719(var5);
            var6 = true;
        }
        class306 var7;
        if (var6) {
            var7 = class337.method3146(var3.method3905(var4, 0));
        } else {
            var7 = null;
        }
        if (var7 != null) {
            field3355.method3157(var7, (long) this.field3372);
        }
        return var7;
    }

    @ObfuscatedName("d.e(I)V")
    public static void method210() {
        field3353.method3158();
        field3354.method3158();
        field3355.method3158();
    }
}
