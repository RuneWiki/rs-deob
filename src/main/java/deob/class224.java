package deob;

@ObfuscatedName("in")
public class class224 extends class500 {

    @ObfuscatedName("in.ak")
    public static boolean field2327 = false;

    @ObfuscatedName("in.az")
    public static class312 field2278 = new class312(4096);

    @ObfuscatedName("in.af")
    public static class312 field2315 = new class312(500);

    @ObfuscatedName("in.aa")
    public static class312 field2280 = new class312(30);

    @ObfuscatedName("in.at")
    public static class312 field2281 = new class312(30);

    @ObfuscatedName("in.ab")
    public static class243[] field2282 = new class243[4];

    @ObfuscatedName("in.ac")
    public int field2283;

    @ObfuscatedName("in.ao")
    public int[] field2308;

    @ObfuscatedName("in.ah")
    public int[] field2285;

    @ObfuscatedName("in.av")
    public String field2286 = class378.field4097;

    @ObfuscatedName("in.aq")
    public short[] field2287;

    @ObfuscatedName("in.ap")
    public short[] field2288;

    @ObfuscatedName("in.ae")
    public short[] field2289;

    @ObfuscatedName("in.ax")
    public short[] field2276;

    @ObfuscatedName("in.ay")
    public int field2291 = 1;

    @ObfuscatedName("in.au")
    public int field2292 = 1;

    @ObfuscatedName("in.as")
    public int field2321 = 2;

    @ObfuscatedName("in.aw")
    public boolean field2294 = true;

    @ObfuscatedName("in.ad")
    public int field2293 = -1;

    @ObfuscatedName("in.ai")
    public int field2296 = -1;

    @ObfuscatedName("in.an")
    public boolean field2298 = false;

    @ObfuscatedName("in.am")
    public boolean field2279 = false;

    @ObfuscatedName("in.ar")
    public int field2299 = -1;

    @ObfuscatedName("in.ag")
    public int field2300 = 16;

    @ObfuscatedName("in.bs")
    public int field2301 = 0;

    @ObfuscatedName("in.bf")
    public int field2302 = 0;

    @ObfuscatedName("in.bo")
    public String[] field2303 = new String[5];

    @ObfuscatedName("in.bi")
    public int field2311 = -1;

    @ObfuscatedName("in.bt")
    public int field2305 = -1;

    @ObfuscatedName("in.bn")
    public boolean field2306 = false;

    @ObfuscatedName("in.bw")
    public boolean field2307 = true;

    @ObfuscatedName("in.bl")
    public int field2290 = 128;

    @ObfuscatedName("in.be")
    public int field2309 = 128;

    @ObfuscatedName("in.bg")
    public int field2313 = 128;

    @ObfuscatedName("in.bu")
    public int field2295 = 0;

    @ObfuscatedName("in.bh")
    public int field2297 = 0;

    @ObfuscatedName("in.bk")
    public int field2310 = 0;

    @ObfuscatedName("in.bp")
    public boolean field2314 = false;

    @ObfuscatedName("in.br")
    public boolean field2318 = false;

    @ObfuscatedName("in.bx")
    public int field2326 = -1;

    @ObfuscatedName("in.bd")
    public int[] field2317;

    @ObfuscatedName("in.bv")
    public int field2324 = -1;

    @ObfuscatedName("in.bm")
    public int field2319 = -1;

    @ObfuscatedName("in.bq")
    public int field2284 = -1;

    @ObfuscatedName("in.bj")
    public int field2312 = 0;

    @ObfuscatedName("in.bc")
    public int field2322 = 0;

    @ObfuscatedName("in.bz")
    public int field2323 = 0;

    @ObfuscatedName("in.ba")
    public int field2320 = 0;

    @ObfuscatedName("in.bb")
    public int[] field2325;

    @ObfuscatedName("in.by")
    public boolean field2304 = true;

    @ObfuscatedName("in.cw")
    public boolean field2316 = false;

    @ObfuscatedName("in.ck")
    public class519 field2328;

