package deob;

@ObfuscatedName("el")
public class class154 extends class143 {

    @ObfuscatedName("el.h")
    public static boolean field2339 = false;

    @ObfuscatedName("el.k")
    public static class101 field2314 = new class101(64);

    @ObfuscatedName("el.u")
    public static class101 field2303 = new class101(500);

    @ObfuscatedName("el.v")
    public static class101 field2304 = new class101(30);

    @ObfuscatedName("el.f")
    public static class101 field2305 = new class101(30);

    @ObfuscatedName("el.s")
    public static class180[] field2306 = new class180[4];

    @ObfuscatedName("el.j")
    public int field2323;

    @ObfuscatedName("el.e")
    public int[] field2349;

    @ObfuscatedName("el.t")
    public int[] field2344;

    @ObfuscatedName("el.y")
    public String field2310 = "null";

    @ObfuscatedName("el.b")
    public short[] field2311;

    @ObfuscatedName("el.w")
    public short[] field2308;

    @ObfuscatedName("el.g")
    public short[] field2313;

    @ObfuscatedName("el.p")
    public short[] field2329;

    @ObfuscatedName("el.z")
    public int field2315 = 1;

    @ObfuscatedName("el.n")
    public int field2316 = 1;

    @ObfuscatedName("el.x")
    public int field2348 = 2;

    @ObfuscatedName("el.i")
    public boolean field2318 = true;

    @ObfuscatedName("el.m")
    public int field2319 = -1;

    @ObfuscatedName("el.ai")
    public int field2320 = -1;

    @ObfuscatedName("el.aa")
    public boolean field2332 = false;

    @ObfuscatedName("el.af")
    public boolean field2328 = false;

    @ObfuscatedName("el.ae")
    public int field2307 = -1;

    @ObfuscatedName("el.at")
    public int field2324 = 16;

    @ObfuscatedName("el.aj")
    public int field2325 = 0;

    @ObfuscatedName("el.ar")
    public int field2326 = 0;

    @ObfuscatedName("el.au")
    public String[] field2327 = new String[5];

    @ObfuscatedName("el.an")
    public int field2302 = -1;

    @ObfuscatedName("el.az")
    public int field2333 = -1;

    @ObfuscatedName("el.ac")
    public boolean field2342 = false;

    @ObfuscatedName("el.ap")
    public boolean field2331 = true;

    @ObfuscatedName("el.ad")
    public int field2322 = 128;

    @ObfuscatedName("el.ax")
    public int field2321 = 128;

    @ObfuscatedName("el.as")
    public int field2334 = 128;

    @ObfuscatedName("el.ak")
    public int field2335 = 0;

    @ObfuscatedName("el.av")
    public int field2336 = 0;

    @ObfuscatedName("el.ay")
    public int field2337 = 0;

    @ObfuscatedName("el.ab")
    public int field2338 = 0;

    @ObfuscatedName("el.am")
    public boolean field2347 = false;

    @ObfuscatedName("el.aw")
    public boolean field2340 = false;

    @ObfuscatedName("el.ag")
    public int field2341 = -1;

    @ObfuscatedName("el.al")
    public int[] field2301;

    @ObfuscatedName("el.aq")
    public int field2343 = -1;

    @ObfuscatedName("el.ah")
    public int field2309 = -1;

    @ObfuscatedName("el.ao")
    public int field2345 = -1;

    @ObfuscatedName("el.bg")
    public int field2346 = 0;

    @ObfuscatedName("el.be")
    public int field2330 = 0;

    @ObfuscatedName("el.bi")
    public int field2312 = 0;

    @ObfuscatedName("el.bp")
    public int[] field2317;

