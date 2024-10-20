package deob;

@ObfuscatedName("el")
public class class152 extends class142 {

    @ObfuscatedName("el.i")
    public static class100 field2267 = new class100(64);

    @ObfuscatedName("el.e")
    public static class100 field2276 = new class100(50);

    @ObfuscatedName("el.a")
    public int field2292;

    @ObfuscatedName("el.g")
    public String field2270 = "null";

    @ObfuscatedName("el.w")
    public int field2271 = 1;

    @ObfuscatedName("el.v")
    public int[] field2272;

    @ObfuscatedName("el.u")
    public int[] field2273;

    @ObfuscatedName("el.m")
    public int field2274 = -1;

    @ObfuscatedName("el.b")
    public int field2275 = -1;

    @ObfuscatedName("el.f")
    public int field2284 = -1;

    @ObfuscatedName("el.d")
    public int field2289 = -1;

    @ObfuscatedName("el.x")
    public int field2278 = -1;

    @ObfuscatedName("el.z")
    public int field2280 = -1;

    @ObfuscatedName("el.o")
    public int field2286 = -1;

    @ObfuscatedName("el.c")
    public short[] field2281;

    @ObfuscatedName("el.y")
    public short[] field2282;

    @ObfuscatedName("el.j")
    public short[] field2283;

    @ObfuscatedName("el.s")
    public short[] field2299;

    @ObfuscatedName("el.p")
    public String[] field2285 = new String[5];

    @ObfuscatedName("el.ak")
    public boolean field2265 = true;

    @ObfuscatedName("el.ap")
    public int field2287 = -1;

    @ObfuscatedName("el.ai")
    public int field2288 = 128;

    @ObfuscatedName("el.ae")
    public int field2291 = 128;

    @ObfuscatedName("el.ad")
    public boolean field2290 = false;

    @ObfuscatedName("el.am")
    public int field2268 = 0;

    @ObfuscatedName("el.ah")
    public int field2297 = 0;

    @ObfuscatedName("el.au")
    public int field2293 = -1;

    @ObfuscatedName("el.ac")
    public int field2294 = 32;

    @ObfuscatedName("el.at")
    public int[] field2295;

    @ObfuscatedName("el.aq")
    public int field2296 = -1;

    @ObfuscatedName("el.ar")
    public int field2277 = -1;

    @ObfuscatedName("el.aa")
    public boolean field2298 = true;

    @ObfuscatedName("el.ay")
    public boolean field2269 = true;

    @ObfuscatedName("el.e(B)V")
    public void method2311() {
    }

    @ObfuscatedName("el.a(Lec;I)V")
    public void method2312(class135 arg0) {
        while (true) {
            int var2 = arg0.method1571();
            if (var2 == 0) {
                return;
            }
            this.method2313(arg0, var2);
        }
    }

