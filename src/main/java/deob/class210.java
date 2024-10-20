package deob;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ii")
public class class210 extends class501 {

    @ObfuscatedName("ii.aq")
    public static boolean field2300 = false;

    @ObfuscatedName("ii.av")
    public static class313 field2303 = new class313(64);

    @ObfuscatedName("ii.ab")
    public static class313 field2293 = new class313(100);

    @ObfuscatedName("ii.ai")
    public static class313 field2294 = new class313(100);

    @ObfuscatedName("ii.ae")
    public int field2287 = -1;

    @ObfuscatedName("ii.au")
    public Map field2288;

    @ObfuscatedName("ii.ah")
    public int field2289 = 0;

    @ObfuscatedName("ii.az")
    public int field2290 = 0;

    @ObfuscatedName("ii.ax")
    public int[] field2291;

    @ObfuscatedName("ii.ac")
    public int[] field2292;

    @ObfuscatedName("ii.al")
    public int[] field2285;

    @ObfuscatedName("ii.ay")
    public class206[] field2296;

    @ObfuscatedName("ii.ao")
    public int field2295 = -1;

    @ObfuscatedName("ii.aa")
    public int[] field2286;

    @ObfuscatedName("ii.as")
    public boolean[] field2297;

    @ObfuscatedName("ii.aw")
    public boolean field2298 = false;

    @ObfuscatedName("ii.at")
    public int field2299 = 5;

    @ObfuscatedName("ii.af")
    public int field2302 = -1;

    @ObfuscatedName("ii.am")
    public int field2301 = -1;

    @ObfuscatedName("ii.ar")
    public int field2281 = 99;

    @ObfuscatedName("ii.bt")
    public boolean field2305 = false;

    @ObfuscatedName("ii.bj")
    public int field2304 = -1;

    @ObfuscatedName("ii.be")
    public int field2284 = -1;

    @ObfuscatedName("ii.bm")
    public int field2306 = 2;

    @ObfuscatedName("dm.aq(Lok;Lok;Lok;I)V")
    public static void method2252(class388 arg0, class388 arg1, class388 arg2) {
        Statics.field4985 = arg0;
        Statics.field1869 = arg1;
        Statics.field2543 = arg2;
    }

    @ObfuscatedName("nf.ad(II)Lii;")
    public static class210 method5910(int arg0) {
        class210 var1 = (class210) field2303.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4985.method6539(12, arg0);
        class210 var3 = new class210();
        if (var2 != null) {
            var3.method3761(new class547(var2));
        }
        var3.method3778();
        field2303.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.ag(Lvp;I)V")
    public void method3761(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3797(arg0, var2);
        }
    }

