package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ib")
public class class209 extends class469 {

    @ObfuscatedName("ib.au")
    public static boolean field2303 = false;

    @ObfuscatedName("ib.ap")
    public static class288 field2316 = new class288(64);

    @ObfuscatedName("ib.aa")
    public static class288 field2307 = new class288(100);

    @ObfuscatedName("ib.af")
    public static class288 field2315 = new class288(100);

    @ObfuscatedName("ib.ad")
    public int field2309 = -1;

    @ObfuscatedName("ib.aq")
    public Map field2322;

    @ObfuscatedName("ib.al")
    public int field2311 = 0;

    @ObfuscatedName("ib.an")
    public int field2312 = 0;

    @ObfuscatedName("ib.ar")
    public int[] field2313;

    @ObfuscatedName("ib.ab")
    public int[] field2314;

    @ObfuscatedName("ib.ag")
    public int[] field2324;

    @ObfuscatedName("ib.am")
    public int[] field2308;

    @ObfuscatedName("ib.ax")
    public int field2317 = -1;

    @ObfuscatedName("ib.ah")
    public int[] field2319;

    @ObfuscatedName("ib.as")
    public boolean[] field2310;

    @ObfuscatedName("ib.ay")
    public boolean field2320 = false;

    @ObfuscatedName("ib.aj")
    public int field2321 = 5;

    @ObfuscatedName("ib.av")
    public int field2318 = -1;

    @ObfuscatedName("ib.aw")
    public int field2323 = -1;

    @ObfuscatedName("ib.ak")
    public int field2305 = 99;

    @ObfuscatedName("ib.bh")
    public boolean field2325 = false;

    @ObfuscatedName("ib.bj")
    public int field2326 = -1;

    @ObfuscatedName("ib.bk")
    public int field2327 = -1;

    @ObfuscatedName("ib.bv")
    public int field2328 = 2;

    @ObfuscatedName("im.au(Lnu;Lnu;Lnu;I)V")
    public static void method4155(class359 arg0, class359 arg1, class359 arg2) {
        Statics.field5176 = arg0;
        Statics.field1937 = arg1;
        Statics.field4965 = arg2;
    }

    @ObfuscatedName("hu.ae(II)Lib;")
    public static class209 method3394(int arg0) {
        class209 var1 = (class209) field2316.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5176.method6128(12, arg0);
        class209 var3 = new class209();
        if (var2 != null) {
            var3.method3737(new class515(var2));
        }
        var3.method3762();
        field2316.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.ao(Ltm;I)V")
    public void method3737(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3738(arg0, var2);
        }
    }

