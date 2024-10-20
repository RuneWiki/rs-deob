package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ge")
public class class203 extends class435 {

    @ObfuscatedName("ge.f")
    public static boolean field2307 = false;

    @ObfuscatedName("ge.n")
    public static class273 field2287 = new class273(64);

    @ObfuscatedName("ge.l")
    public static class273 field2288 = new class273(100);

    @ObfuscatedName("ge.k")
    public static class273 field2289 = new class273(100);

    @ObfuscatedName("ge.c")
    public int field2290 = -1;

    @ObfuscatedName("ge.r")
    public Map field2291;

    @ObfuscatedName("ge.b")
    public int field2306 = 0;

    @ObfuscatedName("ge.m")
    public int field2301 = 0;

    @ObfuscatedName("ge.t")
    public int[] field2283;

    @ObfuscatedName("ge.h")
    public int[] field2295;

    @ObfuscatedName("ge.p")
    public int[] field2296;

    @ObfuscatedName("ge.o")
    public int[] field2297;

    @ObfuscatedName("ge.u")
    public int field2282 = -1;

    @ObfuscatedName("ge.x")
    public int[] field2299;

    @ObfuscatedName("ge.a")
    public boolean[] field2300;

    @ObfuscatedName("ge.q")
    public boolean field2294 = false;

    @ObfuscatedName("ge.d")
    public int field2293 = 5;

    @ObfuscatedName("ge.e")
    public int field2303 = -1;

    @ObfuscatedName("ge.g")
    public int field2304 = -1;

    @ObfuscatedName("ge.y")
    public int field2305 = 99;

    @ObfuscatedName("ge.af")
    public boolean field2298 = false;

    @ObfuscatedName("ge.aa")
    public int field2308 = -1;

    @ObfuscatedName("ge.ai")
    public int field2302 = -1;

    @ObfuscatedName("ge.ag")
    public int field2309 = 2;

    @ObfuscatedName("i.f(Lln;Lln;Lln;S)V")
    public static void method45(class337 arg0, class337 arg1, class337 arg2) {
        Statics.field2292 = arg0;
        Statics.field2286 = arg1;
        Statics.field86 = arg2;
    }

    @ObfuscatedName("ch.w(II)Lge;")
    public static class203 method2227(int arg0) {
        class203 var1 = (class203) field2287.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2292.method5990(12, arg0);
        class203 var3 = new class203();
        if (var2 != null) {
            var3.method3744(new class474(var2));
        }
        var3.method3746();
        field2287.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ge.v(Lrd;I)V")
    public void method3744(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3745(arg0, var2);
        }
    }

