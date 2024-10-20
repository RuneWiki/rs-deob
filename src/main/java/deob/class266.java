package deob;

@ObfuscatedName("je")
public class class266 extends class206 {

    @ObfuscatedName("je.k")
    public static class201 field3500 = new class201(64);

    @ObfuscatedName("je.u")
    public static class201 field3490 = new class201(64);

    @ObfuscatedName("je.z")
    public static class201 field3492 = new class201(20);

    @ObfuscatedName("je.c")
    public int field3505 = -1;

    @ObfuscatedName("je.s")
    public int field3493 = 16777215;

    @ObfuscatedName("je.n")
    public int field3501 = 70;

    @ObfuscatedName("je.y")
    public int field3496 = -1;

    @ObfuscatedName("je.o")
    public int field3491 = -1;

    @ObfuscatedName("je.r")
    public int field3494 = -1;

    @ObfuscatedName("je.i")
    public int field3499 = -1;

    @ObfuscatedName("je.l")
    public int field3487 = 0;

    @ObfuscatedName("je.m")
    public int field3497 = 0;

    @ObfuscatedName("je.q")
    public int field3502 = -1;

    @ObfuscatedName("je.b")
    public String field3503 = "";

    @ObfuscatedName("je.h")
    public int field3504 = -1;

    @ObfuscatedName("je.d")
    public int field3495 = 0;

    @ObfuscatedName("je.v")
    public int[] field3506;

    @ObfuscatedName("je.p")
    public int field3507 = -1;

    @ObfuscatedName("je.ab")
    public int field3508 = -1;

    @ObfuscatedName("iu.a(II)Lje;")
    public static class266 method4010(int arg0) {
        class266 var1 = (class266) field3500.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3498.method3897(32, arg0);
        class266 var3 = new class266();
        if (var2 != null) {
            var3.method4250(new class185(var2));
        }
        field3500.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.w(Lgh;S)V")
    public void method4250(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4251(arg0, var2);
        }
    }

    @ObfuscatedName("je.e(Lgh;IB)V")
    public void method4251(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3505 = arg0.method3073();
        } else if (arg1 == 2) {
            this.field3493 = arg0.method2966();
        } else if (arg1 == 3) {
            this.field3496 = arg0.method3073();
        } else if (arg1 == 4) {
            this.field3494 = arg0.method3073();
        } else if (arg1 == 5) {
            this.field3491 = arg0.method3073();
        } else if (arg1 == 6) {
            this.field3499 = arg0.method3073();
        } else if (arg1 == 7) {
            this.field3487 = arg0.method2965();
        } else if (arg1 == 8) {
            this.field3503 = arg0.method2971();
        } else if (arg1 == 9) {
            this.field3501 = arg0.method3194();
        } else if (arg1 == 10) {
            this.field3497 = arg0.method2965();
        } else if (arg1 == 11) {
            this.field3502 = 0;
        } else if (arg1 == 12) {
            this.field3504 = arg0.method2962();
        } else if (arg1 == 13) {
            this.field3495 = arg0.method2965();
        } else if (arg1 == 14) {
            this.field3502 = arg0.method3194();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3507 = arg0.method3194();
            if (this.field3507 == 65535) {
                this.field3507 = -1;
            }
            this.field3508 = arg0.method3194();
            if (this.field3508 == 65535) {
                this.field3508 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3194();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2962();
            this.field3506 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3506[var5] = arg0.method3194();
                if (this.field3506[var5] == 65535) {
                    this.field3506[var5] = -1;
                }
            }
            this.field3506[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("je.k(I)Lje;")
    public final class266 method4252() {
        int var1 = -1;
        if (this.field3507 != -1) {
            var1 = Statics.method463(this.field3507);
        } else if (this.field3508 != -1) {
            var1 = class223.field2723[this.field3508];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3506.length - 1) {
            var2 = this.field3506[var1];
        } else {
            var2 = this.field3506[this.field3506.length - 1];
        }
        return var2 == -1 ? null : method4010(var2);
    }

    @ObfuscatedName("je.u(II)Ljava/lang/String;")
    public String method4253(int arg0) {
        String var2 = this.field3503;
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

    @ObfuscatedName("je.z(B)Lks;")
    public class299 method4254() {
        if (this.field3496 < 0) {
            return null;
        }
        class299 var1 = (class299) field3490.method3373((long) this.field3496);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class300.method2809(Statics.field3488, this.field3496, 0);
        if (var2 != null) {
            field3490.method3375(var2, (long) this.field3496);
        }
        return var2;
    }

    @ObfuscatedName("je.t(I)Lks;")
    public class299 method4255() {
        if (this.field3491 < 0) {
            return null;
        }
        class299 var1 = (class299) field3490.method3373((long) this.field3491);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class300.method2809(Statics.field3488, this.field3491, 0);
        if (var2 != null) {
            field3490.method3375(var2, (long) this.field3491);
        }
        return var2;
    }

    @ObfuscatedName("je.f(I)Lks;")
    public class299 method4271() {
        if (this.field3494 < 0) {
            return null;
        }
        class299 var1 = (class299) field3490.method3373((long) this.field3494);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class300.method2809(Statics.field3488, this.field3494, 0);
        if (var2 != null) {
            field3490.method3375(var2, (long) this.field3494);
        }
        return var2;
    }

    @ObfuscatedName("je.g(I)Lks;")
    public class299 method4256() {
        if (this.field3499 < 0) {
            return null;
        }
        class299 var1 = (class299) field3490.method3373((long) this.field3499);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class300.method2809(Statics.field3488, this.field3499, 0);
        if (var2 != null) {
            field3490.method3375(var2, (long) this.field3499);
        }
        return var2;
    }

    @ObfuscatedName("je.x(B)Ljm;")
    public class275 method4258() {
        if (this.field3505 == -1) {
            return null;
        }
        class275 var1 = (class275) field3492.method3373((long) this.field3505);
        if (var1 != null) {
            return var1;
        }
        class247 var2 = Statics.field3488;
        class247 var3 = Statics.field3489;
        int var4 = this.field3505;
        class275 var5;
        if (class300.method4647(var2, var4, 0)) {
            byte[] var6 = var3.method3897(var4, 0);
            class275 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class275 var8 = new class275(var6, Statics.field3868, Statics.field3866, Statics.field1388, Statics.field3728, Statics.field2026, Statics.field3815);
                class300.method1523();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3492.method3375(var5, (long) this.field3505);
        }
        return var5;
    }
}
