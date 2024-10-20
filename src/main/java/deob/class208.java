package deob;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("hy")
public class class208 extends class457 {

    @ObfuscatedName("hy.at")
    public static boolean field2290 = false;

    @ObfuscatedName("hy.ak")
    public static class287 field2278 = new class287(64);

    @ObfuscatedName("hy.ae")
    public static class287 field2283 = new class287(100);

    @ObfuscatedName("hy.af")
    public static class287 field2280 = new class287(100);

    @ObfuscatedName("hy.ao")
    public int field2281 = -1;

    @ObfuscatedName("hy.aa")
    public Map field2282;

    @ObfuscatedName("hy.aj")
    public int field2273 = 0;

    @ObfuscatedName("hy.ad")
    public int field2284 = 0;

    @ObfuscatedName("hy.ac")
    public int[] field2285;

    @ObfuscatedName("hy.ag")
    public int[] field2299;

    @ObfuscatedName("hy.ar")
    public int[] field2287;

    @ObfuscatedName("hy.ah")
    public int[] field2286;

    @ObfuscatedName("hy.az")
    public int field2289 = -1;

    @ObfuscatedName("hy.au")
    public int[] field2293;

    @ObfuscatedName("hy.ai")
    public boolean[] field2291;

    @ObfuscatedName("hy.aq")
    public boolean field2274 = false;

    @ObfuscatedName("hy.aw")
    public int field2279 = 5;

    @ObfuscatedName("hy.ay")
    public int field2294 = -1;

    @ObfuscatedName("hy.al")
    public int field2295 = -1;

    @ObfuscatedName("hy.am")
    public int field2298 = 99;

    @ObfuscatedName("hy.bs")
    public boolean field2297 = false;

    @ObfuscatedName("hy.bc")
    public int field2288 = -1;

    @ObfuscatedName("hy.bj")
    public int field2275 = -1;

    @ObfuscatedName("hy.bo")
    public int field2300 = 2;

    @ObfuscatedName("qf.at(Lnq;Lnq;Lnq;B)V")
    public static void method7118(class357 arg0, class357 arg1, class357 arg2) {
        Statics.field2276 = arg0;
        Statics.field2277 = arg1;
        Statics.field3403 = arg2;
    }

    @ObfuscatedName("jt.an(II)Lhy;")
    public static class208 method4648(int arg0) {
        class208 var1 = (class208) field2278.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2276.method6080(12, arg0);
        class208 var3 = new class208();
        if (var2 != null) {
            var3.method3720(new class501(var2));
        }
        var3.method3753();
        field2278.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hy.av(Ltz;I)V")
    public void method3720(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3727(arg0, var2);
        }
    }

