package deob;

@ObfuscatedName("in")
public class class255 extends class195 {

    @ObfuscatedName("in.t")
    public static class190 field3420 = new class190(64);

    @ObfuscatedName("in.w")
    public static class190 field3421 = new class190(64);

    @ObfuscatedName("in.z")
    public static class190 field3422 = new class190(20);

    @ObfuscatedName("in.q")
    public int field3425 = -1;

    @ObfuscatedName("in.n")
    public int field3434 = 16777215;

    @ObfuscatedName("in.a")
    public int field3419 = 70;

    @ObfuscatedName("in.g")
    public int field3428 = -1;

    @ObfuscatedName("in.v")
    public int field3432 = -1;

    @ObfuscatedName("in.s")
    public int field3429 = -1;

    @ObfuscatedName("in.k")
    public int field3431 = -1;

    @ObfuscatedName("in.r")
    public int field3417 = 0;

    @ObfuscatedName("in.l")
    public int field3433 = 0;

    @ObfuscatedName("in.h")
    public int field3423 = -1;

    @ObfuscatedName("in.d")
    public String field3435 = "";

    @ObfuscatedName("in.x")
    public int field3436 = -1;

    @ObfuscatedName("in.b")
    public int field3427 = 0;

    @ObfuscatedName("in.y")
    public int[] field3437;

    @ObfuscatedName("in.u")
    public int field3439 = -1;

    @ObfuscatedName("in.av")
    public int field3440 = -1;

    @ObfuscatedName("y.p(IB)Lin;")
    public static class255 method191(int arg0) {
        class255 var1 = (class255) field3420.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3430.method3720(32, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4046(new class174(var2));
        }
        field3420.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.m(Lfr;I)V")
    public void method4046(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method4047(arg0, var2);
        }
    }

    @ObfuscatedName("in.e(Lfr;II)V")
    public void method4047(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3425 = arg0.method2825();
        } else if (arg1 == 2) {
            this.field3434 = arg0.method2832();
        } else if (arg1 == 3) {
            this.field3428 = arg0.method2825();
        } else if (arg1 == 4) {
            this.field3429 = arg0.method2825();
        } else if (arg1 == 5) {
            this.field3432 = arg0.method2825();
        } else if (arg1 == 6) {
            this.field3431 = arg0.method2825();
        } else if (arg1 == 7) {
            this.field3417 = arg0.method3001();
        } else if (arg1 == 8) {
            this.field3435 = arg0.method2819();
        } else if (arg1 == 9) {
            this.field3419 = arg0.method2824();
        } else if (arg1 == 10) {
            this.field3433 = arg0.method3001();
        } else if (arg1 == 11) {
            this.field3423 = 0;
        } else if (arg1 == 12) {
            this.field3436 = arg0.method2810();
        } else if (arg1 == 13) {
            this.field3427 = arg0.method3001();
        } else if (arg1 == 14) {
            this.field3423 = arg0.method2824();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3439 = arg0.method2824();
            if (this.field3439 == 65535) {
                this.field3439 = -1;
            }
            this.field3440 = arg0.method2824();
            if (this.field3440 == 65535) {
                this.field3440 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2824();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2810();
            this.field3437 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3437[var5] = arg0.method2824();
                if (this.field3437[var5] == 65535) {
                    this.field3437[var5] = -1;
                }
            }
            this.field3437[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("in.t(I)Lin;")
    public final class255 method4048() {
        int var1 = -1;
        if (this.field3439 != -1) {
            var1 = class212.method659(this.field3439);
        } else if (this.field3440 != -1) {
            var1 = class212.field2616[this.field3440];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3437.length - 1) {
            var2 = this.field3437[var1];
        } else {
            var2 = this.field3437[this.field3437.length - 1];
        }
        return var2 == -1 ? null : method191(var2);
    }

    @ObfuscatedName("in.w(IB)Ljava/lang/String;")
    public String method4049(int arg0) {
        String var2 = this.field3435;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + Statics.method2135(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("in.z(I)Ljy;")
    public class286 method4075() {
        if (this.field3428 < 0) {
            return null;
        }
        class286 var1 = (class286) field3421.method3182((long) this.field3428);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4306(Statics.field3418, this.field3428, 0);
        if (var2 != null) {
            field3421.method3179(var2, (long) this.field3428);
        }
        return var2;
    }

    @ObfuscatedName("in.j(I)Ljy;")
    public class286 method4051() {
        if (this.field3432 < 0) {
            return null;
        }
        class286 var1 = (class286) field3421.method3182((long) this.field3432);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4306(Statics.field3418, this.field3432, 0);
        if (var2 != null) {
            field3421.method3179(var2, (long) this.field3432);
        }
        return var2;
    }

    @ObfuscatedName("in.c(I)Ljy;")
    public class286 method4073() {
        if (this.field3429 < 0) {
            return null;
        }
        class286 var1 = (class286) field3421.method3182((long) this.field3429);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4306(Statics.field3418, this.field3429, 0);
        if (var2 != null) {
            field3421.method3179(var2, (long) this.field3429);
        }
        return var2;
    }

    @ObfuscatedName("in.o(I)Ljy;")
    public class286 method4083() {
        if (this.field3431 < 0) {
            return null;
        }
        class286 var1 = (class286) field3421.method3182((long) this.field3431);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4306(Statics.field3418, this.field3431, 0);
        if (var2 != null) {
            field3421.method3179(var2, (long) this.field3431);
        }
        return var2;
    }

    @ObfuscatedName("in.q(B)Ljb;")
    public class264 method4050() {
        if (this.field3425 == -1) {
            return null;
        }
        class264 var1 = (class264) field3422.method3182((long) this.field3425);
        if (var1 != null) {
            return var1;
        }
        class236 var2 = Statics.field3418;
        class236 var3 = Statics.field3426;
        int var4 = this.field3425;
        class264 var5;
        if (class287.method4(var2, var4, 0)) {
            var5 = class287.method65(var3.method3720(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3422.method3179(var5, (long) this.field3425);
        }
        return var5;
    }
}
