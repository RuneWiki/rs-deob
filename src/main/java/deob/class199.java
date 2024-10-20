package deob;

@ObfuscatedName("gb")
public class class199 extends class435 {

    @ObfuscatedName("gb.s")
    public static class273 field2133 = new class273(64);

    @ObfuscatedName("gb.z")
    public static class273 field2132 = new class273(64);

    @ObfuscatedName("gb.j")
    public static class273 field2139 = new class273(20);

    @ObfuscatedName("gb.r")
    public int field2141 = -1;

    @ObfuscatedName("gb.b")
    public int field2136 = 16777215;

    @ObfuscatedName("gb.m")
    public int field2143 = 70;

    @ObfuscatedName("gb.t")
    public int field2138 = -1;

    @ObfuscatedName("gb.h")
    public int field2129 = -1;

    @ObfuscatedName("gb.p")
    public int field2140 = -1;

    @ObfuscatedName("gb.o")
    public int field2131 = -1;

    @ObfuscatedName("gb.u")
    public int field2142 = 0;

    @ObfuscatedName("gb.x")
    public int field2149 = 0;

    @ObfuscatedName("gb.a")
    public int field2144 = -1;

    @ObfuscatedName("gb.q")
    public String field2145 = "";

    @ObfuscatedName("gb.d")
    public int field2146 = -1;

    @ObfuscatedName("gb.e")
    public int field2147 = 0;

    @ObfuscatedName("gb.g")
    public int[] field2148;

    @ObfuscatedName("gb.y")
    public int field2134 = -1;

    @ObfuscatedName("gb.af")
    public int field2150 = -1;

    @ObfuscatedName("bx.f(IB)Lgb;")
    public static class199 method2122(int arg0) {
        class199 var1 = (class199) field2133.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5089.method5990(32, arg0);
        class199 var3 = new class199();
        if (var2 != null) {
            var3.method3572(new class474(var2));
        }
        field2133.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gb.w(Lrd;B)V")
    public void method3572(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3573(arg0, var2);
        }
    }

    @ObfuscatedName("gb.v(Lrd;II)V")
    public void method3573(class474 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2141 = arg0.method8029();
        } else if (arg1 == 2) {
            this.field2136 = arg0.method8132();
        } else if (arg1 == 3) {
            this.field2138 = arg0.method8029();
        } else if (arg1 == 4) {
            this.field2140 = arg0.method8029();
        } else if (arg1 == 5) {
            this.field2129 = arg0.method8029();
        } else if (arg1 == 6) {
            this.field2131 = arg0.method8029();
        } else if (arg1 == 7) {
            this.field2142 = arg0.method7967();
        } else if (arg1 == 8) {
            this.field2145 = arg0.method7975();
        } else if (arg1 == 9) {
            this.field2143 = arg0.method8032();
        } else if (arg1 == 10) {
            this.field2149 = arg0.method7967();
        } else if (arg1 == 11) {
            this.field2144 = 0;
        } else if (arg1 == 12) {
            this.field2146 = arg0.method7964();
        } else if (arg1 == 13) {
            this.field2147 = arg0.method7967();
        } else if (arg1 == 14) {
            this.field2144 = arg0.method8032();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2134 = arg0.method8032();
            if (this.field2134 == 65535) {
                this.field2134 = -1;
            }
            this.field2150 = arg0.method8032();
            if (this.field2150 == 65535) {
                this.field2150 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8032();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method7964();
            this.field2148 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2148[var5] = arg0.method8032();
                if (this.field2148[var5] == 65535) {
                    this.field2148[var5] = -1;
                }
            }
            this.field2148[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gb.s(B)Lgb;")
    public final class199 method3585() {
        int var1 = -1;
        if (this.field2134 != -1) {
            var1 = class300.method2093(this.field2134);
        } else if (this.field2150 != -1) {
            var1 = class300.field3459[this.field2150];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2148.length - 1) {
            var2 = this.field2148[var1];
        } else {
            var2 = this.field2148[this.field2148.length - 1];
        }
        return var2 == -1 ? null : method2122(var2);
    }

    @ObfuscatedName("gb.z(II)Ljava/lang/String;")
    public String method3577(int arg0) {
        String var2 = this.field2145;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class365.method3532(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gb.j(I)Lrs;")
    public class488 method3576() {
        if (this.field2138 < 0) {
            return null;
        }
        class488 var1 = (class488) field2132.method5028((long) this.field2138);
        if (var1 != null) {
            return var1;
        }
        class488 var2 = class489.method8225(Statics.field2137, this.field2138, 0);
        if (var2 != null) {
            field2132.method5027(var2, (long) this.field2138);
        }
        return var2;
    }

    @ObfuscatedName("gb.i(I)Lrs;")
    public class488 method3578() {
        if (this.field2129 < 0) {
            return null;
        }
        class488 var1 = (class488) field2132.method5028((long) this.field2129);
        if (var1 != null) {
            return var1;
        }
        class488 var2 = class489.method8225(Statics.field2137, this.field2129, 0);
        if (var2 != null) {
            field2132.method5027(var2, (long) this.field2129);
        }
        return var2;
    }

    @ObfuscatedName("gb.n(S)Lrs;")
    public class488 method3583() {
        if (this.field2140 < 0) {
            return null;
        }
        class488 var1 = (class488) field2132.method5028((long) this.field2140);
        if (var1 != null) {
            return var1;
        }
        class488 var2 = class489.method8225(Statics.field2137, this.field2140, 0);
        if (var2 != null) {
            field2132.method5027(var2, (long) this.field2140);
        }
        return var2;
    }

    @ObfuscatedName("gb.l(I)Lrs;")
    public class488 method3574() {
        if (this.field2131 < 0) {
            return null;
        }
        class488 var1 = (class488) field2132.method5028((long) this.field2131);
        if (var1 != null) {
            return var1;
        }
        class488 var2 = class489.method8225(Statics.field2137, this.field2131, 0);
        if (var2 != null) {
            field2132.method5027(var2, (long) this.field2131);
        }
        return var2;
    }

    @ObfuscatedName("gb.k(S)Lnv;")
    public class372 method3579() {
        if (this.field2141 == -1) {
            return null;
        }
        class372 var1 = (class372) field2139.method5028((long) this.field2141);
        if (var1 != null) {
            return var1;
        }
        class372 var2 = class489.method481(Statics.field2137, Statics.field2130, this.field2141, 0);
        if (var2 != null) {
            field2139.method5027(var2, (long) this.field2141);
        }
        return var2;
    }
}
