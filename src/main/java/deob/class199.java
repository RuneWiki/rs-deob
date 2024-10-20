package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ga")
public class class199 extends class428 {

    @ObfuscatedName("ga.h")
    public static boolean field2303 = false;

    @ObfuscatedName("ga.m")
    public static class269 field2280 = new class269(64);

    @ObfuscatedName("ga.q")
    public static class269 field2281 = new class269(100);

    @ObfuscatedName("ga.f")
    public static class269 field2294 = new class269(100);

    @ObfuscatedName("ga.r")
    public int field2283 = -1;

    @ObfuscatedName("ga.u")
    public Map field2284;

    @ObfuscatedName("ga.b")
    public int field2300 = 0;

    @ObfuscatedName("ga.j")
    public int field2286 = 0;

    @ObfuscatedName("ga.g")
    public int[] field2295;

    @ObfuscatedName("ga.i")
    public int[] field2288;

    @ObfuscatedName("ga.o")
    public int[] field2289;

    @ObfuscatedName("ga.n")
    public int[] field2290;

    @ObfuscatedName("ga.k")
    public int field2298 = -1;

    @ObfuscatedName("ga.a")
    public int[] field2292;

    @ObfuscatedName("ga.s")
    public boolean[] field2293;

    @ObfuscatedName("ga.l")
    public boolean field2282 = false;

    @ObfuscatedName("ga.t")
    public int field2301 = 5;

    @ObfuscatedName("ga.c")
    public int field2296 = -1;

    @ObfuscatedName("ga.p")
    public int field2297 = -1;

    @ObfuscatedName("ga.d")
    public int field2302 = 99;

    @ObfuscatedName("ga.y")
    public boolean field2299 = false;

    @ObfuscatedName("ga.z")
    public int field2291 = -1;

    @ObfuscatedName("ga.w")
    public int field2285 = -1;

    @ObfuscatedName("ga.as")
    public int field2277 = 2;

    @ObfuscatedName("ip.h(Lly;Lly;Lly;I)V")
    public static void method4473(class333 arg0, class333 arg1, class333 arg2) {
        Statics.field2278 = arg0;
        Statics.field2279 = arg1;
        Statics.field1489 = arg2;
    }

    @ObfuscatedName("hf.e(II)Lga;")
    public static class199 method4223(int arg0) {
        class199 var1 = (class199) field2280.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2278.method5909(12, arg0);
        class199 var3 = new class199();
        if (var2 != null) {
            var3.method3666(new class467(var2));
        }
        var3.method3667();
        field2280.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ga.v(Lqy;I)V")
    public void method3666(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3704(arg0, var2);
        }
    }