    @ObfuscatedName("ib.at(Ltm;II)V")
    public void method3738(class515 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8448();
            this.field2324 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2324[var4] = arg0.method8448();
            }
            this.field2313 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2313[var5] = arg0.method8448();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2313[var6] += arg0.method8448() << 16;
            }
        } else if (arg1 == 2) {
            this.field2317 = arg0.method8448();
        } else if (arg1 == 3) {
            int var7 = arg0.method8300();
            this.field2319 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2319[var8] = arg0.method8300();
            }
            this.field2319[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2320 = true;
        } else if (arg1 == 5) {
            this.field2321 = arg0.method8300();
        } else if (arg1 == 6) {
            this.field2318 = arg0.method8448();
        } else if (arg1 == 7) {
            this.field2323 = arg0.method8448();
        } else if (arg1 == 8) {
            this.field2305 = arg0.method8300();
            this.field2325 = true;
        } else if (arg1 == 9) {
            this.field2326 = arg0.method8300();
        } else if (arg1 == 10) {
            this.field2327 = arg0.method8300();
        } else if (arg1 == 11) {
            this.field2328 = arg0.method8300();
        } else if (arg1 == 12) {
            int var9 = arg0.method8300();
            this.field2314 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2314[var10] = arg0.method8448();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2314[var11] += arg0.method8448() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method8300();
            this.field2308 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2308[var13] = arg0.method8466();
            }
        } else if (arg1 == 14) {
            this.field2309 = arg0.method8306();
        } else if (arg1 == 15) {
            int var14 = arg0.method8448();
            this.field2322 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method8448();
                int var17 = arg0.method8466();
                this.field2322.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2311 = arg0.method8448();
            this.field2312 = arg0.method8448();
        } else if (arg1 == 17) {
            this.field2310 = new boolean[256];
            for (int var18 = 0; var18 < this.field2310.length; var18++) {
                this.field2310[var18] = false;
            }
            int var19 = arg0.method8300();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2310[arg0.method8300()] = true;
            }
        }
    }

    @ObfuscatedName("ib.ac(I)V")
    public void method3762() {
        if (this.field2326 == -1) {
            if (this.field2319 == null && this.field2310 == null) {
                this.field2326 = 0;
            } else {
                this.field2326 = 2;
            }
        }
        if (this.field2327 != -1) {
            return;
        }
        if (this.field2319 == null && this.field2310 == null) {
            this.field2327 = 0;
        } else {
            this.field2327 = 2;
        }
    }

    @ObfuscatedName("ib.ai(Ljr;II)Ljr;")
    public class240 method3740(class240 arg0, int arg1) {
        if (this.method3775()) {
            class138 var7 = method4048(this.field2309);
            if (var7 == null) {
                return arg0.method4446(true);
            } else {
                class240 var8 = arg0.method4446(!var7.method2926());
                var8.method4455(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2313[arg1];
            class235 var4 = method5377(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4446(true);
            } else {
                class240 var6 = arg0.method4446(!var4.method4397(var5));
                var6.method4522(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ib.az(Ljr;IIB)Ljr;")
    public class240 method3739(class240 arg0, int arg1, int arg2) {
        if (this.method3775()) {
            class138 var9 = method4048(this.field2309);
            if (var9 == null) {
                return arg0.method4446(true);
            }
            class240 var10 = arg0.method4446(!var9.method2926());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method4464();
            } else if (var11 == 2) {
                var10.method4463();
            } else if (var11 == 3) {
                var10.method4462();
            }
            var10.method4455(var9, arg1);
            if (var11 == 1) {
                var10.method4462();
            } else if (var11 == 2) {
                var10.method4463();
            } else if (var11 == 3) {
                var10.method4464();
            }
            return var10;
        }
        int var4 = this.field2313[arg1];
        class235 var5 = method5377(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4446(true);
        }
        class240 var7 = arg0.method4446(!var5.method4397(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4464();
        } else if (var8 == 2) {
            var7.method4463();
        } else if (var8 == 3) {
            var7.method4462();
        }
        var7.method4522(var5, var6);
        if (var8 == 1) {
            var7.method4462();
        } else if (var8 == 2) {
            var7.method4463();
        } else if (var8 == 3) {
            var7.method4464();
        }
        return var7;
    }

    @ObfuscatedName("ib.ap(Ljr;II)Ljr;")
    public class240 method3742(class240 arg0, int arg1) {
        if (this.method3775()) {
            class138 var7 = method4048(this.field2309);
            if (var7 == null) {
                return arg0.method4538(true);
            } else {
                class240 var8 = arg0.method4538(!var7.method2926());
                var8.method4455(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2313[arg1];
            class235 var4 = method5377(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4538(true);
            } else {
                class240 var6 = arg0.method4538(!var4.method4397(var5));
                var6.method4522(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ib.aa(Ljr;ILib;II)Ljr;")
    public class240 method3743(class240 arg0, int arg1, class209 arg2, int arg3) {
        if (field2303 && !this.method3775() && !arg2.method3775()) {
            return this.method3744(arg0, arg1, arg2, arg3);
        }
        class240 var5 = arg0.method4446(false);
        boolean var6 = false;
        class235 var7 = null;
        class230 var8 = null;
        if (this.method3775()) {
            class138 var9 = this.method3748();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3775() && this.field2310 == null) {
                var5.method4455(var9, arg1);
                return var5;
            }
            var8 = var9.field1623;
            var5.method4459(var8, var9, arg1, this.field2310, false, !arg2.method3775());
        } else {
            int var10 = this.field2313[arg1];
            var7 = method5377(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3740(arg0, arg3);
            }
            if (!arg2.method3775() && (this.field2319 == null || arg3 == -1)) {
                var5.method4522(var7, arg1);
                return var5;
            }
            if (this.field2319 == null || arg3 == -1) {
                var5.method4522(var7, arg1);
                return var5;
            }
            var6 = arg2.method3775();
            if (!var6) {
                var5.method4460(var7, arg1, this.field2319, false);
            }
        }
        if (arg2.method3775()) {
            class138 var11 = arg2.method3748();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1623;
            }
            var5.method4459(var8, var11, arg3, this.field2310, true, true);
        } else {
            int var12 = arg2.field2313[arg3];
            class235 var13 = method5377(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3740(arg0, arg1);
            }
            var5.method4460(var13, var14, this.field2319, true);
        }
        if (var6 && var7 != null) {
            var5.method4460(var7, arg1, this.field2319, false);
        }
        var5.method4453();
        return var5;
    }

    @ObfuscatedName("ib.af(Ljr;ILib;II)Ljr;")
    public class240 method3744(class240 arg0, int arg1, class209 arg2, int arg3) {
        int var5 = this.field2313[arg1];
        class235 var6 = method5377(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3740(arg0, arg3);
        }
        int var8 = arg2.field2313[arg3];
        class235 var9 = method5377(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class240 var11 = arg0.method4446(!var6.method4397(var7));
            var11.method4522(var6, var7);
            return var11;
        } else {
            class240 var12 = arg0.method4446(!var6.method4397(var7) & !var9.method4397(var10));
            var12.method4471(var6, var7, var9, var10, this.field2319);
            return var12;
        }
    }

    @ObfuscatedName("ib.ad(Ljr;II)Ljr;")
    public class240 method3745(class240 arg0, int arg1) {
        if (this.method3775()) {
            return this.method3740(arg0, arg1);
        }
        int var3 = this.field2313[arg1];
        class235 var4 = method5377(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4446(true);
        }
        class235 var6 = null;
        int var7 = 0;
        if (this.field2314 != null && arg1 < this.field2314.length) {
            int var8 = this.field2314[arg1];
            var6 = method5377(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class240 var10 = arg0.method4446(!var4.method4397(var5));
            var10.method4522(var4, var5);
            return var10;
        } else {
            class240 var9 = arg0.method4446(!var4.method4397(var5) & !var6.method4397(var7));
            var9.method4522(var4, var5);
            var9.method4522(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ib.aq(I)Z")
    public boolean method3775() {
        return this.field2309 >= 0;
    }

    @ObfuscatedName("ib.al(I)I")
    public int method3747() {
        return this.field2312 - this.field2311;
    }

    @ObfuscatedName("lf.an(II)Ljt;")
    public static class235 method5377(int arg0) {
        class235 var1 = (class235) field2307.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class235 var2 = class235.method2163(Statics.field1937, Statics.field4965, arg0, false);
        if (var2 != null) {
            field2307.method5177(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("dp.ar(IB)I")
    public static int method2447(int arg0) {
        class138 var1 = Statics.method6037(arg0);
        if (var1 == null) {
            return 2;
        } else if (var1.method2934()) {
            return 0;
        } else {
            return 1;
        }
    }

    @ObfuscatedName("ib.ab(I)Lfv;")
    public class138 method3748() {
        return this.method3775() ? method4048(this.field2309) : null;
    }

    @ObfuscatedName("ii.ag(II)Lfv;")
    public static class138 method4048(int arg0) {
        return method2447(arg0) == 0 ? Statics.method6037(arg0) : null;
    }
}
