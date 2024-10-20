package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("gc")
public class class190 extends class405 {

    @ObfuscatedName("gc.c")
    public static boolean field2167 = false;

    @ObfuscatedName("gc.j")
    public static class256 field2169 = new class256(64);

    @ObfuscatedName("gc.e")
    public static class256 field2170 = new class256(100);

    @ObfuscatedName("gc.g")
    public static class256 field2171 = new class256(100);

    @ObfuscatedName("gc.w")
    public int field2190 = -1;

    @ObfuscatedName("gc.y")
    public Map field2173;

    @ObfuscatedName("gc.i")
    public int field2174 = 0;

    @ObfuscatedName("gc.s")
    public int field2165 = 0;

    @ObfuscatedName("gc.t")
    public int[] field2176;

    @ObfuscatedName("gc.z")
    public int[] field2168;

    @ObfuscatedName("gc.r")
    public int[] field2180;

    @ObfuscatedName("gc.u")
    public int[] field2179;

    @ObfuscatedName("gc.k")
    public int field2178 = -1;

    @ObfuscatedName("gc.h")
    public int[] field2181;

    @ObfuscatedName("gc.x")
    public boolean[] field2182;

    @ObfuscatedName("gc.l")
    public boolean field2183 = false;

    @ObfuscatedName("gc.a")
    public int field2184 = 5;

    @ObfuscatedName("gc.p")
    public int field2185 = -1;

    @ObfuscatedName("gc.b")
    public int field2186 = -1;

    @ObfuscatedName("gc.n")
    public int field2187 = 99;

    @ObfuscatedName("gc.o")
    public int field2188 = -1;

    @ObfuscatedName("gc.m")
    public int field2189 = -1;

    @ObfuscatedName("gc.d")
    public int field2175 = 2;

    @ObfuscatedName("aq.c(Llh;Llh;Llh;I)V")
    public static void method735(class315 arg0, class315 arg1, class315 arg2) {
        Statics.field2172 = arg0;
        Statics.field2166 = arg1;
        Statics.field2177 = arg2;
    }

    @ObfuscatedName("bg.v(IB)Lgc;")
    public static class190 method983(int arg0) {
        class190 var1 = (class190) field2169.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2172.method5305(12, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3500(new class443(var2));
        }
        var3.method3506();
        field2169.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gc.q(Lqt;I)V")
    public void method3500(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3501(arg0, var2);
        }
    }