    @ObfuscatedName("bm.k(IB)Lel;")
    public static class154 method886(int arg0) {
        class154 var1 = (class154) field2314.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1231.method1024(6, arg0);
        class154 var3 = new class154();
        var3.field2323 = arg0;
        if (var2 != null) {
            var3.method2379(new class136(var2));
        }
        var3.method2364();
        if (var3.field2340) {
            var3.field2348 = 0;
            var3.field2318 = false;
        }
        field2314.method1238(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("el.u(I)V")
    public void method2364() {
        if (this.field2319 == -1) {
            this.field2319 = 0;
            if (this.field2349 != null && (this.field2344 == null || this.field2344[0] == 10)) {
                this.field2319 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2327[var1] != null) {
                    this.field2319 = 1;
                }
            }
        }
        if (this.field2341 == -1) {
            this.field2341 = this.field2348 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("el.v(Let;I)V")
    public void method2379(class136 arg0) {
        while (true) {
            int var2 = arg0.method1602();
            if (var2 == 0) {
                return;
            }
            this.method2395(arg0, var2);
        }
    }

    @ObfuscatedName("el.f(Let;II)V")
    public void method2395(class136 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method1602();
            if (var3 > 0) {
                if (this.field2349 == null || field2339) {
                    this.field2344 = new int[var3];
                    this.field2349 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2349[var4] = arg0.method1712();
                        this.field2344[var4] = arg0.method1602();
                    }
                } else {
                    arg0.field1722 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2310 = arg0.method1610();
        } else if (arg1 == 5) {
            int var5 = arg0.method1602();
            if (var5 > 0) {
                if (this.field2349 == null || field2339) {
                    this.field2344 = null;
                    this.field2349 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2349[var6] = arg0.method1712();
                    }
                } else {
                    arg0.field1722 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2315 = arg0.method1602();
        } else if (arg1 == 15) {
            this.field2316 = arg0.method1602();
        } else if (arg1 == 17) {
            this.field2348 = 0;
            this.field2318 = false;
        } else if (arg1 == 18) {
            this.field2318 = false;
        } else if (arg1 == 19) {
            this.field2319 = arg0.method1602();
        } else if (arg1 == 21) {
            this.field2320 = 0;
        } else if (arg1 == 22) {
            this.field2332 = true;
        } else if (arg1 == 23) {
            this.field2328 = true;
        } else if (arg1 == 24) {
            this.field2307 = arg0.method1712();
            if (this.field2307 == 65535) {
                this.field2307 = -1;
            }
        } else if (arg1 == 27) {
            this.field2348 = 1;
        } else if (arg1 == 28) {
            this.field2324 = arg0.method1602();
        } else if (arg1 == 29) {
            this.field2325 = arg0.method1603();
        } else if (arg1 == 39) {
            this.field2326 = arg0.method1603();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2327[arg1 - 30] = arg0.method1610();
            if (this.field2327[arg1 - 30].equalsIgnoreCase(class75.field1093)) {
                this.field2327[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method1602();
            this.field2311 = new short[var7];
            this.field2308 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2311[var8] = (short) arg0.method1712();
                this.field2308[var8] = (short) arg0.method1712();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method1602();
            this.field2313 = new short[var9];
            this.field2329 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2313[var10] = (short) arg0.method1712();
                this.field2329[var10] = (short) arg0.method1712();
            }
        } else if (arg1 == 60) {
            this.field2302 = arg0.method1712();
        } else if (arg1 == 62) {
            this.field2342 = true;
        } else if (arg1 == 64) {
            this.field2331 = false;
        } else if (arg1 == 65) {
            this.field2322 = arg0.method1712();
        } else if (arg1 == 66) {
            this.field2321 = arg0.method1712();
        } else if (arg1 == 67) {
            this.field2334 = arg0.method1712();
        } else if (arg1 == 68) {
            this.field2333 = arg0.method1712();
        } else if (arg1 == 69) {
            this.field2338 = arg0.method1602();
        } else if (arg1 == 70) {
            this.field2335 = arg0.method1605();
        } else if (arg1 == 71) {
            this.field2336 = arg0.method1605();
        } else if (arg1 == 72) {
            this.field2337 = arg0.method1605();
        } else if (arg1 == 73) {
            this.field2347 = true;
        } else if (arg1 == 74) {
            this.field2340 = true;
        } else if (arg1 == 75) {
            this.field2341 = arg0.method1602();
        } else if (arg1 == 77) {
            this.field2343 = arg0.method1712();
            if (this.field2343 == 65535) {
                this.field2343 = -1;
            }
            this.field2309 = arg0.method1712();
            if (this.field2309 == 65535) {
                this.field2309 = -1;
            }
            int var11 = arg0.method1602();
            this.field2301 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field2301[var12] = arg0.method1712();
                if (this.field2301[var12] == 65535) {
                    this.field2301[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field2345 = arg0.method1712();
            this.field2346 = arg0.method1602();
        } else if (arg1 == 79) {
            this.field2330 = arg0.method1712();
            this.field2312 = arg0.method1712();
            this.field2346 = arg0.method1602();
            int var13 = arg0.method1602();
            this.field2317 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2317[var14] = arg0.method1712();
            }
        } else if (arg1 == 81) {
            this.field2320 = arg0.method1602() * 256;
        }
    }

    @ObfuscatedName("el.s(II)Z")
    public final boolean method2373(int arg0) {
        if (this.field2344 != null) {
            for (int var4 = 0; var4 < this.field2344.length; var4++) {
                if (this.field2344[var4] == arg0) {
                    return Statics.field1574.method1020(this.field2349[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2349 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2349.length; var3++) {
                var2 &= Statics.field1574.method1020(this.field2349[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("el.j(B)Z")
    public final boolean method2368() {
        if (this.field2349 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2349.length; var2++) {
            var1 &= Statics.field1574.method1020(this.field2349[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("el.e(II[[IIIIB)Lfr;")
    public final class166 method2369(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2344 == null) {
            var7 = (long) ((this.field2323 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2323 << 10) + (arg0 << 3) + arg1);
        }
        class166 var9 = (class166) field2304.method1236(var7);
        if (var9 == null) {
            class180 var10 = this.method2380(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2332) {
                var10.field2706 = (short) (this.field2325 + 64);
                var10.field2707 = (short) (this.field2326 * 25 + 768);
                var10.method2934();
                var9 = var10;
            } else {
                var9 = var10.method2938(this.field2325 + 64, this.field2326 * 25 + 768, -50, -10, -50);
            }
            field2304.method1238(var9, var7);
        }
        if (this.field2332) {
            var9 = ((class180) var9).method2922();
        }
        if (this.field2320 >= 0) {
            if (var9 instanceof class181) {
                var9 = ((class181) var9).method3002(arg2, arg3, arg4, arg5, true, this.field2320);
            } else if (var9 instanceof class180) {
                var9 = ((class180) var9).method2997(arg2, arg3, arg4, arg5, true, this.field2320);
            }
        }
        return var9;
    }

    @ObfuscatedName("el.t(II[[IIIII)Lfb;")
    public final class181 method2375(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2344 == null) {
            var7 = (long) ((this.field2323 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2323 << 10) + (arg0 << 3) + arg1);
        }
        class181 var9 = (class181) field2305.method1236(var7);
        if (var9 == null) {
            class180 var10 = this.method2380(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2938(this.field2325 + 64, this.field2326 * 25 + 768, -50, -10, -50);
            field2305.method1238(var9, var7);
        }
        if (this.field2320 >= 0) {
            var9 = var9.method3002(arg2, arg3, arg4, arg5, true, this.field2320);
        }
        return var9;
    }

    @ObfuscatedName("el.y(II[[IIIILeu;II)Lfb;")
    public final class181 method2371(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class156 arg6, int arg7) {
        long var9;
        if (this.field2344 == null) {
            var9 = (long) ((this.field2323 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2323 << 10) + (arg0 << 3) + arg1);
        }
        class181 var11 = (class181) field2305.method1236(var9);
        if (var11 == null) {
            class180 var12 = this.method2380(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2938(this.field2325 + 64, this.field2326 * 25 + 768, -50, -10, -50);
            field2305.method1238(var11, var9);
        }
        if (arg6 == null && this.field2320 == -1) {
            return var11;
        }
        class181 var13;
        if (arg6 == null) {
            var13 = var11.method3003(true);
        } else {
            var13 = arg6.method2421(var11, arg7, arg1);
        }
        if (this.field2320 >= 0) {
            var13 = var13.method3002(arg2, arg3, arg4, arg5, false, this.field2320);
        }
        return var13;
    }

    @ObfuscatedName("el.b(III)Lfy;")
    public final class180 method2380(int arg0, int arg1) {
        class180 var3 = null;
        if (this.field2344 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2349 == null) {
                return null;
            }
            boolean var4 = this.field2342;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2349.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2349[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class180) field2303.method1236((long) var7);
                if (var3 == null) {
                    var3 = class180.method2918(Statics.field1574, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2932();
                    }
                    field2303.method1238(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2306[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class180(field2306, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2344.length; var9++) {
                if (this.field2344[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2349[var8];
            boolean var11 = this.field2342 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class180) field2303.method1236((long) var10);
            if (var3 == null) {
                var3 = class180.method2918(Statics.field1574, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2932();
                }
                field2303.method1238(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2322 == 128 && this.field2321 == 128 && this.field2334 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2335 == 0 && this.field2336 == 0 && this.field2337 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class180 var14 = new class180(var3, arg1 == 0 && !var12 && !var13, this.field2311 == null, this.field2313 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2928(256);
            var14.method2957(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2925();
        } else if (var15 == 2) {
            var14.method2984();
        } else if (var15 == 3) {
            var14.method2955();
        }
        if (this.field2311 != null) {
            for (int var16 = 0; var16 < this.field2311.length; var16++) {
                var14.method2930(this.field2311[var16], this.field2308[var16]);
            }
        }
        if (this.field2313 != null) {
            for (int var17 = 0; var17 < this.field2313.length; var17++) {
                var14.method2991(this.field2313[var17], this.field2329[var17]);
            }
        }
        if (var12) {
            var14.method2933(this.field2322, this.field2321, this.field2334);
        }
        if (var13) {
            var14.method2957(this.field2335, this.field2336, this.field2337);
        }
        return var14;
    }

    @ObfuscatedName("el.w(I)Lel;")
    public final class154 method2365() {
        int var1 = -1;
        if (this.field2343 != -1) {
            var1 = class90.method344(this.field2343);
        } else if (this.field2309 != -1) {
            var1 = class90.field1219[this.field2309];
        }
        return var1 < 0 || var1 >= this.field2301.length || this.field2301[var1] == -1 ? null : method886(this.field2301[var1]);
    }

    @ObfuscatedName("aq.g(I)V")
    public static void method694() {
        field2314.method1239();
        field2303.method1239();
        field2304.method1239();
        field2305.method1239();
    }

    @ObfuscatedName("el.p(B)Z")
    public boolean method2377() {
        if (this.field2301 == null) {
            return this.field2345 != -1 || this.field2317 != null;
        }
        for (int var1 = 0; var1 < this.field2301.length; var1++) {
            if (this.field2301[var1] != -1) {
                class154 var2 = method886(this.field2301[var1]);
                if (var2.field2345 != -1 || var2.field2317 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
