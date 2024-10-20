package deob;

@ObfuscatedName("ek")
public class class153 extends class143 {

    @ObfuscatedName("ek.d")
    public static class101 field2268 = new class101(64);

    @ObfuscatedName("ek.k")
    public static class101 field2269 = new class101(50);

    @ObfuscatedName("ek.u")
    public int field2270;

    @ObfuscatedName("ek.v")
    public String field2300 = "null";

    @ObfuscatedName("ek.f")
    public int field2272 = 1;

    @ObfuscatedName("ek.s")
    public int[] field2273;

    @ObfuscatedName("ek.j")
    public int[] field2271;

    @ObfuscatedName("ek.e")
    public int field2274 = -1;

    @ObfuscatedName("ek.t")
    public int field2294 = -1;

    @ObfuscatedName("ek.y")
    public int field2277 = -1;

    @ObfuscatedName("ek.b")
    public int field2267 = -1;

    @ObfuscatedName("ek.w")
    public int field2279 = -1;

    @ObfuscatedName("ek.g")
    public int field2292 = -1;

    @ObfuscatedName("ek.p")
    public int field2281 = -1;

    @ObfuscatedName("ek.z")
    public short[] field2282;

    @ObfuscatedName("ek.n")
    public short[] field2283;

    @ObfuscatedName("ek.x")
    public short[] field2289;

    @ObfuscatedName("ek.i")
    public short[] field2286;

    @ObfuscatedName("ek.m")
    public String[] field2278 = new String[5];

    @ObfuscatedName("ek.ai")
    public boolean field2287 = true;

    @ObfuscatedName("ek.aa")
    public int field2288 = -1;

    @ObfuscatedName("ek.af")
    public int field2285 = 128;

    @ObfuscatedName("ek.ae")
    public int field2290 = 128;

    @ObfuscatedName("ek.at")
    public boolean field2291 = false;

    @ObfuscatedName("ek.aj")
    public int field2275 = 0;

    @ObfuscatedName("ek.ar")
    public int field2293 = 0;

    @ObfuscatedName("ek.au")
    public int field2284 = -1;

    @ObfuscatedName("ek.an")
    public int field2295 = 32;

    @ObfuscatedName("ek.az")
    public int[] field2296;

    @ObfuscatedName("ek.ac")
    public int field2297 = -1;

    @ObfuscatedName("ek.ap")
    public int field2298 = -1;

    @ObfuscatedName("ek.ad")
    public boolean field2299 = true;

    @ObfuscatedName("ek.ax")
    public boolean field2280 = true;

    @ObfuscatedName("bu.k(Lcv;Lcv;I)V")
    public static void method749(class87 arg0, class87 arg1) {
        Statics.field2276 = arg0;
        Statics.field1216 = arg1;
    }