    @ObfuscatedName("ii.ak(Lvp;II)V")
    public void method3797(class547 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8899();
            this.field2285 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2285[var4] = arg0.method8899();
            }
            this.field2291 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2291[var5] = arg0.method8899();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2291[var6] += arg0.method8899() << 16;
            }
        } else if (arg1 == 2) {
            this.field2295 = arg0.method8899();
        } else if (arg1 == 3) {
            int var7 = arg0.method8804();
            this.field2286 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2286[var8] = arg0.method8804();
            }
            this.field2286[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2298 = true;
        } else if (arg1 == 5) {
            this.field2299 = arg0.method8804();
        } else if (arg1 == 6) {
            this.field2302 = arg0.method8899();
        } else if (arg1 == 7) {
            this.field2301 = arg0.method8899();
        } else if (arg1 == 8) {
            this.field2281 = arg0.method8804();
            this.field2305 = true;
        } else if (arg1 == 9) {
            this.field2304 = arg0.method8804();
        } else if (arg1 == 10) {
            this.field2284 = arg0.method8804();
        } else if (arg1 == 11) {
            this.field2306 = arg0.method8804();
        } else if (arg1 == 12) {
            int var9 = arg0.method8804();
            this.field2292 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2292[var10] = arg0.method8899();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2292[var11] += arg0.method8899() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method8804();
            this.field2296 = new class206[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                class206[] var14;
                class206 var24;
                label118: {
                    var14 = this.field2296;
                    if (arg0 != null) {
                        boolean var16 = false;
                        boolean var17 = false;
                        boolean var18 = false;
                        boolean var19 = false;
                        int var20 = arg0.method8899();
                        int var21 = arg0.method8804();
                        int var22 = arg0.method8804();
                        int var23 = arg0.method8804();
                        if (var20 >= 1 && var21 >= 1 && var22 >= 0 && var23 >= 0) {
                            var24 = new class206(var20, var21, var22, var23);
                            break label118;
                        }
                    }
                    var24 = null;
                }
                var14[var13] = var24;
            }
        } else if (arg1 == 14) {
            this.field2287 = arg0.method8734();
        } else if (arg1 == 15) {
            int var25 = arg0.method8899();
            this.field2288 = new HashMap();
            for (int var26 = 0; var26 < var25; var26++) {
                int var27;
                class206 var36;
                label103: {
                    var27 = arg0.method8899();
                    if (arg0 != null) {
                        boolean var28 = false;
                        boolean var29 = false;
                        boolean var30 = false;
                        boolean var31 = false;
                        int var32 = arg0.method8899();
                        int var33 = arg0.method8804();
                        int var34 = arg0.method8804();
                        int var35 = arg0.method8804();
                        if (var32 >= 1 && var33 >= 1 && var34 >= 0 && var35 >= 0) {
                            var36 = new class206(var32, var33, var34, var35);
                            break label103;
                        }
                    }
                    var36 = null;
                }
                this.field2288.put(var27, var36);
            }
        } else if (arg1 == 16) {
            this.field2289 = arg0.method8899();
            this.field2290 = arg0.method8899();
        } else if (arg1 == 17) {
            this.field2297 = new boolean[256];
            for (int var38 = 0; var38 < this.field2297.length; var38++) {
                this.field2297[var38] = false;
            }
            int var39 = arg0.method8804();
            for (int var40 = 0; var40 < var39; var40++) {
                this.field2297[arg0.method8804()] = true;
            }
        }
    }

    @ObfuscatedName("ii.ap(I)V")
    public void method3778() {
        if (this.field2304 == -1) {
            if (this.field2286 == null && this.field2297 == null) {
                this.field2304 = 0;
            } else {
                this.field2304 = 2;
            }
        }
        if (this.field2284 != -1) {
            return;
        }
        if (this.field2286 == null && this.field2297 == null) {
            this.field2284 = 0;
        } else {
            this.field2284 = 2;
        }
    }

    @ObfuscatedName("ii.an(Llv;II)Llv;")
    public class294 method3751(class294 arg0, int arg1) {
        if (this.method3748()) {
            int var7 = this.field2287;
            class143 var8 = method3029(var7);
            int var9;
            if (var8 == null) {
                var9 = 2;
            } else {
                var9 = var8.method3070() ? 0 : 1;
            }
            class143 var10;
            if (var9 == 0) {
                var10 = method3029(var7);
            } else {
                var10 = null;
            }
            if (var10 == null) {
                return arg0.method5311(true);
            } else {
                class294 var12 = arg0.method5311(!var10.method3045());
                var12.method5300(var10, arg1);
                return var12;
            }
        } else {
            int var3 = this.field2291[arg1];
            class288 var4 = method655(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method5311(true);
            } else {
                class294 var6 = arg0.method5311(!var4.method5185(var5));
                var6.method5253(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ii.aj(Llv;III)Llv;")
    public class294 method3752(class294 arg0, int arg1, int arg2) {
        if (!this.method3748()) {
            int var4 = this.field2291[arg1];
            class288 var5 = method655(var4 >> 16);
            int var6 = var4 & 0xFFFF;
            if (var5 == null) {
                return arg0.method5311(true);
            }
            class294 var7 = arg0.method5311(!var5.method5185(var6));
            int var8 = arg2 & 0x3;
            if (var8 == 1) {
                var7.method5262();
            } else if (var8 == 2) {
                var7.method5256();
            } else if (var8 == 3) {
                var7.method5261();
            }
            var7.method5253(var5, var6);
            if (var8 == 1) {
                var7.method5261();
            } else if (var8 == 2) {
                var7.method5256();
            } else if (var8 == 3) {
                var7.method5262();
            }
            return var7;
        }
        int var9 = this.field2287;
        class143 var10 = method3029(var9);
        int var11;
        if (var10 == null) {
            var11 = 2;
        } else {
            var11 = var10.method3070() ? 0 : 1;
        }
        class143 var12;
        if (var11 == 0) {
            var12 = method3029(var9);
        } else {
            var12 = null;
        }
        if (var12 == null) {
            return arg0.method5311(true);
        }
        class294 var14 = arg0.method5311(!var12.method3045());
        int var15 = arg2 & 0x3;
        if (var15 == 1) {
            var14.method5262();
        } else if (var15 == 2) {
            var14.method5256();
        } else if (var15 == 3) {
            var14.method5261();
        }
        var14.method5300(var12, arg1);
        if (var15 == 1) {
            var14.method5261();
        } else if (var15 == 2) {
            var14.method5256();
        } else if (var15 == 3) {
            var14.method5262();
        }
        return var14;
    }

    @ObfuscatedName("ii.av(Llv;II)Llv;")
    public class294 method3786(class294 arg0, int arg1) {
        if (this.method3748()) {
            int var7 = this.field2287;
            class143 var8 = method3029(var7);
            int var9;
            if (var8 == null) {
                var9 = 2;
            } else {
                var9 = var8.method3070() ? 0 : 1;
            }
            class143 var10;
            if (var9 == 0) {
                var10 = method3029(var7);
            } else {
                var10 = null;
            }
            if (var10 == null) {
                return arg0.method5294(true);
            } else {
                class294 var12 = arg0.method5294(!var10.method3045());
                var12.method5300(var10, arg1);
                return var12;
            }
        } else {
            int var3 = this.field2291[arg1];
            class288 var4 = method655(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method5294(true);
            } else {
                class294 var6 = arg0.method5294(!var4.method5185(var5));
                var6.method5253(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ii.ab(Llv;ILii;II)Llv;")
    public class294 method3754(class294 arg0, int arg1, class210 arg2, int arg3) {
        if (field2300 && !this.method3748() && !arg2.method3748()) {
            return this.method3759(arg0, arg1, arg2, arg3);
        }
        class294 var5 = arg0.method5311(false);
        boolean var6 = false;
        class288 var7 = null;
        class282 var8 = null;
        if (this.method3748()) {
            class143 var9 = this.method3758();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3748() && this.field2297 == null) {
                var5.method5300(var9, arg1);
                return var5;
            }
            var8 = var9.field1652;
            var5.method5338(var8, var9, arg1, this.field2297, false, !arg2.method3748());
        } else {
            int var10 = this.field2291[arg1];
            var7 = method655(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3751(arg0, arg3);
            }
            if (!arg2.method3748() && (this.field2286 == null || arg3 == -1)) {
                var5.method5253(var7, arg1);
                return var5;
            }
            if (this.field2286 == null || arg3 == -1) {
                var5.method5253(var7, arg1);
                return var5;
            }
            var6 = arg2.method3748();
            if (!var6) {
                var5.method5259(var7, arg1, this.field2286, false);
            }
        }
        if (arg2.method3748()) {
            class143 var11 = arg2.method3758();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1652;
            }
            var5.method5338(var8, var11, arg3, this.field2297, true, true);
        } else {
            int var12 = arg2.field2291[arg3];
            class288 var13 = method655(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3751(arg0, arg1);
            }
            var5.method5259(var13, var14, this.field2286, true);
        }
        if (var6 && var7 != null) {
            var5.method5259(var7, arg1, this.field2286, false);
        }
        var5.method5252();
        return var5;
    }

    @ObfuscatedName("ii.ai(Llv;ILii;II)Llv;")
    public class294 method3759(class294 arg0, int arg1, class210 arg2, int arg3) {
        int var5 = this.field2291[arg1];
        class288 var6 = method655(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3751(arg0, arg3);
        }
        int var8 = arg2.field2291[arg3];
        class288 var9 = method655(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class294 var11 = arg0.method5311(!var6.method5185(var7));
            var11.method5253(var6, var7);
            return var11;
        } else {
            class294 var12 = arg0.method5311(!var6.method5185(var7) & !var9.method5185(var10));
            var12.method5268(var6, var7, var9, var10, this.field2286);
            return var12;
        }
    }

    @ObfuscatedName("ii.ae(Llv;II)Llv;")
    public class294 method3774(class294 arg0, int arg1) {
        if (this.method3748()) {
            return this.method3751(arg0, arg1);
        }
        int var3 = this.field2291[arg1];
        class288 var4 = method655(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method5311(true);
        }
        class288 var6 = null;
        int var7 = 0;
        if (this.field2292 != null && arg1 < this.field2292.length) {
            int var8 = this.field2292[arg1];
            var6 = method655(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class294 var10 = arg0.method5311(!var4.method5185(var5));
            var10.method5253(var4, var5);
            return var10;
        } else {
            class294 var9 = arg0.method5311(!var4.method5185(var5) & !var6.method5185(var7));
            var9.method5253(var4, var5);
            var9.method5253(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ii.au(I)Z")
    public boolean method3748() {
        return this.field2287 >= 0;
    }

    @ObfuscatedName("ii.ah(B)I")
    public int method3757() {
        return this.field2290 - this.field2289;
    }

    @ObfuscatedName("bp.az(II)Llf;")
    public static class288 method655(int arg0) {
        class288 var1 = (class288) field2293.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class288 var2 = class288.method1812(Statics.field1869, Statics.field2543, arg0, false);
        if (var2 != null) {
            field2293.method5498(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("mi.ax(II)I")
    public static int method5516(int arg0) {
        class143 var1 = method3029(arg0);
        if (var1 == null) {
            return 2;
        } else if (var1.method3070()) {
            return 0;
        } else {
            return 1;
        }
    }

    @ObfuscatedName("ii.ac(I)Lft;")
    public class143 method3758() {
        if (!this.method3748()) {
            return null;
        }
        int var1 = this.field2287;
        class143 var2 = method3029(var1);
        int var3;
        if (var2 == null) {
            var3 = 2;
        } else {
            var3 = var2.method3070() ? 0 : 1;
        }
        class143 var4;
        if (var3 == 0) {
            var4 = method3029(var1);
        } else {
            var4 = null;
        }
        return var4;
    }

    @ObfuscatedName("fp.al(II)Lft;")
    public static class143 method3029(int arg0) {
        class143 var1 = (class143) field2294.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class388 var2 = Statics.field1869;
        class388 var3 = Statics.field2543;
        boolean var4 = true;
        byte[] var5 = var2.method6546(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
        class143 var7;
        if (var5 == null) {
            boolean var6 = false;
            var7 = null;
        } else {
            int var8 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
            byte[] var9 = var3.method6546(var8, 0);
            if (var9 == null) {
                var4 = false;
            }
            if (var4) {
                if (Statics.field1656 == null) {
                    Statics.field1650 = Runtime.getRuntime().availableProcessors();
                    Statics.field1656 = new ThreadPoolExecutor(0, Statics.field1650, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1650 * 100 + 100), new class174());
                }
                try {
                    var7 = new class143(var2, var3, arg0, false);
                } catch (Exception var12) {
                    var7 = null;
                }
            } else {
                var7 = null;
            }
        }
        if (var7 != null) {
            field2294.method5498(var7, (long) arg0);
        }
        return var7;
    }
}
