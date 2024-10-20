package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("gd")
public class class191 extends class407 {

    @ObfuscatedName("gd.c")
    public static boolean field2199 = false;

    @ObfuscatedName("gd.k")
    public static class257 field2196 = new class257(64);

    @ObfuscatedName("gd.w")
    public static class257 field2206 = new class257(100);

    @ObfuscatedName("gd.s")
    public static class257 field2200 = new class257(100);

    @ObfuscatedName("gd.q")
    public int field2217 = -1;

    @ObfuscatedName("gd.m")
    public Map field2202;

    @ObfuscatedName("gd.x")
    public int field2203 = 0;

    @ObfuscatedName("gd.j")
    public int field2210 = 0;

    @ObfuscatedName("gd.v")
    public int[] field2205;

    @ObfuscatedName("gd.h")
    public int[] field2198;

    @ObfuscatedName("gd.t")
    public int[] field2221;

    @ObfuscatedName("gd.u")
    public int[] field2208;

    @ObfuscatedName("gd.d")
    public int field2209 = -1;

    @ObfuscatedName("gd.b")
    public int[] field2201;

    @ObfuscatedName("gd.a")
    public boolean[] field2211;

    @ObfuscatedName("gd.l")
    public boolean field2212 = false;

    @ObfuscatedName("gd.e")
    public int field2213 = 5;

    @ObfuscatedName("gd.g")
    public int field2214 = -1;

    @ObfuscatedName("gd.y")
    public int field2204 = -1;

    @ObfuscatedName("gd.i")
    public int field2216 = 99;

    @ObfuscatedName("gd.r")
    public boolean field2195 = false;

    @ObfuscatedName("gd.z")
    public int field2218 = -1;

    @ObfuscatedName("gd.o")
    public int field2219 = -1;

    @ObfuscatedName("gd.as")
    public int field2220 = 2;

    @ObfuscatedName("k.c(IB)Lgd;")
    public static class191 method22(int arg0) {
        class191 var1 = (class191) field2196.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2215.method5499(12, arg0);
        class191 var3 = new class191();
        if (var2 != null) {
            var3.method3569(new class445(var2));
        }
        var3.method3571();
        field2196.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gd.p(Lqq;I)V")
    public void method3569(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3596(arg0, var2);
        }
    }

