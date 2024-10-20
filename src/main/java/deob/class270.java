package deob;

@ObfuscatedName("jh")
public class class270 extends class209 {

    @ObfuscatedName("jh.k")
    public static class203 field3400 = new class203(64);

    @ObfuscatedName("jh.u")
    public static class203 field3379 = new class203(64);

    @ObfuscatedName("jh.i")
    public static class203 field3380 = new class203(20);

    @ObfuscatedName("jh.d")
    public int field3378 = -1;

    @ObfuscatedName("jh.w")
    public int field3384 = 16777215;

    @ObfuscatedName("jh.a")
    public int field3385 = 70;

    @ObfuscatedName("jh.z")
    public int field3386 = -1;

    @ObfuscatedName("jh.e")
    public int field3387 = -1;

    @ObfuscatedName("jh.q")
    public int field3375 = -1;

    @ObfuscatedName("jh.j")
    public int field3382 = -1;

    @ObfuscatedName("jh.y")
    public int field3389 = 0;

    @ObfuscatedName("jh.m")
    public int field3391 = 0;

    @ObfuscatedName("jh.h")
    public int field3392 = -1;

    @ObfuscatedName("jh.x")
    public String field3393 = "";

    @ObfuscatedName("jh.f")
    public int field3394 = -1;

    @ObfuscatedName("jh.r")
    public int field3377 = 0;

    @ObfuscatedName("jh.n")
    public int[] field3395;

    @ObfuscatedName("jh.g")
    public int field3397 = -1;

    @ObfuscatedName("jh.ac")
    public int field3398 = -1;

    @ObfuscatedName("al.s(II)Ljh;")
    public static class270 method938(int arg0) {
        class270 var1 = (class270) field3400.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3396.method4270(32, arg0);
        class270 var3 = new class270();
        if (var2 != null) {
            var3.method4667(new class185(var2));
        }
        field3400.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.o(Lgx;B)V")
    public void method4667(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4668(arg0, var2);
        }
    }

    @ObfuscatedName("jh.k(Lgx;II)V")
    public void method4668(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3378 = arg0.method3291();
        } else if (arg1 == 2) {
            this.field3384 = arg0.method3494();
        } else if (arg1 == 3) {
            this.field3386 = arg0.method3291();
        } else if (arg1 == 4) {
            this.field3375 = arg0.method3291();
        } else if (arg1 == 5) {
            this.field3387 = arg0.method3291();
        } else if (arg1 == 6) {
            this.field3382 = arg0.method3291();
        } else if (arg1 == 7) {
            this.field3389 = arg0.method3277();
        } else if (arg1 == 8) {
            this.field3393 = arg0.method3284();
        } else if (arg1 == 9) {
            this.field3385 = arg0.method3276();
        } else if (arg1 == 10) {
            this.field3391 = arg0.method3277();
        } else if (arg1 == 11) {
            this.field3392 = 0;
        } else if (arg1 == 12) {
            this.field3394 = arg0.method3274();
        } else if (arg1 == 13) {
            this.field3377 = arg0.method3277();
        } else if (arg1 == 14) {
            this.field3392 = arg0.method3276();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3397 = arg0.method3276();
            if (this.field3397 == 65535) {
                this.field3397 = -1;
            }
            this.field3398 = arg0.method3276();
            if (this.field3398 == 65535) {
                this.field3398 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3276();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3274();
            this.field3395 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3395[var5] = arg0.method3276();
                if (this.field3395[var5] == 65535) {
                    this.field3395[var5] = -1;
                }
            }
            this.field3395[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jh.u(I)Ljh;")
    public final class270 method4674() {
        int var1 = -1;
        if (this.field3397 != -1) {
            var1 = class228.method3899(this.field3397);
        } else if (this.field3398 != -1) {
            var1 = class228.field2596[this.field3398];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3395.length - 1) {
            var2 = this.field3395[var1];
        } else {
            var2 = this.field3395[this.field3395.length - 1];
        }
        return var2 == -1 ? null : method938(var2);
    }

    @ObfuscatedName("jh.i(IB)Ljava/lang/String;")
    public String method4671(int arg0) {
        String var2 = this.field3393;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class308.method4526(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jh.t(I)Llh;")
    public class322 method4677() {
        if (this.field3386 < 0) {
            return null;
        }
        class322 var1 = (class322) field3379.method3687((long) this.field3386);
        if (var1 != null) {
            return var1;
        }
        class322 var2 = class323.method4067(Statics.field3381, this.field3386, 0);
        if (var2 != null) {
            field3379.method3689(var2, (long) this.field3386);
        }
        return var2;
    }

    @ObfuscatedName("jh.c(B)Llh;")
    public class322 method4681() {
        if (this.field3387 < 0) {
            return null;
        }
        class322 var1 = (class322) field3379.method3687((long) this.field3387);
        if (var1 != null) {
            return var1;
        }
        class322 var2 = class323.method4067(Statics.field3381, this.field3387, 0);
        if (var2 != null) {
            field3379.method3689(var2, (long) this.field3387);
        }
        return var2;
    }

    @ObfuscatedName("jh.w(I)Llh;")
    public class322 method4672() {
        if (this.field3375 < 0) {
            return null;
        }
        class322 var1 = (class322) field3379.method3687((long) this.field3375);
        if (var1 != null) {
            return var1;
        }
        class322 var2 = class323.method4067(Statics.field3381, this.field3375, 0);
        if (var2 != null) {
            field3379.method3689(var2, (long) this.field3375);
        }
        return var2;
    }

    @ObfuscatedName("jh.a(B)Llh;")
    public class322 method4684() {
        if (this.field3382 < 0) {
            return null;
        }
        class322 var1 = (class322) field3379.method3687((long) this.field3382);
        if (var1 != null) {
            return var1;
        }
        class322 var2 = class323.method4067(Statics.field3381, this.field3382, 0);
        if (var2 != null) {
            field3379.method3689(var2, (long) this.field3382);
        }
        return var2;
    }

    @ObfuscatedName("jh.z(B)Lkw;")
    public class301 method4687() {
        if (this.field3378 == -1) {
            return null;
        }
        class301 var1 = (class301) field3380.method3687((long) this.field3378);
        if (var1 != null) {
            return var1;
        }
        class250 var2 = Statics.field3381;
        class250 var3 = Statics.field3383;
        int var4 = this.field3378;
        class301 var5;
        if (class323.method3193(var2, var4, 0)) {
            byte[] var6 = var3.method4270(var4, 0);
            class301 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class301 var8 = new class301(var6, Statics.field3841, Statics.field3744, Statics.field3838, Statics.field3839, Statics.field1110, Statics.field3840);
                class323.method4362();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3380.method3689(var5, (long) this.field3378);
        }
        return var5;
    }
}