    @ObfuscatedName("bd.ak(Lor;Lor;ZI)V")
    public static void method809(class387 arg0, class387 arg1, boolean arg2) {
        Statics.field2277 = arg0;
        Statics.field6 = arg1;
        field2327 = arg2;
    }

    @ObfuscatedName("ij.al(II)Lin;")
    public static class224 method3868(int arg0) {
        class224 var1 = (class224) field2278.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2277.method6573(6, arg0);
        class224 var3 = new class224();
        var3.field2283 = arg0;
        if (var2 != null) {
            var3.method3874(new class546(var2));
        }
        var3.method3873();
        if (var3.field2318) {
            var3.field2321 = 0;
            var3.field2294 = false;
        }
        field2278.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.aj(I)V")
    public void method3873() {
        if (this.field2293 == -1) {
            this.field2293 = 0;
            if (this.field2308 != null && (this.field2285 == null || this.field2285[0] == 10)) {
                this.field2293 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2303[var1] != null) {
                    this.field2293 = 1;
                }
            }
        }
        if (this.field2326 == -1) {
            this.field2326 = this.field2321 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("in.az(Lua;I)V")
    public void method3874(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3875(arg0, var2);
        }
    }

    @ObfuscatedName("in.af(Lua;II)V")
    public void method3875(class546 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8796();
            if (var3 > 0) {
                if (this.field2308 == null || field2327) {
                    this.field2285 = new int[var3];
                    this.field2308 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2308[var4] = arg0.method8798();
                        this.field2285[var4] = arg0.method8796();
                    }
                } else {
                    arg0.field5344 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2286 = arg0.method8806();
        } else if (arg1 == 5) {
            int var5 = arg0.method8796();
            if (var5 > 0) {
                if (this.field2308 == null || field2327) {
                    this.field2285 = null;
                    this.field2308 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2308[var6] = arg0.method8798();
                    }
                } else {
                    arg0.field5344 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2291 = arg0.method8796();
        } else if (arg1 == 15) {
            this.field2292 = arg0.method8796();
        } else if (arg1 == 17) {
            this.field2321 = 0;
            this.field2294 = false;
        } else if (arg1 == 18) {
            this.field2294 = false;
        } else if (arg1 == 19) {
            this.field2293 = arg0.method8796();
        } else if (arg1 == 21) {
            this.field2296 = 0;
        } else if (arg1 == 22) {
            this.field2298 = true;
        } else if (arg1 == 23) {
            this.field2279 = true;
        } else if (arg1 == 24) {
            this.field2299 = arg0.method8798();
            if (this.field2299 == 65535) {
                this.field2299 = -1;
            }
        } else if (arg1 == 27) {
            this.field2321 = 1;
        } else if (arg1 == 28) {
            this.field2300 = arg0.method8796();
        } else if (arg1 == 29) {
            this.field2301 = arg0.method8797();
        } else if (arg1 == 39) {
            this.field2302 = arg0.method8797() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2303[arg1 - 30] = arg0.method8806();
            if (this.field2303[arg1 - 30].equalsIgnoreCase(class378.field4092)) {
                this.field2303[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method8796();
            this.field2287 = new short[var7];
            this.field2288 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2287[var8] = (short) arg0.method8798();
                this.field2288[var8] = (short) arg0.method8798();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method8796();
            this.field2289 = new short[var9];
            this.field2276 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2289[var10] = (short) arg0.method8798();
                this.field2276[var10] = (short) arg0.method8798();
            }
        } else if (arg1 == 61) {
            arg0.method8798();
        } else if (arg1 == 62) {
            this.field2306 = true;
        } else if (arg1 == 64) {
            this.field2307 = false;
        } else if (arg1 == 65) {
            this.field2290 = arg0.method8798();
        } else if (arg1 == 66) {
            this.field2309 = arg0.method8798();
        } else if (arg1 == 67) {
            this.field2313 = arg0.method8798();
        } else if (arg1 == 68) {
            this.field2305 = arg0.method8798();
        } else if (arg1 == 69) {
            arg0.method8796();
        } else if (arg1 == 70) {
            this.field2295 = arg0.method8926();
        } else if (arg1 == 71) {
            this.field2297 = arg0.method8926();
        } else if (arg1 == 72) {
            this.field2310 = arg0.method8926();
        } else if (arg1 == 73) {
            this.field2314 = true;
        } else if (arg1 == 74) {
            this.field2318 = true;
        } else if (arg1 == 75) {
            this.field2326 = arg0.method8796();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2324 = arg0.method8798();
            if (this.field2324 == 65535) {
                this.field2324 = -1;
            }
            this.field2319 = arg0.method8798();
            if (this.field2319 == 65535) {
                this.field2319 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8798();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method8796();
            this.field2317 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2317[var15] = arg0.method8798();
                if (this.field2317[var15] == 65535) {
                    this.field2317[var15] = -1;
                }
            }
            this.field2317[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2284 = arg0.method8798();
            this.field2312 = arg0.method8796();
            this.field2322 = arg0.method8796();
        } else if (arg1 == 79) {
            this.field2323 = arg0.method8798();
            this.field2320 = arg0.method8798();
            this.field2312 = arg0.method8796();
            this.field2322 = arg0.method8796();
            int var11 = arg0.method8796();
            this.field2325 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2325[var12] = arg0.method8798();
            }
        } else if (arg1 == 81) {
            arg0.method8796();
        } else if (arg1 == 82) {
            this.field2311 = arg0.method8798();
        } else if (arg1 == 89) {
            this.field2304 = false;
        } else if (arg1 == 90) {
            this.field2316 = true;
        } else if (arg1 == 249) {
            this.field2328 = class203.method2113(arg0, this.field2328);
        }
    }

    @ObfuscatedName("in.aa(II)Z")
    public final boolean method3876(int arg0) {
        if (this.field2285 != null) {
            for (int var4 = 0; var4 < this.field2285.length; var4++) {
                if (this.field2285[var4] == arg0) {
                    return Statics.field6.method6586(this.field2308[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2308 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2308.length; var3++) {
                var2 &= Statics.field6.method6586(this.field2308[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("in.at(I)Z")
    public final boolean method3877() {
        if (this.field2308 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2308.length; var2++) {
            var1 &= Statics.field6.method6586(this.field2308[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("in.ab(II[[IIIII)Lju;")
    public final class256 method3878(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2285 == null) {
            var7 = (long) ((this.field2283 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2283 << 10) + (arg0 << 3) + arg1);
        }
        class256 var9 = (class256) field2280.method5570(var7);
        if (var9 == null) {
            class243 var10 = this.method3915(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2298) {
                var10.field2596 = (short) (this.field2301 + 64);
                var10.field2592 = (short) (this.field2302 + 768);
                var10.method4243();
                var9 = var10;
            } else {
                var9 = var10.method4252(this.field2301 + 64, this.field2302 + 768, -50, -10, -50);
            }
            field2280.method5564(var9, var7);
        }
        if (this.field2298) {
            var9 = ((class243) var9).method4245();
        }
        if (this.field2296 >= 0) {
            if (var9 instanceof class264) {
                var9 = ((class264) var9).method4866(arg2, arg3, arg4, arg5, true, this.field2296);
            } else if (var9 instanceof class243) {
                var9 = ((class243) var9).method4246(arg2, arg3, arg4, arg5, true, this.field2296);
            }
        }
        return var9;
    }

    @ObfuscatedName("in.ac(II[[IIIII)Lkb;")
    public final class264 method3895(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2285 == null) {
            var7 = (long) ((this.field2283 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2283 << 10) + (arg0 << 3) + arg1);
        }
        class264 var9 = (class264) field2281.method5570(var7);
        if (var9 == null) {
            class243 var10 = this.method3915(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4252(this.field2301 + 64, this.field2302 + 768, -50, -10, -50);
            field2281.method5564(var9, var7);
        }
        if (this.field2296 >= 0) {
            var9 = var9.method4866(arg2, arg3, arg4, arg5, true, this.field2296);
        }
        return var9;
    }

    @ObfuscatedName("in.ao(II[[IIIILic;II)Lkb;")
    public final class264 method3906(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class227 arg6, int arg7) {
        long var9;
        if (this.field2285 == null) {
            var9 = (long) ((this.field2283 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2283 << 10) + (arg0 << 3) + arg1);
        }
        class264 var11 = (class264) field2281.method5570(var9);
        if (var11 == null) {
            class243 var12 = this.method3915(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method4252(this.field2301 + 64, this.field2302 + 768, -50, -10, -50);
            field2281.method5564(var11, var9);
        }
        if (arg6 == null && this.field2296 == -1) {
            return var11;
        }
        class264 var13;
        if (arg6 == null) {
            var13 = var11.method4842(true);
        } else {
            var13 = arg6.method4013(var11, arg7, arg1);
        }
        if (this.field2296 >= 0) {
            var13 = var13.method4866(arg2, arg3, arg4, arg5, false, this.field2296);
        }
        return var13;
    }

    @ObfuscatedName("in.ah(III)Ljb;")
    public final class243 method3915(int arg0, int arg1) {
        class243 var3 = null;
        if (this.field2285 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2308 == null) {
                return null;
            }
            boolean var4 = this.field2306;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2308.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2308[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class243) field2315.method5570((long) var7);
                if (var3 == null) {
                    var3 = class243.method4274(Statics.field6, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method4255();
                    }
                    field2315.method5564(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2282[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class243(field2282, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2285.length; var9++) {
                if (this.field2285[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2308[var8];
            boolean var11 = this.field2306 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class243) field2315.method5570((long) var10);
            if (var3 == null) {
                var3 = class243.method4274(Statics.field6, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method4255();
                }
                field2315.method5564(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2290 == 128 && this.field2309 == 128 && this.field2313 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2295 == 0 && this.field2297 == 0 && this.field2310 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class243 var14 = new class243(var3, arg1 == 0 && !var12 && !var13, this.field2287 == null, this.field2289 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method4277(256);
            var14.method4238(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method4262();
        } else if (var15 == 2) {
            var14.method4249();
        } else if (var15 == 3) {
            var14.method4250();
        }
        if (this.field2287 != null) {
            for (int var16 = 0; var16 < this.field2287.length; var16++) {
                var14.method4253(this.field2287[var16], this.field2288[var16]);
            }
        }
        if (this.field2289 != null) {
            for (int var17 = 0; var17 < this.field2289.length; var17++) {
                var14.method4280(this.field2289[var17], this.field2276[var17]);
            }
        }
        if (var12) {
            var14.method4256(this.field2290, this.field2309, this.field2313);
        }
        if (var13) {
            var14.method4238(this.field2295, this.field2297, this.field2310);
        }
        return var14;
    }

    @ObfuscatedName("in.av(I)Lin;")
    public final class224 method3882() {
        int var1 = -1;
        if (this.field2324 != -1) {
            var1 = class346.method5576(this.field2324);
        } else if (this.field2319 != -1) {
            var1 = class346.field3710[this.field2319];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2317.length - 1) {
            var2 = this.field2317[var1];
        } else {
            var2 = this.field2317[this.field2317.length - 1];
        }
        return var2 == -1 ? null : method3868(var2);
    }

    @ObfuscatedName("in.aq(III)I")
    public int method3883(int arg0, int arg1) {
        class519 var3 = this.field2328;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class503 var5 = (class503) var3.method8506((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field5047;
            }
        }
        return var4;
    }

    @ObfuscatedName("in.ap(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3896(int arg0, String arg1) {
        return class203.method2600(this.field2328, arg0, arg1);
    }

    @ObfuscatedName("in.ax(I)Z")
    public boolean method3911() {
        if (this.field2317 == null) {
            return this.field2284 != -1 || this.field2325 != null;
        }
        for (int var1 = 0; var1 < this.field2317.length; var1++) {
            if (this.field2317[var1] != -1) {
                class224 var2 = method3868(this.field2317[var1]);
                if (var2.field2284 != -1 || var2.field2325 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