    @ObfuscatedName("ga.x(Lqy;II)V")
    public void method3704(class467 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7794();
            this.field2289 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2289[var4] = arg0.method7794();
            }
            this.field2295 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2295[var5] = arg0.method7794();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2295[var6] += arg0.method7794() << 16;
            }
        } else if (arg1 == 2) {
            this.field2298 = arg0.method7794();
        } else if (arg1 == 3) {
            int var7 = arg0.method7792();
            this.field2292 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2292[var8] = arg0.method7792();
            }
            this.field2292[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2282 = true;
        } else if (arg1 == 5) {
            this.field2301 = arg0.method7792();
        } else if (arg1 == 6) {
            this.field2296 = arg0.method7794();
        } else if (arg1 == 7) {
            this.field2297 = arg0.method7794();
        } else if (arg1 == 8) {
            this.field2302 = arg0.method7792();
            this.field2299 = true;
        } else if (arg1 == 9) {
            this.field2291 = arg0.method7792();
        } else if (arg1 == 10) {
            this.field2285 = arg0.method7792();
        } else if (arg1 == 11) {
            this.field2277 = arg0.method7792();
        } else if (arg1 == 12) {
            int var9 = arg0.method7792();
            this.field2288 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2288[var10] = arg0.method7794();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2288[var11] += arg0.method7794() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method7792();
            this.field2290 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2290[var13] = arg0.method7796();
            }
        } else if (arg1 == 14) {
            this.field2283 = arg0.method7946();
        } else if (arg1 == 15) {
            int var14 = arg0.method7794();
            this.field2284 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method7794();
                int var17 = arg0.method7796();
                this.field2284.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2300 = arg0.method7794();
            this.field2286 = arg0.method7794();
        } else if (arg1 == 17) {
            this.field2293 = new boolean[256];
            for (int var18 = 0; var18 < this.field2293.length; var18++) {
                this.field2293[var18] = false;
            }
            int var19 = arg0.method7792();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2293[arg0.method7792()] = true;
            }
        }
    }

    @ObfuscatedName("ga.m(I)V")
    public void method3667() {
        if (this.field2291 == -1) {
            if (this.field2292 == null && this.field2293 == null) {
                this.field2291 = 0;
            } else {
                this.field2291 = 2;
            }
        }
        if (this.field2285 != -1) {
            return;
        }
        if (this.field2292 == null && this.field2293 == null) {
            this.field2285 = 0;
        } else {
            this.field2285 = 2;
        }
    }

    @ObfuscatedName("ga.q(Lhh;II)Lhh;")
    public class224 method3668(class224 arg0, int arg1) {
        if (this.method3671()) {
            class131 var7 = method1988(this.field2283);
            if (var7 == null) {
                return arg0.method4271(true);
            } else {
                class224 var8 = arg0.method4271(!var7.method2850());
                var8.method4321(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2295[arg1];
            class220 var4 = method2105(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4271(true);
            } else {
                class224 var6 = arg0.method4271(!var4.method4232(var5));
                var6.method4278(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ga.f(Lhh;III)Lhh;")
    public class224 method3669(class224 arg0, int arg1, int arg2) {
        if (this.method3671()) {
            class131 var9 = method1988(this.field2283);
            if (var9 == null) {
                return arg0.method4271(true);
            }
            class224 var10 = arg0.method4271(!var9.method2850());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method4365();
            } else if (var11 == 2) {
                var10.method4287();
            } else if (var11 == 3) {
                var10.method4286();
            }
            var10.method4321(var9, arg1);
            if (var11 == 1) {
                var10.method4286();
            } else if (var11 == 2) {
                var10.method4287();
            } else if (var11 == 3) {
                var10.method4365();
            }
            return var10;
        }
        int var4 = this.field2295[arg1];
        class220 var5 = method2105(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4271(true);
        }
        class224 var7 = arg0.method4271(!var5.method4232(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4365();
        } else if (var8 == 2) {
            var7.method4287();
        } else if (var8 == 3) {
            var7.method4286();
        }
        var7.method4278(var5, var6);
        if (var8 == 1) {
            var7.method4286();
        } else if (var8 == 2) {
            var7.method4287();
        } else if (var8 == 3) {
            var7.method4365();
        }
        return var7;
    }

    @ObfuscatedName("ga.r(Lhh;II)Lhh;")
    public class224 method3670(class224 arg0, int arg1) {
        if (this.method3671()) {
            class131 var7 = method1988(this.field2283);
            if (var7 == null) {
                return arg0.method4272(true);
            } else {
                class224 var8 = arg0.method4272(!var7.method2850());
                var8.method4321(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2295[arg1];
            class220 var4 = method2105(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4272(true);
            } else {
                class224 var6 = arg0.method4272(!var4.method4232(var5));
                var6.method4278(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ga.u(Lhh;ILga;IB)Lhh;")
    public class224 method3709(class224 arg0, int arg1, class199 arg2, int arg3) {
        if (field2303 && !this.method3671() && !arg2.method3671()) {
            return this.method3681(arg0, arg1, arg2, arg3);
        }
        class224 var5 = arg0.method4271(false);
        boolean var6 = false;
        class220 var7 = null;
        class215 var8 = null;
        if (this.method3671()) {
            class131 var9 = this.method3676();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3671() && this.field2293 == null) {
                var5.method4321(var9, arg1);
                return var5;
            }
            var8 = var9.field1604;
            var5.method4346(var8, var9, arg1, this.field2293, false, !arg2.method3671());
        } else {
            int var10 = this.field2295[arg1];
            var7 = method2105(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3668(arg0, arg3);
            }
            if (!arg2.method3671() && (this.field2292 == null || arg3 == -1)) {
                var5.method4278(var7, arg1);
                return var5;
            }
            if (this.field2292 == null || arg3 == -1) {
                var5.method4278(var7, arg1);
                return var5;
            }
            var6 = arg2.method3671();
            if (!var6) {
                var5.method4284(var7, arg1, this.field2292, false);
            }
        }
        if (arg2.method3671()) {
            class131 var11 = arg2.method3676();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1604;
            }
            var5.method4346(var8, var11, arg3, this.field2293, true, true);
        } else {
            int var12 = arg2.field2295[arg3];
            class220 var13 = method2105(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3668(arg0, arg1);
            }
            var5.method4284(var13, var14, this.field2292, true);
        }
        if (var6 && var7 != null) {
            var5.method4284(var7, arg1, this.field2292, false);
        }
        var5.method4356();
        return var5;
    }

    @ObfuscatedName("ga.b(Lhh;ILga;II)Lhh;")
    public class224 method3681(class224 arg0, int arg1, class199 arg2, int arg3) {
        int var5 = this.field2295[arg1];
        class220 var6 = method2105(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3668(arg0, arg3);
        }
        int var8 = arg2.field2295[arg3];
        class220 var9 = method2105(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class224 var11 = arg0.method4271(!var6.method4232(var7));
            var11.method4278(var6, var7);
            return var11;
        } else {
            class224 var12 = arg0.method4271(!var6.method4232(var7) & !var9.method4232(var10));
            var12.method4294(var6, var7, var9, var10, this.field2292);
            return var12;
        }
    }

    @ObfuscatedName("ga.j(Lhh;II)Lhh;")
    public class224 method3673(class224 arg0, int arg1) {
        if (this.method3671()) {
            return this.method3668(arg0, arg1);
        }
        int var3 = this.field2295[arg1];
        class220 var4 = method2105(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4271(true);
        }
        class220 var6 = null;
        int var7 = 0;
        if (this.field2288 != null && arg1 < this.field2288.length) {
            int var8 = this.field2288[arg1];
            var6 = method2105(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class224 var10 = arg0.method4271(!var4.method4232(var5));
            var10.method4278(var4, var5);
            return var10;
        } else {
            class224 var9 = arg0.method4271(!var4.method4232(var5) & !var6.method4232(var7));
            var9.method4278(var4, var5);
            var9.method4278(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ga.g(I)Z")
    public boolean method3671() {
        return this.field2283 >= 0;
    }

    @ObfuscatedName("ga.i(B)I")
    public int method3675() {
        return this.field2286 - this.field2300;
    }

    @ObfuscatedName("cl.o(IB)Lha;")
    public static class220 method2105(int arg0) {
        class220 var1 = (class220) field2281.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class333 var2 = Statics.field2279;
        class333 var3 = Statics.field1489;
        boolean var4 = true;
        int[] var5 = var2.method5854(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method5852(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method5852(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class220 var10;
        if (var4) {
            try {
                var10 = new class220(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2281.method4925(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("ga.n(I)Lew;")
    public class131 method3676() {
        return this.method3671() ? method1988(this.field2283) : null;
    }

    @ObfuscatedName("bu.k(II)Lew;")
    public static class131 method1988(int arg0) {
        class131 var1 = (class131) field2294.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class333 var2 = Statics.field2279;
        class333 var3 = Statics.field1489;
        boolean var4 = true;
        byte[] var5 = var2.method5852(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
        class131 var7;
        if (var5 == null) {
            boolean var6 = false;
            var7 = null;
        } else {
            int var8 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
            byte[] var9 = var3.method5852(var8, 0);
            if (var9 == null) {
                var4 = false;
            }
            if (var4) {
                try {
                    var7 = new class131(var2, var3, arg0, false);
                } catch (Exception var12) {
                    var7 = null;
                }
            } else {
                var7 = null;
            }
        }
        if (var7 != null) {
            field2294.method4925(var7, (long) arg0);
        }
        return var7;
    }
}
