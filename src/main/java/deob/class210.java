package deob;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ig")
public class class210 extends class470 {

    @ObfuscatedName("ig.aw")
    public static boolean field2263 = false;

    @ObfuscatedName("ig.az")
    public static class289 field2264 = new class289(64);

    @ObfuscatedName("ig.av")
    public static class289 field2283 = new class289(100);

    @ObfuscatedName("ig.ap")
    public static class289 field2271 = new class289(100);

    @ObfuscatedName("ig.aq")
    public int field2267 = -1;

    @ObfuscatedName("ig.at")
    public Map field2268;

    @ObfuscatedName("ig.ah")
    public int field2269 = 0;

    @ObfuscatedName("ig.ax")
    public int field2270 = 0;

    @ObfuscatedName("ig.aa")
    public int[] field2265;

    @ObfuscatedName("ig.au")
    public int[] field2272;

    @ObfuscatedName("ig.ae")
    public int[] field2273;

    @ObfuscatedName("ig.ab")
    public int[] field2266;

    @ObfuscatedName("ig.ad")
    public int field2284 = -1;

    @ObfuscatedName("ig.ao")
    public int[] field2276;

    @ObfuscatedName("ig.ac")
    public boolean[] field2277;

    @ObfuscatedName("ig.ak")
    public boolean field2278 = false;

    @ObfuscatedName("ig.an")
    public int field2259 = 5;

    @ObfuscatedName("ig.af")
    public int field2274 = -1;

    @ObfuscatedName("ig.ai")
    public int field2281 = -1;

    @ObfuscatedName("ig.al")
    public int field2282 = 99;

    @ObfuscatedName("ig.bd")
    public boolean field2286 = false;

    @ObfuscatedName("ig.bb")
    public int field2280 = -1;

    @ObfuscatedName("ig.bn")
    public int field2285 = -1;

    @ObfuscatedName("ig.ba")
    public int field2275 = 2;

    @ObfuscatedName("pp.aw(Lnd;Lnd;Lnd;I)V")
    public static void method6972(class360 arg0, class360 arg1, class360 arg2) {
        Statics.field2279 = arg0;
        Statics.field3774 = arg1;
        Statics.field1804 = arg2;
    }

    @ObfuscatedName("fw.ay(II)Lig;")
    public static class210 method2904(int arg0) {
        class210 var1 = (class210) field2264.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2279.method6117(12, arg0);
        class210 var3 = new class210();
        if (var2 != null) {
            var3.method3728(new class514(var2));
        }
        var3.method3731();
        field2264.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.ar(Lty;S)V")
    public void method3728(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3730(arg0, var2);
        }
    }

