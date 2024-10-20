package deob;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ig")
public class class225 extends class489 {

    @ObfuscatedName("ig.az")
    public static boolean field2401 = false;

    @ObfuscatedName("ig.aw")
    public static class304 field2380 = new class304(64);

    @ObfuscatedName("ig.ad")
    public static class304 field2395 = new class304(100);

    @ObfuscatedName("ig.al")
    public static class304 field2381 = new class304(100);

    @ObfuscatedName("ig.as")
    public int field2382 = -1;

    @ObfuscatedName("ig.ag")
    public Map field2374;

    @ObfuscatedName("ig.ai")
    public int field2384 = 0;

    @ObfuscatedName("ig.ax")
    public int field2385 = 0;

    @ObfuscatedName("ig.ar")
    public int[] field2386;

    @ObfuscatedName("ig.aj")
    public int[] field2387;

    @ObfuscatedName("ig.au")
    public int[] field2393;

    @ObfuscatedName("ig.ay")
    public class221[] field2375;

    @ObfuscatedName("ig.ap")
    public int field2390 = -1;

    @ObfuscatedName("ig.av")
    public int[] field2391;

    @ObfuscatedName("ig.aa")
    public boolean[] field2392;

    @ObfuscatedName("ig.aq")
    public boolean field2377 = false;

    @ObfuscatedName("ig.am")
    public int field2394 = 5;

    @ObfuscatedName("ig.ac")
    public int field2383 = -1;

    @ObfuscatedName("ig.ae")
    public int field2379 = -1;

    @ObfuscatedName("ig.ak")
    public int field2389 = 99;

    @ObfuscatedName("ig.bp")
    public boolean field2398 = false;

    @ObfuscatedName("ig.bz")
    public int field2399 = -1;

    @ObfuscatedName("ig.bc")
    public int field2400 = -1;

    @ObfuscatedName("ig.bf")
    public int field2397 = 2;

    @ObfuscatedName("am.az(IB)Lig;")
    public static class225 method288(int arg0) {
        class225 var1 = (class225) field2380.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2378.method6328(12, arg0);
        class225 var3 = new class225();
        if (var2 != null) {
            var3.method3924(new class535(var2));
        }
        var3.method3896();
        field2380.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.ah(Lur;I)V")
    public void method3924(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3903(arg0, var2);
        }
    }

