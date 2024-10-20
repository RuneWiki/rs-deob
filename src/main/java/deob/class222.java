package deob;

@ObfuscatedName("is")
public class class222 extends class489 {

    @ObfuscatedName("is.az")
    public static boolean field2289 = false;

    @ObfuscatedName("is.at")
    public static class304 field2292 = new class304(4096);

    @ObfuscatedName("is.an")
    public static class304 field2250 = new class304(500);

    @ObfuscatedName("is.ao")
    public static class304 field2251 = new class304(30);

    @ObfuscatedName("is.ab")
    public static class304 field2252 = new class304(30);

    @ObfuscatedName("is.aw")
    public static class238[] field2246 = new class238[4];

    @ObfuscatedName("is.ad")
    public int field2254;

    @ObfuscatedName("is.al")
    public int[] field2255;

    @ObfuscatedName("is.as")
    public int[] field2256;

    @ObfuscatedName("is.ag")
    public String field2257 = class370.field4272;

    @ObfuscatedName("is.ai")
    public short[] field2258;

    @ObfuscatedName("is.ax")
    public short[] field2293;

    @ObfuscatedName("is.ar")
    public short[] field2260;

    @ObfuscatedName("is.aj")
    public short[] field2261;

    @ObfuscatedName("is.au")
    public int field2262 = 1;

    @ObfuscatedName("is.ay")
    public int field2263 = 1;

    @ObfuscatedName("is.ap")
    public int field2265 = 2;

    @ObfuscatedName("is.av")
    public boolean field2275 = true;

    @ObfuscatedName("is.aa")
    public int field2266 = -1;

    @ObfuscatedName("is.aq")
    public int field2299 = -1;

    @ObfuscatedName("is.am")
    public boolean field2268 = false;

    @ObfuscatedName("is.ac")
    public boolean field2269 = false;

    @ObfuscatedName("is.ae")
    public int field2270 = -1;

    @ObfuscatedName("is.ak")
    public int field2271 = 16;

    @ObfuscatedName("is.bp")
    public int field2273 = 0;

    @ObfuscatedName("is.bz")
    public int field2259 = 0;

    @ObfuscatedName("is.bc")
    public String[] field2274 = new String[5];

    @ObfuscatedName("is.bf")
    public int field2283 = -1;

    @ObfuscatedName("is.be")
    public int field2276 = -1;

    @ObfuscatedName("is.bn")
    public boolean field2277 = false;

    @ObfuscatedName("is.bd")
    public boolean field2278 = true;

    @ObfuscatedName("is.bo")
    public int field2279 = 128;

    @ObfuscatedName("is.bx")
    public int field2280 = 128;

    @ObfuscatedName("is.bl")
    public int field2249 = 128;

    @ObfuscatedName("is.bh")
    public int field2282 = 0;

    @ObfuscatedName("is.bs")
    public int field2267 = 0;

    @ObfuscatedName("is.bj")
    public int field2284 = 0;

    @ObfuscatedName("is.bu")
    public boolean field2288 = false;

    @ObfuscatedName("is.br")
    public boolean field2286 = false;

    @ObfuscatedName("is.bb")
    public int field2287 = -1;

    @ObfuscatedName("is.by")
    public int[] field2290;

    @ObfuscatedName("is.bk")
    public int field2272 = -1;

    @ObfuscatedName("is.bt")
    public int field2264 = -1;

    @ObfuscatedName("is.bq")
    public int field2253 = -1;

    @ObfuscatedName("is.bi")
    public int field2285 = 0;

    @ObfuscatedName("is.bw")
    public int field2297 = 0;

    @ObfuscatedName("is.bm")
    public int field2294 = 0;

    @ObfuscatedName("is.ba")
    public int field2295 = 0;

    @ObfuscatedName("is.bv")
    public int[] field2296;

    @ObfuscatedName("is.bg")
    public boolean field2281 = true;

    @ObfuscatedName("is.cb")
    public boolean field2298 = false;

    @ObfuscatedName("is.cj")
    public class508 field2291;