    @ObfuscatedName("cs.u(II)Lek;")
    public static class153 method1016(int arg0) {
        class153 var1 = (class153) field2268.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2276.method1024(9, arg0);
        class153 var3 = new class153();
        var3.field2270 = arg0;
        if (var2 != null) {
            var3.method2335(new class136(var2));
        }
        var3.method2333();
        field2268.method1238(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ek.v(B)V")
    public void method2333() {
    }

    @ObfuscatedName("ek.f(Let;I)V")
    public void method2335(class136 arg0) {
        while (true) {
            int var2 = arg0.method1602();
            if (var2 == 0) {
                return;
            }
            this.method2336(arg0, var2);
        }
    }

    @ObfuscatedName("ek.s(Let;II)V")
    public void method2336(class136 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method1602();
            this.field2273 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2273[var4] = arg0.method1712();
            }
        } else if (arg1 == 2) {
            this.field2300 = arg0.method1610();
        } else if (arg1 == 12) {
            this.field2272 = arg0.method1602();
        } else if (arg1 == 13) {
            this.field2274 = arg0.method1712();
        } else if (arg1 == 14) {
            this.field2267 = arg0.method1712();
        } else if (arg1 == 15) {
            this.field2294 = arg0.method1712();
        } else if (arg1 == 16) {
            this.field2277 = arg0.method1712();
        } else if (arg1 == 17) {
            this.field2267 = arg0.method1712();
            this.field2279 = arg0.method1712();
            this.field2292 = arg0.method1712();
            this.field2281 = arg0.method1712();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2278[arg1 - 30] = arg0.method1610();
            if (this.field2278[arg1 - 30].equalsIgnoreCase(class75.field1093)) {
                this.field2278[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method1602();
            this.field2282 = new short[var5];
            this.field2283 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2282[var6] = (short) arg0.method1712();
                this.field2283[var6] = (short) arg0.method1712();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method1602();
            this.field2289 = new short[var7];
            this.field2286 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2289[var8] = (short) arg0.method1712();
                this.field2286[var8] = (short) arg0.method1712();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method1602();
            this.field2271 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2271[var10] = arg0.method1712();
            }
        } else if (arg1 == 93) {
            this.field2287 = false;
        } else if (arg1 == 95) {
            this.field2288 = arg0.method1712();
        } else if (arg1 == 97) {
            this.field2285 = arg0.method1712();
        } else if (arg1 == 98) {
            this.field2290 = arg0.method1712();
        } else if (arg1 == 99) {
            this.field2291 = true;
        } else if (arg1 == 100) {
            this.field2275 = arg0.method1603();
        } else if (arg1 == 101) {
            this.field2293 = arg0.method1603() * 5;
        } else if (arg1 == 102) {
            this.field2284 = arg0.method1712();
        } else if (arg1 == 103) {
            this.field2295 = arg0.method1712();
        } else if (arg1 == 106) {
            this.field2297 = arg0.method1712();
            if (this.field2297 == 65535) {
                this.field2297 = -1;
            }
            this.field2298 = arg0.method1712();
            if (this.field2298 == 65535) {
                this.field2298 = -1;
            }
            int var11 = arg0.method1602();
            this.field2296 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field2296[var12] = arg0.method1712();
                if (this.field2296[var12] == 65535) {
                    this.field2296[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field2299 = false;
        } else if (arg1 == 109) {
            this.field2280 = false;
        }
    }

    @ObfuscatedName("ek.j(Leu;ILeu;IB)Lfb;")
    public final class181 method2349(class156 arg0, int arg1, class156 arg2, int arg3) {
        if (this.field2296 != null) {
            class153 var5 = this.method2355();
            return var5 == null ? null : var5.method2349(arg0, arg1, arg2, arg3);
        }
        class181 var6 = (class181) field2269.method1236((long) this.field2270);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field2273.length; var8++) {
                if (!Statics.field1216.method1020(this.field2273[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class180[] var9 = new class180[this.field2273.length];
            for (int var10 = 0; var10 < this.field2273.length; var10++) {
                var9[var10] = class180.method2918(Statics.field1216, this.field2273[var10], 0);
            }
            class180 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class180(var9, var9.length);
            }
            if (this.field2282 != null) {
                for (int var12 = 0; var12 < this.field2282.length; var12++) {
                    var11.method2930(this.field2282[var12], this.field2283[var12]);
                }
            }
            if (this.field2289 != null) {
                for (int var13 = 0; var13 < this.field2289.length; var13++) {
                    var11.method2991(this.field2289[var13], this.field2286[var13]);
                }
            }
            var6 = var11.method2938(this.field2275 + 64, this.field2293 + 850, -30, -50, -30);
            field2269.method1238(var6, (long) this.field2270);
        }
        class181 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method2437(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method2420(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method3003(true);
        } else {
            var14 = arg2.method2420(var6, arg3);
        }
        if (this.field2285 != 128 || this.field2290 != 128) {
            var14.method3064(this.field2285, this.field2290, this.field2285);
        }
        return var14;
    }

    @ObfuscatedName("ek.e(I)Lfy;")
    public final class180 method2338() {
        if (this.field2296 != null) {
            class153 var1 = this.method2355();
            return var1 == null ? null : var1.method2338();
        } else if (this.field2271 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field2271.length; var3++) {
                if (!Statics.field1216.method1020(this.field2271[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class180[] var4 = new class180[this.field2271.length];
            for (int var5 = 0; var5 < this.field2271.length; var5++) {
                var4[var5] = class180.method2918(Statics.field1216, this.field2271[var5], 0);
            }
            class180 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class180(var4, var4.length);
            }
            if (this.field2282 != null) {
                for (int var7 = 0; var7 < this.field2282.length; var7++) {
                    var6.method2930(this.field2282[var7], this.field2283[var7]);
                }
            }
            if (this.field2289 != null) {
                for (int var8 = 0; var8 < this.field2289.length; var8++) {
                    var6.method2991(this.field2289[var8], this.field2286[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ek.t(B)Lek;")
    public final class153 method2355() {
        int var1 = -1;
        if (this.field2297 != -1) {
            var1 = class90.method344(this.field2297);
        } else if (this.field2298 != -1) {
            var1 = class90.field1219[this.field2298];
        }
        return var1 < 0 || var1 >= this.field2296.length || this.field2296[var1] == -1 ? null : method1016(this.field2296[var1]);
    }

    @ObfuscatedName("ek.y(B)Z")
    public boolean method2341() {
        if (this.field2296 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2297 != -1) {
            var1 = class90.method344(this.field2297);
        } else if (this.field2298 != -1) {
            var1 = class90.field1219[this.field2298];
        }
        return var1 >= 0 && var1 < this.field2296.length && this.field2296[var1] != -1;
    }
}
