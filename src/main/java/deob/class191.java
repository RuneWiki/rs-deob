package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("gq")
public class class191 extends class406 {

    @ObfuscatedName("gq.o")
    public static boolean field2222 = false;

    @ObfuscatedName("gq.a")
    public static class257 field2206 = new class257(64);

    @ObfuscatedName("gq.m")
    public static class257 field2223 = new class257(100);

    @ObfuscatedName("gq.p")
    public static class257 field2212 = new class257(100);

    @ObfuscatedName("gq.s")
    public int field2227 = -1;

    @ObfuscatedName("gq.r")
    public Map field2210;

    @ObfuscatedName("gq.v")
    public int field2208 = 0;

    @ObfuscatedName("gq.y")
    public int field2203 = 0;

    @ObfuscatedName("gq.c")
    public int[] field2213;

    @ObfuscatedName("gq.w")
    public int[] field2214;

    @ObfuscatedName("gq.b")
    public int[] field2215;

    @ObfuscatedName("gq.t")
    public int[] field2216;

    @ObfuscatedName("gq.g")
    public int field2217 = -1;

    @ObfuscatedName("gq.x")
    public int[] field2218;

    @ObfuscatedName("gq.n")
    public boolean[] field2219;

    @ObfuscatedName("gq.e")
    public boolean field2202 = false;

    @ObfuscatedName("gq.h")
    public int field2221 = 5;

    @ObfuscatedName("gq.f")
    public int field2226 = -1;

    @ObfuscatedName("gq.d")
    public int field2220 = -1;

    @ObfuscatedName("gq.j")
    public int field2224 = 99;

    @ObfuscatedName("gq.z")
    public int field2225 = -1;

    @ObfuscatedName("gq.i")
    public int field2207 = -1;

    @ObfuscatedName("gq.u")
    public int field2209 = 2;

    @ObfuscatedName("de.o(II)Lgq;")
    public static class191 method2497(int arg0) {
        class191 var1 = (class191) field2206.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2211.method5249(12, arg0);
        class191 var3 = new class191();
        if (var2 != null) {
            var3.method3408(new class440(var2));
        }
        var3.method3428();
        field2206.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gq.q(Lpx;B)V")
    public void method3408(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3409(arg0, var2);
        }
    }

