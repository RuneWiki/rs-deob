package deob;

@ObfuscatedName("jt")
public class class266 extends class206 {

    @ObfuscatedName("jt.h")
    public static class201 field3491 = new class201(64);

    @ObfuscatedName("jt.i")
    public static class201 field3496 = new class201(64);

    @ObfuscatedName("jt.w")
    public static class201 field3493 = new class201(20);

    @ObfuscatedName("jt.o")
    public int field3498 = -1;

    @ObfuscatedName("jt.l")
    public int field3499 = 16777215;

    @ObfuscatedName("jt.f")
    public int field3500 = 70;

    @ObfuscatedName("jt.q")
    public int field3490 = -1;

    @ObfuscatedName("jt.r")
    public int field3502 = -1;

    @ObfuscatedName("jt.x")
    public int field3513 = -1;

    @ObfuscatedName("jt.u")
    public int field3504 = -1;

    @ObfuscatedName("jt.b")
    public int field3505 = 0;

    @ObfuscatedName("jt.p")
    public int field3506 = 0;

    @ObfuscatedName("jt.y")
    public int field3507 = -1;

    @ObfuscatedName("jt.n")
    public String field3508 = "";

    @ObfuscatedName("jt.j")
    public int field3509 = -1;

    @ObfuscatedName("jt.e")
    public int field3497 = 0;

    @ObfuscatedName("jt.v")
    public int[] field3515;

    @ObfuscatedName("jt.a")
    public int field3512 = -1;

    @ObfuscatedName("jt.ad")
    public int field3492 = -1;

    @ObfuscatedName("o.s(Lir;Lir;Lir;I)V")
    public static void method50(class247 arg0, class247 arg1, class247 arg2) {
        Statics.field3501 = arg0;
        Statics.field3804 = arg1;
        Statics.field10 = arg2;
    }

    @ObfuscatedName("v.g(II)Ljt;")
    public static class266 method176(int arg0) {
        class266 var1 = (class266) field3491.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3501.method4231(32, arg0);
        class266 var3 = new class266();
        if (var2 != null) {
            var3.method4555(new class185(var2));
        }
        field3491.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jt.m(Lgy;B)V")
    public void method4555(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4556(arg0, var2);
        }
    }

    @ObfuscatedName("jt.h(Lgy;II)V")
    public void method4556(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3498 = arg0.method3446();
        } else if (arg1 == 2) {
            this.field3499 = arg0.method3243();
        } else if (arg1 == 3) {
            this.field3490 = arg0.method3446();
        } else if (arg1 == 4) {
            this.field3513 = arg0.method3446();
        } else if (arg1 == 5) {
            this.field3502 = arg0.method3446();
        } else if (arg1 == 6) {
            this.field3504 = arg0.method3446();
        } else if (arg1 == 7) {
            this.field3505 = arg0.method3221();
        } else if (arg1 == 8) {
            this.field3508 = arg0.method3443();
        } else if (arg1 == 9) {
            this.field3500 = arg0.method3241();
        } else if (arg1 == 10) {
            this.field3506 = arg0.method3221();
        } else if (arg1 == 11) {
            this.field3507 = 0;
        } else if (arg1 == 12) {
            this.field3509 = arg0.method3239();
        } else if (arg1 == 13) {
            this.field3497 = arg0.method3221();
        } else if (arg1 == 14) {
            this.field3507 = arg0.method3241();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3512 = arg0.method3241();
            if (this.field3512 == 65535) {
                this.field3512 = -1;
            }
            this.field3492 = arg0.method3241();
            if (this.field3492 == 65535) {
                this.field3492 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3241();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3239();
            this.field3515 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3515[var5] = arg0.method3241();
                if (this.field3515[var5] == 65535) {
                    this.field3515[var5] = -1;
                }
            }
            this.field3515[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jt.i(S)Ljt;")
    public final class266 method4557() {
        int var1 = -1;
        if (this.field3512 != -1) {
            var1 = class223.method51(this.field3512);
        } else if (this.field3492 != -1) {
            var1 = class223.field2713[this.field3492];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3515.length - 1) {
            var2 = this.field3515[var1];
        } else {
            var2 = this.field3515[this.field3515.length - 1];
        }
        return var2 == -1 ? null : method176(var2);
    }

    @ObfuscatedName("jt.w(II)Ljava/lang/String;")
    public String method4558(int arg0) {
        String var2 = this.field3508;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class294.method2622(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jt.t(I)Lki;")
    public class310 method4575() {
        if (this.field3490 < 0) {
            return null;
        }
        class310 var1 = (class310) field3496.method3673((long) this.field3490);
        if (var1 != null) {
            return var1;
        }
        class310 var2 = class311.method983(Statics.field3804, this.field3490, 0);
        if (var2 != null) {
            field3496.method3675(var2, (long) this.field3490);
        }
        return var2;
    }

    @ObfuscatedName("jt.d(I)Lki;")
    public class310 method4560() {
        if (this.field3502 < 0) {
            return null;
        }
        class310 var1 = (class310) field3496.method3673((long) this.field3502);
        if (var1 != null) {
            return var1;
        }
        class310 var2 = class311.method983(Statics.field3804, this.field3502, 0);
        if (var2 != null) {
            field3496.method3675(var2, (long) this.field3502);
        }
        return var2;
    }

    @ObfuscatedName("jt.z(I)Lki;")
    public class310 method4571() {
        if (this.field3513 < 0) {
            return null;
        }
        class310 var1 = (class310) field3496.method3673((long) this.field3513);
        if (var1 != null) {
            return var1;
        }
        class310 var2 = class311.method983(Statics.field3804, this.field3513, 0);
        if (var2 != null) {
            field3496.method3675(var2, (long) this.field3513);
        }
        return var2;
    }

    @ObfuscatedName("jt.k(I)Lki;")
    public class310 method4562() {
        if (this.field3504 < 0) {
            return null;
        }
        class310 var1 = (class310) field3496.method3673((long) this.field3504);
        if (var1 != null) {
            return var1;
        }
        class310 var2 = class311.method983(Statics.field3804, this.field3504, 0);
        if (var2 != null) {
            field3496.method3675(var2, (long) this.field3504);
        }
        return var2;
    }

    @ObfuscatedName("jt.c(B)Lkp;")
    public class287 method4574() {
        if (this.field3498 == -1) {
            return null;
        }
        class287 var1 = (class287) field3493.method3673((long) this.field3498);
        if (var1 != null) {
            return var1;
        }
        class247 var2 = Statics.field3804;
        class247 var3 = Statics.field10;
        int var4 = this.field3498;
        class287 var5;
        if (class311.method456(var2, var4, 0)) {
            byte[] var6 = var3.method4231(var4, 0);
            class287 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class287 var8 = new class287(var6, Statics.field2699, Statics.field3477, Statics.field709, Statics.field3912, Statics.field3787, Statics.field3913);
                class311.method4929();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3493.method3675(var5, (long) this.field3498);
        }
        return var5;
    }

    @ObfuscatedName("gy.o(B)V")
    public static void method3481() {
        field3491.method3674();
        field3496.method3674();
        field3493.method3674();
    }
}