    @ObfuscatedName("dc.az(Loc;Loc;ZI)V")
    public static void method2543(class379 arg0, class379 arg1, boolean arg2) {
        Statics.field2247 = arg0;
        Statics.field2248 = arg1;
        field2289 = arg2;
    }

    @ObfuscatedName("dw.ah(II)Lis;")
    public static class222 method2212(int arg0) {
        class222 var1 = (class222) field2292.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2247.method6328(6, arg0);
        class222 var3 = new class222();
        var3.field2254 = arg0;
        if (var2 != null) {
            var3.method3749(new class535(var2));
        }
        var3.method3767();
        if (var3.field2286) {
            var3.field2265 = 0;
            var3.field2275 = false;
        }
        field2292.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.af(I)V")
    public void method3767() {
        if (this.field2266 == -1) {
            this.field2266 = 0;
            if (this.field2255 != null && (this.field2256 == null || this.field2256[0] == 10)) {
                this.field2266 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2274[var1] != null) {
                    this.field2266 = 1;
                }
            }
        }
        if (this.field2287 == -1) {
            this.field2287 = this.field2265 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("is.at(Lur;I)V")
    public void method3749(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3778(arg0, var2);
        }
    }

    @ObfuscatedName("is.an(Lur;IB)V")
    public void method3778(class535 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8462();
            if (var3 > 0) {
                if (this.field2255 == null || field2289) {
                    this.field2256 = new int[var3];
                    this.field2255 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2255[var4] = arg0.method8670();
                        this.field2256[var4] = arg0.method8462();
                    }
                } else {
                    arg0.field5233 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2257 = arg0.method8473();
        } else if (arg1 == 5) {
            int var5 = arg0.method8462();
            if (var5 > 0) {
                if (this.field2255 == null || field2289) {
                    this.field2256 = null;
                    this.field2255 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2255[var6] = arg0.method8670();
                    }
                } else {
                    arg0.field5233 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2262 = arg0.method8462();
        } else if (arg1 == 15) {
            this.field2263 = arg0.method8462();
        } else if (arg1 == 17) {
            this.field2265 = 0;
            this.field2275 = false;
        } else if (arg1 == 18) {
            this.field2275 = false;
        } else if (arg1 == 19) {
            this.field2266 = arg0.method8462();
        } else if (arg1 == 21) {
            this.field2299 = 0;
        } else if (arg1 == 22) {
            this.field2268 = true;
        } else if (arg1 == 23) {
            this.field2269 = true;
        } else if (arg1 == 24) {
            this.field2270 = arg0.method8670();
            if (this.field2270 == 65535) {
                this.field2270 = -1;
            }
        } else if (arg1 == 27) {
            this.field2265 = 1;
        } else if (arg1 == 28) {
            this.field2271 = arg0.method8462();
        } else if (arg1 == 29) {
            this.field2273 = arg0.method8463();
        } else if (arg1 == 39) {
            this.field2259 = arg0.method8463() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2274[arg1 - 30] = arg0.method8473();
            if (this.field2274[arg1 - 30].equalsIgnoreCase(class370.field4010)) {
                this.field2274[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method8462();
            this.field2258 = new short[var7];
            this.field2293 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2258[var8] = (short) arg0.method8670();
                this.field2293[var8] = (short) arg0.method8670();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method8462();
            this.field2260 = new short[var9];
            this.field2261 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2260[var10] = (short) arg0.method8670();
                this.field2261[var10] = (short) arg0.method8670();
            }
        } else if (arg1 == 61) {
            arg0.method8670();
        } else if (arg1 == 62) {
            this.field2277 = true;
        } else if (arg1 == 64) {
            this.field2278 = false;
        } else if (arg1 == 65) {
            this.field2279 = arg0.method8670();
        } else if (arg1 == 66) {
            this.field2280 = arg0.method8670();
        } else if (arg1 == 67) {
            this.field2249 = arg0.method8670();
        } else if (arg1 == 68) {
            this.field2276 = arg0.method8670();
        } else if (arg1 == 69) {
            arg0.method8462();
        } else if (arg1 == 70) {
            this.field2282 = arg0.method8465();
        } else if (arg1 == 71) {
            this.field2267 = arg0.method8465();
        } else if (arg1 == 72) {
            this.field2284 = arg0.method8465();
        } else if (arg1 == 73) {
            this.field2288 = true;
        } else if (arg1 == 74) {
            this.field2286 = true;
        } else if (arg1 == 75) {
            this.field2287 = arg0.method8462();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2272 = arg0.method8670();
            if (this.field2272 == 65535) {
                this.field2272 = -1;
            }
            this.field2264 = arg0.method8670();
            if (this.field2264 == 65535) {
                this.field2264 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8670();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method8462();
            this.field2290 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2290[var15] = arg0.method8670();
                if (this.field2290[var15] == 65535) {
                    this.field2290[var15] = -1;
                }
            }
            this.field2290[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2253 = arg0.method8670();
            this.field2285 = arg0.method8462();
            this.field2297 = arg0.method8462();
        } else if (arg1 == 79) {
            this.field2294 = arg0.method8670();
            this.field2295 = arg0.method8670();
            this.field2285 = arg0.method8462();
            this.field2297 = arg0.method8462();
            int var11 = arg0.method8462();
            this.field2296 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2296[var12] = arg0.method8670();
            }
        } else if (arg1 == 81) {
            arg0.method8462();
        } else if (arg1 == 82) {
            this.field2283 = arg0.method8670();
        } else if (arg1 == 89) {
            this.field2281 = false;
        } else if (arg1 == 90) {
            this.field2298 = true;
        } else if (arg1 == 249) {
            this.field2291 = class201.method2084(arg0, this.field2291);
        }
    }

    @ObfuscatedName("is.ao(II)Z")
    public final boolean method3770(int arg0) {
        if (this.field2256 != null) {
            for (int var4 = 0; var4 < this.field2256.length; var4++) {
                if (this.field2256[var4] == arg0) {
                    return Statics.field2248.method6330(this.field2255[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2255 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2255.length; var3++) {
                var2 &= Statics.field2248.method6330(this.field2255[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("is.ab(I)Z")
    public final boolean method3747() {
        if (this.field2255 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2255.length; var2++) {
            var1 &= Statics.field2248.method6330(this.field2255[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("is.aw(II[[IIIII)Ljd;")
    public final class249 method3753(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2256 == null) {
            var7 = (long) ((this.field2254 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2254 << 10) + (arg0 << 3) + arg1);
        }
        class249 var9 = (class249) field2251.method5336(var7);
        if (var9 == null) {
            class238 var10 = this.method3756(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2268) {
                var10.field2538 = (short) (this.field2273 + 64);
                var10.field2539 = (short) (this.field2259 + 768);
                var10.method4173();
                var9 = var10;
            } else {
                var9 = var10.method4138(this.field2273 + 64, this.field2259 + 768, -50, -10, -50);
            }
            field2251.method5346(var9, var7);
        }
        if (this.field2268) {
            var9 = ((class238) var9).method4123();
        }
        if (this.field2299 >= 0) {
            if (var9 instanceof class256) {
                var9 = ((class256) var9).method4585(arg2, arg3, arg4, arg5, true, this.field2299);
            } else if (var9 instanceof class238) {
                var9 = ((class238) var9).method4124(arg2, arg3, arg4, arg5, true, this.field2299);
            }
        }
        return var9;
    }

    @ObfuscatedName("is.ad(II[[IIIIS)Ljn;")
    public final class256 method3752(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2256 == null) {
            var7 = (long) ((this.field2254 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2254 << 10) + (arg0 << 3) + arg1);
        }
        class256 var9 = (class256) field2252.method5336(var7);
        if (var9 == null) {
            class238 var10 = this.method3756(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4138(this.field2273 + 64, this.field2259 + 768, -50, -10, -50);
            field2252.method5346(var9, var7);
        }
        if (this.field2299 >= 0) {
            var9 = var9.method4585(arg2, arg3, arg4, arg5, true, this.field2299);
        }
        return var9;
    }

    @ObfuscatedName("is.al(II[[IIIILig;IB)Ljn;")
    public final class256 method3790(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class225 arg6, int arg7) {
        long var9;
        if (this.field2256 == null) {
            var9 = (long) ((this.field2254 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2254 << 10) + (arg0 << 3) + arg1);
        }
        class256 var11 = (class256) field2252.method5336(var9);
        if (var11 == null) {
            class238 var12 = this.method3756(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method4138(this.field2273 + 64, this.field2259 + 768, -50, -10, -50);
            field2252.method5346(var11, var9);
        }
        if (arg6 == null && this.field2299 == -1) {
            return var11;
        }
        class256 var13;
        if (arg6 == null) {
            var13 = var11.method4586(true);
        } else {
            var13 = arg6.method3906(var11, arg7, arg1);
        }
        if (this.field2299 >= 0) {
            var13 = var13.method4585(arg2, arg3, arg4, arg5, false, this.field2299);
        }
        return var13;
    }

    @ObfuscatedName("is.as(IIS)Ljj;")
    public final class238 method3756(int arg0, int arg1) {
        class238 var3 = null;
        if (this.field2256 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2255 == null) {
                return null;
            }
            boolean var4 = this.field2277;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2255.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2255[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class238) field2250.method5336((long) var7);
                if (var3 == null) {
                    var3 = class238.method4116(Statics.field2248, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method4132();
                    }
                    field2250.method5346(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2246[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class238(field2246, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2256.length; var9++) {
                if (this.field2256[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2255[var8];
            boolean var11 = this.field2277 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class238) field2250.method5336((long) var10);
            if (var3 == null) {
                var3 = class238.method4116(Statics.field2248, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method4132();
                }
                field2250.method5346(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2279 == 128 && this.field2280 == 128 && this.field2249 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2282 == 0 && this.field2267 == 0 && this.field2284 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class238 var14 = new class238(var3, arg1 == 0 && !var12 && !var13, this.field2258 == null, this.field2260 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method4129(256);
            var14.method4130(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method4126();
        } else if (var15 == 2) {
            var14.method4122();
        } else if (var15 == 3) {
            var14.method4175();
        }
        if (this.field2258 != null) {
            for (int var16 = 0; var16 < this.field2258.length; var16++) {
                var14.method4131(this.field2258[var16], this.field2293[var16]);
            }
        }
        if (this.field2260 != null) {
            for (int var17 = 0; var17 < this.field2260.length; var17++) {
                var14.method4135(this.field2260[var17], this.field2261[var17]);
            }
        }
        if (var12) {
            var14.method4133(this.field2279, this.field2280, this.field2249);
        }
        if (var13) {
            var14.method4130(this.field2282, this.field2267, this.field2284);
        }
        return var14;
    }

    @ObfuscatedName("is.ag(I)Lis;")
    public final class222 method3755() {
        int var1 = -1;
        if (this.field2272 != -1) {
            var1 = class338.method3618(this.field2272);
        } else if (this.field2264 != -1) {
            var1 = class338.field3634[this.field2264];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2290.length - 1) {
            var2 = this.field2290[var1];
        } else {
            var2 = this.field2290[this.field2290.length - 1];
        }
        return var2 == -1 ? null : method2212(var2);
    }

    @ObfuscatedName("is.ai(III)I")
    public int method3757(int arg0, int arg1) {
        return Statics.method3746(this.field2291, arg0, arg1);
    }

    @ObfuscatedName("is.ax(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3759(int arg0, String arg1) {
        return class201.method396(this.field2291, arg0, arg1);
    }

    @ObfuscatedName("kk.ar(I)V")
    public static void method4812() {
        field2292.method5339();
        field2250.method5339();
        field2251.method5339();
        field2252.method5339();
    }

    @ObfuscatedName("is.aj(B)Z")
    public boolean method3760() {
        if (this.field2290 == null) {
            return this.field2253 != -1 || this.field2296 != null;
        }
        for (int var1 = 0; var1 < this.field2290.length; var1++) {
            if (this.field2290[var1] != -1) {
                class222 var2 = method2212(this.field2290[var1]);
                if (var2.field2253 != -1 || var2.field2296 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