    @ObfuscatedName("hy.as(Ltz;II)V")
    public void method3727(class501 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8195();
            this.field2287 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2287[var4] = arg0.method8195();
            }
            this.field2285 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2285[var5] = arg0.method8195();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2285[var6] += arg0.method8195() << 16;
            }
        } else if (arg1 == 2) {
            this.field2289 = arg0.method8195();
        } else if (arg1 == 3) {
            int var7 = arg0.method8129();
            this.field2293 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2293[var8] = arg0.method8129();
            }
            this.field2293[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2274 = true;
        } else if (arg1 == 5) {
            this.field2279 = arg0.method8129();
        } else if (arg1 == 6) {
            this.field2294 = arg0.method8195();
        } else if (arg1 == 7) {
            this.field2295 = arg0.method8195();
        } else if (arg1 == 8) {
            this.field2298 = arg0.method8129();
            this.field2297 = true;
        } else if (arg1 == 9) {
            this.field2288 = arg0.method8129();
        } else if (arg1 == 10) {
            this.field2275 = arg0.method8129();
        } else if (arg1 == 11) {
            this.field2300 = arg0.method8129();
        } else if (arg1 == 12) {
            int var9 = arg0.method8129();
            this.field2299 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2299[var10] = arg0.method8195();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2299[var11] += arg0.method8195() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method8129();
            this.field2286 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2286[var13] = arg0.method8133();
            }
        } else if (arg1 == 14) {
            this.field2281 = arg0.method8134();
        } else if (arg1 == 15) {
            int var14 = arg0.method8195();
            this.field2282 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method8195();
                int var17 = arg0.method8133();
                this.field2282.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2273 = arg0.method8195();
            this.field2284 = arg0.method8195();
        } else if (arg1 == 17) {
            this.field2291 = new boolean[256];
            for (int var18 = 0; var18 < this.field2291.length; var18++) {
                this.field2291[var18] = false;
            }
            int var19 = arg0.method8129();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2291[arg0.method8129()] = true;
            }
        }
    }

    @ObfuscatedName("hy.ax(I)V")
    public void method3753() {
        if (this.field2288 == -1) {
            if (this.field2293 == null && this.field2291 == null) {
                this.field2288 = 0;
            } else {
                this.field2288 = 2;
            }
        }
        if (this.field2275 != -1) {
            return;
        }
        if (this.field2293 == null && this.field2291 == null) {
            this.field2275 = 0;
        } else {
            this.field2275 = 2;
        }
    }

    @ObfuscatedName("hy.ap(Ljd;II)Ljd;")
    public class239 method3721(class239 arg0, int arg1) {
        if (this.method3754()) {
            class137 var7 = method3195(this.field2281);
            if (var7 == null) {
                return arg0.method4411(true);
            } else {
                class239 var8 = arg0.method4411(!var7.method2891());
                var8.method4420(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2285[arg1];
            class234 var4 = method3771(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4411(true);
            } else {
                class239 var6 = arg0.method4411(!var4.method4357(var5));
                var6.method4419(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("hy.ab(Ljd;III)Ljd;")
    public class239 method3762(class239 arg0, int arg1, int arg2) {
        if (this.method3754()) {
            class137 var9 = method3195(this.field2281);
            if (var9 == null) {
                return arg0.method4411(true);
            }
            class239 var10 = arg0.method4411(!var9.method2891());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method4429();
            } else if (var11 == 2) {
                var10.method4428();
            } else if (var11 == 3) {
                var10.method4427();
            }
            var10.method4420(var9, arg1);
            if (var11 == 1) {
                var10.method4427();
            } else if (var11 == 2) {
                var10.method4428();
            } else if (var11 == 3) {
                var10.method4429();
            }
            return var10;
        }
        int var4 = this.field2285[arg1];
        class234 var5 = method3771(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4411(true);
        }
        class239 var7 = arg0.method4411(!var5.method4357(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4429();
        } else if (var8 == 2) {
            var7.method4428();
        } else if (var8 == 3) {
            var7.method4427();
        }
        var7.method4419(var5, var6);
        if (var8 == 1) {
            var7.method4427();
        } else if (var8 == 2) {
            var7.method4428();
        } else if (var8 == 3) {
            var7.method4429();
        }
        return var7;
    }

    @ObfuscatedName("hy.ak(Ljd;II)Ljd;")
    public class239 method3723(class239 arg0, int arg1) {
        if (this.method3754()) {
            class137 var7 = method3195(this.field2281);
            if (var7 == null) {
                return arg0.method4412(true);
            } else {
                class239 var8 = arg0.method4412(!var7.method2891());
                var8.method4420(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2285[arg1];
            class234 var4 = method3771(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4412(true);
            } else {
                class239 var6 = arg0.method4412(!var4.method4357(var5));
                var6.method4419(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("hy.ae(Ljd;ILhy;II)Ljd;")
    public class239 method3724(class239 arg0, int arg1, class208 arg2, int arg3) {
        if (field2290 && !this.method3754() && !arg2.method3754()) {
            return this.method3725(arg0, arg1, arg2, arg3);
        }
        class239 var5 = arg0.method4411(false);
        boolean var6 = false;
        class234 var7 = null;
        class229 var8 = null;
        if (this.method3754()) {
            class137 var9 = this.method3729();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3754() && this.field2291 == null) {
                var5.method4420(var9, arg1);
                return var5;
            }
            var8 = var9.field1588;
            var5.method4424(var8, var9, arg1, this.field2291, false, !arg2.method3754());
        } else {
            int var10 = this.field2285[arg1];
            var7 = method3771(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3721(arg0, arg3);
            }
            if (!arg2.method3754() && (this.field2293 == null || arg3 == -1)) {
                var5.method4419(var7, arg1);
                return var5;
            }
            if (this.field2293 == null || arg3 == -1) {
                var5.method4419(var7, arg1);
                return var5;
            }
            var6 = arg2.method3754();
            if (!var6) {
                var5.method4425(var7, arg1, this.field2293, false);
            }
        }
        if (arg2.method3754()) {
            class137 var11 = arg2.method3729();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1588;
            }
            var5.method4424(var8, var11, arg3, this.field2291, true, true);
        } else {
            int var12 = arg2.field2285[arg3];
            class234 var13 = method3771(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3721(arg0, arg1);
            }
            var5.method4425(var13, var14, this.field2293, true);
        }
        if (var6 && var7 != null) {
            var5.method4425(var7, arg1, this.field2293, false);
        }
        var5.method4418();
        return var5;
    }

    @ObfuscatedName("hy.af(Ljd;ILhy;II)Ljd;")
    public class239 method3725(class239 arg0, int arg1, class208 arg2, int arg3) {
        int var5 = this.field2285[arg1];
        class234 var6 = method3771(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3721(arg0, arg3);
        }
        int var8 = arg2.field2285[arg3];
        class234 var9 = method3771(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class239 var11 = arg0.method4411(!var6.method4357(var7));
            var11.method4419(var6, var7);
            return var11;
        } else {
            class239 var12 = arg0.method4411(!var6.method4357(var7) & !var9.method4357(var10));
            var12.method4423(var6, var7, var9, var10, this.field2293);
            return var12;
        }
    }

    @ObfuscatedName("hy.ao(Ljd;IB)Ljd;")
    public class239 method3726(class239 arg0, int arg1) {
        if (this.method3754()) {
            return this.method3721(arg0, arg1);
        }
        int var3 = this.field2285[arg1];
        class234 var4 = method3771(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4411(true);
        }
        class234 var6 = null;
        int var7 = 0;
        if (this.field2299 != null && arg1 < this.field2299.length) {
            int var8 = this.field2299[arg1];
            var6 = method3771(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class239 var10 = arg0.method4411(!var4.method4357(var5));
            var10.method4419(var4, var5);
            return var10;
        } else {
            class239 var9 = arg0.method4411(!var4.method4357(var5) & !var6.method4357(var7));
            var9.method4419(var4, var5);
            var9.method4419(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("hy.aa(I)Z")
    public boolean method3754() {
        return this.field2281 >= 0;
    }

    @ObfuscatedName("hy.aj(I)I")
    public int method3757() {
        return this.field2284 - this.field2273;
    }

    @ObfuscatedName("hy.ad(IB)Liu;")
    public static class234 method3771(int arg0) {
        class234 var1 = (class234) field2283.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class357 var2 = Statics.field2277;
        class357 var3 = Statics.field3403;
        boolean var4 = true;
        int[] var5 = var2.method6090(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method6087(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method6087(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class234 var10;
        if (var4) {
            try {
                var10 = new class234(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2283.method5123(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("hy.ac(I)Lfz;")
    public class137 method3729() {
        return this.method3754() ? method3195(this.field2281) : null;
    }

    @ObfuscatedName("gr.ag(II)Lfz;")
    public static class137 method3195(int arg0) {
        class137 var1 = method2435(arg0);
        int var2;
        if (var1 == null) {
            var2 = 2;
        } else {
            var2 = var1.method2889() ? 0 : 1;
        }
        return var2 == 0 ? method2435(arg0) : null;
    }

    @ObfuscatedName("dg.ar(IB)Lfz;")
    public static class137 method2435(int arg0) {
        class137 var1 = (class137) field2280.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class357 var2 = Statics.field2277;
        class357 var3 = Statics.field3403;
        boolean var4 = true;
        byte[] var5 = var2.method6087(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
        class137 var7;
        if (var5 == null) {
            boolean var6 = false;
            var7 = null;
        } else {
            int var8 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
            byte[] var9 = var3.method6087(var8, 0);
            if (var9 == null) {
                var4 = false;
            }
            if (var4) {
                if (Statics.field1469 == null) {
                    Statics.field4941 = Runtime.getRuntime().availableProcessors();
                    Statics.field1469 = new ThreadPoolExecutor(0, Statics.field4941, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field4941 * 100 + 100), new class184());
                }
                try {
                    var7 = new class137(var2, var3, arg0, false);
                } catch (Exception var12) {
                    var7 = null;
                }
            } else {
                var7 = null;
            }
        }
        if (var7 != null) {
            field2280.method5123(var7, (long) arg0);
        }
        return var7;
    }

    @ObfuscatedName("hi.ah(I)V")
    public static void method3302() {
        field2278.method5124();
        field2283.method5124();
        field2280.method5124();
    }
}
