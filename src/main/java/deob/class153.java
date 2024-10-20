package deob;

@ObfuscatedName("ep")
public class class153 extends class142 {

    @ObfuscatedName("ep.r")
    public static boolean field2328 = false;

    @ObfuscatedName("ep.e")
    public static class100 field2302 = new class100(64);

    @ObfuscatedName("ep.a")
    public static class100 field2326 = new class100(500);

    @ObfuscatedName("ep.g")
    public static class100 field2304 = new class100(30);

    @ObfuscatedName("ep.w")
    public static class100 field2305 = new class100(30);

    @ObfuscatedName("ep.v")
    public static class179[] field2306 = new class179[4];

    @ObfuscatedName("ep.u")
    public int field2307;

    @ObfuscatedName("ep.m")
    public int[] field2308;

    @ObfuscatedName("ep.b")
    public int[] field2309;

    @ObfuscatedName("ep.f")
    public String field2310 = "null";

    @ObfuscatedName("ep.d")
    public short[] field2343;

    @ObfuscatedName("ep.x")
    public short[] field2311;

    @ObfuscatedName("ep.z")
    public short[] field2330;

    @ObfuscatedName("ep.o")
    public short[] field2314;

    @ObfuscatedName("ep.c")
    public int field2315 = 1;

    @ObfuscatedName("ep.y")
    public int field2312 = 1;

    @ObfuscatedName("ep.j")
    public int field2317 = 2;

    @ObfuscatedName("ep.s")
    public boolean field2318 = true;

    @ObfuscatedName("ep.p")
    public int field2340 = -1;

    @ObfuscatedName("ep.ak")
    public int field2344 = -1;

    @ObfuscatedName("ep.ap")
    public boolean field2321 = false;

    @ObfuscatedName("ep.ai")
    public boolean field2322 = false;

    @ObfuscatedName("ep.ae")
    public int field2323 = -1;

    @ObfuscatedName("ep.ad")
    public int field2324 = 16;

    @ObfuscatedName("ep.am")
    public int field2300 = 0;

    @ObfuscatedName("ep.ah")
    public int field2337 = 0;

    @ObfuscatedName("ep.au")
    public String[] field2336 = new String[5];

    @ObfuscatedName("ep.ac")
    public int field2316 = -1;

    @ObfuscatedName("ep.at")
    public int field2329 = -1;

    @ObfuscatedName("ep.aq")
    public boolean field2333 = false;

    @ObfuscatedName("ep.ar")
    public boolean field2331 = true;

    @ObfuscatedName("ep.aa")
    public int field2332 = 128;

    @ObfuscatedName("ep.ay")
    public int field2313 = 128;

    @ObfuscatedName("ep.ax")
    public int field2334 = 128;

    @ObfuscatedName("ep.av")
    public int field2335 = 0;

    @ObfuscatedName("ep.az")
    public int field2325 = 0;

    @ObfuscatedName("ep.al")
    public int field2319 = 0;

    @ObfuscatedName("ep.ag")
    public int field2338 = 0;

    @ObfuscatedName("ep.as")
    public boolean field2327 = false;

    @ObfuscatedName("ep.ab")
    public boolean field2303 = false;

    @ObfuscatedName("ep.af")
    public int field2341 = -1;

    @ObfuscatedName("ep.an")
    public int[] field2301;

    @ObfuscatedName("ep.aj")
    public int field2320 = -1;

    @ObfuscatedName("ep.ao")
    public int field2339 = -1;

    @ObfuscatedName("ep.aw")
    public int field2345 = -1;

    @ObfuscatedName("ep.bk")
    public int field2346 = 0;

    @ObfuscatedName("ep.ba")
    public int field2347 = 0;

    @ObfuscatedName("ep.bj")
    public int field2348 = 0;

    @ObfuscatedName("ep.bs")
    public int[] field2349;

