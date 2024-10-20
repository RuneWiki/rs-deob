package deob;

@ObfuscatedName("ic")
public class class255 extends class195 {

    @ObfuscatedName("ic.o")
    public static class190 field3414 = new class190(64);

    @ObfuscatedName("ic.g")
    public static class190 field3415 = new class190(64);

    @ObfuscatedName("ic.v")
    public static class190 field3413 = new class190(20);

    @ObfuscatedName("ic.n")
    public int field3418 = -1;

    @ObfuscatedName("ic.u")
    public int field3427 = 16777215;

    @ObfuscatedName("ic.t")
    public int field3420 = 70;

    @ObfuscatedName("ic.a")
    public int field3421 = -1;

    @ObfuscatedName("ic.i")
    public int field3416 = -1;

    @ObfuscatedName("ic.h")
    public int field3423 = -1;

    @ObfuscatedName("ic.b")
    public int field3424 = -1;

    @ObfuscatedName("ic.j")
    public int field3425 = 0;

    @ObfuscatedName("ic.y")
    public int field3426 = 0;

    @ObfuscatedName("ic.k")
    public int field3411 = -1;

    @ObfuscatedName("ic.c")
    public String field3428 = "";

    @ObfuscatedName("ic.r")
    public int field3429 = -1;

    @ObfuscatedName("ic.m")
    public int field3430 = 0;

    @ObfuscatedName("ic.l")
    public int[] field3419;

    @ObfuscatedName("ic.f")
    public int field3432 = -1;

    @ObfuscatedName("ic.ap")
    public int field3412 = -1;

    @ObfuscatedName("gu.w(II)Lic;")
    public static class255 method3627(int arg0) {
        class255 var1 = (class255) field3414.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3431.method3876(32, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4229(new class174(var2));
        }
        field3414.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.s(Lfz;S)V")
    public void method4229(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4230(arg0, var2);
        }
    }

    @ObfuscatedName("ic.q(Lfz;II)V")
    public void method4230(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3418 = arg0.method3015();
        } else if (arg1 == 2) {
            this.field3427 = arg0.method2975();
        } else if (arg1 == 3) {
            this.field3421 = arg0.method3015();
        } else if (arg1 == 4) {
            this.field3423 = arg0.method3015();
        } else if (arg1 == 5) {
            this.field3416 = arg0.method3015();
        } else if (arg1 == 6) {
            this.field3424 = arg0.method3015();
        } else if (arg1 == 7) {
            this.field3425 = arg0.method2974();
        } else if (arg1 == 8) {
            this.field3428 = arg0.method3115();
        } else if (arg1 == 9) {
            this.field3420 = arg0.method3178();
        } else if (arg1 == 10) {
            this.field3426 = arg0.method2974();
        } else if (arg1 == 11) {
            this.field3411 = 0;
        } else if (arg1 == 12) {
            this.field3429 = arg0.method2971();
        } else if (arg1 == 13) {
            this.field3430 = arg0.method2974();
        } else if (arg1 == 14) {
            this.field3411 = arg0.method3178();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3432 = arg0.method3178();
            if (this.field3432 == 65535) {
                this.field3432 = -1;
            }
            this.field3412 = arg0.method3178();
            if (this.field3412 == 65535) {
                this.field3412 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3178();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2971();
            this.field3419 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3419[var5] = arg0.method3178();
                if (this.field3419[var5] == 65535) {
                    this.field3419[var5] = -1;
                }
            }
            this.field3419[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ic.o(I)Lic;")
    public final class255 method4268() {
        int var1 = -1;
        if (this.field3432 != -1) {
            var1 = Statics.method1604(this.field3432);
        } else if (this.field3412 != -1) {
            var1 = class212.field2599[this.field3412];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3419.length - 1) {
            var2 = this.field3419[var1];
        } else {
            var2 = this.field3419[this.field3419.length - 1];
        }
        return var2 == -1 ? null : method3627(var2);
    }

    @ObfuscatedName("ic.g(IB)Ljava/lang/String;")
    public String method4232(int arg0) {
        String var2 = this.field3428;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class271.method3846(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ic.v(I)Lky;")
    public class287 method4233() {
        if (this.field3421 < 0) {
            return null;
        }
        class287 var1 = (class287) field3415.method3357((long) this.field3421);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method3863(Statics.field3433, this.field3421, 0);
        if (var2 != null) {
            field3415.method3371(var2, (long) this.field3421);
        }
        return var2;
    }

    @ObfuscatedName("ic.p(I)Lky;")
    public class287 method4250() {
        if (this.field3416 < 0) {
            return null;
        }
        class287 var1 = (class287) field3415.method3357((long) this.field3416);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method3863(Statics.field3433, this.field3416, 0);
        if (var2 != null) {
            field3415.method3371(var2, (long) this.field3416);
        }
        return var2;
    }

    @ObfuscatedName("ic.e(I)Lky;")
    public class287 method4235() {
        if (this.field3423 < 0) {
            return null;
        }
        class287 var1 = (class287) field3415.method3357((long) this.field3423);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method3863(Statics.field3433, this.field3423, 0);
        if (var2 != null) {
            field3415.method3371(var2, (long) this.field3423);
        }
        return var2;
    }

    @ObfuscatedName("ic.d(I)Lky;")
    public class287 method4236() {
        if (this.field3424 < 0) {
            return null;
        }
        class287 var1 = (class287) field3415.method3357((long) this.field3424);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method3863(Statics.field3433, this.field3424, 0);
        if (var2 != null) {
            field3415.method3371(var2, (long) this.field3424);
        }
        return var2;
    }

    @ObfuscatedName("ic.x(B)Ljh;")
    public class264 method4254() {
        if (this.field3418 == -1) {
            return null;
        }
        class264 var1 = (class264) field3413.method3357((long) this.field3418);
        if (var1 != null) {
            return var1;
        }
        class236 var2 = Statics.field3433;
        class236 var3 = Statics.field3434;
        int var4 = this.field3418;
        class264 var5;
        if (class288.method4488(var2, var4, 0)) {
            byte[] var6 = var3.method3876(var4, 0);
            class264 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class264 var8 = new class264(var6, Statics.field3809, Statics.field348, Statics.field3807, Statics.field701, Statics.field1676, Statics.field3148);
                Statics.method4163();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3413.method3371(var5, (long) this.field3418);
        }
        return var5;
    }
}