    @ObfuscatedName("ig.am(Lty;II)V")
    public void method3730(class514 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8246();
            this.field2273 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2273[var4] = arg0.method8246();
            }
            this.field2265 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2265[var5] = arg0.method8246();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2265[var6] += arg0.method8246() << 16;
            }
        } else if (arg1 == 2) {
            this.field2284 = arg0.method8246();
        } else if (arg1 == 3) {
            int var7 = arg0.method8244();
            this.field2276 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2276[var8] = arg0.method8244();
            }
            this.field2276[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2278 = true;
        } else if (arg1 == 5) {
            this.field2259 = arg0.method8244();
        } else if (arg1 == 6) {
            this.field2274 = arg0.method8246();
        } else if (arg1 == 7) {
            this.field2281 = arg0.method8246();
        } else if (arg1 == 8) {
            this.field2282 = arg0.method8244();
            this.field2286 = true;
        } else if (arg1 == 9) {
            this.field2280 = arg0.method8244();
        } else if (arg1 == 10) {
            this.field2285 = arg0.method8244();
        } else if (arg1 == 11) {
            this.field2275 = arg0.method8244();
        } else if (arg1 == 12) {
            int var9 = arg0.method8244();
            this.field2272 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2272[var10] = arg0.method8246();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2272[var11] += arg0.method8246() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method8244();
            this.field2266 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2266[var13] = arg0.method8248();
            }
        } else if (arg1 == 14) {
            this.field2267 = arg0.method8496();
        } else if (arg1 == 15) {
            int var14 = arg0.method8246();
            this.field2268 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method8246();
                int var17 = arg0.method8248();
                this.field2268.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2269 = arg0.method8246();
            this.field2270 = arg0.method8246();
        } else if (arg1 == 17) {
            this.field2277 = new boolean[256];
            for (int var18 = 0; var18 < this.field2277.length; var18++) {
                this.field2277[var18] = false;
            }
            int var19 = arg0.method8244();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2277[arg0.method8244()] = true;
            }
        }
    }

    @ObfuscatedName("ig.as(B)V")
    public void method3731() {
        if (this.field2280 == -1) {
            if (this.field2276 == null && this.field2277 == null) {
                this.field2280 = 0;
            } else {
                this.field2280 = 2;
            }
        }
        if (this.field2285 != -1) {
            return;
        }
        if (this.field2276 == null && this.field2277 == null) {
            this.field2285 = 0;
        } else {
            this.field2285 = 2;
        }
    }

    @ObfuscatedName("ig.aj(Ljo;II)Ljo;")
    public class241 method3732(class241 arg0, int arg1) {
        if (this.method3738()) {
            class138 var7 = method3247(this.field2267);
            if (var7 == null) {
                return arg0.method4423(true);
            } else {
                class241 var8 = arg0.method4423(!var7.method2928());
                var8.method4431(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2265[arg1];
            class236 var4 = method3067(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4423(true);
            } else {
                class241 var6 = arg0.method4423(!var4.method4378(var5));
                var6.method4485(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ig.ag(Ljo;IIB)Ljo;")
    public class241 method3733(class241 arg0, int arg1, int arg2) {
        if (this.method3738()) {
            class138 var9 = method3247(this.field2267);
            if (var9 == null) {
                return arg0.method4423(true);
            }
            class241 var10 = arg0.method4423(!var9.method2928());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method4521();
            } else if (var11 == 2) {
                var10.method4441();
            } else if (var11 == 3) {
                var10.method4438();
            }
            var10.method4431(var9, arg1);
            if (var11 == 1) {
                var10.method4438();
            } else if (var11 == 2) {
                var10.method4441();
            } else if (var11 == 3) {
                var10.method4521();
            }
            return var10;
        }
        int var4 = this.field2265[arg1];
        class236 var5 = method3067(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4423(true);
        }
        class241 var7 = arg0.method4423(!var5.method4378(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4521();
        } else if (var8 == 2) {
            var7.method4441();
        } else if (var8 == 3) {
            var7.method4438();
        }
        var7.method4485(var5, var6);
        if (var8 == 1) {
            var7.method4438();
        } else if (var8 == 2) {
            var7.method4441();
        } else if (var8 == 3) {
            var7.method4521();
        }
        return var7;
    }

    @ObfuscatedName("ig.az(Ljo;II)Ljo;")
    public class241 method3734(class241 arg0, int arg1) {
        if (this.method3738()) {
            class138 var7 = method3247(this.field2267);
            if (var7 == null) {
                return arg0.method4424(true);
            } else {
                class241 var8 = arg0.method4424(!var7.method2928());
                var8.method4431(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2265[arg1];
            class236 var4 = method3067(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4424(true);
            } else {
                class241 var6 = arg0.method4424(!var4.method4378(var5));
                var6.method4485(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ig.av(Ljo;ILig;II)Ljo;")
    public class241 method3735(class241 arg0, int arg1, class210 arg2, int arg3) {
        if (field2263 && !this.method3738() && !arg2.method3738()) {
            return this.method3736(arg0, arg1, arg2, arg3);
        }
        class241 var5 = arg0.method4423(false);
        boolean var6 = false;
        class236 var7 = null;
        class231 var8 = null;
        if (this.method3738()) {
            class138 var9 = this.method3745();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3738() && this.field2277 == null) {
                var5.method4431(var9, arg1);
                return var5;
            }
            var8 = var9.field1610;
            var5.method4435(var8, var9, arg1, this.field2277, false, !arg2.method3738());
        } else {
            int var10 = this.field2265[arg1];
            var7 = method3067(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3732(arg0, arg3);
            }
            if (!arg2.method3738() && (this.field2276 == null || arg3 == -1)) {
                var5.method4485(var7, arg1);
                return var5;
            }
            if (this.field2276 == null || arg3 == -1) {
                var5.method4485(var7, arg1);
                return var5;
            }
            var6 = arg2.method3738();
            if (!var6) {
                var5.method4436(var7, arg1, this.field2276, false);
            }
        }
        if (arg2.method3738()) {
            class138 var11 = arg2.method3745();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1610;
            }
            var5.method4435(var8, var11, arg3, this.field2277, true, true);
        } else {
            int var12 = arg2.field2265[arg3];
            class236 var13 = method3067(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3732(arg0, arg1);
            }
            var5.method4436(var13, var14, this.field2276, true);
        }
        if (var6 && var7 != null) {
            var5.method4436(var7, arg1, this.field2276, false);
        }
        var5.method4454();
        return var5;
    }

    @ObfuscatedName("ig.ap(Ljo;ILig;IB)Ljo;")
    public class241 method3736(class241 arg0, int arg1, class210 arg2, int arg3) {
        int var5 = this.field2265[arg1];
        class236 var6 = method3067(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3732(arg0, arg3);
        }
        int var8 = arg2.field2265[arg3];
        class236 var9 = method3067(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class241 var11 = arg0.method4423(!var6.method4378(var7));
            var11.method4485(var6, var7);
            return var11;
        } else {
            class241 var12 = arg0.method4423(!var6.method4378(var7) & !var9.method4378(var10));
            var12.method4529(var6, var7, var9, var10, this.field2276);
            return var12;
        }
    }

    @ObfuscatedName("ig.aq(Ljo;II)Ljo;")
    public class241 method3737(class241 arg0, int arg1) {
        if (this.method3738()) {
            return this.method3732(arg0, arg1);
        }
        int var3 = this.field2265[arg1];
        class236 var4 = method3067(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4423(true);
        }
        class236 var6 = null;
        int var7 = 0;
        if (this.field2272 != null && arg1 < this.field2272.length) {
            int var8 = this.field2272[arg1];
            var6 = method3067(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class241 var10 = arg0.method4423(!var4.method4378(var5));
            var10.method4485(var4, var5);
            return var10;
        } else {
            class241 var9 = arg0.method4423(!var4.method4378(var5) & !var6.method4378(var7));
            var9.method4485(var4, var5);
            var9.method4485(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ig.at(I)Z")
    public boolean method3738() {
        return this.field2267 >= 0;
    }

    @ObfuscatedName("ig.ah(I)I")
    public int method3739() {
        return this.field2270 - this.field2269;
    }

    @ObfuscatedName("gp.ax(II)Ljm;")
    public static class236 method3067(int arg0) {
        class236 var1 = (class236) field2283.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class236 var2 = class236.method2948(Statics.field3774, Statics.field1804, arg0, false);
        if (var2 != null) {
            field2283.method5149(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("kq.aa(II)I")
    public static int method5040(int arg0) {
        class138 var1 = (class138) field2271.method5152((long) arg0);
        class138 var2;
        if (var1 == null) {
            class360 var3 = Statics.field3774;
            class360 var4 = Statics.field1804;
            boolean var5 = true;
            byte[] var6 = var3.method6124(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
            class138 var8;
            if (var6 == null) {
                boolean var7 = false;
                var8 = null;
            } else {
                int var9 = (var6[1] & 0xFF) << 8 | var6[2] & 0xFF;
                byte[] var10 = var4.method6124(var9, 0);
                if (var10 == null) {
                    var5 = false;
                }
                if (var5) {
                    if (Statics.field345 == null) {
                        Statics.field1445 = Runtime.getRuntime().availableProcessors();
                        Statics.field345 = new ThreadPoolExecutor(0, Statics.field1445, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1445 * 100 + 100), new class185());
                    }
                    try {
                        var8 = new class138(var3, var4, arg0, false);
                    } catch (Exception var14) {
                        var8 = null;
                    }
                } else {
                    var8 = null;
                }
            }
            if (var8 != null) {
                field2271.method5149(var8, (long) arg0);
            }
            var2 = var8;
        } else {
            var2 = var1;
        }
        if (var2 == null) {
            return 2;
        } else if (var2.method2911()) {
            return 0;
        } else {
            return 1;
        }
    }

    @ObfuscatedName("ig.au(B)Lfz;")
    public class138 method3745() {
        return this.method3738() ? method3247(this.field2267) : null;
    }

    @ObfuscatedName("gw.ae(II)Lfz;")
    public static class138 method3247(int arg0) {
        if (method5040(arg0) != 0) {
            return null;
        }
        class138 var1 = (class138) field2271.method5152((long) arg0);
        class138 var2;
        if (var1 == null) {
            class360 var3 = Statics.field3774;
            class360 var4 = Statics.field1804;
            boolean var5 = true;
            byte[] var6 = var3.method6124(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
            class138 var8;
            if (var6 == null) {
                boolean var7 = false;
                var8 = null;
            } else {
                int var9 = (var6[1] & 0xFF) << 8 | var6[2] & 0xFF;
                byte[] var10 = var4.method6124(var9, 0);
                if (var10 == null) {
                    var5 = false;
                }
                if (var5) {
                    if (Statics.field345 == null) {
                        Statics.field1445 = Runtime.getRuntime().availableProcessors();
                        Statics.field345 = new ThreadPoolExecutor(0, Statics.field1445, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1445 * 100 + 100), new class204());
                    }
                    try {
                        var8 = new class138(var3, var4, arg0, false);
                    } catch (Exception var13) {
                        var8 = null;
                    }
                } else {
                    var8 = null;
                }
            }
            if (var8 != null) {
                field2271.method5149(var8, (long) arg0);
            }
            var2 = var8;
        } else {
            var2 = var1;
        }
        return var2;
    }

    @ObfuscatedName("rz.ab(B)V")
    public static void method7653() {
        field2264.method5146();
        field2283.method5146();
        field2271.method5146();
    }
}
