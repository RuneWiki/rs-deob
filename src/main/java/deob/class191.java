package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("gw")
public class class191 extends class404 {

    @ObfuscatedName("gw.v")
    public static boolean field2152 = false;

    @ObfuscatedName("gw.b")
    public static class257 field2141 = new class257(64);

    @ObfuscatedName("gw.n")
    public static class257 field2142 = new class257(100);

    @ObfuscatedName("gw.s")
    public static class257 field2143 = new class257(100);

    @ObfuscatedName("gw.l")
    public int field2144 = -1;

    @ObfuscatedName("gw.q")
    public Map field2145;

    @ObfuscatedName("gw.o")
    public int field2153 = 0;

    @ObfuscatedName("gw.r")
    public int field2161 = 0;

    @ObfuscatedName("gw.p")
    public int[] field2148;

    @ObfuscatedName("gw.w")
    public int[] field2146;

    @ObfuscatedName("gw.k")
    public int[] field2150;

    @ObfuscatedName("gw.d")
    public int[] field2151;

    @ObfuscatedName("gw.m")
    public int field2154 = -1;

    @ObfuscatedName("gw.u")
    public int[] field2147;

    @ObfuscatedName("gw.t")
    public boolean[] field2157;

    @ObfuscatedName("gw.g")
    public boolean field2155 = false;

    @ObfuscatedName("gw.x")
    public int field2156 = 5;

    @ObfuscatedName("gw.a")
    public int field2163 = -1;

    @ObfuscatedName("gw.y")
    public int field2158 = -1;

    @ObfuscatedName("gw.j")
    public int field2139 = 99;

    @ObfuscatedName("gw.e")
    public int field2160 = -1;

    @ObfuscatedName("gw.z")
    public int field2159 = -1;

    @ObfuscatedName("gw.h")
    public int field2162 = 2;

    @ObfuscatedName("dn.v(Lln;Lln;Lln;I)V")
    public static void method2674(class316 arg0, class316 arg1, class316 arg2) {
        Statics.field56 = arg0;
        Statics.field2149 = arg1;
        Statics.field2138 = arg2;
    }

    @ObfuscatedName("fa.c(IB)Lgw;")
    public static class191 method3011(int arg0) {
        class191 var1 = (class191) field2141.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field56.method5296(12, arg0);
        class191 var3 = new class191();
        if (var2 != null) {
            var3.method3453(new class438(var2));
        }
        var3.method3455();
        field2141.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gw.i(Lpi;S)V")
    public void method3453(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3502(arg0, var2);
        }
    }

