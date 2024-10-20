package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("gg")
public class class197 extends class425 {

    @ObfuscatedName("gg.a")
    public static boolean field2231 = false;

    @ObfuscatedName("gg.h")
    public static class266 field2211 = new class266(64);

    @ObfuscatedName("gg.j")
    public static class266 field2221 = new class266(100);

    @ObfuscatedName("gg.y")
    public static class266 field2230 = new class266(100);

    @ObfuscatedName("gg.d")
    public int field2214 = -1;

    @ObfuscatedName("gg.n")
    public Map field2215;

    @ObfuscatedName("gg.r")
    public int field2208 = 0;

    @ObfuscatedName("gg.l")
    public int field2217 = 0;

    @ObfuscatedName("gg.s")
    public int[] field2218;

    @ObfuscatedName("gg.p")
    public int[] field2219;

    @ObfuscatedName("gg.b")
    public int[] field2220;

    @ObfuscatedName("gg.o")
    public int[] field2227;

    @ObfuscatedName("gg.u")
    public int field2232 = -1;

    @ObfuscatedName("gg.z")
    public int[] field2223;

    @ObfuscatedName("gg.t")
    public boolean[] field2224;

    @ObfuscatedName("gg.w")
    public boolean field2225 = false;

    @ObfuscatedName("gg.m")
    public int field2226 = 5;

    @ObfuscatedName("gg.q")
    public int field2216 = -1;

    @ObfuscatedName("gg.i")
    public int field2210 = -1;

    @ObfuscatedName("gg.e")
    public int field2229 = 99;

    @ObfuscatedName("gg.g")
    public boolean field2228 = false;

    @ObfuscatedName("gg.k")
    public int field2222 = -1;

    @ObfuscatedName("gg.v")
    public int field2212 = -1;

    @ObfuscatedName("gg.aj")
    public int field2233 = 2;

    @ObfuscatedName("fd.a(II)Lgg;")
    public static class197 method3143(int arg0) {
        class197 var1 = (class197) field2211.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2209.method5859(12, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3557(new class464(var2));
        }
        var3.method3559();
        field2211.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gg.f(Lqr;I)V")
    public void method3557(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3558(arg0, var2);
        }
    }