    @ObfuscatedName("ge.s(Lrd;II)V")
    public void method3745(class474 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8032();
            this.field2296 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2296[var4] = arg0.method8032();
            }
            this.field2283 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2283[var5] = arg0.method8032();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2283[var6] += arg0.method8032() << 16;
            }
        } else if (arg1 == 2) {
            this.field2282 = arg0.method8032();
        } else if (arg1 == 3) {
            int var7 = arg0.method7964();
            this.field2299 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2299[var8] = arg0.method7964();
            }
            this.field2299[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2294 = true;
        } else if (arg1 == 5) {
            this.field2293 = arg0.method7964();
        } else if (arg1 == 6) {
            this.field2303 = arg0.method8032();
        } else if (arg1 == 7) {
            this.field2304 = arg0.method8032();
        } else if (arg1 == 8) {
            this.field2305 = arg0.method7964();
            this.field2298 = true;
        } else if (arg1 == 9) {
            this.field2308 = arg0.method7964();
        } else if (arg1 == 10) {
            this.field2302 = arg0.method7964();
        } else if (arg1 == 11) {
            this.field2309 = arg0.method7964();
        } else if (arg1 == 12) {
            int var9 = arg0.method7964();
            this.field2295 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2295[var10] = arg0.method8032();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2295[var11] += arg0.method8032() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method7964();
            this.field2297 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2297[var13] = arg0.method8132();
            }
        } else if (arg1 == 14) {
            this.field2290 = arg0.method7979();
        } else if (arg1 == 15) {
            int var14 = arg0.method8032();
            this.field2291 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method8032();
                int var17 = arg0.method8132();
                this.field2291.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2306 = arg0.method8032();
            this.field2301 = arg0.method8032();
        } else if (arg1 == 17) {
            this.field2300 = new boolean[256];
            for (int var18 = 0; var18 < this.field2300.length; var18++) {
                this.field2300[var18] = false;
            }
            int var19 = arg0.method7964();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2300[arg0.method7964()] = true;
            }
        }
    }

    @ObfuscatedName("ge.z(I)V")
    public void method3746() {
        if (this.field2308 == -1) {
            if (this.field2299 == null && this.field2300 == null) {
                this.field2308 = 0;
            } else {
                this.field2308 = 2;
            }
        }
        if (this.field2302 != -1) {
            return;
        }
        if (this.field2299 == null && this.field2300 == null) {
            this.field2302 = 0;
        } else {
            this.field2302 = 2;
        }
    }

    @ObfuscatedName("ge.j(Lhs;IB)Lhs;")
    public class228 method3747(class228 arg0, int arg1) {
        if (this.method3769()) {
            int var7 = this.field2290;
            class134 var8;
            if (method1997(var7) == 0) {
                class134 var9 = (class134) field2289.method5028((long) var7);
                class134 var10;
                if (var9 == null) {
                    class134 var11 = class134.method2075(Statics.field2286, Statics.field86, var7, false);
                    if (var11 != null) {
                        field2289.method5027(var11, (long) var7);
                    }
                    var10 = var11;
                } else {
                    var10 = var9;
                }
                var8 = var10;
            } else {
                var8 = null;
            }
            if (var8 == null) {
                return arg0.method4404(true);
            } else {
                class228 var13 = arg0.method4404(!var8.method2950());
                var13.method4375(var8, arg1);
                return var13;
            }
        } else {
            int var3 = this.field2283[arg1];
            class224 var4 = method2943(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4404(true);
            } else {
                class228 var6 = arg0.method4404(!var4.method4294(var5));
                var6.method4445(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ge.i(Lhs;IIB)Lhs;")
    public class228 method3748(class228 arg0, int arg1, int arg2) {
        if (!this.method3769()) {
            int var4 = this.field2283[arg1];
            class224 var5 = method2943(var4 >> 16);
            int var6 = var4 & 0xFFFF;
            if (var5 == null) {
                return arg0.method4404(true);
            }
            class228 var7 = arg0.method4404(!var5.method4294(var6));
            int var8 = arg2 & 0x3;
            if (var8 == 1) {
                var7.method4385();
            } else if (var8 == 2) {
                var7.method4351();
            } else if (var8 == 3) {
                var7.method4350();
            }
            var7.method4445(var5, var6);
            if (var8 == 1) {
                var7.method4350();
            } else if (var8 == 2) {
                var7.method4351();
            } else if (var8 == 3) {
                var7.method4385();
            }
            return var7;
        }
        int var9 = this.field2290;
        class134 var10;
        if (method1997(var9) == 0) {
            class134 var11 = (class134) field2289.method5028((long) var9);
            class134 var12;
            if (var11 == null) {
                class134 var13 = class134.method2075(Statics.field2286, Statics.field86, var9, false);
                if (var13 != null) {
                    field2289.method5027(var13, (long) var9);
                }
                var12 = var13;
            } else {
                var12 = var11;
            }
            var10 = var12;
        } else {
            var10 = null;
        }
        if (var10 == null) {
            return arg0.method4404(true);
        }
        class228 var15 = arg0.method4404(!var10.method2950());
        int var16 = arg2 & 0x3;
        if (var16 == 1) {
            var15.method4385();
        } else if (var16 == 2) {
            var15.method4351();
        } else if (var16 == 3) {
            var15.method4350();
        }
        var15.method4375(var10, arg1);
        if (var16 == 1) {
            var15.method4350();
        } else if (var16 == 2) {
            var15.method4351();
        } else if (var16 == 3) {
            var15.method4385();
        }
        return var15;
    }

    @ObfuscatedName("ge.n(Lhs;IB)Lhs;")
    public class228 method3775(class228 arg0, int arg1) {
        if (this.method3769()) {
            int var7 = this.field2290;
            class134 var8;
            if (method1997(var7) == 0) {
                class134 var9 = (class134) field2289.method5028((long) var7);
                class134 var10;
                if (var9 == null) {
                    class134 var11 = class134.method2075(Statics.field2286, Statics.field86, var7, false);
                    if (var11 != null) {
                        field2289.method5027(var11, (long) var7);
                    }
                    var10 = var11;
                } else {
                    var10 = var9;
                }
                var8 = var10;
            } else {
                var8 = null;
            }
            if (var8 == null) {
                return arg0.method4335(true);
            } else {
                class228 var13 = arg0.method4335(!var8.method2950());
                var13.method4375(var8, arg1);
                return var13;
            }
        } else {
            int var3 = this.field2283[arg1];
            class224 var4 = method2943(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4335(true);
            } else {
                class228 var6 = arg0.method4335(!var4.method4294(var5));
                var6.method4445(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ge.l(Lhs;ILge;II)Lhs;")
    public class228 method3767(class228 arg0, int arg1, class203 arg2, int arg3) {
        if (field2307 && !this.method3769() && !arg2.method3769()) {
            return this.method3755(arg0, arg1, arg2, arg3);
        }
        class228 var5 = arg0.method4404(false);
        boolean var6 = false;
        class224 var7 = null;
        class219 var8 = null;
        if (this.method3769()) {
            class134 var9 = this.method3751();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3769() && this.field2300 == null) {
                var5.method4375(var9, arg1);
                return var5;
            }
            var8 = var9.field1601;
            var5.method4347(var8, var9, arg1, this.field2300, false, !arg2.method3769());
        } else {
            int var10 = this.field2283[arg1];
            var7 = method2943(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3747(arg0, arg3);
            }
            if (!arg2.method3769() && (this.field2299 == null || arg3 == -1)) {
                var5.method4445(var7, arg1);
                return var5;
            }
            if (this.field2299 == null || arg3 == -1) {
                var5.method4445(var7, arg1);
                return var5;
            }
            var6 = arg2.method3769();
            if (!var6) {
                var5.method4448(var7, arg1, this.field2299, false);
            }
        }
        if (arg2.method3769()) {
            class134 var11 = arg2.method3751();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1601;
            }
            var5.method4347(var8, var11, arg3, this.field2300, true, true);
        } else {
            int var12 = arg2.field2283[arg3];
            class224 var13 = method2943(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3747(arg0, arg1);
            }
            var5.method4448(var13, var14, this.field2299, true);
        }
        if (var6 && var7 != null) {
            var5.method4448(var7, arg1, this.field2299, false);
        }
        var5.method4341();
        return var5;
    }

    @ObfuscatedName("ge.k(Lhs;ILge;II)Lhs;")
    public class228 method3755(class228 arg0, int arg1, class203 arg2, int arg3) {
        int var5 = this.field2283[arg1];
        class224 var6 = method2943(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3747(arg0, arg3);
        }
        int var8 = arg2.field2283[arg3];
        class224 var9 = method2943(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class228 var11 = arg0.method4404(!var6.method4294(var7));
            var11.method4445(var6, var7);
            return var11;
        } else {
            class228 var12 = arg0.method4404(!var6.method4294(var7) & !var9.method4294(var10));
            var12.method4346(var6, var7, var9, var10, this.field2299);
            return var12;
        }
    }

    @ObfuscatedName("ge.c(Lhs;II)Lhs;")
    public class228 method3752(class228 arg0, int arg1) {
        if (this.method3769()) {
            return this.method3747(arg0, arg1);
        }
        int var3 = this.field2283[arg1];
        class224 var4 = method2943(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4404(true);
        }
        class224 var6 = null;
        int var7 = 0;
        if (this.field2295 != null && arg1 < this.field2295.length) {
            int var8 = this.field2295[arg1];
            var6 = method2943(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class228 var10 = arg0.method4404(!var4.method4294(var5));
            var10.method4445(var4, var5);
            return var10;
        } else {
            class228 var9 = arg0.method4404(!var4.method4294(var5) & !var6.method4294(var7));
            var9.method4445(var4, var5);
            var9.method4445(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ge.r(I)Z")
    public boolean method3769() {
        return this.field2290 >= 0;
    }

    @ObfuscatedName("ge.b(I)I")
    public int method3754() {
        return this.field2301 - this.field2306;
    }

    @ObfuscatedName("en.m(II)Lhw;")
    public static class224 method2943(int arg0) {
        class224 var1 = (class224) field2288.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class337 var2 = Statics.field2286;
        class337 var3 = Statics.field86;
        boolean var4 = true;
        int[] var5 = var2.method5981(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method6001(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method6001(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class224 var10;
        if (var4) {
            try {
                var10 = new class224(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2288.method5027(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("by.t(II)I")
    public static int method1997(int arg0) {
        class134 var1 = (class134) field2289.method5028((long) arg0);
        class134 var2;
        if (var1 == null) {
            class134 var3 = class134.method2075(Statics.field2286, Statics.field86, arg0, false);
            if (var3 != null) {
                field2289.method5027(var3, (long) arg0);
            }
            var2 = var3;
        } else {
            var2 = var1;
        }
        if (var2 == null) {
            return 2;
        } else if (var2.method2948()) {
            return 0;
        } else {
            return 1;
        }
    }

    @ObfuscatedName("ge.h(I)Lei;")
    public class134 method3751() {
        if (!this.method3769()) {
            return null;
        }
        int var1 = this.field2290;
        class134 var2;
        if (method1997(var1) == 0) {
            class134 var3 = (class134) field2289.method5028((long) var1);
            class134 var4;
            if (var3 == null) {
                class134 var5 = class134.method2075(Statics.field2286, Statics.field86, var1, false);
                if (var5 != null) {
                    field2289.method5027(var5, (long) var1);
                }
                var4 = var5;
            } else {
                var4 = var3;
            }
            var2 = var4;
        } else {
            var2 = null;
        }
        return var2;
    }

    @ObfuscatedName("bd.p(I)V")
    public static void method1830() {
        field2287.method5033();
        field2288.method5033();
        field2289.method5033();
    }
}