    @ObfuscatedName("ep.e(B)V")
    public void method2338() {
        if (this.field2340 == -1) {
            this.field2340 = 0;
            if (this.field2308 != null && (this.field2309 == null || this.field2309[0] == 10)) {
                this.field2340 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2336[var1] != null) {
                    this.field2340 = 1;
                }
            }
        }
        if (this.field2341 == -1) {
            this.field2341 = this.field2317 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ep.a(Lec;B)V")
    public void method2340(class135 arg0) {
        while (true) {
            int var2 = arg0.method1571();
            if (var2 == 0) {
                return;
            }
            this.method2357(arg0, var2);
        }
    }

    @ObfuscatedName("ep.g(Lec;II)V")
    public void method2357(class135 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method1571();
            if (var3 > 0) {
                if (this.field2308 == null || field2328) {
                    this.field2309 = new int[var3];
                    this.field2308 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2308[var4] = arg0.method1725();
                        this.field2309[var4] = arg0.method1571();
                    }
                } else {
                    arg0.field1722 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2310 = arg0.method1716();
        } else if (arg1 == 5) {
            int var5 = arg0.method1571();
            if (var5 > 0) {
                if (this.field2308 == null || field2328) {
                    this.field2309 = null;
                    this.field2308 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2308[var6] = arg0.method1725();
                    }
                } else {
                    arg0.field1722 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2315 = arg0.method1571();
        } else if (arg1 == 15) {
            this.field2312 = arg0.method1571();
        } else if (arg1 == 17) {
            this.field2317 = 0;
            this.field2318 = false;
        } else if (arg1 == 18) {
            this.field2318 = false;
        } else if (arg1 == 19) {
            this.field2340 = arg0.method1571();
        } else if (arg1 == 21) {
            this.field2344 = 0;
        } else if (arg1 == 22) {
            this.field2321 = true;
        } else if (arg1 == 23) {
            this.field2322 = true;
        } else if (arg1 == 24) {
            this.field2323 = arg0.method1725();
            if (this.field2323 == 65535) {
                this.field2323 = -1;
            }
        } else if (arg1 == 27) {
            this.field2317 = 1;
        } else if (arg1 == 28) {
            this.field2324 = arg0.method1571();
        } else if (arg1 == 29) {
            this.field2300 = arg0.method1572();
        } else if (arg1 == 39) {
            this.field2337 = arg0.method1572();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2336[arg1 - 30] = arg0.method1716();
            if (this.field2336[arg1 - 30].equalsIgnoreCase(class74.field863)) {
                this.field2336[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method1571();
            this.field2343 = new short[var7];
            this.field2311 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2343[var8] = (short) arg0.method1725();
                this.field2311[var8] = (short) arg0.method1725();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method1571();
            this.field2330 = new short[var9];
            this.field2314 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2330[var10] = (short) arg0.method1725();
                this.field2314[var10] = (short) arg0.method1725();
            }
        } else if (arg1 == 60) {
            this.field2316 = arg0.method1725();
        } else if (arg1 == 62) {
            this.field2333 = true;
        } else if (arg1 == 64) {
            this.field2331 = false;
        } else if (arg1 == 65) {
            this.field2332 = arg0.method1725();
        } else if (arg1 == 66) {
            this.field2313 = arg0.method1725();
        } else if (arg1 == 67) {
            this.field2334 = arg0.method1725();
        } else if (arg1 == 68) {
            this.field2329 = arg0.method1725();
        } else if (arg1 == 69) {
            this.field2338 = arg0.method1571();
        } else if (arg1 == 70) {
            this.field2335 = arg0.method1687();
        } else if (arg1 == 71) {
            this.field2325 = arg0.method1687();
        } else if (arg1 == 72) {
            this.field2319 = arg0.method1687();
        } else if (arg1 == 73) {
            this.field2327 = true;
        } else if (arg1 == 74) {
            this.field2303 = true;
        } else if (arg1 == 75) {
            this.field2341 = arg0.method1571();
        } else if (arg1 == 77) {
            this.field2320 = arg0.method1725();
            if (this.field2320 == 65535) {
                this.field2320 = -1;
            }
            this.field2339 = arg0.method1725();
            if (this.field2339 == 65535) {
                this.field2339 = -1;
            }
            int var11 = arg0.method1571();
            this.field2301 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field2301[var12] = arg0.method1725();
                if (this.field2301[var12] == 65535) {
                    this.field2301[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field2345 = arg0.method1725();
            this.field2346 = arg0.method1571();
        } else if (arg1 == 79) {
            this.field2347 = arg0.method1725();
            this.field2348 = arg0.method1725();
            this.field2346 = arg0.method1571();
            int var13 = arg0.method1571();
            this.field2349 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2349[var14] = arg0.method1725();
            }
        } else if (arg1 == 81) {
            this.field2344 = arg0.method1571() * 256;
        }
    }

    @ObfuscatedName("ep.w(IB)Z")
    public final boolean method2341(int arg0) {
        if (this.field2309 != null) {
            for (int var4 = 0; var4 < this.field2309.length; var4++) {
                if (this.field2309[var4] == arg0) {
                    return Statics.field1582.method1017(this.field2308[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2308 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2308.length; var3++) {
                var2 &= Statics.field1582.method1017(this.field2308[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ep.v(I)Z")
    public final boolean method2348() {
        if (this.field2308 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2308.length; var2++) {
            var1 &= Statics.field1582.method1017(this.field2308[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ep.u(II[[IIIII)Lfs;")
    public final class165 method2343(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2309 == null) {
            var7 = (long) ((this.field2307 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2307 << 10) + (arg0 << 3) + arg1);
        }
        class165 var9 = (class165) field2304.method1231(var7);
        if (var9 == null) {
            class179 var10 = this.method2346(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2321) {
                var10.field2677 = (short) (this.field2300 + 64);
                var10.field2683 = (short) (this.field2337 * 25 + 768);
                var10.method2924();
                var9 = var10;
            } else {
                var9 = var10.method2928(this.field2300 + 64, this.field2337 * 25 + 768, -50, -10, -50);
            }
            field2304.method1232(var9, var7);
        }
        if (this.field2321) {
            var9 = ((class179) var9).method2912();
        }
        if (this.field2344 >= 0) {
            if (var9 instanceof class180) {
                var9 = ((class180) var9).method3027(arg2, arg3, arg4, arg5, true, this.field2344);
            } else if (var9 instanceof class179) {
                var9 = ((class179) var9).method2913(arg2, arg3, arg4, arg5, true, this.field2344);
            }
        }
        return var9;
    }

    @ObfuscatedName("ep.m(II[[IIIII)Lfr;")
    public final class180 method2344(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2309 == null) {
            var7 = (long) ((this.field2307 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2307 << 10) + (arg0 << 3) + arg1);
        }
        class180 var9 = (class180) field2305.method1231(var7);
        if (var9 == null) {
            class179 var10 = this.method2346(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2928(this.field2300 + 64, this.field2337 * 25 + 768, -50, -10, -50);
            field2305.method1232(var9, var7);
        }
        if (this.field2344 >= 0) {
            var9 = var9.method3027(arg2, arg3, arg4, arg5, true, this.field2344);
        }
        return var9;
    }

    @ObfuscatedName("ep.b(II[[IIIILea;IB)Lfr;")
    public final class180 method2345(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class155 arg6, int arg7) {
        long var9;
        if (this.field2309 == null) {
            var9 = (long) ((this.field2307 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2307 << 10) + (arg0 << 3) + arg1);
        }
        class180 var11 = (class180) field2305.method1231(var9);
        if (var11 == null) {
            class179 var12 = this.method2346(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2928(this.field2300 + 64, this.field2337 * 25 + 768, -50, -10, -50);
            field2305.method1232(var11, var9);
        }
        if (arg6 == null && this.field2344 == -1) {
            return var11;
        }
        class180 var13;
        if (arg6 == null) {
            var13 = var11.method3010(true);
        } else {
            var13 = arg6.method2387(var11, arg7, arg1);
        }
        if (this.field2344 >= 0) {
            var13 = var13.method3027(arg2, arg3, arg4, arg5, false, this.field2344);
        }
        return var13;
    }

    @ObfuscatedName("ep.f(III)Lfv;")
    public final class179 method2346(int arg0, int arg1) {
        class179 var3 = null;
        if (this.field2309 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2308 == null) {
                return null;
            }
            boolean var4 = this.field2333;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2308.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2308[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class179) field2326.method1231((long) var7);
                if (var3 == null) {
                    var3 = class179.method2908(Statics.field1582, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2970();
                    }
                    field2326.method1232(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2306[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class179(field2306, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2309.length; var9++) {
                if (this.field2309[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2308[var8];
            boolean var11 = this.field2333 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class179) field2326.method1231((long) var10);
            if (var3 == null) {
                var3 = class179.method2908(Statics.field1582, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2970();
                }
                field2326.method1232(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2332 == 128 && this.field2313 == 128 && this.field2334 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2335 == 0 && this.field2325 == 0 && this.field2319 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class179 var14 = new class179(var3, arg1 == 0 && !var12 && !var13, this.field2343 == null, this.field2330 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2918(256);
            var14.method2919(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2915();
        } else if (var15 == 2) {
            var14.method2916();
        } else if (var15 == 3) {
            var14.method2917();
        }
        if (this.field2343 != null) {
            for (int var16 = 0; var16 < this.field2343.length; var16++) {
                var14.method2920(this.field2343[var16], this.field2311[var16]);
            }
        }
        if (this.field2330 != null) {
            for (int var17 = 0; var17 < this.field2330.length; var17++) {
                var14.method2921(this.field2330[var17], this.field2314[var17]);
            }
        }
        if (var12) {
            var14.method2932(this.field2332, this.field2313, this.field2334);
        }
        if (var13) {
            var14.method2919(this.field2335, this.field2325, this.field2319);
        }
        return var14;
    }

    @ObfuscatedName("ep.d(B)Lep;")
    public final class153 method2342() {
        int var1 = -1;
        if (this.field2320 != -1) {
            var1 = Statics.method11(this.field2320);
        } else if (this.field2339 != -1) {
            var1 = class89.field1205[this.field2339];
        }
        return var1 < 0 || var1 >= this.field2301.length || this.field2301[var1] == -1 ? null : Statics.method1460(this.field2301[var1]);
    }

    @ObfuscatedName("ch.x(I)V")
    public static void method1208() {
        field2302.method1221();
        field2326.method1221();
        field2304.method1221();
        field2305.method1221();
    }

    @ObfuscatedName("ep.z(I)Z")
    public boolean method2356() {
        if (this.field2301 == null) {
            return this.field2345 != -1 || this.field2349 != null;
        }
        for (int var1 = 0; var1 < this.field2301.length; var1++) {
            if (this.field2301[var1] != -1) {
                class153 var2 = Statics.method1460(this.field2301[var1]);
                if (var2.field2345 != -1 || var2.field2349 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