    @ObfuscatedName("gc.f(Lqt;II)V")
    public void method3501(class443 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7049();
            this.field2180 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2180[var4] = arg0.method7049();
            }
            this.field2176 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2176[var5] = arg0.method7049();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2176[var6] += arg0.method7049() << 16;
            }
        } else if (arg1 == 2) {
            this.field2178 = arg0.method7049();
        } else if (arg1 == 3) {
            int var7 = arg0.method7047();
            this.field2181 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2181[var8] = arg0.method7047();
            }
            this.field2181[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2183 = true;
        } else if (arg1 == 5) {
            this.field2184 = arg0.method7047();
        } else if (arg1 == 6) {
            this.field2185 = arg0.method7049();
        } else if (arg1 == 7) {
            this.field2186 = arg0.method7049();
        } else if (arg1 == 8) {
            this.field2187 = arg0.method7047();
        } else if (arg1 == 9) {
            this.field2188 = arg0.method7047();
        } else if (arg1 == 10) {
            this.field2189 = arg0.method7047();
        } else if (arg1 == 11) {
            this.field2175 = arg0.method7047();
        } else if (arg1 == 12) {
            int var9 = arg0.method7047();
            this.field2168 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2168[var10] = arg0.method7049();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2168[var11] += arg0.method7049() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method7047();
            this.field2179 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2179[var13] = arg0.method7051();
            }
        } else if (arg1 == 14) {
            this.field2190 = arg0.method7052();
        } else if (arg1 == 15) {
            int var14 = arg0.method7049();
            this.field2173 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method7049();
                int var17 = arg0.method7051();
                this.field2173.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2174 = arg0.method7049();
            this.field2165 = arg0.method7049();
        } else if (arg1 == 17) {
            this.field2182 = new boolean[256];
            for (int var18 = 0; var18 < this.field2182.length; var18++) {
                this.field2182[var18] = false;
            }
            int var19 = arg0.method7047();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2182[arg0.method7047()] = true;
            }
        }
    }

    @ObfuscatedName("gc.j(I)V")
    public void method3506() {
        if (this.field2188 == -1) {
            if (this.field2181 == null && this.field2182 == null) {
                this.field2188 = 0;
            } else {
                this.field2188 = 2;
            }
        }
        if (this.field2189 != -1) {
            return;
        }
        if (this.field2181 == null && this.field2182 == null) {
            this.field2189 = 0;
        } else {
            this.field2189 = 2;
        }
    }

    @ObfuscatedName("gc.e(Lhy;II)Lhy;")
    public class211 method3531(class211 arg0, int arg1) {
        if (this.method3509()) {
            int var7 = this.field2190;
            class123 var8 = (class123) field2171.method4691((long) var7);
            class123 var9;
            if (var8 == null) {
                class123 var10 = class123.method1871(Statics.field2166, Statics.field2177, var7, false);
                if (var10 != null) {
                    field2171.method4693(var10, (long) var7);
                }
                var9 = var10;
            } else {
                var9 = var8;
            }
            if (var9 == null) {
                return arg0.method4074(true);
            } else {
                class211 var12 = arg0.method4074(!var9.method2644());
                var12.method4070(var9, arg1);
                return var12;
            }
        } else {
            int var3 = this.field2176[arg1];
            class207 var4 = method3250(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4074(true);
            } else {
                class211 var6 = arg0.method4074(!var4.method4012(var5));
                var6.method4075(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gc.g(Lhy;III)Lhy;")
    public class211 method3504(class211 arg0, int arg1, int arg2) {
        if (!this.method3509()) {
            int var4 = this.field2176[arg1];
            class207 var5 = method3250(var4 >> 16);
            int var6 = var4 & 0xFFFF;
            if (var5 == null) {
                return arg0.method4074(true);
            }
            class211 var7 = arg0.method4074(!var5.method4012(var6));
            int var8 = arg2 & 0x3;
            if (var8 == 1) {
                var7.method4100();
            } else if (var8 == 2) {
                var7.method4084();
            } else if (var8 == 3) {
                var7.method4068();
            }
            var7.method4075(var5, var6);
            if (var8 == 1) {
                var7.method4068();
            } else if (var8 == 2) {
                var7.method4084();
            } else if (var8 == 3) {
                var7.method4100();
            }
            return var7;
        }
        int var9 = this.field2190;
        class123 var10 = (class123) field2171.method4691((long) var9);
        class123 var11;
        if (var10 == null) {
            class123 var12 = class123.method1871(Statics.field2166, Statics.field2177, var9, false);
            if (var12 != null) {
                field2171.method4693(var12, (long) var9);
            }
            var11 = var12;
        } else {
            var11 = var10;
        }
        if (var11 == null) {
            return arg0.method4074(true);
        }
        class211 var14 = arg0.method4074(!var11.method2644());
        int var15 = arg2 & 0x3;
        if (var15 == 1) {
            var14.method4100();
        } else if (var15 == 2) {
            var14.method4084();
        } else if (var15 == 3) {
            var14.method4068();
        }
        var14.method4070(var11, arg1);
        if (var15 == 1) {
            var14.method4068();
        } else if (var15 == 2) {
            var14.method4084();
        } else if (var15 == 3) {
            var14.method4100();
        }
        return var14;
    }

    @ObfuscatedName("gc.w(Lhy;II)Lhy;")
    public class211 method3505(class211 arg0, int arg1) {
        if (this.method3509()) {
            int var7 = this.field2190;
            class123 var8 = (class123) field2171.method4691((long) var7);
            class123 var9;
            if (var8 == null) {
                class123 var10 = class123.method1871(Statics.field2166, Statics.field2177, var7, false);
                if (var10 != null) {
                    field2171.method4693(var10, (long) var7);
                }
                var9 = var10;
            } else {
                var9 = var8;
            }
            if (var9 == null) {
                return arg0.method4053(true);
            } else {
                class211 var12 = arg0.method4053(!var9.method2644());
                var12.method4070(var9, arg1);
                return var12;
            }
        } else {
            int var3 = this.field2176[arg1];
            class207 var4 = method3250(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4053(true);
            } else {
                class211 var6 = arg0.method4053(!var4.method4012(var5));
                var6.method4075(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("gc.y(Lhy;ILgc;II)Lhy;")
    public class211 method3540(class211 arg0, int arg1, class190 arg2, int arg3) {
        if (field2167 && !this.method3509() && !arg2.method3509()) {
            return this.method3503(arg0, arg1, arg2, arg3);
        }
        class211 var5 = arg0.method4074(false);
        boolean var6 = false;
        class207 var7 = null;
        if (this.method3509()) {
            class123 var8 = this.method3511();
            if (arg2.method3509() && this.field2182 == null) {
                var5.method4070(var8, arg1);
                return var5;
            }
            var5.method4065(var8, arg1, this.field2182, false);
        } else {
            int var9 = this.field2176[arg1];
            var7 = method3250(var9 >> 16);
            arg1 = var9 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3531(arg0, arg3);
            }
            if (!arg2.method3509() && (this.field2181 == null || arg3 == -1)) {
                var5.method4075(var7, arg1);
                return var5;
            }
            if (this.field2181 == null || arg3 == -1) {
                var5.method4075(var7, arg1);
                return var5;
            }
            var6 = arg2.method3509();
            if (!var6) {
                var5.method4064(var7, arg1, this.field2181, false);
            }
        }
        if (arg2.method3509()) {
            class123 var10 = arg2.method3511();
            var5.method4065(var10, arg3, this.field2182, true);
        } else {
            int var11 = arg2.field2176[arg3];
            class207 var12 = method3250(var11 >> 16);
            int var13 = var11 & 0xFFFF;
            if (var12 == null) {
                return this.method3531(arg0, arg1);
            }
            var5.method4064(var12, var13, this.field2181, true);
        }
        if (var6 && var7 != null) {
            var5.method4064(var7, arg1, this.field2181, false);
        }
        var5.method4132();
        return var5;
    }

    @ObfuscatedName("gc.i(Lhy;ILgc;IB)Lhy;")
    public class211 method3503(class211 arg0, int arg1, class190 arg2, int arg3) {
        int var5 = this.field2176[arg1];
        class207 var6 = method3250(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3531(arg0, arg3);
        }
        int var8 = arg2.field2176[arg3];
        class207 var9 = method3250(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class211 var11 = arg0.method4074(!var6.method4012(var7));
            var11.method4075(var6, var7);
            return var11;
        } else {
            class211 var12 = arg0.method4074(!var6.method4012(var7) & !var9.method4012(var10));
            var12.method4082(var6, var7, var9, var10, this.field2181);
            return var12;
        }
    }

    @ObfuscatedName("gc.s(Lhy;II)Lhy;")
    public class211 method3508(class211 arg0, int arg1) {
        if (this.method3509()) {
            return this.method3531(arg0, arg1);
        }
        int var3 = this.field2176[arg1];
        class207 var4 = method3250(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4074(true);
        }
        class207 var6 = null;
        int var7 = 0;
        if (this.field2168 != null && arg1 < this.field2168.length) {
            int var8 = this.field2168[arg1];
            var6 = method3250(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class211 var10 = arg0.method4074(!var4.method4012(var5));
            var10.method4075(var4, var5);
            return var10;
        } else {
            class211 var9 = arg0.method4074(!var4.method4012(var5) & !var6.method4012(var7));
            var9.method4075(var4, var5);
            var9.method4075(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("gc.t(I)Z")
    public boolean method3509() {
        return this.field2190 >= 0;
    }

    @ObfuscatedName("gc.z(I)I")
    public int method3510() {
        return this.field2165 - this.field2174;
    }

    @ObfuscatedName("gf.r(II)Lgh;")
    public static class207 method3250(int arg0) {
        class207 var1 = (class207) field2170.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class207 var2 = class207.method4978(Statics.field2166, Statics.field2177, arg0, false);
        if (var2 != null) {
            field2170.method4693(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("gc.u(I)Lda;")
    public class123 method3511() {
        if (!this.method3509()) {
            return null;
        }
        int var1 = this.field2190;
        class123 var2 = (class123) field2171.method4691((long) var1);
        class123 var3;
        if (var2 == null) {
            class123 var4 = class123.method1871(Statics.field2166, Statics.field2177, var1, false);
            if (var4 != null) {
                field2171.method4693(var4, (long) var1);
            }
            var3 = var4;
        } else {
            var3 = var2;
        }
        return var3;
    }
}