    @ObfuscatedName("gd.f(Lqq;IB)V")
    public void method3596(class445 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7198();
            this.field2221 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2221[var4] = arg0.method7198();
            }
            this.field2205 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2205[var5] = arg0.method7198();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2205[var6] += arg0.method7198() << 16;
            }
        } else if (arg1 == 2) {
            this.field2209 = arg0.method7198();
        } else if (arg1 == 3) {
            int var7 = arg0.method7196();
            this.field2201 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2201[var8] = arg0.method7196();
            }
            this.field2201[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2212 = true;
        } else if (arg1 == 5) {
            this.field2213 = arg0.method7196();
        } else if (arg1 == 6) {
            this.field2214 = arg0.method7198();
        } else if (arg1 == 7) {
            this.field2204 = arg0.method7198();
        } else if (arg1 == 8) {
            this.field2216 = arg0.method7196();
            this.field2195 = true;
        } else if (arg1 == 9) {
            this.field2218 = arg0.method7196();
        } else if (arg1 == 10) {
            this.field2219 = arg0.method7196();
        } else if (arg1 == 11) {
            this.field2220 = arg0.method7196();
        } else if (arg1 == 12) {
            int var9 = arg0.method7196();
            this.field2198 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2198[var10] = arg0.method7198();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2198[var11] += arg0.method7198() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method7196();
            this.field2208 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2208[var13] = arg0.method7340();
            }
        } else if (arg1 == 14) {
            this.field2217 = arg0.method7201();
        } else if (arg1 == 15) {
            int var14 = arg0.method7198();
            this.field2202 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method7198();
                int var17 = arg0.method7340();
                this.field2202.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2203 = arg0.method7198();
            this.field2210 = arg0.method7198();
        } else if (arg1 == 17) {
            this.field2211 = new boolean[256];
            for (int var18 = 0; var18 < this.field2211.length; var18++) {
                this.field2211[var18] = false;
            }
            int var19 = arg0.method7196();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2211[arg0.method7196()] = true;
            }
        }
    }

    @ObfuscatedName("gd.n(I)V")
    public void method3571() {
        if (this.field2218 == -1) {
            if (this.field2201 == null && this.field2211 == null) {
                this.field2218 = 0;
            } else {
                this.field2218 = 2;
            }
        }
        if (this.field2219 != -1) {
            return;
        }
        if (this.field2201 == null && this.field2211 == null) {
            this.field2219 = 0;
        } else {
            this.field2219 = 2;
        }
    }

    @ObfuscatedName("gd.k(Lha;IB)Lha;")
    public class212 method3572(class212 arg0, int arg1) {
        if (this.method3578()) {
            class124 var7 = method3543(this.field2217);
            if (var7 == null) {
                return arg0.method4135(true);
            } else {
                class212 var8 = arg0.method4135(!var7.method2798());
                var8.method4223(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2205[arg1];
            class208 var4 = method4265(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4135(true);
            } else {
                class212 var6 = arg0.method4135(!var4.method4093(var5));
                var6.method4165(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gd.w(Lha;IIB)Lha;")
    public class212 method3574(class212 arg0, int arg1, int arg2) {
        if (this.method3578()) {
            class124 var9 = method3543(this.field2217);
            if (var9 == null) {
                return arg0.method4135(true);
            }
            class212 var10 = arg0.method4135(!var9.method2798());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method4150();
            } else if (var11 == 2) {
                var10.method4149();
            } else if (var11 == 3) {
                var10.method4148();
            }
            var10.method4223(var9, arg1);
            if (var11 == 1) {
                var10.method4148();
            } else if (var11 == 2) {
                var10.method4149();
            } else if (var11 == 3) {
                var10.method4150();
            }
            return var10;
        }
        int var4 = this.field2205[arg1];
        class208 var5 = method4265(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4135(true);
        }
        class212 var7 = arg0.method4135(!var5.method4093(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4150();
        } else if (var8 == 2) {
            var7.method4149();
        } else if (var8 == 3) {
            var7.method4148();
        }
        var7.method4165(var5, var6);
        if (var8 == 1) {
            var7.method4148();
        } else if (var8 == 2) {
            var7.method4149();
        } else if (var8 == 3) {
            var7.method4150();
        }
        return var7;
    }

    @ObfuscatedName("gd.s(Lha;II)Lha;")
    public class212 method3584(class212 arg0, int arg1) {
        if (this.method3578()) {
            class124 var7 = method3543(this.field2217);
            if (var7 == null) {
                return arg0.method4133(true);
            } else {
                class212 var8 = arg0.method4133(!var7.method2798());
                var8.method4223(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2205[arg1];
            class208 var4 = method4265(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4133(true);
            } else {
                class212 var6 = arg0.method4133(!var4.method4093(var5));
                var6.method4165(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gd.q(Lha;ILgd;IB)Lha;")
    public class212 method3575(class212 arg0, int arg1, class191 arg2, int arg3) {
        if (field2199 && !this.method3578() && !arg2.method3578()) {
            return this.method3591(arg0, arg1, arg2, arg3);
        }
        class212 var5 = arg0.method4135(false);
        boolean var6 = false;
        class208 var7 = null;
        class204 var8 = null;
        if (this.method3578()) {
            class124 var9 = this.method3570();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3578() && this.field2211 == null) {
                var5.method4223(var9, arg1);
                return var5;
            }
            var8 = var9.field1517;
            var5.method4141(var8, var9, arg1, this.field2211, false, !arg2.method3578());
        } else {
            int var10 = this.field2205[arg1];
            var7 = method4265(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3572(arg0, arg3);
            }
            if (!arg2.method3578() && (this.field2201 == null || arg3 == -1)) {
                var5.method4165(var7, arg1);
                return var5;
            }
            if (this.field2201 == null || arg3 == -1) {
                var5.method4165(var7, arg1);
                return var5;
            }
            var6 = arg2.method3578();
            if (!var6) {
                var5.method4146(var7, arg1, this.field2201, false);
            }
        }
        if (arg2.method3578()) {
            class124 var11 = arg2.method3570();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1517;
            }
            var5.method4141(var8, var11, arg3, this.field2211, true, true);
        } else {
            int var12 = arg2.field2205[arg3];
            class208 var13 = method4265(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3572(arg0, arg1);
            }
            var5.method4146(var13, var14, this.field2201, true);
        }
        if (var6 && var7 != null) {
            var5.method4146(var7, arg1, this.field2201, false);
        }
        var5.method4139();
        return var5;
    }

    @ObfuscatedName("gd.m(Lha;ILgd;II)Lha;")
    public class212 method3591(class212 arg0, int arg1, class191 arg2, int arg3) {
        int var5 = this.field2205[arg1];
        class208 var6 = method4265(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3572(arg0, arg3);
        }
        int var8 = arg2.field2205[arg3];
        class208 var9 = method4265(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class212 var11 = arg0.method4135(!var6.method4093(var7));
            var11.method4165(var6, var7);
            return var11;
        } else {
            class212 var12 = arg0.method4135(!var6.method4093(var7) & !var9.method4093(var10));
            var12.method4144(var6, var7, var9, var10, this.field2201);
            return var12;
        }
    }

    @ObfuscatedName("gd.x(Lha;II)Lha;")
    public class212 method3577(class212 arg0, int arg1) {
        if (this.method3578()) {
            return this.method3572(arg0, arg1);
        }
        int var3 = this.field2205[arg1];
        class208 var4 = method4265(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4135(true);
        }
        class208 var6 = null;
        int var7 = 0;
        if (this.field2198 != null && arg1 < this.field2198.length) {
            int var8 = this.field2198[arg1];
            var6 = method4265(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class212 var10 = arg0.method4135(!var4.method4093(var5));
            var10.method4165(var4, var5);
            return var10;
        } else {
            class212 var9 = arg0.method4135(!var4.method4093(var5) & !var6.method4093(var7));
            var9.method4165(var4, var5);
            var9.method4165(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gd.j(B)Z")
    public boolean method3578() {
        return this.field2217 >= 0;
    }

    @ObfuscatedName("gd.v(B)I")
    public int method3583() {
        return this.field2210 - this.field2203;
    }

    @ObfuscatedName("hn.h(II)Lgt;")
    public static class208 method4265(int arg0) {
        class208 var1 = (class208) field2206.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class317 var2 = Statics.field1773;
        class317 var3 = Statics.field2197;
        boolean var4 = true;
        int[] var5 = var2.method5424(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method5421(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method5421(var8, 0);
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
            field2206.method4781(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("gd.t(I)Ldy;")
    public class124 method3570() {
        return this.method3578() ? method3543(this.field2217) : null;
    }

    @ObfuscatedName("gk.u(IB)Ldy;")
    public static class124 method3543(int arg0) {
        class124 var1 = (class124) field2200.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class124 var2 = class124.method2426(Statics.field1773, Statics.field2197, arg0, false);
        if (var2 != null) {
            field2200.method4781(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("df.d(B)V")
    public static void method2618() {
        field2196.method4782();
        field2206.method4782();
        field2200.method4782();
    }
}