    @ObfuscatedName("gg.c(Lqr;II)V")
    public void method3558(class464 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7716();
            this.field2220 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2220[var4] = arg0.method7716();
            }
            this.field2218 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2218[var5] = arg0.method7716();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2218[var6] += arg0.method7716() << 16;
            }
        } else if (arg1 == 2) {
            this.field2232 = arg0.method7716();
        } else if (arg1 == 3) {
            int var7 = arg0.method7735();
            this.field2223 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2223[var8] = arg0.method7735();
            }
            this.field2223[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2225 = true;
        } else if (arg1 == 5) {
            this.field2226 = arg0.method7735();
        } else if (arg1 == 6) {
            this.field2216 = arg0.method7716();
        } else if (arg1 == 7) {
            this.field2210 = arg0.method7716();
        } else if (arg1 == 8) {
            this.field2229 = arg0.method7735();
            this.field2228 = true;
        } else if (arg1 == 9) {
            this.field2222 = arg0.method7735();
        } else if (arg1 == 10) {
            this.field2212 = arg0.method7735();
        } else if (arg1 == 11) {
            this.field2233 = arg0.method7735();
        } else if (arg1 == 12) {
            int var9 = arg0.method7735();
            this.field2219 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2219[var10] = arg0.method7716();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2219[var11] += arg0.method7716() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method7735();
            this.field2227 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2227[var13] = arg0.method7906();
            }
        } else if (arg1 == 14) {
            this.field2214 = arg0.method7720();
        } else if (arg1 == 15) {
            int var14 = arg0.method7716();
            this.field2215 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method7716();
                int var17 = arg0.method7906();
                this.field2215.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2208 = arg0.method7716();
            this.field2217 = arg0.method7716();
        } else if (arg1 == 17) {
            this.field2224 = new boolean[256];
            for (int var18 = 0; var18 < this.field2224.length; var18++) {
                this.field2224[var18] = false;
            }
            int var19 = arg0.method7735();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2224[arg0.method7735()] = true;
            }
        }
    }

    @ObfuscatedName("gg.x(I)V")
    public void method3559() {
        if (this.field2222 == -1) {
            if (this.field2223 == null && this.field2224 == null) {
                this.field2222 = 0;
            } else {
                this.field2222 = 2;
            }
        }
        if (this.field2212 != -1) {
            return;
        }
        if (this.field2223 == null && this.field2224 == null) {
            this.field2212 = 0;
        } else {
            this.field2212 = 2;
        }
    }

    @ObfuscatedName("gg.h(Lha;IB)Lha;")
    public class221 method3569(class221 arg0, int arg1) {
        if (this.method3576()) {
            class130 var7 = method3424(this.field2214);
            if (var7 == null) {
                return arg0.method4154(true);
            } else {
                class221 var8 = arg0.method4154(!var7.method2803());
                var8.method4222(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2218[arg1];
            class217 var4 = method2258(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4154(true);
            } else {
                class221 var6 = arg0.method4154(!var4.method4117(var5));
                var6.method4198(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gg.j(Lha;IIB)Lha;")
    public class221 method3560(class221 arg0, int arg1, int arg2) {
        if (this.method3576()) {
            class130 var9 = method3424(this.field2214);
            if (var9 == null) {
                return arg0.method4154(true);
            }
            class221 var10 = arg0.method4154(!var9.method2803());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method4172();
            } else if (var11 == 2) {
                var10.method4171();
            } else if (var11 == 3) {
                var10.method4247();
            }
            var10.method4222(var9, arg1);
            if (var11 == 1) {
                var10.method4247();
            } else if (var11 == 2) {
                var10.method4171();
            } else if (var11 == 3) {
                var10.method4172();
            }
            return var10;
        }
        int var4 = this.field2218[arg1];
        class217 var5 = method2258(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4154(true);
        }
        class221 var7 = arg0.method4154(!var5.method4117(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4172();
        } else if (var8 == 2) {
            var7.method4171();
        } else if (var8 == 3) {
            var7.method4247();
        }
        var7.method4198(var5, var6);
        if (var8 == 1) {
            var7.method4247();
        } else if (var8 == 2) {
            var7.method4171();
        } else if (var8 == 3) {
            var7.method4172();
        }
        return var7;
    }

    @ObfuscatedName("gg.y(Lha;II)Lha;")
    public class221 method3561(class221 arg0, int arg1) {
        if (this.method3576()) {
            class130 var7 = method3424(this.field2214);
            if (var7 == null) {
                return arg0.method4163(true);
            } else {
                class221 var8 = arg0.method4163(!var7.method2803());
                var8.method4222(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2218[arg1];
            class217 var4 = method2258(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4163(true);
            } else {
                class221 var6 = arg0.method4163(!var4.method4117(var5));
                var6.method4198(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gg.d(Lha;ILgg;II)Lha;")
    public class221 method3562(class221 arg0, int arg1, class197 arg2, int arg3) {
        if (field2231 && !this.method3576() && !arg2.method3576()) {
            return this.method3586(arg0, arg1, arg2, arg3);
        }
        class221 var5 = arg0.method4154(false);
        boolean var6 = false;
        class217 var7 = null;
        class213 var8 = null;
        if (this.method3576()) {
            class130 var9 = this.method3567();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3576() && this.field2224 == null) {
                var5.method4222(var9, arg1);
                return var5;
            }
            var8 = var9.field1542;
            var5.method4220(var8, var9, arg1, this.field2224, false, !arg2.method3576());
        } else {
            int var10 = this.field2218[arg1];
            var7 = method2258(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3569(arg0, arg3);
            }
            if (!arg2.method3576() && (this.field2223 == null || arg3 == -1)) {
                var5.method4198(var7, arg1);
                return var5;
            }
            if (this.field2223 == null || arg3 == -1) {
                var5.method4198(var7, arg1);
                return var5;
            }
            var6 = arg2.method3576();
            if (!var6) {
                var5.method4168(var7, arg1, this.field2223, false);
            }
        }
        if (arg2.method3576()) {
            class130 var11 = arg2.method3567();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1542;
            }
            var5.method4220(var8, var11, arg3, this.field2224, true, true);
        } else {
            int var12 = arg2.field2218[arg3];
            class217 var13 = method2258(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3569(arg0, arg1);
            }
            var5.method4168(var13, var14, this.field2223, true);
        }
        if (var6 && var7 != null) {
            var5.method4168(var7, arg1, this.field2223, false);
        }
        var5.method4161();
        return var5;
    }

    @ObfuscatedName("gg.n(Lha;ILgg;II)Lha;")
    public class221 method3586(class221 arg0, int arg1, class197 arg2, int arg3) {
        int var5 = this.field2218[arg1];
        class217 var6 = method2258(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3569(arg0, arg3);
        }
        int var8 = arg2.field2218[arg3];
        class217 var9 = method2258(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class221 var11 = arg0.method4154(!var6.method4117(var7));
            var11.method4198(var6, var7);
            return var11;
        } else {
            class221 var12 = arg0.method4154(!var6.method4117(var7) & !var9.method4117(var10));
            var12.method4252(var6, var7, var9, var10, this.field2223);
            return var12;
        }
    }

    @ObfuscatedName("gg.r(Lha;II)Lha;")
    public class221 method3564(class221 arg0, int arg1) {
        if (this.method3576()) {
            return this.method3569(arg0, arg1);
        }
        int var3 = this.field2218[arg1];
        class217 var4 = method2258(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4154(true);
        }
        class217 var6 = null;
        int var7 = 0;
        if (this.field2219 != null && arg1 < this.field2219.length) {
            int var8 = this.field2219[arg1];
            var6 = method2258(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class221 var10 = arg0.method4154(!var4.method4117(var5));
            var10.method4198(var4, var5);
            return var10;
        } else {
            class221 var9 = arg0.method4154(!var4.method4117(var5) & !var6.method4117(var7));
            var9.method4198(var4, var5);
            var9.method4198(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gg.l(I)Z")
    public boolean method3576() {
        return this.field2214 >= 0;
    }

    @ObfuscatedName("gg.s(I)I")
    public int method3566() {
        return this.field2217 - this.field2208;
    }

    @ObfuscatedName("ch.p(IB)Lhj;")
    public static class217 method2258(int arg0) {
        class217 var1 = (class217) field2221.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class330 var2 = Statics.field193;
        class330 var3 = Statics.field2213;
        boolean var4 = true;
        int[] var5 = var2.method5792(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method5819(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method5819(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class217 var10;
        if (var4) {
            try {
                var10 = new class217(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2221.method4834(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("gg.b(B)Ldh;")
    public class130 method3567() {
        return this.method3576() ? method3424(this.field2214) : null;
    }

    @ObfuscatedName("gm.o(II)Ldh;")
    public static class130 method3424(int arg0) {
        class130 var1 = (class130) field2230.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class130 var2 = class130.method2783(Statics.field193, Statics.field2213, arg0, false);
        if (var2 != null) {
            field2230.method4834(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("de.u(B)V")
    public static void method2607() {
        field2211.method4837();
        field2221.method4837();
        field2230.method4837();
    }
}