    @ObfuscatedName("ig.af(Lur;II)V")
    public void method3903(class535 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8670();
            this.field2393 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2393[var4] = arg0.method8670();
            }
            this.field2386 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2386[var5] = arg0.method8670();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2386[var6] += arg0.method8670() << 16;
            }
        } else if (arg1 == 2) {
            this.field2390 = arg0.method8670();
        } else if (arg1 == 3) {
            int var7 = arg0.method8462();
            this.field2391 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2391[var8] = arg0.method8462();
            }
            this.field2391[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2377 = true;
        } else if (arg1 == 5) {
            this.field2394 = arg0.method8462();
        } else if (arg1 == 6) {
            this.field2383 = arg0.method8670();
        } else if (arg1 == 7) {
            this.field2379 = arg0.method8670();
        } else if (arg1 == 8) {
            this.field2389 = arg0.method8462();
            this.field2398 = true;
        } else if (arg1 == 9) {
            this.field2399 = arg0.method8462();
        } else if (arg1 == 10) {
            this.field2400 = arg0.method8462();
        } else if (arg1 == 11) {
            this.field2397 = arg0.method8462();
        } else if (arg1 == 12) {
            int var9 = arg0.method8462();
            this.field2387 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2387[var10] = arg0.method8670();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2387[var11] += arg0.method8670() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method8462();
            this.field2375 = new class221[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                class221[] var14;
                class221 var24;
                label118: {
                    var14 = this.field2375;
                    if (arg0 != null) {
                        boolean var16 = false;
                        boolean var17 = false;
                        boolean var18 = false;
                        boolean var19 = false;
                        int var20 = arg0.method8670();
                        int var21 = arg0.method8462();
                        int var22 = arg0.method8462();
                        int var23 = arg0.method8462();
                        if (var20 >= 1 && var21 >= 1 && var22 >= 0 && var23 >= 0) {
                            var24 = new class221(var20, var21, var22, var23);
                            break label118;
                        }
                    }
                    var24 = null;
                }
                var14[var13] = var24;
            }
        } else if (arg1 == 14) {
            this.field2382 = arg0.method8682();
        } else if (arg1 == 15) {
            int var25 = arg0.method8670();
            this.field2374 = new HashMap();
            for (int var26 = 0; var26 < var25; var26++) {
                int var27;
                class221 var36;
                label103: {
                    var27 = arg0.method8670();
                    if (arg0 != null) {
                        boolean var28 = false;
                        boolean var29 = false;
                        boolean var30 = false;
                        boolean var31 = false;
                        int var32 = arg0.method8670();
                        int var33 = arg0.method8462();
                        int var34 = arg0.method8462();
                        int var35 = arg0.method8462();
                        if (var32 >= 1 && var33 >= 1 && var34 >= 0 && var35 >= 0) {
                            var36 = new class221(var32, var33, var34, var35);
                            break label103;
                        }
                    }
                    var36 = null;
                }
                this.field2374.put(var27, var36);
            }
        } else if (arg1 == 16) {
            this.field2384 = arg0.method8670();
            this.field2385 = arg0.method8670();
        } else if (arg1 == 17) {
            this.field2392 = new boolean[256];
            for (int var38 = 0; var38 < this.field2392.length; var38++) {
                this.field2392[var38] = false;
            }
            int var39 = arg0.method8462();
            for (int var40 = 0; var40 < var39; var40++) {
                this.field2392[arg0.method8462()] = true;
            }
        }
    }

    @ObfuscatedName("ig.at(I)V")
    public void method3896() {
        if (this.field2399 == -1) {
            if (this.field2391 == null && this.field2392 == null) {
                this.field2399 = 0;
            } else {
                this.field2399 = 2;
            }
        }
        if (this.field2400 != -1) {
            return;
        }
        if (this.field2391 == null && this.field2392 == null) {
            this.field2400 = 0;
        } else {
            this.field2400 = 2;
        }
    }

    @ObfuscatedName("ig.an(Ljn;IB)Ljn;")
    public class256 method3897(class256 arg0, int arg1) {
        if (this.method3940()) {
            int var7 = this.field2382;
            class139 var8;
            if (method3395(var7) == 0) {
                var8 = method2217(var7);
            } else {
                var8 = null;
            }
            if (var8 == null) {
                return arg0.method4586(true);
            } else {
                class256 var10 = arg0.method4586(!var8.method2946());
                var10.method4595(var8, arg1);
                return var10;
            }
        } else {
            int var3 = this.field2386[arg1];
            class251 var4 = method3525(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4586(true);
            } else {
                class256 var6 = arg0.method4586(!var4.method4530(var5));
                var6.method4676(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ig.ao(Ljn;III)Ljn;")
    public class256 method3906(class256 arg0, int arg1, int arg2) {
        if (!this.method3940()) {
            int var4 = this.field2386[arg1];
            class251 var5 = method3525(var4 >> 16);
            int var6 = var4 & 0xFFFF;
            if (var5 == null) {
                return arg0.method4586(true);
            }
            class256 var7 = arg0.method4586(!var5.method4530(var6));
            int var8 = arg2 & 0x3;
            if (var8 == 1) {
                var7.method4603();
            } else if (var8 == 2) {
                var7.method4602();
            } else if (var8 == 3) {
                var7.method4689();
            }
            var7.method4676(var5, var6);
            if (var8 == 1) {
                var7.method4689();
            } else if (var8 == 2) {
                var7.method4602();
            } else if (var8 == 3) {
                var7.method4603();
            }
            return var7;
        }
        int var9 = this.field2382;
        class139 var10;
        if (method3395(var9) == 0) {
            var10 = method2217(var9);
        } else {
            var10 = null;
        }
        if (var10 == null) {
            return arg0.method4586(true);
        }
        class256 var12 = arg0.method4586(!var10.method2946());
        int var13 = arg2 & 0x3;
        if (var13 == 1) {
            var12.method4603();
        } else if (var13 == 2) {
            var12.method4602();
        } else if (var13 == 3) {
            var12.method4689();
        }
        var12.method4595(var10, arg1);
        if (var13 == 1) {
            var12.method4689();
        } else if (var13 == 2) {
            var12.method4602();
        } else if (var13 == 3) {
            var12.method4603();
        }
        return var12;
    }

    @ObfuscatedName("ig.ab(Ljn;IB)Ljn;")
    public class256 method3899(class256 arg0, int arg1) {
        if (this.method3940()) {
            int var7 = this.field2382;
            class139 var8;
            if (method3395(var7) == 0) {
                var8 = method2217(var7);
            } else {
                var8 = null;
            }
            if (var8 == null) {
                return arg0.method4668(true);
            } else {
                class256 var10 = arg0.method4668(!var8.method2946());
                var10.method4595(var8, arg1);
                return var10;
            }
        } else {
            int var3 = this.field2386[arg1];
            class251 var4 = method3525(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4668(true);
            } else {
                class256 var6 = arg0.method4668(!var4.method4530(var5));
                var6.method4676(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ig.aw(Ljn;ILig;IB)Ljn;")
    public class256 method3900(class256 arg0, int arg1, class225 arg2, int arg3) {
        if (field2401 && !this.method3940() && !arg2.method3940()) {
            return this.method3901(arg0, arg1, arg2, arg3);
        }
        class256 var5 = arg0.method4586(false);
        boolean var6 = false;
        class251 var7 = null;
        class246 var8 = null;
        if (this.method3940()) {
            class139 var9 = this.method3905();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3940() && this.field2392 == null) {
                var5.method4595(var9, arg1);
                return var5;
            }
            var8 = var9.field1636;
            var5.method4599(var8, var9, arg1, this.field2392, false, !arg2.method3940());
        } else {
            int var10 = this.field2386[arg1];
            var7 = method3525(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3897(arg0, arg3);
            }
            if (!arg2.method3940() && (this.field2391 == null || arg3 == -1)) {
                var5.method4676(var7, arg1);
                return var5;
            }
            if (this.field2391 == null || arg3 == -1) {
                var5.method4676(var7, arg1);
                return var5;
            }
            var6 = arg2.method3940();
            if (!var6) {
                var5.method4693(var7, arg1, this.field2391, false);
            }
        }
        if (arg2.method3940()) {
            class139 var11 = arg2.method3905();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1636;
            }
            var5.method4599(var8, var11, arg3, this.field2392, true, true);
        } else {
            int var12 = arg2.field2386[arg3];
            class251 var13 = method3525(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3897(arg0, arg1);
            }
            var5.method4693(var13, var14, this.field2391, true);
        }
        if (var6 && var7 != null) {
            var5.method4693(var7, arg1, this.field2391, false);
        }
        var5.method4593();
        return var5;
    }

    @ObfuscatedName("ig.ad(Ljn;ILig;II)Ljn;")
    public class256 method3901(class256 arg0, int arg1, class225 arg2, int arg3) {
        int var5 = this.field2386[arg1];
        class251 var6 = method3525(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3897(arg0, arg3);
        }
        int var8 = arg2.field2386[arg3];
        class251 var9 = method3525(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class256 var11 = arg0.method4586(!var6.method4530(var7));
            var11.method4676(var6, var7);
            return var11;
        } else {
            class256 var12 = arg0.method4586(!var6.method4530(var7) & !var9.method4530(var10));
            var12.method4598(var6, var7, var9, var10, this.field2391);
            return var12;
        }
    }

    @ObfuscatedName("ig.al(Ljn;IB)Ljn;")
    public class256 method3902(class256 arg0, int arg1) {
        if (this.method3940()) {
            return this.method3897(arg0, arg1);
        }
        int var3 = this.field2386[arg1];
        class251 var4 = method3525(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4586(true);
        }
        class251 var6 = null;
        int var7 = 0;
        if (this.field2387 != null && arg1 < this.field2387.length) {
            int var8 = this.field2387[arg1];
            var6 = method3525(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class256 var10 = arg0.method4586(!var4.method4530(var5));
            var10.method4676(var4, var5);
            return var10;
        } else {
            class256 var9 = arg0.method4586(!var4.method4530(var5) & !var6.method4530(var7));
            var9.method4676(var4, var5);
            var9.method4676(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ig.as(I)Z")
    public boolean method3940() {
        return this.field2382 >= 0;
    }

    @ObfuscatedName("ig.ag(B)I")
    public int method3904() {
        return this.field2385 - this.field2384;
    }

    @ObfuscatedName("hd.ai(II)Lja;")
    public static class251 method3525(int arg0) {
        class251 var1 = (class251) field2395.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class251 var2 = class251.method2925(Statics.field3667, Statics.field1471, arg0, false);
        if (var2 != null) {
            field2395.method5346(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("hx.ax(IB)I")
    public static int method3395(int arg0) {
        class139 var1 = method2217(arg0);
        if (var1 == null) {
            return 2;
        } else if (var1.method2944()) {
            return 0;
        } else {
            return 1;
        }
    }

    @ObfuscatedName("ig.ar(I)Lfa;")
    public class139 method3905() {
        if (!this.method3940()) {
            return null;
        }
        int var1 = this.field2382;
        class139 var2;
        if (method3395(var1) == 0) {
            var2 = method2217(var1);
        } else {
            var2 = null;
        }
        return var2;
    }

    @ObfuscatedName("dg.aj(II)Lfa;")
    public static class139 method2217(int arg0) {
        class139 var1 = (class139) field2381.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class379 var2 = Statics.field3667;
        class379 var3 = Statics.field1471;
        boolean var4 = true;
        byte[] var5 = var2.method6355(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
        class139 var7;
        if (var5 == null) {
            boolean var6 = false;
            var7 = null;
        } else {
            int var8 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
            byte[] var9 = var3.method6355(var8, 0);
            if (var9 == null) {
                var4 = false;
            }
            if (var4) {
                if (Statics.field3568 == null) {
                    Statics.field1731 = Runtime.getRuntime().availableProcessors();
                    Statics.field3568 = new ThreadPoolExecutor(0, Statics.field1731, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1731 * 100 + 100), new class189());
                }
                try {
                    var7 = new class139(var2, var3, arg0, false);
                } catch (Exception var12) {
                    var7 = null;
                }
            } else {
                var7 = null;
            }
        }
        if (var7 != null) {
            field2381.method5346(var7, (long) arg0);
        }
        return var7;
    }
}