    @ObfuscatedName("el.g(Lec;II)V")
    public void method2313(class135 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method1571();
            this.field2272 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2272[var4] = arg0.method1725();
            }
        } else if (arg1 == 2) {
            this.field2270 = arg0.method1716();
        } else if (arg1 == 12) {
            this.field2271 = arg0.method1571();
        } else if (arg1 == 13) {
            this.field2274 = arg0.method1725();
        } else if (arg1 == 14) {
            this.field2289 = arg0.method1725();
        } else if (arg1 == 15) {
            this.field2275 = arg0.method1725();
        } else if (arg1 == 16) {
            this.field2284 = arg0.method1725();
        } else if (arg1 == 17) {
            this.field2289 = arg0.method1725();
            this.field2278 = arg0.method1725();
            this.field2280 = arg0.method1725();
            this.field2286 = arg0.method1725();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2285[arg1 - 30] = arg0.method1716();
            if (this.field2285[arg1 - 30].equalsIgnoreCase(class74.field863)) {
                this.field2285[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method1571();
            this.field2281 = new short[var5];
            this.field2282 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2281[var6] = (short) arg0.method1725();
                this.field2282[var6] = (short) arg0.method1725();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method1571();
            this.field2283 = new short[var7];
            this.field2299 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2283[var8] = (short) arg0.method1725();
                this.field2299[var8] = (short) arg0.method1725();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method1571();
            this.field2273 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2273[var10] = arg0.method1725();
            }
        } else if (arg1 == 93) {
            this.field2265 = false;
        } else if (arg1 == 95) {
            this.field2287 = arg0.method1725();
        } else if (arg1 == 97) {
            this.field2288 = arg0.method1725();
        } else if (arg1 == 98) {
            this.field2291 = arg0.method1725();
        } else if (arg1 == 99) {
            this.field2290 = true;
        } else if (arg1 == 100) {
            this.field2268 = arg0.method1572();
        } else if (arg1 == 101) {
            this.field2297 = arg0.method1572();
        } else if (arg1 == 102) {
            this.field2293 = arg0.method1725();
        } else if (arg1 == 103) {
            this.field2294 = arg0.method1725();
        } else if (arg1 == 106) {
            this.field2296 = arg0.method1725();
            if (this.field2296 == 65535) {
                this.field2296 = -1;
            }
            this.field2277 = arg0.method1725();
            if (this.field2277 == 65535) {
                this.field2277 = -1;
            }
            int var11 = arg0.method1571();
            this.field2295 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field2295[var12] = arg0.method1725();
                if (this.field2295[var12] == 65535) {
                    this.field2295[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field2298 = false;
        } else if (arg1 == 109) {
            this.field2269 = false;
        }
    }

    @ObfuscatedName("el.w(Lea;ILea;IB)Lfr;")
    public final class180 method2314(class155 arg0, int arg1, class155 arg2, int arg3) {
        if (this.field2295 != null) {
            class152 var5 = this.method2316();
            return var5 == null ? null : var5.method2314(arg0, arg1, arg2, arg3);
        }
        class180 var6 = (class180) field2276.method1231((long) this.field2292);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field2272.length; var8++) {
                if (!Statics.field2266.method1017(this.field2272[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class179[] var9 = new class179[this.field2272.length];
            for (int var10 = 0; var10 < this.field2272.length; var10++) {
                var9[var10] = class179.method2908(Statics.field2266, this.field2272[var10], 0);
            }
            class179 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class179(var9, var9.length);
            }
            if (this.field2281 != null) {
                for (int var12 = 0; var12 < this.field2281.length; var12++) {
                    var11.method2920(this.field2281[var12], this.field2282[var12]);
                }
            }
            if (this.field2283 != null) {
                for (int var13 = 0; var13 < this.field2283.length; var13++) {
                    var11.method2921(this.field2283[var13], this.field2299[var13]);
                }
            }
            var6 = var11.method2928(this.field2268 + 64, this.field2297 * 5 + 850, -30, -50, -30);
            field2276.method1232(var6, (long) this.field2292);
        }
        class180 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method2389(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method2386(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method3010(true);
        } else {
            var14 = arg2.method2386(var6, arg3);
        }
        if (this.field2288 != 128 || this.field2291 != 128) {
            var14.method2974(this.field2288, this.field2291, this.field2288);
        }
        return var14;
    }

    @ObfuscatedName("el.v(I)Lfv;")
    public final class179 method2326() {
        if (this.field2295 != null) {
            class152 var1 = this.method2316();
            return var1 == null ? null : var1.method2326();
        } else if (this.field2273 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field2273.length; var3++) {
                if (!Statics.field2266.method1017(this.field2273[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class179[] var4 = new class179[this.field2273.length];
            for (int var5 = 0; var5 < this.field2273.length; var5++) {
                var4[var5] = class179.method2908(Statics.field2266, this.field2273[var5], 0);
            }
            class179 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class179(var4, var4.length);
            }
            if (this.field2281 != null) {
                for (int var7 = 0; var7 < this.field2281.length; var7++) {
                    var6.method2920(this.field2281[var7], this.field2282[var7]);
                }
            }
            if (this.field2283 != null) {
                for (int var8 = 0; var8 < this.field2283.length; var8++) {
                    var6.method2921(this.field2283[var8], this.field2299[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("el.u(B)Lel;")
    public final class152 method2316() {
        int var1 = -1;
        if (this.field2296 != -1) {
            var1 = Statics.method11(this.field2296);
        } else if (this.field2277 != -1) {
            var1 = class89.field1205[this.field2277];
        }
        return var1 < 0 || var1 >= this.field2295.length || this.field2295[var1] == -1 ? null : Statics.method1335(this.field2295[var1]);
    }

    @ObfuscatedName("el.m(I)Z")
    public boolean method2317() {
        if (this.field2295 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2296 != -1) {
            var1 = Statics.method11(this.field2296);
        } else if (this.field2277 != -1) {
            var1 = class89.field1205[this.field2277];
        }
        return var1 >= 0 && var1 < this.field2295.length && this.field2295[var1] != -1;
    }
}