    @ObfuscatedName("gq.l(Lpx;II)V")
    public void method3409(class440 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7082();
            this.field2215 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2215[var4] = arg0.method7082();
            }
            this.field2213 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2213[var5] = arg0.method7082();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2213[var6] += arg0.method7082() << 16;
            }
        } else if (arg1 == 2) {
            this.field2217 = arg0.method7082();
        } else if (arg1 == 3) {
            int var7 = arg0.method7071();
            this.field2218 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2218[var8] = arg0.method7071();
            }
            this.field2218[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2202 = true;
        } else if (arg1 == 5) {
            this.field2221 = arg0.method7071();
        } else if (arg1 == 6) {
            this.field2226 = arg0.method7082();
        } else if (arg1 == 7) {
            this.field2220 = arg0.method7082();
        } else if (arg1 == 8) {
            this.field2224 = arg0.method7071();
        } else if (arg1 == 9) {
            this.field2225 = arg0.method7071();
        } else if (arg1 == 10) {
            this.field2207 = arg0.method7071();
        } else if (arg1 == 11) {
            this.field2209 = arg0.method7071();
        } else if (arg1 == 12) {
            int var9 = arg0.method7071();
            this.field2214 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2214[var10] = arg0.method7082();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2214[var11] += arg0.method7082() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method7071();
            this.field2216 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2216[var13] = arg0.method6897();
            }
        } else if (arg1 == 14) {
            this.field2227 = arg0.method6898();
        } else if (arg1 == 15) {
            int var14 = arg0.method7082();
            this.field2210 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method7082();
                int var17 = arg0.method6897();
                this.field2210.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2208 = arg0.method7082();
            this.field2203 = arg0.method7082();
        } else if (arg1 == 17) {
            this.field2219 = new boolean[256];
            for (int var18 = 0; var18 < this.field2219.length; var18++) {
                this.field2219[var18] = false;
            }
            int var19 = arg0.method7071();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2219[arg0.method7071()] = true;
            }
        }
    }

    @ObfuscatedName("gq.k(I)V")
    public void method3428() {
        if (this.field2225 == -1) {
            if (this.field2218 == null && this.field2219 == null) {
                this.field2225 = 0;
            } else {
                this.field2225 = 7506 * -1918601831;
            }
        }
        if (this.field2207 != -1) {
            return;
        }
        if (this.field2218 == null && this.field2219 == null) {
            this.field2207 = 0;
        } else {
            this.field2207 = 2;
        }
    }

    @ObfuscatedName("gq.a(Lhv;II)Lhv;")
    public class212 method3431(class212 arg0, int arg1) {
        if (this.method3417()) {
            class123 var7 = method2760(this.field2227);
            if (var7 == null) {
                return arg0.method3942(true);
            } else {
                class212 var8 = arg0.method3942(!var7.method2607());
                var8.method3951(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2213[arg1];
            class208 var4 = method2744(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method3942(true);
            } else {
                class212 var6 = arg0.method3942(!var4.method3906(var5));
                var6.method3950(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gq.m(Lhv;III)Lhv;")
    public class212 method3412(class212 arg0, int arg1, int arg2) {
        if (this.method3417()) {
            class123 var9 = method2760(this.field2227);
            if (var9 == null) {
                return arg0.method3942(true);
            }
            class212 var10 = arg0.method3942(!var9.method2607());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method3960();
            } else if (var11 == 2) {
                var10.method4017();
            } else if (var11 == 3) {
                var10.method3958();
            }
            var10.method3951(var9, arg1);
            if (var11 == 1) {
                var10.method3958();
            } else if (var11 == 2) {
                var10.method4017();
            } else if (var11 == 3) {
                var10.method3960();
            }
            return var10;
        }
        int var4 = this.field2213[arg1];
        class208 var5 = method2744(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method3942(true);
        }
        class212 var7 = arg0.method3942(!var5.method3906(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method3960();
        } else if (var8 == 2) {
            var7.method4017();
        } else if (var8 == 3) {
            var7.method3958();
        }
        var7.method3950(var5, var6);
        if (var8 == 1) {
            var7.method3958();
        } else if (var8 == 2) {
            var7.method4017();
        } else if (var8 == 3) {
            var7.method3960();
        }
        return var7;
    }

    @ObfuscatedName("gq.p(Lhv;II)Lhv;")
    public class212 method3413(class212 arg0, int arg1) {
        if (this.method3417()) {
            class123 var7 = method2760(this.field2227);
            if (var7 == null) {
                return arg0.method3988(true);
            } else {
                class212 var8 = arg0.method3988(!var7.method2607());
                var8.method3951(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2213[arg1];
            class208 var4 = method2744(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method3988(true);
            } else {
                class212 var6 = arg0.method3988(!var4.method3906(var5));
                var6.method3950(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gq.s(Lhv;ILgq;IB)Lhv;")
    public class212 method3430(class212 arg0, int arg1, class191 arg2, int arg3) {
        if (field2222 && !this.method3417() && !arg2.method3417()) {
            return this.method3415(arg0, arg1, arg2, arg3);
        }
        class212 var5 = arg0.method3942(false);
        boolean var6 = false;
        class208 var7 = null;
        if (this.method3417()) {
            class123 var8 = this.method3440();
            if (arg2.method3417() && this.field2219 == null) {
                var5.method3951(var8, arg1);
                return var5;
            }
            var5.method3955(var8, arg1, this.field2219, false);
        } else {
            int var9 = this.field2213[arg1];
            var7 = method2744(var9 >> 16);
            arg1 = var9 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3431(arg0, arg3);
            }
            if (!arg2.method3417() && (this.field2218 == null || arg3 == -1)) {
                var5.method3950(var7, arg1);
                return var5;
            }
            if (this.field2218 == null || arg3 == -1) {
                var5.method3950(var7, arg1);
                return var5;
            }
            var6 = arg2.method3417();
            if (!var6) {
                var5.method3956(var7, arg1, this.field2218, false);
            }
        }
        if (arg2.method3417()) {
            class123 var10 = arg2.method3440();
            var5.method3955(var10, arg3, this.field2219, true);
        } else {
            int var11 = arg2.field2213[arg3];
            class208 var12 = method2744(var11 >> 16);
            int var13 = var11 & 0xFFFF;
            if (var12 == null) {
                return this.method3431(arg0, arg1);
            }
            var5.method3956(var12, var13, this.field2218, true);
        }
        if (var6 && var7 != null) {
            var5.method3956(var7, arg1, this.field2218, false);
        }
        var5.method3949();
        return var5;
    }

    @ObfuscatedName("gq.r(Lhv;ILgq;IB)Lhv;")
    public class212 method3415(class212 arg0, int arg1, class191 arg2, int arg3) {
        int var5 = this.field2213[arg1];
        class208 var6 = method2744(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3431(arg0, arg3);
        }
        int var8 = arg2.field2213[arg3];
        class208 var9 = method2744(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class212 var11 = arg0.method3942(!var6.method3906(var7));
            var11.method3950(var6, var7);
            return var11;
        } else {
            class212 var12 = arg0.method3942(!var6.method3906(var7) & !var9.method3906(var10));
            var12.method3954(var6, var7, var9, var10, this.field2218);
            return var12;
        }
    }

    @ObfuscatedName("gq.v(Lhv;II)Lhv;")
    public class212 method3416(class212 arg0, int arg1) {
        if (this.method3417()) {
            return this.method3431(arg0, arg1);
        }
        int var3 = this.field2213[arg1];
        class208 var4 = method2744(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3942(true);
        }
        class208 var6 = null;
        int var7 = 0;
        if (this.field2214 != null && arg1 < this.field2214.length) {
            int var8 = this.field2214[arg1];
            var6 = method2744(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class212 var10 = arg0.method3942(!var4.method3906(var5));
            var10.method3950(var4, var5);
            return var10;
        } else {
            class212 var9 = arg0.method3942(!var4.method3906(var5) & !var6.method3906(var7));
            var9.method3950(var4, var5);
            var9.method3950(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gq.y(I)Z")
    public boolean method3417() {
        return this.field2227 >= 0;
    }

    @ObfuscatedName("gq.c(B)I")
    public int method3434() {
        return this.field2203 - this.field2208;
    }

    @ObfuscatedName("ew.w(IB)Lgt;")
    public static class208 method2744(int arg0) {
        class208 var1 = (class208) field2223.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class316 var2 = Statics.field2204;
        class316 var3 = Statics.field2205;
        boolean var4 = true;
        int[] var5 = var2.method5252(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method5196(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method5196(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class208 var10;
        if (var4) {
            try {
                var10 = new class208(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2223.method4571(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("gq.b(I)Lds;")
    public class123 method3440() {
        return this.method3417() ? method2760(this.field2227) : null;
    }

    @ObfuscatedName("es.t(II)Lds;")
    public static class123 method2760(int arg0) {
        class123 var1 = (class123) field2212.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class123 var2 = class123.method2045(Statics.field2204, Statics.field2205, arg0, false);
        if (var2 != null) {
            field2212.method4571(var2, (long) arg0);
        }
        return var2;
    }
}