    @ObfuscatedName("gw.f(Lpi;II)V")
    public void method3502(class438 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7148();
            this.field2150 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2150[var4] = arg0.method7148();
            }
            this.field2148 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2148[var5] = arg0.method7148();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2148[var6] += arg0.method7148() << 16;
            }
        } else if (arg1 == 2) {
            this.field2154 = arg0.method7148();
        } else if (arg1 == 3) {
            int var7 = arg0.method6971();
            this.field2147 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2147[var8] = arg0.method6971();
            }
            this.field2147[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2155 = true;
        } else if (arg1 == 5) {
            this.field2156 = arg0.method6971();
        } else if (arg1 == 6) {
            this.field2163 = arg0.method7148();
        } else if (arg1 == 7) {
            this.field2158 = arg0.method7148();
        } else if (arg1 == 8) {
            this.field2139 = arg0.method6971();
        } else if (arg1 == 9) {
            this.field2160 = arg0.method6971();
        } else if (arg1 == 10) {
            this.field2159 = arg0.method6971();
        } else if (arg1 == 11) {
            this.field2162 = arg0.method6971();
        } else if (arg1 == 12) {
            int var9 = arg0.method6971();
            this.field2146 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2146[var10] = arg0.method7148();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2146[var11] += arg0.method7148() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method6971();
            this.field2151 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2151[var13] = arg0.method6975();
            }
        } else if (arg1 == 14) {
            this.field2144 = arg0.method6976();
        } else if (arg1 == 15) {
            int var14 = arg0.method7148();
            this.field2145 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method7148();
                int var17 = arg0.method6975();
                this.field2145.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2153 = arg0.method7148();
            this.field2161 = arg0.method7148();
        } else if (arg1 == 17) {
            this.field2157 = new boolean[256];
            for (int var18 = 0; var18 < this.field2157.length; var18++) {
                this.field2157[var18] = false;
            }
            int var19 = arg0.method6971();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2157[arg0.method6971()] = true;
            }
        }
    }

    @ObfuscatedName("gw.b(B)V")
    public void method3455() {
        if (this.field2160 == -1) {
            if (this.field2147 == null && this.field2157 == null) {
                this.field2160 = 0;
            } else {
                this.field2160 = 2;
            }
        }
        if (this.field2159 != -1) {
            return;
        }
        if (this.field2147 == null && this.field2157 == null) {
            this.field2159 = 0;
        } else {
            this.field2159 = 2;
        }
    }

    @ObfuscatedName("gw.n(Liq;II)Liq;")
    public class241 method3485(class241 arg0, int arg1) {
        if (this.method3462()) {
            class123 var7 = method5728(this.field2144);
            if (var7 == null) {
                return arg0.method4485(true);
            } else {
                class241 var8 = arg0.method4485(!var7.method2637());
                var8.method4516(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2148[arg1];
            class237 var4 = method2574(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4485(true);
            } else {
                class241 var6 = arg0.method4485(!var4.method4449(var5));
                var6.method4493(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gw.s(Liq;III)Liq;")
    public class241 method3457(class241 arg0, int arg1, int arg2) {
        if (this.method3462()) {
            class123 var9 = method5728(this.field2144);
            if (var9 == null) {
                return arg0.method4485(true);
            }
            class241 var10 = arg0.method4485(!var9.method2637());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method4503();
            } else if (var11 == 2) {
                var10.method4502();
            } else if (var11 == 3) {
                var10.method4501();
            }
            var10.method4516(var9, arg1);
            if (var11 == 1) {
                var10.method4501();
            } else if (var11 == 2) {
                var10.method4502();
            } else if (var11 == 3) {
                var10.method4503();
            }
            return var10;
        }
        int var4 = this.field2148[arg1];
        class237 var5 = method2574(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4485(true);
        }
        class241 var7 = arg0.method4485(!var5.method4449(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4503();
        } else if (var8 == 2) {
            var7.method4502();
        } else if (var8 == 3) {
            var7.method4501();
        }
        var7.method4493(var5, var6);
        if (var8 == 1) {
            var7.method4501();
        } else if (var8 == 2) {
            var7.method4502();
        } else if (var8 == 3) {
            var7.method4503();
        }
        return var7;
    }

    @ObfuscatedName("gw.l(Liq;IS)Liq;")
    public class241 method3458(class241 arg0, int arg1) {
        if (this.method3462()) {
            class123 var7 = method5728(this.field2144);
            if (var7 == null) {
                return arg0.method4486(true);
            } else {
                class241 var8 = arg0.method4486(!var7.method2637());
                var8.method4516(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2148[arg1];
            class237 var4 = method2574(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4486(true);
            } else {
                class241 var6 = arg0.method4486(!var4.method4449(var5));
                var6.method4493(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gw.q(Liq;ILgw;IB)Liq;")
    public class241 method3459(class241 arg0, int arg1, class191 arg2, int arg3) {
        if (field2152 && !this.method3462() && !arg2.method3462()) {
            return this.method3454(arg0, arg1, arg2, arg3);
        }
        class241 var5 = arg0.method4485(false);
        boolean var6 = false;
        class237 var7 = null;
        if (this.method3462()) {
            class123 var8 = this.method3464();
            if (arg2.method3462() && this.field2157 == null) {
                var5.method4516(var8, arg1);
                return var5;
            }
            var5.method4483(var8, arg1, this.field2157, false);
        } else {
            int var9 = this.field2148[arg1];
            var7 = method2574(var9 >> 16);
            arg1 = var9 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3485(arg0, arg3);
            }
            if (!arg2.method3462() && (this.field2147 == null || arg3 == -1)) {
                var5.method4493(var7, arg1);
                return var5;
            }
            if (this.field2147 == null || arg3 == -1) {
                var5.method4493(var7, arg1);
                return var5;
            }
            var6 = arg2.method3462();
            if (!var6) {
                var5.method4499(var7, arg1, this.field2147, false);
            }
        }
        if (arg2.method3462()) {
            class123 var10 = arg2.method3464();
            var5.method4483(var10, arg3, this.field2157, true);
        } else {
            int var11 = arg2.field2148[arg3];
            class237 var12 = method2574(var11 >> 16);
            int var13 = var11 & 0xFFFF;
            if (var12 == null) {
                return this.method3485(arg0, arg1);
            }
            var5.method4499(var12, var13, this.field2147, true);
        }
        if (var6 && var7 != null) {
            var5.method4499(var7, arg1, this.field2147, false);
        }
        var5.method4492();
        return var5;
    }

    @ObfuscatedName("gw.o(Liq;ILgw;II)Liq;")
    public class241 method3454(class241 arg0, int arg1, class191 arg2, int arg3) {
        int var5 = this.field2148[arg1];
        class237 var6 = method2574(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3485(arg0, arg3);
        }
        int var8 = arg2.field2148[arg3];
        class237 var9 = method2574(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class241 var11 = arg0.method4485(!var6.method4449(var7));
            var11.method4493(var6, var7);
            return var11;
        } else {
            class241 var12 = arg0.method4485(!var6.method4449(var7) & !var9.method4449(var10));
            var12.method4497(var6, var7, var9, var10, this.field2147);
            return var12;
        }
    }

    @ObfuscatedName("gw.r(Liq;II)Liq;")
    public class241 method3483(class241 arg0, int arg1) {
        if (this.method3462()) {
            return this.method3485(arg0, arg1);
        }
        int var3 = this.field2148[arg1];
        class237 var4 = method2574(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4485(true);
        }
        class237 var6 = null;
        int var7 = 0;
        if (this.field2146 != null && arg1 < this.field2146.length) {
            int var8 = this.field2146[arg1];
            var6 = method2574(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class241 var10 = arg0.method4485(!var4.method4449(var5));
            var10.method4493(var4, var5);
            return var10;
        } else {
            class241 var9 = arg0.method4485(!var4.method4449(var5) & !var6.method4449(var7));
            var9.method4493(var4, var5);
            var9.method4493(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gw.p(I)Z")
    public boolean method3462() {
        return this.field2144 >= 0;
    }

    @ObfuscatedName("gw.w(I)I")
    public int method3507() {
        return this.field2161 - this.field2153;
    }

    @ObfuscatedName("da.k(II)Lim;")
    public static class237 method2574(int arg0) {
        class237 var1 = (class237) field2142.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class237 var2 = class237.method2081(Statics.field2149, Statics.field2138, arg0, false);
        if (var2 != null) {
            field2142.method4651(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("gw.d(I)Ldo;")
    public class123 method3464() {
        return this.method3462() ? method5728(this.field2144) : null;
    }

    @ObfuscatedName("mn.m(II)Ldo;")
    public static class123 method5728(int arg0) {
        class123 var1 = (class123) field2143.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class316 var2 = Statics.field2149;
        class316 var3 = Statics.field2138;
        boolean var4 = true;
        byte[] var5 = var2.method5296(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
        class123 var7;
        if (var5 == null) {
            boolean var6 = false;
            var7 = null;
        } else {
            int var8 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
            byte[] var9 = var3.method5302(var8, 0);
            if (var9 == null) {
                var4 = false;
            }
            if (var4) {
                try {
                    var7 = new class123(var2, var3, arg0, false);
                } catch (Exception var12) {
                    var7 = null;
                }
            } else {
                var7 = null;
            }
        }
        if (var7 != null) {
            field2143.method4651(var7, (long) arg0);
        }
        return var7;
    }
}
