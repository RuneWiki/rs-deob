package deob;

@ObfuscatedName("gm")
public class class195 extends class428 {

    @ObfuscatedName("gm.x")
    public static class269 field2144 = new class269(64);

    @ObfuscatedName("gm.m")
    public static class269 field2132 = new class269(64);

    @ObfuscatedName("gm.q")
    public static class269 field2149 = new class269(20);

    @ObfuscatedName("gm.g")
    public int field2137 = -1;

    @ObfuscatedName("gm.i")
    public int field2131 = 16777215;

    @ObfuscatedName("gm.o")
    public int field2133 = 70;

    @ObfuscatedName("gm.n")
    public int field2139 = -1;

    @ObfuscatedName("gm.k")
    public int field2146 = -1;

    @ObfuscatedName("gm.a")
    public int field2141 = -1;

    @ObfuscatedName("gm.s")
    public int field2142 = -1;

    @ObfuscatedName("gm.l")
    public int field2143 = 0;

    @ObfuscatedName("gm.t")
    public int field2138 = 0;

    @ObfuscatedName("gm.c")
    public int field2145 = -1;

    @ObfuscatedName("gm.p")
    public String field2129 = "";

    @ObfuscatedName("gm.d")
    public int field2147 = -1;

    @ObfuscatedName("gm.y")
    public int field2148 = 0;

    @ObfuscatedName("gm.z")
    public int[] field2140;

    @ObfuscatedName("gm.w")
    public int field2150 = -1;

    @ObfuscatedName("gm.as")
    public int field2151 = -1;

    @ObfuscatedName("nb.h(II)Lgm;")
    public static class195 method6351(int arg0) {
        class195 var1 = (class195) field2144.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field105.method5909(32, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3508(new class467(var2));
        }
        field2144.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.e(Lqy;I)V")
    public void method3508(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3495(arg0, var2);
        }
    }

    @ObfuscatedName("gm.v(Lqy;IB)V")
    public void method3495(class467 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2137 = arg0.method7810();
        } else if (arg1 == 2) {
            this.field2131 = arg0.method7796();
        } else if (arg1 == 3) {
            this.field2139 = arg0.method7810();
        } else if (arg1 == 4) {
            this.field2141 = arg0.method7810();
        } else if (arg1 == 5) {
            this.field2146 = arg0.method7810();
        } else if (arg1 == 6) {
            this.field2142 = arg0.method7810();
        } else if (arg1 == 7) {
            this.field2143 = arg0.method7795();
        } else if (arg1 == 8) {
            this.field2129 = arg0.method7802();
        } else if (arg1 == 9) {
            this.field2133 = arg0.method7794();
        } else if (arg1 == 10) {
            this.field2138 = arg0.method7795();
        } else if (arg1 == 11) {
            this.field2145 = 0;
        } else if (arg1 == 12) {
            this.field2147 = arg0.method7792();
        } else if (arg1 == 13) {
            this.field2148 = arg0.method7795();
        } else if (arg1 == 14) {
            this.field2145 = arg0.method7794();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2150 = arg0.method7794();
            if (this.field2150 == 65535) {
                this.field2150 = -1;
            }
            this.field2151 = arg0.method7794();
            if (this.field2151 == 65535) {
                this.field2151 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method7794();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method7792();
            this.field2140 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2140[var5] = arg0.method7794();
                if (this.field2140[var5] == 65535) {
                    this.field2140[var5] = -1;
                }
            }
            this.field2140[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gm.x(B)Lgm;")
    public final class195 method3476() {
        int var1 = -1;
        if (this.field2150 != -1) {
            var1 = class296.method3182(this.field2150);
        } else if (this.field2151 != -1) {
            var1 = class296.field3445[this.field2151];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2140.length - 1) {
            var2 = this.field2140[var1];
        } else {
            var2 = this.field2140[this.field2140.length - 1];
        }
        return var2 == -1 ? null : method6351(var2);
    }

    @ObfuscatedName("gm.m(II)Ljava/lang/String;")
    public String method3477(int arg0) {
        String var2 = this.field2129;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class361.method5737(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gm.q(S)Lrx;")
    public class481 method3478() {
        if (this.field2139 < 0) {
            return null;
        }
        class481 var1 = (class481) field2132.method4917((long) this.field2139);
        if (var1 != null) {
            return var1;
        }
        class481 var2 = Statics.method2794(Statics.field2136, this.field2139, 0);
        if (var2 != null) {
            field2132.method4925(var2, (long) this.field2139);
        }
        return var2;
    }

    @ObfuscatedName("gm.f(S)Lrx;")
    public class481 method3479() {
        if (this.field2146 < 0) {
            return null;
        }
        class481 var1 = (class481) field2132.method4917((long) this.field2146);
        if (var1 != null) {
            return var1;
        }
        class481 var2 = Statics.method2794(Statics.field2136, this.field2146, 0);
        if (var2 != null) {
            field2132.method4925(var2, (long) this.field2146);
        }
        return var2;
    }

    @ObfuscatedName("gm.r(I)Lrx;")
    public class481 method3513() {
        if (this.field2141 < 0) {
            return null;
        }
        class481 var1 = (class481) field2132.method4917((long) this.field2141);
        if (var1 != null) {
            return var1;
        }
        class481 var2 = Statics.method2794(Statics.field2136, this.field2141, 0);
        if (var2 != null) {
            field2132.method4925(var2, (long) this.field2141);
        }
        return var2;
    }

    @ObfuscatedName("gm.u(B)Lrx;")
    public class481 method3481() {
        if (this.field2142 < 0) {
            return null;
        }
        class481 var1 = (class481) field2132.method4917((long) this.field2142);
        if (var1 != null) {
            return var1;
        }
        class481 var2 = Statics.method2794(Statics.field2136, this.field2142, 0);
        if (var2 != null) {
            field2132.method4925(var2, (long) this.field2142);
        }
        return var2;
    }

    @ObfuscatedName("gm.b(B)Lnv;")
    public class368 method3503() {
        if (this.field2137 == -1) {
            return null;
        }
        class368 var1 = (class368) field2149.method4917((long) this.field2137);
        if (var1 != null) {
            return var1;
        }
        class368 var2 = class482.method6718(Statics.field2136, Statics.field2130, this.field2137, 0);
        if (var2 != null) {
            field2149.method4925(var2, (long) this.field2137);
        }
        return var2;
    }

    @ObfuscatedName("gj.j(I)V")
    public static void method3313() {
        field2144.method4918();
        field2132.method4918();
        field2149.method4918();
    }
}
